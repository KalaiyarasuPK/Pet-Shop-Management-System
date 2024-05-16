package PetShopManagementSystem.model;

public class Pet {
        private int id;
        private int petCount;
        private String category;
        private String Breed;
        private int price;
        private String search;

    public Pet(){

    }
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public Pet(int id, String category, String Breed, int price, int petCount){
        this.id=id;
        this.category=category;
        this.Breed=Breed;
        this.price=price;
        this.petCount=petCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPetCount() {
        return petCount;
    }

    public void setPetCount(int petCount) {
        this.petCount = petCount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String petname) {
        this.Breed = petname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
