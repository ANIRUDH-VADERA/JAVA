package activity2;

class pattenr2 {
    public static void main(String[] args) {
        System.out.println("ANIRUDH VADERA(20BCE2940)");
        for (int m = 0; m < 3; m++) {
            for (int j = 0; j < m + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 3 - m * 2; j++) {
                System.out.print(" ");
            }
            if (m == 2) {
                for (int j = 0; j < m; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < m + 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        for (int m = 1; m >= 0; m--) {
            for (int j = 0; j < m + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 3 - m * 2; j++) {
                System.out.print(" ");
            }
            if (m == 2) {
                for (int j = 0; j < m; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < m + 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}