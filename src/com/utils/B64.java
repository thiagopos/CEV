package com.utils;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.imageio.ImageIO;
import java.util.Base64;

public class B64 {

    public static String encodeToString(BufferedImage image, String type) {
        String imageString = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try {
            ImageIO.write(image, type, bos);
            byte[] imageBytes = bos.toByteArray();
            imageString = new String (Base64.getMimeEncoder().encode(imageBytes),
            StandardCharsets.UTF_8);
            bos.close();
        } catch (IOException e) {
        }
        return imageString;
    }

    public static BufferedImage decodeToImage(String imageString) {

        BufferedImage image = null;
        byte[] imageByte;
        try {
            imageByte = Base64.getMimeDecoder().decode(imageString);
            ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
            image = ImageIO.read(bis);
            bis.close();
        } catch (IOException e) {
        }
        return image;
    } 
}
