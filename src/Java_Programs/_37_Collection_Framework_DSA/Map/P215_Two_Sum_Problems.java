package Java_Programs._37_Collection_Framework_DSA.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class P215_Two_Sum_Problems {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] results = twoSums(nums,target);
    }

    private static int[] twoSums(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap();
        int c=0;
        for (int i=0;i<nums.length-1;i++){
            for (int j=1;j<nums.length;j++){
                if(target==nums[i]+nums[j]){
                    map.put(i,nums[c++]);
                    map.put(j,nums[c++]);
                }
            }
        }
        System.out.println(map);
        return null;
    }
}
