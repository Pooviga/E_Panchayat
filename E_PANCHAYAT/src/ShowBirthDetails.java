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

public class ShowBirthDetails extends JFrame{
	
	JPanel jp,panel,dum;
	JScrollPane sp;
	Container co;
	
	JLabel title,dis,tp,mb,email,dob,gender,cName,Ide,fName,mName,fAge,mAge,fOcc,mOcc,cWei,metDeli,reli,add,pincode,state;
	JLabel dis_t,tp_t,mb_t,email_t,dob_t,gender_t,cName_t,Ide_t,fName_t,mName_t,fAge_t,mAge_t,fOcc_t,mOcc_t,cWei_t,metDeli_t,reli_t,add_t,pincode_t,state_t;
	
	String a="", b="", d="", ew="", fo="", g="", h="", i="", j="", m="", n="", p="", q="", r="", t="";
	long so,c;
	int o,k,l;
	
	JButton approve,reject,back;
	
	public ShowBirthDetails(String s) {
		
		setTitle("SHOW BIRTH DETAILS");
		
		Font f = new Font(Font.SANS_SERIF,Font.PLAIN,15);
		
		title = new JLabel("BIRTH DETAILS - "+s);
		
		title.setForeground(new Color(0,0,102));
		title.setFont(new Font("SANS-SERIF",Font.BOLD,20));
		title.setBounds(30,0,500,30);
		
		co = getContentPane();
		co.setLayout(null);
		
		Thread rt = new Thread() {
			public void run() {
				dis.setForeground(new Color(0,0,102));
				tp.setForeground(new Color(0,0,102));
				mb.setForeground(new Color(0,0,102));
				email.setForeground(new Color(0,0,102));
				dob.setForeground(new Color(0,0,102));
				gender.setForeground(new Color(0,0,102));
				cName.setForeground(new Color(0,0,102));
				Ide.setForeground(new Color(0,0,102));
				cWei.setForeground(new Color(0,0,102));
				metDeli.setForeground(new Color(0,0,102));
				fName.setForeground(new Color(0,0,102));
				mName.setForeground(new Color(0,0,102));
				fAge.setForeground(new Color(0,0,102));
				mAge.setForeground(new Color(0,0,102));
				fOcc.setForeground(new Color(0,0,102));
				mOcc.setForeground(new Color(0,0,102));
				reli.setForeground(new Color(0,0,102));
				add.setForeground(new Color(0,0,102));
				pincode.setForeground(new Color(0,0,102));
				state.setForeground(new Color(0,0,102));
				
				cName.setBounds(20,20,200,30);
				cName_t.setBounds(270,20,200,30);
				
				gender.setBounds(500,20,200,30);
				gender_t.setBounds(750,20,80,30);
				
				dob.setBounds(20,70,200,35);
				dob_t.setBounds(270,70,200,30);
				
				Ide.setBounds(500,70,200,30);
				Ide_t.setBounds(750,70,200,30);
				
				fName.setBounds(20,120,200,30);
				fName_t.setBounds(270,120,200,30);
				
				mName.setBounds(500,120,200,30);
				mName_t.setBounds(750,120,200,30);
				
				fAge.setBounds(20,170,200,35);
				fAge_t.setBounds(270,170,200,30);
				
				mAge.setBounds(500,170,200,35);
				mAge_t.setBounds(750,170,200,30);
				
				fOcc.setBounds(20,220,200,30);
				fOcc_t.setBounds(270,220,200,30);

				mOcc.setBounds(500,220,200,30);
				mOcc_t.setBounds(750,220,200,30);
				
				cWei.setBounds(20,270,200,30);
				cWei_t.setBounds(270,270,200,30);
				
				metDeli.setBounds(500,270,200,30);
				metDeli_t.setBounds(750,270,200,30);
				
				reli.setBounds(20,320,200,35);
				reli_t.setBounds(270,320,200,30);
				
				mb.setBounds(500,320,200,30);
				mb_t.setBounds(750,320,200,30);
				
				add.setBounds(20,370,200,30);
				add_t.setBounds(270,350,200,80);
				
				email.setBounds(500,370,200,30);
				email_t.setBounds(750,370,200,30);
				
				dis.setBounds(20,420,200,30);
				dis_t.setBounds(270,420,200,30);
				
				tp.setBounds(500,420,200,30);
				tp_t.setBounds(750,420,200,30);
				
				pincode.setBounds(20,470,200,30);
				pincode_t.setBounds(270,470,200,30);
				
				state.setBounds(500,470,200,30);
				state_t.setBounds(750,470,200,30);
				
		        back = new JButton("Back");
				
				back.setBackground(new Color(0,0,102));
				back.setForeground(Color.white);
				back.setFont(new Font("SANS-SERIF",Font.BOLD,15));
				back.setBounds(250,530,100,40);
				back.setOpaque(true);
				
				back.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						MASTER.SBreg.setVisible(false);
						MASTER.Breg.setVisible(true);
						
					}
				});
				
