package com.jpa02.service;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


@FunctionalInterface
public interface BaseService<T,ID>{
	
	public JpaRepository<T,ID> getRepository();
	
	default T save(T t) {
		getRepository().save(t);
		return t;
	}
	
	default void deleteById(ID id) {
		getRepository().deleteById(id);
	}
	
	default T update(T t){
		//避免新实体中的空属性覆盖被更新实体的内容
//		StringUtils.get
//		getRepository().save(t);
		return null;
	}
	
	default List<T> getAll(){
		return getRepository().findAll();
	}
	
	default T getById(ID id){
		
		return getRepository().findById(id).orElse(null);
	}
	
}
