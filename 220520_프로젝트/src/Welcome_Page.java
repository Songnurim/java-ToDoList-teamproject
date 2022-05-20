import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Welcome_Page extends JFrame implements ActionListener{
	private JButton signUp;
	private JButton login;
	private JButton exit;
	
	public Welcome_Page() {
		
		setTitle("Welcome Page");
		setSize(500, 800);
		
		JPanel panel = new JPanel();
		add(panel);
		
		signUp = new JButton("sign up");
		login = new JButton("login");
		exit = new JButton("Exit");
		
		panel.add(signUp);
		panel.add(login);
		panel.add(exit);
		
		signUp.addActionListener(this);
		login.addActionListener(this);
		exit.addActionListener(this);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == login) {
			new ToDoLists_Page();
			setVisible(false);
		}
		else if(e.getSource() == signUp) {
			new SignUp_Page();
			setVisible(false);
		}
		else if(e.getSource() == exit) {
			System.exit(0);
		}
	}
	
}
