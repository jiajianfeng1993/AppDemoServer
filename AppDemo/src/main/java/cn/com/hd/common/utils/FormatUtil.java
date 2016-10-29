/**
 * Copyright 2015
 * 北京市康讯通讯设备有限公司
 * All right reserved.
 */
package cn.com.hd.common.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @class FormatUtil 
 * @author 徐琼
 * @create Date 2015年5月7日 上午11:13:59
 * @modified By <修改人>
 * @modified Date <修改日期，格式：YYYY-MM-DD>
 * @why & what <修改原因描述>
 * @since JDK1.7
 * @version V1.00
 * @description 格式化util
 */
public class FormatUtil {
	/**
	 * 
	 * @method formatDate 
	 * @description DATE 日期  
	 * @author 徐琼
	 * @param date DATE
	 * @return 日期
	 * @create Date 2015年5月7日 上午11:15:25
	 * @modified By <修改人>
	 * @modified Date <修改日期，格式：YYYY-MM-DD>
	 * @why & what <修改原因描述>
	 * @version V1.00
	 */
	public static String formatDate(Date date){
		if(date == null) return "";
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.format(date);
	}
	/**
	 * 
	 * @method formatTime 
	 * @description  DATE 时间
	 * @author 徐琼
	 * @param date DATE
	 * @return 时间
	 * @create Date 2015年5月7日 上午11:15:29
	 * @modified By <修改人>
	 * @modified Date <修改日期，格式：YYYY-MM-DD>
	 * @why & what <修改原因描述>
	 * @version V1.00
	 */
	public static String formatTime(Date date){
		if(date == null) return "";
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		return df.format(date);
	}
	/**
	 * 
	 * @method formatDateTime 
	 * @description  DATE 日期+秒
	 * @author 徐琼
	 * @param date DATE
	 * @return 日期 + 时间
	 * @create Date 2015年5月7日 上午11:15:35
	 * @modified By <修改人>
	 * @modified Date <修改日期，格式：YYYY-MM-DD>
	 * @why & what <修改原因描述>
	 * @version V1.00
	 */
	public static String formatDateTime(Date date){
		if(date == null) return "";
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return df.format(date);
	}
	
	public static final DateFormat DATE_FORMAT_TEST = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	public static final DateFormat DATE_FORMAT_VIEW = new SimpleDateFormat("yyyy年MM月dd日");
	
	/**
	 * @method getSimpleDate 
	 * @description 创建标准的时间，仅仅是为了测试用 
	 * @author 潘杰
	 * @param year 年
	 * @param mouth 月
	 * @param day 日
	 * @param hour 时
	 * @param minute 分
	 * @param second 秒
	 * @return
	 * @throws ParseException
	 * @create Date 2015年5月8日 下午2:59:15
	 * @modified By 
	 * @modified Date 
	 * @why & what 
	 * @version V1.00
	 */
	public static Date getSimpleDate(int year,int mouth,int day,int hour,int minute,int second) throws ParseException {
		StringBuffer sb = new StringBuffer(19);
		sb.append(year).append("-").append(mouth).append("-").append(day).append(" ").
					append(hour).append(":").append(minute).append(":").append(second);
		return DATE_FORMAT_TEST.parse(sb.toString());
	}
}
