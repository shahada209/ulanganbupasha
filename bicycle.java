public class bicycle extends Vehicle {
    String biketype;
    double discount;

    //Constructor Parameter

    public String getBiketype() {
        return this.biketype;
    }

    public void setBiketype(String biketype) {
        this.biketype = biketype;
    }

    public double getDiscount() {
        return this.discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public bicycle() {
        super();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Bike type: "+this.biketype);

        hargaakhir = price-price*discount/100;
        System.out.println("Harga akhir: "+hargaakhir);
    }
}
