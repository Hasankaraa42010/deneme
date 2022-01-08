package kodlamaio.northwind.core.utilties.results;

public class SuccesResult extends Result {
	public SuccesResult() {
		super(true);
	}
	public SuccesResult(String message) {
		super(true,message);
	}
}
