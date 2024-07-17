class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        if(n==1 || n==0){
            return;
        }
        int index=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                swap(nums,index++,i);
            }
        }
    }
    public static void swap(int arr[], int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
