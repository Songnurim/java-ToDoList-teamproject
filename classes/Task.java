package classes;

import java.awt.*;
import javax.swing.*;

public class Task extends JPanel{
	
	private JLabel index;
	private JTextField taskName;
	private JButton done;
	
	private boolean checked;
	
	public Task() {
		this.setPreferredSize(new Dimension(40,20));  //Dimension: ´ÜÀÏ °´Ã¼ ³»ÀÇ ÄÄÆ÷³ÍÆ® Æø°ú ³ôÀÌ¸¦ Ä¸½¶È­
		this.setBackground(Color.RED);
		this.setLayout(new BorderLayout());
		
		checked = false;
		
		index = new JLabel("");
		index.setPreferredSize(new Dimension(20,20));
		index.setHorizontalAlignment(JLabel.CENTER);
		this.add(index, BorderLayout.WEST);
		
		taskName = new JTextField("input new task");
		taskName.setBorder(BorderFactory.createEmptyBorder());
		taskName.setBackground(Color.RED);
		
		this.add(taskName, BorderLayout.CENTER);
		
		done = new JButton("Done");
		done.setPreferredSize(new Dimension(40, 20));
		done.setBorder(BorderFactory.createEmptyBorder());
		done.setFocusPainted(false);
		
		this.add(done, BorderLayout.EAST);
	}
	public JButton getDone() {
		return done;
	}
	public boolean getState() {
		return checked;
	}
	public void changeIndex(int num) {
		this.index.setText(num + "");
		this.revalidate();
	}
	public void changeState() {
		this.setBackground(Color.GREEN);
		taskName.setBackground(Color.GREEN);
		checked = true;
	}
}
