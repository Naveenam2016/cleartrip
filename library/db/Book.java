package library.db;

/**
 * @author Naveen Narayanan
 *
 */
public class Book {

	/**
	 * Stores the flag indicating the deleted status of a Book.
	 */
	private Integer flag = 0x8000;

	/**
	 * Stores the book Number for the Book. This number uniquely identifies a Book.
	 */
	private long bookNo = 0;

	/**
	 * Stores the name of the Book.
	 */
	private String name = "";
	/**
	 * Stores the name price room. This field includes the currency symbol
	 * <code>String</code>.
	 */
	private String price = "$0";

	/**
	 * @param bookNo
	 * @param name
	 * @param price
	 * @param date
	 */
	public Book(long bookNo, String name, String price, String date) {
		super();
		this.bookNo = bookNo;
		this.name = name;
		this.price = price;
		this.date = date;
	}

	/**
	 * The published date, format is yyyy/mm/dd.
	 */
	private String date = "1974/02/20";

}
