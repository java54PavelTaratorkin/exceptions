package telran.exceptions.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;

import org.junit.jupiter.api.Test;

import telran.exceptions.BallBrokenFloor;
import telran.exceptions.NumberGreaterRangeMaxException;

class BallBrokenFloorTests {

	private static final int N_FLOORS = 100;

	@Test
	void test() throws Exception {
		BallBrokenFloor bbf = new BallBrokenFloor(N_FLOORS);
		assertEquals(bbf.getBrokenFloor(), getMinBrokenFloor(bbf));
	}

	private int getMinBrokenFloor(BallBrokenFloor bbf) {
		// using binary search algorithm and only method checkFloor 
		// of the class BallBrokenFloor
		// you should find minimal floor, from which a ball will be broken
		int left = 1;
		int right = N_FLOORS;
		int middle = (left + right) / 2;
		while(left < right) {			
			try {
				bbf.checkFloor(middle);
				left = middle + 1;
			} catch (Exception e) {
				right = middle;
			}
			middle = (left + right) / 2;
		}
		return middle;
	}
	
}
