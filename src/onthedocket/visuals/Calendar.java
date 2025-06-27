package onthedocket.visuals;

import onthedocket.utils.*;

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
			JPanel headerCell = new JPanel(new BorderLayout());
			JLabel label = new JLabel(d, SwingConstants.CENTER);
			label.setFont(new Font(Font.SERIF, Font.BOLD, 18));
			label.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			headerCell.setBackground(Color.BLACK);
			label.setForeground(Color.WHITE);
			headerCell.add(label);
			add(headerCell);
		}
		
		
		int hourComponent = 0;
		for(int r=1; r<rows; r++) {
			for(int c=0; c<cols; c++) {
				JPanel cell = new JPanel(new BorderLayout());
				
				if(c != 0) {
					cell.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
				} else {
					MilitaryTime militaryTime;
					if(rows>24) {
						if(r%2 == 0) { militaryTime = new MilitaryTime(hourComponent, 0); }
						else {
							militaryTime = new MilitaryTime(hourComponent, 30);
							hourComponent++;
						}
					} else {
						militaryTime = new MilitaryTime(r, 0);
					}
					JLabel timeLabel = new JLabel(militaryTime.getStandardTime().toString(), SwingConstants.CENTER);
					timeLabel.setFont(new Font(Font.DIALOG, Font.PLAIN, 15));
					cell.add(timeLabel);
				}
				
				cell.setBackground(Color.WHITE);
				add(cell);
			}
		}
	}
}
