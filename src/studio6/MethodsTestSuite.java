package studio6;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import studio6.tests.RecursiveGCDTestSuite;
import studio6.tests.RecursiveGeometricSumTestSuite;
import studio6.tests.IterativeTestSuite;
import studio6.tests.RecursiveToReversedTestSuite;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ IterativeTestSuite.class, RecursiveGeometricSumTestSuite.class, RecursiveGCDTestSuite.class,
		RecursiveToReversedTestSuite.class, })
public class MethodsTestSuite {

	
public static int countOdd(int[] array){
	int count = 0;
	for(int i = 0; i < array.length; i++){
		if(array [ i ] % 2 != 0) {
			count ++;
		}
	}
	return count;
	
}

public static int geometricSum(int[]array) {
	int i = 0;
	return geometricSumHelper(array, i);
}

public static int geometricSumHelper(int[] array, int i) {
	if(i >= array.length) { // base case
		return 0;
	
		
	}
	else {
		if(array[i] % 2 != 0) {
			return 1 + geometricSumHelper(array, i+1);
		}
		return geometricSumHelper(array, i+1);
	}
}
	
}
