import java.util.*;
public class pairInArray{
  public static void pair_Array(int num[]){
   for(int i=0; i<num.length; i++){
    int curr = num[i];
    for(int j=i+1; j<num.length; j++){
      System.out.print("(" + curr + "," + num[j] +") ");
    }
    System.out.println();
   }
  }
  public static void main(String args[]){
    int num[] = {2,4,6,8,10}; 
    pair_Array(num);
  }
}