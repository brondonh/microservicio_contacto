package com.brayanrondonh.contacts.api;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.brayanrondonh.contacts.dto.Contacts;
import com.brayanrondonh.contacts.service.ContactService;


@RestController
@RequestMapping("/Contactos")
public class ContactsApi
{   
	@Autowired
    ContactService contactService;     
    
	@PostMapping()
    public Contacts insert(@RequestBody Contacts contact){
        
        return contactService.save(contact);
    }
    
    @GetMapping
    public List<Contacts> All()
    {
    	return contactService.findAll();
    }
    
    
    public Object buscarPorId(Long id)
    {
    	return contactService.findById(id);
    }
    
    @PutMapping
    public void modificar(@RequestBody Contacts contacts)
    {
    	contactService.save(contacts);
    }
    
    @DeleteMapping(value = "/{id}")
    public void eliminar(@PathVariable("id") Long id)
    {
    	contactService.deleteById(id);
    }
}
