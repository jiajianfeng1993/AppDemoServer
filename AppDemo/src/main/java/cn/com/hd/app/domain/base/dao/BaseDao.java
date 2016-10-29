package cn.com.hd.app.domain.base.dao;

import java.util.List;

import cn.com.hd.app.domain.base.model.BaseModel;
import cn.com.hd.app.domain.base.model.query.BaseQuery;


public interface BaseDao <V extends BaseModel,Q extends BaseQuery>{
	public int add(V vo);
	public int deleteByKey(Integer id);
	public V getByKey(Integer id);
	public int updateByKey(V vo);
	public List<V> getList(Q query);
	public Integer getListCount(Q query);
}
