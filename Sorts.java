import java.util.*;
import java.io.*;

public class Sorts {
  //Bubble Sort of int Arrays
  //Upon completion, elements of the array will be in increasing OrderedArrayList
  //@param data the elements to be sorted
  public static void bubbleSort(int[]data) {
    boolean sort = false;
    for (int end = 0; !sort; end++) {
      sort= true;
      for (int i =0; i< data.length-1-end;i++) {
        if (data[i] > data[i+1]){
          sort = false;
          int notSort = data[i];
          data[i] = data[i+1];
          data[i+1] = notSort;
        }
      }
    }
  }
}
