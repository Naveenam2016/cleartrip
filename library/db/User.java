package library.db;

public class User {
	/**
	 * Stores the flag indicating the deleted status of a User.
	 */
	private Integer flag = 0x8000;

	/**
	 * Stores the user Id for the User. This number uniquely identifies a user.
	 */
	private long userID = 0;

	/**
	 * Stores the name of the user.
	 */
	private String name = "";

	/**
	 * @return
	 */
	public Integer getFlag() {
		return flag;
	}

	/**
	 * @param flag
	 */
	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	/**
	 * @return
	 */
	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param userID
	 * @param name
	 */
	public User(long userID, String name) {
		super();
		this.userID = userID;
		this.name = name;
	}

}
