import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class DASHBOARD2  {

	private JFrame frmDashboard;
	/**
	 * @wbp.nonvisual location=137,5
	 */
	private final JLayeredPane layeredPane = new JLayeredPane();
	public DASHBOARD2() {
		initialize();
		frmDashboard.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDashboard = new JFrame();
		frmDashboard.setFont(new Font("Bitstream Vera Sans Mono", Font.BOLD | Font.ITALIC, 17));
		frmDashboard.setTitle("DASHBOARD");
		frmDashboard.getContentPane().setBackground(Color.YELLOW);
		frmDashboard.setBounds(200, 200, 845, 524);
		frmDashboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDashboard.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("New Student");
		btnNewButton_1.setBounds(12, 85, 200, 36);
		btnNewButton_1.addActionListener(object->{
			Newstudent ns = new Newstudent();
			frmDashboard.setVisible(false);
		});
		frmDashboard.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Update & Delete student");
		btnNewButton_2.setBounds(12, 144, 200, 28);
		btnNewButton_2.addActionListener(object->{
			updateStudent us = new updateStudent();
			us.frmUpdateAndDelete.setVisible(true);
			frmDashboard.setVisible(false);
		});
		frmDashboard.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Student Fees");	
		btnNewButton_3.setBounds(12, 196, 200, 28);
		btnNewButton_3.addActionListener(object->{
            STUDENTRENT sl = new STUDENTRENT();
            frmDashboard.setVisible(false);
		});
		frmDashboard.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("All Student Living");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HOSTELSETTING all = new HOSTELSETTING();
				all.frmAllStudentLiving.setVisible(true);
			}
		});
//		btnNewButton_4.setBounds(12, 252, 200, 28);
//		frmDashboard.getContentPane().add(btnNewButton_4);
//		
//		JButton btnNewButton_5 = new JButton("New Employee");
//		btnNewButton_5.setBounds(12, 353, 200, 28);
//		btnNewButton_5.addActionListener(ob->{
//			NewEmployee ne = new NewEmployee();
//			ne.Show();
//			frmDashboard.setVisible(false);
//		});
//		frmDashboard.getContentPane().add(btnNewButton_5);
//		
//		JButton btnNewButton_6 = new JButton("Update & Delete Employee");
//		btnNewButton_6.setBounds(12, 402, 200, 28);
//		btnNewButton_6.addActionListener(ob->{
//			UpdateDelectEmployee ue = new UpdateDelectEmployee();
//			ue.Show();
//			frmDashboard.setVisible(false);
//			
//		});
//		frmDashboard.getContentPane().add(btnNewButton_6);
//		
//		JButton btnNewButton_7 = new JButton("Employee payment");
//		btnNewButton_7.setBounds(12, 457, 200, 28);
//		btnNewButton_7.addActionListener(oj->{
//			EmployeePayment ep = new EmployeePayment();
//			ep.Show();
//		});
//		frmDashboard.getContentPane().add(btnNewButton_7);
		
		JButton btnLogout = new JButton("logout");
		btnLogout.setBounds(528, 12, 80, 20);
		frmDashboard.getContentPane().add(btnLogout);
		
		JButton btnNewButton_8 = new JButton("shutdown");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=JOptionPane.showConfirmDialog(null, "do you what to Shutdown application", "select", JOptionPane.YES_NO_OPTION);
				if(a==0)
				{
					Runtime runtime = Runtime.getRuntime();
					try {
						Process proc = runtime.exec("shutdown -s-t 0");
					}
					catch (Exception e) {
						JOptionPane.showConfirmDialog(null, e);
					}
						
					}
					
				}
			
		});
		btnNewButton_8.setBounds(628, 12, 105, 20);
		frmDashboard.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Exit");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_9.setBounds(302, -47, 117, 28);
		frmDashboard.getContentPane().add(btnNewButton_9);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setIcon(null);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=JOptionPane.showConfirmDialog(null, "do what to Exit application", "select", JOptionPane.YES_NO_OPTION);
				if(a==0)
				{
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(373, 12, 153, 28);
		frmDashboard.getContentPane().add(btnExit);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/home/ramsey/eclipse-workspace/HOSTLE MANAGEMENT SYSTEM/HOSTEL MANAGEMENT SYSTEM/hostle img.jpg"));
		lblNewLabel.setBounds(224, 30, 495, 385);
		frmDashboard.getContentPane().add(lblNewLabel);
		
		JButton btnManageRoom = new JButton("Manage Room");
		btnManageRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ManageRoom mr = new ManageRoom();
				mr.show();
			}
		});
		btnManageRoom.setBounds(12, 10, 194, 63);
		frmDashboard.getContentPane().add(btnManageRoom);
		
		JButton btnNewButton = new JButton("Leaved Student");
		btnNewButton.setBounds(12, 302, 200, 28);
		btnNewButton.addActionListener(ob->{
			STUDENTDETAILS ls = new STUDENTDETAILS();
			ls.Show();
			
		});
		
		frmDashboard.getContentPane().add(btnNewButton);
	}
	public void show() {
		frmDashboard.setVisible(true);
	}
}
