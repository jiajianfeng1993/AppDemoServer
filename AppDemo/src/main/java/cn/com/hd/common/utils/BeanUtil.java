
/**
 * Copyright 2015
 * 鍖椾含甯傚悍璁�璁澶囨湁闄愬叕鍙�
 * All right reserved.
 */
package cn.com.hd.common.utils;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @class BeanUtil 
 * @author 寰愮惣
 * @create Date 2015骞�鏈�7鏃�涓嬪崍2:48:45
 * @modified By <淇敼浜�
 * @modified Date <淇敼鏃ユ湡锛屾牸寮忥細YYYY-MM-DD>
 * @why & what <淇敼鍘熷洜鎻忚堪>
 * @since JDK1.7
 * @version 001.00.00
 * @description javaBean宸ュ叿
 */
public class BeanUtil{

	@SuppressWarnings("unchecked")
	public static <Bean> Bean getBean(Class<Bean> bean,Map<String,Object> map)  
	            throws IntrospectionException, IllegalAccessException,  
	            InstantiationException, InvocationTargetException {  
	  BeanInfo beanInfo = Introspector.getBeanInfo(bean); // 鑾峰彇绫诲睘鎬� 
	  Object obj = bean.newInstance(); // 鍒涘缓 JavaBean 瀵硅薄  
	 
	  // 缁�JavaBean 瀵硅薄鐨勫睘鎬ц祴鍊� 
	  PropertyDescriptor[] propertyDescriptors =  beanInfo.getPropertyDescriptors();  
	      for (int i = 0; i< propertyDescriptors.length; i++) {  
	          PropertyDescriptor descriptor = propertyDescriptors[i];  
	          String propertyName = descriptor.getName();  
	 
	          if (map.containsKey(propertyName)) {  
	              // 涓嬮潰涓�彞鍙互 try 璧锋潵锛岃繖鏍峰綋涓�釜灞炴�璧嬪�澶辫触鐨勬椂鍊欏氨涓嶄細褰卞搷鍏朵粬灞炴�璧嬪�銆� 
	              Object value = map.get(propertyName);  
	 
	              Object[] args = new Object[1];  
	           
	              args[0] = value;
	              try {
	                  descriptor.getWriteMethod().invoke(obj, args);  
	              } catch (Exception e) {
	                  continue;
	              }
              }
          }  
	      return (Bean)obj;  
	  }

	public static List<Map<String, Object>> getList(Object obj){
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		
		if(null == obj){
			return list;
		}
		
		Map<String, Object> map;
		try {
			map = getBeanMap(obj);
		} catch (IllegalAccessException | InstantiationException
				| InvocationTargetException | IntrospectionException e) {
			return list;
		}
		if(0 == map.size()){
			return list;
		}
		//瑁呰浇list
		list.add(map);
		return list;
	}
	/**
	 * @method getList 
	 * @description  灏嗗涓猨avaBean杞垚list  
	 * @author 寰愮惣
	 * @param bean javaBean
	 * @return 娌℃湁杩斿洖null
	 * @create Date 2015骞�鏈�7鏃�涓嬪崍2:46:44
	 * @modified By <淇敼浜�
	 * @modified Date <淇敼鏃ユ湡锛屾牸寮忥細YYYY-MM-DD>
	 * @why & what <淇敼鍘熷洜鎻忚堪>
	 * @version 001.00.00
	 */
	public static List<Map<String, Object>> getList(@SuppressWarnings("rawtypes") List objList,Boolean isList) {
		//鍒涘缓杩斿洖list
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		
		if(null == objList){
			return list;
		}
		
		for(Object obj : objList){
			Map<String, Object> map;
			try {
				map = getBeanMap(obj);
			} catch (IllegalAccessException | InstantiationException
					| InvocationTargetException | IntrospectionException e) {
				e.printStackTrace();
				return list;
			}
			//鍒ゆ柇鏄惁涓虹┖
			if(null == map){
				continue;
			}
			//瑁呰浇list
			list.add(map);
		}
		return list;
	}
	/**
	 * @method getBeanMap 
	 * @description  灏唈avaBean杞垚map
	 * @author 寰愮惣
	 * @param bean javaBean
	 * @return 娌℃湁杩斿洖null
	 * @create Date 2015骞�鏈�7鏃�涓嬪崍3:04:03
	 * @modified By <淇敼浜�
	 * @modified Date <淇敼鏃ユ湡锛屾牸寮忥細YYYY-MM-DD>
	 * @why & what <淇敼鍘熷洜鎻忚堪>
	 * @version 001.00.00
	 */
	public static Map<String, Object> getBeanMap(Object obj) throws IntrospectionException, IllegalAccessException,  
    InstantiationException, InvocationTargetException {
		if(null == obj){
			return null;
		}
		//鍒涘缓杩斿洖list
		Map<String,Object> map = new HashMap<String, Object>();
		
		BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass()); 
		
		// 缁�JavaBean 瀵硅薄鐨勫睘鎬ц祴鍊�
		PropertyDescriptor[] propertyDescriptors = beanInfo
				.getPropertyDescriptors();
		for (int i = 0; i < propertyDescriptors.length; i++) {
			PropertyDescriptor descriptor = propertyDescriptors[i];
			String propertyName = descriptor.getName();

			try {
				// 杩囨护class灞炴�  
                if (!propertyName.equals("class")) {  
					Object value = descriptor.getReadMethod().invoke(obj);
					map.put(propertyName, value);
                }
			} catch (Exception e) {
				continue;
			}
		}
		return map;
	}
}
