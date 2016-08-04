/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akman.poker.utils;



import static com.akman.poker.utils.BufferedImage.toBufferedImage;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.JXImageView;


/**
 *
 * @author Aqeel
 */
public class ImageX {

    private static final int IMG_WIDTH = 100;
    private static final int IMG_HEIGHT = 100;

    public static BufferedImage DefaultImage() {
        java.awt.image.BufferedImage img = null;
        try {
            img = ImageIO.read(new File("No Image small.png"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return img;
    }

    public static BufferedImage getImage(byte[] image) {
        
        ImageIcon imageIcon = new ImageIcon(image); // load the image to a imageIcon
        Image images = imageIcon.getImage();

        BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, 1);
        Graphics2D g = resizedImage.createGraphics();

        g.drawImage(images, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
        g.dispose();

        return resizedImage;
    }

    public static byte[] Image(JXImageView imageveiw) {
        byte[] ByteImage = null;
        Image img = imageveiw.getImage();
        BufferedImage originalImage = toBufferedImage(img);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(originalImage, "jpg", baos);
            baos.flush();
            ByteImage = baos.toByteArray();
            baos.close();
        } catch (IOException ex) {

        }
        return ByteImage;
    }

    public static ImageIcon createThumbnail(ImageIcon icon) {
        int maxDim = 18;
        ImageIcon iconThumbnail = null;
        try {
            Image inImage = icon.getImage();

            double scale = (double) maxDim / (double) inImage.getHeight(null);
            if (inImage.getWidth(null) > inImage.getHeight(null)) {
                scale = (double) maxDim / (double) inImage.getWidth(null);
            }

            int scaledW = (int) (scale * inImage.getWidth(null));
            int scaledH = (int) (scale * inImage.getHeight(null));

            BufferedImage outImage = new BufferedImage(scaledW, scaledH,
                    BufferedImage.TYPE_INT_ARGB);

            AffineTransform tx = new AffineTransform();

            if (scale < 1.0d) {
                tx.scale(scale, scale);
            }

            Graphics2D g2d = outImage.createGraphics();
            g2d.drawImage(inImage, tx, null);
            g2d.dispose();

            iconThumbnail = new ImageIcon(outImage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return iconThumbnail;
    }

    public static ImageIcon createImageIcon(String path,
            String description) {
        String imgURL = path;
        
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
}
