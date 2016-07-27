package com.hybrid;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.util.Scanner;

public class WebClientTest {

	public static void main(String[] args) throws UnknownHostException, IOException {
//		GET();
		POST();
	}
	
	
	private static void POST() throws UnknownHostException, IOException {
		System.out.println("Start..");
		Socket sok = new Socket("localhost", 8080);
		PrintWriter request = new PrintWriter(sok.getOutputStream());
		Scanner response = new Scanner(sok.getInputStream());

		/*
		 *  Request 전문 송신
		 */
		String body = "name= " + URLEncoder.encode("홍 길동" , "utf-8") 
					+ "&addr= " + URLEncoder.encode("서울턱별시 마포구 대흥동" , "utf-8");
//		body = URLEncoder.encode(body, "utf-8");
		System.out.println("body = " + body);
		System.out.println("body.length = " + body.length());
		
		request.println("POST /Hello.jsp HTTP/1.1");
		request.println("Host:localhost:8080");
		request.println("Content-Type:application/x-www-form-urlencoded");
		request.println("Content-Length:" + body.length());
		request.println();
		request.println(body);
		request.flush();
		
		/*
		 * Response 전문 송신
		 */
		
		while (response.hasNextLine()) {
		
			String line = response.nextLine();
			System.out.println(line);
			if (line.toLowerCase().lastIndexOf("</html>") != -1 ) 
				break;
		}
		
		sok.close();
		System.out.println("end");
		
	}


	public static void GET() throws UnknownHostException, IOException {
		System.out.println("Start...");
		
//		Socket sok = new Socket("www.google.com", 80);
		Socket sok = new Socket("localhost", 8080);
		InputStream in = sok.getInputStream();
		OutputStream out = sok.getOutputStream();
		
		PrintWriter request = new PrintWriter(out);
		
		Scanner response = new Scanner(in);
		
		//한글자 띄우고 사용하기위해 따로 변수처리하고 엔코딩추가함
		//스페이스바가 들어가기 위해 반드 시 엔코딩처리를 해줘야한다.
		String name = "홍 길동";
		name = URLEncoder.encode(name);
		System.out.println("name= " + name);
		
		
//		request.println("Host:www.google.com:80");
		request.println("GET /Hello.jsp?name=" + name +" HTTP/1.1");
		request.println("Host:localhost:8080");
		request.println();
		request.println();
		request.flush(); // 완전히 비우는거 

		while (response.hasNextLine()) {
			String line = response.nextLine();
			System.out.println(line);
			if (line.toLowerCase().lastIndexOf("</html>") != -1) {
				// 마지막 문자가 html 가 있을때 리턴
				// 대문자일수도 있으니 tolowercase를 넣어줌. 
				break;
			}
		}
		
		sok.close();
		System.out.println("end..");
		
	}

}
