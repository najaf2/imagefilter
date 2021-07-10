import java.awt.*;
import java.awt.image.BufferedImage;

public class filters {
    
    private static int imageWidth;
    private static int imageHeight;

    public static void grayScale(BufferedImage image) {


        imageWidth = image.getWidth();
        imageHeight = image.getHeight();
        
        for (int i = 0; i < imageHeight; ++i) {
            for (int j = 0; j < imageWidth; ++j) {
                int currRGB = image.getRGB(j, i);
                Color currPixelColor = new Color(currRGB);

                int currRed = currPixelColor.getRed();
                int currGreen = currPixelColor.getGreen();
                int currBlue = currPixelColor.getBlue();

                int avg = currRed + currGreen + currBlue;
                avg = Math.round(avg/3);

                Color afterPixelColor = new Color(avg, avg, avg);
                image.setRGB(j, i, afterPixelColor.getRGB());
            }
        }
    }

    public static void brighten(BufferedImage image) {
        imageWidth = image.getWidth();
        imageHeight = image.getHeight();

        for (int i = 0; i < imageHeight; ++i) {
            for (int j = 0; j < imageWidth; ++j) {
                int currRGB = image.getRGB(j, i);
                Color currPixelColor = new Color(currRGB);

                Color afterPixelColor = currPixelColor.brighter();
                image.setRGB(j, i, afterPixelColor.getRGB());
            }
        }
    }

    public static void darken(BufferedImage image) {
        imageWidth = image.getWidth();
        imageHeight = image.getHeight();

        for (int i = 0; i < imageHeight; ++i) {
            for (int j = 0; j < imageWidth; ++j) {
                int currRGB = image.getRGB(j, i);
                Color currPixelColor = new Color(currRGB);

                Color afterPixelColor = currPixelColor.darker();
                image.setRGB(j, i, afterPixelColor.getRGB());
            }
        }
    }

    public static void invert(BufferedImage image) {
        imageWidth = image.getWidth();
        imageHeight = image.getHeight();
        
        for (int i = 0; i < imageHeight; ++i) {
            for (int j = 0; j < imageWidth; ++j) {
                int currRGB = image.getRGB(j, i);
                Color currPixelColor = new Color(currRGB);

                int currRed = currPixelColor.getRed();
                int currGreen = currPixelColor.getGreen();
                int currBlue = currPixelColor.getBlue();
                int currA = currPixelColor.getAlpha();

                int afterRed = 255 - currRed;
                int afterGreen = 255 - currGreen;
                int afterBlue = 255 - currBlue;

                Color afterPixelColor = new Color(afterRed, afterGreen, afterBlue);
                image.setRGB(j, i, afterPixelColor.getRGB());
            }
        }
    }
}
