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
import javax.swing.tree.TreeSelectionModel;

public class DEPTHOME extends JFrame implements TreeSelectionListener{
	Container co;
	JPanel jp,dum,img,total;
	JLabel l1;
	String str = "";
	
	
	public DEPTHOME() throws IOException {
		
		setTitle("DEPTHOME");
		
		co = getContentPane();
		co.setLayout(null);
		
		l1 = new JLabel("  DEPARTMENT LOGIN");
		l1.setBounds(0,0,450,40);
		l1.setBackground(new Color(0,0,102));
		l1.setForeground(Color.WHITE);
		l1.setOpaque(true);
		l1.setFont(new Font("SANS-SERIF",Font.BOLD,20));
		
		DefaultMutableTreeNode title=new DefaultMutableTreeNode("<HTML><b>CHECK</b></HTML>");
		
		DefaultMutableTreeNode bd=new DefaultMutableTreeNode("Birth Registrations");  
        DefaultMutableTreeNode dd=new DefaultMutableTreeNode("Death Registrations");  
        DefaultMutableTreeNode pt=new DefaultMutableTreeNode("New Water Connection Registrations");  
		
        title.add(bd);
        title.add(dd);
        title.add(pt);
        
        JTree jt=new JTree(title);
        jt.setFont(new Font("SERIF",Font.PLAIN,20));
        expandAllNodes(jt, 0, jt.getRowCount());
        
        jt.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        jt.addTreeSelectionListener(this);
        
        total = new JPanel();
        total.setLayout(null);
        
        dum = new JPanel();
        dum.add(jt);
        dum.setBounds(30,50,400,150);
        dum.setBackground(Color.WHITE);
        
        img = new JPanel();
	    BufferedImage image = ImageIO.read(new File("C:\\Users\\MADHUSRI\\Desktop\\Images\\bose.png"));
	    BufferedImage resized1 = resize(image, 700, 800);
	    JLabel label = new JLabel(new ImageIcon(resized1));
	    img.add(label);
	    img.setBounds(600,100,900,900);
	    img.setBackground(Color.white);
        
        jp = new JPanel();
        jp.add(l1);
        jp.add(dum);
        jp.setLayout(null);
        //jp.setVisible(true);
        jp.setBackground(Color.WHITE);
        jp.setBounds(200,350,450,200);
        jp.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
        
        total.add(jp);
        total.add(img);
        total.setBackground(Color.white);
        
        total.setBounds(0,0,1600,800);
        co.add(total); 
        
//        setSize(2000,2000);  
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
	

	@Override
	public void valueChanged(TreeSelectionEvent se) {
		// TODO Auto-generated method stub"
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
private static BufferedImage resize(BufferedImage img, int height, int width) {
    Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
    Graphics2D g2d = resized.createGraphics();
    g2d.drawImage(tmp, 0, 0, null);
    g2d.dispose();
    return resized;
}

	public static void main(String[] args) throws IOException {
		new DEPTHOME();
	}

}
