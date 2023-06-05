class twosum {
    public static void main(String[] args) {
        twosum obj = new twosum();
        int [] nums = {3,2,4};
        int target = 6;
        System.out.println(obj.solution(nums,target));
    }
    public int[] solution(int[] nums, int target) {//brute force
        int [] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] + nums[j] == target && i != j){
                    ans[0] = i;
                    ans[1] = j; 
                    return ans;
                }
            }
        }
          return ans;
    }
    // public int[] solution2(int[] nums, int target){
    //     return null;
    // }
}