class DrawShapes {
    public static void main(String[] args) {
        drawRectangle(13,4);
        drawRightTriangle(4);
        drawLeftTriangle(4);
        drawSquare(8);
    }

    public static void drawRectangle(int width, int height) {
        for(int i=0; i<height; i++) {
            for(int j=0; j<width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawLeftTriangle(int l) {
        for (int i=0; i<l; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawRightTriangle(int l) {
        for (int i=l; i>0; i--) {
            for (int j=0; j<i-1; j++) {
                System.out.print(" ");
            }
            for (int j=i; j<=l; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawSquare(int l) {
        drawRectangle(l,l);
    }
}