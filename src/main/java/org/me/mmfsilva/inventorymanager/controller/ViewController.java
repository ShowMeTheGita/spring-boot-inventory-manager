package org.me.mmfsilva.inventorymanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/invman")
    public String getFrontPage() {
        return "frontpage";
    }


}
