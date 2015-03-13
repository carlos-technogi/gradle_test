package com.amedet.api.controllers;

import com.amedet.api.services.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.amedet.api.controllers
 * developed on Technogi Mexico
 * by carlos_technogi
 * on 3/9/15
 */
@RestController
@RequestMapping("/services")
public class ServiceController {

    @Autowired
    private SomeService service;

    @RequestMapping(method = RequestMethod.GET, value="/hello")
    public String hello(){
        return "Hdddello Modif";
    }


    @RequestMapping(method = RequestMethod.POST, value="/service")
    public String service(){
        return service.foo();
    }

}
