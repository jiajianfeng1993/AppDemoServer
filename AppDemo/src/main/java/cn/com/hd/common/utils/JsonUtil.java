package cn.com.hd.common.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

//
public class JsonUtil{

    /**
     * 
     * @method getJson 
     * @description  把List<Map<String ,Object>>转换成Json
     * @author 徐琼
     * @param list
     * @return json字符串
     * @create Date 2015年9月1日 下午2:47:14
     * @modified By <修改人>
     * @modified Date <修改日期，格式：YYYY-MM-DD>
     * @why & what <修改原因描述>
     * @version 001.00.00
     */
	public static String getJson(List<Map<String, Object>> list){
		JSONArray json = new JSONArray(list);
		return json.toString();
	}
	
	/**
	 * 
	 * @method getJson 
	 * @description  把Map<String, Object>转换成Json
	 * @author 梁庆柱
	 * @param map
	 * @return json字符串
	 * @create Date 2016年7月8日 下午2:54:59
	 * @modified By <修改人>
	 * @modified Date <修改日期，格式：YYYY-MM-DD>
	 * @why & what <修改原因描述>
	 * @version 001.00.00
	 */
	public static String getJson(Map<String, Object> map){
		JSONArray json = new JSONArray(map);
		return json.toString();
	}
	
	
	/**
	 * 
	 * @method analysisJson 
	 * @description  把json转换成List<Map<String ,Object>>
	 * @author 徐琼
	 * @param jsonString json字符串
	 * @return 没有返回空集合
	 * @throws Exception
	 * @create Date 2015年9月1日 下午2:48:49
	 * @modified By <修改人>
	 * @modified Date <修改日期，格式：YYYY-MM-DD>
	 * @why & what <修改原因描述>
	 * @version 001.00.00
	 */
	public static List<Map<String, Object>> getListMap(String jsonString) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

		JSONArray jsonArray = new JSONArray(jsonString);
		JSONObject jsonObject;

		for (int i = 0; i < jsonArray.length(); i++) {

			jsonObject = jsonArray.getJSONObject(i);

			list.add(getMap(jsonObject.toString()));
		}

		return list;
	}
	
	/**
	 * 
	 * @method getMap 
	 * @description  json转换Map
	 * @author 徐琼
	 * @param jsonString
	 * @return
	 * @create Date 2015年9月1日 下午2:49:39
	 * @modified By <修改人>
	 * @modified Date <修改日期，格式：YYYY-MM-DD>
	 * @why & what <修改原因描述>
	 * @version 001.00.00
	 */
	 @SuppressWarnings("unchecked")
	public static Map<String, Object> getMap(String jsonString) { 

		JSONObject jsonObject = new JSONObject(jsonString);
		String key;
		Object value;

		Iterator<String> keyIter = jsonObject.keys();

		Map<String, Object> valueMap = new HashMap<String, Object>();

		while (keyIter.hasNext()) {
			key = keyIter.next();

			value = jsonObject.get(key);

			valueMap.put(key, value);
		}
		return valueMap;
	}
}
