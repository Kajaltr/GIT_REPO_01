package Repository;

public class Post_Create_Retry_F 
    {
	public static String baseURI() 
	{
		String baseURI = "https://reqres.in/";
		return baseURI;
	}

	public static String Resource() 
	{
		String Resource = "api/users";
		return Resource;
	}

	public static String RequestBody() 
	{
		String RequestBody = 
				"{\r\n" 
		+ "    \"name\": \"morpheus\","
		+ "\r\n" + "    \"job\": \"leader\"\r\n" 
		+ "}";
		return RequestBody;
	}
    }