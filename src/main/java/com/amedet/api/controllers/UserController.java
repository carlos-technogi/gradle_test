/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.amedet.api.controllers;

import com.amedet.api.models.User;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.validation.Valid;

/**
 * com.amedet.api.controllers
 * developed on Technogi Mexico
 * by carlos_technogi
 * on 3/10/15
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {

    private Facebook facebook;

    @Inject
    public UserController(Facebook facebook) {
        this.facebook = facebook;
    }

    @RequestMapping(method = RequestMethod.POST)
    public User registerUser(@Valid @RequestBody User user){
        return user;
    }

    @RequestMapping(method=RequestMethod.GET)
    public String helloFacebook() {
        if (!facebook.isAuthorized()) {
            return "redirect:/connect/facebook";
        }



        return "hello";
    }

}
