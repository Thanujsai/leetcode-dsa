package datastructures;
public class Main {

  public static void printItems(int n){
    for(int i=0; i<n; i++){//O(n) time complexity
      System.out.println(i);
    }
    
    for(int i=0; i<n; i++){//O(n) time complexity
      System.out.println(i);
    }
  }
  public static void main(String[] args) {
    printItems(10);
  }
}