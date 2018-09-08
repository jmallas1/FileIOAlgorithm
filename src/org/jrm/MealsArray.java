package org.jrm;

import java.util.ArrayList;
import java.util.List;

/**
 * Class model for a meal array
 * @author mostly Matt Green, somewhat Jared Mallas
 * @version 1.0
 */
public class MealsArray {

    private ArrayList<Meals> meals = new ArrayList<>(100);
    private int i = 0;
    private int calories;

    /**
     * Method to add various meals to the meal list
     * @param arg1 string representation of the enum org.jrm.MealType
     * @param arg2 string representation of meal description
     * @param arg3 string representation of meal calories (will be converted to Integer)
     */
    public void addElementWithStrings(String arg1, String arg2, String arg3) {
        MealType mealType;
            switch (arg1) {
                case "Breakfast":
                    mealType = MealType.BREAKFAST;
                    break;
                case "Lunch":
                    mealType = MealType.LUNCH;
                    break;
                case "Dinner":
                    mealType = MealType.DINNER;
                    break;
                case "Dessert":
                    mealType = MealType.DESSERT;
                    break;
                default:
                    mealType = MealType.DINNER;
                    System.out.println("Invalid Meal Type " + arg1 + ", defaulted to Dinner.");
            }

            if (arg3.matches("-?\\d+(\\.\\d+)?")) {
                calories = Integer.parseInt(arg3);
            } else {
                calories = 100;
                System.out.println("Invalid Calories " + arg3 + ", defaulted to 100.");
            }

            meals.add(new Meals(mealType, arg2, calories));
    }

    /**
     *
     * @return List object containing org.jrm.Meals objects
     */
    public List getMeals() {
        return meals;
    }

    /**
     * Dumps contents of meal list to sysout
     */
    public void printAllMeals() {
        for (Meals item: meals) {
            if (item != null) {
                System.out.println(item);
            }

        }
    }

    /**
     * Dumps all meals of mealType to sysout
     * @param mealType enum representation of a MealType
     */
    public void printMealsByType(MealType mealType) {
        for (Meals item: meals) {
            if (item != null && item.getMealType() == mealType) {
                System.out.println(item);
            }

        }
    }

    /**
     * Dumps all meals matching 's' to sysout
     * @param s string representation of search parameter
     */
    public void printByNameSearch(String s) {
        for (Meals item: meals) {
            if (item != null && item.getItem().indexOf(s) >= 0) {
                System.out.println(item);
            }

        }
    }
}
