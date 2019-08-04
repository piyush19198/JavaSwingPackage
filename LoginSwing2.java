package javax.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;	

//STEP 1
public class Login_Swing_2 extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	//FIELDS
	JLabel lblLoginName, lblPassword;
	JTextField txtLoginName, txtPassword;
	JButton btnOk, btnCancel;
	
	JPanel panelMain, panelLogin, panelButton;
	
	public Login_Swing_2(){
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
		
		//STEP 4
		btnOk.addActionListener((ActionListener) this);
		btnCancel.addActionListener((ActionListener) this);

	}
	
	public static void main(String[] args){
		JFrame frame = new JFrame("AWT Login");
		frame.setVisible(true);
		frame.add(new Login_Swing());
		frame.pack();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	//STEP 2
	public void actionPerformed(ActionEvent evt){
		//STEP 3
		Object source = evt.getSource();
		if(source == btnOk) {
			System.out.println("Ok Button is clicked.");
			
			String loginName = txtLoginName.getText();
			String password = txtPassword.getText();
			
			if(loginName.equals(password)) {
				System.out.println("Login is successful.");
			}
			else {
				System.out.println("Login is failed.");
			}	
		}
		else {
			txtLoginName.setText(" ");
			txtPassword.setText(" ");
			System.out.println("Cancel Button is clicked.");
		}
	}
}

//EVENT IMPLEMENTATION STEPS
//STEP 1 : IMPLEMENTS ACTION LISTNER
//STEP 2 : OVERRIDE ACTION PERFORMED
//STEP 3 : IMPLEMENT ACTION FOR THE EVENT IN EVENT HANDLER
//STEP 4 : IMPLEMENT ACTION LISTNER IN GUI COMPONENT
