import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

public class app {
    public static void main(String[] args) throws Exception {
        URL imageURL = new URL("https://images.unsplash.com/photo-1625242420602-a22dd7692b82?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80");
        BufferedImage image = ImageIO.read(imageURL);


        File outputfile = new File("before.png");
        ImageIO.write(image, "png", outputfile);

        // Choose a filter here
        filters.grayScale(image);

        





        // save image with filter applied
        File outputfile2 = new File("after.png");
        ImageIO.write(image, "png", outputfile2);

    }
}
