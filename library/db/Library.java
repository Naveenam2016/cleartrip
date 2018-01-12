package library.db;

import java.util.HashMap;
import java.util.Map;

/**
 * Library object
 * 
 * @author Naveen Narayanan
 *
 */
public class Library {

	/**
	 * 
	 */
	private Map<Integer, Book> books = new HashMap<Integer, Book>();

	/**
	 * @return
	 */
	public Map<Integer, Book> getBooks() {
		return books;
	}

	/**
	 * @param books
	 */
	public void setBooks(Map<Integer, Book> books) {
		this.books = books;
	}

}
