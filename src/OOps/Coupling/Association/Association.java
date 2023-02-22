package OOps.Coupling.Association;

public class Association {
    static class Bus {
        private String name;

        // bus name
        Bus(String name) {
            this.name = name;
        }

        public String getBusName() {
            return this.name;
        }
    }

    //passenger class
    static class Passenger {
        // passenger name
        private String name;
        // passenger seat id number
        private int seatId;

        Passenger(String name, int seatId) {
            this.name = name;
            this.seatId = seatId;
        }

        public String getPassengerName() {
            return this.name;
        }

        public int getPassengerId() {
            return this.seatId;
        }
    }

    //Association between both the
//classes in the main method
    public static void main(String[] args) {
        Bus bus = new Bus("Shree Travels");
        Passenger psg = new Passenger("Sneha", 52);
        System.out.println(psg.getPassengerName() + " with seat number " + psg.getPassengerId()
                + " is a passenger of " + bus.getBusName());
    }
}

