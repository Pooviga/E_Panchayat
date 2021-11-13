import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewWaterConnection extends JFrame implements ActionListener{
	
	Container co;
	JPanel Mas,jp;
	JLabel s,topic;
	JButton submit,reset;
	JLabel dis,tp,mob,mail,hname,dno,wno,stname,ctype,pin,state;
	JTextField Dis,Tp,Mob,Mail,Hname,Dno,Wno,Stname,Pin,State;
	JComboBox<String> Ctype;
	JButton back;
	
	public NewWaterConnection()
	{
		
		setTitle("NEW WATER CONNECTION");
		
		co = getContentPane();
		co.setLayout(null);
		Mas = new JPanel();
		Font f1 = new Font(Font.SANS_SERIF,Font.BOLD,13);
		
		s = new JLabel("** ALL FIELDS ARE REQUIRED **");
		s.setOpaque(true);
		s.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
		s.setForeground(Color.red);
		s.setBackground(Color.white);
		
		topic = new JLabel("WATER CHARGES - NEW WATER CONNECTION");
		topic.setFont(new Font(Font.SANS_SERIF,Font.BOLD,18));
		topic.setForeground(new Color(0,0,102));
		topic.setBackground(Color.white);
		topic.setOpaque(true);
		
		dis = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font> DISTRICT</HTML>");
		tp = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font> TOWN PANCHAYAT</HTML>");
		mob = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font> MOBILE NUMBER</HTML>");
		mail = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font> E- MAIL</HTML>");
		hname = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font> FAMILY HEAD NAME</HTML>");
		dno = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font> DOOR NUMBER</HTML>");
		wno = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font> WARD NUMBER</HTML>");
		stname = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font> STREET NAME</HTML>");
		ctype = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font> CONNECTION TYPE</HTML>");
		pin = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font> PINCODE</HTML>");
		state = new JLabel("<HTML><font color = 'red' size  = '5'><b>*</b></font> STATE</HTML>");
		
		submit = new JButton("SUBMIT");
		reset = new JButton("RESET");
		back = new JButton("BACK");
		
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MASTER.Wmain.setVisible(true);
				MASTER.watconn.setVisible(false);
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
					
					mn.setDistrict(Dis.getText().toString());
					
					if(mn.getDistrict().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PROPER DISTRICT");
					    break;
					}
					

					mn.setTown_panchyat(Tp.getText().toString());
					
					if(mn.getTown_panchyat().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PROPER TOWN PANCHAYAT");
					    break;
					}
					
					mn.setNumber(Mob.getText().toString());
						
					if(mn.getNumber().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PROPER MOBILE NUMBER");
					    break;
					}
					

					mn.setEmail(Mail.getText().toString());
				
					if(mn.getEmail().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PROPER EMAIL");
					    break;
					}
					

					mn.setName(Hname.getText().toString());
						
					if(mn.getName().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE FAMILY HEAD'S NAME CORRECTLY");
					    break;
					}
					

					mn.setDoorno(Dno.getText().toString());
					
					if(mn.getDoorno().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PROPER DOOR NUMBER");
					    break;
					}
					
                    mn.setWardno(Wno.getText().toString());
					
					if(mn.getWardno().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PROPER WARD NUMBER");
					    break;
					}
					
					
                    mn.setConnection_type(Ctype.getSelectedItem().toString());
					
					if(mn.getConnection_type().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "SELECT NECESSARY CONNECTION TYPE");
					    break;
					}
					
					mn.setStreet_name(Stname.getText().toString());
					
					if(mn.getStreet_name().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PROPER STREET NAME");
					    break;
					}
					
					
					mn.setPincode(Pin.getText().toString());
					
					if(mn.getPincode().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PROPER PINCODE");
					    break;
					}
					
					mn.setState(State.getText().toString());
					
					if(mn.getState().isEmpty()) {
						JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PROPER STATE");
					    break;
					}
					
					
					bool = false;
                    WATERCONNDATABASE db = new WATERCONNDATABASE();
                    db.waterconn(mn);
                    
                    Dis.setText("");
        			Tp.setText("");
        			Mob.setText("");
        			Mail.setText("");
        			Hname.setText("");
        			Dno.setText("");
        			Wno.setText("");
        			Stname.setText("");
        			Pin.setText("");
        			State.setText("");
        			
        			Ctype.setSelectedIndex(0);
                    
					
				}
				
			}
		});
		
		dis.setForeground(new Color(0,0,102));
		tp.setForeground(new Color(0,0,102));
		mob.setForeground(new Color(0,0,102));
		mail.setForeground(new Color(0,0,102));
		hname.setForeground(new Color(0,0,102));
		dno.setForeground(new Color(0,0,102));
		wno.setForeground(new Color(0,0,102));
		stname.setForeground(new Color(0,0,102));
		ctype.setForeground(new Color(0,0,102));
		pin.setForeground(new Color(0,0,102));
		state.setForeground(new Color(0,0,102));

		
		dis.setFont(f1);
		tp.setFont(f1);
		mob.setFont(f1);
		mail.setFont(f1);
		hname.setFont(f1);
		dno.setFont(f1);
		wno.setFont(f1);
		stname.setFont(f1);
		ctype.setFont(f1);
		pin.setFont(f1);
		state.setFont(f1);
		
		Dis = new JTextField();
		Tp = new JTextField();
		Mob = new JTextField();
		Mail = new JTextField();
		Hname = new JTextField();
		Dno = new JTextField();
		Wno = new JTextField();
		Stname = new JTextField();
		Pin = new JTextField();
		State = new JTextField();
		
		Ctype = new JComboBox<String>();
		Ctype.setBackground(Color.white);
		Ctype.addItem("-- SELECT --");
		Ctype.addItem("DOMESTICS");
		Ctype.addItem("NON-DOMESTICS");
		Ctype.addItem("INDUSTRIES");
		
		topic.setBounds(100,0,900,20);
		s.setBounds(650,45,500,50);
		dis.setBounds(140,120,200,30);
		Dis.setBounds(380,120,300,30);
		tp.setBounds(820,120,200,30);
		Tp.setBounds(1090,120,300,30);
		mob.setBounds(140,180,200,30);
		Mob.setBounds(380,180,300,30);
		mail.setBounds(820,180,200,30);
		Mail.setBounds(1090,180,300,30);
		hname.setBounds(140,240,300,30);
		Hname.setBounds(380,240,1010,30);
		dno.setBounds(140,300,200,30);
		Dno.setBounds(380,300,300,30);
		wno.setBounds(820,300,200,30);
		Wno.setBounds(1090,300,300,30);
		ctype.setBounds(140,360,200,30);
		Ctype.setBounds(380,360,300,30);
		stname.setBounds(820,360,200,30);
		Stname.setBounds(1090,360,300,30);
		pin.setBounds(140,420,200,30);
		Pin.setBounds(380,420,300,30);
		state.setBounds(820,420,200,30);
		State.setBounds(1090,420,300,30);
	    submit.setBounds(650,500,150,40);
		reset.setBounds(450,500,150,40);
		back.setBounds(850,500,150,40);
		
		reset.addActionListener(this);
	    
		submit.setBackground(new Color(0,0,102));
		submit.setForeground(Color.WHITE);
		submit.setFont(new Font("SANS_SERIF",Font.BOLD,15));
		
	 	back.setBackground(new Color(0,0,102));
		back.setForeground(Color.WHITE);
		back.setFont(new Font("SANS_SERIF",Font.BOLD,15));
		
		reset.setBackground(new Color(0,0,102));
		reset.setForeground(Color.WHITE);
		reset.setFont(new Font("SANS_SERIF",Font.BOLD,15));
		
		jp = new JPanel();
		jp.setLayout(null);
		jp.setBounds(0,150,1600,700);
		
		Mas.add(s);
		Mas.add(submit);
		Mas.add(reset);
		Mas.add(back);
		
		Mas.add(dis);
		Mas.add(tp);
		Mas.add(mob);
		Mas.add(mail);
		Mas.add(hname);
		Mas.add(dno);
		Mas.add(wno);
		Mas.add(stname);
		Mas.add(pin);
		Mas.add(state);
		Mas.add(ctype);
		
		Mas.add(Dis);
		Mas.add(Tp);
		Mas.add(Mob);
		Mas.add(Mail);
		Mas.add(Hname);
		Mas.add(Dno);
		Mas.add(Wno);
		Mas.add(Stname);
		Mas.add(Pin);
		Mas.add(State);
		Mas.add(Ctype);
		
		Mas.setLayout(null);
		Mas.setBackground(Color.white);
		Mas.setBounds(15,30,1500,580);
		Mas.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
		
		
		jp.add(topic);
		jp.add(Mas);
		jp.setBackground(Color.white);
		co.add(jp);
//		setVisible(true);
//		setSize(2000,2000);
	}
	public static void main(String[] args) {
		new NewWaterConnection();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == reset) {
			Dis.setText("");
			Tp.setText("");
			Mob.setText("");
			Mail.setText("");
			Hname.setText("");
			Dno.setText("");
			Wno.setText("");
			Stname.setText("");
			Pin.setText("");
			State.setText("");
			
			Ctype.setSelectedIndex(0);
		}
		
	}
}