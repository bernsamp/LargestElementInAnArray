
public class Main {
    static int[] arr = {1, 15, 42, 13, 102, 20, 876, 239, 9, 837};

    static int largestElement(){

        int max = arr[0];

        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }


    public static void main(String[] args){
        System.out.println("The largest element in the given array is: " + largestElement());
    }
}