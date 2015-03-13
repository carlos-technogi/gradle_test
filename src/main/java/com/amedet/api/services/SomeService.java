package com.amedet.api.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * com.amedet.api.services
 * developed on Technogi Mexico
 * by carlos_technogi
 * on 3/9/15
 */
@Service
public class SomeService {
    private Logger logger = LoggerFactory.getLogger(SomeService.class);

    public String foo() {
        logger.debug("Foo has been called");
        return "bar Mod";
    }

}
