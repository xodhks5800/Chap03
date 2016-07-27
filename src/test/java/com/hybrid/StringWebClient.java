
package com.hybrid;

import java.io.IOException;
import java.net.UnknownHostException;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

public class StringWebClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
//		GET();
		POST();
	}
	
	private static void POST() {
		System.out.println("POST SPRING Start..");

		RestTemplate rest = new RestTemplate();
		
		LinkedMultiValueMap<String, String> params = new LinkedMultiValueMap<>();
		
		params.add("name", "횽 길동");
		params.add("addr", "부산 동래구 해물동 파전빌딩");
		
		String body = rest.postForObject("http://localhost:8080/Hello.jsp", params , String.class);
	
		System.out.println(body);
		
		System.out.println("POST SPRING End..");
	}

	private static void GET() {
		System.out.println("GET Start Spring..");
		
		RestTemplate rest = new RestTemplate();
		
		String body = rest.getForObject("http://localhost:8080/Hello.jsp?name={name}&addr={addr}", String.class,
										"옹 길 동" , "서울 턱븅시 마포구 대흥동 중앙아트학원");
		
		System.out.println(body);
		
		System.out.println("GET End Spring..");
	}
	

}
