package org.jrm;

/**
 * Class model for Meals
 * @author Matt Green
 * @version 1.0
 */
public class Meals {
    private MealType mealType;
    private String item;
    private int calories;

    /**
     * Constructor for Meals
     * @param mealType enum representation of the meal type
     * @param item string representation of name of meal
     * @param calories int representation of meal calories
     */
    public Meals(MealType mealType, String item, int calories) {
        this.mealType = mealType;
        this.item = item;
        this.calories = calories;
    }

    /**
     * Returns meal type
     * @return enum of meal type
     */
    public MealType getMealType() {
        return mealType;
    }

    /**
     * Returns meal name
     * @return of meal name
     */
    public String getItem() {
        return item;
    }

    /**
     * Rerurns calories
     * @return calories for this meal
     */
    public int getCalories() {
        return calories;
    }

    /**
     * Override of .equals
     * @param o An object
     * @return boolean if object is equal to 'this'
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Meals meals = (Meals) o;

        if (getCalories() != meals.getCalories()) return false;
        if (getMealType() != meals.getMealType()) return false;
        return getItem().equals(meals.getItem());
    }

    /**
     * Override of hashcode
     * @return returns hashed int ov this object
     */
    @Override
    public int hashCode() {
        int result = getMealType().hashCode();
        result = 31 * result + getItem().hashCode();
        result = 31 * result + getCalories();
        return result;
    }

    /**
     * Override of string
     * @return String of instance variables concatenated together with other junk. Don't use this.
     */
    @Override
    public String toString() {
        return "Meals{" +
                "mealType=" + mealType +
                ", item='" + item + '\'' +
                ", calories=" + calories +
                '}';
    }

}
