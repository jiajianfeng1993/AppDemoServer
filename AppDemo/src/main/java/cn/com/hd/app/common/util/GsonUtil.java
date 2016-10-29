package cn.com.hd.app.common.util;

import java.lang.reflect.Type;
import java.util.Date;




import java.util.HashMap;
import java.util.Map;

import cn.com.hd.app.domain.chat.account.model.AccountModel;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class GsonUtil {
	static Gson gson;
	public static Gson createGson(){
		gson=new GsonBuilder()
			.registerTypeAdapter(Date.class,new DateAdapter())
			.create();
		return gson;
	}
}
//»’∆⁄  ≈‰∆˜
class DateAdapter implements JsonSerializer<Date>,JsonDeserializer<Date>{

	@Override
	public Date deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {
		String string = json.getAsString();
		try{
			Date date=new Date(Long.parseLong(string));
			return date;
		}catch(Exception e){
			return null;
		}
	}

	@Override
	public JsonElement serialize(Date src, Type typeOfSrc,
			JsonSerializationContext context) {
		JsonPrimitive p=new JsonPrimitive(src.getTime());
		return p;
	}
}
