public class Main {
    public static boolean conatinDuplicate(int nums[]) {
        boolean found = false;
        for (int i = 0; i< nums.length; i++){
            for (int j = i+1; j<nums.length; j++){
                if (nums[i] == nums[j]){
                    found = true;
                    
                }
            }
        }
        System.out.println(found);
        return found;
    }

    public static void main(String[] args) {

        int[] nums = {2,3,4,5,1};
        conatinDuplicate(nums);
        

     
    }
}
