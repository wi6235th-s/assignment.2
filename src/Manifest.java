public class Manifest {
    
    private Passenger[] passengerManifest = new Passenger[12];

    public void insertPassenger(String name, Integer age) {
        Passenger passenger = new Passenger(name, age);
     


        for (int i = 0; i < passengerManifest.length; i++) {
            if (passengerManifest[i] == null) {
                passengerManifest[i] = passenger;
                break;
            }
        }

        
    }

    public void removePassenger(int seatNumber) {
        passengerManifest[seatNumber -1] = null;

    }

    public void switchSeats(int seat1, int seat2) {
        
        Passenger tempPassenger = passengerManifest[seat1 -1];
        passengerManifest[seat1 -1] = passengerManifest[seat2 -1];
        passengerManifest[seat2 -1] = tempPassenger;
    }

    public void renamePassenger(int seatNumber, String newName) {
        passengerManifest[seatNumber -1].setName(newName);
    }

    public int countPassengers() {
        return passengerManifest.length;
    }

    public void printPassengerManifest() {
        System.out.println("##### PASSENGER MANIFEST ######" + "\n" + 
        "SkyBox Ltd." + "\n" + 
        "Seat" + "\t\t" + "Name" + "\t\t" + "Age");

        for (int i = 0; i < passengerManifest.length; i++) {
            if (passengerManifest[i] != null) {
                System.out.println("Seat " + (i+1) + ": \t" + passengerManifest[i].getName() + "\t\t" + passengerManifest[i].getAge());
            }
        }
        System.out.println("####################################");
    }
 
}