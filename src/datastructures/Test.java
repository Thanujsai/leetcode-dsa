package datastructures;

public class Test {
    public static void printItems(int a, int b){
        for(int i=0; i<a; i++){//O(a) time complexity
            System.out.println(i);
        }

        for(int j=0; j<b; j++){//O(b) time complexity
            System.out.println(j);
        }      
    }
}
    //therefore this function has O(a + b) time complexity since a and b are independent of each other
    //this rules of simplification is called drop non dominant terms