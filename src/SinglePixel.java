public class SinglePixel implements Pixel{
    
    String colour;
    int x;
    int y;

    public SinglePixel(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void display() {
        System.out.println("Pixel: Display() [Color : " + colour + ", x : " + x + ", y :" + y );
    }
}
