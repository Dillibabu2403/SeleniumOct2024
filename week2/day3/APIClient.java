package week2.day3;

public class APIClient {

	public void sendRequest(String endPoint) {
		System.out.println("Endpoint request is:"+endPoint);
	}
	
	public void sendRequest(String endPoint,String requestBody,boolean requestStatus) {
		System.out.println("Endpoint request is:"+endPoint);
		System.out.println("Request body is :"+requestBody);
		System.out.println("Request status is :"+requestStatus);
	}
	
	public static void main(String[] args) {
		APIClient ac=new APIClient();
		ac.sendRequest("https://platform.testleaf.com/");
		ac.sendRequest("http://leaftaps.com/opentaps/", "HTTP", true);
	}

}
