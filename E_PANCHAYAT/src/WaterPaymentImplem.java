import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WaterPaymentImplem extends JFrame implements ActionListener{
	
	Container co;
	JPanel jp1,jp,Mas;
	JLabel title,name,bname,cno,cvv,num,s;
	JTextField Name,Cno,Cvv,Num;
	JComboBox<String> Bname;
	JButton pay,res,back;
	
	WaterPaymentImplem() throws IOException
	{
		setTitle("WATER PAYMENT");
		
		co = getContentPane();
		co.setLayout(null);
		Font f1 = new Font(Font.SANS_SERIF,Font.BOLD,15);
		
		jp = new JPanel();
		Mas = new JPanel();
		jp1 = new JPanel();
		
		s = new JLabel("** ALL FIELDS ARE REQUIRED **");
		s.setOpaque(true);
		s.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
		s.setForeground(Color.red);
		s.setBackground(Color.white);

		
		title = new JLabel("PAY WATER BILLS");
		title.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
		title.setForeground(new Color(0,0,102));
		title.setBackground(Color.white);
		title.setOpaque(true);
		
		name = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font> NAME ON CARD</HTML>");
		bname = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font> BANK NAME</HTML>");
		cno = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font> CARD NUMBER</HTML>");
		cvv = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font> CVV</HTML>");
		num = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font> MOBILE NUMBER</HTML>");
		
		name.setFont(f1);
		bname.setFont(f1);
		cno.setFont(f1);
		cvv.setFont(f1);
		num.setFont(f1);
		
		Name = new JTextField();
		Cno = new JTextField();
		Cvv = new JTextField();
		Num = new JTextField();
		
		pay = new JButton("PAY");
		pay.setBackground(new Color(0,0,102));
		pay.setForeground(Color.white);
		pay.setOpaque(true);
		pay.setFont(new Font("SANS-SERIF",Font.BOLD,15));
		
		res = new JButton("RESET");
		res.setBackground(new Color(0,0,102));
		res.setForeground(Color.white);
		res.setOpaque(true);
		res.setFont(new Font("SANS-SERIF",Font.BOLD,15));
		
		back = new JButton("BACK");
		back.setBackground(new Color(0,0,102));
		back.setForeground(Color.white);
		back.setOpaque(true);
		back.setFont(new Font("SANS-SERIF",Font.BOLD,15));
		
		name.setForeground(new Color(0,0,102));
		bname.setForeground(new Color(0,0,102));
		cno.setForeground(new Color(0,0,102));
		cvv.setForeground(new Color(0,0,102));
		num.setForeground(new Color(0,0,102));
		
		Bname = new JComboBox<String>();
		Bname.setBackground(Color.white);
		Bname.addItem("-- SELECT YOUR BANK --");
		Bname.addItem(" STATE BANK OF INDIA");
		Bname.addItem(" CANARA BANK");
		Bname.addItem(" HDFC");
		Bname.addItem(" ICICI BANK");
		Bname.addItem(" AXIS BANK OF INDIA");
		Bname.addItem(" PUNJAB NATIONAL BANK");
		
		JPanel bIcon1 = new JPanel();
	    BufferedImage wat = ImageIO.read(new File("C:\\Users\\MADHUSRI\\Desktop\\Images\\pay.jpg"));
	    BufferedImage resized1 = resize(wat, 500, 500);
	    JLabel label1 = new JLabel(new ImageIcon(resized1));
	    bIcon1.add(label1);
	    bIcon1.setBounds(800,20,600,500);
	    bIcon1.setBackground(Color.white);
	    jp.add(bIcon1); 
		
		title.setBounds(50,30,300,20);
		s.setBounds(210,20,300,50);
		name.setBounds(100,110,200,30);
		Name.setBounds(300,110,300,30);
		bname.setBounds(100,160,200,30);
		Bname.setBounds(300,160,300,30);
		cno.setBounds(100,210,200,30);
		Cno.setBounds(300,210,300,30);
		cvv.setBounds(100,260,200,30);
		Cvv.setBounds(300,260,300,30);
		num.setBounds(100,310,200,30);
		Num.setBounds(300,310,300,30);
		pay.setBounds(160,370,100,40);
		res.setBounds(280,370,100,40);
		back.setBounds(400,370,100,40);
		
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MASTER.pay.setVisible(false);
				MASTER.Wmain.setVisible(true);
				
			}
		});
		
		res.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Name.setText("");
				Bname.setSelectedIndex(0);
				Cno.setText("");
				Cvv.setText("");
				Num.setText("");
			}
		});
		
		pay.addActionListener(this);
		
		jp.add(title);
		jp1.add(s);
		jp1.add(name);
		jp1.add(bname);
		jp1.add(cno);
		jp1.add(cvv);
		jp1.add(num);
		jp1.add(Name);
		jp1.add(Bname);
		jp1.add(Cno);
		jp1.add(Cvv);
		jp1.add(Num);
		jp1.add(pay);
		jp1.add(res);
		jp1.add(back);
		
		jp.add(jp1);
		jp1.setBounds(80,100,700,450);
		jp1.setLayout(null);
		jp1.setBackground(Color.WHITE);
		
		jp1.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
		
		jp.setBounds(20,10,1450,600);
		jp.setBackground(Color.white);
		Mas.setBackground(Color.white);
		jp.setVisible(true);
		Mas.setLayout(null);
		jp.setLayout(null);
		Mas.setBounds(13,200,1500,1500);
		Mas.add(jp);
		co.add(Mas);
		
		
		
