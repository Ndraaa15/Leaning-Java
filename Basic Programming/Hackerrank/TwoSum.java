package HackerRank;

import java.util.HashMap;

public class TwoSum {

        static int[] twoSum(int[] nums, int target) {
            int n=nums.length;
            HashMap <Integer,Integer> map= new HashMap<>();
            int[] result=new int[2];
            for(int i=0;i<n;i++){
                if(map.containsKey(target-nums[i])){
                    result[1]=i;
                    System.out.println(i);
                    result[0]=map.get(target-nums[i]);
                    return result;
                }
                map.put(nums[i],i);
            }
            return result;
        }

        public static void main(String[] args) {
            int [] num = {2,7,11,15};
            int n = 9;
            int [] result = twoSum(num, n);
            for (int z : result) {

                System.out.println(z);
            }

    }
}
