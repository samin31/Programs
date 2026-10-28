package inheritence;
	class Device {
	    void powerOn() {
	        System.out.println("Device powered ON.");
	    }
	}

	// Interfaces
	interface GPS {
	    void getCoordinates();
	}

	interface Wireless {
	    void connectWifi();
	}

	// Subclass extending Device and implementing multiple interfaces
	class SmartWatch extends Device implements GPS, Wireless {
	    @Override
	    public void getCoordinates() {
	        System.out.println("Fetching current GPS location...");
	    }

	    @Override
	    public void connectWifi() {
	        System.out.println("Connected to local Wi-Fi network.");
	    }

	    void displayTime() {
	        System.out.println("Displaying time: 10:00 AM");
	    }
	}

	public class HybridInheritanceDemo {
	    public static void main(String[] args) {
	        SmartWatch myWatch = new SmartWatch();

	        myWatch.powerOn();        // From class Device
	        myWatch.connectWifi();    // From interface Wireless
	        myWatch.getCoordinates(); // From interface GPS
	        myWatch.displayTime();    // Native to SmartWatch
	    }
	
}
