package com.service.dddddd.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-06-04T07:49:59.122Z")

@RestSchema(schemaId = "dddddd")
@RequestMapping(path = "/dddddd", produces = MediaType.APPLICATION_JSON)
public class DdddddImpl {

    @Autowired
    private DdddddDelegate userDdddddDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userDdddddDelegate.helloworld(name);
    }

}
