package cn.com.hd.app.domain.chat.friend.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.hd.app.common.util.ReturnMapUtil;
import cn.com.hd.app.domain.chat.account.model.AccountModel;
import cn.com.hd.app.domain.chat.friend.model.vo.FriendVo;
import cn.com.hd.app.domain.chat.friend.service.FriendService;
import cn.com.hd.common.utils.BeanUtil;


@Controller
@RequestMapping("app/friend")
public class FriendController {

	@Autowired
	FriendService friendService;
	
	@RequestMapping(value="{accountId}/getFriends",method=RequestMethod.GET)
	@ResponseBody
	public List<Map<String, Object>> getFriends(@PathVariable Integer accountId){
		try {
			List<AccountModel> models = friendService.getFriendsByAccountId(accountId);
			List<Map<String, Object>> beanMaps=new ArrayList<Map<String,Object>>();
			BeanUtil beanUtil=new BeanUtil();
			if(models!=null){
				for(AccountModel model:models){
					beanMaps.add(beanUtil.getBeanMap(model));
				}
			}
			return ReturnMapUtil.getSuccessReturnListMap(beanMaps);
			
		} catch (Exception e) {
			return ReturnMapUtil.getFailReturnListMap(e.getMessage());
		}
	}
	public static void main(String[] args) {
		Map<String, Object> obj=new HashMap<String, Object>();
		obj.put("aa", "b");
		List aa=new ArrayList<Map<String, Object>>();
		List<FriendVo> list=aa;
	}
}
