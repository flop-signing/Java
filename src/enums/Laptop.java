package enums;

public enum Laptop {
    XPS(2300),
    Surface(2200),
    Rog(2500),
    Mackbok;

    public int price;
     Laptop (int price) {
        this.price = price;
    }

    Laptop (){
         price = 2000;
    }

    // if i wanna skip a value then i have to use default constructor.and it's the example of mackbok case.

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
