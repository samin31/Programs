package inheritence;
	interface Camera {
	    void takePhoto();
	}

	// Interface 2
	interface MusicPlayer {
	    void playMusic();
	}

	// Class implementing both interfaces
	class SmartPhone implements Camera, MusicPlayer {
	    @Override
	    public void takePhoto() {
	        System.out.println("Clicking a high-resolution photo...");
	    }

	    @Override
	    public void playMusic() {
	        System.out.println("Playing streaming audio music...");
	    }
	}

	public class MultipleInheritanceDemo {
	    public static void main(String[] args) {
	        SmartPhone phone = new SmartPhone();
	        phone.takePhoto();
	        phone.playMusic();
	    }
	
}
