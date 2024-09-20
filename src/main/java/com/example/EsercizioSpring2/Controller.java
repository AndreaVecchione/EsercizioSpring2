package com.example.EsercizioSpring2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class Controller {

    @GetMapping (path = "/ciao/{milano}")
    public Utente greet (@PathVariable String milano, @RequestParam(value = "giuseppe", required = true) String giuseppe) {
        String hello = "Ciao " + giuseppe + ", com'è il tempo a " + milano + "?";
        return new Utente(giuseppe,milano,hello);
    }
}
