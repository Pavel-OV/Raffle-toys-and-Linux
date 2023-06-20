package RaffleToys.Toys;

public class Toys {
    private Integer id ;
    private String toysName;
    private Integer  quantity;
    private Integer  weight;

    public Toys( String toysName, Integer quantity, Integer  weight){
        this.toysName = toysName;
        this.quantity = quantity;
        this.weight = weight;
    }
    public Toys( Integer id, String toysName, Integer  quantity, Integer  weight){
        this(toysName,quantity,weight);
        this.id =id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setToysName(String toysName) {
        this.toysName = toysName;
    }

    public void setQuantity(Integer  quantity) {
        this.quantity = quantity;
    }

    public void setWeight(Integer  weight) {
        this.weight = weight;
    }

    public Integer getId() {
        return id;
    }

    public String getToysName() {
        return toysName;
    }

    public Integer  getQuantity() {
        return quantity;
    }

    public Integer getWeight() {
        return weight ;
    }
    
    @Override
    public String toString() {       
        return String.format("Идентафикатор: %d\n Название игрушки: %s\t Колличество: %d\t Вес игрушки: %d", id,toysName,quantity,weight);
    }
    // @Override
    // public String toString() {       
    //     return String.format(" Название игрушки: %s,\n Колличество: %s,\n Вес игрушки: %s", getToysName(),getQuantity(),getWeight());
    // }
    
    
}
