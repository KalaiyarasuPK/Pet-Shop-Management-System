package PetShopManagementSystem.model;

public class Cart {
    private int petId;
    private int custId;
    private int cartId;
    private String petName;
    private int price;
    private int petCount;

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPetCount() {
        return petCount;
    }

    public void setPetCount(int petCount) {
        this.petCount = petCount;
    }

    public Cart(int petId, int custId, int cartId){
        this.cartId=cartId;
        this.petId=petId;
        this.custId=custId;
    }

    public Cart(int cartId,String petName,int price,int count){
        this.cartId=cartId;
        this.petName=petName;
        this.price=price;
        this.petCount=count;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }


}
