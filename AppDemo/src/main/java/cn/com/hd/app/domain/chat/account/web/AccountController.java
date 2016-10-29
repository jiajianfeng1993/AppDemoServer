package cn.com.hd.app.domain.chat.account.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;









import cn.com.hd.app.common.util.ReturnMapUtil;
import cn.com.hd.app.domain.chat.account.model.AccountModel;
import cn.com.hd.app.domain.chat.account.model.query.AccountQuery;
import cn.com.hd.app.domain.chat.account.model.vo.AccountVo;
import cn.com.hd.app.domain.chat.account.service.AccountService;
import cn.com.hd.common.exception.RollBackException;
import cn.com.hd.common.utils.BeanUtil;

@Controller
@RequestMapping("app/account")
public class AccountController {
	@Autowired
	AccountService accountService;
	
	//添加用户
	@RequestMapping(value="{loginName}/{loginPassword}/add",method=RequestMethod.GET)
	@ResponseBody
	public List<Map<String, Object>> add(AccountVo model){
		boolean add;
		try {
			add = accountService.add(model);
			if(add){
				return ReturnMapUtil.getSuccessReturnListMap(null);
			}else{
				return ReturnMapUtil.getFailReturnListMap("添加失败");
			}
			
		} catch (Exception e) {
			return ReturnMapUtil.getFailReturnListMap(e.getMessage());
		}
	}
	//删除用户
	@RequestMapping(value="{id}/delete",method=RequestMethod.GET)
	@ResponseBody
	public List<Map<String, Object>> delete(@PathVariable Integer id){
		boolean delete;
		try {
			delete = accountService.deleteByKey(id);
			if(delete){
				return ReturnMapUtil.getSuccessReturnListMap(null);
			}else{
				return ReturnMapUtil.getFailReturnListMap("删除失败");
			}
			
		} catch (Exception e) {
			return ReturnMapUtil.getFailReturnListMap(e.getMessage());
		}
	}
	//通过用户名和密码得到用户
	@RequestMapping(value="{loginName}/{loginPassword}/get",method=RequestMethod.GET)
	@ResponseBody
	public List<Map<String, Object>> get(AccountQuery query){
		try {
			AccountModel model = accountService.getAccountByLoginNameAndPwd(query);
			List<Map<String, Object>> list=new ArrayList<Map<String,Object>>();
			BeanUtil beanUtil=new BeanUtil();
			Map<String, Object> beanMap = beanUtil.getBeanMap(model);
			list.add(beanMap);
			return ReturnMapUtil.getSuccessReturnListMap(list);
			
		} catch (Exception e) {
			return ReturnMapUtil.getFailReturnListMap(e.getMessage());
		}
	}
}
