package org.jrm.test;

import org.jrm.Meals;
import org.jrm.MealsArray;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MealsArrayTest {

    MealsArray ma;

    @BeforeEach
    void setUp()
    {
        ma = new MealsArray();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addElementWithStrings()
    {
        ArrayList<Meals> meals = new ArrayList<>();
        meals.add(new Meals(org.jrm.MealType.BREAKFAST, "Bagel with cream cheese", 389));

        //Breakfast,Bagel with cream cheese,389
        ma.addElementWithStrings("Breakfast","Bagel with cream cheese","389");

        assertEquals(meals, ma.getMeals(), "Meal in should be meal out...");
    }

    @Test
    void getMeals() {
    }

    @Test
    void printAllMeals() {
    }

    @Test
    void printMealsByType() {
    }

    @Test
    void printByNameSearch() {
    }
}