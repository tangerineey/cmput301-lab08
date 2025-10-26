package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    public CustomList mockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest() {
        list = mockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }

    @Test
    public void hasCityTest() {
        list = mockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertEquals(true, list.hasCity(city));
    } 

    @Test
    public void deleteCity() {
        list = mockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        int listSize = list.getCount();
        list.deleteCity(city);
        assertEquals(list.getCount(), listSize - 1);
    }

    @Test
    public void countCitiesTest() {
        list = mockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(listSize + 1, list.countCities());
    }

}
