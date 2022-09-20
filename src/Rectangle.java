public class Rectangle {
    private double height;
    private double width;

    public void setHeight(double height) {
        if (height > 0){
        this.height = height;
        }
        else {
            throw new IllegalArgumentException("Negative height");
        }
    }

    public void setWidth(double width) {
        if (width > 0){
        this.width = width;
        }
        else {
            throw new IllegalArgumentException("Negative width");
        }
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
