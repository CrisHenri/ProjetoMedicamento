package app.easykey.img;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
 
import javax.swing.ImageIcon;
 
@SuppressWarnings("serial")
public class BTN_GERAR_IMG extends JPanel {
    private Image image;
    /**
     * Create the panel.
     */
    public BTN_GERAR_IMG () {
           
        this.initialize();
       
    }
   
    protected void initialize() {
       
        this.image = this.getImage("btn_cadastrar.png");
        this.setLayout(new BorderLayout());
    }
   
    public Image getImage(String path) {
        URL imageURL = getClass().getResource(path);
        if (imageURL == null)
            return null;
        return new ImageIcon(imageURL).getImage();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Dimension dDesktop = this.getSize();
        double width = 370;
        double height = 98;
        Image background = new ImageIcon(this.image.getScaledInstance(
                (int) width, (int) height, 1)).getImage();
        g.drawImage(background, 0, 0, this);
    }
 
}
