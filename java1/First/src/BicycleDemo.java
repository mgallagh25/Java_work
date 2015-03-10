
class BicycleDemo {
    public static void main(String[] args) {
    	
    	
    	long creditCardNumber = 1234_5678_9012_3456l;

    	System.out.println(creditCardNumber);
        // Create two different 
        // Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();
        MountainBike bike1mb = new MountainBike();
        
        // Invoke methods on 
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
        
        bike1mb.changeCadence(30);
        bike1mb.changeCadencemb(40);
        bike1mb.printStatesmb();
        
        
        System.out.println("cadenceff:" + bike1mb.cadencemb);
        
        
    }
}

class Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue) {
         cadence = newValue;
    }

    void changeGear(int newValue) {
         gear = newValue;
    }

    void speedUp(int increment) {
         speed = speed + increment;   
    }

    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}

class MountainBike extends Bicycle {

    // new fields and methods defining 
    // a mountain bike would go here
	
	 int cadencemb = cadence;
	   
	    void changeCadencemb(int newValue) {
	         cadencemb += newValue;
	    }
	    
	    void printStatesmb() {
	         System.out.println("cadencemb=" +
	             cadencemb);
	    }


}


