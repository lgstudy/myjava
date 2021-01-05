package org.myjava.algorithm.search;

public class Search {

    public static void main(String[] args) {
        int [] nums = {4,5,6,7,0,1,2} ;
        int target = 3 ;
        System.out.println(search(nums,target));
    }

    public static int search(int[] n, int target) {
        int l = 0 ;
        int r = n.length -1 ;
        int mid = 0 ;
        while(l <= r){
            mid = l + (r - l)/2 ;
            if(n[mid] == target){
                return mid ;
            }else{
                if(n[mid] < n[mid+1]){
                    //升序
                    if(n[mid] < target){
                        l = mid ;
                    }else {
                        r = mid ;
                    }
                }else {
                    //降序
                    if(n[mid] < target){
                        r = mid ;
                    }else {
                        l = mid ;
                    }
                }
            }
        }
        return -1 ;
    }

    public int searchV1(int[] nums, int target){
        int lo = 0, hi = nums.length - 1, mid = 0;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if(target > nums[lo]){

            }

        }
        return -1;
    }
}
