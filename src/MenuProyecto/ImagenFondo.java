

package MenuProyecto;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;
 
/**
 * Fecha: 19-nov-2017
 * Autor: Antonio Aburto Cortez 
 */
public class ImagenFondo implements Border{
    public BufferedImage back;
 
    public ImagenFondo(){
        try {
            URL imagePath = new URL(getClass().getResource("../File/Desoft.png").toString());
            back = ImageIO.read(imagePath);
        } catch (Exception ex) {            
        }
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawImage(back, (x + (50- back.getWidth())/22),(y + (50 - back.getHeight())/10), null);
    }

    public Insets getBorderInsets(Component c) {
        return new Insets(0,0,0,0);
    }
 
    public boolean isBorderOpaque() {
        return false;
    }
 
}

