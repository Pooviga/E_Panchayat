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

public class ShowConnDetails extends JFrame implements Runnable{
	
	JPanel jp,panel,dum;
	JScrollPane sp;
	Container co;
	
	JLabel title,dis,tp,mb,email,hname,dno,wno,stname,ctype,pincode,state;
	JLabel dis_t,tp_t,mb_t,email_t,hname_t,dno_t,wno_t,stname_t,ctype_t,pincode_t,state_t;
	
	JButton approve,reject,back;
	
	String a="", b="", d="", ew="", fo="", h="", i="", k="";
	long j;
	int g;
	long c;
	String l = "NOT PAID";
	
	
	public ShowConnDetails(String s) {
		
		setTitle("SHOW NEW WATER CONNECTION REGISTRATION DETAILS");
		
		Font f = new Font(Font.SANS_SERIF,Font.PLAIN,15);
		
		title = new JLabel("NEW WATER CONNECTION REQUEST FROM - "+s);
		
		title.setForeground(new Color(0,0,102));
		title.setFont(new Font("SANS-SERIF",Font.BOLD,20));
		title.setBounds(30,0,900,30);
		
		co = getContentPane();
		co.setLayout(null);
		
		dum = new JPanel();
		
		Thread th = new Thread() {
			public void run() {
				dis.setForeground(new Color(0,0,102));
				tp.setForeground(new Color(0,0,102));
				mb.setForeground(new Color(0,0,102));
				email.setForeground(new Color(0,0,102));
			    hname.setForeground(new Color(0,0,102));
			    dno.setForeground(new Color(0,0,102));
			    wno.setForeground(new Color(0,0,102));
			    stname.setForeground(new Color(0,0,102));
			    ctype.setForeground(new Color(0,0,102));
				pincode.setForeground(new Color(0,0,102));
				state.setForeground(new Color(0,0,102));
				
				hname.setBounds(20,20,200,30);
				hname_t.setBounds(270,20,200,30);
				
				ctype.setBounds(500,20,200,30);
				ctype_t.setBounds(750,20,200,30);
				
				mb.setBounds(20,70,200,35);
				mb_t.setBounds(270,70,200,30);
				
				email.setBounds(500,70,200,30);
				email_t.setBounds(750,70,200,30);
				
				dno.setBounds(20,120,200,30);
				dno_t.setBounds(270,120,200,30);
				
				wno.setBounds(500,120,200,30);
				wno_t.setBounds(750,120,200,30);
				
				stname.setBounds(20,170,200,35);
				stname_t.setBounds(270,170,200,30);
				
				tp.setBounds(500,170,200,35);
				tp_t.setBounds(750,170,200,30);
				
		
				dis.setBounds(20,220,200,35);
				dis_t.setBounds(270,220,200,30);
				
				pincode.setBounds(500,220,200,30);
				pincode_t.setBounds(750,220,200,30);
				
				state.setBounds(20,270,200,30);
				state_t.setBounds(270,270,200,30);
				
				
		        back = new JButton("Back");
				
				back.setBackground(new Color(0,0,102));
				back.setForeground(Color.white);
				back.setFont(new Font("SANS-SERIF",Font.BOLD,15));
				back.setBounds(250,330,100,40);
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
				approve.setBounds(400,330,100,40);
				approve.setOpaque(true);
				

	             approve.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							JOptionPane.showMessageDialog(MASTER.co, "APPROVE BIRTH APPLICATION");
							
							try {
								
					    		Connection conn = getConn.getConnection();
					    		Statement stmt = conn.createStatement();
					    		String query =  "insert into approvWaterConn values('"+a+"','"+b+"',"+c+",'"+d+"','"+ew+"','"+fo+"',"+g+",'"+h+"','"+i+"',"+j+",'"+k+"')";
					    		stmt.executeUpdate(query);	
					    		Statement stmt1 = conn.createStatement();
					    		String query1 = "insert into paystatus values("+c+",'"+l+"')";
					    		stmt1.executeUpdate(query1);
					    		//System.out.println("APPROV BIRTH INSERT");
					    		
					    		String query2 = "DELETE FROM tempWaterConn WHERE HOUSEHEAD_NAME=?";
								
								PreparedStatement pstmt = conn.prepareStatement(query2);
								pstmt.setString(1, ew);
								System.out.println("1");
								
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
									message.setSubject("NEW WATER CONNECTION APPLICATION");
									message.setText(ew+" YOUR APPLICATION REQUEST FOR NEW WATER CONNECTION HAS BEEN APPROVED");

									Transport.send(message);

									System.out.println("Done");

								} catch (MessagingException e4) {
									System.out.println(e4);
								}
					    		
							}
							catch(Exception e1) {
								System.out.println("APRROV WATER "+e1);
							}
						}
					});
					
					
				
				
				reject = new JButton("Reject");
				
				reject.setBackground(new Color(152,0,0));
				reject.setForeground(Color.white);
				reject.setFont(new Font("SANS-SERIF",Font.BOLD,15));
				reject.setBounds(550,330,100,40);
				reject.setOpaque(true);
				

	               reject.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							JOptionPane.showMessageDialog(MASTER.co, "REJECT DEATH APPLICATION");
							
	                         try {
								
					    		Connection conn = getConn.getConnection();
					    		Statement stmt = conn.createStatement();
					    		
					    		String query =  "insert into rejecWaterConn values('"+a+"','"+b+"',"+c+",'"+d+"','"+ew+"','"+fo+"',"+g+",'"+h+"','"+i+"',"+j+",'"+k+"')";
					    		stmt.executeUpdate(query);	
					    		
					    		//System.out.println("REJEC BIRTH INSERT");
					    		
					    		String query1 = "DELETE FROM tempWaterConn WHERE HOUSEHEAD_NAME=?";
								
								PreparedStatement pstmt = conn.prepareStatement(query1);
								pstmt.setString(1, ew);
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
									message.setSubject("NEW WATER CONNECTION APPLICATION");
									message.setText(ew+" YOUR APPLICATION REQUEST FOR NEW WATER CONNECTION HAS BEEN REJECTED");

									Transport.send(message);

									System.out.println("Done");

								} catch (MessagingException e4) {
									System.out.println(e4);
								}
							
					    		
							}
							catch(Exception e1) {
								System.out.println("REJEC CONN "+e1);
							}
							
						}
					});
					
					
				
				
				dis.setFont(f);
				tp.setFont(f);
				mb.setFont(f);
				email.setFont(f);
				hname.setFont(f);
				dno.setFont(f);
				wno.setFont(f);
				stname.setFont(f);
				ctype.setFont(f);
				pincode.setFont(f);
				state.setFont(f);
				
				dis_t.setFont(f);
				tp_t.setFont(f);
				mb_t.setFont(f);
				email_t.setFont(f);
				hname_t.setFont(f);
				dno_t.setFont(f);
				wno_t.setFont(f);
				stname_t.setFont(f);
				ctype_t.setFont(f);
				pincode_t.setFont(f);
				state_t.setFont(f);
				
				
				  dum.add(dis);
				  dum.add(tp);
				  dum.add(mb);
				  dum.add(email);
				  dum.add(hname);
				  dum.add(dno);
				  dum.add(wno);
				  dum.add(stname);
				  dum.add(ctype);
				  dum.add(pincode);
				  dum.add(state);
				  
				  dum.add(dis_t);
				  dum.add(tp_t);
				  dum.add(mb_t);
				  dum.add(email_t);
				  dum.add(hname_t);
				  dum.add(dno_t);
				  dum.add(wno_t);
				  dum.add(stname_t);
				  dum.add(ctype_t);
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
		hname = new JLabel("<HTML> HOUSE HEAD NAME</HTML>");
		dno = new JLabel("<HTML> DOOR NO.</HTML>");
		wno = new JLabel("<HTML> WARD NO.</HTML>");
		stname = new JLabel("<HTML> STREET NAME</HTML>");
		ctype = new JLabel("<HTML> CONNECTION TYPE</HTML>");
		pincode = new JLabel("<HTML> PINCODE</HTML>");
		state = new JLabel("<HTML> STATE</HTML>");
		
		try {
            Connection conn = getConn.getConnection();
			
			String query = "SELECT * FROM TEMPWATERCONN WHERE HOUSEHEAD_NAME = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(query);
	     	pstmt.setString(1, s);
			ResultSet rst = pstmt.executeQuery();
			
			
			
			while(rst.next()) {
				dis_t = new JLabel(rst.getString("DISTRICT"));
				a = rst.getString("DISTRICT");
				
				tp_t = new JLabel(rst.getString("TOWN_PANCHAYAT"));
				b = rst.getString("TOWN_PANCHAYAT");
				
				long aa = rst.getLong("MOBILE_NUMBER");
				c= aa;
				mb_t = new JLabel(Long.toString(aa));
				
				email_t = new JLabel(rst.getString("EMAIL"));
				d = rst.getString("EMAIL");
				
				hname_t = new JLabel(rst.getString("HOUSEHEAD_NAME"));
				ew = rst.getString("HOUSEHEAD_NAME");
				
				dno_t = new JLabel(rst.getString("DOORNO"));
				fo = rst.getString("DOORNO");
				
				int bb = rst.getInt("WARDNO");
				g= bb;
				wno_t = new JLabel(Integer.toString(bb));
				
				stname_t = new JLabel(rst.getString("STREET"));
				h = rst.getString("STREET");
				
				ctype_t = new JLabel(rst.getString("CONNECTIONTYPR"));
				i = rst.getString("CONNECTIONTYPR");
				
				long cc = rst.getLong("PINCODE");
				j = cc;
				pincode_t = new JLabel(Long.toString(cc));
				
				state_t = new JLabel(rst.getString("STATE"));
				k = rst.getString("STATE");
				
				th.start();
			}
			
		}
		catch(Exception e) {
			System.out.println("ShowConn"+e);
		}
		
		
			
		
			
			
//			setSize(2000,2000);
//			setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new ShowConnDetails("MADHUSRI");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
