public class Triangle02  implements Shape02 {

    private int base, height;
    public Triangle02(int base, int height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public String toString() {
        return "Triangle[base=" + base + ",height=" + height + "]";
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
