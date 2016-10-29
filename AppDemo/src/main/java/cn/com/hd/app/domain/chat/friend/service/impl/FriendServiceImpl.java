package cn.com.hd.app.domain.chat.friend.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.hd.app.domain.base.dao.BaseDao;
import cn.com.hd.app.domain.base.service.impl.BaseServiceImpl;
import cn.com.hd.app.domain.chat.account.dao.AccountDao;
import cn.com.hd.app.domain.chat.account.model.AccountModel;
import cn.com.hd.app.domain.chat.account.service.AccountService;
import cn.com.hd.app.domain.chat.friend.dao.FriendDao;
import cn.com.hd.app.domain.chat.friend.model.FriendModel;
import cn.com.hd.app.domain.chat.friend.model.query.FriendQuery;
import cn.com.hd.app.domain.chat.friend.model.vo.FriendVo;
import cn.com.hd.app.domain.chat.friend.service.FriendService;

@Service
public class FriendServiceImpl extends BaseServiceImpl<FriendVo, FriendQuery> implements FriendService{
	
	Log log=LogFactory.getLog(FriendServiceImpl.class);
	
	@Autowired
	FriendDao friendDao;
	
	@Autowired
	AccountService accountService;

	@Override
	public BaseDao<FriendVo, FriendQuery> getDao() {
		return friendDao;
	}

	@Override
	public List<AccountModel> getFriendsByAccountId(Integer accountId) {
		FriendQuery query=new FriendQuery();
		query.setAccountId(accountId);
		List<FriendVo> list = friendDao.getList(query);
		List<AccountModel> accounts=new ArrayList<AccountModel>();
		if(null!=list){
			for(FriendVo vo:list){
				Integer friendId=vo.getFriendId();
				AccountModel model = accountService.getByKey(friendId);
				if(model==null){
					log.info("用户ID:+"+accountId+",有不存在的好友");
					continue;
				}
				accounts.add(model);
				
			}
		}
		return accounts;
	}
	


}
