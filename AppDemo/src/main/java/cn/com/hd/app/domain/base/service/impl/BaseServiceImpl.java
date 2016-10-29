package cn.com.hd.app.domain.base.service.impl;

import java.util.Date;
import java.util.List;

import cn.com.hd.app.common.constants.DataConstants;
import cn.com.hd.app.domain.base.dao.BaseDao;
import cn.com.hd.app.domain.base.model.BaseModel;
import cn.com.hd.app.domain.base.model.query.BaseQuery;
import cn.com.hd.app.domain.base.service.BaseService;

public abstract class BaseServiceImpl<V extends BaseModel,Q extends BaseQuery> implements BaseService<V ,Q>{

	public abstract BaseDao<V, Q> getDao();
	
	@Override
	public boolean add(V model) {
		model.setCreateTime(new Date());
		if(model.getState()==null){
			model.setShowOrder(10);
		}
		model.setState(DataConstants.STATE_NORMAL_OF_DEFAULT_DATA);
		return getDao().add(model)==0;
	}

	@Override
	public V getByKey(Integer id) {
		return getDao().getByKey(id);
	}

	@Override
	public boolean deleteByKey(Integer id) {
		return getDao().deleteByKey(id)==1;
	}

	@Override
	public boolean updateByKey(V vo) {
		return getDao().updateByKey(vo)==1;
	}


	@Override
	public List<V> getList(Q query) {
		return getDao().getList(query);
	}

	@Override
	public Integer getListConut(Q query) {
		return getDao().getListCount(query);
	}

}
