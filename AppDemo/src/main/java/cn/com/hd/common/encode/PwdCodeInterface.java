/**
 * Copyright 2015
 * 鍖椾含甯傚悍璁�璁澶囨湁闄愬叕鍙�
 * All right reserved.
 */
package cn.com.hd.common.encode;

/**
 * @class Md5Pwd 
 * @author 浠ｄ僵瀛�
 * @create Date 2015骞�鏈�鏃�涓婂崍8:37:17
 * @modified By <淇敼浜�
 * @modified Date <淇敼鏃ユ湡锛屾牸寮忥細YYYY-MM-DD>
 * @why & what <淇敼鍘熷洜鎻忚堪>
 * @since JDK1.7
 * @version V1.00
 * @description 鍔犲瘑
 */
public interface PwdCodeInterface {
	/**
	 * 
	 * @method encodePwd 
	 * @description 鍔犲瘑 
	 * @author 寰愮惣
	 * @param password 瀵嗙爜
	 * @return 鍔犲瘑鍚庡瘑鐮�
	 * @create Date 2015骞�鏈�7鏃�涓婂崍10:34:53
	 * @modified By <淇敼浜�
	 * @modified Date <淇敼鏃ユ湡锛屾牸寮忥細YYYY-MM-DD>
	 * @why & what <淇敼鍘熷洜鎻忚堪>
	 * @version 001.00.00
	 */
	public String encodePwd(String password);
}
