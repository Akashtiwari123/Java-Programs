
import javax.swing.SwingUtilities;
/*       
 +@author  : Akash Tiwari
 +*/
public class App {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
			new MainScreen();
			}
		});
		
	}

}
