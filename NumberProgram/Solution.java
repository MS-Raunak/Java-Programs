package NumberProgram;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j= i+1; i<nums.length; i++){

                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }

        }
        System.out.println();
        return new int[]{};
    }

    public static void main(String[] args) {
        int []arr1 = twoSum(new int[]{4,2,3}, 6);
        System.out.println(arr1.length);
    }

}