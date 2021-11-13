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

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class CONTACT extends JFrame{
	
	JLabel h1,t1,t2,t3,t4,t5;
	JLabel nr1,nr2,nr3,nr4;
	JLabel ms1,ms2,ms3,ms4;
	JLabel tr1,tr2,tr3,tr4;
	JLabel ps1,ps2,ps3,ps4;
	JLabel jk1,jk2,jk3,jk4;
	JPanel j1,j2,j3,j4,j5,jp;
	JPanel l1,l2,l3,l4,l5;
	JPanel p1,p2,p3,p4,p5;
	JPanel e1,e2,e3,e4,e5;
	JPanel w1,w2,w3,w4,w5;
	JPanel panel;
	JScrollPane sp;
	Container co;
	
	public CONTACT() throws IOException {
		
		setTitle("CONTACT");
		
		co = getContentPane();
		co.setLayout(null);
		
		h1 = new JLabel("CONTACT US");
		
		Font f = new Font(Font.SANS_SERIF,Font.PLAIN,15);
		
		t1 = new JLabel("   NITHINRAAJ J");
		nr1 = new JLabel("<HTML>Bhuvanagiri, Cuddalore <br>608601, TamilNadu</HTML>");
		nr2 = new JLabel("PHONE NO. : 9655092382");
		nr3 = new JLabel("19tucs138@skct.edu.in");
		nr4 = new JLabel(" www.nithinraajj.com");
		
		nr1.setFont(f);
		nr2.setFont(f);
		nr3.setFont(f);
		nr4.setFont(f);
		
		
		t2 = new JLabel("   MADHUSRI J");
		ms1 = new JLabel("<HTML>Kugalur, Erode <br>638313, TamilNadu</HTML>");
		ms2 = new JLabel("PHONE NO. : 9360224171");
		ms3 = new JLabel("19tucs118@skct.edu.in");
		ms4 = new JLabel(" www.madhusrij.com");
		
		
		ms1.setFont(f);
		ms2.setFont(f);
		ms3.setFont(f);
		ms4.setFont(f);
		
		
		t3 = new JLabel("   NAVEEN T R");
		tr1 = new JLabel("<HTML>Tuticorin <br>628008, TamilNadu</HTML>");
		tr2 = new JLabel("PHONE NO. : 9944885585");
		tr3 = new JLabel("19tucs136@skct.edu.in");
		tr4 = new JLabel(" www.naveentr.com");
		
		tr1.setFont(f);
		tr2.setFont(f);
		tr3.setFont(f);
		tr4.setFont(f);
		
		t4 = new JLabel("   POOVIGA S");
		ps1 = new JLabel("<HTML>Karur <br>639117, TamilNadu</HTML>");
		ps2 = new JLabel("PHONE NO. : 8870221789");
		ps3 = new JLabel("19tucs144@skct.edu.in");
		ps4 = new JLabel(" www.poovigas.com");
		
		ps1.setFont(f);
		ps2.setFont(f);
		ps3.setFont(f);
		ps4.setFont(f);
		
		t5 = new JLabel("   PRABHAKARAN M");
		jk1 = new JLabel("<HTML> Madurai<br>625020, TamilNadu</HTML>");
		jk2 = new JLabel("PHONE NO. : 9361559050");
		jk3 = new JLabel("19tucs145@skct.edu.in");
		jk4 = new JLabel(" www.prabhakaranm.com");
		
		jk1.setFont(f);
		jk2.setFont(f);
		jk3.setFont(f);
		jk4.setFont(f);
		
		h1.setBounds(40,30,200,40);
		h1.setForeground(new Color(0,0,102));
		h1.setFont(new Font("SANS-SERIF",Font.BOLD,25));
		
		t1.setBounds(0,0,300,35);
		t1.setOpaque(true);
		t1.setForeground(Color.WHITE);
		t1.setBackground(new Color(0,0,102));
		t1.setFont(new Font("SANS-SERIF",Font.BOLD,20));
			
		t2.setBounds(0,0,300,35);
		t2.setOpaque(true);
		t2.setForeground(Color.WHITE);
		t2.setBackground(new Color(0,0,102));
		t2.setFont(new Font("SANS-SERIF",Font.BOLD,20));
		
		t3.setBounds(0,0,300,35);
		t3.setOpaque(true);
		t3.setForeground(Color.WHITE);
		t3.setBackground(new Color(0,0,102));
		t3.setFont(new Font("SANS-SERIF",Font.BOLD,20));
		
		t4.setBounds(0,0,300,35);
		t4.setOpaque(true);
		t4.setForeground(Color.WHITE);
		t4.setBackground(new Color(0,0,102));
		t4.setFont(new Font("SANS-SERIF",Font.BOLD,20));
		
		t5.setBounds(0,0,300,35);
		t5.setOpaque(true);
		t5.setForeground(Color.WHITE);
		t5.setBackground(new Color(0,0,102));
		t5.setFont(new Font("SANS-SERIF",Font.BOLD,20));
		
		l1 = new JPanel();
		l2 = new JPanel();
		l3 = new JPanel();
		l4 = new JPanel();
		l5 = new JPanel();
		
	    BufferedImage loc1 = ImageIO.read(new File("C:\\Users\\MADHUSRI\\Desktop\\Images\\location.png"));
	    BufferedImage relo1 = resize(loc1, 20, 20);
	    JLabel la1 = new JLabel(new ImageIcon(relo1));
	    JLabel la2 = new JLabel(new ImageIcon(relo1));
	    JLabel la3 = new JLabel(new ImageIcon(relo1));
	    JLabel la4 = new JLabel(new ImageIcon(relo1));
	    JLabel la5 = new JLabel(new ImageIcon(relo1));
	    
	    l1.add(la1);
	    l2.add(la2);
	    l3.add(la3);
	    l4.add(la4);
	    l5.add(la5);
	    
	    l1.setBounds(32,80,40,40);
	    l1.setBackground(Color.white);
	    
	    nr1.setBounds(72,70,200,50);
	    
	    l2.setBounds(32,80,40,40);
	    l2.setBackground(Color.white);
	    
	    ms1.setBounds(72,70,200,50);
	    
	    l3.setBounds(32,80,40,40);
	    l3.setBackground(Color.white);
	    
	    tr1.setBounds(72,70,200,50);
		
	    l4.setBounds(32,80,40,40);
	    l4.setBackground(Color.white);
	    
	    ps1.setBounds(72,70,200,50);
	    
	    l5.setBounds(32,80,40,40);
	    l5.setBackground(Color.white);
	    
	    jk1.setBounds(72,70,200,50);
	    
	    p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
	    
	    BufferedImage phn1 = ImageIO.read(new File("C:\\Users\\MADHUSRI\\Desktop\\Images\\phone.png"));
	    BufferedImage rephn1 = resize(phn1, 20, 20);
	    JLabel ph1 = new JLabel(new ImageIcon(rephn1));
	    JLabel ph2 = new JLabel(new ImageIcon(rephn1));
	    JLabel ph3 = new JLabel(new ImageIcon(rephn1));
	    JLabel ph4 = new JLabel(new ImageIcon(rephn1));
	    JLabel ph5 = new JLabel(new ImageIcon(rephn1));
	    
	    p1.add(ph1);
	    p2.add(ph2);
	    p3.add(ph3);
	    p4.add(ph4);
	    p5.add(ph5);
	    
	    p1.setBounds(33,125,40,40);
	    p1.setBackground(Color.white);
	    
	    nr2.setBounds(72,125,200,40);
	    
	    p2.setBounds(33,125,40,40);
	    p2.setBackground(Color.white);
	    
	    ms2.setBounds(72,125,200,40);
	    
	    p3.setBounds(33,125,40,40);
	    p3.setBackground(Color.white);
	    
	    tr2.setBounds(72,125,200,40);
		
	    p4.setBounds(33,125,40,40);
	    p4.setBackground(Color.white);
	    
	    ps2.setBounds(72,125,200,40);
	    
	    p5.setBounds(33,125,40,40);
	    p5.setBackground(Color.white);
	    
	    jk2.setBounds(72,125,200,40);
	    
	    e1 = new JPanel();
		e2 = new JPanel();
		e3 = new JPanel();
		e4 = new JPanel();
		e5 = new JPanel();
	    
	    BufferedImage ema1 = ImageIO.read(new File("C:\\Users\\MADHUSRI\\Desktop\\Images\\email.png"));
	    BufferedImage reem1 = resize(ema1, 20, 20);
	    JLabel em1 = new JLabel(new ImageIcon(reem1));
	    JLabel em2 = new JLabel(new ImageIcon(reem1));
	    JLabel em3 = new JLabel(new ImageIcon(reem1));
	    JLabel em4 = new JLabel(new ImageIcon(reem1));
	    JLabel em5 = new JLabel(new ImageIcon(reem1));
	    
	    e1.add(em1);
	    e2.add(em2);
	    e3.add(em3);
	    e4.add(em4);
	    e5.add(em5);
	    
	    e1.setBounds(32,170,40,40);
	    e1.setBackground(Color.white);
	    
	    nr3.setBounds(72,170,200,40);
	    
	    e2.setBounds(32,170,40,40);
	    e2.setBackground(Color.white);
	    
	    ms3.setBounds(72,170,200,40);
	    
	    e3.setBounds(32,170,40,40);
	    e3.setBackground(Color.white);
		
	    tr3.setBounds(72,170,200,40);
	    
	    e4.setBounds(32,170,40,40);
	    e4.setBackground(Color.white);
	    
	    ps3.setBounds(72,170,200,40);
	    
	    e5.setBounds(32,170,40,40);
	    e5.setBackground(Color.white);
	    
	    jk3.setBounds(72,170,200,40);
	    
	    w1 = new JPanel();
		w2 = new JPanel();
		w3 = new JPanel();
		w4 = new JPanel();
		w5 = new JPanel();
	    
	    BufferedImage web1 = ImageIO.read(new File("C:\\Users\\MADHUSRI\\Desktop\\Images\\web.png"));
	    BufferedImage rewe1 = resize(web1, 25, 25);
	    JLabel we1 = new JLabel(new ImageIcon(rewe1));
	    JLabel we2 = new JLabel(new ImageIcon(rewe1));
	    JLabel we3 = new JLabel(new ImageIcon(rewe1));
	    JLabel we4 = new JLabel(new ImageIcon(rewe1));
	    JLabel we5 = new JLabel(new ImageIcon(rewe1));
	    
	    w1.add(we1);
	    w2.add(we2);
	    w3.add(we3);
	    w4.add(we4);
	    w5.add(we5);
	    
	    w1.setBounds(32,220,40,40);
	    w1.setBackground(Color.white);
	    
	    nr4.setBounds(72,220,200,40);
	    
	    w2.setBounds(32,220,40,40);
	    w2.setBackground(Color.white);
	    
	    ms4.setBounds(72,220,200,40);
	    
	    w3.setBounds(32,220,40,40);
	    w3.setBackground(Color.white);
	    
	    tr4.setBounds(72,220,200,40);
		
	    w4.setBounds(32,220,40,40);
	    w4.setBackground(Color.white);
	    
	    ps4.setBounds(72,220,200,40);
	    
	    w5.setBounds(32,220,40,40);
	    w5.setBackground(Color.white);
	    
	    jk4.setBounds(72,220,200,40);
	    
		j1 = new JPanel();
		j1.add(t1);
		j1.add(l1);
		j1.add(nr1);
		j1.add(p1);
		j1.add(nr2);
		j1.add(e1);
		j1.add(nr3);
		j1.add(w1);
		j1.add(nr4);
		
		j2 = new JPanel();
		j2.add(t2);
		j2.add(l2);
		j2.add(ms1);
		j2.add(p2);
		j2.add(ms2);
		j2.add(e2);
		j2.add(ms3);
		j2.add(w2);
		j2.add(ms4);
		
		j3 = new JPanel();
		j3.add(t3);
		j3.add(l3);
		j3.add(tr1);
		j3.add(p3);
		j3.add(tr2);
		j3.add(e3);
		j3.add(tr3);
		j3.add(w3);
		j3.add(tr4);
		
		j4 = new JPanel();
		j4.add(t4);
		j4.add(l4);
		j4.add(ps1);
		j4.add(p4);
		j4.add(ps2);
		j4.add(e4);
		j4.add(ps3);
		j4.add(w4);
		j4.add(ps4);
		
		j5 = new JPanel();
		j5.add(t5);
		j5.add(l5);
		j5.add(jk1);
		j5.add(p5);
		j5.add(jk2);
		j5.add(e5);
		j5.add(jk3);
		j5.add(w5);
		j5.add(jk4);
		
		
		
		j1.setLayout(null);
		j1.setOpaque(true);
		j1.setVisible(true);
		j1.setBackground(Color.white);
		j1.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
		
		j2.setLayout(null);
		j2.setOpaque(true);
		j2.setVisible(true);
		j2.setBackground(Color.white);
	    j2.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
	    
	    j3.setLayout(null);
		j3.setOpaque(true);
		j3.setVisible(true);
		j3.setBackground(Color.white);
		j3.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
		
		j4.setLayout(null);
		j4.setOpaque(true);
		j4.setVisible(true);
		j4.setBackground(Color.white);
		j4.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
		
		j5.setLayout(null);
		j5.setOpaque(true);
		j5.setVisible(true);
		j5.setBackground(Color.white);
		j5.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
		
		j1.setBounds(80,100,300,300);
		j2.setBounds(410,100,300,300);
		j3.setBounds(750,100,300,300);
		j4.setBounds(245,450,300,300);
		j5.setBounds(585,450,300,300);
		
		
		
		jp = new JPanel();
		jp.add(h1);
		jp.add(j1);
		jp.add(j2);
		jp.add(j3);
		jp.add(j4);
		jp.add(j5);
		

		jp.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
		
		panel = new JPanel();
		panel.add(jp);
		
        panel.setPreferredSize(new Dimension(200, 850));
		
		panel.setLayout(null);
		jp.setLayout(null);
		jp.setBounds(0,0,1150,800);
		jp.setBackground(Color.white);
		panel.setBackground(Color.white);
		
		sp = new JScrollPane(panel);
		sp.setVisible(true);
		sp.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1, false));
		sp.setBounds(180,180,1350,600);
		
		
		co.add(sp,BorderLayout.CENTER);
		
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
		new CONTACT();
	}

}
