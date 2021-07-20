package adapter;

public class WebClient {

	public static void main(String[] args) {
		WebRequester requester = new WebAdapter(new WebService());
		requester.request();
	}

}
