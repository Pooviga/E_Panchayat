import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class DeathRegistrations extends JFrame implements MouseListener{
    JPanel jp,panel;
    JScrollPane sp;
    Container co;
    JLabel title;
    JButton back;
    
    int y = 20;
    int x = 150;
	public DeathRegistrations() throws IOException {
		
		setTitle("DEATH REGISTRATIONS");
		
		co = getContentPane();
		co.setLayout(null);
		
        title = new JLabel("DEATH REGISTRATIONS");
		
		title.setForeground(new Color(0,0,102));
		title.setFont(new Font("SANS-SERIF",Font.PLAIN,25));
		title.setBounds(10,30,500,30);
		
        back = new JButton(" BACK ");
		
		back.setBackground(new Color(0,0,102));
		back.setForeground(Color.white);
		back.setFont(new Font("SANS-SERIF",Font.BOLD,15));
		back.setBounds(1000,35,100,30);
		back.setOpaque(true);
		
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MASTER.Dreg.setVisible(false);
				MASTER.dephm.setVisible(true);
				
				
			}
		});
		
		jp = new JPanel();
		jp.setLayout(null);
		jp.setBackground(Color.white);
		
		try {
            Connection conn = getConn.getConnection();
			
			String query = "SELECT NAME FROM TEMPDEATH";
			
			PreparedStatement st = conn.prepareStatement(query);
			
			ResultSet rst = st.executeQuery();
			
			int i =0;
			
			while(rst.next()) {
				
				if(i == 3) {
					y+=300;
					x = 150;
					i = 0;
				}
				JPanel img = new JPanel();
				
				JPanel p1 = new JPanel();
				p1.setLayout(null);
				//p1.setBackground(Color.white);
				
				String s = rst.getString("NAME");
				JLabel l1 = new JLabel(s);
				
				 BufferedImage image = ImageIO.read(new File("C:\\Users\\MADHUSRI\\Desktop\\Images\\file.jpg"));
				 BufferedImage resized = resize(image, 150, 150);
				 JLabel label = new JLabel(new ImageIcon(resized));
				 img.add(label);
				 img.setBounds(25,20,150,150);
				 img.setBackground(Color.white);
				    
				p1.setBounds(x,y,250,250);
				l1.setBounds(25,180,200,30);
				p1.setBackground(Color.WHITE);
				
				l1.setForeground(new Color(0,0,102));
				l1.setFont(new Font("SANS-SERIF",Font.BOLD,20));
				
				p1.add(l1);
				p1.add(img);
				jp.add(p1);
				
				
				p1.addMouseListener(new MouseAdapter() {
					 public void mouseClicked(MouseEvent e) {
                             new ShowDeathDetails(s);
				        }
				});
				x+=350;
				i++;
			}
		}
		catch(Exception e) {
			System.out.println("DeathReg"+e);
		}
       
        jp.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
		
		panel = new JPanel();
		panel.add(title);
		panel.add(jp);
		panel.add(back);
		
        panel.setPreferredSize(new Dimension(200, y+350));
		
		panel.setLayout(null);
		jp.setLayout(null);
		jp.setBounds(0,80,1150,y+300);
		jp.setBackground(Color.white);
		panel.setBackground(Color.white);
		
		sp = new JScrollPane(panel);
		sp.setVisible(true);
		sp.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1, false));
		sp.setBounds(180,180,1350,600);
		
		
		co.add(sp,BorderLayout.CENTER);
		
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
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
	

	public static void main(String[] args) throws IOException {
		new DeathRegistrations();
	}

}
