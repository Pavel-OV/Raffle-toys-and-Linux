package RaffleToys.Toys;

public class Toys {
    private String id ="";
    private String toysName;
    private String quantity;
    private String weight;

    public Toys( String toysName, String quantity, String weight){
        this.toysName = toysName;
        this.quantity = quantity;
        this.weight = weight;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setToysName(String toysName) {
        this.toysName = toysName;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public String getToysName() {
        return toysName;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getWeight() {
        return weight;
    }
    @Override
    @Override
    public String toString() {       
        return String.format("Идентафикатор: %s\n Название игрушки: %s,\n Колличество: %s,\n Вес игрушки: %s", id,toysName,quantity,weight);
    }
}
