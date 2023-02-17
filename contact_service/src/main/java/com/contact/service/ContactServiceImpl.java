package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    //Fake list of contacts

    List<Contact> list = List.of(
            new Contact(1l,"ps@gmail.com", "Pankaj", 1234L),
            new Contact(2l,"Jaknap@gmail.com", "Jaknap", 1235L),
            new Contact(3l,"parth@gmail.com", "Parth", 1236L)
    );


    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());

    }
}
