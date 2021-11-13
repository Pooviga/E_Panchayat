import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class TaxCal extends JFrame implements ActionListener{
	
	JLabel title,dis,tp,builLoc,builUsage,builType,builAge,taxType,TotalArea;
	JTextField dis_t,tp_t,tA_t;
	JComboBox<String> builLoc_t,builUsage_t,builType_t,builAge_t,taxType_t;
	JPanel p1,p2,jp,panel;
	JScrollPane sp;
	private TableColumn tColumn;
	JButton gen,res,back;
	Container co;
	String t1="",t2="",t3="",t4="",t5="",t6="",t7="",t8="",t9="",t10="",t11="",t12="",t13="",t14="",t15="",t16="",t17="";
	
	
	public TaxCal() throws Exception{
		
		setTitle("PROPERTY TAX - TAX CALCULATOR");
		
		co = getContentPane();
		co.setLayout(null);
		
		title = new JLabel("PROPERTY TAX - TAX CALCULATOR");
		title.setFont(new Font("SANS-SERIF",Font.BOLD,23));
		title.setForeground(new Color(0,0,102));
		
		dis = new JLabel("<HTML><font color = 'red'><b>*</b></font> DISTRICT</HTML>");
		tp = new JLabel("<HTML><font color = 'red'><b>*</b></font> TOWN PANCHAYAT");
		builLoc = new JLabel("<HTML><font color = 'red'><b>*</b></font> BUILDING LOCATION</HTML>");
		builUsage = new JLabel("<HTML><font color = 'red'><b>*</b></font> BUILDING USAGE</HTML>");
		builType = new JLabel("<HTML><font color = 'red'><b>*</b></font> BUILDING TYPE</HTML>");
		builAge = new JLabel("<HTML><font color = 'red'><b>*</b></font> BUILDING AGE</HTML>");
		taxType = new JLabel("<HTML><font color = 'red'><b>*</b></font> TAX TYPE</HTML>");
		TotalArea = new JLabel("<HTML><font color = 'red'><b>*</b></font> TOTAL AREA</HTML>");
		
		dis_t = new JTextField();
		tp_t = new JTextField();
		
		builLoc_t = new JComboBox<String>();
		builLoc_t.setBackground(Color.white);
		
		builLoc_t.addItem("-- SELECT --");
		builLoc_t.addItem(" A Zone");
		builLoc_t.addItem(" B Zone");
		builLoc_t.addItem(" C Zone");
		
		builUsage_t= new JComboBox<String>();
		builUsage_t.setBackground(Color.white);
		
		builUsage_t.addItem("-- SELECT --");
		builUsage_t.addItem(" Own Residence");
		builUsage_t.addItem(" Rent");
		builUsage_t.addItem(" Industrial");
		builUsage_t.addItem(" Commercial");
		
		builType_t = new JComboBox<String>();
		builType_t.setBackground(Color.white);
		
		builType_t.addItem("-- SELECT --");
		builType_t.addItem(" Rcc Roof");
		builType_t.addItem(" Thatched Roof");
		builType_t.addItem(" Madras Terrace");
		builType_t.addItem(" Tiled");
		builType_t.addItem(" Zinc Sheet");
		
		builAge_t = new JComboBox<String>();
		builAge_t.setBackground(Color.white);
		
		builAge_t.addItem("-- SELECT --");
		builAge_t.addItem(" Below 5 Years");
		builAge_t.addItem(" 5 to 15 Years");
		builAge_t.addItem(" 15 to 25 Years");
		builAge_t.addItem(" Above 25 Years");
		
		taxType_t= new JComboBox<String>();
		taxType_t.setBackground(Color.white);
		
		taxType_t.addItem("-- SELECT --");
		taxType_t.addItem(" ALL WARD");
		
		tA_t = new JTextField();
		
		gen = new JButton("GENERATE");
		gen.setFont(new Font("SANS-SERIF",Font.BOLD,15));
		gen.setBackground(new Color(0,0,102));
		gen.setForeground(Color.WHITE);
		
		res = new JButton("RESET");
		res.setFont(new Font("SANS-SERIF",Font.BOLD,15));
		res.setBackground(new Color(0,0,102));
		res.setForeground(Color.WHITE);
		
		back = new JButton("BACK");
		back.setBackground(new Color(0,0,102));
		back.setForeground(Color.white);
		back.setOpaque(true);
		back.setFont(new Font("SANS-SERIF",Font.BOLD,15));
		
		
		dis.setFont(new Font("SANS-SERIF",Font.BOLD,15));
		dis.setForeground(new Color(0,0,102));
		
		tp.setFont(new Font("SANS-SERIF",Font.BOLD,15));
		tp.setForeground(new Color(0,0,102));
		
		builLoc.setFont(new Font("SANS-SERIF",Font.BOLD,15));
		builLoc.setForeground(new Color(0,0,102));
		
		builUsage.setFont(new Font("SANS-SERIF",Font.BOLD,15));
		builUsage.setForeground(new Color(0,0,102));
		
		builType.setFont(new Font("SANS-SERIF",Font.BOLD,15));
		builType.setForeground(new Color(0,0,102));
		
		builAge.setFont(new Font("SANS-SERIF",Font.BOLD,15));
		builAge.setForeground(new Color(0,0,102));
		
		taxType.setFont(new Font("SANS-SERIF",Font.BOLD,15));
		taxType.setForeground(new Color(0,0,102));
		
		TotalArea.setFont(new Font("SANS-SERIF",Font.BOLD,15));
		TotalArea.setForeground(new Color(0,0,102));
		
		
		dis.setBounds(50,20,200,30);
		dis_t.setBounds(230,20,200,30);
		tp.setBounds(500,20,200,30);
		tp_t.setBounds(680,20,200,30);
		
		builLoc.setBounds(50,70,200,30);
		builLoc_t.setBounds(230,70,200,30);
		builUsage.setBounds(500,70,200,30);
		builUsage_t.setBounds(680,70,200,30);
		
		builType.setBounds(50,120,200,30);
		builType_t.setBounds(230,120,200,30);
		builAge.setBounds(500,120,200,30);
		builAge_t.setBounds(680,120,200,30);
		
		taxType.setBounds(50,170,200,30);
		taxType_t.setBounds(230,170,200,30);
		TotalArea.setBounds(500,170,200,30);
		tA_t.setBounds(680,170,200,30);
		
		gen.setBounds(300,250,150,40);
		res.setBounds(500,250,150,40);
		
		
		p1 = new JPanel();
		p1.setLayout(null);
		p1.setBackground(Color.white);
        p1.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
		
		p1.add(dis);
		p1.add(dis_t);
		p1.add(tp);
		p1.add(tp_t);
		p1.add(builLoc);
		p1.add(builLoc_t);
		p1.add(builUsage);
		p1.add(builUsage_t);
		p1.add(builType);
		p1.add(builType_t);
		p1.add(builAge);
		p1.add(builAge_t);
		p1.add(taxType);
		p1.add(taxType_t);
		p1.add(TotalArea);
		p1.add(tA_t);
		p1.add(gen);
		p1.add(res);
		
        jp = new JPanel();
		
        title.setBounds(50,20,900,30);
        back.setBounds(1000,15,100,40);
        
        back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				MASTER.PTC.setVisible(false);
				MASTER.home.setVisible(true);
				
			}
		});
        
        res.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dis_t.setText("");
				tp_t.setText("");
				builLoc_t.setSelectedIndex(0);
				builUsage_t.setSelectedIndex(0);
				builType_t.setSelectedIndex(0);
				builAge_t.setSelectedIndex(0);
				taxType_t.setSelectedIndex(0);
				tA_t.setText("");
			}
		});
        
        p1.setBounds(100,70,1000,330);
        
        
        gen.addActionListener(this);
        
        
        p2 = new JPanel();
		p2.setBounds(100,450,1000,687);
		p2.setBackground(Color.white);
        
        
		jp.add(title);
		jp.add(back);
		jp.add(p1);
		jp.add(p2);
		
		jp.setLayout(null);
		jp.setBounds(0,0,1150,1200);
		jp.setBackground(Color.white);
        jp.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
		
		panel = new JPanel();
		panel.add(jp);		
        panel.setPreferredSize(new Dimension(200, 1300));		
		panel.setLayout(null);		
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
	
	public static void main(String[] args) throws Exception{
		new TaxCal();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == gen) {
			boolean bool = true;
	
			while(bool) {
				
				if(dis_t.getText().toString().isEmpty()) {
					JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PROPER DISTRICT");
					break;
				}
				
				if(tp_t.getText().toString().isEmpty()) {
					JOptionPane.showMessageDialog(MASTER.co, "PROVIDE PROPER TOWN PANCHAYAT");
					break;
				}
				
				if(builLoc_t.getSelectedItem().toString().equals("-- SELECT --")) {
					JOptionPane.showMessageDialog(MASTER.co, "SELECT YOUR BUILDING LOCATION");
					break;
				}
				
				if(builUsage_t.getSelectedItem().toString().equals("-- SELECT --")) {
					JOptionPane.showMessageDialog(MASTER.co, "SELECT YOUR BUILDING USAGE");
					break;
				}
				
				if(builType_t.getSelectedItem().toString().equals("-- SELECT --")) {
					JOptionPane.showMessageDialog(MASTER.co, "SELECT YOUR BUILDING TYPE");
					break;
				}
				
				if(builAge_t.getSelectedItem().toString().equals("-- SELECT --")) {
					JOptionPane.showMessageDialog(MASTER.co, "SELECT YOUR BUILDING AGE");
					break;
				}
				
				if(taxType_t.getSelectedItem().toString().equals("-- SELECT --")) {
					JOptionPane.showMessageDialog(MASTER.co, "SELECT YOUR TAX TYPE");
					break;
				}
				
				if(tA_t.getText().toString().isEmpty()) {
					JOptionPane.showMessageDialog(MASTER.co, "PROVIDE TOTAL AREA IN Sq.Ft");
					break;
				}
				
				t1 = builLoc_t.getSelectedItem().toString();
		        t2 = builUsage_t.getSelectedItem().toString();
		        double tR = 0;
		        
		        if(t1.equals(" A Zone")) {
		        	tR = 1.30;
		        }
		        else if(t1.equals(" B Zone")) {
		        	tR = 1.05;
		        }
		        else if(t1.equals(" C Zone")) {
		        	tR = 0.90;
		        }
		        
		        t3 = Double.toString(tR);
		        
		        double Area = Double.parseDouble(tA_t.getText().toString());
		        
		        double MR = tR*Area;
		        
		        t4 = Double.toString((MR));
		        
		        double AR = MR*12;
		        
		        t5 = Double.toString(AR);
		        
		        double PV = AR*(0.1666666666666666);
		        
		        t6 = Double.toString(PV);
		        
		        double BV = AR-PV;
		        
		        t7 = Double.toString(BV);
		        
		        double Main = BV*10/100;
		        
		        t8 = Double.toString(Main);
		        
		        double BaVa = AR - Main;
		        
		        t9 = Double.toString(BaVa);
		        
		        String bAge = builAge_t.getSelectedItem().toString();
		        
		        double disAge = 0;
		        
		        if(bAge.equals(" Below 5 Years")) {
		        	disAge = BaVa;
		        }
		        
		        else if(bAge.equals(" 5 to 15 Years")) {
		        	disAge = BaVa*10/100;
		        }
		        
		        else if(bAge.equals(" 15 to 25 Years")) {
		        	disAge = BaVa*15/100;
		        }
		        
		        else if(bAge.equals(" Above 25 Years")) {
		        	disAge = BaVa*20/100;
		        }
		        
		        t10 = Double.toString(disAge);
		        
		        String bType = builType_t.getSelectedItem().toString();
		        
		        double disType = 0;
		        
		        if(bType.equals(" Rcc Roof")) {
		        	disType = BaVa*1/100;
		        }
		        
		        else if(bType.equals(" Thatched Roof")) {
		        	disType = BaVa*4/100;
		        }
		        
		        else if(bType.equals(" Madras Terrace")) {
		        	disType = BaVa*5/100;
		        }
		        
		        else if(bType.equals(" Tiled")) {
		        	disType = BaVa*6/100;
		        }
		        
		        else if(bType.equals(" Zinc Sheet")) {
		        	disType = BaVa*7/100;
		        }
		        
		        t11 = Double.toString(disType);
		        
		        double AV = (BaVa - (disAge+disType));
		        
		        t12 = Double.toString(AV);
		        
		        double GT = AV*10/100;
		        
		        t13 = Double.toString(GT);
		        
		        double LC = GT*10/100;
		        
		        t14 = Double.toString(LC);
		        
		        double ET = AV*0;
		        
		        t15 = Double.toString(ET);
		        
		        double PT = (GT + LC + ET);
		        
		        t16 = Double.toString(PT);
		        
		        double Penalty = 0;
		        
		        double TT = Penalty + PT;
		        
		        t17 = Double.toString(TT);
		        
		        String data[][]={ {"   Zone","  "+t1},    
		                {"   Building Usage","  "+t2},    
		                {"   Tax Rate (Zone X Usage) (per Sq.Ft)","  "+t3},
		                {"   Monthly Rental value (Building Area X Zone Basic Value)","  "+t4},
		                {"   Annual Rental value (Monthly Rental value X 12)","  "+t5},
		                {"   Plot Value (Annual Rental Value X (1/6))","  "+t6},
		                {"   Building Value (Annual Rental Value - Plot Value)","  "+t7},
		                {"   Maintenance Of Building (10% of Building Value)","  "+t8},
		                {"   Basic Value (Annual Rental Value - Maintanence Of Building)","  "+t9},
		                {"   Discount for Building Age","  "+t10},
		                {"   Discount for Building Type","  "+t11},
		                {"   Annual Value (Basic Value - (Age Discount + Type Discount))","  "+t12},
		                {"   General Tax (Annual Value X 10%)","  "+t13},
		                {"   Library Cess (General Tax X 10%)","  "+t14},
		                {"   Education Tax (Annual Value X 0%)","  "+t15},
		                {"   Property Tax (General Tax + Library Cess + Education Tax)","  "+t16},
		                {"   Total Tax (Property Tax + Penalty)","  "+t17}
		                };    
		        String column[]={"Attributes","Details"};       
		        
		        JTable jt = new JTable(data,column);
		        
		        
		        TableColumnModel columnModel = jt.getColumnModel();
		        jt.setRowHeight(40);
		        columnModel.getColumn(0).setPreferredWidth(499);
		        columnModel.getColumn(1).setPreferredWidth(500);
		        
		        tColumn = jt.getColumnModel().getColumn(1);
		        tColumn.setCellRenderer(new ColumnColorRenderer(Color.white, Color.blue));
		 
		        jt.setFont(new Font("calibri", Font.BOLD, 18));
		        
		        p2.add(jt);
		        p2.setBorder(BorderFactory.createLineBorder(Color.black, 1, false));
				bool = false;
		        
			   }
	    }
		
	}

}

class ColumnColorRenderer extends DefaultTableCellRenderer{
	   Color backgroundColor, foregroundColor;
	   public ColumnColorRenderer(Color backgroundColor, Color foregroundColor) {
	      super();
	      this.backgroundColor = backgroundColor;
	      this.foregroundColor = foregroundColor;
	   }
	 
	   public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,   boolean hasFocus, int row, int column) {
	      Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
	      cell.setBackground(backgroundColor);
	      cell.setForeground(foregroundColor);
	      return cell;
	   }
	}
