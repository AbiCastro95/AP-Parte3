package ejercicio4;

import java.awt.*;
import javax.swing.*;

/*
 * @author Abigail Castro
 */
public class BackgroundDesktopPane extends JDesktopPane {

    private ImageIcon backgroundImage;

    public BackgroundDesktopPane(String imagePath) {
        backgroundImage = new ImageIcon(imagePath);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja la imagen de fondo si está disponible
        if (backgroundImage != null) {
            Image img = backgroundImage.getImage();
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
