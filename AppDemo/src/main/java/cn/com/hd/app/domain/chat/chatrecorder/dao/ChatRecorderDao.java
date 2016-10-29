package cn.com.hd.app.domain.chat.chatrecorder.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.hd.app.domain.base.dao.BaseDao;
import cn.com.hd.app.domain.chat.chatrecorder.model.query.ChatRecorderQuery;
import cn.com.hd.app.domain.chat.chatrecorder.model.vo.ChatRecorderVo;

public interface ChatRecorderDao extends BaseDao<ChatRecorderVo, ChatRecorderQuery>{

	List<ChatRecorderVo> getAccountRecorder(@Param("accountId")Integer accountId);

}
