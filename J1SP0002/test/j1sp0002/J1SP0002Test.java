/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package j1sp0002;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class J1SP0002Test {

    public J1SP0002Test() {
    }

    @Test
    public void testSortArrayBySelectionSort() {
        int[] inputArray = {3, 1, 5, 2, 4};
        int[] expectedArray = {1, 2, 3, 4, 5};
        J1SP0002.sortArrayBySelectionSort(inputArray);
        assertArrayEquals(expectedArray, inputArray);
    }
    
    @Test
    public void testSortArrayBySelectionSortValidWithSameElement() {
        int[] testArray = new int[]{5, 2, 1, 4, 2};
        J1SP0002.sortArrayBySelectionSort(testArray);
        int[] expectedArray = new int[]{1, 2, 2, 4, 5};
        assertArrayEquals(expectedArray, testArray);
    }

    @Test
    public void testSortArrayBySelectionSortWithEmptyArray() {
        int[] inputArray = {};
        int[] expectedArray = {};
        J1SP0002.sortArrayBySelectionSort(inputArray);
        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testSortArrayBySelectionSortWithSingleElement() {
        int[] inputArray = {1};
        int[] expectedArray = {1};
        J1SP0002.sortArrayBySelectionSort(inputArray);
        assertArrayEquals(expectedArray, inputArray);
    }
    
    @Test
    public void testSortArrayBySelectionSortInvalid() {
        int[] testArray = null; 
        J1SP0002.sortArrayBySelectionSort(testArray); 
    }

}
