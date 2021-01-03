import java.util.*;
import java.io.*;

public class Sorts {
  //Bubble Sort of int Arrays
  //Upon completion, elements of the array will be in increasing OrderedArrayList
  //@param data the elements to be sorted
  public static void bubbleSort(int[] data) {
      for (int i =0; i< data.length-1;i++) {
        for (int j = 0; j<data.length-i-1;j++) {
          if (data[j] > data[j+1]){
            int notSort = data[j];
            data[j] = data[j+1];
            data[j+1] = notSort;
          }
        }
      }
    }
    public static void selectionSort (int[] data) {
      for (int i=0; i<data.length;i++){
        int s = i;
        for (int j=i;j<data.length;j++) {
          if (data[s] >data[j]) {
            s = j;
          }
        }
        int notSorted = data[i];
        data[i] = data[s];
        data[s] = notSorted;
      }
    }
    public static void insertionSort(int[] data) {
      for (int i=0; i<data.length;i++) {
        int j = i;
        while ((j>0) && (data[j-1]>data[j])) {
          int nonSort = data[j];
          data[j]=data[j-1];
          data[j-1] = nonSort;
          j--;
        }
      }
    }
  }
