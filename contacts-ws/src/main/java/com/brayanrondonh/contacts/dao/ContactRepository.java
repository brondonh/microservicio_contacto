package com.brayanrondonh.contacts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brayanrondonh.contacts.dto.Contacts;

public interface ContactRepository extends JpaRepository<Contacts, Long>
{

}
