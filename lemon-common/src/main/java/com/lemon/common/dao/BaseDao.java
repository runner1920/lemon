package com.lemon.common.dao;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author jiangqk
 * @data 2017年8月30日 下午4:03:17
 */
public interface BaseDao<T> {
	
	void save(T t);
	
	void saveBatch(List<T> list);
	
	int update(T t);
	
	int update(Map<String, Object> map);
	
	int delete(Object id);
	
	int delete(Map<String, Object> map);
	
	int deleteBatch(Object[] id);

	T queryObject(Object id);
	
	List<T> queryList(Map<String, Object> map);
	
	List<T> queryList(Object id);
	
}
