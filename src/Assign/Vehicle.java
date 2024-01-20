package Assign;

class Vehicle {
    // Method to drive
    public void drive() {
        System.out.println("Driving a vehicle");
    }
}

// Car class, a subclass of Vehicle
class Car extends Vehicle {
   
    public void drive() 
    {
        System.out.println("Repairing a car");
    }


// Main class for testing
 
    public static void main(String[] args) {
        // Creating an instance of Car
        Car myCar = new Car();

        // Calling the drive() method on the Car instance
        myCar.drive();
    }
}


