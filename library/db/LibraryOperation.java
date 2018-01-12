package library.db;

/**
 * Main interface for the Operations
 * 
 * These are the operations permitted by the Library System. 1. Ability to add
 * books to the system. 2. Ability to add users to the system. 3. Ability to
 * lend books to users. 4. Ability to return books to the library. 5. Ability to
 * limit the number of books borrowed by user. 6. Ability to search a book by
 * title, author. 7. Ability to search a user by name
 * 
 * @author Naveen Narayanan
 *
 *
 *
 */
public interface LibraryOperation {

	/**
	 * @return
	 * @throws LibraryException
	 */
	public boolean addBooks() throws LibraryException;

	/**
	 * @return
	 * @throws LibraryException
	 */
	public boolean addUsers() throws LibraryException;

	/**
	 * @return
	 * @throws LibraryException
	 */
	public boolean lendBooks() throws LibraryException;

	/**
	 * @return
	 * @throws LibraryException
	 */
	public boolean returnBooks() throws LibraryException;

	/**
	 * @return
	 * @throws LibraryException
	 */
	public boolean checkLimits() throws LibraryException;

	/**
	 * @return
	 * @throws LibraryException
	 */
	public boolean search() throws LibraryException;

}
