import java.util.*;

public class arrays{


  //function to print the maximum sub array of an array
  //brute force
  public static void maxsubarraySum(int numbers[]){
    int currSum =0;
    int maxSum=Integer.MIN_VALUE;

    for(int i=0;i<numbers.length;i++){
      int start = i;
      for(int j=i;j<numbers.length;j++){
        int end =j;
        currSum=0;
        for(int k=start;k<=end;k++){
          currSum += numbers[k];
        }
        System.out.println(currSum);
        if(maxSum<currSum){
          maxSum=currSum;
        }
        }
      }
      System.out.println("max sum="+maxSum);
    }
  

  public static void main (String args[]){
            Scanner sc=new Scanner(System.in); 
          
            int numbers[]={2,3,4,6,8,10};
            maxsubarraySum(numbers);
          
          }}