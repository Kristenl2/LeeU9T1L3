public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    public void printCar(){
        System.out.println("License plate: " + getLicensePlate());
        System.out.println("Toll fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Electric: " + electric);
        System.out.println("Discount applied? " + discountApplied);
    }

    public boolean isElectric(){
        return electric;
    }

    public boolean isDiscountApplied(){
        return discountApplied;
    }

    public void setDiscountApplied(boolean discount){
        discountApplied = discount;
    }

    public boolean dropOffPassengers(int numOut) {
        if (getPassengers() > numOut) {
            setPassengers(getPassengers() - numOut);
            return true;
        } else {
            return false;
        }
    }
        public void applyDiscount(){
            if(!(discountApplied)&&electric){
                setTollFee(getTollFee()*0.5);
                discountApplied = true;
            }
        }
    }

