package classes;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class AppFrame extends JFrame{
	
	private ButtonPanel btn;
	private List list;
	private TitleBar title;
	
	private JButton addTask;
	private JButton clear;
	
	//생성자
	public AppFrame(){
		this.setSize(400, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("hello");
		
		title = new TitleBar();
		list = new List();
		btn = new ButtonPanel();
		
		this.add(title, BorderLayout.NORTH);
		this.add(btn, BorderLayout.SOUTH);
		this.add(list,BorderLayout.CENTER);
		
		addTask = btn.getNewTask();
		clear = btn.getClear();
		
		addListeners();

	}
	
	public void addListeners() {
		addTask.addMouseListener(new MouseAdapter(){
			@override
			public void mousePressed(MouseEvent e) {
				Task task = new Task();
				list.add(task);
				list.updateNumber();
				
				task.getDone().addMouseListener(new MouseAdapter() {
					@override 
					public void mousePressed(MouseEvent e) {
						task.changeState();
						revalidate();
					}
				});
				revalidate();  //새로고침
			}
		});
		clear.addMouseListener(new MouseAdapter(){
			@override
			public void mousePressed(MouseEvent e) {
				list.removeCompletedTasks();
				repaint();
			}
		});
	}
	
}
