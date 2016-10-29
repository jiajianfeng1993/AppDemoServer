/**
 * Copyright 2015
 * 北京市康讯通讯设备有限公司
 * All right reserved.
 */
package cn.com.hd.app.common.web.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;

/**
 * @class CustomDateConverter 
 * @author 潘杰
 * @create Date 2015年7月7日 上午11:40:34
 * @modified By 
 * @modified Date 
 * @why & what 
 * @since JDK1.7
 * @version V1.0.0
 * @description 日期转换器，先根据pattern1转换，如果转换不了，则按照pattern2转换
 */
public class CustomDateConverter implements Converter<String, Date> {

	// 规则1
	private String pattern1;
	// 规则2
	private String pattern2;
	
	
	
	
	/**  
	 * @constructors 
	 * @author 潘杰
	 * @create Date 2015年7月7日 上午11:43:11
	 * @modified By 
	 * @modified Date 
	 * @why & What 
	 * @version V1.0.0
	 */
	public CustomDateConverter() {
		super();
	}




	/**  
	 * @constructors 
	 * @author 潘杰
	 * @create Date 2015年7月7日 上午11:43:07
	 * @modified By 
	 * @modified Date 
	 * @why & What 
	 * @version V1.0.0
	 * @param pattern1
	 * @param pattern2
	 */
	public CustomDateConverter(String pattern1, String pattern2) {
		super();
		this.pattern1 = pattern1;
		this.pattern2 = pattern2;
	}




	/**
	 * @method convert 
	 * @description  
	 * @author 潘杰
	 * @param source 
	 * @return 转换后的日期
	 * @create Date 2015年7月7日 下午2:00:36
	 * @modified By 
	 * @modified Date 
	 * @why & what 
	 * @version V1.0.0
	 */
	@Override
	public Date convert(String source) {
		if(StringUtils.isBlank(source)){
			return null;
		}
		try {
			return new SimpleDateFormat(pattern1).parse(source);
		} catch (Exception e) {
			try {
				return new SimpleDateFormat(pattern2).parse(source);
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
		}
		return null;
	}






}
