package org.foobarspam.fpinformatica.forum.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class IndexController {

    @GetMapping(value="/", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> index(){
        List<String> obj = new ArrayList<>();
        String name = "name";
        for (int i = 0 ; i< 5; i ++) {
            obj.add(name + i);
        }
        return obj;
    }

}
