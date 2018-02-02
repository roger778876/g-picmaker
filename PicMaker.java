import java.io.PrintWriter;
import java.io.IOException;

public class PicMaker {
  private static String TYPE;
  private static int WIDTH, HEIGHT, COLORS;
  private static String ppm;

  
  public static void main(String[] args) {
    TYPE = "P3";
    WIDTH = 1;
    HEIGHT = 1;
    COLORS = 255;
    ppm = "";
    
    ppm += TYPE + " " + WIDTH + " " + HEIGHT + " " + COLORS + " ";
    
    int rgb;
    for (int i = 0; i < (WIDTH * HEIGHT); i++) {
      for (int j = 0; j < 3; j++) {
        rgb = (int) (Math.random() * 256);
        ppm += rgb + " ";
      }
    }
    
    writeToFile();
  }
  
  private static void writeToFile() throws IOException {
		try {
	    PrintWriter writer = new PrintWriter("pic.ppm", "UTF-8");
			writer.println(ppm);
			writer.close();
		}
		catch (IOException e){
			throw new IOException("Unable to write to file");
		}
  }
}
