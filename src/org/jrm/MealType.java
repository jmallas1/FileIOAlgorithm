package org.jrm;

/**
 * Enumeration of meal types
 * @author Matt Green
 * @version 1.0
 */
public enum MealType {
    BREAKFAST("Breakfast"), DESSERT("Dessert"), DINNER("Dinner"), LUNCH("Lunch");

    private String meal;

    MealType(String meal) {
        this.meal = meal;
    }

    public String getMeal() {
        return meal;
    }
}
