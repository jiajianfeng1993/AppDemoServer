package cn.com.hd.app.domain.chat.account.service;


import cn.com.hd.app.domain.base.service.BaseService;
import cn.com.hd.app.domain.chat.account.model.AccountModel;
import cn.com.hd.app.domain.chat.account.model.query.AccountQuery;
import cn.com.hd.app.domain.chat.account.model.vo.AccountVo;

public interface AccountService extends BaseService<AccountVo, AccountQuery>{

	AccountVo getAccountByLoginNameAndPwd(AccountQuery query);
	
}
