package cn.com.hd.app.common.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ReturnMapUtil {
	public static List<Map<String, Object>> getSuccessReturnListMap(List<Map<String, Object>> listmap){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("return_code", 1);
		map.put("return_flag", "³É¹¦");
		if(listmap==null){
			listmap=new ArrayList<Map<String, Object>>();
		}
		listmap.add(0, map);
		return listmap;
	}
	
	
	public static List<Map<String, Object>> getFailReturnListMap(String flag){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("return_code", 0);
		map.put("return_flag", flag);
		List<Map<String, Object>> listmap=new ArrayList<Map<String, Object>>();
		listmap.add(0, map);
		return listmap;
	}
}
