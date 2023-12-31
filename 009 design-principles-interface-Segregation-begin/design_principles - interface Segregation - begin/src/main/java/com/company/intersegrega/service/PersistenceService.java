package com.company.intersegrega.service;

import java.util.List;

import com.company.intersegrega.entity.Entity;

//common interface to be implemented by all persistence services.
// Interface này làm việc với các lớp extends Entity
// -> lớp này chứa method findByName mà vô nghĩa với lớp con OrderPersistenceService
//
public interface PersistenceService<T extends Entity> {

	public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);

	// vô nghĩa với lớp con -> cần tách ra cho vào thằng UserPersistenceService
	
	public List<T> findByName(String name);
}
