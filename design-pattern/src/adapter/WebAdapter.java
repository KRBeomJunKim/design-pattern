package adapter;

public class WebAdapter implements WebRequester{

	private WebService webService;

	public WebAdapter(WebService webService) {
		this.webService = webService;
	}

	@Override
	public int request() {
		webService.request();
		return 0;
	}

}
