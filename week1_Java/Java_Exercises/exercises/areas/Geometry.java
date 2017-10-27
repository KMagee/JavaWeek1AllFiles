class Geometry {

	public static void main(String[] args) {

		double radius = 50;
		double area = calcCircleArea(radius);

		System.out.println("Circle:");
		System.out.println("  radius = "+radius);
		System.out.println("  area   = "+area);

	}

	public static double calcCircleArea(double radius) {
		return Math.PI*radius*radius;
	}

	//Add more calculator methods for other shapes, and call them from main.

}