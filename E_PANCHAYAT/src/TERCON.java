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

public class TERCON extends JFrame {
	
	JLabel h1,h2,t1,tt1,t2,tt2,t3,tt3,t4,tt4,t5,tt5,t6,tt6,t7,tt7,t8,tt8,t9;
	JPanel jp;
	JPanel panel;
	JScrollPane sp;
	Container co;
	public TERCON() {
		
		
		setTitle("TERMS AND CONNECTION");
		
		co = getContentPane();
		co.setLayout(null);
		
		h1 = new JLabel("TERMS & CONDITIONS");
		
		t1 = new JLabel("1. TERMS");
		
		tt1 = new JLabel("<HTML><p style=\"line-height: 150%;justify-content: center;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "By accessing this web site, you are agreeing to be bound by these web site Terms and Conditions of Use, all applicable laws and "
				+ "regulations, and agree that you are responsible for compliance with any applicable local laws. If you do not agree with any of "
				+ "these terms, you are prohibited from using or accessing this site. The materials contained in this web site are protected by "
				+ "applicable copyright and trade mark law.</p></HTML>");
		
		
		
		t2 = new JLabel("2. USE LICENSE");
		tt2 = new JLabel("<HTML><p style=\"line-height: 150%;justify-content: center;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "a. Permission is granted to temporarily download one copy of the materials (information or software) on Prematix Software Solution's"
				+ " web site for personal, non-commercial transitory viewing only. This is the grant of a license, not a transfer of title, and under this license you may not:"
				+ "<ul><li>Modify or copy the materials;</li>"
				+ "<li>Use the materials for any commercial purpose, or for any public display (commercial or non-commercial);</li>"
				+ "<li>Attempt to decompile or reverse engineer any software contained on Prematix Software Solution's web site;</li>"
				+ "<li>Remove any copyright or other proprietary notations from the materials; or</li>"
				+ "<li>Transfer the materials to another person or \"mirror\" the materials on any other server.</ul></li>"
				+ "b. This license shall automatically terminate if you violate any of these restrictions and may be "
				+ "terminated by Prematix Software Solution at any time. Upon terminating your viewing of these materials or upon the termination of this"
				+ " license, you must destroy any downloaded materials in your possession whether in electronic or printed format.</p></HTML>");
		
		t3 = new JLabel("3. DISCLAIMER");
		tt3 = new JLabel("<HTML><p style=\"line-height: 150%;justify-content: center;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "The materials on Prematix Software Solution's web site are provided \"as is\". Prematix Software Solution makes no warranties,"
				+ " expressed or implied, and hereby disclaims and negates all other warranties, including without limitation, implied warranties "
				+ "or conditions of merchantability, fitness for a particular purpose, or non-infringement of intellectual property or other violation "
				+ "of rights. Further, Prematix Software Solution does not warrant or make any representations concerning the accuracy, likely results, "
				+ "or reliability of the use of the materials on its Internet web site or otherwise relating to such materials or on any sites linked to this site.</p></HTML>");
		
		t4 = new JLabel("4. LIMITATIONS");
		tt4 = new JLabel("<HTML><p style=\"line-height: 150%;justify-content: center;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "In no event shall Prematix Software Solution or its suppliers be liable for any damages (including, without limitation, damages "
				+ "for loss of data or profit, or due to business interruption,) arising out of the use or inability to use the materials on Prematix "
				+ "Software Solution's Internet site, even if Prematix Software Solution or a Prematix Software Solution authorized representative has "
				+ "been notified orally or in writing of the possibility of such damage. Because some jurisdictions do not allow limitations on implied "
				+ "warranties, or limitations of liability for consequential or incidental damages, these limitations may not apply to you.</p></HTML>");
		
		t5 = new JLabel("5. REVISIONS AND ERRATA");
		tt5 = new JLabel("<HTML><p style=\"line-height: 150%;justify-content: center;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "The materials appearing on Prematix Software Solution's web site could include technical, typographical, or photographic errors. "
				+ "Prematix Software Solution does not warrant that any of the materials on its web site are accurate, complete, or current. Prematix "
				+ "Software Solution may make changes to the materials contained on its web site at any time without notice. Prematix Software "
				+ "Solution does not, however, make any commitment to update the materials.</p></HTML>");
		
		t6 = new JLabel("6. LINKS");
		tt6 = new JLabel("<HTML><p style=\"line-height: 150%;justify-content: center;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "Prematix Software Solution has not reviewed all of the sites linked to its Internet web site and is not responsible for "
				+ "the contents of any such linked site. The inclusion of any link does not imply endorsement by Prematix Software Solution "
				+ "of the site. Use of any such linked web site is at the user's own risk.</p></HTML>");
		
		t7 = new JLabel("7. SITE TERMS OF USE MODIFICATIONS");
		tt7 = new JLabel("<HTML><p style=\"line-height: 150%;justify-content: center;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "Prematix Software Solution may revise these terms of use for its web site at any time without notice. By using this web site"
				+ " you are agreeing to be bound by the then current version of these Terms and Conditions of Use.</p></HTML>");
		
		t8 = new JLabel("8. GOVERNING LAW");
		tt8 = new JLabel("<HTML><p style=\"line-height: 150%;justify-content: center;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "Any claim relating to Prematix Software Solution's web site shall be governed by the laws of the State of Tamilnadu without "
				+ "regard to its conflict of law provisions. General Terms and Conditions applicable to Use of a Web Site.</p></HTML>");
		
		
		h2 = new JLabel("PRIVACY POLICY");
		
		t9 = new JLabel("<HTML><p style=\"line-height: 150%;justify-content: center;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "* Your privacy is very important to us. Accordingly, we have developed this Policy in order for you to understand how we collect, use, communicate and disclose and make use of personal information. The following outlines our privacy policy.\r\n"
				+ "<br>"
				+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "* Before or at the time of collecting personal information, we will identify the purposes for which information is being collected.\r\n"
				+ "<br>"
				+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "* We will collect and use of personal information solely with the objective of fulfilling those purposes specified by us and for other compatible purposes, unless we obtain the consent of the individual concerned or as required by law.\r\n"
				+ "<br>"
				+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "* We will only retain personal information as long as necessary for the fulfillment of those purposes.\r\n"
				+ "<br>"
				+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "* We will collect personal information by lawful and fair means and, where appropriate, with the knowledge or consent of the individual concerned.\r\n"
				+ "<br>"
				+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "* Personal data should be relevant to the purposes for which it is to be used, and, to the extent necessary for those purposes, should be accurate, complete, and up-to-date.\r\n"
				+ "<br>"
				+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "* We will protect personal information by reasonable security safeguards against loss or theft, as well as unauthorized access, disclosure, copying, use or modification.\r\n"
				+ "<br>"
				+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "* We will make readily available to customers information about our policies and practices relating to the management of personal information.</p></HTML>");
		
		h1.setBounds(40,30,1000,40);
		h1.setForeground(new Color(0,0,102));
		h1.setFont(new Font("SANS-SERIF",Font.BOLD,25));
		
		t1.setBounds(80,90,200,20);
		t1.setFont(new Font("SANS-SERIF",Font.BOLD,16));
		tt1.setBounds(80,120,1000,100);
		tt1.setFont(new Font("SANS-SERIF",Font.PLAIN,16));
		
		t2.setBounds(80,250,500,20);
		t2.setFont(new Font("SANS-SERIF",Font.BOLD,16));
		tt2.setBounds(80,280,1000,250);
		tt2.setFont(new Font("SANS-SERIF",Font.PLAIN,16));
		
		t3.setBounds(80,560,500,20);
		t3.setFont(new Font("SANS-SERIF",Font.BOLD,16));
		tt3.setBounds(80,600,1000,100);
		tt3.setFont(new Font("SANS-SERIF",Font.PLAIN,16));
		
		t4.setBounds(80,720,800,20);
		t4.setFont(new Font("SANS-SERIF",Font.BOLD,16));
		tt4.setBounds(80,750,1000,100);
		tt4.setFont(new Font("SANS-SERIF",Font.PLAIN,16));
		
		t5.setBounds(80,880,800,20);
		t5.setFont(new Font("SANS-SERIF",Font.BOLD,16));
		tt5.setBounds(80,920,1000,100);
		tt5.setFont(new Font("SANS-SERIF",Font.PLAIN,16));
		
		t6.setBounds(80,1030,800,20);
		t6.setFont(new Font("SANS-SERIF",Font.BOLD,16));
		tt6.setBounds(80,1040,1000,100);
		tt6.setFont(new Font("SANS-SERIF",Font.PLAIN,16));
		
		t7.setBounds(80,1140,800,20);
		t7.setFont(new Font("SANS-SERIF",Font.BOLD,16));
		tt7.setBounds(80,1150,1000,100);
		tt7.setFont(new Font("SANS-SERIF",Font.PLAIN,16));
		
		t8.setBounds(80,1260,1000,20);
		t8.setFont(new Font("SANS-SERIF",Font.BOLD,16));
		tt8.setBounds(80,1290,1000,100);
		tt8.setFont(new Font("SANS-SERIF",Font.PLAIN,16));
		
		h2.setBounds(60,1400,600,20);
		h2.setForeground(new Color(0,0,102));
		h2.setFont(new Font("SANS-SERIF",Font.BOLD,20));
		
		t9.setBounds(80,1400,1000,400);
		t9.setFont(new Font("SANS-SERIF",Font.PLAIN,16));
		
		
		
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
		
        jp.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
		
		panel = new JPanel();
		panel.add(jp);
		
        panel.setPreferredSize(new Dimension(200, 1850));
		
		panel.setLayout(null);
		jp.setLayout(null);
		jp.setBounds(0,0,1150,1820);
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
		new TERCON();
	}

}
