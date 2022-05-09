package classes;


import java.awt.*;
import javax.swing.*;

public class List extends JPanel{
	List(){
		GridLayout layout = new GridLayout(10, 1);  //gridlayout(행, 열)
		layout.setVgap(5);  //간격
		this.setLayout(layout);
		this.setBackground(Color.BLUE);
	}
	public void updateNumber() {
		Component[] listItems = this.getComponents();
		
		for(int i= 0;i < listItems.length;i++) {
			if(listItems[i] instanceof Task) {
				((Task)listItems[i]).changeIndex(i+1);
			}
		}
	}
	public void removeCompletedTasks() {
		for(Component i : getComponents()) {
			if(i instanceof Task) {
				if(((Task)i).getState()) {
					remove(i);
					updateNumber();
				}
			}
		}	
	}
	
}
