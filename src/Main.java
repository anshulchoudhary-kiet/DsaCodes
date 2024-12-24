import java.util.*;
public class Main{
    public static int print(int[] n1,int[] n2){
        int[] arr=new int[n1.length];
        for(int i=0;i<n1.length;i++){
            arr[i]=n1[i]-n2[i];
        }
        HashMap<Integer,Integer> hs=new HashMap<>();
        int sum=0;
        int maxLength=0;
        for(int i=0;i<n1.length;i++){
            sum+=arr[i];
            if(sum==0){
                maxLength=i+1;
            }
            else if(hs.containsKey(sum)){
                maxLength=Math.max(maxLength,i-hs.get(sum));
            }
            else{
                hs.put(sum,i);
            }

        }
        return maxLength;
    }
    public static void main(String[] args){
        int[] n1={0,1,0,1,1,1,1};
        int[] n2={1,1,1,1,1,0,1};
        int n=print(n1,n2);
        System.out.print(n);
    }
}