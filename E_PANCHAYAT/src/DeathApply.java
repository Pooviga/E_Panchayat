import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.ItemSelectable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DeathApply extends JFrame implements ActionListener,ItemListener{

	JLabel title,h1,h2,h3,s;
	JLabel dis,tp,mb,email,dod,gender,Ide,Name,HName,reli,add,pincode,state,cau,place,cer;
	JTextField dis_t,tp_t,mb_t,email_t,dod_t,Ide_t,Name_t,HName_t,reli_t,pincode_t,state_t,cau_t,place_t;
	JTextArea add_t;
	JComboBox<String> cer_t;
	JRadioButton male,female;
	ButtonGroup btn;
	JButton submit,reset,back;
	JPanel p1,p2,p3,p4,dum,jp,panel;
	JScrollPane sp;
	Container co;
	String str_gender = "";
	
	public DeathApply() {
		
		setTitle("DEATH APPLICATION");
		
		co = getContentPane();
		co.setLayout(null);
		
		Font f = new Font(Font.SANS_SERIF,Font.PLAIN,15);
		
		title = new JLabel("DEATH DETAILS - APPLY DEATH REGISTRATION");
		s = new JLabel("** ALL FIELDS ARE REQUIRED **");
		h1 = new JLabel("DEATH PERSON INFORMATION");
		h2 = new JLabel("PERMANENT ADDRESS INFORMATION");
		h3 = new JLabel("DISEASE DETAIL");
		
		dis = new JLabel("<HTML><font color = 'red'><b>*</b></font> DISTRICT</HTML>");
		tp = new JLabel("<HTML><font color = 'red'><b>*</b></font> TOWN PANCHAYAT</HTML>");
		mb = new JLabel("<HTML><font color = 'red'><b>*</b></font> MOBILE NUMBER");
		email = new JLabel("<HTML><font color = 'red'><b>*</b></font> EMAIL</HTML>");
		
		dis_t = new JTextField();
		tp_t = new JTextField();
		mb_t = new JTextField();
		email_t = new JTextField();
		
		title.setBounds(10,10,700,30);
		title.setFont(new Font("SANS-SERIF",Font.BOLD,18));
		title.setOpaque(true);
		title.setForeground(new Color(0,0,102));
		title.setBackground(Color.WHITE);
		
		s.setBounds(400,50,400,30);
		s.setFont(new Font("SANS-SERIF",Font.PLAIN,15));
		s.setOpaque(true);
		s.setForeground(Color.RED);
		s.setBackground(Color.WHITE);
		
		dis.setBounds(20,20,200,30);
		dis_t.setBounds(250,20,200,30);
		tp.setBounds(500,20,200,30);
		tp_t.setBounds(750,20,200,30);
		mb.setBounds(20,70,200,30);
		mb_t.setBounds(250,70,200,30);
		email.setBounds(500,70,200,30);
		email_t.setBounds(750,70,200,30);
		
		dis.setFont(f);
		tp.setFont(f);
		mb.setFont(f);
		email.setFont(f);
		
		dis.setForeground(new Color(0,0,102));
		tp.setForeground(new Color(0,0,102));
		mb.setForeground(new Color(0,0,102));
		email.setForeground(new Color(0,0,102));
		
		
		p1 = new JPanel();
		p1.add(dis);
		p1.add(dis_t);
		p1.add(tp);
		p1.add(tp_t);
		p1.add(mb);
		p1.add(mb_t);
		p1.add(email);
		p1.add(email_t);
		
		p1.setBounds(10,100,980,130);
		p1.setBackground(Color.WHITE);
		p1.setLayout(null);
		p1.setBorder(BorderFactory.createLineBorder(new Color(245,245,245), 1, false));
		
		h1.setBounds(50,250,700,30);
		h1.setFont(new Font("SANS-SERIF",Font.BOLD,15));
		h1.setOpaque(true);
		h1.setForeground(new Color(255,24,71));
		h1.setBackground(Color.WHITE);
		
		dod = new JLabel("<HTML><font color = 'red'><b>*</b></font> DATE OF DEATH (DD/MM/YYYY)</HTML>");
		gender = new JLabel("<HTML><font color = 'red'><b>*</b></font> GENDER</HTML>");
		Name = new JLabel("<HTML><font color = 'red'><b>*</b></font>NAME</HTML>");
		Ide = new JLabel("<HTML><font color = 'red'><b>*</b></font> IDENTIFICATION</HTML>");
		
		dod_t = new JTextField();
		male = new JRadioButton("Male");
		female = new JRadioButton("Female");
		Name_t = new JTextField();
		Ide_t = new JTextField();
		
		btn = new ButtonGroup();
		btn.add(male);
		btn.add(female);
		
		dod.setBounds(20,20,200,35);
		dod_t.setBounds(250,20,200,30);
		gender.setBounds(500,20,200,30);
		male.setBounds(750,20,80,30);
		
		female.setBounds(830,20,100,30);
		male.setBackground(Color.WHITE);
		female.setBackground(Color.WHITE);
		male.setFont(f);
		female.setFont(f);
		Name.setBounds(20,70,200,30);
		Name_t.setBounds(250,70,200,30);
		Ide.setBounds(500,70,200,30);
		Ide_t.setBounds(750,70,200,30);
		
		dod.setFont(f);
		gender.setFont(f);
		Name.setFont(f);
		Ide.setFont(f);
		
		dod.setForeground(new Color(0,0,102));
		gender.setForeground(new Color(0,0,102));
		Name.setForeground(new Color(0,0,102));
		Ide.setForeground(new Color(0,0,102));
		
		
		p2 = new JPanel();
		p2.add(dod);
		p2.add(dod_t);
		p2.add(gender);
		p2.add(male);
		p2.add(female);
		p2.add(Name);
		p2.add(Name_t);
		p2.add(Ide);
		p2.add(Ide_t);
		
		p2.setBounds(10,300,980,130);
		p2.setBackground(Color.WHITE);
		p2.setLayout(null);
		p2.setBorder(BorderFactory.createLineBorder(new Color(245,245,245), 1, false));
		
		h2.setBounds(50,460,700,30);
		h2.setFont(new Font("SANS-SERIF",Font.BOLD,15));
		h2.setOpaque(true);
		h2.setForeground(new Color(255,24,71));
		h2.setBackground(Color.WHITE);
		
		HName = new JLabel("<HTML><font color = 'red'><b>*</b></font> HUSBAND/WIFE NAME</HTML>");
		reli = new JLabel("<HTML><font color = 'red'><b>*</b></font> RELIGION </HTML>");
		add = new JLabel("<HTML><font color = 'red'><b>*</b></font> PERMANANT ADDRESS</HTML>");
		pincode = new JLabel("<HTML><font color = 'red'><b>*</b></font> PINCODE</HTML>");
		state = new JLabel("<HTML><font color = 'red'><b>*</b></font> STATE</HTML>");
		
		HName_t = new JTextField();
		reli_t = new JTextField();
		add_t = new JTextArea();
		pincode_t = new JTextField();
		state_t = new JTextField();
		
		HName.setBounds(20,20,200,30);
		HName_t.setBounds(250,20,200,30);
		reli.setBounds(20,80,200,35);
		reli_t.setBounds(250,80,200,30);
		add.setBounds(500,20,200,40);
		add_t.setBounds(750,20,200,100);
		pincode.setBounds(20,150,200,30);
		pincode_t.setBounds(250,150,200,30);
		state.setBounds(500,150,200,30);
		state_t.setBounds(750,150,200,30);
		
		add_t.setLineWrap(true);
		add_t.setBorder(BorderFactory.createLineBorder(Color.gray,1,false));
		
		HName.setFont(f);
		reli.setFont(f);
		add.setFont(f);
		pincode.setFont(f);
		state.setFont(f);
		
		HName.setForeground(new Color(0,0,102));
		reli.setForeground(new Color(0,0,102));
		add.setForeground(new Color(0,0,102));
		pincode.setForeground(new Color(0,0,102));
		state.setForeground(new Color(0,0,102));
		
		p3 = new JPanel();
		p3.add(HName);
		p3.add(HName_t);
		p3.add(reli);
		p3.add(reli_t);
		p3.add(add);
		p3.add(add_t);
		p3.add(pincode);
		p3.add(pincode_t);
		p3.add(state);
		p3.add(state_t);
		
		p3.setBounds(10,510,980,200);
		p3.setBackground(Color.WHITE);
		p3.setLayout(null);
		p3.setBorder(BorderFactory.createLineBorder(new Color(245,245,245), 1, false));
		
		h3.setBounds(50,730,700,30);
		h3.setFont(new Font("SANS-SERIF",Font.BOLD,15));
		h3.setOpaque(true);
		h3.setForeground(new Color(255,24,71));
		h3.setBackground(Color.WHITE);
		
		cau = new JLabel("<HTML><font color = 'red'><b>*</b></font> CAUSE OF DEATH</HTML>");
		place = new JLabel("<HTML><font color = 'red'><b>*</b></font> PLACE OF DEATH</HTML>");
		cer = new JLabel("<HTML><font color = 'red'><b>*</b></font> WAS CAUSE OF DEATH<br> MEDICALLY CERTIFIED?</HTML>");
		
	
		cau_t = new JTextField();		
		place_t = new JTextField();
		
		cer_t = new JComboBox<>();
		
		cer_t.addItem("-- SELECT --");
		cer_t.addItem("Yes");
		cer_t.addItem("No");
		
		cer_t.setBackground(Color.WHITE);
		
		cau.setBounds(20,20,200,30);
		cau_t.setBounds(250,20,200,30);
		place.setBounds(500,20,200,30);
		place_t.setBounds(750,20,200,30);
		cer.setBounds(20,80,200,35);
		cer_t.setBounds(250,80,200,30);
		
		cau.setFont(f);
		place.setFont(f);
		place.setBackground(Color.white);
		place.setOpaque(true);
		cer.setFont(f);
		
		cau.setForeground(new Color(0,0,102));
		place.setForeground(new Color(0,0,102));
		cer.setForeground(new Color(0,0,102));
		
		p4 = new JPanel();
		p4.add(cau);
		p4.add(cau_t);
		p4.add(place);
		p4.add(place_t);
		p4.add(cer);
		p4.add(cer_t);
		
		p4.setBounds(10,780,980,130);
		p4.setBackground(Color.WHITE);
		p4.setLayout(null);
		p4.setBorder(BorderFactory.createLineBorder(new Color(245,245,245), 1, false));
		
		
		
		submit = new JButton("SUBMIT");
		submit.setBackground(new Color(0,0,102));
		submit.setForeground(Color.white);
		submit.setOpaque(true);
		submit.setFont(new Font("SANA-SERIF",Font.BOLD,12));
		
		reset = new JButton("RESET");
		reset.setBackground(new Color(0,0,102));
		reset.setForeground(Color.white);
		reset.setOpaque(true);
		reset.setFont(new Font("SANA-SERIF",Font.BOLD,12));
		
		back = new JButton("BACK");
		back.setBackground(new Color(0,0,102));
		back.setBounds(490,360,150,40);
		back.setForeground(Color.white);
		back.setOpaque(true);
		back.setFont(new Font("SANS-SERIF",Font.BOLD,15));
		
		back.setBounds(950,30,100,30);
		
		 back.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					MASTER.Dapp.setVisible(false);
					MASTER.Dmain.setVisible(true);
					
				}
			});
		
		submit.setBounds(300,970,150,30);
		reset.setBounds(480,970,150,30);
		
        reset.addActionListener(this);
        male.addItemListener(this);
		female.addItemListener(this);
		
		//************ SUBMIT ACTION LISTENER ***********************************************************************************//
		
        submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method
				
				Boolean bool = true;
				
				javabeans mn = new javabeans();
				
				while(bool) {
					
					mn.setDistrict(dis_t.getText().toString());
					
					if(mn.getDistrict().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PROPER DISTRICT");
					    break;
					}
					

					mn.setTown_panchyat(tp_t.getText().toString());
					
					if(mn.getTown_panchyat().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PROPER TOWN PANCHAYAT");
					    break;
					}
					
					mn.setNumber(mb_t.getText().toString());
						
					if(mn.getNumber().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PROPER MOBILE NUMBER");
					    break;
					}
					

					mn.setEmail(email_t.getText().toString());
				
					if(mn.getEmail().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PROPER EMAIL");
					    break;
					}
					

					mn.setDate(dod_t.getText().toString());
						
					if(mn.getDate().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PROPER DATE OF DEATH");
					    break;
					}
					
					
					mn.setGender(str_gender);
					
					if(mn.getGender().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "SELECT PERSON'S GENDER");
					    break;
					}
					
					mn.setName(Name_t.getText().toString());
					
					if(mn.getName().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PERSON'S NAME CORRECTLY");
					    break;
					}
					
					mn.setIdentification(Ide_t.getText().toString());
						
					if(mn.getIdentification().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PROPER IDENTIFICATION OF THE PERSON");
					    break;
					}

                   mn.setHus_or_father_name(HName_t.getText().toString());
					
					if(mn.getHus_or_father_name().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PERSON'S FATHER/HUSBAND NAME CORRECTLY");
					    break;
					}
					
					mn.setRelegion(reli_t.getText().toString());
					
					if(mn.getRelegion().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE RELIGION");
					    break;
					}
					
					mn.setPer_address(add_t.getText().toString());
					
					if(mn.getPer_address().isEmpty()){
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PROPER ADDRESS");
					    break;
					}
					
					mn.setPincode(pincode_t.getText().toString());
					
					if(mn.getPincode().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PROPER PINCODE");
					    break;
					}
					
					mn.setState(state_t.getText().toString());
					
					if(mn.getState().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PROPER STATE");
					    break;
					}
					
                    mn.setCause_of_death(cau_t.getText().toString());
					
					if(mn.getCause_of_death().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PROPER CAUSE OF DEATH");
					    break;
					}
					
                    mn.setPlace_of_death(place_t.getText().toString());
					
					if(mn.getPlace_of_death().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PLACE OF DEATH");
					    break;
					}
					 

                    mn.setCertified(cer_t.getSelectedItem().toString());
					
					if(mn.getCertified().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "SELECT WHETHER THE DEATH WAS MEDIACLLY APPROVED OR NOT");
					    break;
					}
					
					
					
					bool = false;
					
				
					DEATHREGDATABASE db = new DEATHREGDATABASE();
					db.deathreg(mn);
					
					dis_t.setText("");
					tp_t.setText("");
					mb_t.setText("");
					email_t.setText("");
					dod_t.setText("");
					Name_t.setText("");
					HName_t.setText("");
					Ide_t.setText("");
					reli_t.setText("");
					pincode_t.setText("");
					state_t.setText("");
					add_t.setText("");
					cau_t.setText("");
					place_t.setText("");
					
					cer_t.setSelectedIndex(0);
					male.setSelected(false);
	                female.setSelected(false);

                    
					
				}
				
			  }	
	         
			});
		
		
		dum = new JPanel();
		
		dum.add(s);
		dum.add(p1);
		dum.add(h1);
		dum.add(p2);
		dum.add(h2);
		dum.add(p3);
		dum.add(h3);
		dum.add(p4);
		dum.add(submit);
		dum.add(reset);
		
		dum.setLayout(null);
		dum.setBounds(80,80,1000,1020);
		dum.setBackground(Color.white);
        dum.setBorder(BorderFactory.createLineBorder(new Color(235,235,235), 1, false));
		
		jp = new JPanel();
		
		jp.add(title);
		jp.add(back);
		jp.add(dum);
		
        jp.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
		
		panel = new JPanel();
		panel.add(jp);
		
        panel.setPreferredSize(new Dimension(200, 1200));
		
		panel.setLayout(null);
		jp.setLayout(null);
		jp.setBounds(0,0,1150,2150);
		jp.setBackground(Color.white);
		panel.setBackground(Color.white);
		
		sp = new JScrollPane(panel);
		sp.setVisible(true);
		sp.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1, false));
		sp.setBounds(180,200,1350,600);
		
		
		co.add(sp,BorderLayout.CENTER);
		co.setBackground(Color.white);
		
//		setSize(2000,2000);
//		setVisible(true);
			
		
	}
	
	public static void main(String[] args) {
		new DeathApply();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == reset) {
			dis_t.setText("");
			tp_t.setText("");
			mb_t.setText("");
			email_t.setText("");
			dod_t.setText("");
			Name_t.setText("");
			HName_t.setText("");
			Ide_t.setText("");
			reli_t.setText("");
			pincode_t.setText("");
			state_t.setText("");
			add_t.setText("");
			cau_t.setText("");
			place_t.setText("");
			
			cer_t.setSelectedIndex(0);
			
			 male.setSelected(false);
             female.setSelected(false);
			
		}
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		ItemSelectable item = e.getItemSelectable();
    	
    	if(item == male){
    		str_gender = "Male";
    	}
    	else if(item == female) {
    		str_gender = "Female";
    	}
	}
}
