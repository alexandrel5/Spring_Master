package com.eazybytes.eazyschool.service;

import com.eazybytes.eazyschool.model.Contact;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Slf4j
@Service
//@RequestScope
//@SessionScope
@ApplicationScope
public class ContactService {

    //private static Logger log = LoggerFactory.getLogger(ContactController.class);

    /*
    Save Contact Details into DB
    @param contact
    @return boolean
     */

    private int counter = 0;

    public ContactService(){
        System.out.println("Contact Service Bean initialized");
    }

    public boolean saveMessageDetail(Contact contact){
        boolean isSaved = true;
        //Todo - Need to persist the data into the DB table
        log.info(contact.toString());
        return isSaved;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
