import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class HOME extends JFrame{
    
	JPanel p1,p2,p3,foot,bIcon,DIcon,TIcon,WIcon;
	JPanel Bp,Dp,Pp,Wp;
	JLabel h1,h2,h3,BD,DD,PT,WC,dpId,dpPass,dpWar,about,thiru,thirukural;
	static JTextField dpId_txt;
	static JPasswordField dpPass_txt;
	JButton dpSubmit;
	JPanel M;
	Container co;
	
	public HOME() throws IOException{
		
		setTitle("HOME");
		
		co = getContentPane();
		co.setLayout(null);
		
		M = new JPanel();
		
		h1 = new JLabel("  PUBLIC LOGIN");
		h2 = new JLabel("  DEPARTMENT LOGIN");
		h3 = new JLabel("  ABOUT PANCHAYAT");
		
		BD = new JLabel("Birth Details");
		DD = new JLabel("Death Details");
		PT = new JLabel("<HTML>&nbsp;Property Tax<br>Tax Calculator</HTML>");
		WC = new JLabel("Water Charges");
		
		
		
		dpId = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font> DEPARTMENT OFFICER ID</HTML>");
		dpPass = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font> PASSWORD</HTML>");
		dpWar = new JLabel("**ONLY FOR OFFICE PURPOSE**");
		
		about = new JLabel("<HTML><p style=\"line-height: 150%;justify-content: center;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "Tamil Nadu is the first State to have introduced a classification in the status of "
				+ "local bodies as 'Town Panchayat ', which was planned as a transitional body between Rural and Urban Local Bodies. "
				+ "The Town Panchayats adopt well devised accounting and auditing procedures and the service delivery to the "
				+ "public has been better.The Town Panchayats were conferred with individual administrative powers and unique"
				+ " functional characters and have been in existence for over a century.The Town Panchayats are places of importance "
				+ "such as Division / Taluk headquarters, Tourist Spots, Pilgrim Centers and Commercial/Industrial towns.</p></HTML>");
		
		
		
		thiru = new JLabel("  COUPLET 423");
		thirukural = new JLabel("<HTML>Though things diverse from divers sages' lips we learn,<br>"
				+ "'Tis wisdom's part in each the true thing to discern.</HTML>");
		
		dpId_txt = new JTextField();
		dpPass_txt = new JPasswordField();
		
		dpSubmit = new JButton("SUBMIT");
		
		dpSubmit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		foot = new JPanel();
		
		h1.setBounds(0,0,500,30);
		h1.setFont(new Font("Sans-serif",Font.BOLD,15));
		h1.setBackground(new Color(0,0,102));
		h1.setForeground(Color.WHITE);
		h1.setOpaque(true);
		
		h2.setBounds(0,0,350,30);
		h2.setFont(new Font("Sans-serif",Font.BOLD,15));
		h2.setBackground(new Color(0,0,102));
		h2.setForeground(Color.WHITE);
		h2.setOpaque(true);
		
		h3.setBounds(0,0,300,30);
		h3.setFont(new Font("Sans-serif",Font.BOLD,15));
		h3.setBackground(new Color(0,0,102));
		h3.setForeground(Color.WHITE);
		h3.setOpaque(true);
		
		
		
		dpWar.setBounds(60,50,300,30);
		dpWar.setFont(new Font("Sans-serif",Font.BOLD,15));
		dpWar.setForeground(new Color(206,9,9));
		dpId.setBounds(20,110,200,30);
		dpId_txt.setBounds(30,140,300,40);
		dpPass.setBounds(20,200,100,30);
		dpPass_txt.setBounds(30,230,300,40);
		dpSubmit.setBounds(100,300,150,40);
		dpSubmit.setBackground(new Color(0,0,102));
		dpSubmit.setForeground(Color.WHITE);
		dpSubmit.setFont(new Font("Sans-serif",Font.BOLD,15));
	
		
		about.setBounds(10,10,290,390);
		about.setFont(new Font("Sans-serif",Font.PLAIN,15));
		
		thiru.setBounds(0,0,1170,30);
		thiru.setFont(new Font("Sans-serif",Font.BOLD,15));
		thiru.setBackground(new Color(0,0,102));
		thiru.setForeground(Color.WHITE);
		thiru.setOpaque(true);
		
		thirukural.setBounds(300,35,600,100);
		thirukural.setFont(new Font("Sans-serif",Font.PLAIN,22));
		
		    bIcon = new JPanel();
		    Bp = new JPanel();
		    JPanel n = new JPanel();
		    Bp.setLayout(null);
		    BD.setBounds(70,100,200,30);
			BD.setFont(new Font("Sans-serif",Font.PLAIN,15));
		    BufferedImage babyIcon = ImageIO.read(new File("C:\\Users\\MADHUSRI\\Desktop\\Images\\BabyIcon.jpg"));
		    BufferedImage resized = resize(babyIcon, 80, 80);
		    JLabel label1 = new JLabel(new ImageIcon(resized));
		    bIcon.add(label1);
		    bIcon.setBounds(0,0,200,100);
		    Bp.setBounds(40,60,180,150);
		    Bp.add(BD);
		    n.add(bIcon);
		    Bp.add(n);
		    n.setBounds(0,0,220,150);
		    bIcon.setBackground(Color.WHITE);
		    n.setBackground(Color.WHITE);
		    Bp.setBackground(Color.WHITE);
		    p1.add(Bp); 
		    
		    DIcon = new JPanel();
		    Dp = new JPanel();
		    JPanel n1 = new JPanel();
		    Dp.setLayout(null);
		    DD.setBounds(70,100,200,30);
			DD.setFont(new Font("Sans-serif",Font.PLAIN,15));
		    BufferedImage deathIcon = ImageIO.read(new File("C:\\Users\\MADHUSRI\\Desktop\\Images\\DeathIcon.png"));
		    BufferedImage resized1 = resize(deathIcon, 60, 60);
		    JLabel label2 = new JLabel(new ImageIcon(resized1));
		    DIcon.add(label2);
		    DIcon.setBounds(0,0,200,100);
		    Dp.setBounds(250,60,200,150);
		    Dp.add(DD);
		    n1.add(DIcon);
		    Dp.add(n1);
		    n1.setBounds(0,10,220,150);
		    DIcon.setBackground(Color.WHITE);
		    n1.setBackground(Color.WHITE);
		    Dp.setBackground(Color.WHITE);
		    p1.add(Dp);
		    
		    TIcon = new JPanel();
		    JPanel n2 = new JPanel();
		    Pp = new JPanel();
		    Pp.setLayout(null);
		    PT.setBounds(70,100,200,60);
			PT.setFont(new Font("Sans-serif",Font.PLAIN,15));
		    BufferedImage PIcon = ImageIO.read(new File("C:\\Users\\MADHUSRI\\Desktop\\Images\\PT.png"));
		    BufferedImage resized2 = resize(PIcon, 80, 80);
		    JLabel label3 = new JLabel(new ImageIcon(resized2));
		    TIcon.add(label3);
		    TIcon.setBounds(0,0,200,100);
		    Pp.setBounds(40,210,200,150);
		    Pp.add(PT);
		    n2.add(TIcon);
		    Pp.add(n2);
		    n2.setBounds(0,10,220,150);
		    TIcon.setBackground(Color.WHITE);
		    n2.setBackground(Color.WHITE);
		    Pp.setBackground(Color.WHITE);
		    p1.add(Pp);
		    
		    WIcon = new JPanel();
		    JPanel n3 = new JPanel();
		    Wp = new JPanel();
		    Wp.setLayout(null);
			WC.setBounds(65,110,200,30);
			WC.setFont(new Font("Sans-serif",Font.PLAIN,15));
		    BufferedImage WcIcon = ImageIO.read(new File("C:\\Users\\MADHUSRI\\Desktop\\Images\\WC.png"));
		    BufferedImage resized3 = resize(WcIcon, 80, 130);
		    JLabel label4 = new JLabel(new ImageIcon(resized3));
		    WIcon.add(label4);
		    WIcon.setBounds(0,0,200,100);
		    Wp.setBounds(250,210,200,150);
		    Wp.add(WC);
		    n3.add(WIcon);
		    Wp.add(n3);
		    n3.setBounds(0,10,220,150);
		    WIcon.setBackground(Color.WHITE);
		    n3.setBackground(Color.WHITE);
		    Wp.setBackground(Color.WHITE);
		    p1.add(Wp);
		    
		    Bp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		    Dp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		    Pp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    	    Wp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			 
		p1.add(h1);
		p1.setLayout(null);
		p1.setOpaque(true);
		p1.setVisible(true);
		p1.setBackground(Color.white);
		p1.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
		
		
		p2.add(h2);
		p2.add(dpWar);
		p2.add(dpId);
		p2.add(dpId_txt);
		p2.add(dpPass);
		p2.add(dpPass_txt);
		p2.add(dpSubmit);
		p2.setLayout(null);
		p2.setOpaque(true);
		p2.setVisible(true);
		p2.setBackground(Color.white);
		p2.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
		
		p3.add(h3);
		p3.add(about);
		p3.setLayout(null);
		p3.setOpaque(true);
		p3.setVisible(true);
		p3.setBackground(Color.white);
		p3.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
		
		foot.add(thiru);
		foot.add(thirukural);
		foot.setLayout(null);
		foot.setOpaque(true);
		foot.setVisible(true);
		foot.setBackground(Color.white);
		foot.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
		
		
		p1.setBounds(150,50,500,400);
		p2.setBounds(660,50,350,400);
		p3.setBounds(1020,50,300,400);
		foot.setBounds(150,470,1170,150);
		
		M.add(p1);
		M.add(p2);
		M.add(p3);
		M.add(foot);
		
		
	   
	    
		
		M.setBounds(0,150,1600,1000);
		M.setLayout(null);
		M.setOpaque(true);
		M.setBackground(Color.white);
		
		co.add(M);	
//		setSize(2000,2000);
//		setVisible(true);
		
		
		
		
	}
	
	 private static BufferedImage resize(BufferedImage img, int height, int width) {
	        Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
	        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
	        Graphics2D g2d = resized.createGraphics();
	        g2d.drawImage(tmp, 0, 0, null);
	        g2d.dispose();
	        return resized;
	    }
	
	public static void main(String[] args) throws IOException{
		new HOME();
	}

	
	
}
