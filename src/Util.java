package rental2;

import java.util.Scanner;

public interface Util {
	
	Scanner keyboard = new Scanner(System.in);
	
	
	public int INSERT = 1, DELET = 2, SERCH = 3, ALLLIST = 4, QUIT = 5;
	public int BORROW = 1, RETURN = 2, BORROWINFO=3;
	public int BOOK = 1, DVD = 2, GAME = 3;

	
}
