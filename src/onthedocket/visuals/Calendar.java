package onthedocket.visuals;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Calendar extends JPanel {
	private static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	
	public Calendar(int rows, int cols) {
		
		setLayout(new GridLayout(rows, cols));
		setBackground(Color.WHITE);
		
		JPanel emptyCell = new JPanel(new BorderLayout());
		add(emptyCell);
		emptyCell.setBackground(Color.WHITE);
		
		for(String d : DAYS) {
			JLabel label = new JLabel(d, SwingConstants.CENTER);
			label.setFont(label.getFont().deriveFont(Font.BOLD));
			label.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			add(label);
		}
		
		for(int r=1; r<rows; r++) {
			for(int c=0; c<cols; c++) {
				JPanel cell = new JPanel(new BorderLayout());
				
				if(c != 0) {
					cell.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
				}
				
				cell.setBackground(Color.WHITE);
				add(cell);
			}
		}
	}
}
