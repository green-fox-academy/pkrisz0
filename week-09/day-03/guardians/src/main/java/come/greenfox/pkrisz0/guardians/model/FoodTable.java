package come.greenfox.pkrisz0.guardians.model;

import java.util.ArrayList;
import java.util.Collection;

public class FoodTable extends ArrayList<Food> {

    public FoodTable() {
        this.add(new Food("Bautista Burrito",5,65000));
        this.add(new Food("This guy was in Blade Runner!",1,3900));
        this.add(new Food("Avocados",10,8000));
    }

    public Integer findFoodPosition(String name){
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).foodName.equals(name)) {
                return i;
            }

        }
        return null;
    }

    public boolean containsByName(String name){
        boolean result = false;
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).foodName.equals(name)) {
                result = true;
            }
        }
        return result;
    }
}
