public class Main {

    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {

        for (int i = 0; i < 10; ++i) {
            SinglePixel pixel = (SinglePixel) PixelFactory.getPixel(getRandomColor());
            pixel.setX(getRandomX());
            pixel.setY(getRandomY());
            pixel.display();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}

