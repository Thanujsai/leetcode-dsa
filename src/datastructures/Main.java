package datastructures;
public class Main {

  public static void printItems(int n){
    for(int i=0; i<n; i++){//O(n^2) time complexity
      for(int j=0; j<n; j++){
        System.out.println(i + " " + j);
      }
    }
  }
  public static void main(String[] args) {
    printItems(10);
  }
}