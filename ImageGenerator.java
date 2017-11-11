import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
public class ImageGenerator{
  public static void main(String args[])throws IOException{
     //image dimension
     int width = 640;
     int height = 320;
     
     //create buffered image object image
     BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
     //file object
     File f = null;
     //create random image pixel by pixel
     for(int counter = 0; counter < width; counter++){
       for(int y = 0; y < height; y++){
         int a = 0; //alpha
         int r = 0; //red
         int g = 0; //green
         int b = 0; //blue
         int iterations = 0;
         int movingNumber = counter;
         while (movingNumber >= counter) {
        	 if (movingNumber % 2 == 1) {
        		 movingNumber = movingNumber * 3 + 1;
        	 }else {
        		 movingNumber /= 2;
        	 }
        	 iterations += 1;
         }
         if (y == iterations) {
        	 g = 255;
         } else {
        	 g = 0;
         }
         int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel
 
         img.setRGB(counter, y, p);
       }
     }
     //write image
     try{
       f = new File("C:\\Users\\s-man\\Desktop\\NewOutput.png");
       ImageIO.write(img, "png", f);
     }catch(IOException e){
       System.out.println("Error: " + e);
     }
  }//main() ends here
}//class ends here