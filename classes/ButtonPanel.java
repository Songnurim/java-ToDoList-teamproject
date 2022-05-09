package classes;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class ButtonPanel extends JPanel{
	private JButton addTask;
	private JButton clear;
	
	Border emptyBorder = BorderFactory.createEmptyBorder();
	public ButtonPanel(){
		this.setPreferredSize(new Dimension(400, 80));
		this.setBackground(Color.RED);
		
		addTask = new JButton("Add Task");
		addTask.setBorder(emptyBorder);
		addTask.setFont(new Font("Sans-serif", Font.BOLD, 20));
		
		this.add(addTask);
		this.add(Box.createHorizontalStrut(20));
		
		clear = new JButton("Clear");
		clear.setBorder(emptyBorder);
		clear.setFont(new Font("Sans-serif", Font.BOLD, 20));
		this.add(clear);
	}
	
	public JButton getNewTask() {
		return addTask;
	} 
	public JButton getClear() {
		return clear;
	}
	
	
}
