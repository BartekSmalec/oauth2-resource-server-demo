package pl.barteksmalec.oauth2resourceserverdemo.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.barteksmalec.oauth2resourceserverdemo.service.TokenService;

@RestController
@AllArgsConstructor
@Slf4j
public class AuthController {
    private final TokenService tokenService;


    @PostMapping("/token")
    public String token(Authentication authentication) {
        String token = tokenService.generateToken(authentication);
        log.debug("Token requested for user {}", authentication.getName());
        log.debug("Token {}", token);
        return token;
    }
}
