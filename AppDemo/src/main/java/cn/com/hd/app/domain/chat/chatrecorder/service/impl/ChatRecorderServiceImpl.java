package cn.com.hd.app.domain.chat.chatrecorder.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.hd.app.domain.base.dao.BaseDao;
import cn.com.hd.app.domain.base.service.BaseService;
import cn.com.hd.app.domain.base.service.impl.BaseServiceImpl;
import cn.com.hd.app.domain.chat.account.model.vo.AccountVo;
import cn.com.hd.app.domain.chat.account.service.AccountService;
import cn.com.hd.app.domain.chat.chatrecorder.dao.ChatRecorderDao;
import cn.com.hd.app.domain.chat.chatrecorder.model.ChatRecorderModel;
import cn.com.hd.app.domain.chat.chatrecorder.model.query.ChatRecorderQuery;
import cn.com.hd.app.domain.chat.chatrecorder.model.vo.ChatRecorderVo;
import cn.com.hd.app.domain.chat.chatrecorder.service.ChatRecorderService;

@Service
public class ChatRecorderServiceImpl extends BaseServiceImpl<ChatRecorderVo, ChatRecorderQuery> implements ChatRecorderService {

	@Autowired
	ChatRecorderDao chatRecorderDao;
	@Autowired 
	AccountService accountService;
	
	@Override
	public BaseDao<ChatRecorderVo, ChatRecorderQuery> getDao() {
		return chatRecorderDao;
	}

	@Override
	public List<ChatRecorderVo> getAccountRecorder(Integer id) {
		return chatRecorderDao.getAccountRecorder(id);
	}

	@Override
	public List<ChatRecorderVo> getListWithAccount(
			ChatRecorderQuery recorderQuery) {
		List<ChatRecorderVo> list = this.getList(recorderQuery);
		if(list!=null){
			for(ChatRecorderVo chatRecorderVo:list){
				AccountVo sendAccount = accountService.getByKey(chatRecorderVo.getSendAccountId());
				AccountVo receiveAccount = accountService.getByKey(chatRecorderVo.getReceiveAccountId());
				chatRecorderVo.setSendAccount(sendAccount);
				chatRecorderVo.setReceiveAccount(receiveAccount);
			}
		}
		return list;
	}

}
