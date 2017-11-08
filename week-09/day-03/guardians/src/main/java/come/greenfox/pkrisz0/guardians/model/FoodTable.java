package come.greenfox.pkrisz0.guardians.model;

import java.util.ArrayList;

public class FoodTable extends ArrayList<Food> {

    public FoodTable() {
        this.add(new Food("Bautista Burrito",5,65000, this.size()+1));
        this.add(new Food("This guy was in Blade Runner!",1,3900,this.size() + 1));
        this.add(new Food("Avocados",10,8000, this.size() + 1));
    }

    public boolean containsById(int id){
        boolean result = false;
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).id == id) {
                result = true;
            }
        }
        return result;
    }
}
