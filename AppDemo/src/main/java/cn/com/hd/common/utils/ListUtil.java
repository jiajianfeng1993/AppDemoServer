/**
 * Copyright 2015
 * 北京市康讯通讯设备有限公司
 * All right reserved.
 */
package cn.com.hd.common.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @class ListUtil 
 * @author 徐琼
 * @create Date 2015年5月12日 下午2:10:56
 * @modified By <修改人>
 * @modified Date <修改日期，格式：YYYY-MM-DD>
 * @why & what <修改原因描述>
 * @since JDK1.7
 * @version V1.00
 * @description 列表集合工具
 */
public class ListUtil {
	/**
	 * 
	 * @method removeDuplicate 
	 * @description  去除list集合中的重复
	 * @author 徐琼
	 * @param objList 集合
	 * @return 去重复后的集合
	 * @create Date 2015年5月12日 下午2:16:49
	 * @modified By <修改人>
	 * @modified Date <修改日期，格式：YYYY-MM-DD>
	 * @why & what <修改原因描述>
	 * @version V1.00
	 */
	public static List<? extends Object> removeDuplicate(List<? extends Object> objList){
		//创建新集合用于返回
		List<Object> newObjList = new ArrayList<Object>();
		//利用set去重复
		Set<Object> objSet = new HashSet<Object>();
		for(Object obj : objList){
			objSet.add(obj);
		}
		
		for(Object obj : objSet){
			newObjList.add(obj);
		}
		return newObjList;
	}
}
