package flattest;

import org.junit.Assert;
import org.junit.Test;
import flatter.ArrayFlatter;

import java.util.ArrayList;

import java.io.IOException;

public class FlattenTest {
  
    @Test
    public void testEmpty() throws IOException {
      Object[] arr = {};
      ArrayList<Object> flat = new ArrayList<>();
      ArrayFlatter.flatten(arr, flat);
      
      Assert.assertEquals(arr, flat.toArray());
    }

    @Test
    public void testnormal() throws IOException {
      Object[] arr = {1,2,3,4};
      ArrayList<Object> flat = new ArrayList<>();
      ArrayFlatter.flatten(arr, flat);
      
      Assert.assertEquals(arr, flat.toArray());
    }


    @Test
    public void testflatten1() throws IOException {
      Object[] arr = { new Object[]{1,2, new Object[]{3}},4};
      ArrayList<Object> flat = new ArrayList<>();
      ArrayFlatter.flatten(arr, flat);
      
      Assert.assertEquals(new Object[]{1,2,3,4}, flat.toArray());
    }

    @Test
    public void testflatten2() throws IOException {
      Object[] arr = { new Object[]{1,2, new Object[]{3,4,5}},6};
      ArrayList<Object> flat = new ArrayList<>();
      ArrayFlatter.flatten(arr, flat);
      
      Assert.assertEquals(new Object[]{1,2,3,4,5,6}, flat.toArray());
    }
}