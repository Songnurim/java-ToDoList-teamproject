package classes;

import java.awt.*;
import javax.swing.*;

public class TitleBar extends JPanel{

	public TitleBar(){
		this.setPreferredSize(new Dimension(400, 80));
		
		JLabel titleText = new JLabel("To Do List");
		titleText.setPreferredSize(new Dimension(200, 80));
		Font font = new Font("SansSerif", Font.BOLD, 20);
		titleText.setFont(font);
		titleText.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(titleText);
	}
}
