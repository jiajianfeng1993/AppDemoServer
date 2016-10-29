/**
 * Copyright 2015
 * 鍖椾含甯傚悍璁�璁澶囨湁闄愬叕鍙�
 * All right reserved.
 */
package cn.com.hd.common.exception;

/**
 * @class RollBackException 
 * @author 娼樻澃
 * @create Date 2015骞�鏈�5鏃�涓嬪崍12:00:23
 * @modified By 
 * @modified Date 
 * @why & what 
 * @since JDK1.7
 * @version V1.00
 * @description 浜嬬墿鍥炴粴寮傚父锛屼粎涓轰簡浜嬬墿鍥炴粴骞惰繑鍥炴暟鎹�
 */
public class RollBackException extends RuntimeException {
	
	// field 杩斿洖淇℃伅
	private Object returnMes;
	/**
	 * @field
	 */
	private static final long serialVersionUID = 1L;

	/**  
	 * @constructors 
	 * @author 娼樻澃
	 * @create Date 2015骞�鏈�5鏃�涓嬪崍12:00:57
	 * @modified By 
	 * @modified Date 
	 * @why & What 
	 * @version V1.00
	 */
	public RollBackException() {
		super();
	}

	/**  
	 * @constructors 
	 * @author 娼樻澃
	 * @create Date 2015骞�鏈�5鏃�涓嬪崍12:00:57
	 * @modified By 
	 * @modified Date 
	 * @why & What 
	 * @version V1.00
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public RollBackException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**  
	 * @constructors 
	 * @author 娼樻澃
	 * @create Date 2015骞�鏈�5鏃�涓嬪崍12:00:57
	 * @modified By 
	 * @modified Date 
	 * @why & What 
	 * @version V1.00
	 * @param message
	 * @param cause
	 */
	public RollBackException(String message, Throwable cause) {
		super(message, cause);
	}

	/**  
	 * @constructors 
	 * @author 娼樻澃
	 * @create Date 2015骞�鏈�5鏃�涓嬪崍12:00:57
	 * @modified By 
	 * @modified Date 
	 * @why & What 
	 * @version V1.00
	 * @param message
	 */
	public RollBackException(String message) {
		super(message);
	}

	/**  
	 * @constructors 
	 * @author 娼樻澃
	 * @create Date 2015骞�鏈�5鏃�涓嬪崍12:00:57
	 * @modified By 
	 * @modified Date 
	 * @why & What 
	 * @version V1.00
	 * @param cause
	 */
	public RollBackException(Throwable cause) {
		super(cause);
	}

	/**  
	 * @constructors 
	 * @author 娼樻澃
	 * @create Date 2015骞�鏈�5鏃�涓嬪崍12:03:20
	 * @modified By 
	 * @modified Date 
	 * @why & What 
	 * @version V1.00
	 * @param returnMes
	 */
	public RollBackException(Object returnMes) {
		super();
		this.returnMes = returnMes;
	}

	/**
	 * @getter getReturnMes 
	 */
	public Object getReturnMes() {
		return returnMes;
	}

	/**
	 * @setter setReturnMes 
	 */
	public void setReturnMes(Object returnMes) {
		this.returnMes = returnMes;
	}
	
	

}
