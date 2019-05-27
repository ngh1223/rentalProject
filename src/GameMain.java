package rental2;


public class GameMain {

	public static void main(String[] args) {
		
		
		
		
		
		Rental rental = Rental.getInstance();
		
		
		while(true) {
			int choice = rental.showMenu();
			
			switch(choice) {
			case Util.BORROW:
				rental.borrow();
				break;
			case Util.RETURN:
				rental.returnBack();
				break;
			}

		}
		

		

	}

}
