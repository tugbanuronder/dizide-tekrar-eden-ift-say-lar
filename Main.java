import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static boolean isFind(int arr[], int value){

        for(int i : arr){

            if(i == value){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        int[] arr= {2,3,4,8,2,9,8,2,4,6,7,9,6};
        int[] arr2= new int[arr.length];

        int startIndex = 0;

        for(int i=0 ; i < arr.length ; i++){

            for(int j=0 ; j < arr.length ; j++){

                if(i != j && arr[i]==arr[j] && arr[i]%2==0){

                    if(!isFind(arr2 , arr[i])) {

                        arr2[startIndex++] = arr[j];
                    }
                    break;
                }
            }
        }

        for(int i : arr2){

            if(i != 0){

                System.out.println(i);
            }
        }
    }
}