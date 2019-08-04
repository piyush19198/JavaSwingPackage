package javax.swing;

import java.awt.BorderLayout;

public class Login_Swing extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	JLabel lblLoginName, lblPassword;
	JTextField txtLoginName, txtPassword;
	JButton btnOk, btnCancel;
	
	JPanel panelMain, panelLogin, panelButton;
	
	public Login_Swing(){
		super();
		
		lblLoginName = new JLabel("Login Name");
		lblPassword = new JLabel("Password");
		
		txtLoginName = new JTextField(10);
		txtPassword = new JTextField(10);
		
		btnOk = new JButton("OK");
		btnCancel = new JButton("Cancel");
		
		panelMain = new JPanel();
		panelLogin = new JPanel();
		panelButton = new JPanel();
		
		panelLogin.add(lblLoginName);
		panelLogin.add(txtLoginName);
		panelLogin.add(lblPassword);
		panelLogin.add(txtPassword);
		
		panelButton.add(btnOk);
		panelButton.add(btnCancel);
		
		panelMain.setLayout(new BorderLayout());
		panelMain.add(panelLogin, BorderLayout.CENTER);
		panelMain.add(panelButton, BorderLayout.SOUTH);	
		
		add(panelMain);
	}
	
	public void main(){
		JFrame frame = new JFrame("AWT Login");
		frame.setVisible(true);
		frame.add(new Login_Swing());
		frame.pack();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(ABORT);
	}
}
