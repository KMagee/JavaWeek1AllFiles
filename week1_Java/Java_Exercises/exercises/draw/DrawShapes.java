class DrawShapes {
	public static void main(String[] args) {
		drawRectangle(3,4);
	}
	
	public static void drawRectangle(int width, int height) {
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}