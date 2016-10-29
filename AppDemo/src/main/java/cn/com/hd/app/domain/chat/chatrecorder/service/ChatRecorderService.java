package cn.com.hd.app.domain.chat.chatrecorder.service;

import java.util.List;

import cn.com.hd.app.domain.base.service.BaseService;
import cn.com.hd.app.domain.chat.chatrecorder.model.ChatRecorderModel;
import cn.com.hd.app.domain.chat.chatrecorder.model.query.ChatRecorderQuery;
import cn.com.hd.app.domain.chat.chatrecorder.model.vo.ChatRecorderVo;

public interface ChatRecorderService extends BaseService<ChatRecorderVo, ChatRecorderQuery>{

	List<ChatRecorderVo> getAccountRecorder(Integer id);

	List<ChatRecorderVo> getListWithAccount(ChatRecorderQuery recorderQuery);


}
