package api;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class ApiMainClass {

	public static void main(String[] args) {
		
		/*
		- API명 : 도로교통공단_사망교통사고정보서비스
		- 링크 : https://www.data.go.kr/data/15059126/openapi.do
		- API 참고문서 : 다운로드  (공공데이터포털에서 hwp 파일을 제공하고 있으나 한글 파일이 열리지 않는 경우에는 다운로드를 클릭한 뒤 PDF를 받아서 이용할 것)
		- 프로젝트명 : Exam03
		- 패키지 : api
		- 클래스 : ApiMain.java와 Accident.java 
		*/
		
		String ServiceKey = "tekLFDRud6c2r8qmZeXXUgLPg6EWixWlkpSKC22odGkoZI6ZJIrhboUrQNqCFziXutTfG77Z32ZhziAuQET7yQ==";
		String apiURL = "http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath";
		
		URL url = null; 
		HttpURLConnection con = null;
		BufferedReader reader = null; 
		File file = new File("accident.txt");
		
		ObjectOutputStream oos = null; 
		
		FileOutputStream fos = null; 

		
		try { 
			oos = new ObjectOutputStream(new FileOutputStream(file));
			
			List<Accident> accident = Arrays.asList();
			
			String siDo = "1100";
			String guGun = "1125";
			String searchYear = "2021";
			String numOfRows = "10";
			String pageNo = "1";
			
			StringBuilder sbURL = new StringBuilder();
			sbURL.append(apiURL); 
			sbURL.append("?ServiceKey=" + URLEncoder.encode(ServiceKey, "UTF-8"));
			sbURL.append("&type=json");
			sbURL.append("&searchYear=" + URLEncoder.encode(searchYear, "UTF-8"));
			sbURL.append("&siDo=" + URLEncoder.encode(siDo, "UTF-8"));
			sbURL.append("&guGun=" + URLEncoder.encode(guGun, "UTF-8"));
			sbURL.append("&numOfRows=" + URLEncoder.encode(numOfRows, "UTF-8"));
			sbURL.append("&pageNo=" + URLEncoder.encode(pageNo, "UTF-8"));
			
			url = new URL(sbURL.toString());  
			System.out.println(sbURL.toString());
	
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
			
			JSONObject obj = new JSONObject(sb.toString()); 
			JSONObject body = obj.getJSONObject("items").getJSONObject("item"); 
			JSONArray items = body.getJSONArray("item");
			
			
			
			for(int i = 0; i < items.length(); i++) {
				JSONObject item = items.getJSONObject(i);
				String occrrncDt = item.getString("occrrncDt");
				String occrrncDayCd = item.getString("occrrncDayCd");
				int dthDnvCnt = item.getInt("dthDnvCnt");
				int injpsnCnt = item.getInt("injpsnCnt");
				System.out.println(occrrncDt + "발생일자 " + occrrncDayCd + ", 사망자수 " + dthDnvCnt + "명, 부상자수 " + injpsnCnt );
			
		}
			
			

	}catch(Exception e) {
		e.printStackTrace();
		}
	}
}
