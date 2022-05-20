import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Welcome_Page extends JFrame implements ActionListener{
	private JButton signUp;
	private JButton login;
	private JButton exit;
	
	public BankMenu() {
					
		setTitle("Welcome");
		setSize(300, 150);
		
		JPanel panel = new JPanel();
		add(panel);
		
		panel.add(new JLabel("To-Do List"));
		id = new JTextField(50);
		panel.add(id);
		
		panel.add(new JLabel("ID"));
		id = new JTextField(20);
		panel.add(id);
		
		panel.add(new JLabel("PASS"));
		pass = new JPasswordField(20);
		panel.add(pass);
		
		setVisible(true);
		

		login = new JButton("login");
		signUp = new JButton("sign Up");
		exit = new JButton("exit");
		

		panel.add(login);
		panel.add(signUp);
		panel.add(exit);
		
		
		login.addActionListener(this);
		signUp.addActionListener(this);
		exit.addActionListener(this);
		
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == login) {
			new Login();
			setVisible(false);
		}
		else if(e.getSource() == signUp) {
			new SignUp();
			setVisible(false);
		}
		else if(e.getSource() == exit) {
			System.exit(0);
		}
	}
	
}