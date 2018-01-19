package io.barbatchov.docviewer.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/user")
public class UserRestController {

    @GetMapping
    public Principal user(Principal principal) {
        return principal;
    }
}
