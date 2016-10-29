package cn.com.hd.app.domain.base.service;

import java.util.List;

import cn.com.hd.app.domain.base.model.BaseModel;
import cn.com.hd.app.domain.base.model.query.BaseQuery;

public interface BaseService<V extends BaseModel,Q extends BaseQuery> {

	public boolean add(V model);
	
	public V getByKey(Integer id);
	
	public boolean deleteByKey(Integer id);
	
	public boolean updateByKey(V accountModel);
	
	public List<V> getList(Q query);
	
	public Integer getListConut(Q query);
}
