package cn.com.hd.app.domain.chat.chatrecorder.model.vo;

import cn.com.hd.app.domain.chat.account.model.vo.AccountVo;
import cn.com.hd.app.domain.chat.chatrecorder.model.ChatRecorderModel;

public class ChatRecorderVo extends ChatRecorderModel{
	AccountVo sendAccount;
	AccountVo receiveAccount;
	/**
	 * @return the sendAccount
	 */
	public AccountVo getSendAccount() {
		return sendAccount;
	}
	/**
	 * @param sendAccount the sendAccount to set
	 */
	public void setSendAccount(AccountVo sendAccount) {
		this.sendAccount = sendAccount;
	}
	/**
	 * @return the receiveAccount
	 */
	public AccountVo getReceiveAccount() {
		return receiveAccount;
	}
	/**
	 * @param receiveAccount the receiveAccount to set
	 */
	public void setReceiveAccount(AccountVo receiveAccount) {
		this.receiveAccount = receiveAccount;
	}
	
	
}
