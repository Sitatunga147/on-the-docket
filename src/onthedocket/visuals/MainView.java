package onthedocket.visuals;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class MainView extends JFrame {
	private JTabbedPane contentPane;

	public MainView() {
		setTitle("OnTheDocket");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JTabbedPane();
		setContentPane(contentPane);
		
		initializeCalendar();
		initializeAnalytics();
		
		setVisible(true);
	}
	
	private void initializeCalendar() {
		Calendar calendar = new Calendar(48, 8);
		contentPane.addTab("Calendar", calendar);
	}
	
	private void initializeAnalytics() {
		JPanel placeholder = new JPanel();
		contentPane.addTab("Analytics", placeholder);
	}
}

