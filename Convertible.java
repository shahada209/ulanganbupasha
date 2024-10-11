public class Convertible extends car {
        String roofType;
    
        //Constructor Parameter
    
        public String getRoofType() {
            return this.roofType;
        }
    
        public void setRoofType(String roofType) {
            this.roofType = roofType;
        }
    
        public Convertible(){
            super();
            roofType = "";
    
            }
    
        @Override
        public void print(){
            super.print();
            System.out.println("Roof type of the car: "+roofType);
        }
    }
    