				approve = new JButton("Approve");
				
				approve.setBackground(new Color(0,102,51));
				approve.setForeground(Color.white);
				approve.setFont(new Font("SANS-SERIF",Font.BOLD,15));
				approve.setBounds(400,530,100,40);
				approve.setOpaque(true);
				
				approve.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						JOptionPane.showMessageDialog(MASTER.co, "APPROVE BIRTH APPLICATION");
						
						try {
							
						
				    		Connection conn = getConn.getConnection();
				    		Statement stmt = conn.createStatement();
				    		
				    		String query = "insert into approvBirth values('"+a+"','"+b+"',"+c+",'"+d+"','"+ew+"','"+fo+"','"+g+"','"+h+"','"+i+"','"+j+"',"+k+","+l+",'"+m+"','"+n+"',"+o+",'"+p+"','"+q+"','"+r+"',"+so+",'"+t+"')";
				    		stmt.executeUpdate(query);	
				    		
				    		//System.out.println("APPROV BIRTH INSERT");
				    		
				    		String query1 = "DELETE FROM tempbirth WHERE CHILD_NAME=?";
							
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
								message.setSubject("BIRTH CERTIFICATION APPLICATION");
								message.setText("YOUR BIRTH CERTIFICATE REGISTRATION APPLIED FOR "+g+" HAS BEEN APPROVED");

								Transport.send(message);

								System.out.println("Done");

							} catch (MessagingException e4) {
								System.out.println(e4);
							}
							
				    		
						}
						catch(Exception e1) {
							System.out.println("APRROV BIRTH "+e1);
						}
					}
				});
				
				
				reject = new JButton("Reject");
				
				reject.setBackground(new Color(152,0,0));
				reject.setForeground(Color.white);
				reject.setFont(new Font("SANS-SERIF",Font.BOLD,15));
				reject.setBounds(550,530,100,40);
				reject.setOpaque(true);
				
				
				reject.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						JOptionPane.showMessageDialog(MASTER.co, "REJECT BIRTH APPLICATION");
						
                         try {
							
				    		Connection conn = getConn.getConnection();
				    		Statement stmt = conn.createStatement();
				    		
				    		String query = "insert into rejecBirth values('"+a+"','"+b+"',"+c+",'"+d+"','"+ew+"','"+fo+"','"+g+"','"+h+"','"+i+"','"+j+"',"+k+","+l+",'"+m+"','"+n+"',"+o+",'"+p+"','"+q+"','"+r+"',"+so+",'"+t+"')";
				    		stmt.executeUpdate(query);	
				    		
				    		//System.out.println("REJEC BIRTH INSERT");
				    		
				    		String query1 = "DELETE FROM tempbirth WHERE CHILD_NAME=?";
							
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
								message.setSubject("BIRTH CERTIFICATION APPLICATION");
								message.setText("YOUR BIRTH CERTIFICATE REGISTRATION APPLIED FOR "+g+" HAS BEEN REJECTED");

								Transport.send(message);

								System.out.println("Done");

							} catch (MessagingException e4) {
								System.out.println(e4);
							}
						
							MASTER.SBreg.setVisible(false);
							MASTER.Breg.setVisible(true);
				    		
						}
						catch(Exception e1) {
							System.out.println("REJEC BIRTH "+e1);
						}
						
					}
				});
				
				
				dis.setFont(f);
				tp.setFont(f);
				mb.setFont(f);
				email.setFont(f);
				dob.setFont(f);
				gender.setFont(f);
				cName.setFont(f);
				Ide.setFont(f);
				cWei.setFont(f);
				metDeli.setFont(f);
				fName.setFont(f);
				mName.setFont(f);
				fAge.setFont(f);
				mAge.setFont(f);
				fOcc.setFont(f);
				mOcc.setFont(f);
				reli.setFont(f);
				add.setFont(f);
				pincode.setFont(f);
				state.setFont(f);
				
				dis_t.setFont(f);
				tp_t.setFont(f);
				mb_t.setFont(f);
				email_t.setFont(f);
				dob_t.setFont(f);
				gender_t.setFont(f);
				cName_t.setFont(f);
				Ide_t.setFont(f);
				cWei_t.setFont(f);
				metDeli_t.setFont(f);
				fName_t.setFont(f);
				mName_t.setFont(f);
				fAge_t.setFont(f);
				mAge_t.setFont(f);
				fOcc_t.setFont(f);
				mOcc_t.setFont(f);
				reli_t.setFont(f);
				add_t.setFont(f);
				pincode_t.setFont(f);
				state_t.setFont(f);
				
				
				  dum.add(dis);
				  dum.add(tp);
				  dum.add(mb);
				  dum.add(email);
				  dum.add(dob);
				  dum.add(gender);
				  dum.add(cName);
				  dum.add(Ide);
				  dum.add(cWei);
				  dum.add(metDeli);
				  dum.add(fName);
				  dum.add(mName);
				  dum.add(fAge);
				  dum.add(mAge);
				  dum.add(fOcc);
				  dum.add(mOcc);
				  dum.add(reli);
				  dum.add(add);
				  dum.add(pincode);
				  dum.add(state);
				  
				  dum.add(dis_t);
				  dum.add(tp_t);
				  dum.add(mb_t);
				  dum.add(email_t);
				  dum.add(dob_t);
				  dum.add(gender_t);
				  dum.add(cName_t);
				  dum.add(Ide_t);
				  dum.add(cWei_t);
				  dum.add(metDeli_t);
				  dum.add(fName_t);
				  dum.add(mName_t);
				  dum.add(fAge_t);
				  dum.add(mAge_t);
				  dum.add(fOcc_t);
				  dum.add(mOcc_t);
				  dum.add(reli_t);
				  dum.add(add_t);
				  dum.add(pincode_t);
				  dum.add(state_t);
				  
				  dum.add(back);
				  dum.add(approve);
				  dum.add(reject);
				  
				  
				
				    dum.setLayout(null);
					dum.setBounds(100,50,1000,600);
					dum.setBackground(Color.white);
				    dum.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
					
					jp = new JPanel();
					
					jp.add(dum);
				    jp.setLayout(null);
					jp.setBounds(0,50,1150,700);
					jp.setBackground(Color.white);
					
					panel = new JPanel();		
					panel.add(jp);
					jp.add(title);
			        panel.setPreferredSize(new Dimension(200,800));
					panel.setLayout(null);
					panel.setVisible(true);
					panel.setBackground(Color.white);
					
					sp = new JScrollPane(panel);
					sp.setVisible(true);
					sp.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1, false));
					sp.setBounds(180,180,1350,700);
					
					co.add(sp,BorderLayout.CENTER);
					MASTER.details(sp);
			}
		};
		
		dum = new JPanel();
		
		dis = new JLabel("<HTML> DISTRICT</HTML>");
		tp = new JLabel("<HTML> TOWN PANCHAYAT</HTML>");
		mb = new JLabel("<HTML> MOBILE NUMBER");
		email = new JLabel("<HTML> EMAIL</HTML>");
		dob = new JLabel("<HTML> DATE OF BIRTH (DD/MM/YYYY)</HTML>");
		gender = new JLabel("<HTML> GENDER</HTML>");
		cName = new JLabel("<HTML> CHILD NAME</HTML>");
		Ide = new JLabel("<HTML> IDENTIFICATION</HTML>");
		cWei = new JLabel("<HTML> CHILD'S WEIGHT [Kgs.]</HTML>");
		metDeli = new JLabel("<HTML> METHOD OF DELIVERY</HTML>");
		fName = new JLabel("<HTML> FATHER'S NAME</HTML>");
		mName = new JLabel("<HTML> MOTHER'S NAME</HTML>");
		fAge = new JLabel("<HTML> AGE OF FATHER [Yrs.]</HTML>");
		mAge = new JLabel("<HTML> AGE OF MOTHER [Yrs.]</HTML>");
		fOcc = new JLabel("<HTML> FATHER'S OCCUPATION</HTML>");
		mOcc = new JLabel("<HTML>  MOTHER'S OCCUPATION</HTML>");
		reli = new JLabel("<HTML> RELIGION</HTML>");
		add = new JLabel("<HTML> PERMANANT ADDRESS</HTML>");
		pincode = new JLabel("<HTML> PINCODE</HTML>");
		state = new JLabel("<HTML> STATE</HTML>");
		
		try {
            Connection conn = getConn.getConnection();
			
			String query = "SELECT * FROM TEMPBIRTH WHERE CHILD_NAME = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(query);
	     	pstmt.setString(1, s);
			ResultSet rst = pstmt.executeQuery();
			
			while(rst.next()) {
				a = rst.getString("DISTRICT");
				dis_t = new JLabel(rst.getString("DISTRICT"));
				
				b = rst.getString("TOWN_PANCHAYAT");
				tp_t = new JLabel(rst.getString("TOWN_PANCHAYAT"));
				
				long aa = rst.getLong("MOBILE_NUMBER");
				c = aa;
				mb_t = new JLabel(Long.toString(aa));
				
				email_t = new JLabel(rst.getString("EMAIL"));
				d = rst.getString("EMAIL");
				
				dob_t = new JLabel(rst.getString("DATE_OF_BIRTH"));
				ew = rst.getString("DATE_OF_BIRTH");
						
				gender_t = new JLabel(rst.getString("GENDER"));
				fo = rst.getString("GENDER");
						
				cName_t = new JLabel(rst.getString("CHILD_NAME"));
				g = rst.getString("CHILD_NAME");
				
				Ide_t = new JLabel(rst.getString("IDENTIFICATION"));
				h = rst.getString("IDENTIFICATION");
				
				int bb = rst.getInt("CHILD_WEIGHT");
				cWei_t = new JLabel(Integer.toString(bb));
				o = bb;
				
				metDeli_t = new JLabel(rst.getString("METHOD_OF_DELIVERY"));
				p = rst.getString("METHOD_OF_DELIVERY");
				
				fName_t = new JLabel(rst.getString("FATHER_NAME"));
				i = rst.getString("FATHER_NAME");
				
				mName_t = new JLabel(rst.getString("MOTHER_NAME"));
				j = rst.getString("MOTHER_NAME");
				
				int cc = rst.getInt("AGE_OF_FATHER");
				fAge_t = new JLabel(Integer.toString(cc));
				k = cc;
				
				int dd = rst.getInt("AGE_OF_MOTHER");
				mAge_t = new JLabel(Integer.toString(dd));
				l = dd;
				
				fOcc_t = new JLabel(rst.getString("FATHER_OCCUPATION"));
				m = rst.getString("FATHER_OCCUPATION");
				
				mOcc_t = new JLabel(rst.getString("MOTHER_OCCUPATION"));
				n = (rst.getString("MOTHER_OCCUPATION"));
				
				reli_t = new JLabel(rst.getString("RELIGION"));
				q = rst.getString("RELIGION");
				
				add_t = new JLabel("<HTML>"+rst.getString("ADDRESS")+"</HTML>");
				r = rst.getString("ADDRESS");
				
				long ee = rst.getLong("PINCODE");
				pincode_t = new JLabel(Long.toString(ee));
				so = ee;
				
				state_t = new JLabel(rst.getString("STATE"));
				t = rst.getString("STATE");
				
				//System.out.println("rst"+a+" "+t);
				
				rt.start();
				
			}	
				
					
					
					
			
		}
		catch(Exception ex) {
			System.out.println("ShowBirth"+ex);
		}
		
		
			
		
			
			
//			setSize(2000,2000);
//			setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new ShowBirthDetails("MAHALAKSHMI A");
	}

}
