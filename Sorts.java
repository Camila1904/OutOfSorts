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
  }
