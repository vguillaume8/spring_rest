package com.vinstonguillaume.rest_tutorial;

import com.vinstonguillaume.rest_tutorial.models.Pets;
import com.vinstonguillaume.rest_tutorial.repositories.PetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetsController{
    @Autowired
    private PetsRepository repository;
}

@RequestMapping(va)
