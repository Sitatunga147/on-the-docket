package onthedocket.visuals;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class MainView extends JFrame {
	private Container contentPane;

	public MainView() {
		setTitle("OnTheDocket");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		initializeCalendar();
		
		setVisible(true);
	}
	
	private void initializeCalendar() {
		Calendar calendar = new Calendar(25, 8);
		contentPane.add(calendar, BorderLayout.CENTER);
	}
}

