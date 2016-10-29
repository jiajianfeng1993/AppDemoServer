/**
 * Copyright 2015
 * 北京市康讯通讯设备有限公司
 * All right reserved.
 */
package cn.com.hd.common.utils;

/**
 * @class StringUtil 
 * @author 徐琼
 * @create Date 2015年5月6日 下午1:34:31
 * @modified By <修改人>
 * @modified Date <修改日期，格式：YYYY-MM-DD>
 * @why & what <修改原因描述>
 * @since JDK1.7
 * @version V1.00
 * @description 字符串工具
 */
public class StringUtil {
	
	/**
	 * 
	 * @method getSimpleClassName 
	 * @description  获取class短名称
	 * @author 徐琼
	 * @param classAllName class全名
	 * @return 名称
	 * @create Date 2015年8月17日 上午10:52:21
	 * @modified By <修改人>
	 * @modified Date <修改日期，格式：YYYY-MM-DD>
	 * @why & what <修改原因描述>
	 * @version 001.00.00
	 */
	public static String getSimpleClassName(String classAllName){
		String[] allNames = classAllName.split("\\.");
		String simpleName = allNames[allNames.length-1];
		simpleName = toLowerFirst(simpleName);
		return simpleName;
	}
	
	/**
	 * 
	 * @method toLowerFirst 
	 * @description  首字母小写
	 * @author 徐琼
	 * @param str 字符串
	 * @return 首字母小写
	 * @create Date 2015年8月17日 上午10:53:03
	 * @modified By <修改人>
	 * @modified Date <修改日期，格式：YYYY-MM-DD>
	 * @why & what <修改原因描述>
	 * @version 001.00.00
	 */
	public static String toLowerFirst(String str){
		return str.substring(0, 1).toLowerCase()+str.substring(1);
	}
}
