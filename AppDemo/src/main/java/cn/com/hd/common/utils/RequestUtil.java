/**
 * Copyright 2015
 * 北京市康讯通讯设备有限公司
 * All right reserved.
 */
package cn.com.hd.common.utils;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

/**
 * @class RequestUtil 
 * @author 徐琼
 * @create Date 2015年5月4日 上午10:26:39
 * @modified By <修改人>
 * @modified Date <修改日期，格式：YYYY-MM-DD>
 * @why & what <修改原因描述>
 * @since JDK1.7
 * @version V1.00
 * @description 请求工具
 */
public class RequestUtil {

	/**
	 * @method getInformationMap 
	 * @description  获取请求参数Map
	 * @author 徐琼
	 * @param request 请求
	 * @return map集合
	 * @create Date 2015年5月4日 上午10:26:51
	 * @modified By <修改人>
	 * @modified Date <修改日期，格式：YYYY-MM-DD>
	 * @why & what <修改原因描述>
	 * @version V1.00
	 */
	public static Map<String, Serializable> getInformationMap(
			HttpServletRequest request) {
		Map<String, String[]> parameterMap = request.getParameterMap();
		Map<String, Serializable> information = new TreeMap<String, Serializable>();
		
		//将parameterMap填充入information中
		for(Map.Entry<String , String[]> entry : parameterMap.entrySet()){
			String[] values = entry.getValue();
			//遍历组装value
			StringBuilder sb = new StringBuilder();
			if(null != values && values.length > 0 ){
				int count = 0;
				for(String value : values){
					count++;
					//count大于1,value前加逗号
					if(count > 1){
						sb.append(",");
					}
					sb.append(value);
				}
			}
			//将key和value放入information中
			information.put(entry.getKey(), sb.toString());
		}
		
		return information;
	}
	
}
