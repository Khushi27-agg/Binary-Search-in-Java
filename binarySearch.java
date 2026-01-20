class BSearch{
    static int BinarySearch(int arr[] , int x){
    int low=0;
    int high = arr.length-1;
    while(low<=high){
        int mid = low + (high - low)/2;
        // Check if x is present at mid
        if(arr[mid] == x){
            return mid;
        }
        // If x greater, ignore left half
        else if(arr[mid]<x){
            low = mid+1;
        }
        // If x smaller, ignore right half
        else{
            high = mid-1;
        }
    }
    //If the element is not present it will return -1
    return -1;
}
    public static void main(String[] args) {
        System.out.println("Binary Search");
        //Array must be sorted before binary search
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        int result = BinarySearch(arr,x);
        if(result == -1){
            System.out.println("The element is not present in the array");
        }
        else{
            System.out.println("The element is present at the index:"+result);
        }
        
    }
}