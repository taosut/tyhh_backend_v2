package com.stadio.cms.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stadio.cms.i18n.IMessageService;
import com.stadio.model.repository.user.ManagerRepository;
import com.stadio.model.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by Andy on 11/13/2017.
 */
public class BaseService
{
    @Autowired
    private IMessageService messageService;

    @Autowired ManagerRepository managerRepository;

    protected ObjectMapper mapper = new ObjectMapper();

    @Autowired UserRepository userRepository;

    protected String getMessage(String key)
    {
        try {
            return messageService.getMessage(key);
        } catch (Exception e) {
            return "OK";
        }
    }

}
