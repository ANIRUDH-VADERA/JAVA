// package activity6;

// import java.util.Scanner;

// public class activity6q1 {
// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
// System.out.println("Enter Your Choice : ");
// System.out.println("1 : Arithmetic Exception");
// System.out.println("2 : Null Pointer Exception");
// System.out.println("3 : Array Index Out of Range Exception");
// int n = in.nextInt();
// System.out.println("ANIRUDH VADERA (20BCE2940)");
// switch (n) {
// case 1:
// int a = 0, b = 10;
// int c = 0;
// try {
// c = b / a;
// System.out.println("Result(In Try) = " + c);
// } catch (ArithmeticException e) {
// e.printStackTrace();
// System.out.println("We are just printing the stack trace.\n"
// + "ArithmeticException is handled. But take care of the variable \"c\"");
// }
// System.out.println("Value of c(Outside Try) :" + c);
// break;
// case 2:
// try {
// String temp = null; // null value
// System.out.println(temp.charAt(0));
// } catch (NullPointerException e) {
// e.printStackTrace();
// System.out.println("NullPointerException..");
// }
// break;
// case 3:
// try {
// int[] array = { 1, 2, 3, 4, 5 }; // length is 5
// int test = array[6]; // accessing 25th element
// System.out.println(test);
// } catch (ArrayIndexOutOfBoundsException e) {
// System.out.println("ArrayIndexOutOfBoundsException");
// e.printStackTrace();
// }
// break;
// }
// in.close();
// }
// }
