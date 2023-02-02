package practice04_Employee;

public class EmployeeException extends Exception {

	private static final long serialVersionUID = -5434434020338266466L;
	private int errorCode;
	
	public EmployeeException(String message, int errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

}
