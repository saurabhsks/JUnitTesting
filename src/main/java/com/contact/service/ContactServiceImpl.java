package com.contact.service;

import com.contact.entity.Contact;
import com.contact.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl {

    @Autowired
    ContactRepository contactRepository;

    List<Contact> list = new ArrayList<>(Arrays.asList(
            new Contact(1L, "saurabh@gmail.com", "Saurabh", 100L),
            new Contact(2L, "ishan@gmail.com", "Ishan", 101L),
            new Contact(3L, "surya@gmail.com", "Surya", 102L)
           // new Contact(4L, "sameer@gmail.com", "Sameer", 1314L)
    ));

    public List<Contact>getAllContacts(){
       // return list;
        List<Contact>list=new ArrayList<>();
        contactRepository.findAll()
                .forEach(list::add);
        return list;

    }

//    public List<Contact> getContactsOfUser(Long userId) {
//        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
//    }


}
