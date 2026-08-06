class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]){
                // ascending part
                start = mid + 1;
            } else {
                // descending part
                end = mid - 1;
            }
        }
        return start; //or mid
    }
}