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

public class WaterPayMentStatus extends JFrame implements ActionListener{
	
	Container co;
	JPanel jp,Mas;
	JLabel title,dis,tp,mob,s;
	JTextField Dis,Tp,Mob;
	JButton status,reset,back;
	
	WaterPayMentStatus() throws IOException
	{
		
		setTitle("WATER PAYMENT STATUS");
		
		co = getContentPane();
		co.setLayout(null);
		jp = new JPanel();
		Mas = new JPanel();
		Font f1 = new Font(Font.SANS_SERIF,Font.BOLD,15);
		
		s = new JLabel("** ALL FIELDS ARE REQUIRED **");
		s.setOpaque(true);
		s.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
		s.setForeground(Color.red);
		s.setBackground(Color.white);
		
		title = new JLabel("WATER CHARGE PAYMENT STATUS");
		title.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
		title.setForeground(new Color(0,0,102));
		title.setBackground(Color.white);
		title.setOpaque(true);
		
		dis = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font> DISTRICT</HTML>");
		tp = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font> TOWN PANCHYAT</HTML>");
		mob = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font> MOBILE NUMBER</HTML>");
		
		dis.setFont(f1);
		tp.setFont(f1);
		mob.setFont(f1);
		
		dis.setForeground(new Color(0,0,102));
		tp.setForeground(new Color(0,0,102));
		mob.setForeground(new Color(0,0,102));
		
		Dis = new JTextField();
		Tp = new JTextField();
		Mob = new JTextField();
		
		JPanel bIcon1 = new JPanel();
	    BufferedImage wat = ImageIO.read(new File("C:\\Users\\MADHUSRI\\Desktop\\Images\\pay.jpg"));
	    BufferedImage resized1 = resize(wat, 500, 500);
	    JLabel label1 = new JLabel(new ImageIcon(resized1));
	    bIcon1.add(label1);
	    bIcon1.setBounds(800,20,600,500);
	    bIcon1.setBackground(Color.white);
	    Mas.add(bIcon1); 
	    
		status = new JButton("CHECK STATUS");
		status.setBackground(new Color(0,0,102));
		status.setForeground(Color.white);
		status.setOpaque(true);
		status.setFont(f1);
		
		reset = new JButton("RESET");
		reset.setBackground(new Color(0,0,102));
		reset.setForeground(Color.white);
		reset.setOpaque(true);
		reset.setFont(f1);
		
		back = new JButton("BACK");
		back.setBackground(new Color(0,0,102));
		back.setForeground(Color.white);
		back.setOpaque(true);
		back.setFont(f1);
		
		title.setBounds(50,30,600,20);
		back.setBounds(600,10,150,40);
		s.setBounds(200,35,300,50);
		dis.setBounds(100,115,200,30);
		Dis.setBounds(300,115,250,30);
		tp.setBounds(100,180,200,30);
		Tp.setBounds(300,180,250,30);
		mob.setBounds(100,250,200,30);
		Mob.setBounds(300,250,250,30);
		status.setBounds(120,330,200,40);
		reset.setBounds(340,330,150,40);
		
		status.addActionListener(this);
		reset.addActionListener(this);
		
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MASTER.paystatus.setVisible(false);
				MASTER.Wmain.setVisible(true);
				
			}
		});
		
		Mas.add(title);
		Mas.add(back);
		jp.add(s);
		jp.add(dis);
		jp.add(tp);
		jp.add(mob);
		jp.add(Dis);	
		jp.add(Tp);
		jp.add(Mob);
		jp.add(status);
		jp.add(reset);
		
		jp.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
		
		jp.setBounds(100,70,650,400);
		jp.setBackground(Color.white);
		Mas.setBackground(Color.white);
		jp.setVisible(true);
		Mas.setLayout(null);
		jp.setLayout(null);
		Mas.setBounds(13,250,1500,1500);
		Mas.add(jp);
		co.add(Mas);
//		setVisible(true);
//		setSize(2000,2000);
	}
	
	public static void main(String[] args) throws IOException {
		new WaterPayMentStatus();
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
		
		if(e.getSource() == reset) {
			Dis.setText("");
			Tp.setText("");
			Mob.setText("");
		}
		
		if(e.getSource() == status) {
			
			long mb = Long.parseLong(Mob.getText().toString());
			
			String result = "";
			try {

	            Connection conn = getConn.getConnection();
				
				String query = "select status from paystatus where mobile_number = ?";
				
				PreparedStatement pstmt = conn.prepareStatement(query);
				
				pstmt.setLong(1, mb);
				
				ResultSet rst = pstmt.executeQuery();
				
				
				
				if(rst.next()) {
					result = rst.getString("status");
				}
				
			}
			
			catch(Exception e1) {
				JOptionPane.showMessageDialog(MASTER.co, e);
			}
			
			if(result.isEmpty()) {
				JOptionPane.showMessageDialog(MASTER.co, "THERE IS NO WATER CONNECTION REGISTERED FROM GIVEN MOBILE NUMBER");
			}
			
			else {
				JOptionPane.showMessageDialog(MASTER.co, result);
			}
		}
			
	}
}