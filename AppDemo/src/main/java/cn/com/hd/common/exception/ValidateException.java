/**
 * Copyright 2015
 * 鍖椾含甯傚悍璁�璁澶囨湁闄愬叕鍙�
 * All right reserved.
 */
package cn.com.hd.common.exception;

/**
 * @class ValidateException 
 * @author 寰愮惣
 * @create Date 2015骞�鏈�7鏃�涓嬪崍5:39:15
 * @modified By <淇敼浜�
 * @modified Date <淇敼鏃ユ湡锛屾牸寮忥細YYYY-MM-DD>
 * @why & what <淇敼鍘熷洜鎻忚堪>
 * @since JDK1.7
 * @version 001.00.00
 * @description 鏍￠獙寮傚父
 */
@SuppressWarnings("serial")
public class ValidateException extends RuntimeException {

	/**  
	 * @constructors 
	 * @author 寰愮惣
	 * @create Date 2015骞�鏈�7鏃�涓嬪崍5:39:16
	 * @modified By <淇敼浜�
	 * @modified Date <淇敼鏃ユ湡锛屾牸寮忥細YYYY-MM-DD>
	 * @why & What <淇敼鍘熷洜鎻忚堪>
	 * @version 001.00.00
	 */
	public ValidateException() {
	}

	/**  
	 * @constructors 
	 * @author 寰愮惣
	 * @create Date 2015骞�鏈�7鏃�涓嬪崍5:39:16
	 * @modified By <淇敼浜�
	 * @modified Date <淇敼鏃ユ湡锛屾牸寮忥細YYYY-MM-DD>
	 * @why & What <淇敼鍘熷洜鎻忚堪>
	 * @version 001.00.00
	 * @param message
	 */
	public ValidateException(String message) {
		super(message);
	}
	
	/**  
	 * @constructors 
	 * @author 寰愮惣
	 * @create Date 2015骞�鏈�7鏃�涓嬪崍5:39:16
	 * @modified By <淇敼浜�
	 * @modified Date <淇敼鏃ユ湡锛屾牸寮忥細YYYY-MM-DD>
	 * @why & What <淇敼鍘熷洜鎻忚堪>
	 * @version 001.00.00
	 * @param message
	 */
	public ValidateException(Integer message) {
		super(message.toString());
	}

	/**  
	 * @constructors 
	 * @author 寰愮惣
	 * @create Date 2015骞�鏈�7鏃�涓嬪崍5:39:16
	 * @modified By <淇敼浜�
	 * @modified Date <淇敼鏃ユ湡锛屾牸寮忥細YYYY-MM-DD>
	 * @why & What <淇敼鍘熷洜鎻忚堪>
	 * @version 001.00.00
	 * @param cause
	 */
	public ValidateException(Throwable cause) {
		super(cause);
	}

	/**  
	 * @constructors 
	 * @author 寰愮惣
	 * @create Date 2015骞�鏈�7鏃�涓嬪崍5:39:16
	 * @modified By <淇敼浜�
	 * @modified Date <淇敼鏃ユ湡锛屾牸寮忥細YYYY-MM-DD>
	 * @why & What <淇敼鍘熷洜鎻忚堪>
	 * @version 001.00.00
	 * @param message
	 * @param cause
	 */
	public ValidateException(String message, Throwable cause) {
		super(message, cause);
	}

	/**  
	 * @constructors 
	 * @author 寰愮惣
	 * @create Date 2015骞�鏈�7鏃�涓嬪崍5:39:16
	 * @modified By <淇敼浜�
	 * @modified Date <淇敼鏃ユ湡锛屾牸寮忥細YYYY-MM-DD>
	 * @why & What <淇敼鍘熷洜鎻忚堪>
	 * @version 001.00.00
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ValidateException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
