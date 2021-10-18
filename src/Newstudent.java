import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Action;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Newstudent {

	private JFrame frame2;
	private JTextField mobile;
	private JTextField student;
	private JTextField parentname;
	private JTextField email;
	private JTextField idnumber;
	private JTextField room;
	private JTextField admno;
	private JTextField year;
	String []status = {"Living","Leaved"};
	String currentstatus;
	String item ;
    int id;
    int id1;
	JComboBox<?> comboBox;
	/**
	 * Create the application.
	 */
	public Newstudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame2 = new JFrame();
		frame2.getContentPane().setFont(new Font("Lato Black", Font.PLAIN, 16));
		frame2.getContentPane().setBackground(Color.BLUE);
		frame2.getContentPane().setForeground(Color.BLUE);
		frame2.setFont(new Font("eufm10", Font.BOLD | Font.ITALIC, 22));
		frame2.setTitle("NEW STUDENT");
		frame2.setBounds(200, 200, 571, 590);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Mobile No.");
		btnNewButton.setFont(new Font("eufm10", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(12, 17, 138, 27);
		frame2.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("StudentName");
		btnNewButton_1.setFont(new Font("Liberation Sans Narrow", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_1.setBounds(12, 63, 138, 27);
		frame2.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ParentName");
		btnNewButton_2.setFont(new Font("Liberation Sans Narrow", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBounds(12, 118, 138, 27);
		frame2.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Email Address");
		btnNewButton_3.setFont(new Font("cmmi10", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_3.setBounds(12, 168, 138, 27);
		frame2.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Student Id");
		btnNewButton_4.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_4.setBounds(12, 219, 138, 27);
		frame2.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Room No.");
		btnNewButton_5.setFont(new Font("Liberation Sans Narrow", Font.BOLD, 17));
		btnNewButton_5.setBounds(12, 267, 138, 23);
		frame2.getContentPane().add(btnNewButton_5);
		
		mobile = new JTextField();
		mobile.setBackground(Color.MAGENTA);
		mobile.setBounds(205, 21, 220, 26);
		frame2.getContentPane().add(mobile);
		mobile.setColumns(10);
		
		student = new JTextField();
		student.setColumns(10);
		student.setBounds(205, 67, 220, 26);
		frame2.getContentPane().add(student);
		
		parentname = new JTextField();
		parentname.setColumns(10);
		parentname.setBounds(205, 122, 220, 26);
		frame2.getContentPane().add(parentname);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(205, 172, 220, 26);
		frame2.getContentPane().add(email);
		
		idnumber = new JTextField();
		idnumber.setColumns(10);
		idnumber.setBounds(205, 223, 220, 26);
		frame2.getContentPane().add(idnumber);
		
		JButton btnNewButton_6 = new JButton("Save");
		btnNewButton_6.setBackground(Color.PINK);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Insert();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton_6.setFont(new Font("DejaVu Serif Condensed", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_6.setBounds(192, 487, 117, 35);
	
		frame2.getContentPane().add(btnNewButton_6);
		
		JButton btnDelect = new JButton("Delete");
		btnDelect.setBackground(Color.RED);
		btnDelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mobile.setText(null);
				student.setText(null);
				parentname.setText(null);
	            email.setText(null);
	            idnumber.setText(null);
	            room.setText(null);
	            year.setText(null);
	            admno.setText(null);
	            
			}
		});
		btnDelect.setFont(new Font("eufm10", Font.BOLD | Font.ITALIC, 20));
		btnDelect.setBounds(344, 489, 117, 35);
		frame2.getContentPane().add(btnDelect);
		
		JButton btnExit = new JButton("LogOut");
		btnExit.setForeground(Color.CYAN);
		btnExit.setBackground(Color.RED);
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnExit.setBackground(Color.blue);
				btnExit.setForeground(new Color(255,255,255));
			}
		});
		btnExit.setFont(new Font("C059", Font.BOLD | Font.ITALIC, 20));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=JOptionPane.showConfirmDialog(null, "do what to Exit application", "select", JOptionPane.YES_NO_OPTION);
				if(a==0)
				{
					frame2.setVisible(false);
				}
				DASHBOARD DC =new DASHBOARD();
				DC.show();
			}
		});
		btnExit.setBounds(437, 0, 122, 48);
		frame2.getContentPane().add(btnExit);
		
		room = new JTextField();
		room.setBounds(205, 269, 220, 26);
		frame2.getContentPane().add(room);
		room.setColumns(10);
		
		JButton btnNewButton_5_1 = new JButton("ADM No");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_5_1.setFont(new Font("Liberation Sans Narrow", Font.BOLD | Font.ITALIC, 22));
		btnNewButton_5_1.setBounds(12, 315, 138, 32);
		frame2.getContentPane().add(btnNewButton_5_1);
		
		admno = new JTextField();
		admno.setColumns(10);
		admno.setBounds(205, 323, 220, 26);
		frame2.getContentPane().add(admno);
		
		JButton btnNewButton_5_1_1 = new JButton("Year");
		btnNewButton_5_1_1.setFont(new Font("eufm10", Font.BOLD | Font.ITALIC, 22));
		btnNewButton_5_1_1.setBounds(12, 368, 138, 32);
		frame2.getContentPane().add(btnNewButton_5_1_1);
		
//		Date date = (Date)getDate().
		
		year = new JTextField();
		year.setColumns(10);
		year.setBounds(205, 368, 220, 26);
		frame2.getContentPane().add(year);
		
		JButton btnstatus = new JButton("LivingStatus");
		btnstatus.setFont(new Font("DejaVu Serif Condensed", Font.BOLD | Font.ITALIC, 16));
		btnstatus.setBounds(12, 422, 138, 35);
		frame2.getContentPane().add(btnstatus);
		
		comboBox = new JComboBox(status);
		comboBox.setBackground(Color.MAGENTA);
		comboBox.setBounds(215, 415, 233, 32);
		comboBox.addItemListener((args)->{
		id = comboBox.getSelectedIndex();
	     switch(id) {
	     case 0:
	    	 currentstatus = "Living";
	    	 break;
	     case 1:
	    	 currentstatus = "leaved";
	    	 break;
	    	 
	     }
		});
		frame2.getContentPane().add(comboBox);
		frame2.setVisible(true);
	}
	private void Insert() throws SQLException, ClassNotFoundException {
		id1 = comboBox.getSelectedIndex();
		Connection conn;
		PreparedStatement ps;
		try {
			conn = Connector.getConnection();
		String sql = "insert into Students (mobile,studentname,parent,email,idno,roomno,year,status) values(?,?,?,?,?,?,?,?)";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, Integer.parseInt(mobile.getText()));
		ps.setString(2, student.getText());
		ps.setString(3, parentname.getText());
		ps.setString(4, email.getText());
		ps.setInt(5, Integer.parseInt(idnumber.getText()));
		ps.setInt(6, Integer.parseInt(room.getText()));
		ps.setString(7, year.getText());
		ps.setString(8, comboBox.getItemAt(id)+"");
		int i =ps.executeUpdate();
		if(i>0) {
			JOptionPane.showMessageDialog(null, "succefull inserted!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, " error!!!...unsuccefull inserted try again");
		}
		
	}catch(SQLException e) {
		System.out.println(" insert student error"+ e);
	}
}
}