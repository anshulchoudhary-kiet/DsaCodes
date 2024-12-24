import java.util.*;
public class LongestConsecutive {
    public static int print(int[] n1){
    HashSet<Integer> hs=new HashSet<Integer>();
    for(int x:n1){
        hs.add(x);
    }
    int res=1;
    for(int x:hs){
        if(hs.contains(x-1)==false){
            int curr=1;
            while(hs.contains(x+curr)){
                curr++;
            }
            res=Math.max(res,curr);
        }
    }
    return res;
    }
    public static void main(String[] args){
        int[] n1={1,2,3,1,1,9,4,5,1};
        int n=print(n1);
        System.out.print(n);

    }
}
