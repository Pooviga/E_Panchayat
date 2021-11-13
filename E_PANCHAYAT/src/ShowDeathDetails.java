import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ShowDeathDetails extends JFrame implements Runnable{
	
	JPanel jp,panel,dum;
	JScrollPane sp;
	Container co;
	
	JLabel title,dis,tp,mb,email,dod,gender,Name,Ide,HName,cause,certi,place,reli,add,pincode,state;
	JLabel dis_t,tp_t,mb_t,email_t,dod_t,gender_t,Name_t,Ide_t,HName_t,cause_t,certi_t,place_t,reli_t,add_t,pincode_t,state_t;
	
	String a="", b="", d="", ew="", fo="", g="", h="", i="", j="", k="", l="", m="", n="", p="";
	long c,o; 
	
	JButton approve,reject,back;
	
	public ShowDeathDetails(String s) {
		
		setTitle("SHOW DEATH DETAILS");
		
		Font f = new Font(Font.SANS_SERIF,Font.PLAIN,15);
		
		title = new JLabel("DEATH DETAILS - "+s);
		
		title.setForeground(new Color(0,0,102));
		title.setFont(new Font("SANS-SERIF",Font.BOLD,20));
		title.setBounds(30,0,500,30);
		
		co = getContentPane();
		co.setLayout(null);
		
		dum = new JPanel();
		
		Thread th = new Thread() {
			public void run() {
				dis.setForeground(new Color(0,0,102));
				tp.setForeground(new Color(0,0,102));
				mb.setForeground(new Color(0,0,102));
				email.setForeground(new Color(0,0,102));
				dod.setForeground(new Color(0,0,102));
				gender.setForeground(new Color(0,0,102));
				Name.setForeground(new Color(0,0,102));
				Ide.setForeground(new Color(0,0,102));
				HName.setForeground(new Color(0,0,102));
				cause.setForeground(new Color(0,0,102));
				certi.setForeground(new Color(0,0,102));
				place.setForeground(new Color(0,0,102));
				reli.setForeground(new Color(0,0,102));
				add.setForeground(new Color(0,0,102));
				pincode.setForeground(new Color(0,0,102));
				state.setForeground(new Color(0,0,102));
				
				Name.setBounds(20,20,200,30);
				Name_t.setBounds(270,20,200,30);
				
				gender.setBounds(500,20,200,30);
				gender_t.setBounds(750,20,80,30);
				
				dod.setBounds(20,70,200,35);
				dod_t.setBounds(270,70,200,30);
				
				Ide.setBounds(500,70,200,30);
				Ide_t.setBounds(750,70,200,30);
				
				HName.setBounds(20,120,200,40);
				HName_t.setBounds(270,120,200,30);
				
				cause.setBounds(500,120,200,30);
				cause_t.setBounds(750,120,200,30);
				
				certi.setBounds(20,170,200,35);
				certi_t.setBounds(270,170,200,30);
				
				place.setBounds(500,170,200,35);
				place_t.setBounds(750,170,200,30);
				
		
				reli.setBounds(20,220,200,35);
				reli_t.setBounds(270,220,200,30);
				
				mb.setBounds(500,220,200,30);
				mb_t.setBounds(750,220,200,30);
				
				add.setBounds(20,270,200,30);
				add_t.setBounds(270,250,200,80);
				
				email.setBounds(500,270,200,30);
				email_t.setBounds(750,270,200,30);
				
				dis.setBounds(20,320,200,30);
				dis_t.setBounds(270,320,200,30);
				
				tp.setBounds(500,320,200,30);
				tp_t.setBounds(750,320,200,30);
				
				pincode.setBounds(20,370,200,30);
				pincode_t.setBounds(270,370,200,30);
				
				state.setBounds(500,370,200,30);
				state_t.setBounds(750,370,200,30);
				
		        back = new JButton("Back");
				
				back.setBackground(new Color(0,0,102));
				back.setForeground(Color.white);
				back.setFont(new Font("SANS-SERIF",Font.BOLD,15));
				back.setBounds(250,430,100,40);
				back.setOpaque(true);
				
				back.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						MASTER.SBreg.setVisible(false);
						MASTER.Dreg.setVisible(true);
						
					}
				});
				
				approve = new JButton("Approve");
				
				approve.setBackground(new Color(0,102,51));
				approve.setForeground(Color.white);
				approve.setFont(new Font("SANS-SERIF",Font.BOLD,15));
				approve.setBounds(400,430,100,40);
				approve.setOpaque(true);
				
             approve.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						JOptionPane.showMessageDialog(MASTER.co, "APPROVE DEATH APPLICATION");
						
						try {
							
						
				    		Connection conn = getConn.getConnection();
				    		Statement stmt = conn.createStatement();
				    		
				    		String query =  "insert into approvDeath values('"+a+"','"+b+"',"+c+",'"+d+"','"+ew+"','"+fo+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"','"+l+"','"+m+"','"+n+"',"+o+",'"+p+"')";
				    		stmt.executeUpdate(query);	
				    		
				    		//System.out.println("APPROV BIRTH INSERT");
				    		
				    		String query1 = "DELETE FROM tempDeath WHERE NAME=?";
							
							PreparedStatement pstmt = conn.prepareStatement(query1);
							pstmt.setString(1, g);
							
							pstmt.executeUpdate();
							
							//System.out.println("DELETE TEMP BIRTH APPROV");
							
							conn.setAutoCommit(true);
							
							final String username = "19tucs118@skct.edu.in";
							final String password = "Bd19122001";

					                final String from = "19tucs118@skct.edu.in";
					                final String to = d;

							Properties props = new Properties();

							props.put("mail.smtp.host", "smtp.gmail.com");
							props.put("mail.smtp.socketFactory.port", "465");
							props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
							props.put("mail.smtp.auth", "true");
							props.put("mail.smtp.port", "465");



					                
					                Authenticator a =new Authenticator() {

					                    @Override
					                    protected PasswordAuthentication getPasswordAuthentication() {
					                        
					                        return new PasswordAuthentication(username, password);
					                        
					                    }
					                    
					                };

					                Session session = Session.getInstance(props, a);

							try {

								Message message = new MimeMessage(session);

								message.setFrom(new InternetAddress(from));

								message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to));
								message.setSubject("DEATH CERTIFICATION APPLICATION");
								message.setText("YOUR DEATH REGISTRATION APPLIED FOR "+g+" HAS BEEN APPROVED");

								Transport.send(message);

								System.out.println("Done");

							} catch (MessagingException e4) {
								System.out.println(e4);
							}
							
				    		
						}
						catch(Exception e1) {
							System.out.println("APRROV DEATH "+e1);
						}
					}
				});
				
				
				reject = new JButton("Reject");
				
				reject.setBackground(new Color(152,0,0));
				reject.setForeground(Color.white);
				reject.setFont(new Font("SANS-SERIF",Font.BOLD,15));
				reject.setBounds(550,430,100,40);
				reject.setOpaque(true);
				
				
               reject.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						JOptionPane.showMessageDialog(MASTER.co, "REJECT DEATH APPLICATION");
						
                         try {
							
				    		Connection conn = getConn.getConnection();
				    		Statement stmt = conn.createStatement();
				    		
				    		String query =  "insert into rejecDeath values('"+a+"','"+b+"',"+c+",'"+d+"','"+ew+"','"+fo+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"','"+l+"','"+m+"','"+n+"',"+o+",'"+p+"')";
				    		stmt.executeUpdate(query);	
				    		
				    		//System.out.println("REJEC BIRTH INSERT");
				    		
				    		String query1 = "DELETE FROM tempdeath WHERE NAME=?";
							
							PreparedStatement pstmt = conn.prepareStatement(query1);
							pstmt.setString(1, g);
							pstmt.executeUpdate();
							
							//System.out.println("DELETE TEMP BIRTH REJEC");
							
							conn.setAutoCommit(true);
							
							final String username = "19tucs118@skct.edu.in";
							final String password = "Bd19122001";

					                final String from = "19tucs118@skct.edu.in";
					                final String to = d;

							Properties props = new Properties();

							props.put("mail.smtp.host", "smtp.gmail.com");
							props.put("mail.smtp.socketFactory.port", "465");
							props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
							props.put("mail.smtp.auth", "true");
							props.put("mail.smtp.port", "465");



					                
					                Authenticator a =new Authenticator() {

					                    @Override
					                    protected PasswordAuthentication getPasswordAuthentication() {
					                        
					                        return new PasswordAuthentication(username, password);
					                        
					                    }
					                    
					                };

					                Session session = Session.getInstance(props, a);

							try {

								Message message = new MimeMessage(session);

								message.setFrom(new InternetAddress(from));

								message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to));
								message.setSubject("DEATH CERTIFICATION APPLICATION");
								message.setText("YOUR DEATH CERTIFICATE REGISTRATION APPLIED FOR "+g+" HAS BEEN REJECTED");

								Transport.send(message);

								System.out.println("Done");

							} catch (MessagingException e4) {
								System.out.println(e4);
							}
						
				    		
						}
						catch(Exception e1) {
							System.out.println("REJEC DEATH "+e1);
						}
						
					}
				});
				
				
				dis.setFont(f);
				tp.setFont(f);
				mb.setFont(f);
				email.setFont(f);
				dod.setFont(f);
				gender.setFont(f);
				Name.setFont(f);
				Ide.setFont(f);
				HName.setFont(f);
				cause.setFont(f);
				certi.setFont(f);
				place.setFont(f);
				reli.setFont(f);
				add.setFont(f);
				pincode.setFont(f);
				state.setFont(f);
				
				dis_t.setFont(f);
				tp_t.setFont(f);
				mb_t.setFont(f);
				email_t.setFont(f);
				dod_t.setFont(f);
				gender_t.setFont(f);
				Name_t.setFont(f);
				Ide_t.setFont(f);
				HName_t.setFont(f);
				cause_t.setFont(f);
				certi_t.setFont(f);
				place_t.setFont(f);
				reli_t.setFont(f);
				add_t.setFont(f);
				pincode_t.setFont(f);
				state_t.setFont(f);
				
				
				  dum.add(dis);
				  dum.add(tp);
				  dum.add(mb);
				  dum.add(email);
				  dum.add(dod);
				  dum.add(gender);
				  dum.add(Name);
				  dum.add(Ide);
				  dum.add(HName);
				  dum.add(cause);
				  dum.add(place);
				  dum.add(certi);
				  dum.add(reli);
				  dum.add(add);
				  dum.add(pincode);
				  dum.add(state);
				  
				  dum.add(dis_t);
				  dum.add(tp_t);
				  dum.add(mb_t);
				  dum.add(email_t);
				  dum.add(dod_t);
				  dum.add(gender_t);
				  dum.add(Name_t);
				  dum.add(Ide_t);
				  dum.add(HName_t);
				  dum.add(cause_t);
				  dum.add(place_t);
				  dum.add(certi_t);
				  dum.add(reli_t);
				  dum.add(add_t);
				  dum.add(pincode_t);
				  dum.add(state_t);
				  
				  dum.add(back);
				  dum.add(approve);
				  dum.add(reject);
				  
				  
				
				    dum.setLayout(null);
					dum.setBounds(100,50,1000,500);
					dum.setBackground(Color.white);
				    dum.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
					
					jp = new JPanel();
					
					jp.add(dum);
				    jp.setLayout(null);
					jp.setBounds(0,30,1150,600);
					jp.setBackground(Color.white);
					
					panel = new JPanel();		
					panel.add(jp);
					jp.add(title);
			        panel.setPreferredSize(new Dimension(200,700));
					panel.setLayout(null);
					panel.setVisible(true);
					panel.setBackground(Color.white);
					
					sp = new JScrollPane(panel);
					sp.setVisible(true);
					sp.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1, false));
					sp.setBounds(180,180,1350,650);
					
					co.add(sp,BorderLayout.CENTER);
					
						
					MASTER.details(sp);
			}
		};
		
		dis = new JLabel("<HTML> DISTRICT</HTML>");
		tp = new JLabel("<HTML> TOWN PANCHAYAT</HTML>");
		mb = new JLabel("<HTML> MOBILE NUMBER");
		email = new JLabel("<HTML> EMAIL</HTML>");
		dod = new JLabel("<HTML> DATE OF DEATH (DD/MM/YYYY)</HTML>");
		gender = new JLabel("<HTML> GENDER</HTML>");
		Name = new JLabel("<HTML>NAME</HTML>");
		Ide = new JLabel("<HTML> IDENTIFICATION</HTML>");
		HName = new JLabel("<HTML> HUSBAND OR FATHER'S NAME</HTML>");
		cause = new JLabel("<HTML> CAUSE OF DEATH</HTML>");
		certi = new JLabel("<HTML> WAS DEATH MEDICALLY CERTIFIED ?</HTML>");
		place = new JLabel("<HTML> PLACE O DEATH</HTML>");
		reli = new JLabel("<HTML> RELIGION</HTML>");
		add = new JLabel("<HTML> PERMANANT ADDRESS</HTML>");
		pincode = new JLabel("<HTML> PINCODE</HTML>");
		state = new JLabel("<HTML> STATE</HTML>");
		
		try {
            Connection conn = getConn.getConnection();
			
			String query = "SELECT * FROM TEMPDEATH WHERE NAME = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(query);
	     	pstmt.setString(1, s);
			ResultSet rst = pstmt.executeQuery();
			
			
			while(rst.next()) {
				
				
				a = rst.getString("DISTRICT");
				b = rst.getString("TOWN_PANCHAYAT");
				
				dis_t = new JLabel(rst.getString("DISTRICT"));
				tp_t = new JLabel(rst.getString("TOWN_PANCHAYAT"));
				
				long aa = rst.getLong("MOBILE_NUMBER");
				c = aa;
				mb_t = new JLabel(Long.toString(aa));
				
				email_t = new JLabel(rst.getString("EMAIL"));
				d = rst.getString("EMAIL");
				
				dod_t = new JLabel(rst.getString("DATE_OF_DEATH"));
				ew = rst.getString("DATE_OF_DEATH");
				
				gender_t = new JLabel(rst.getString("GENDER"));
				fo = rst.getString("GENDER");
				
				Name_t = new JLabel(rst.getString("NAME"));
				g = rst.getString("NAME");
				
				Ide_t = new JLabel(rst.getString("IDENTIFICATION"));
				h = rst.getString("IDENTIFICATION");
				
				HName_t = new JLabel(rst.getString("HORF_NAME"));
				i = rst.getString("HORF_NAME");
				
				cause_t = new JLabel(rst.getString("CAUSE_OF_DEATH"));
				j = rst.getString("CAUSE_OF_DEATH");
				
				certi_t = new JLabel(rst.getString("CERTIFIED"));
				k = rst.getString("CERTIFIED");
				
				place_t = new JLabel(rst.getString("PLACE_OF_DEATH"));
				l = rst.getString("PLACE_OF_DEATH");
				
				reli_t = new JLabel(rst.getString("RELIGION"));
				m = rst.getString("RELIGION");
				
				add_t = new JLabel("<HTML>"+rst.getString("ADDRESS")+"</HTML>");
				n = rst.getString("ADDRESS");
				
				long bb = rst.getLong("MOBILE_NUMBER");
				o = bb;
				pincode_t = new JLabel(Long.toString(bb));
								
				state_t = new JLabel(rst.getString("STATE"));
				p = rst.getString("STATE");
				
				th.start();
			}
			
		}
		catch(Exception e) {
			System.out.println("ShowDeath"+e);
		}
		
		
			
		
			
			
//			setSize(2000,2000);
//			setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new ShowDeathDetails("YAROOOO");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
