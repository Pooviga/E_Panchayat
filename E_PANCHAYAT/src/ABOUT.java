import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ABOUT extends JFrame {
	
	JLabel h1,h2,t1,tt1,t2,tt2,t3,tt3,t4,tt4,t5,tt5,t6,tt6,t7,tt7,t8,tt8,t9,tt9,t10,tt10;
	JPanel jp,panel;
	JScrollPane sp;
	Container co;
	public ABOUT() {
		
		setTitle("ABOUT");
		
		co = getContentPane();
		co.setLayout(null);
		
		h1 = new JLabel("ABOUT US");
		
		t1 = new JLabel("INFORMATION");
		
		tt1 = new JLabel("<HTML><p style=\"line-height: 150%;justify-content: center;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "Tamil Nadu is the first State to have introduced a classification in the status of local bodies as ‘Town Panchayat’,"
				+ " which was planned as a transitional body between Rural and Urban Local Bodies."
				+ "<br><br>"
				+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The Town Panchayats were conferred with individual administrative powers and unique functional characters have "
				+ "been in existence for over a century. The Town Panchayats adopt well devised accounting and auditing procedures and "
				+ "the service delivery to the public has been better. Town Panchayats are under the administrative control Municipal "
				+ "Administration and Water Supply Department, at Govt. level."
				+ "<br><br>"
				+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The Town Panchayats are places of importance such as Division / Taluk headquarters, Tourist Spots, Pilgrim Centers"
				+ " and Commercial/Industrial towns. This has necessitated special attention to the civic needs of the Town Panchayats.</p></HTML>");
		
		
		
		t2 = new JLabel("IMPORTANCE OF THE DEPARTMENT");
		tt2 = new JLabel("<HTML><p style=\"line-height: 150%;justify-content: center;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "Town Panchayats are drivers of economic growth and offer opportunities for social and cultural development of people. "
				+ "The Total population of the Town Panchayats is 70,89,528, which accounts for 11.36% of the total population of the State as "
				+ "per 2001 Census and 25.80% in Urban Population. There has been huge flow of floating population to all these towns from adjoining "
				+ "rural areas. Many of the Town Panchayats are of Tourism, Pilgrim importance and heritage towns and also the economic, industrial clusters. "
				+ "It is therefore, necessary to provide adequate infrastructure facilities such as water supply, sanitation, roads, street lighting and "
				+ "other public amenities such as Slaughter houses, Burial / Cremation Ground, bus stands, Shandies. The Government proposes to adopt a "
				+ "holistic approach covering all civic amenities and infrastructure to these towns.</p></HTML>");
		
		t3 = new JLabel("ACTIVITIES OF THE DEPARTMENT");
		tt3 = new JLabel("<HTML><p style=\"line-height: 150%;justify-content: center;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "Town Panchayats Department formulates and implements responsive programmes, services and activities to facilitate urban "
				+ "communities to bring about positive change and strengthen their social and economic fabrics. In this effort the department "
				+ "has very effectively used all the available resources, funds and grants that have been provided under various schemes by "
				+ "Government of India, besides adding State Financial resources wherever needed, and funds and financial resources are ploughed "
				+ "into the developmental efforts of Town Panchayats for better delivery of cure amenities.</p></HTML>");
		
		t4 = new JLabel("OBJECTIVE AND GOAL OF TOWN PANCHAYAT DEPARTMENT:");
		tt4 = new JLabel("<HTML><p style=\"line-height: 150%;justify-content: center;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "To ensure responsive, accountable, transparent and people-friendly civic administration.<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "To develop administration that takes the citizens into total confidence, in all the schemes implementation in Town Panchayats.</p></HTML>");
		
		
		h2 = new JLabel("ADMINISTRATIVE SET UP");
		
		t5 = new JLabel("I. STATE LEVEL");
		tt5 = new JLabel("<HTML><p style=\"line-height: 150%;justify-content: center;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "The Secretary to Government, Municipal Administration and Water Supply Department is in charge of Town Panchayats, as "
				+ "Administrative head at Secretariat and the Director of Town Panchayats is the Head of Department (HOD) at State level and"
				+ " he is also Inspector of Town Panchayats, to review and monitor the activities relating to the development programmes "
				+ "implemented through Town Panchayats.</p></HTML>");
		
		
		t6 = new JLabel("II. DISTRICT LEVEL / ZONE LEVEL");
		tt6 = new JLabel("<HTML><p style=\"line-height: 150%;justify-content: center;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "The Collectors are the administrative head of Town Panchayat Administration at "
				+ "District Level and he is assisted by a Zonal Assistant Director of Town Panchayats.</p></HTML>");
		
		t7 = new JLabel("III. TOWN PANCHAYATS LEVEL");
		tt7 = new JLabel("<HTML><p style=\"line-height: 150%;justify-content: center;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "Executive Officer of the Town Panchayats is the Executive authority of the Town Panchayat. He is assisted by Head Clerk, "
				+ "Junior Assistant, Bill Collector, Typist for the maintenance of records, Collection of taxes, maintenance of assets and "
				+ "in ensuring the publicity and propaganda and in implementation of Government Programmes.</p></HTML>");
		
		
		t8 = new JLabel("FUNCTIONS OF TOWN PANCHAYAT");
		tt8 = new JLabel("<HTML><p style=\"line-height: 150%;justify-content: center;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "The Town Panchayats are responsible in delivery of the following civic services:"
				+ "<ul><li>Providing Basic Amenties</li><li>Roads</li><li>Street Lights</li>\r\n"
				+ "<li>Water Supply</li>"
				+ "<li>Public Health</li>"
				+ "<li>Drainage</li>"
				+ "<li>Granting of Building Licenses</li>"
				+ "<li>Levying of Taxes</li>"
				+ "<li>Property Tax</li>"
				+ "<li>Vacant Land Tax</li>"
				+ "<li>Profession Tax</li>"
				+ "<li>Non Tax</li>"
				+ "<li>Water Charges</li>"
				+ "<li>Issuing Birth & Death Certificates</li>"
				+ "<li>Issuing Dangerous & Offensive Trade Licenses</li>"
				+ "<li>Implementation of State / Central Schemes</li><ul></p></HTML>");
		
		t9 = new JLabel("SOURCES OF REVENUE OF TOWN PANCHAYATS");
		tt9 = new JLabel("<HTML><p style=\"line-height: 150%;justify-content: center;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "The revenue of the Town Panchayats is derived from the sources as below:"
				+ "<ul><li>Property Tax</li>"
				+ "<li>Professional Tax</li>"
				+ "<li>License Fees, Rents and other charges such as water charges</li>"
				+ "<li>Surcharge on Stamp duty</li>"
				+ "<li>Devolution grants from the Government</li>"
				+ "<li>Other miscellaneous incomes such as interest on deposits</li></ul></p></HTML>");
		
		t10 = new JLabel("FUNCTIONS OF ACCOUNTS IN TOWN PANCHAYATS");
		tt10 = new JLabel("<HTML><p style=\"line-height: 150%;justify-content: center;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "<ul><li>Maintenance of Annual Accounts</li>"
				+ "<li>Preparation of Annual Budget</li>"
				+ "<li>Implementation of Annual plans and in case of any deficit, revised estimate is prepared</li>"
				+ "<li>The Bills showing the expenditure details are scrutinized carefully and amount settled by issuing cheques</li>"
				+ "<li>The loans and grants received from Government and non-Governmental organization are utilized for the Developmental works."
				+ " Loans are also promptly repaid in due installments</li>"
				+ "<li>The Funds distribution for the Town Panchayats by the 10th & 11th Finance Commissions are specifically spent under the respective Heads only for which it is allotted</li>"
				+ "<li>The funds allotted under MLA funds, MP Fund , MP Fund are received and spent for the development works approved "
				+ "and sanctioned by them. The Bills submitted by the contractis for undertaking works are also scrutinized carefully and passed by issuing cheques</li>"
				+ "<li>The grants for the particular plans and the loans taken for implementation of the plans are also utilized for passing of the Bills submitted by "
				+ "the contractors. This the amount is settled by issuing of cheques</li></ul></p></HTML>");
		
		h1.setBounds(40,30,200,40);
		h1.setForeground(new Color(0,0,102));
		h1.setFont(new Font("SANS-SERIF",Font.BOLD,25));
		
		t1.setBounds(80,80,200,20);
		t1.setFont(new Font("SANS-SERIF",Font.BOLD,16));
		tt1.setBounds(80,120,1000,200);
		tt1.setFont(new Font("SANS-SERIF",Font.PLAIN,16));
		
		t2.setBounds(80,350,500,20);
		t2.setFont(new Font("SANS-SERIF",Font.BOLD,16));
		tt2.setBounds(80,380,1000,160);
		tt2.setFont(new Font("SANS-SERIF",Font.PLAIN,16));
		
		t3.setBounds(80,560,500,20);
		t3.setFont(new Font("SANS-SERIF",Font.BOLD,16));
		tt3.setBounds(80,600,1000,100);
		tt3.setFont(new Font("SANS-SERIF",Font.PLAIN,16));
		
		t4.setBounds(80,720,800,20);
		t4.setFont(new Font("SANS-SERIF",Font.BOLD,16));
		tt4.setBounds(80,740,1000,100);
		tt4.setFont(new Font("SANS-SERIF",Font.PLAIN,16));
		
		h2.setBounds(60,860,600,20);
		h2.setForeground(new Color(0,0,102));
		h2.setFont(new Font("SANS-SERIF",Font.BOLD,20));
		
		t5.setBounds(80,900,800,20);
		t5.setFont(new Font("SANS-SERIF",Font.BOLD,16));
		tt5.setBounds(80,920,1000,100);
		tt5.setFont(new Font("SANS-SERIF",Font.PLAIN,16));
		
		t6.setBounds(80,1030,800,20);
		t6.setFont(new Font("SANS-SERIF",Font.BOLD,16));
		tt6.setBounds(80,1040,1000,80);
		tt6.setFont(new Font("SANS-SERIF",Font.PLAIN,16));
		
		t7.setBounds(80,1140,800,20);
		t7.setFont(new Font("SANS-SERIF",Font.BOLD,16));
		tt7.setBounds(80,1150,1000,100);
		tt7.setFont(new Font("SANS-SERIF",Font.PLAIN,16));
		
		t8.setBounds(80,1260,800,20);
		t8.setFont(new Font("SANS-SERIF",Font.BOLD,16));
		tt8.setBounds(80,1290,1000,400);
		tt8.setFont(new Font("SANS-SERIF",Font.PLAIN,16));
		
		t9.setBounds(80,1680,800,20);
		t9.setFont(new Font("SANS-SERIF",Font.BOLD,16));
		tt9.setBounds(80,1700,1000,200);
		tt9.setFont(new Font("SANS-SERIF",Font.PLAIN,16));
		
		t10.setBounds(80,1900,800,20);
		t10.setFont(new Font("SANS-SERIF",Font.BOLD,16));
		tt10.setBounds(80,1900,1000,300);
		tt10.setFont(new Font("SANS-SERIF",Font.PLAIN,16));
		
		
		jp = new JPanel();
		
        
		jp.add(h1);
		jp.add(t1);
		jp.add(tt1);
		jp.add(t2);
		jp.add(tt2);
		jp.add(t3);
		jp.add(tt3);
		jp.add(t4);
		jp.add(tt4);
		jp.add(h2);
		jp.add(t5);
		jp.add(tt5);
		jp.add(t6);
		jp.add(tt6);
		jp.add(t7);
		jp.add(tt7);
		jp.add(t8);
		jp.add(tt8);
		jp.add(t9);
		jp.add(tt9);
		jp.add(t10);
		jp.add(tt10);
		
        jp.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
		
		panel = new JPanel();
		panel.add(jp);
		
        panel.setPreferredSize(new Dimension(200, 2270));
		
		panel.setLayout(null);
		jp.setLayout(null);
		jp.setBounds(0,0,1150,2250);
		jp.setBackground(Color.white);
		panel.setBackground(Color.white);
		
		sp = new JScrollPane(panel);
		sp.setVisible(true);
		sp.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1, false));
		sp.setBounds(180,180,1350,600);
		
		
		co.add(sp,BorderLayout.CENTER);
		
//		setVisible(true);
//		setSize(2000,2000);
	}
	
	public static void main(String[] args) {
		new ABOUT();
	}

}
