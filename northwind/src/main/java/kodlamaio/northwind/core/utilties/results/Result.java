package kodlamaio.northwind.core.utilties.results;

public class Result {
	private boolean success;
	private String message;

	public Result(boolean success) {
		this.success=success;
		
	}
public Result(boolean success,String message) {
		this(success);
		this.success=success;
	}
public boolean isSuccess() {

		return this.success=success;
}
public String getMessage() {
	return this.message=message;
	
}
}
