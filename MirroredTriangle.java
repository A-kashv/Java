 class MirroredTriangle {
    public static void main(String[] args) {
        int size = 7;
        printMirroredTriangle(size);
    }

    public static void printMirroredTriangle(int size) {

        for (int i = 1; i <= size; i++) {
            System.out.print(" ".repeat(size - i));
            System.out.println("* ".repeat(i));
        }
        
        
        for (int i = size; i > 0; i--) {
            System.out.print(" ".repeat(size - i));
            System.out.println("* ".repeat(i));
        }
    }
}
