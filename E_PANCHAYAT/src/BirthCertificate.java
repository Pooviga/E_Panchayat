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

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class BirthCertificate extends JFrame implements ActionListener {
	
	JTextField districts, gram, Name;
	JPanel p1,p2;
	JLabel s,h1, dist, gr, dob, name;
	JTextField dob_text;
	JButton generate,res,back;
	Container co;

	public BirthCertificate() throws IOException {
		
		setTitle("BIRTH CERTIFICATE");
		
		co = getContentPane();
		co.setLayout(null);
		
		h1 = new JLabel("     GENERATE BIRTH CERTIFICATE");
		h1.setBounds(0,0,1350,40);
		h1.setFont(new Font("Sans-serif",Font.BOLD,25));
		h1.setForeground(new Color(0,0,102));
		
		s = new JLabel("** ALL FIELDS ARE REQUIRED **");
		s.setOpaque(true);
		s.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
		s.setForeground(Color.red);
		s.setBackground(Color.white);
		
		dist = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font> DISTRICT</HTML>");
		dist.setForeground(new Color(0,0,102));
		dist.setFont(new Font("Sans-serif",Font.BOLD,15));
		
		gr = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font> TOWN PANCHAYAT</HTML>");
		gr.setForeground(new Color(0,0,102));
		gr.setFont(new Font("Sans-serif",Font.BOLD,15));
		
		
		dob = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font> DATE OF BIRTH(DD/MM/YYYY)</HTML>");
		dob.setForeground(new Color(0,0,102));
		dob.setFont(new Font("Sans-serif",Font.BOLD,15));
		
		name = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font> CHILD NAME</HTML>");
		name.setForeground(new Color(0,0,102));
		name.setFont(new Font("Sans-serif",Font.BOLD,15));
		
		
		dob_text = new JTextField();
		districts = new JTextField();
		Name = new JTextField();
		gram = new JTextField();
		
		
		generate = new JButton("GENERATE");
		res = new JButton("RESET");
		
		
		s.setBounds(230,20,500,30);
		
		dist.setBounds(100 , 75, 200, 30);
		districts.setBounds(370, 75, 250, 30);
		districts.setBackground(Color.WHITE);
		
		gr.setBounds(100, 145, 200, 30);		
		gram.setBounds(370, 145, 250, 30);
		gram.setBackground(Color.WHITE);
		
		name.setBounds(100 , 215, 200, 40);
		Name.setBounds(370 , 215, 250, 30);
		
		dob.setBounds(100, 285, 250, 30);
		dob_text.setBounds(370, 285, 250, 30);
		
		
		generate.setBounds(320,360,150,40);
		generate.setBackground(new Color(0,0,102));
		generate.setForeground(Color.WHITE);
		generate.setFont(new Font("Sans-serif",Font.BOLD,15));
		
		generate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String a = districts.getText().toString();
				String b = gram.getText().toString();
				String d = Name.getText().toString();
				String c = dob_text.getText().toString();
				
				//System.out.println("CERT"+a+" "+b+" "+c+" "+d);
				
                try {
					new BIRTH_VIEW(a,b,c,d);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		res.setBounds(150,360,150,40);
		res.setBackground(new Color(0,0,102));
		res.setForeground(Color.WHITE);
		res.setFont(new Font("Sans-serif",Font.BOLD,15));
		
		res.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				districts.setText("");
				gram.setText("");
				Name.setText("");
				dob_text.setText("");
			}
		});
		
		
		back = new JButton("BACK");
		back.setBackground(new Color(0,0,102));
		back.setBounds(490,360,150,40);
		back.setForeground(Color.white);
		back.setOpaque(true);
		back.setFont(new Font("SANS-SERIF",Font.BOLD,15));
		
		 back.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					MASTER.Bcert.setVisible(false);
					MASTER.Bmain.setVisible(true);
					
				}
			});
		
		JPanel bIcon1 = new JPanel();
	    BufferedImage wat = ImageIO.read(new File("C:\\Users\\MADHUSRI\\Desktop\\Images\\bG.jpg"));
	    BufferedImage resized1 = resize(wat, 550, 550);
	    JLabel label1 = new JLabel(new ImageIcon(resized1));
	    bIcon1.add(label1);
	    bIcon1.setBounds(50,40,600,600);
	    bIcon1.setBackground(Color.white);
		
		p1 = new JPanel();
		p1.setBounds(700, 100, 750, 450);
		p1.setLayout(null);
		p1.setOpaque(true);
		p1.setVisible(true);
		p1.setBackground(Color.white);
		p1.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
		
		p2 = new JPanel();
		p2.setBounds(0, 200, 1600, 600);
		p2.setLayout(null);
		p2.setOpaque(true);
		p2.setVisible(true);
		p2.setBackground(Color.white);
		
		
		p1.add(s);
		p1.add(dist);
		p1.add(gr);
		p1.add(districts);
		p1.add(gram);
		p1.add(dob);
		p1.add(dob_text);
		p1.add(name);
		p1.add(Name);
		p1.add(generate);
		p1.add(res);
		p1.add(back);
		
		p2.add(h1);
		p2.add(p1);
		p2.add(bIcon1);
		
		co.add(p2);
		
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
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) throws IOException {
		new BirthCertificate();
	}

}