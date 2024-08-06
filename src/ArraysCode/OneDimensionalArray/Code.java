package ArraysCode.OneDimensionalArray;

public class Code {

    public void printArray(int[] array){
        for(int i=0; i<array.length; i++){ // O(n)
            System.out.print(array[i]+" "); // O(1)
        }
    }

    // find even method
    public void findEven(int[] array){
        for(int i=0; i<array.length; i++){
            if(array[i] % 2 == 0){
                System.out.print(array[i]+" ");
            }
        }
    }

    // remove even method
    public int[] removeEven(int[] array){
        int oddCount = 0; // O(1)
        for(int i=0; i<array.length; i++){ // O(n)
            if(array[i] % 2 != 0){
                oddCount++; // O(1)
            }
        }
        int[] evenArray = new int[oddCount];
        int evenIndex = 0; // O(1)
        for(int i=0; i<array.length; i++){ // O(n)
            if(array[i] % 2 != 0){
                evenArray[evenIndex] = array[i]; // O(1)
                evenIndex++; // O(1)
            }
        }
        return evenArray; // O(1)
    }

    // reverse array method
    public int[] reverseArray(int[] array){
        int[] reversedArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[array.length - 1 - i] = array[i];
        }
        return reversedArray;
    }

    // find minimum value method
    public int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(Integer val : array){
            if(val < min){
                min = val;
            }
        }
        return min;
    }

    // find max value method
    public int findMax(int[] array){
        int max = Integer.MIN_VALUE;
        for(Integer val : array){
            if(val > max){
                max = val;
            }
        }
        return max;
    }

    // find max two value method
    public int[] findTwoMax(int[] array){
        int[] maxArray = new int[2];
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (Integer val : array) {
            if(val > max){
                max = max2;
                max2 = val;
            }
        }
        maxArray[0] = max;
        maxArray[1] = max2;
        return maxArray;
    }

    // find max second value method
    public int findMaxSecond(int[] array){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (Integer val : array) {
            if(val > max){
                secondMax = max;
                max = val;
            }
        }
        return secondMax;
    }

    // move zero method
    public int[] moveZero(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] != 0){
                array[count] = array[i];
                count++;
            }
        }

        for (int i = count; i < array.length; i++){
            array[i] = 0;
        }
        return array;
    }

    // array two value sum
    public int[] twoSum(int[] array, int target){
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if(array[i] + array[j] == target){
                    result[0] = array[i];
                    result[1] = array[j];
                    return result;
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    // array value sum method
    public int sumArray(int[] array){
        int sum = 0;
        for (Integer val : array){
            sum += val;
        }
        return sum;
    }

    // array resize method
    public int[] resize(int[] array, int capacity){
        int[] temp = new int[capacity];
        for (int i = 0; i < array.length; i++){
            temp[i] = array[i];
        }
        array = temp;
        return array;
    }
}
