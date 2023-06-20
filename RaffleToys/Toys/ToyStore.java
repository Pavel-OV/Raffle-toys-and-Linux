package RaffleToys.Toys;

import java.util.ArrayList;
import java.util.List;

public class ToyStore {
    private List<Toys> toys = new ArrayList<>();
    

   

    public ToyStore addToys(Toys toy){
        toys.add(toy);
        return this;
    }

    public boolean getWeight() {
        return false;
    }

    public boolean getQuantity() {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder lst =new StringBuilder();
        for (Toys item : toys ){
            lst.append(item);
            lst.append("\n");
        }
        return lst.toString();

    }
    
}
