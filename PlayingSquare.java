import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;


public class PlayingSquare extends JComponent {
	
	public void paintComponent(Graphics g){
		int sq_width = 80, sq_height = 80;
		int file_offset = 0,rank_offset=0;
		int file = 0,rank=7;
		Color squareColor;
		
		/* Chess Notation on a standard 8*8 chess board deems the bottom right hand corner square as 
		 * being WHITE and hence extending the rule through alternate colors,
		 * the top left hand corner also will be a WHITE square .
		 * Using a simple 8*8 Array for Board layout, the top left hand corner WHITE square is 
		 * at the following position board_layout[7][0]
		 *  i.e 8th rank on the chess board is the 7th row in the Array, 
		 *  and the square on the first file is at 0th position  
		 * */
		int board_Layout[][] = {
				{0,1,0,1,0,1,0,1},
				{1,0,1,0,1,0,1,0},
				{0,1,0,1,0,1,0,1},
				{1,0,1,0,1,0,1,0},
				{0,1,0,1,0,1,0,1},
				{1,0,1,0,1,0,1,0},
				{0,1,0,1,0,1,0,1},
				{1,0,1,0,1,0,1,0}				
				};

		Graphics2D g2 = (Graphics2D) g;

		for(;rank>=0;rank--){
			
			for(;file<8;file++){		
				if (board_Layout[rank][file] == 1){
					
					squareColor = Color.WHITE;	
				} else {
					squareColor = Color.BLACK;
				}
					System.out.println("rank : "+rank+"file: "+file);
					System.out.println("file_offset : "+file_offset+"rank_offset: "+rank_offset);
					System.out.println("squareColor : "+squareColor);
					g2.setColor(squareColor);
					g2.fillRect(file_offset,rank_offset,sq_width,sq_height);
					//g2.setColor(Color.RED);
					//g2.drawRect(file_offset,rank_offset,sq_width,sq_height);
					file_offset += 80;
				}
				rank_offset += 80;
				file_offset = 0;
				file = 0;		
			} 			
		}
}
