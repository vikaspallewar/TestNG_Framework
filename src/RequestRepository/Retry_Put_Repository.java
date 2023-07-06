package RequestRepository;

public class Retry_Put_Repository {
	
	public static String BaseURI() {
		String baseURI = "https://reqres.in/";
		return baseURI;
	}
	public static String Put_Resource() {
		String Resource = "api/users/2";
		return Resource;
	}
	public static String Put_Req_Tc1() {
		String RequestBody = "{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}";
		return RequestBody;
		
	   }
	}


