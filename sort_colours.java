static void sortarr(int arr[],int start, int end,int val){
    for(int i=start;i<end;i++){
        arr[i] = val;
    }
}

void sortColors(int* nums, int numsSize) {
    int count0 = 0;
    int count1 = 0;
    int count2 = 0;

    for(int i=0;i<numsSize;i++){
        if(nums[i]==0){
            count0++;
        }
        else if(nums[i]==1){
            count1++;
        }
        else if(nums[i]==2){
            count2++;
        }
    }

    sortarr(nums,0,count0,0);
    sortarr(nums,count0,count1+count0,1);
    sortarr(nums,count1+count0,count2+count1+count0,2);
}
