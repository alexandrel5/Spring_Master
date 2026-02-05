package com.eazybytes.eazyschool.service;

import com.eazybytes.eazyschool.controller.ContactController;
import com.eazybytes.eazyschool.model.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private static Logger log = LoggerFactory.getLogger(ContactController.class);

    /*
    Save Contact Details into DB
    @param contact
    @return boolean
     */

    public boolean saveMessageDetail(Contact contact){
        boolean isSaved = true;
        //Todo - Need to persist the data into the DB table
        log.info(contact.toString());
        return isSaved;
    }
}
