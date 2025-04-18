package com.company.boot008.util5_kakao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@Component
public class KakaoLogin {
	@Value("${kakao_redirect_url}")
	private String kakao_redirect_url;
	
	@Value("${kakao_api}")
	private String kakao_api;
	
	public String step1() {
		return "https://kauth.kakao.com/oauth/authorize?response_type=code&client_id="
						+kakao_api+"&redirect_uri="+kakao_redirect_url;
	}
	
		public String step2(String code) {
			System.out.println("STEP1) "+ code);
			String tokenUrl="https://kauth.kakao.com/oauth/token";
			tokenUrl += "?grant_type=authorization_code"
					+"&client_id="+kakao_api
					+"&redirect_uri="+kakao_redirect_url
					+"&code="+code;
			
			URL url = null; HttpURLConnection conn=null;
			BufferedReader br = null; String line=""; StringBuffer buffer = new StringBuffer();
			String resultToken="";
			
			try {
				url = new URL(tokenUrl);
				conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("POST");
				conn.setDoInput(true); conn.setDoOutput(true);
				conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
				
				if(conn.getResponseCode()==200) {
					br=new BufferedReader(new InputStreamReader(conn.getInputStream())); } else {
					br=new BufferedReader(new InputStreamReader(conn.getErrorStream())); }
				
				while((line=br.readLine())!=null) { buffer.append(line); }
				br.close();
				conn.disconnect();
				resultToken = buffer.toString();
				System.out.println("..."+resultToken);
				
			} catch (MalformedURLException e) { e.printStackTrace();
			} catch (IOException e) { e.printStackTrace(); }
			
			JsonObject job = JsonParser.parseString(resultToken).getAsJsonObject();
			String token = job.get("access_token").getAsString();
			
			System.out.println("..."+token);
			
			return token;
			
	}
}
