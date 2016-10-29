package cn.com.hd.app.domain.chat.account.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.hd.app.common.util.CommonUtil;
import cn.com.hd.app.domain.base.dao.BaseDao;
import cn.com.hd.app.domain.base.service.impl.BaseServiceImpl;
import cn.com.hd.app.domain.chat.account.dao.AccountDao;
import cn.com.hd.app.domain.chat.account.model.AccountModel;
import cn.com.hd.app.domain.chat.account.model.query.AccountQuery;
import cn.com.hd.app.domain.chat.account.model.vo.AccountVo;
import cn.com.hd.app.domain.chat.account.service.AccountService;

@Service
public class AccountServiceImpl extends BaseServiceImpl<AccountVo, AccountQuery> implements AccountService  {
	@Autowired
	AccountDao accountDao;
	@Override
	public BaseDao<AccountVo, AccountQuery> getDao() {
		return accountDao;
	}
	//根据用户名和密码得到用户
	@Override
	public AccountVo getAccountByLoginNameAndPwd(AccountQuery query) {
		List<AccountVo> list = accountDao.getList(query);
		if(!CommonUtil.isListEmpty(list)){
			return list.get(0);
		}
		return null;
	}


}
