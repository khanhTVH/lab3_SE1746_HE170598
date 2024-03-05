/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package j1sp0004;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class J1SP0004Test {
    
    public J1SP0004Test() {
    }
    
     @Test
    public void testEmptyArray() {
        int[] array = {};
        int[] expected = {};
        J1SP0004 sorter = new J1SP0004();
        sorter.quickSort(array, 0, array.length - 1);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        J1SP0004 sorter = new J1SP0004();
        sorter.quickSort(array, 0, array.length - 1);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testReverseSortedArray() {
        int[] array = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        J1SP0004 sorter = new J1SP0004();
        sorter.quickSort(array, 0, array.length - 1);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testRandomArray() {
        int[] array = {3, 2, 5, 1, 4};
        int[] expected = {1, 2, 3, 4, 5};
        J1SP0004 sorter = new J1SP0004();
        sorter.quickSort(array, 0, array.length - 1);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testArrayWithDuplicates() {
        int[] array = {3, 2, 5, 1, 4, 3};
        int[] expected = {1, 2, 3, 3, 4, 5};
        J1SP0004 sorter = new J1SP0004();
        sorter.quickSort(array, 0, array.length - 1);
        assertArrayEquals(expected, array);
    }
    
}
