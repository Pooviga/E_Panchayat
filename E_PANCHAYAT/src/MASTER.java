import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MASTER extends JFrame implements MouseListener,ActionListener,Runnable{
	
	static JLabel t1,t2,t3,t4,t5;
	static JPanel nav,img,home,sm;
	static JPanel dephm,Bcert,Dcert,watconn,track,paystatus,pay;
	static JScrollPane about,tc,contact,Bapp,Dapp,PTC;
	static JPanel Wmain,Bmain,Dmain,Pmain;
	static JScrollPane Breg,Dreg,Wreg;
	static JScrollPane Bce,Dce;
	static JScrollPane SBreg,SDreg,SWreg;
	JPanel BD,DD,WC,PT;
	JButton dpSubmit;
	static Container co;
	static String smstr = "";
	
	public MASTER() throws Exception {
		
		setTitle("E-PANCHAYAT");
		
		co = getContentPane();
		co.setLayout(null);
		
		t1 = new JLabel("HOME");
		t2 = new JLabel("ABOUT US");
		t3 = new JLabel("TERMS & CONDITIONS");
		t4 = new JLabel("SITE MAP");
		t5 = new JLabel("CONTACT US");
		
		t1.setBounds(100,10,50,30);
		t1.setFont(new Font("Sans-serif",Font.BOLD,15));
		t1.setForeground(new Color(204,0,0));
		t2.setBounds(180,10,100,30);
		t2.setFont(new Font("Sans-serif",Font.BOLD,15));
		t3.setBounds(290,10,200,30);
		t3.setFont(new Font("Sans-serif",Font.BOLD,15));
		t4.setBounds(490,10,100,30);
		t4.setFont(new Font("Sans-serif",Font.BOLD,15));
		t5.setBounds(590,10,120,30);
		t5.setFont(new Font("Sans-serif",Font.BOLD,15));
		
		t1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		t2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		t3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		t4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		t5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		nav = new JPanel();
		nav.add(t1);
		nav.add(t2);
		nav.add(t3);
		nav.add(t4);
		nav.add(t5);
		nav.setLayout(null);
		nav.setOpaque(true);
		nav.setBounds(0,125,1600,50);
		nav.setVisible(true);
		nav.setBackground(Color.white);
		nav.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
		
		img = new JPanel();
	    BufferedImage image = ImageIO.read(new File("C:\\Users\\MADHUSRI\\Desktop\\Images\\Header.jpg"));
	    JLabel label = new JLabel(new ImageIcon(image));
	    img.add(label);
	    img.setBounds(0,0,1600,150);
	    img.setBackground(Color.white);
	    
	    co.add(nav);
	    co.add(img); 
	   
	    
	    
       ////******* HOME *************************************************************************************************************////
	    
	    
	    HOME hm = new HOME();
	    home = hm.M;
	    home.setVisible(true);
	    co.add(home);
	    
	    BD = hm.Bp;
	    DD = hm.Dp;
	    PT = hm.Pp;
	    WC = hm.Wp;
	    
	    
	    BD.addMouseListener(this);
	    DD.addMouseListener(this);
	    WC.addMouseListener(this);
	    PT.addMouseListener(this);
	    
	    this.dpSubmit = hm.dpSubmit; 
	    this.dpSubmit.addActionListener(this);
	    
	    ////****** DEPTHOME *************************************************************************************************************////
	    
	    DEPTHOME dm = new DEPTHOME();
		dephm = dm.total;
		dephm.setVisible(false);
		co.add(dephm);
		
		////***** ABOUT US ***********************************************************************************************************////
	    
	    ABOUT ab = new ABOUT();
	    about = ab.sp;
	    about.setVisible(false);
	    co.add(about);
	    
	    ////**** TERMS AND CONDITIONS ***********************************************************************************************************////
	    
	    TERCON teco = new TERCON();
	    tc = teco.sp;
	    tc.setVisible(false);
	    co.add(tc);
	    
	    ////**** CONTACT US *******************************************************************************************************************////
	    
	    CONTACT con = new CONTACT();
	    contact = con.sp;
	    contact.setVisible(false);
	    co.add(contact);
	    
	    ////**** SITE MAP ********************************************************************************************************************////
	    
	    SITEMAP sima = new SITEMAP();
	    sm = sima.Main;
	    sm.setVisible(false);
	    co.add(sm);
	    
	    ////**** WATER CHARGES ******************************************************************************************************////
	    
	    WaterCharges W = new WaterCharges();
	    Wmain = W.Mas;
	    Wmain.setVisible(false);
	    co.add(Wmain);
	    
	    ////**** New Water Connection ****************************************************************************************************/////
	    
	    NewWaterConnection nw = new NewWaterConnection();
	    watconn = nw.jp;
	    watconn.setVisible(false);
	    co.add(watconn);
	    
	    ////******* Track New Water Connection ***********************************************************************************************////
	    
	    TrackWaterConnection tw = new TrackWaterConnection();
	    track = tw.Mas;
	    track.setVisible(false);
	    co.add(track);
	    
        ////******* Pay Water Charges ***********************************************************************************************////
	    
	    WaterPaymentImplem wp = new WaterPaymentImplem();
	    pay = wp.Mas;
	    pay.setVisible(false);
	    co.add(pay);
	    
	    ////******* Pay Status *************************************************************************************************************////
	    
	    WaterPayMentStatus ws  = new WaterPayMentStatus();
	    paystatus = ws.Mas;
	    paystatus.setVisible(false);
	    co.add(paystatus);
	  
	    
	    ////******* BIRTH HOME ******************************************************************************************************////
	    
	   BirthHome bh = new BirthHome();
	   Bmain = bh.Mas;
	   Bmain.setVisible(false);
	   co.add(Bmain);
	   
	   ////************ Birth Apply ***************************************************************************************************////
	   
	   BirthApply ba = new BirthApply();
	   Bapp = ba.sp;
	   Bapp.setVisible(false);
	   co.add(Bapp);
	   
	   ////************** Birth Certificate ******************************************************************************************////
	   
	   BirthCertificate bc = new BirthCertificate();
	   Bcert = bc.p2;
	   Bcert.setVisible(false);
	   co.add(Bcert);
	   
	   
      ////************ Death Apply ***************************************************************************************************////
	   
	   DeathApply da = new DeathApply();
	   Dapp = da.sp;
	   Dapp.setVisible(false);
	   co.add(Dapp);
	   
	   ////********** DEATH HOME *****************************************************************************************************////
	   
	   DeathHome dh = new DeathHome();
	   Dmain = dh.Mas;
	   Dmain.setVisible(false);
	   co.add(Dmain);
	    
      ////************** Death Certificate ******************************************************************************************////
	   
	   DeathCertificate dc = new DeathCertificate();
	   Dcert = dc.p2;
	   Dcert.setVisible(false);
	   co.add(Dcert);
	   
	   ////************** PROPERTY TAX - TAX CALCULATOR ***********************************************************************************////
	   
	   TaxCal tc = new TaxCal();
	   PTC = tc.sp;
	   PTC.setVisible(false);
	   co.add(PTC);
	   
	   ////************** BIRTH REGISTRATION DEPT *******************************************************************************************///
	   
	   BirthRegistrations bq = new BirthRegistrations();
	   Breg = BirthRegistrations.sp;
	   Breg.setVisible(false);
	   co.add(Breg);
	   
      ////************** DEATH REGISTRATION DEPT *******************************************************************************************///
	   
	   DeathRegistrations dq = new DeathRegistrations();
	   Dreg = dq.sp;
	   Dreg.setVisible(false);
	   
	   co.add(Dreg);
	   
	////************** WATER CONN REGISTRATION DEPT *******************************************************************************************///
	   
		   WatConnRegistrations wq = new WatConnRegistrations();
		   Wreg = wq.sp;
		   Wreg.setVisible(false);
		   co.add(Wreg);
	   
	  ////**************************************************************************************************************************///
	    
	    t1.addMouseListener(this);
	    t2.addMouseListener(this);
	    t3.addMouseListener(this);
	    t4.addMouseListener(this);
	    t5.addMouseListener(this);
	    
	    pack();
		setSize(2000,2000);
		setResizable(true);
		co.setBackground(Color.white);
		setVisible(true);
	}
	
	
	////******* SITE MAP CLICK METHOD ***********************************************************************************************************************////
	
	public static void sitemapClick(String str) {
    	smstr = str;
	    
	    if(!smstr.isEmpty()) {
	 		
	    	
			if(smstr.equals("<HTML><b>HOME</b></HTML>") || smstr.equals("DEPARTMENT LOGIN")) {
				t1.setForeground(new Color(204,0,0));
				t2.setForeground(Color.BLACK);
				t3.setForeground(Color.BLACK);
				t4.setForeground(Color.BLACK);
				t5.setForeground(Color.BLACK);
				

                home.setVisible(true);
				
				dephm.setVisible(false);
				
				Wmain.setVisible(false);
				watconn.setVisible(false);
				track.setVisible(false);
				paystatus.setVisible(false);
				pay.setVisible(false);		
				
				Bmain.setVisible(false);
				Bapp.setVisible(false);
				Bcert.setVisible(false);
				
				Dmain.setVisible(false);
				Dapp.setVisible(false);
				Dcert.setVisible(false);
				
				PTC.setVisible(false);
				
				about.setVisible(false);
				tc.setVisible(false);
				sm.setVisible(false);
				contact.setVisible(false);
				
				Breg.setVisible(false);
				Dreg.setVisible(false);
				Wreg.setVisible(false);
			}
			
			if(smstr.equals("<HTML><b>ABOUT US</b></HTML>")) {
				t1.setForeground(Color.BLACK);
				t2.setForeground(new Color(204,0,0));
				t3.setForeground(Color.BLACK);
				t4.setForeground(Color.BLACK);
				t5.setForeground(Color.BLACK);
				
                home.setVisible(false);
				
				dephm.setVisible(false);
				
				Wmain.setVisible(false);
				watconn.setVisible(false);
				track.setVisible(false);
				paystatus.setVisible(false);
				pay.setVisible(false);
				
				
				Bmain.setVisible(false);
				Bapp.setVisible(false);
				Bcert.setVisible(false);
				
				Dmain.setVisible(false);
				Dapp.setVisible(false);
				Dcert.setVisible(false);
				
				PTC.setVisible(false);
				
				about.setVisible(true);
				tc.setVisible(false);
				sm.setVisible(false);
				contact.setVisible(false);
				
				Breg.setVisible(false);
				Dreg.setVisible(false);
				Wreg.setVisible(false);
			}
			
			if(smstr.equals("<HTML><b>TERMS AND CONDITIONS</b></HTML>")) {
				t1.setForeground(Color.BLACK);
				t2.setForeground(Color.BLACK);
				t3.setForeground(new Color(204,0,0));
				t4.setForeground(Color.BLACK);
				t5.setForeground(Color.BLACK);
				
                home.setVisible(false);
				
				dephm.setVisible(false);
				
				Wmain.setVisible(false);
				watconn.setVisible(false);
				track.setVisible(false);
				paystatus.setVisible(false);
				pay.setVisible(false);
				
				
				Bmain.setVisible(false);
				Bapp.setVisible(false);
				Bcert.setVisible(false);
				
				Dmain.setVisible(false);
				Dapp.setVisible(false);
				Dcert.setVisible(false);
				
				PTC.setVisible(false);
				
				
				about.setVisible(false);
				tc.setVisible(true);
				sm.setVisible(false);
				contact.setVisible(false);
				
				Breg.setVisible(false);
				Dreg.setVisible(false);
				Wreg.setVisible(false);
				
			}
			
			if(smstr.equals("<HTML><b>CONTACT US</b></HTML>")) {
				t1.setForeground(Color.BLACK);
				t2.setForeground(Color.BLACK);
				t3.setForeground(Color.BLACK);
				t4.setForeground(Color.BLACK);
				t5.setForeground(new Color(204,0,0));
				

                home.setVisible(false);
				
				dephm.setVisible(false);
				
				Wmain.setVisible(false);
				watconn.setVisible(false);
				track.setVisible(false);
				paystatus.setVisible(false);
				pay.setVisible(false);
				
				
				Bmain.setVisible(false);
				Bapp.setVisible(false);
				Bcert.setVisible(false);
				
				Dmain.setVisible(false);
				Dapp.setVisible(false);
				Dcert.setVisible(false);
				
				PTC.setVisible(false);
				
				about.setVisible(false);
				tc.setVisible(false);
				sm.setVisible(false);
				contact.setVisible(true);
				
				Breg.setVisible(false);
				Dreg.setVisible(false);
				Wreg.setVisible(false);
			}
			
			
			if(smstr.equals("BIRTH DETAILS")) {
				
				t1.setForeground(new Color(204,0,0));
				t2.setForeground(Color.BLACK);
				t3.setForeground(Color.BLACK);
				t4.setForeground(Color.BLACK);
				t5.setForeground(Color.BLACK);
				

                home.setVisible(false);
				
				dephm.setVisible(false);
				
				Wmain.setVisible(false);
				watconn.setVisible(false);
				track.setVisible(false);
				paystatus.setVisible(false);
				pay.setVisible(false);
				
				
				Bmain.setVisible(true);
				Bapp.setVisible(false);
				Bcert.setVisible(false);
				
				Dmain.setVisible(false);
				Dapp.setVisible(false);
				Dcert.setVisible(false);
				
				PTC.setVisible(false);
				
				about.setVisible(false);
				tc.setVisible(false);
				sm.setVisible(false);
				contact.setVisible(false);
				
				Breg.setVisible(false);
				Dreg.setVisible(false);
				Wreg.setVisible(false);
				
				
			}
			
			if(smstr.equals("Apply Birth Registration")) {
				
				t1.setForeground(new Color(204,0,0));
				t2.setForeground(Color.BLACK);
				t3.setForeground(Color.BLACK);
				t4.setForeground(Color.BLACK);
				t5.setForeground(Color.BLACK);
				
				home.setVisible(false);
				
				dephm.setVisible(false);
				
				Wmain.setVisible(false);
				watconn.setVisible(false);
				track.setVisible(false);
				paystatus.setVisible(false);
				pay.setVisible(false);
				
				
				Bmain.setVisible(false);
				Bapp.setVisible(true);
				Bcert.setVisible(false);
				
				Dmain.setVisible(false);
				Dapp.setVisible(false);
				Dcert.setVisible(false);
				
				PTC.setVisible(false);
				
				about.setVisible(false);
				tc.setVisible(false);
				sm.setVisible(false);
				contact.setVisible(false);
				
				Breg.setVisible(false);
				Dreg.setVisible(false);
				Wreg.setVisible(false);
				
			}
			
			if(smstr.equals("Generate Birth Details")) {
				
				t1.setForeground(new Color(204,0,0));
				t2.setForeground(Color.BLACK);
				t3.setForeground(Color.BLACK);
				t4.setForeground(Color.BLACK);
				t5.setForeground(Color.BLACK);
				
				home.setVisible(false);
				
				dephm.setVisible(false);
				
				Wmain.setVisible(false);
				watconn.setVisible(false);
				track.setVisible(false);
				paystatus.setVisible(false);
				pay.setVisible(false);
				
				
				Bmain.setVisible(false);
				Bapp.setVisible(false);
				Bcert.setVisible(true);
				
				Dmain.setVisible(false);
				Dapp.setVisible(false);
				Dcert.setVisible(false);
				
				PTC.setVisible(false);
				
				about.setVisible(false);
				tc.setVisible(false);
				sm.setVisible(false);
				contact.setVisible(false);
				
				Breg.setVisible(false);
				Dreg.setVisible(false);
				Wreg.setVisible(false);
				
			}
			
           if(smstr.equals("DEATH DETAILS")) {
				
				t1.setForeground(new Color(204,0,0));
				t2.setForeground(Color.BLACK);
				t3.setForeground(Color.BLACK);
				t4.setForeground(Color.BLACK);
				t5.setForeground(Color.BLACK);
				

                home.setVisible(false);
				
				dephm.setVisible(false);
				
				Wmain.setVisible(false);
				watconn.setVisible(false);
				track.setVisible(false);
				paystatus.setVisible(false);
				pay.setVisible(false);
				
				
				Bmain.setVisible(false);
				Bapp.setVisible(false);
				Bcert.setVisible(false);
				
				Dmain.setVisible(true);
				Dapp.setVisible(false);
				Dcert.setVisible(false);
				
				PTC.setVisible(false);
				
				about.setVisible(false);
				tc.setVisible(false);
				sm.setVisible(false);
				contact.setVisible(false);
				
				Breg.setVisible(false);
				Dreg.setVisible(false);
				Wreg.setVisible(false);
				
				
			}
           
           
           if(smstr.equals("Apply Death Registration")) {
				
				t1.setForeground(new Color(204,0,0));
				t2.setForeground(Color.BLACK);
				t3.setForeground(Color.BLACK);
				t4.setForeground(Color.BLACK);
				t5.setForeground(Color.BLACK);
				
				home.setVisible(false);
				
				dephm.setVisible(false);
				
				Wmain.setVisible(false);
				watconn.setVisible(false);
				track.setVisible(false);
				paystatus.setVisible(false);
				pay.setVisible(false);
				
				
				Bmain.setVisible(false);
				Bapp.setVisible(false);
				Bcert.setVisible(false);
				
				Dmain.setVisible(false);
				Dapp.setVisible(true);
				Dcert.setVisible(false);
				
				PTC.setVisible(false);
				
				about.setVisible(false);
				tc.setVisible(false);
				sm.setVisible(false);
				contact.setVisible(false);
				
				Breg.setVisible(false);
				Dreg.setVisible(false);
				Wreg.setVisible(false);
				
			}
			
			if(smstr.equals("Generate Death Details")) {
				
				t1.setForeground(new Color(204,0,0));
				t2.setForeground(Color.BLACK);
				t3.setForeground(Color.BLACK);
				t4.setForeground(Color.BLACK);
				t5.setForeground(Color.BLACK);
				
				home.setVisible(false);
				
				dephm.setVisible(false);
				
				Wmain.setVisible(false);
				watconn.setVisible(false);
				track.setVisible(false);
				paystatus.setVisible(false);
				pay.setVisible(false);
				
				
				Bmain.setVisible(false);
				Bapp.setVisible(false);
				Bcert.setVisible(false);
				
				Dmain.setVisible(false);
				Dapp.setVisible(false);
				Dcert.setVisible(true);
				
				PTC.setVisible(false);
				
				about.setVisible(false);
				tc.setVisible(false);
				sm.setVisible(false);
				contact.setVisible(false);
				
				Breg.setVisible(false);
				Dreg.setVisible(false);
				Wreg.setVisible(false);
				
			}
           
           if(smstr.equals("WATER CHARGES")) {
				
				t1.setForeground(new Color(204,0,0));
				t2.setForeground(Color.BLACK);
				t3.setForeground(Color.BLACK);
				t4.setForeground(Color.BLACK);
				t5.setForeground(Color.BLACK);
				

                home.setVisible(false);
				
				dephm.setVisible(false);
				
				Wmain.setVisible(true);
				watconn.setVisible(false);
				track.setVisible(false);
				paystatus.setVisible(false);
				pay.setVisible(false);
				
				
				Bmain.setVisible(false);
				Bapp.setVisible(false);
				Bcert.setVisible(false);
				
				Dmain.setVisible(false);
				Dapp.setVisible(false);
				Dcert.setVisible(false);
				
				PTC.setVisible(false);
				
				about.setVisible(false);
				tc.setVisible(false);
				sm.setVisible(false);
				contact.setVisible(false);
				
				Breg.setVisible(false);
				Dreg.setVisible(false);
				Wreg.setVisible(false);
				
				
			}
           
           if(smstr.equals("Apply New Water Connection")) {
        	   
        	    t1.setForeground(new Color(204,0,0));
				t2.setForeground(Color.BLACK);
				t3.setForeground(Color.BLACK);
				t4.setForeground(Color.BLACK);
				t5.setForeground(Color.BLACK);
				
				home.setVisible(false);
				
				dephm.setVisible(false);
				
				Wmain.setVisible(false);
				watconn.setVisible(true);
				track.setVisible(false);
				paystatus.setVisible(false);
				pay.setVisible(false);
				
				
				Bmain.setVisible(false);
				Bapp.setVisible(false);
				Bcert.setVisible(false);
				
				Dmain.setVisible(false);
				Dapp.setVisible(false);
				Dcert.setVisible(false);
				
				PTC.setVisible(false);
				
				about.setVisible(false);
				tc.setVisible(false);
				sm.setVisible(false);
				contact.setVisible(false);
				
				Breg.setVisible(false);
				Dreg.setVisible(false);
				Wreg.setVisible(false);
           }
			
           if(smstr.equals("Track New Water Connection Status")) {
        	   
        	    t1.setForeground(new Color(204,0,0));
				t2.setForeground(Color.BLACK);
				t3.setForeground(Color.BLACK);
				t4.setForeground(Color.BLACK);
				t5.setForeground(Color.BLACK);
				
				home.setVisible(false);
				
				dephm.setVisible(false);
				
				Wmain.setVisible(false);
				watconn.setVisible(false);
				track.setVisible(true);
				paystatus.setVisible(false);
				pay.setVisible(false);
				
				
				Bmain.setVisible(false);
				Bapp.setVisible(false);
				Bcert.setVisible(false);
				
				Dmain.setVisible(false);
				Dapp.setVisible(false);
				Dcert.setVisible(false);
				
				PTC.setVisible(false);
				
				about.setVisible(false);
				tc.setVisible(false);
				sm.setVisible(false);
				contact.setVisible(false);
				
				Breg.setVisible(false);
				Dreg.setVisible(false);
				Wreg.setVisible(false);
        	   
           }
           
           if(smstr.equals("View Payment Status")) {
        	  
       	        t1.setForeground(new Color(204,0,0));
				t2.setForeground(Color.BLACK);
				t3.setForeground(Color.BLACK);
				t4.setForeground(Color.BLACK);
				t5.setForeground(Color.BLACK);
				
				home.setVisible(false);
				
				dephm.setVisible(false);
				
				Wmain.setVisible(false);
				watconn.setVisible(false);
				track.setVisible(false);
				paystatus.setVisible(true);
				pay.setVisible(false);
				
				
				Bmain.setVisible(false);
				Bapp.setVisible(false);
				Bcert.setVisible(false);
				
				Dmain.setVisible(false);
				Dapp.setVisible(false);
				Dcert.setVisible(false);
				
				PTC.setVisible(false);
				
				about.setVisible(false);
				tc.setVisible(false);
				sm.setVisible(false);
				contact.setVisible(false);
				
				Breg.setVisible(false);
				Dreg.setVisible(false);
				Wreg.setVisible(false);
        	   
           }
           
           if(smstr.equals("Pay Water Charges")) {
        	           	   
       	        t1.setForeground(new Color(204,0,0));
				t2.setForeground(Color.BLACK);
				t3.setForeground(Color.BLACK);
				t4.setForeground(Color.BLACK);
				t5.setForeground(Color.BLACK);
				
				home.setVisible(false);
				
				dephm.setVisible(false);
				
				Wmain.setVisible(false);
				watconn.setVisible(false);
				track.setVisible(false);
				paystatus.setVisible(false);
				pay.setVisible(true);
				
				
				Bmain.setVisible(false);
				Bapp.setVisible(false);
				Bcert.setVisible(false);
				
				Dmain.setVisible(false);
				Dapp.setVisible(false);
				Dcert.setVisible(false);
				
				PTC.setVisible(false);
				
				about.setVisible(false);
				tc.setVisible(false);
				sm.setVisible(false);
				contact.setVisible(false);
				
				Breg.setVisible(false);
				Dreg.setVisible(false);
				Wreg.setVisible(false);
        	   
           }
           
           if(smstr.equals("PROPERTY TAX - TAX CALCULATOR")) {
           	   
      	        t1.setForeground(new Color(204,0,0));
				t2.setForeground(Color.BLACK);
				t3.setForeground(Color.BLACK);
				t4.setForeground(Color.BLACK);
				t5.setForeground(Color.BLACK);
				
				home.setVisible(false);
				
				dephm.setVisible(false);
				
				Wmain.setVisible(false);
				watconn.setVisible(false);
				track.setVisible(false);
				paystatus.setVisible(false);
				pay.setVisible(false);
				
				
				Bmain.setVisible(false);
				Bapp.setVisible(false);
				Bcert.setVisible(false);
				
				Dmain.setVisible(false);
				Dapp.setVisible(false);
				Dcert.setVisible(false);
				
				PTC.setVisible(true);
				
				about.setVisible(false);
				tc.setVisible(false);
				sm.setVisible(false);
				contact.setVisible(false);
				
				Breg.setVisible(false);
				Dreg.setVisible(false);
				Wreg.setVisible(false);
       	   
          }
           
          if(smstr.equals("Birth Registrations")) {
        	  
        	    t1.setForeground(Color.black);
				t2.setForeground(Color.BLACK);
				t3.setForeground(Color.BLACK);
				t4.setForeground(Color.BLACK);
				t5.setForeground(Color.BLACK);
				
				home.setVisible(false);
				
				dephm.setVisible(false);
				
				Wmain.setVisible(false);
				watconn.setVisible(false);
				track.setVisible(false);
				paystatus.setVisible(false);
				pay.setVisible(false);
				
				
				Bmain.setVisible(false);
				Bapp.setVisible(false);
				Bcert.setVisible(false);
				
				Dmain.setVisible(false);
				Dapp.setVisible(false);
				Dcert.setVisible(false);
				
				PTC.setVisible(false);
				
				about.setVisible(false);
				tc.setVisible(false);
				sm.setVisible(false);
				contact.setVisible(false);
				
				Breg.setVisible(true);
				Dreg.setVisible(false);
				Wreg.setVisible(false);
        	  
        	  
          }
          
          if(smstr.equals("Death Registrations")) {
        	  
        	  t1.setForeground(Color.black);
				t2.setForeground(Color.BLACK);
				t3.setForeground(Color.BLACK);
				t4.setForeground(Color.BLACK);
				t5.setForeground(Color.BLACK);
				
				home.setVisible(false);
				
				dephm.setVisible(false);
				
				Wmain.setVisible(false);
				watconn.setVisible(false);
				track.setVisible(false);
				paystatus.setVisible(false);
				pay.setVisible(false);
				
				
				Bmain.setVisible(false);
				Bapp.setVisible(false);
				Bcert.setVisible(false);
				
				Dmain.setVisible(false);
				Dapp.setVisible(false);
				Dcert.setVisible(false);
				
				PTC.setVisible(false);
				
				about.setVisible(false);
				tc.setVisible(false);
				sm.setVisible(false);
				contact.setVisible(false);
				
				Breg.setVisible(false);
				Dreg.setVisible(true);
				Wreg.setVisible(false);
        	  
          }
          
         if(smstr.equals("New Water Connection Registrations")) {
        	  
        	    t1.setForeground(Color.black);
				t2.setForeground(Color.BLACK);
				t3.setForeground(Color.BLACK);
				t4.setForeground(Color.BLACK);
				t5.setForeground(Color.BLACK);
				
				home.setVisible(false);
				
				dephm.setVisible(false);
				
				Wmain.setVisible(false);
				watconn.setVisible(false);
				track.setVisible(false);
				paystatus.setVisible(false);
				pay.setVisible(false);
				
				
				Bmain.setVisible(false);
				Bapp.setVisible(false);
				Bcert.setVisible(false);
				
				Dmain.setVisible(false);
				Dapp.setVisible(false);
				Dcert.setVisible(false);
				
				PTC.setVisible(false);
				
				about.setVisible(false);
				tc.setVisible(false);
				sm.setVisible(false);
				contact.setVisible(false);
				
				Breg.setVisible(false);
				Dreg.setVisible(false);
				Wreg.setVisible(true);
        	  
          }
           
           
	    }
    }
	
	
	////********************** MOUSE LISTENER ************************************************************************//////////

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == t1) {
			
			t1.setForeground(new Color(204,0,0));
			t2.setForeground(Color.BLACK);
			t3.setForeground(Color.BLACK);
			t4.setForeground(Color.BLACK);
			t5.setForeground(Color.BLACK);
			
			home.setVisible(true);
			
			dephm.setVisible(false);
			
			Wmain.setVisible(false);
			watconn.setVisible(false);
			track.setVisible(false);
			paystatus.setVisible(false);
			pay.setVisible(false);
			
			
			Bmain.setVisible(false);
			Bapp.setVisible(false);
			Bcert.setVisible(false);
			
			Dmain.setVisible(false);
			Dapp.setVisible(false);
			Dcert.setVisible(false);
			
			PTC.setVisible(false);
			
			about.setVisible(false);
			tc.setVisible(false);
			sm.setVisible(false);
			contact.setVisible(false);
			
		}
		else if(e.getSource() == t2) {
			
			t1.setForeground(Color.BLACK);
			t2.setForeground(new Color(204,0,0));
			t3.setForeground(Color.BLACK);
			t4.setForeground(Color.BLACK);
			t5.setForeground(Color.BLACK);
			
            home.setVisible(false);
			
			dephm.setVisible(false);
			
			Wmain.setVisible(false);
			watconn.setVisible(false);
			track.setVisible(false);
			paystatus.setVisible(false);
			pay.setVisible(false);
			
			
			Bmain.setVisible(false);
			Bapp.setVisible(false);
			Bcert.setVisible(false);
			
			Dmain.setVisible(false);
			Dapp.setVisible(false);
			Dcert.setVisible(false);
			
			PTC.setVisible(false);
			
			about.setVisible(true);
			tc.setVisible(false);
			sm.setVisible(false);
			contact.setVisible(false);
			
		}
		
		else if(e.getSource() == t3) {
			
			t1.setForeground(Color.BLACK);
			t2.setForeground(Color.BLACK);
			t3.setForeground(new Color(204,0,0));
			t4.setForeground(Color.BLACK);
			t5.setForeground(Color.BLACK);
			

            home.setVisible(false);
			
			dephm.setVisible(false);
			
			Wmain.setVisible(false);
			watconn.setVisible(false);
			track.setVisible(false);
			paystatus.setVisible(false);
			pay.setVisible(false);
			
			
			Bmain.setVisible(false);
			Bapp.setVisible(false);
			Bcert.setVisible(false);
			
			Dmain.setVisible(false);
			Dapp.setVisible(false);
			Dcert.setVisible(false);
			
			PTC.setVisible(false);
			
			about.setVisible(false);
			tc.setVisible(true);
			sm.setVisible(false);
			contact.setVisible(false);
			
		}
		
		else if(e.getSource() == t4) {
			
			t1.setForeground(Color.BLACK);
			t2.setForeground(Color.BLACK);
			t3.setForeground(Color.BLACK);
			t4.setForeground(new Color(204,0,0));
			t5.setForeground(Color.BLACK);
			

            home.setVisible(false);
			
			dephm.setVisible(false);
			
			Wmain.setVisible(false);
			watconn.setVisible(false);
			track.setVisible(false);
			paystatus.setVisible(false);
			pay.setVisible(false);
			
			
			Bmain.setVisible(false);
			Bapp.setVisible(false);
			Bcert.setVisible(false);
			
			Dmain.setVisible(false);
			Dapp.setVisible(false);
			Dcert.setVisible(false);
			
			PTC.setVisible(false);
			
			about.setVisible(false);
			tc.setVisible(false);
			sm.setVisible(true);
			contact.setVisible(false);
			
		}
		
		else if(e.getSource() == t5) {
			
			t1.setForeground(Color.BLACK);
			t2.setForeground(Color.BLACK);
			t3.setForeground(Color.BLACK);
			t4.setForeground(Color.BLACK);
			t5.setForeground(new Color(204,0,0));
			

            home.setVisible(false);
			
			dephm.setVisible(false);
			
			Wmain.setVisible(false);
			watconn.setVisible(false);
			track.setVisible(false);
			paystatus.setVisible(false);
			pay.setVisible(false);
			
			
			Bmain.setVisible(false);
			Bapp.setVisible(false);
			Bcert.setVisible(false);
			
			Dmain.setVisible(false);
			Dapp.setVisible(false);
			Dcert.setVisible(false);
			
			PTC.setVisible(false);
			
			about.setVisible(false);
			tc.setVisible(false);
			sm.setVisible(false);
			contact.setVisible(true);

			
			Breg.setVisible(false);
			Dreg.setVisible(false);
			Wreg.setVisible(false);
		}
		
        else if(e.getSource() == BD) {
			
            home.setVisible(false);
			
            Bmain.setVisible(true);
            
		}
		
        else if(e.getSource() == DD) {
        	
            home.setVisible(false);
			
            Dmain.setVisible(true);
        	
        }
		
		else if(e.getSource() == WC) {
			
			home.setVisible(false);
			
			Wmain.setVisible(true);
		}
		
      else if(e.getSource() == PT) {
			
			home.setVisible(false);
			
			PTC.setVisible(true);
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
	
	
	//////************ ACTION LISTENER **********************************************************************************************************************////
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		if(e.getSource() == dpSubmit) {
			
			String uu = HOME.dpId_txt.getText().toString();
			String pp = HOME.dpPass_txt.getText().toString();
			
			String xxxx = "";
			String y = "";
			 
			
			try {
	            Connection conn = getConn.getConnection();
				
				String query = "SELECT * FROM DEPTLOGIN WHERE OFFICER_ID = ?";
				
				PreparedStatement pstmt = conn.prepareStatement(query);
		     	pstmt.setString(1, uu);
				ResultSet rst = pstmt.executeQuery();
				
				while(rst.next()) {
					xxxx = rst.getString("OFFICER_ID");
					y = rst.getString("PASSWORD");
					
					
				}
				
				if(xxxx.isEmpty()) {
					
					JOptionPane.showMessageDialog(co, "OFFICER ID NOT FOUND");
					
				}
				
				else {
					if(y.equals(pp)) {
						home.setVisible(false);
						dephm.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(co, "INCORRECT PASSWORD");
					}
				}
				 xxxx = "";
				 y = "";
				
				}
		
			catch(Exception e1) {
				System.out.println("DEPTLOGIN"+e1);
			}
			
			
			
		}
		
	}
	
	////***********************************************************************************************************************************************************////
	
	
	public static void main(String[] args) throws Exception{
		new MASTER();
	}


	public static void details(JScrollPane sp) {
		// TODO Auto-generated method stub
		
		SBreg = sp;
		co.add(SBreg,BorderLayout.CENTER);
		//System.out.println("HI DETAILS");
		
		SBreg.setVisible(true);
		
		home.setVisible(false);
		
		dephm.setVisible(false);
		
		Wmain.setVisible(false);
		watconn.setVisible(false);
		track.setVisible(false);
		paystatus.setVisible(false);
		pay.setVisible(false);
		
		
		Bmain.setVisible(false);
		Bapp.setVisible(false);
		Bcert.setVisible(false);
		
		Dmain.setVisible(false);
		Dapp.setVisible(false);
		Dcert.setVisible(false);
		
		PTC.setVisible(false);
		
		about.setVisible(false);
		tc.setVisible(false);
		sm.setVisible(false);
		contact.setVisible(false);

		
		Breg.setVisible(false);
		Dreg.setVisible(false);
		Wreg.setVisible(false);
		
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
