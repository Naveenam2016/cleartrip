package library.db;

import java.io.IOException;

public class LibraryException extends IOException {
	/**
	 * A version number for this class so that serialization can occur without
	 * worrying about the underlying class changing between serialization and
	 * de-serialization.
	 */
	private static final long serialVersionUID = 2980;

	public LibraryException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LibraryException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public LibraryException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public LibraryException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
