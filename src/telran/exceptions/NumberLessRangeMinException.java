package telran.exceptions;

@SuppressWarnings("serial")
public class NumberLessRangeMinException extends Exception {
	public NumberLessRangeMinException(int min, int number) {
		super(String.format("Number (%d) greater than range max (%d)", number, min));
	}
}
