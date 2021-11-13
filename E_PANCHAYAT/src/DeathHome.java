import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class DeathHome extends JFrame implements TreeSelectionListener{

	Container co;
	JPanel Mas,jp,jp1,jp2;
	JLabel topic;
	String str;
	
	public DeathHome() throws IOException
	{
		
		setTitle("DEATH DETAILS");
		
		co = getContentPane();
		co.setLayout(null);
		
		DefaultMutableTreeNode title = new DefaultMutableTreeNode("<HTML><b>DEATH DETAILS</b><HTML>");
		
		DefaultMutableTreeNode app= new DefaultMutableTreeNode("Apply Death Registration");
		DefaultMutableTreeNode gen = new DefaultMutableTreeNode("Generate Death Details");  

		title.add(app);
		title.add(gen);
		
		JTree jt = new JTree(title);
		jt.setSize(25,25);
		jt.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
		expandAllNodes(jt, 0, jt.getRowCount());
		jt.addTreeSelectionListener(this);
		
		topic = new JLabel("   DEATH DETAILS");
		topic.setForeground(Color.white);
		topic.setBackground(new Color(0,0,102));
		topic.setBounds(0,0,700,40);
		topic.setOpaque(true);
		topic.setFont(new Font("SANS-SERIF",Font.BOLD,20));

		JPanel bIcon1 = new JPanel();
	    BufferedImage wat = ImageIO.read(new File("C:\\Users\\MADHUSRI\\Desktop\\Images\\d.jpg"));
	    BufferedImage resized1 = resize(wat, 150, 200);
	    JLabel label1 = new JLabel(new ImageIcon(resized1));
	    bIcon1.add(label1);
	    bIcon1.setBounds(370,80,200,200);
	    bIcon1.setBackground(Color.white);
	    
	    JPanel bIcon2 = new JPanel();
	    BufferedImage dis = ImageIO.read(new File("C:\\Users\\MADHUSRI\\Desktop\\Images\\h.jpg"));
	    BufferedImage resized2 = resize(dis, 500, 600);
	    JLabel label2 = new JLabel(new ImageIcon(resized2));
	    bIcon2.add(label2);
	    bIcon2.setBounds(600,20,1000,1000);
	    bIcon2.setBackground(Color.white);
	    
	    
	    jp = new JPanel();
		Mas = new JPanel();
		
		jp.setVisible(true);
		jp.setBackground(Color.white);
		jp.setBounds(150,130,600,300);
		jp.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
		
		
		jp1 = new JPanel();
		jp1.add(jt);
		jp1.setBackground(Color.white);
		
		
		jp2 = new JPanel();
		jp2.add(jp1);
		jp2.add(topic);
		jp2.setBounds(10,100,350,130);
		jp2.setBackground(Color.white);
		jp2.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
		
		jp.setLayout(null);
		jp.add(bIcon1);
		jp.add(jp2);
		jp.add(topic);
		
		Mas.add(jp);
		Mas.add(bIcon2); 
		Mas.setLayout(null);
		Mas.setBackground(Color.white);
		Mas.setBounds(10,200,1500,1500);
		
		co.add(Mas);
		
//		setSize(2000,2000);  
//        setVisible(true);
		
	}
	
	private void expandAllNodes(JTree tree, int startingIndex, int rowCount){
		for(int i=startingIndex;i<rowCount;++i){
			tree.expandRow(i);
			}
		    if(tree.getRowCount()!=rowCount){
		        expandAllNodes(tree, rowCount, tree.getRowCount());
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
	
	public static void main(String[] args) throws IOException {
		new DeathHome();
	}

	@Override
	public void valueChanged(TreeSelectionEvent se) {
		// TODO Auto-generated method stub
		JTree tree = (JTree) se.getSource();
	    DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree
	        .getLastSelectedPathComponent();
	    str = selectedNode.toString();
	    if(!str.isEmpty()) {
	    	try {
	    		MASTER.sitemapClick(str);
	    	}
	    	catch(Exception e) {
	    		System.out.println("SITEMAP"+e);
	    	}
	    }
	}
}
