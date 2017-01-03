import java.util.HashMap;

public class PixelFactory {

    private static final HashMap<String, Pixel> pixelMap = new HashMap<String, Pixel>();



    public static Pixel getPixel(String colour){

        Pixel pixel = pixelMap.get(colour);

        if (pixel == null){
            pixel = new SinglePixel(colour);
            pixelMap.put(colour, pixel);
            System.out.println("Creating pixel of color "+colour);
        }
        return pixel;
    }

}
