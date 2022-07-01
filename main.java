/**
 * main
 */
public class main {

  public static void main(String[] args) {
    int[] a;
    a = new int[10];
    int[] b;
    b = a;
    int [] c;
    c = b;
    for (int i = 1; i < 10; i++) {
      a[i] = i;
    }

    for (int i = 0; i < 10; i++) {
      b[i] = i * 2;
    }

    for (int i = 0; i < 10; i++) {
      System.out.print(a[i] + ", ");
    }

    System.out.println("");
    for (int i = 0; i < 10; i++) {
      System.out.print(b[i] + ", ");
    }
  }
}