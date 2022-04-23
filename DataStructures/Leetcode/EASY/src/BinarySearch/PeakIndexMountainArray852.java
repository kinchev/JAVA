package BinarySearch;

public class PeakIndexMountainArray852 {
    public int peakIndexInMountainArray(int[] arr) {
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=(low+high)>>>1;
            if(arr[mid]>arr[mid+1]){
                high=mid;
            }else{
                low=mid+1;
            }

        }
        return  low;

    }
}
