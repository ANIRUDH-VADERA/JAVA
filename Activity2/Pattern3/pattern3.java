package activity2;

class pattenr3 {
    public static void main(String[] args) {
        System.out.println("ANIRUDH VADERA(20BCE2940)");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");
        }
        for (int i = 2; i >= 0; i--) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");
        }
    }
}