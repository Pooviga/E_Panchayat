import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class DEATH_VIEW extends JFrame implements Runnable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel h1,h2,t1,tt1,t2,tt2,t3,tt3,line;
	JPanel jp,panel;
	JScrollPane sp;
	Container co;
	String ans_dis="",ans_tp="",ans_mn="",ans_email="",ans_dod="",ans_gender="",ans_n="",ans_iden="",
			ans_hname,ans_cause,ans_cert,ans_place,ans_rel="",ans_pa="",ans_pin="";
	
	
	public DEATH_VIEW(String district,String town_panchayat,String date_of_birth,String name) throws IOException {
		
		co = getContentPane();
		co.setLayout(null);
		
		setTitle("BIRTH CERTIFICATE");
		
		jp=new JPanel();
		
		
		try {
			JPanel bIcon1 = new JPanel();
		    BufferedImage dis1 = ImageIO.read(new File("C:\\Users\\MADHUSRI\\Desktop\\Images\\limage.png"));
		    BufferedImage resized1 = resize(dis1, 160, 160);
		    JLabel label1 = new JLabel(new ImageIcon(resized1));
		    bIcon1.add(label1);
		    bIcon1.setBounds(80,72,160,160);
		    bIcon1.setBackground(Color.white);
			
			JPanel bIcon2 = new JPanel();
		    BufferedImage dis2 = ImageIO.read(new File("C:\\Users\\MADHUSRI\\Desktop\\Images\\rimage.png"));
		    BufferedImage resized2 = resize(dis2, 160, 140);
		    JLabel label2 = new JLabel(new ImageIcon(resized2));
		    bIcon2.add(label2);
		    bIcon2.setBounds(840,82,150,140);
		    bIcon2.setBackground(Color.white);
		    jp.add(bIcon1);
			jp.add(bIcon2);
		}
		catch(Exception ee) {
			System.out.println(ee);
		}
		
		Thread th = new Thread() {
			public void run() {
				 
				h1 = new JLabel("Governmet of Tamil Nadu");
				
				t1 = new JLabel(ans_dis+" CITY MUNICIPAL CORPORATION");
				
				t2 = new JLabel("DEATH CERTIFICATE");
				
				t3 = new JLabel("<HTML>(Issued under Section 12/17 of the Registration of Birth and Death Act,1969 and<br>"
						+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Rule 8/13 of Tamil Nadu registration of Birth and Death Rules 2022)<br></HTML>");
				
				tt1 = new JLabel("<HTML><p>"
						+ "<br> This is to certify that the following information has been taken from the original record of Death "
						+ "which is the register <br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  for (Ward) <b>WD-18</b> of "+ans_dis+" City Municipal Corporation"
						+ " of "+ans_dis+" District , Tamilnadu State.<br><br></p></HTML>");
				
				tt2 = new JLabel("<HTML><pre font-size : 16px;><br><br><b>"
						+ "   Name                                 :                       "+ans_n+""
						+ "<br><br>"
						+ "   Sex                                  :                       "+ans_gender+""
						+ "<br><br>"
						+ "   Date of Death                        :                       "+ans_dod+""
						+ "<br><br>"
						+ "   District                             :                       "+ans_dis+","+ans_tp+""
						+ "<br><br>"
						+ "   Place of Death                       :                       "+ans_place+""
						+ "<br><br>"  
						+ "   Name of Father / Husband             :                       "+ans_hname+""
						+ "<br><br>"	
						+ "   Mobile Number                        :                       "+ans_mn+""
						+ "<br><br>"
						+ "   Mail Id                              :                       "+ans_email+""
						+ "<br><br>"
						+ "   Cause of Death                       :                       "+ans_cause+""
						+ "<br><br>"
						+ "   Was Death Medically Certified?       :                       "+ans_cert+""
						+ "<br><br>"
						+ "   Religion                             :                       "+ans_rel+""
						+ "<br><br>"
						+ "   Permanent Residential Address<br>"
						+ "   of the Parents                       :                       "+ans_pa+""
						+ "<br><br>"
						+ "   Pincode                              :                       "+ans_pin+""
						+ "<b><br><br><br></pre></HTML>");
				 
				line=new JLabel("-----------------------------------------------------------------------------------------------------------"
						+ "--------------------------------------------------------------------------------------------------------");
				
				tt3 = new JLabel("<HTML><b>  ENSURE REGISTRATION OF EVERY BIRTH AND DEATH </b></HTML> ");
				
				

				h1.setBounds(270,130,1500,40);
				h1.setForeground(new Color(0,0,102));
				h1.setFont(new Font("SANS-SERIF",Font.BOLD,45));
				
				t1.setBounds(300,180,1500,40);
				t1.setForeground(new Color(0,0,102));
				t1.setFont(new Font("SANS-SERIF",Font.BOLD,25));
				
				t2.setBounds(400,230,1500,40);
				t2.setForeground(new Color(0,0,102));
				t2.setFont(new Font("SANS-SERIF",Font.BOLD,25));
				
				t3.setBounds(230,260,1500,100);
				t3.setFont(new Font("SANS-SERIF",Font.BOLD,15));
				
				tt1.setBounds(120,320,1500,100);
				tt1.setFont(new Font("SANS-SERIF",Font.PLAIN,16));
				
				tt2.setBounds(100,350,1500,800);
				tt2.setFont(new Font("SANS-SERIF",Font.PLAIN,17));
				
				line.setBounds(120,1100,2000,10);
				
				tt3.setBounds(280,1110,1500,100);
				tt3.setFont(new Font("SANS-SERIF",Font.PLAIN,18));
				
				
				jp.add(h1);
				jp.add(t1);
				jp.add(t2);
				jp.add(t3);
				jp.add(tt1);
				jp.add(tt2);
				jp.add(line);
				jp.add(tt3);
				
				jp.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
				
				panel = new JPanel();
				panel.add(jp);
				
		        panel.setPreferredSize(new Dimension(200, 1220));
				
		        panel.setLayout(null);
				jp.setLayout(null);
				jp.setBounds(100,0,1050,1200);
				jp.setBackground(Color.white);
				panel.setBackground(Color.white);
				
				sp = new JScrollPane(panel);
				sp.setVisible(true);
				sp.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1, false));
				sp.setBounds(180,180,1350,600);
				


				co.add(sp,BorderLayout.CENTER);
				
				MASTER.details(sp);
			}
		};
		
		try
		{
			Connection conn = getConn.getConnection();
			
			//System.out.println("CERT1"+district+" "+town_panchayat+" "+date_of_birth+" "+child_n);
			
			PreparedStatement pstmt = conn.prepareStatement("Select * from approvdeath where NAME=?");
//			pstmt.setString(1, district);
//			pstmt.setString(2, town_panchayat);
//			pstmt.setString(3, date_of_birth);
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
			
			ans_dis=rs.getString("DISTRICT");
			ans_tp=rs.getString("TOWN_PANCHAYAT");
			ans_mn=rs.getString("MOBILE_NUMBER");
			ans_email= rs.getString("EMAIL");
			ans_dod =rs.getString("DATE_OF_DEATH");
			ans_gender=rs.getString("GENDER");
			ans_n= rs.getString("NAME");
			ans_iden= rs.getString("IDENTIFICATION");
			ans_hname = rs.getString("HORF_NAME");
			ans_cause = rs.getString("CAUSE_OF_DEATH");
			ans_cert = rs.getString("CERTIFIED");
			ans_place = rs.getString("PLACE_OF_DEATH");
			ans_rel=rs.getString("RELIGION");
			ans_pa=rs.getString("ADDRESS");
			ans_pin=rs.getString("PINCODE");
			//System.out.println("HAI DBMS");
			th.start();

			}
			//setVisible(true);
			rs.close();
			pstmt.close();
			conn.close();
		}
		catch (Exception e)
		{
		// TODO: handle exception
			System.out.println(e);
		}
		

		
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
		new DEATH_VIEW("MADURAI","MADURAI","04/01/2002","PRABHA M");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}