package RaffleToys.Toys;

import java.util.ArrayList;
import java.util.List;

public class ToyStore {
    private List<Toys> toy = new ArrayList<>();
    
     public ToyStore addToys(Toys toys  ){
        toy.add(toys);
        return this;
     }
    

   

   
    // public boolean getWeight() {
    //     return false;
    // }

    // public boolean getQuantity() {
    //     return false;
    // }
    public Toys searchToys(String stoysName) {
       
       for (Toys item : toy) {
           if (item.getToysName().equals(stoysName)) {
               return item;
           }
       }
       return null;

   }
   public void editToysWeight(int id, int weight){
    for(Toys toys : toy){
        if (toys.getId()==id){
            toys.setWeight(weight);
        return;
        }
        System.out.println("id"+id+"no");
    }


  

   }

    


    @Override
    public String toString() {
        StringBuilder lst =new StringBuilder();
        for (Toys item : toy ){
            lst.append(item);
            lst.append("\n");
        }
        return lst.toString();

    }
    
}
