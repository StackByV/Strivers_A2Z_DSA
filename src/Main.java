import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int[] twoSum(int[] nums, int target) {
        int[] ans={0,0};
        int size = nums.length;
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int arr[]={1,2,3,4,5,6,7};
        int target = 5;
        System.out.println(Arrays.toString(twoSum(arr, target)));


    }
}