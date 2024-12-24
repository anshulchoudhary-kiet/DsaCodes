import java.util.*;
public class LongestConsecutive {
    public static int print(int[] n1){
        Arrays.sort(n1);
        int curr=1;
        int res=1;
        for(int i=1;i<n1.length;i++){
            if(n1[i]==n1[i-1]+1){
                curr++;
            }
            else if(n1[i]!=n1[i-1]){
                res=Math.max(res,curr);
                curr=1;
            }
        }
        return Math.max(res,curr);
    }
    public static void main(String[] args){
        int[] n1={1,3,2,4,9,10};
        int n=print(n1);
        System.out.print(n);

    }
}
