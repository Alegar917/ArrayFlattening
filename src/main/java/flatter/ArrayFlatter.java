package flatter;

import java.util.ArrayList;


public class ArrayFlatter {

 /*
  * A recursive function to flat out the array ,
  * which recursivly goes thorugh each nested array
  * and addes the value into the arraylist in the end if not
  * an array 
  * @param  array     an array of objects that are going to flatten 
  * @param  flatarray  a list of flattened out objects
  */
  public static void flatten(Object[] array, ArrayList<Object> flatarray) {
    for (Object item : array) {

      // check to see if the object is an array object type
      // which recrusive goes through the array
      if (item instanceof Object[]) {
        flatten((Object[]) item, flatarray);
      }
      else{
        // adds the object into the arraylist;
        // if we wanted to have a list of integer we just need
        // to cast the object to an int and convert the arraylist to int
        flatarray.add(item);
      }
    }
  }
  
  public static void main(String[] args) {
//    Object[] arr = { new Object[]{1,2, new Object[]{3}},4};
//    ArrayList<Object> flat = new ArrayList<>();
//    flatten(arr,flat);
//    System.out.println("flat "+ flat.toString());
  }
}
