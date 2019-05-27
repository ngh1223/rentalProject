package rental2;

public abstract class BookInfo implements Book {
	
	String bookName; //책이름
	String genre; //장르
	
	BookInfo(String bookName, String genre){
		this.bookName = bookName;
		this.genre = genre;
		
	}
	

}
