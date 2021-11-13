import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TrackWaterConnection extends JFrame implements MouseListener,ActionListener{
	
	Container co;
	JPanel jp,Mas;
	JLabel topic1,topic2,hname,mob,s;
	JTextField Hname,Mob;
	JButton track,back;
	
	public TrackWaterConnection() throws IOException
	{
		
		setTitle("TRACK NEW WATER CONNECTION REQUEST STATUS");
		
		co = getContentPane();
		co.setLayout(null);
		jp = new JPanel();
		Mas = new JPanel();
		Font f1 = new Font(Font.SANS_SERIF,Font.BOLD,13);
		
		topic1 = new JLabel("WATER CHARGES - TRACK WATER CONNECTION REQUEST STATUS");
		topic2 = new JLabel("REQUEST NEW CONNECTION");
		
		s = new JLabel("** ALL FIELDS ARE REQUIRED **");
		s.setOpaque(true);
		s.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
		s.setForeground(Color.red);
		s.setBackground(Color.white);
		
		topic1.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
		topic1.setForeground(new Color(0,0,102));
		topic1.setBackground(Color.white);
		topic1.setOpaque(true);
		
		topic2.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
		topic2.setForeground(new Color(0,0,102));
		topic2.setBackground(Color.white);
		topic2.setOpaque(true);
		
		hname = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font> HEAD OF FAMILY MEMBER</HTML>");
		mob = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font>  MOBILE NUMBER</HTML>");
		hname.setForeground(new Color(0,0,102));
		mob.setForeground(new Color(0,0,102));
		
		hname.setFont(f1);
		mob.setFont(f1); 
		
		Hname = new JTextField();
		Mob = new JTextField();
		
		track = new JButton("TRACK");
		track.setBackground(new Color(0,0,102));
		track.setForeground(Color.white);
		track.setFont(new Font("SANS_SERIF",Font.BOLD,15));
		track.setOpaque(true);
		
		back = new JButton("BACK");
		back.setBackground(new Color(0,0,102));
		back.setForeground(Color.white);
		back.setFont(new Font("SANS_SERIF",Font.BOLD,15));
		back.setOpaque(true);
		
		topic1.setBounds(100,25,900,20);
		topic2.setBounds(320,360,300,20);
		s.setBounds(300,50,300,50);
		hname.setBounds(120,135,200,50);
		Hname.setBounds(370,145,300,30);
		mob.setBounds(120,205,200,50);
		Mob.setBounds(370,215,300,30);
		track.setBounds(230,300,150,40);
		back.setBounds(420,300,150,40);
		
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MASTER.track.setVisible(false);
				MASTER.Wmain.setVisible(true);
			}
		});
		
		track.addActionListener(this);
		
		topic2.addMouseListener(this);
		
		JPanel bIcon1 = new JPanel();
	    BufferedImage wat = ImageIO.read(new File("C:\\Users\\MADHUSRI\\Desktop\\Images\\con.jpg"));
	    BufferedImage resized1 = resize(wat, 500, 600);
	    JLabel label1 = new JLabel(new ImageIcon(resized1));
	    bIcon1.add(label1);
	    bIcon1.setBounds(900,100,600,600);
	    bIcon1.setBackground(Color.white);
		
		
		jp.add(topic2);
		jp.add(s);
		jp.add(hname);
		jp.add(mob);
		jp.add(Hname);
		jp.add(Mob);
		jp.add(track);
		jp.add(back);
		
		jp.setBounds(100,100,800,450);
		jp.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
		jp.setBackground(Color.white);
		jp.setVisible(true);
		Mas.add(topic1);
		Mas.add(jp);
		Mas.add(bIcon1);
		Mas.setLayout(null);
		jp.setLayout(null);
		Mas.setBounds(13,200,1500,1500);
		Mas.setBackground(Color.WHITE);
		co.add(Mas);
//		setVisible(true);
//		setSize(2000,2000);
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
		new TrackWaterConnection();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == topic2) {
			MASTER.track.setVisible(false);
			MASTER.watconn.setVisible(true);
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == track) {
			String a = Hname.getText().toString();
			
			System.out.println(a);
            boolean bool = true;
            
			try {
				while(true) {
					Connection conn = getConn.getConnection();
					
		            String query = "SELECT MOBILE_NUMBER FROM TEMPWATERCONN WHERE HOUSEHEAD_NAME = ?";
					
					PreparedStatement pstmt = conn.prepareStatement(query);
			     	pstmt.setString(1, a);
					ResultSet rst = pstmt.executeQuery();
		            
					System.out.println("tep1");
					
					while(rst.next()) {
						System.out.println("temp2");
						JOptionPane.showMessageDialog(co, "YOU APPLICATION IS PENDING");
						bool = false;
					}
					
					
                    String query1 = "SELECT MOBILE_NUMBER FROM APPROVWATERCONN WHERE HOUSEHEAD_NAME = ?";
					
					PreparedStatement pstmt1= conn.prepareStatement(query1);
			     	pstmt1.setString(1, a);
					ResultSet rst1 = pstmt1.executeQuery();
					System.out.println("Approv1");
					
					
					while(rst1.next()) {
						System.out.println("Approv2");
						JOptionPane.showMessageDialog(co, "YOU APPLICATION HAS BEEN APPROVED");
						bool = false;
					}
					
                    String query2 = "SELECT MOBILE_NUMBER FROM REJECWATERCONN WHERE HOUSEHEAD_NAME = ?";
					
					PreparedStatement pstmt2= conn.prepareStatement(query2);
			     	pstmt2.setString(1, a);
					ResultSet rst2 = pstmt2.executeQuery();
					
					System.out.println("Reject 1");
					
					while(rst2.next()) {
						System.out.println("Reject 2");
						JOptionPane.showMessageDialog(co, "YOU APPLICATION HAS BEEN REJECT");
						bool = false;
					}
					
					if(bool) {
						JOptionPane.showMessageDialog(co, "YOU HAVEN'T APPLIED FOR NEW WATER CONNECTION");
					}
					break;
					
				}
			}
			catch(Exception ee) {}
			
		}
	 
		
	}
}