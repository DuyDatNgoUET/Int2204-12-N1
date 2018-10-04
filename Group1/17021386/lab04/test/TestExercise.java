package test;

import static org.junit.Assert.*;

import org.junit.Test;

import neon.Exercise;

public class TestExercise {
		
		 public TestExercise() {
			
		}
		/* Test hàm max */
		@Test  
	    public void testMax1() {
	        
	        int x = 5;
	        int y = 2;
	        int result = 5;
	        int ExResult = Exercise.max(x, y);
	        assertEquals(result, ExResult);
	    }

		@Test
	    public void testMax2() {
	        
	        int x = 100;
	        int y = -2;
	        int result = 100;
	        int ExResult = Exercise.max(x, y);
	        assertEquals(result, ExResult);
	    }

	    @Test
	    public void testMax3() {
	        	        int x = 2911;
	        int y = 2208;
	        int result = 2911;
	        int ExResult = Exercise.max(x, y);
	        assertEquals(result, ExResult);
	    }

	    @Test
	    public void testMax4() {
	        
	        int x = 25;
	        int y = 8;
	        int result = 25;
	        int ExResult = Exercise.max(x, y);
	        assertEquals(result, ExResult);
	    }

	    @Test
	    public void testMax5() {
	        
	        int x = 0;
	        int y = 0;
	        int result = 0;
	        int ExResult = Exercise.max(x, y);
	        assertEquals(result, ExResult);
	    }
	

	    /* Test hàm minArray */
		@Test
	    public void testMinArray1() {
	        
	        int[] a = {0};
	        int result = 0;
	        int ExResult = Exercise.minArray(a);
	        assertEquals(result, ExResult);
	    }

		@Test
	    public void testMinArray2() {
	       
	        int [] a = {0, 6, -2};
	        int result = -2;
	        int ExResult = Exercise.minArray(a);
	        assertEquals(result, ExResult);
	    }

		@Test
	    public void testMinArray3() {
	       
	        int [] a = {0, 0, 0, 0};
	        int result = 0;
	        int ExResult = Exercise.minArray(a);
	        assertEquals(result, ExResult);
	    }

		@Test
	    public void testMinArray4() {
	        
	        int [] a = {3, 4, 5};
	        int result = 3;
	        int ExResult = Exercise.minArray(a);
	        assertEquals(result, ExResult);
	    }

		@Test
	    public void testMinArray5() {
	       
	        int [] a = {100, 1400, -12};
	        int result = -12;
	        int ExResult = Exercise.minArray(a);
	        assertEquals(result, ExResult);
	    }

	    /*Test hàm BMI*/
		@Test
	    public void testBMI1() {
	       
	        double weight = 50;
	        double height = 1.55;
	        String result = "Bình thường";
	        String ExResult = Exercise.BMI(weight, height);
	        assertEquals(result, ExResult);
	    }

		@Test
	    public void testBMI2() {
	        
	        double weight = 40;
	        double height = 1.55;
	        String result = "Thiếu cân";
	        String ExResult = Exercise.BMI(weight, height);
	        assertEquals(result, ExResult);
	    }
		@Test
	    public void testBMI3() {
	        
	        double weight = 60;
	        double height = 1.55;
	        String result = "Thừa cân";
	        String ExResult = Exercise.BMI(weight, height);
	        assertEquals(result, ExResult);
	    }

		@Test
	    public void testBMI4() {
	       
	        double weight = 55;
	        double height = 1.55;
	        String result = "Bình thường";
	        String ExResult = Exercise.BMI(weight, height);
	        assertEquals(result, ExResult);
	    }

		@Test
	    public void testBMI5() {
	       
	        double weight = 70 ;
	        double height = 1.68;
	        String result = "Thừa cân";
	        String ExResult = Exercise.BMI(weight, height);
	        assertEquals(result, ExResult);
	    }
}
