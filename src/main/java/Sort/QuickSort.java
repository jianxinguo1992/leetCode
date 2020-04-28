package Sort;

import java.util.Arrays;

/**
 * @author JIANXIN.GUO
 * @date 2019-12-04 17:02
 **/
public class QuickSort {


    public static void main(String[] args) {
        int [] array = new int[]{3,5,2,6,7,1,8,11,4};

        quickSort(array,0,8);

        System.out.println(Arrays.toString(array));


    }


    public static void quickSort(int[] array, int start, int end){

        if (array.length < 0){
            return ;
        }
        if (start >= end){
            return ;
        }

        int left = start;
        int right = end;

        int temp = array[left];

        while ( left < right){
            while (left < right && array[right] > temp){
                right--;
            }
            array[left] = array[right];
            while (left < right && array[left] < temp){
                left++;
            }
            array[right] = array[left];
        }
        array[left] = temp;
        quickSort(array,start, left-1);
        quickSort(array,left+1, end);

    }

}
