
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JComponent;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame();
		PlayingSquare playingSquare = new PlayingSquare();
		window.setSize(640,663);
		window.setLocation(1000, 50);
		window.setTitle("DogFish App");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(playingSquare);
		window.setVisible(true);
		window.setBackground(Color.BLUE);
		
		
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}