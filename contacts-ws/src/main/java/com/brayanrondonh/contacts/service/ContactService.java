package com.brayanrondonh.contacts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brayanrondonh.contacts.dao.ContactRepository;
import com.brayanrondonh.contacts.dto.Contacts;

@Service
public class ContactService
{
	@Autowired
	ContactRepository dao;
	
	public Contacts save(Contacts contacts)
	{
		return dao.save(contacts);
	}
	
	public List<Contacts> findAll()
	{
		return dao.findAll();
	}
	
	public Object findById(Long id)
	{
		return dao.findById(id);
	}
	
	public void removeBy(Long id)
	{
		dao.deleteById(id);
	}

	public void deleteById(Long id)
	{
		dao.deleteById(id);
	}
}