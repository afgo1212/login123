package fddss;

import com.jerrywu.http.HTTPConnection;
import com.jerrywu.http.HTTPMethod;
import com.jerrywu.http.HTTPRequestTag;
import com.jerrywu.http.HTTPResponseTag;

public class bbsa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.print("HellowWorld");
			HTTPConnection con = new HTTPConnection();
			HTTPRequestTag request = new HTTPRequestTag("http://140.127.113.227/kuas/perchk.jsp",HTTPMethod.POST);
			
			request.pushAttributes("uid","1102137215");
			request.pushAttributes("pwd","7523" );
			
			HTTPResponseTag response = con. getResult(request, "UTF-8");
			System.out.print(response.getResponse());
			
			
			HTTPRequestTag requestData = new HTTPRequestTag("http://140.127.113.227/kuas/fnc.jsp",HTTPMethod.POST);
			requestData.setCookies("JSESSIONID=AAAGuvlYSUE+jVvNsmPGkA");
			HTTPResponseTag responseStudentDate = con.getResult(requestData,"UTF-8");
			
			System.out.println(responseStudentDate.getResponse());
			//temp.solite("")
			
			
			
					
	}

	private static void getResult(HTTPRequestTag request, String string) {
		// TODO Auto-generated method stub
		
	}

}
