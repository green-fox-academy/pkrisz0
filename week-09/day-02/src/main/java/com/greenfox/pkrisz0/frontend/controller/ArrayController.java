package com.greenfox.pkrisz0.frontend.controller;

import com.greenfox.pkrisz0.frontend.model.ArrayHandler;
import com.greenfox.pkrisz0.frontend.model.ArrayInputObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayController {

    @PostMapping(value = "/arrays")
    public ArrayHandler arrayhandler(@RequestBody ArrayInputObject arrayinputobject){
        return new ArrayHandler(arrayinputobject.getWhat(), arrayinputobject.getNumbers());
    }
}
