package utils;

public class StringUtils {

	public StringUtils() {
		// TODO Auto-generated constructor stub
	}
	public static final String INSERT_USER= "INSERT INTO user "
			+"(userName ,  firstName ,  lastName ,  dob ,  gender ,  email ,  phoneNumber ,  address ,  password )" 
			+"VALUES (?,?,?,?,?,?,?,?,?)";
	
	 public static final String GET_LOGIN_USER_INFO = "SELECT * from user where userName = ? and password = ?";
	 public static final String GET_ALL_USER_INFO = "SELECT * FROM user";

	 public static final String USER_NAME ="userName";
	 public static final String FIRST_NAME ="firstName";
	 public static final String LAST_NAME ="lastName";
	 public static final String BIRTHDAY ="dob";
	 public static final String GENDER ="gender";
	 public static final String EMAIL ="email";
	 public static final String PHONE_NUMBER ="phoneNumber";
	 public static final String ADDRESS ="address";
	 public static final String PASSWORD ="password";		
}
