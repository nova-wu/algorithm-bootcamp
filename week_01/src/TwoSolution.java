public class TwoSolution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k%=n;
        if(k==0){
            return;
        }
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    private void reverse(int[] nums,int l,int r){
        while(l<r){
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        new TwoSolution().rotate(nums,2);
        for(int i:nums){
            System.out.println(i);
        }
    }
}
