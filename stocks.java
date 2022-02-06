public class stocks{
 public static void main(String[] args){
 int[] arrays={7,6,4,3,1};
 int one=maxProfit(arrays);
 System.out.println(one);
 }
 static int maxProfit(int[] prices){
    int one=Integer.MAX_VALUE;
    int two=0;
    int three=0;
    for(int i=0;i<prices[i];i++){
    if(prices[i]<one){
    one=prices[i];
    }
    two=prices[i]-one;
    if(three<two){
    three=two;
    }
    }
 return three;
 }

}