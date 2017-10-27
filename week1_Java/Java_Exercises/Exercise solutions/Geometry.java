class Geometry {

	public static void main(String[] args) {

        double radius = 50;
        double area = calcCircleArea(radius);

        System.out.println("Circle:");
        System.out.println("  radius = "+radius);
        System.out.println("  area   = "+area);

        double length=12, width =5;
        area = calcRectangleArea(length, width);

        System.out.println("Rectangle:");
        System.out.println("  length = "  +length);
        System.out.println("  width  = "+ width);
        System.out.println("  area   = "+ area);
	}

    public static double calcCircleArea(double radius) {
        return Math.PI*radius*radius;
    }

    public static double calcRectangleArea(double l, double w) {
        return l * w;
    }
}