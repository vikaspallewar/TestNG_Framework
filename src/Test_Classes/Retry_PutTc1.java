package Test_Classes;

import org.testng.Assert;
import org.testng.annotations.Test;

import Common_API_Methods.Retry_API_Methods_Put;
import RequestRepository.Retry_Put_Repository;
import io.restassured.path.json.JsonPath;

public class Retry_PutTc1 {
	@Test
	
public static void extractor() {
	
		
		for(int i=0; i<5; i++) {
		
		int statusCode = Retry_API_Methods_Put.ResponsestatusCode(Retry_Put_Repository.BaseURI(),Retry_Put_Repository.Put_Resource(),Retry_Put_Repository.Put_Req_Tc1());
		
		//if(statusCode==200) {
		if(statusCode==201) {
			
			System.out.println("status Code is correct ");
		
		String ResponseBody = Retry_API_Methods_Put.ResponseBody(Retry_Put_Repository.BaseURI(),Retry_Put_Repository.Put_Resource(),Retry_Put_Repository.Put_Req_Tc1());
		System.out.println(ResponseBody);
		
		String RequestBody = Retry_Put_Repository.Put_Req_Tc1();
		validator(ResponseBody,RequestBody);
		break;
		}
		else {
			System.out.println("status code is incorrect");
		}
	}
}	
	
	public static void validator(String ResponseBody, String RequestBody) {
		
		JsonPath jspResponse = new JsonPath(ResponseBody);
		String res_name = jspResponse.getString("name");
	    String res_job = jspResponse.getString("job");
	    String res_updatedAt = jspResponse.getString("updatedAt");
	    res_updatedAt = res_updatedAt.substring(0,11);
	    
	    Assert.assertEquals(res_name,"morpheus");
		Assert.assertEquals(res_job,"zion resident");
		
		
		}


}
