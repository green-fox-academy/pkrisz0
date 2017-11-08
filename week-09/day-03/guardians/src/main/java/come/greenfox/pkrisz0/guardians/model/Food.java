package come.greenfox.pkrisz0.guardians.model;

public class Food {

    String foodName;
    int foodAmount;
    int foodCalorie;
    int id;

    public Food(String foodName, int foodAmount, int foodCalorie, int id) {
        this.foodName = foodName;
        this.foodAmount = foodAmount;
        this.foodCalorie = foodCalorie;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
