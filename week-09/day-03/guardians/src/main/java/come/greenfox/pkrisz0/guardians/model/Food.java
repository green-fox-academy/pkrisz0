package come.greenfox.pkrisz0.guardians.model;

public class Food {

    String foodName;
    int foodAmount;
    int foodCalorie;

    public Food(String foodName, int foodAmount, int foodCalorie) {
        this.foodName = foodName;
        this.foodAmount = foodAmount;
        this.foodCalorie = foodCalorie;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int getFoodCalorie() {
        return foodCalorie;
    }

    public void setFoodCalorie(int foodCalorie) {
        this.foodCalorie = foodCalorie;
    }
}
