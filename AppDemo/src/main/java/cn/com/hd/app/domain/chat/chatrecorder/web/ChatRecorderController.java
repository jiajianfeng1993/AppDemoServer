package cn.com.hd.app.domain.chat.chatrecorder.web;

import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.hd.app.common.util.ReturnMapUtil;
import cn.com.hd.app.domain.chat.account.model.vo.AccountVo;
import cn.com.hd.app.domain.chat.chatrecorder.model.query.ChatRecorderQuery;
import cn.com.hd.app.domain.chat.chatrecorder.model.vo.ChatRecorderVo;
import cn.com.hd.app.domain.chat.chatrecorder.service.ChatRecorderService;

@Controller
@RequestMapping("app/chatRecorder")
public class ChatRecorderController {
	@Autowired
	private ChatRecorderService chatRecorderService;
	
	//添加聊天记录
	@RequestMapping("addChatRecorder")
	@ResponseBody
	public List<Map<String, Object>> addChatRecorder(ChatRecorderVo recorderVo){
		boolean add = chatRecorderService.add(recorderVo);
		if(add){
			return ReturnMapUtil.getSuccessReturnListMap(null);
		}else{
			return ReturnMapUtil.getFailReturnListMap("添加失败");
		}
	}
	
	
	@RequestMapping("{id}/getChatRecorder")
	@ResponseBody
	public TreeSet<ChatRecorderVo> getChatRecorder(@PathVariable Integer id){
		ChatRecorderQuery recorderQuery=new ChatRecorderQuery();
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.DAY_OF_YEAR, cal.get(Calendar.DAY_OF_YEAR)-5);
		recorderQuery.setCreateTime(cal.getTime());
		recorderQuery.setReceiveAccountId(id);
		//得到收到的聊天记录
		List<ChatRecorderVo> receiveRecorders=chatRecorderService.getList(recorderQuery);
		//得到发送的聊天记录
		recorderQuery.setReceiveAccountId(null);
		recorderQuery.setSendAccountId(id);
		List<ChatRecorderVo> sendRecorders=chatRecorderService.getListWithAccount(recorderQuery);
		//排序聊天记录
		TreeSet<ChatRecorderVo> treeSet=new TreeSet<ChatRecorderVo>(new Comparator<ChatRecorderVo>() {
			@Override
			public int compare(ChatRecorderVo arg0, ChatRecorderVo arg1) {
				if(arg0.getCreateTime()==null){
					return -1;
				}
				if(arg1.getCreateTime()==null){
					return -1;
				}
				return arg0.getCreateTime().compareTo(arg1.getCreateTime());
			}
			
		});
		treeSet.addAll(sendRecorders);
		treeSet.addAll(receiveRecorders);
		return treeSet;
	}
	
}