//		setVisible(true);
//		setSize(2000,2000);
//		

	}


	private static BufferedImage resize(BufferedImage img, int height, int width) {
        Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resized;
    }
	
	public static void main(String[] args) throws IOException {
		new WaterPaymentImplem();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			if(e.getSource() == pay) {
				
				String result = "";
				
				long a = Long.parseLong(Num.getText().toString());
				
				try {
					Connection conn = getConn.getConnection();
					
					String query = "SELECT STATUS FROM PAYSTATUS WHERE MOBILE_NUMBER = ?";
					
					PreparedStatement pstmt = conn.prepareStatement(query);
			     	
					pstmt.setLong(1, a);
					
					ResultSet rst = pstmt.executeQuery();
					
					while(rst.next()) {
						result = rst.getString("STATUS");
					}
					
					
				}
				catch(Exception ew) {
					
				}
				
				if(result.isEmpty()) {
					JOptionPane.showMessageDialog(co, "NO CONNECTION REGISTERED USING GIVEN MOBILE_NUMBER");
				}
				
				else if(result.equals("PAID")) {
					JOptionPane.showMessageDialog(co, "ALREADY PAID");
				}
				
				else if(result.equals("NOT PAID")) {
					
					try {
						Connection conn = getConn.getConnection();
			    		
			    		String query1 = "UPDATE PAYSTATUS SET STATUS = ? WHERE MOBILE_NUMBER=?";
			    		
			    		PreparedStatement pstmt1 = conn.prepareStatement(query1);
			    		
			    		pstmt1.setString(1, "PAID");
						pstmt1.setLong(2, a);
						
						pstmt1.executeUpdate();
						conn.setAutoCommit(true);
					}
					
					catch(Exception eee) {
						System.out.println("PAY "+eee);
					}
					
					
					JDialog d = new JDialog(this, "PAYMENT");
		            JLabel l = new JLabel("Payment Successfull");
		            l.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
		            l.setForeground(new Color(0,0,102));
		            l.setBounds(120,20,500,30);
		            d.add(l);
		            
		            JPanel bIcon1 = new JPanel();
		    	    BufferedImage wat;
					try {
						wat = ImageIO.read(new File("C:\\Users\\MADHUSRI\\Desktop\\Images\\sucs.jpg"));
						BufferedImage resized1 = resize(wat, 500, 500);
						JLabel label1 = new JLabel(new ImageIcon(resized1));
						bIcon1.add(label1);
						bIcon1.setBounds(0,0,500,500);
						bIcon1.setBackground(Color.white);
						d.add(bIcon1);
					} 
					catch (IOException e1) {
						e1.printStackTrace();
					} 
					d.setLocation(600,100);
		            d.setSize(500, 500);
		            d.setLayout(null);
		            d.setVisible(true);
				}
			}
	}
}
