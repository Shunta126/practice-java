public class Main {
  public static void main(String[] args) {
    for (int one = 1; one < 10; one++){
      for (int two = 1; two < 10; two++){
        int total = one * two;
        if (one % 2 == 0){
          System.out.print(total);
          System.out.print(" ");
        } else {
          System.out.print(total);
          System.out.print("|");
        }
      }
      System.out.println("");
    }
  }
}