package cn.com.hd.app.common.util;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.SystemDefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import cn.com.hd.app.common.constants.DataConstants;
import cn.com.hd.app.domain.chat.account.model.AccountModel;
import cn.com.hd.app.domain.chat.account.model.vo.AccountVo;

public class TokenUtil {
	public static String getToken(String userId,String name,String portraitUri) throws Exception{
		String timeStamp=System.currentTimeMillis()+"";
		String nonce=new Random().nextInt(10000)+"";
		String signature =DigestUtils.shaHex(DataConstants.APP_SECRET+nonce+timeStamp);
		
		HttpClient httpClient=HttpClientBuilder.create().build();

		HttpPost post=new HttpPost("http://api.cn.ronghub.com/user/getToken.json");
		//设置头信息
		post.addHeader("App-Key", DataConstants.APP_KEY);
		post.addHeader("Nonce", nonce);
		post.addHeader("Timestamp", timeStamp);
		post.addHeader("Signature", signature);
		//设置参数
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();  
        nvps.add(new BasicNameValuePair("userId", userId));  
        nvps.add(new BasicNameValuePair("name", name));  
        nvps.add(new BasicNameValuePair("portraitUri", portraitUri));  
        post.setEntity(new UrlEncodedFormEntity(nvps));
		HttpResponse execute = httpClient.execute(post);
		System.out.println(execute.getStatusLine().toString());
		InputStream inputStream = execute.getEntity().getContent();
		byte[] b=new byte[inputStream.available()];
		inputStream.read(b);
		String s=new String(b,"UTF-8");

		Map map = new Gson().fromJson(s, Map.class);
		return map.get("token").toString();
	}
	
}
