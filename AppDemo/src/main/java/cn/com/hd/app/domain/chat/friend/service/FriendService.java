package cn.com.hd.app.domain.chat.friend.service;


import java.util.List;

import cn.com.hd.app.domain.base.service.BaseService;
import cn.com.hd.app.domain.chat.account.model.AccountModel;
import cn.com.hd.app.domain.chat.friend.model.FriendModel;
import cn.com.hd.app.domain.chat.friend.model.query.FriendQuery;
import cn.com.hd.app.domain.chat.friend.model.vo.FriendVo;

public interface FriendService extends BaseService<FriendVo, FriendQuery>{

	List<AccountModel> getFriendsByAccountId(Integer accountId);

}
