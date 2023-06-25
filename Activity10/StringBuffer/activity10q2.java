// package activity10;

// import java.util.Scanner;

// interface Line {
// public void printCapitalized(String s);
// }

// class Worker implements Line {
// public void printCapitalized(String s) {
// StringBuffer str = new StringBuffer(s);

// if (str.charAt(0) >= 97 && str.charAt(0) <= 122)
// str.setCharAt(0, (char) ((int) str.charAt(0) - 32));

// for (int i = 0; i < str.length(); i++) {
// if (str.charAt(i) == ' ') {
// if (str.charAt(i + 1) >= 97 && str.charAt(i + 1) <= 122)
// str.setCharAt(i + 1, (char) ((int) str.charAt(i + 1) - 32));
// }
// }
// System.out.println(str.toString());
// }
// }

// public class activity10q2 {
// static void doWork(Line w) {
// Scanner sc = new Scanner(System.in);
// w.printCapitalized(sc.nextLine());
// }

// public static void main(String[] args) {
// doWork(
// (String s) -> {
// StringBuffer str = new StringBuffer(s);

// if (str.charAt(0) >= 97 && str.charAt(0) <= 122)
// str.setCharAt(0, (char) ((int) str.charAt(0) - 32));

// for (int i = 0; i < str.length(); i++) {
// if (str.charAt(i) == ' ') {
// if (str.charAt(i + 1) >= 97 && str.charAt(i + 1) <= 122)
// str.setCharAt(i + 1, (char) ((int) str.charAt(i + 1) - 32));
// }
// }
// System.out.println(str.toString());
// });
// System.out.println("ANIRUDH VADERA (20BCE2940)");
// }

// }
