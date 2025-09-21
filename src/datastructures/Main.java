package datastructures;
public class Main {

  public static void printItems(int n){
    for(int i=0; i<n; i++){//O(n^2) time complexity
      for(int j=0; j<n; j++){
        System.out.println(i + " " + j);
      }
    }

    for(int j=0; j<n; j++){//O(n) time complexity
      System.out.println(j);
    }

    //therefore this function has O(n^2 + n) = O(n^2) time complexity since n^2 grows faster than n as n gets larger, n^2 is dominant term
    //this rules of simplification is called drop non dominant terms
  }
  public static void main(String[] args) {
    //printItems(10);

    Add add = new Add();
    System.out.println(add.add(5, 10));

    Test test = new Test();
    test.printItems(10, 5);
  }
}