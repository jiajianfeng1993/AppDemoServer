package cn.com.hd.app.domain.chat.account.dao;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import cn.com.hd.app.common.constants.DataConstants;
import cn.com.hd.app.common.util.TokenUtil;
import cn.com.hd.app.domain.chat.account.model.AccountModel;
import cn.com.hd.app.domain.chat.account.model.vo.AccountVo;
import cn.com.hd.app.domain.chat.friend.dao.FriendDao;
import cn.com.hd.app.domain.chat.friend.model.FriendModel;

@ContextConfiguration(locations="classpath:spring/applicationContext.xml")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AccountDaoTest extends AbstractJUnit4SpringContextTests{

	@Autowired
	AccountDao dao;
	@Autowired
	FriendDao friendDao;
	@Test
	public void test() throws Exception {
		List<AccountVo> list = dao.getList(null);
		for(AccountVo vo:list){
			String token=TokenUtil.getToken(vo.getAccountCode(), vo.getAccountName(), vo.getHeadImg());
			vo.setToken(token);
			System.out.println(dao.updateByKey(vo));
		}
	}

}
