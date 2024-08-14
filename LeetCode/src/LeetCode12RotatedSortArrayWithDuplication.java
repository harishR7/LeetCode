public class LeetCode12RotatedSortArrayWithDuplication {
    public static void main(String[] args) {
        int arr[]={4,4,6,4,4,4,4};
        int target=4;
        System.out.println(rotatedSortArrayWithDuplication(arr,target));
    }

static int rotatedSortArrayWithDuplication(int arr[],int target){
        int pivot=findPivot(arr);
        if(pivot==target){
            return pivot;
        }
        if(pivot==-1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }
       if(arr[0]<=target) {
        return binarySearch(arr, target, 0, pivot - 1);
    }
    else{
        return binarySearch(arr,target,pivot+1,arr.length-1);
    }
}
    static int binarySearch(int arr[],int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[target]){
                start=mid+1;

            } else if (arr[mid]>arr[target]) {
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    static int findPivot (int arr[]){
        int start=0;
        int end =arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end &&arr[mid]>arr[mid+1]){
                return arr[mid];
            } else if (start<mid && arr[mid-1] >arr[mid]) {
                return arr[mid-1];
            }

            //for not duplicated arrays
//            if(arr[mid]<=start){
//                start=mid+1;
//
//            }else if (arr[start]<=arr[mid])
//            {
//                end=mid-1;
//            }


            // for duplicate arrays
            if(arr[start]==arr[mid] && arr[mid]==arr[end]){
                if (arr[start]>arr[start+1]) {
                    return arr[start];
                }
                start--;
                if (arr[end]>arr[end-1]){
                    return arr[end];
                }
                end--;
            } else if (arr[start]<arr[mid] || (arr[start]== arr[mid] && arr[mid]>arr[end])) {
                start=mid+1;
            }else {
                end=mid-1;
            }

        }
        return -1;
    }
}
