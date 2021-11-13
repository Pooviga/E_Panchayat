
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DEATHREGDATABASE {
	
	public void deathreg(javabeans mn){
    	
    	try {
    		
    		String a = mn.getDistrict();
    		String b = mn.getTown_panchyat();
    		double c = Double.parseDouble(mn.getNumber());
    		String d = mn.getEmail();
    		String e = mn.getDate();
    		String f = mn.getGender();
    		String g = mn.getName();
    		String h = mn.getIdentification();
    		String i = mn.getHus_or_father_name();
    		String j = mn.getCause_of_death();
    		String k = mn.getCertified();
    		String l = mn.getPlace_of_death();
    		String m = mn.getRelegion();
    		String n = mn.getPer_address();
    		double o = Double.parseDouble(mn.getPincode());
    		String p = mn.getState();
    		
    		
    		
    		Connection conn = getConn.getConnection();
    		Statement stmt = conn.createStatement();
    		
    		String query = "insert into tempDeath values('"+a+"','"+b+"',"+c+",'"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"','"+l+"','"+m+"','"+n+"',"+o+",'"+p+"')";
    		
    		stmt.executeUpdate(query);
    		conn.setAutoCommit(true);
    		
    		JDialog dia= new JDialog();
            JLabel lab = new JLabel("REGISTRATION SUCCESSFUL");
            lab.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
            lab.setForeground(new Color(0,0,102));
            lab.setBounds(120,20,500,30);
            dia.add(lab);
            
            JPanel bIcon1 = new JPanel();
    	    BufferedImage wat;
			try {
				wat = ImageIO.read(new File("C:\\Users\\MADHUSRI\\Desktop\\Images\\sucs.jpg"));
				BufferedImage resized1 = resize(wat, 500, 500);
				JLabel label1 = new JLabel(new ImageIcon(resized1));
				bIcon1.add(label1);
				bIcon1.setBounds(0,0,500,500);
				bIcon1.setBackground(Color.white);
				dia.add(bIcon1);
			} 
			catch (IOException e1) {
				e1.printStackTrace();
			} 
			dia.setLocation(600,100);
            dia.setSize(500, 500);
            dia.setLayout(null);
            dia.setVisible(true);
    	}
    	
    	catch(Exception e) {
    		JOptionPane.showMessageDialog(MASTER.co, "SORRY THERE IS AN ERROR IN REGISTERING YOUR DETAILS\n ERROR : "+e.toString());
    	}
    	
    	
    }
	
	 private static BufferedImage resize(BufferedImage img, int height, int width) {
	        Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
	        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
	        Graphics2D g2d = resized.createGraphics();
	        g2d.drawImage(tmp, 0, 0, null);
	        g2d.dispose();
	        return resized;
	    }
	
	
	public static void main(String[] args) {
		new DEATHREGDATABASE();
	}
}