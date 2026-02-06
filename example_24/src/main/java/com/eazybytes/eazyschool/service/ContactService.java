package com.eazybytes.eazyschool.service;

import com.eazybytes.eazyschool.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ContactService {

    //private static Logger log = LoggerFactory.getLogger(ContactController.class);

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
