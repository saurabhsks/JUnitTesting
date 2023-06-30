package com.contact.test;

import com.contact.entity.Contact;
import com.contact.repository.ContactRepository;
import com.contact.service.ContactServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
//import com.contact.service.ContactServiceImpl;

@ExtendWith(SpringExtension.class)
public class ContactServiceImplTest {

    @InjectMocks
    private ContactServiceImpl contactServiceImpl;

   @Mock
   private ContactRepository contactRepository;

    @Test
    public void getAllContactsTest(){


        when(contactRepository.findAll()).thenReturn((Arrays.asList(
                new Contact(1L, "saurabh@gmail.com", "Saurabh", 100L),
        new Contact(2L, "sks@gmail.com", "Sks", 100L)


        )));

        List<Contact> ls=contactServiceImpl.getAllContacts();

        assertEquals(1L,ls.get(0).getcId());
       assertEquals(2L,ls.get(1).getcId());

    }
}
