public class Vehicle {
    int numwheels;
    double price;
    public double discount;
    double hargaakhir;

    //Constructor Parameter
    
    public int getNumwheels() {
        return this.numwheels;
    }

    public void setNumwheels(int numwheels) {
        this.numwheels = numwheels;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return this.discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getHargaakhir() {
        return this.hargaakhir;
    }

    public void setHargaakhir(double hargaakhir) {
        this.hargaakhir = hargaakhir;
    }

    public Vehicle(){
        price = 0;
    }

    public void print() {
        System.out.println("number wheels: "+this.numwheels);
        System.out.println("harganya berapa: "+this.price);
    }

}