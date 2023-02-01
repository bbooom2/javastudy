package ex03_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;



public class MainClass {
	
	public static void ex01() {
		
		/*
		 	한국공항공사_항공기 운항 정보 : 공항 코드 정보 
		 	1. 서비스 URL :  http://openapi.airport.co.kr/service/rest/AirportCodeList/getAirportCodeList
		 	2. 요청 변수(Request Parameter) : 
		 		1)ServiceKey
		 */
		String serviceKey = "tekLFDRud6c2r8qmZeXXUgLPg6EWixWlkpSKC22odGkoZI6ZJIrhboUrQNqCFziXutTfG77Z32ZhziAuQET7yQ==";
		String apiURL = "http://openapi.airport.co.kr/service/rest/AirportCodeList/getAirportCodeList"; 
		URL url = null;
		HttpURLConnection con = null; 
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try { // 순서 지켜서 작업 
		
			
		
			apiURL += "?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8"); 
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			
			con.setRequestMethod("GET"); //설정, 대문자로만 작성 가능. 요청하고자 하는 파라미터 주소창에 붙여서 사용하는 방식. 
			con.setRequestProperty("Content-Type", "application/xml; charset=UTF-8"); 
			
			int responseCode = con.getResponseCode();
			if(responseCode == 200) { //HttpURLConnection.HTTP_OK이 200을 의미한다. 
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			}else {
				reader  = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			String line = null;
			StringBuilder sb = new StringBuilder();
			
			while((line=reader.readLine()) != null) {
				sb.append(line + "/n"); //"/n"은 깔끔하게 보려고 넣은 것일 뿐 
			}
			
			reader.close();
			con.disconnect();
			
			File file = new File("C:" + File.separator + "storage", "공항코드정보.xml");
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(sb.toString());
			writer.close();
			
			System.out.println("공항코드정보.xml이 생성되습니다.");
		
		}catch(Exception e) {
			e.printStackTrace();
		
		}
		
	}
	
	public static void ex02() {
		
		/*
	 	한국공항공사_항공기 운항 정보 : 국제선 운항 스케줄 
	 	1. 서비스 URL : http://openapi.airport.co.kr/service/rest/FlightScheduleList/getIflightScheduleList
	 	2. 요청 변수(Request Parameter) : 
	 		1) ServiceKey : 인증키 
	 		2) pageNo     : 조회할 페이지번호 
	 		3) schDate 	  : 검색일자 
	 		4) scDepCityCode : 출발도시코드
	 		5) schArrvCityCode : 도착도시코드 
	 */
		
		String serviceKey = "tekLFDRud6c2r8qmZeXXUgLPg6EWixWlkpSKC22odGkoZI6ZJIrhboUrQNqCFziXutTfG77Z32ZhziAuQET7yQ==";
		String apiURL = "http://openapi.airport.co.kr/service/rest/FlightScheduleList/getIflightScheduleList"; 
		URL url = null;
		HttpURLConnection con = null; 
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try { // 순서 지켜서 작업 
		
			
		
			apiURL += "?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8");
			apiURL += "&pageNo=1";
			apiURL += "&schDate=20221231";
			apiURL += "&scDepCityCode=ICN";
			apiURL += "&schArrvCityCode=JFK";
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			
			con.setRequestMethod("GET"); //설정, 대문자로만 작성 가능. 요청하고자 하는 파라미터 주소창에 붙여서 사용하는 방식. 
			con.setRequestProperty("Content-Type", "application/xml; charset=UTF-8"); 
			
			int responseCode = con.getResponseCode();
			if(responseCode == 200) { //HttpURLConnection.HTTP_OK이 200을 의미한다. 
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			}else {
				reader  = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			String line = null;
			StringBuilder sb = new StringBuilder();
			
			while((line=reader.readLine()) != null) {
				sb.append(line + "/n"); //"/n"은 깔끔하게 보려고 넣은 것일 뿐 
			}
			
			reader.close();
			con.disconnect();
			
			File file = new File("C:" + File.separator + "storage", "국제선 운항스케줄.xml");
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(sb.toString());
			writer.close();
			
			System.out.println("국제선 운항스케줄.xml이 생성되습니다.");
		
		}catch(Exception e) {
			e.printStackTrace();
		
		}
	}

	public static void main(String[] args) {
		ex02();
		

	}

}
