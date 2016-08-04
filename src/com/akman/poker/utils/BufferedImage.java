/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akman.poker.utils;

import java.awt.Graphics2D;
import java.awt.Image;

/**
 *
 * @author Aqeel
 */
public class BufferedImage
{
    public static java.awt.image.BufferedImage toBufferedImage(Image img) {
        if (img instanceof java.awt.image.BufferedImage) {
            return (java.awt.image.BufferedImage) img;
        }

        // Create a buffered image with transparency
        java.awt.image.BufferedImage bimage = new java.awt.image.BufferedImage(img.getWidth(null),
                img.getHeight(null), java.awt.image.BufferedImage.TYPE_INT_ARGB);

        // Draw the image on to the buffered image
        Graphics2D bGr = bimage.createGraphics();
        bGr.drawImage(img, 0, 0, null);
        bGr.dispose();

        // Return the buffered image
        return bimage;
    }
    
}
