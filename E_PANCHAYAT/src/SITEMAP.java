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
public class SITEMAP extends JFrame implements TreeSelectionListener {  
  Container co;
  JPanel jp,img,Main;
  String str = "";
  
  public SITEMAP() throws IOException{  
    
	  
	  setTitle("SITE MAP");
	  
	    co = getContentPane();
	    co.setLayout(null);
	    
	    DefaultMutableTreeNode title=new DefaultMutableTreeNode("<HTML><b>E-PANCHAYAT</b></HTML>");  
	    
        DefaultMutableTreeNode home=new DefaultMutableTreeNode("<HTML><b>HOME</b></HTML>");  
        DefaultMutableTreeNode about=new DefaultMutableTreeNode("<HTML><b>ABOUT US</b></HTML>");  
        DefaultMutableTreeNode tc=new DefaultMutableTreeNode("<HTML><b>TERMS AND CONDITIONS</b></HTML>"); 
        DefaultMutableTreeNode contact=new DefaultMutableTreeNode("<HTML><b>CONTACT US</b></HTML>");   
        
        
        
        title.add(home);
        title.add(about);
        title.add(tc);
        title.add(contact);
        
        DefaultMutableTreeNode bd=new DefaultMutableTreeNode("BIRTH DETAILS");  
        DefaultMutableTreeNode dd=new DefaultMutableTreeNode("DEATH DETAILS");  
        DefaultMutableTreeNode pt=new DefaultMutableTreeNode("PROPERTY TAX - TAX CALCULATOR");  
        DefaultMutableTreeNode wc=new DefaultMutableTreeNode("WATER CHARGES");
        DefaultMutableTreeNode dl=new DefaultMutableTreeNode("DEPARTMENT LOGIN");
        
        home.add(bd);
        home.add(dd);
        home.add(pt);
        home.add(wc);
        home.add(dl);
        
        DefaultMutableTreeNode bdr=new DefaultMutableTreeNode("Apply Birth Registration");
        DefaultMutableTreeNode bda=new DefaultMutableTreeNode("Generate Birth Details");  
        
        bd.add(bdr);
        bd.add(bda);
        
        DefaultMutableTreeNode ddr=new DefaultMutableTreeNode("Apply Death Registration");
        DefaultMutableTreeNode dda=new DefaultMutableTreeNode("Generate Death Details");  
        
        dd.add(ddr);
        dd.add(dda);
        
        DefaultMutableTreeNode w1=new DefaultMutableTreeNode("Apply New Water Connection");
        DefaultMutableTreeNode w2=new DefaultMutableTreeNode("Track New Water Connection Status");          
        DefaultMutableTreeNode w3=new DefaultMutableTreeNode("View Payment Status");
        DefaultMutableTreeNode w4=new DefaultMutableTreeNode("Pay Water Charges");  
        
        wc.add(w1);
        wc.add(w2);
        wc.add(w3);
        wc.add(w4);
           
        JTree jt=new JTree(title);
        jt.setFont(new Font("SERIF",Font.PLAIN,20));
        expandAllNodes(jt, 0, jt.getRowCount());
        
        jt.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        jt.addTreeSelectionListener(this);
        
        img = new JPanel();
	    BufferedImage pan = ImageIO.read(new File("C:\\Users\\MADHUSRI\\Desktop\\Images\\site.png"));
	    BufferedImage resized1 = resize(pan, 450, 600);
	    JLabel label4 = new JLabel(new ImageIcon(resized1));
	    img.add(label4);
	    img.setBounds(550,50,1000,600);
	    img.setBackground(Color.white);
	    
        
        
        jp = new JPanel();
        jp.add(jt);
        jp.setVisible(true);
        jp.setBackground(Color.WHITE);
        jp.setBounds(150,40,450,520);
        jp.setBorder(BorderFactory.createLineBorder(new Color(224,224,224), 1, false));
        
        Main = new JPanel();

        Main.add(jp);
        Main.add(img);
        Main.setLayout(null);
        Main.setBounds(0,200,1600,600);
        
        Main.setBackground(Color.WHITE);
        co.add(Main); 
        
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
  
  private static BufferedImage resize(BufferedImage img, int height, int width) {
	    Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
	    BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
	    Graphics2D g2d = resized.createGraphics();
	    g2d.drawImage(tmp, 0, 0, null);
	    g2d.dispose();
	    return resized;
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
  
  public static void main(String[] args) throws IOException {  
    new SITEMAP();  
  }


}