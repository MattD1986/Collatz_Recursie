package org.example;

public class App {

  public static void main(String[] args) {

    System.out.println(collatz(43));
  }

  private static int collatz(int n) {

    if(n == 1){
      return 0;

    } else if((n % 2) == 0){

      return 1 + collatz(n/2);
    } else {
      return 1 + collatz(3 * n + 1);
    }
  }
}