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

public class BirthApply extends JFrame implements ActionListener,ItemListener{

	JLabel title,h1,h2,h3,s;
	JLabel dis,tp,mb,email,dob,gender,cName,Ide,fName,mName,fAge,mAge,fOcc,mOcc,cWei,metDeli,reli,add,pincode,state;
	JTextField dis_t,tp_t,mb_t,email_t,dob_t,cName_t,Ide_t,fName_t,mName_t,fAge_t,mAge_t,fOcc_t,mOcc_t,cWei_t,reli_t,pincode_t,state_t;
	JTextArea add_t;
	JRadioButton male,female;
	JComboBox<String> metDeli_t;
	JButton submit,reset,back;
	ButtonGroup btn;
	JPanel p1,p2,p3,p4,dum,jp,panel;
	JScrollPane sp;
	String str_gender = "";
	Container co;
	
	public BirthApply() {
		
		setTitle("BIRTH APPLICATION");
		
		co = getContentPane();
		co.setLayout(null);
		
		Font f = new Font(Font.SANS_SERIF,Font.PLAIN,15);
		
		title = new JLabel("BIRTH DETAILS - APPLY BIRTH REGISTRATION");
		s = new JLabel("** ALL FIELDS ARE REQUIRED **");
		h1 = new JLabel("CHILD INFORMATION");
		h2 = new JLabel("PARENT INFORMATION");
		h3 = new JLabel("BIRTH TYPE");
		
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
		
		dob = new JLabel("<HTML><font color = 'red'><b>*</b></font> DATE OF BIRTH (DD/MM/YYYY)</HTML>");
		gender = new JLabel("<HTML><font color = 'red'><b>*</b></font> GENDER</HTML>");
		cName = new JLabel("<HTML><font color = 'red'><b>*</b></font> CHILD NAME</HTML>");
		Ide = new JLabel("<HTML><font color = 'red'><b>*</b></font> IDENTIFICATION</HTML>");
		
		dob_t = new JTextField();
		male = new JRadioButton("Male");
		female = new JRadioButton("Female");
		cName_t = new JTextField();
		Ide_t = new JTextField();
		
		btn = new ButtonGroup();
		btn.add(male);
		btn.add(female);
		
		dob.setBounds(20,20,200,35);
		dob_t.setBounds(250,20,200,30);
		gender.setBounds(500,20,200,30);
		male.setBounds(750,20,80,30);
		female.setBounds(830,20,100,30);
		male.setBackground(Color.WHITE);
		female.setBackground(Color.WHITE);
		male.addItemListener(this);
		female.addItemListener(this);
		male.setFont(f);
		female.setFont(f);
		cName.setBounds(20,70,200,30);
		cName_t.setBounds(250,70,200,30);
		Ide.setBounds(500,70,200,30);
		Ide_t.setBounds(750,70,200,30);
		
		dob.setFont(f);
		gender.setFont(f);
		cName.setFont(f);
		Ide.setFont(f);
		
		dob.setForeground(new Color(0,0,102));
		gender.setForeground(new Color(0,0,102));
		cName.setForeground(new Color(0,0,102));
		Ide.setForeground(new Color(0,0,102));
		
		
		p2 = new JPanel();
		p2.add(dob);
		p2.add(dob_t);
		p2.add(gender);
		p2.add(male);
		p2.add(female);
		p2.add(cName);
		p2.add(cName_t);
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
		
		fName = new JLabel("<HTML><font color = 'red'><b>*</b></font> FATHER'S NAME</HTML>");
		mName = new JLabel("<HTML><font color = 'red'><b>*</b></font> MOTHER'S NAME</HTML>");
		fAge = new JLabel("<HTML><font color = 'red'><b>*</b></font> AGE OF FATHER [Yrs.]</HTML>");
		mAge = new JLabel("<HTML><font color = 'red'><b>*</b></font> AGE OF MOTHER [Yrs.]</HTML>");
		fOcc = new JLabel("<HTML><font color = 'red'><b>*</b></font> FATHER'S OCCUPATION</HTML>");
		mOcc = new JLabel("<HTML><font color = 'red'><b>*</b></font> MOTHER'S OCCUPATION</HTML>");
		add = new JLabel("<HTML><font color = 'red'><b>*</b></font> PERMANANT ADDRESS</HTML>");
		pincode = new JLabel("<HTML><font color = 'red'><b>*</b></font> PINCODE</HTML>");
		state = new JLabel("<HTML><font color = 'red'><b>*</b></font> STATE</HTML>");
		
		fName_t = new JTextField();
		mName_t = new JTextField();
		fAge_t = new JTextField();
		mAge_t = new JTextField();
		fOcc_t = new JTextField();
		mOcc_t = new JTextField();
		add_t = new JTextArea();
		pincode_t = new JTextField();
		state_t = new JTextField();
		
		fName.setBounds(20,20,200,30);
		fName_t.setBounds(250,20,200,30);
		mName.setBounds(500,20,200,30);
		mName_t.setBounds(750,20,200,30);
		fAge.setBounds(20,80,200,35);
		fAge_t.setBounds(250,80,200,30);
		mAge.setBounds(500,80,200,35);
		mAge_t.setBounds(750,80,200,30);
		fOcc.setBounds(20,130,200,30);
		fOcc_t.setBounds(250,130,200,30);
		mOcc.setBounds(500,130,200,30);
		mOcc_t.setBounds(750,130,200,30);
		add.setBounds(20,190,200,30);
		add_t.setBounds(250,190,200,80);
		pincode.setBounds(500,190,200,30);
		pincode_t.setBounds(750,190,200,30);
		state.setBounds(500,250,200,30);
		state_t.setBounds(750,250,200,30);
		
		add_t.setLineWrap(true);
		add_t.setBorder(BorderFactory.createLineBorder(Color.gray,1,false));
		
		fName.setFont(f);
		mName.setFont(f);
		fAge.setFont(f);
		mAge.setFont(f);
		fOcc.setFont(f);
		mOcc.setFont(f);
		add.setFont(f);
		pincode.setFont(f);
		state.setFont(f);
		
		fName.setForeground(new Color(0,0,102));
		mName.setForeground(new Color(0,0,102));
		fAge.setForeground(new Color(0,0,102));
		mAge.setForeground(new Color(0,0,102));
		fOcc.setForeground(new Color(0,0,102));
		mOcc.setForeground(new Color(0,0,102));
		add.setForeground(new Color(0,0,102));
		pincode.setForeground(new Color(0,0,102));
		state.setForeground(new Color(0,0,102));
		
		p3 = new JPanel();
		p3.add(fName);
		p3.add(fName_t);
		p3.add(mName);
		p3.add(mName_t);
		p3.add(fAge);
		p3.add(fAge_t);
		p3.add(mAge);
		p3.add(mAge_t);
		p3.add(fOcc);
		p3.add(fOcc_t);
		p3.add(mOcc);
		p3.add(mOcc_t);
		p3.add(add);
		p3.add(add_t);
		p3.add(pincode);
		p3.add(pincode_t);
		p3.add(state);
		p3.add(state_t);
		
		p3.setBounds(10,510,980,300);
		p3.setBackground(Color.WHITE);
		p3.setLayout(null);
		p3.setBorder(BorderFactory.createLineBorder(new Color(245,245,245), 1, false));
		
		h3.setBounds(50,830,700,30);
		h3.setFont(new Font("SANS-SERIF",Font.BOLD,15));
		h3.setOpaque(true);
		h3.setForeground(new Color(255,24,71));
		h3.setBackground(Color.WHITE);
		
		cWei = new JLabel("<HTML><font color = 'red'><b>*</b></font> CHILD'S WEIGHT [Kgs.]</HTML>");
		metDeli = new JLabel("<HTML><font color = 'red'><b>*</b></font> METHOD OF DELIVERY</HTML>");
		reli = new JLabel("<HTML><font color = 'red'><b>*</b></font> RELIGION</HTML>");
		
	
		cWei_t = new JTextField();
		reli_t = new JTextField();		
		
		metDeli_t = new JComboBox<String>();
		
		metDeli_t.addItem("-- SELECT --");
		metDeli_t.addItem("NORMAL");
		metDeli_t.addItem("CESAREAN");
		metDeli_t.addItem("FORCEPS");
		metDeli_t.addItem("VACCUM DELIVERY EPISIOTOMY");
		metDeli_t.addItem("LABOUR NATURAL");
		
		metDeli_t.setBackground(Color.white);
		
		cWei.setBounds(20,20,200,30);
		cWei_t.setBounds(250,20,200,30);
		metDeli.setBounds(500,20,200,30);
		metDeli_t.setBounds(750,20,200,30);
		reli.setBounds(20,80,200,35);
		reli_t.setBounds(250,80,200,30);
		
		cWei.setFont(f);
		metDeli.setFont(f);
		metDeli.setBackground(Color.white);
		metDeli.setOpaque(true);
		reli.setFont(f);
		
		cWei.setForeground(new Color(0,0,102));
		metDeli.setForeground(new Color(0,0,102));
		reli.setForeground(new Color(0,0,102));
		
		p4 = new JPanel();
		p4.add(cWei);
		p4.add(cWei_t);
		p4.add(metDeli);
		p4.add(metDeli_t);
		p4.add(reli);
		p4.add(reli_t);
		
		p4.setBounds(10,880,980,130);
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
		back.setForeground(Color.white);
		back.setOpaque(true);
		back.setFont(new Font("SANS-SERIF",Font.BOLD,15));
		
		
		submit.setBounds(300,1070,150,30);
		reset.setBounds(480,1070,150,30);
		back.setBounds(900,20,150,40);
		
		reset.addActionListener(this);
		
		
        back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MASTER.Bapp.setVisible(false);
				MASTER.Bmain.setVisible(true);
				
			}
		});
		
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
					

					mn.setDate(dob_t.getText().toString());
						
					if(mn.getDate().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PROPER DATE OF BIRTH");
					    break;
					}
					
					mn.setGender(str_gender);
					
					if(mn.getGender().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "SELECT CHILD'S GENDER");
					    break;
					}
					

					mn.setName(cName_t.getText().toString());
						
					if(mn.getName().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE CHILD'S NAME CORRECTLY");
					    break;
					}
					

					mn.setIdentification(Ide_t.getText().toString());
						
					if(mn.getIdentification().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PROPER IDENTIFICATION");
					    break;
					}

					mn.setFather_name(fName_t.getText().toString());
						
					if(mn.getFather_name().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE FATHER'S NAME CORRCTLY");
					    break;
					}
					
					mn.setMother_name(mName_t.getText().toString());
					
					if(mn.getMother_name().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE MOTHER'S NAME CORRCTLY");
					    break;
					}
					
					mn.setAge_father(fAge_t.getText().toString());
					
					if(mn.getAge_father().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE FATHER'S AGE CORRCTLY");
					    break;
					}
					
					
					mn.setAge_mother(mAge_t.getText().toString());
					
					if(mn.getAge_mother().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE MOTHER'S NAME CORRCTLY");
					    break;
					}
					
					mn.setFather_occupation(fOcc_t.getText().toString());
					
					if(mn.getFather_occupation().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE FATHER'S OCCUPATION CORRCTLY");
					    break;
					}
					
                   mn.setMother_occupation(mOcc_t.getText().toString());
					
					if(mn.getMother_occupation().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE MOTHER'S OCCUPATION CORRCTLY");
					    break;
					}
					
					mn.setChild_weight(cWei_t.getText().toString());
					
					if(mn.getChild_weight().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PROPER WEIGHT OF CHILD");
					    break;
					}
					
					mn.setMethod_of_delivery(metDeli_t.getSelectedItem().toString());
					
					if(mn.getMethod_of_delivery().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "SELECT METHOD OF DELIVERY");
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
					
					
					bool = false;
					BIRTHREGDATABASE db = new BIRTHREGDATABASE();
					db.birthreg(mn);
					
					dis_t.setText("");
					tp_t.setText("");
					mb_t.setText("");
					email_t.setText("");
					dob_t.setText("");
					cName_t.setText("");
					Ide_t.setText("");
					fName_t.setText("");
					mName_t.setText("");
					fAge_t.setText("");
					mAge_t.setText("");
					fOcc_t.setText("");
					mOcc_t.setText("");
					cWei_t.setText("");
					reli_t.setText("");
					pincode_t.setText("");
					state_t.setText("");
					add_t.setText("");
					
					metDeli_t.setSelectedIndex(0);
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
		dum.setBounds(80,80,1000,1120);
		dum.setBackground(Color.white);
        dum.setBorder(BorderFactory.createLineBorder(new Color(235,235,235), 1, false));
		
		jp = new JPanel();
		
		jp.add(title);
		jp.add(back);
		jp.add(dum);
		
		jp.setLayout(null);
		jp.setBounds(200,50,1000,600);
        jp.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
		
		panel = new JPanel();
		panel.add(jp);
		
        panel.setPreferredSize(new Dimension(200, 1200));
		
		panel.setLayout(null);
		jp.setLayout(null);
		jp.setBounds(0,0,1150,2250);
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
		new BirthApply();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == reset) {
			dis_t.setText("");
			tp_t.setText("");
			mb_t.setText("");
			email_t.setText("");
			dob_t.setText("");
			cName_t.setText("");
			Ide_t.setText("");
			fName_t.setText("");
			mName_t.setText("");
			fAge_t.setText("");
			mAge_t.setText("");
			fOcc_t.setText("");
			mOcc_t.setText("");
			cWei_t.setText("");
			reli_t.setText("");
			pincode_t.setText("");
			state_t.setText("");
			add_t.setText("");
			
			 metDeli_t.setSelectedIndex(0);
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
