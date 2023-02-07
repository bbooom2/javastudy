package ex03_api;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONMainClass {
	
	/* 
	  	JSON
	  	-네트워크를 통해 데이터를 주고받는 데 자주 사용되는 경량의 데이터 형식  
	  	-정해진 문법에 맞게 데이터를 담아 전달하게 되면 전달 받은 사람은 파싱하여 데이터들을 쉽게 꺼내서 사용할 수 있도록 도와주는 것이다. 
		
		파싱 : 다른 형식으로 저장된 데이터를 원하는 형식의 데이터로 변환하는 것. 
	 */
	public static void ex01() {
		
		/*
			한국환경공단_에어코리아_대기오염정보 : 시도별 실시간 측정정보 조회
			1. 서비스 URL : http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty
			2. 요청 변수(Request Parameter)
				1) serviceKey : 인증키
				2) returnType : xml 또는 json
				3) sidoName : 시도 이름
		*/
		
		//apiURL은 홈페이지 내의 '요청주소' 확인할 것, 서비스키는 일반인증키로 진행할 것. 
		String serviceKey = "tekLFDRud6c2r8qmZeXXUgLPg6EWixWlkpSKC22odGkoZI6ZJIrhboUrQNqCFziXutTfG77Z32ZhziAuQET7yQ==";
		String apiURL = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty";
		
		//try 안쪽에서 사용해줘야 하므로 선언은 바깥쪽에서 진행한다. 
		URL url = null; 
		HttpURLConnection con = null;
		BufferedReader reader = null; 
		
		try {
			//JSON 타입으로 내려받는 과정_시험 후 Map 복습 필수 (연결되는 개념 같음) 
			
			//서울을 스트링 값에 담아주기 
			String sidoName = "서울";
			
			//String 값을 이어줄 StringBuilder 선언 및 생성 
			StringBuilder sbURL = new StringBuilder();
			
			// append 메소드를 통해 api 주소에 서비스키, 리턴타입, 시도네임 덧붙여주기 
			sbURL.append(apiURL); 
			sbURL.append("?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8")); // 서비스키 암호화 풀기 
			sbURL.append("&returnType=json");
			sbURL.append("&sidoName=" + URLEncoder.encode(sidoName, "UTF-8")); // 한글(서울) 변환 과정 
			
			// 모든 걸 합친 sbURL을 String 값으로 변환해서 URL 객체에 담는다. 
			url = new URL(sbURL.toString());  
			
			// url.openConnection()에서도 HttpURLConnection()도 쓰려고 체인을 걸어준 개념 
			// 메소드의 확장 개념 
		 	// 둘의 메소드를 다 호출하기 위해 둘을 연결한 것  
			con = (HttpURLConnection) url.openConnection(); 
			
			// 공용 API에서 값을 가져오는 걸 GET 메소드로 가져오라고 명시되어있음. 
			//url 요청 방식 선택 - GET은 요청하는(읽어들이는) 방식 vs POST는 수정하고 업데이트하는 방식. 우리가 필요한 것은 url 읽어들이는 것. 그래서 GET으로 진행. 
			con.setRequestMethod("GET"); 
			
			//일반 요청 속성 설정 : JSON형식의 타입, UTF-8  
			con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			
			//getResponseCode() 값이 200(정상)	  일 경우  getInputStream() 메소드를 사용하여 return 값을 받아오고
			//getResponseCode() 값이 200(정상)이 아닐 경우 get ErrorStream()을 활용하여 해당 오류의 정보 받음 
			//받아온 데이터(InputStream)를 기반으로 InputStreamReader 객체를 생성하고, BufferedReader에서 제공하는 readLine()메소드를 활용하여 
			
			if(con.getResponseCode() == HttpURLConnection.HTTP_OK) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream())); // getInputStream은 글자를 못읽음. 그래서 스트림 리더 필요. 속도 향상을 위해 버퍼리더 사용할것. 
			} else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream())); // getErrordStream 가져오는 것. 스트림 글자 못읽음. 리더 사용 - 속도향상 버퍼리더 
			}
			
			//해당 정보를 String에 저장하고 그 정보를 StringBuilder에 저장하여 정보를 보여준다. 
			String line = null;
			StringBuilder sb = new StringBuilder();
			
			
			//BufferedReader.readLine()는 파일에서 1줄의 문자열을 리턴. 
			//readLine()으로 연속적으로 데이터를 읽다가 파일의 끝에 도달하는 경우 null을 리턴한다.
			//null을 확인될 시 while 문이 종료된다.
			while((line = reader.readLine()) != null) { 
				sb.append(line); 
				// 한 줄씩 읽는데 null이 아니라면 append 진행  
			}
			// 사용한 자원(Stream, Connection)
			reader.close(); //읽는거 끝. 안 해줘도 자동으로 정리되기는 함. 다만, 자원관리를 프로그래머가 직접 해야하는 경우가 많기 때문에 자원관리를 해주는 습관을 들이는 게 좋다. 
			con.disconnect(); // 데이터를 읽고난 후에는 해당 함수를 사용하여 연결을 해제한다. 
			
			JSONObject obj = new JSONObject(sb.toString()); // JSON 타입으로 받은 걸 객체로 만듦. String 값으로 변환한걸 JSONObject 타입으로 선언 및 생성 
			JSONObject body = obj.getJSONObject("response").getJSONObject("body"); // 리스폰과 바디를 꺼내옴. 괄호에서 가장 바깥쪽 대괄호가 리스폰? 
			JSONArray items = body.getJSONArray("items"); //깐 값들을 array로 만들것 
			
		
			
	        
			 //하면 내용 한번 확인 가능. 
			
			
			//JSONArray 때문에 이걸 for문으로 활용 가능
			//JSONArray []안에 있는 JSONObject { }를 빼줄 것. 
			for(int i = 0; i < items.length(); i++) {
				JSONObject item = items.getJSONObject(i);
				String stationName = item.getString("stationName");
				String pm10Value = item.getString("pm10Value");
				String o3Value = item.getString("o3Value");
				System.out.println(stationName + " : 미세먼지 " + pm10Value + ", 오존농도 " + o3Value);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void ex02() {
		
		/*
			한국환경공단_에어코리아_대기오염정보 : 시도별 실시간 측정정보 조회
			1. 서비스 URL : http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustWeekFrcstDspth
			2. 요청 변수(Request Parameter)
				1) serviceKey : 인증키
				2) returnType : xml 또는 json
				3) searchDate : 통보시간 검색
		*/
		
		String serviceKey = "tekLFDRud6c2r8qmZeXXUgLPg6EWixWlkpSKC22odGkoZI6ZJIrhboUrQNqCFziXutTfG77Z32ZhziAuQET7yQ==";
		String apiURL = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustWeekFrcstDspth";
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader reader = null;
		
		try {
			
			StringBuilder sbURL = new StringBuilder();
			sbURL.append(apiURL);
			sbURL.append("?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8"));
			sbURL.append("&returnType=json");
			sbURL.append("&searchDate=2023-01-30");
			
			url = new URL(sbURL.toString());
			con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			
			if(con.getResponseCode() == HttpURLConnection.HTTP_OK) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
			
			reader.close();
			con.disconnect();
			
			JSONArray items = new JSONObject(sb.toString())
								.getJSONObject("response")
								.getJSONObject("body")
								.getJSONArray("items");
			for(int i = 0; i < items.length(); i++) {
				JSONObject item = items.getJSONObject(i);
				System.out.println(item.getString("frcstOneDt") + " : " + item.getString("frcstOneCn"));
				System.out.println(item.getString("frcstTwoDt") + " : " + item.getString("frcstTwoCn"));
				System.out.println(item.getString("frcstThreeDt") + " : " + item.getString("frcstThreeCn"));
				System.out.println(item.getString("frcstFourDt") + " : " + item.getString("frcstFourCn"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		ex01();

	}

}
