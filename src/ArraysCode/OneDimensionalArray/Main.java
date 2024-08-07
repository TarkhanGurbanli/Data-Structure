package ArraysCode.OneDimensionalArray;

public class Main {

    public static void main(String[] args) {

        // If it exceeds the given size, it gives this error: ArrayIndexOutOfBoundsException

        // New Array Create
    /*  int[] arr = new int[5]; O(1)
        arr[0] = 2; O(1)
        arr[1] = 3; O(1)
        arr[2] = 4; O(1)
        arr[3] = 5; O(1)
        arr[4] = 6; O(1)
    */
        // Update Array
    /*
        arr[0] = 7; O(1)
        arr[1] = 8; O(1)
        arr[2] = 9; O(1)
        arr[3] = 10; O(1)
        arr[4] = 11; O(1)
        arr[5] = 12; O(1)
        for(int num : arr){ O(n)
            System.out.println(num); O(1)
        }
    */

        // New Array Create Version 2
//        int[] arr = {2,3,4,5,6,7}; O(1)


// =========================================================================

        // Array method call

        // print array method
        Code code = new Code(); //O(1)
//        int[] array = new int[7]; O(1)
//        array[0] = 1; O(1)
//        array[1] = 2; O(1)
//        array[2] = 3; O(1)
//        array[3] = 4; O(1)
//        array[4] = 5; O(1)
//        array[5] = 6; O(1)
//        array[6] = 7; O(1)
//        code.printArray(array); O(n)

// ---------------------------------------------------------------------------
        // find even method
        int[] arr = {1,2,3,4,5,6,7,8,10};
//        code.findEven(arr);
// ---------------------------------------------------------------------------
        // remove even method
//        int[] result = code.removeEven(arr);
//        code.printArray(result);
// ---------------------------------------------------------------------------
        // reverse array method
//        int[] array = code.reverseArray(arr);
//        code.printArray(array);
//---------------------------------------------------------------------------
        // find minimum value
//        int result = code.findMin(arr);
//        System.out.println(result);
//---------------------------------------------------------------------------
//        find max method
//        int result = code.findMax(arr);
//        System.out.println(result);
//---------------------------------------------------------------------------
//        find teo max method
//        int[] result = code.findTwoMax(arr);
//        code.printArray(result);
//---------------------------------------------------------------------------
      // find max second metod
//        int result = code.findMaxSecond(arr);
//        System.out.println(result);
//---------------------------------------------------------------------------/
      // move zero method
//      int[] arr2 = {0,1,0,4,12};
//      int[] array = code.moveZero(arr2);
//      code.printArray(array);
//---------------------------------------------------------------------------/
        // array two value sum
//        int[] arr = {32,54,23,12,454};
//        int[] result = code.twoSum(arr, 486);
//        code.printArray(result);
//---------------------------------------------------------------------------/
        // array value sum method
//        System.out.println(code.sumArray(arr));
//---------------------------------------------------------------------------/
        // array resize method
//        int[] array = {2,3,4,5,6,7,8,10};
//        System.out.println("Original Array Size: " + array.length);
//        array = code.resize(array, 13);
//        System.out.println("Original Array Size After Size: " + array.length);
//---------------------------------------------------------------------------/
        // find the missing number in an array
//        int[] array = {1,3,6,8,2,4,7};
//        System.out.println(code.findMissingNum(array));
//---------------------------------------------------------------------------/
//        String str = "tamsat";
//        System.out.println(code.checkPalindrome(str));
//---------------------------------------------------------------------------/
        // find min and max value
        int[] array = {1,2,3,4,5,6};
        code.printArray(code.findMinAndMax(array));
    }
}
