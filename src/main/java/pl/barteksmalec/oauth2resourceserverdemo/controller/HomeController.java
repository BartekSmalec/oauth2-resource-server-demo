package pl.barteksmalec.oauth2resourceserverdemo.controller;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.barteksmalec.oauth2resourceserverdemo.config.RsaKeyProperties;

import java.security.Principal;

@RestController
@EnableConfigurationProperties(RsaKeyProperties.class)
public class HomeController {
    @GetMapping
    public String home(Principal principal) {
        return "Hello World " + principal.toString();
    }
}
