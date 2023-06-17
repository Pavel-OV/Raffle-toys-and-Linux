package RaffleToys.Toys;

public class Toys {
    private String id ="";
    private String toysName;
    private Integer quantity;
    private Integer weight;

    public Toys( String toysName, Integer quantity, Integer weight){
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

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public String getToysName() {
        return toysName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getWeight() {
        return weight;
    }
    @Override
    @Override
    public String toString() {       
        return String.format("Идентафикатор: %s\n Название игрушки: %s,\n Колличество: %s,\n Вес игрушки: %s", id,toysName,quantity,weight);
    }
}
