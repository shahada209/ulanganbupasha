public class car extends Vehicle {
    int numDoor;
    boolean iselectric;

    //Constructor Parameter

    public int getNumDoor() {
        return this.numDoor;
    }

    public void setNumDoor(int numDoor) {
        this.numDoor = numDoor;
    }

    public boolean isIselectric() {
        return this.iselectric;
    }

    public void setIselectric(boolean iselectric) {
        this.iselectric = iselectric;
    }

    public car() {
        super();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("number door: "+this.numDoor);
        System.out.println("electric: "+this.iselectric);

        hargaakhir = price-price*discount/100;
        System.out.println("harga akhir: "+hargaakhir);
    }
    
}