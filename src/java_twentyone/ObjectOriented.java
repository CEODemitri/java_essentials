package java_twentyone;

public class ObjectOriented {

    // You may have noticed that the Bicycle class does not contain a main method. That's because it's not a complete application; it's just the blueprint for bicycles that might be used in an application.
    class Bicycle {

//      state
        int cadence = 0;
        int speed = 0;
        int gear = 1;

//      behavior: data encapsulation
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
            speed = speed + increment;
        }

        void printStates() {
            System.out.println("cadence: " + cadence + " speed: " + speed + " gear: " + gear);
        }
    }
}


