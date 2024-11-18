class Solution {
    public int[] decrypt(int[] code, int k) {

        int[] nums = new int[code.length];
        if (k == 0) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = 0;
            }
        }else if(k>0){
            for(int i=0;i<code.length;i++)
            {
                int sum=0;
                for(int j=1;j<=k;j++){
                    sum=sum+code[(i+j)%code.length];
                }
                nums[i]=sum;
                System.out.println(nums[i]);
            }
            

        }else{
            for(int i=0;i<code.length;i++){
                 int sum=0;
                 for(int j=-1;j>=k;j--){
                  int index  =(j+i)%code.length;
                    if(index<0){
                        index=code.length+index;

                    }
                    sum=sum+code[index];
                 

                 }
                 nums[i]=sum;
            }

        }
        return nums;

    }
}