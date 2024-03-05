/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package j1sp0001;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class J1SP0001Test {

    public J1SP0001Test() {
    }
    
    @Test
    public void testSortArrayByBubbleSortValid() {
        int[] testArray = new int[]{5, 3, 1, 4, 2};
        J1SP0001.sortArrayByBubbleSort(testArray);
        int[] expectedArray = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(expectedArray, testArray);
    }

    @Test
    public void testSortArrayByBubbleSortValidWithSameElement() {
        int[] testArray = new int[]{5, 2, 1, 4, 2};
        J1SP0001.sortArrayByBubbleSort(testArray);
        int[] expectedArray = new int[]{1, 2, 2, 4, 5};
        assertArrayEquals(expectedArray, testArray);
    }

    @Test
    public void testSortArrayByBubbleSortValidWithEmptyArray() {
        int[] testArray = new int[]{};
        J1SP0001.sortArrayByBubbleSort(testArray);
        int[] expectedArray = new int[]{};
        assertArrayEquals(expectedArray, testArray);
    }

    @Test
    public void testSortArrayByBubbleSortValidSingleElement() {
        int[] testArray = new int[]{5};
        J1SP0001.sortArrayByBubbleSort(testArray);
        int[] expectedArray = new int[]{5};
        assertArrayEquals(expectedArray, testArray);
    }

    @Test
    public void testSortArrayByBubbleSortInvalid() {
        int[] testArray = null;
        J1SP0001.sortArrayByBubbleSort(testArray);
    }

}
