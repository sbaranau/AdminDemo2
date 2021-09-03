package com.perspectix.admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Slf4j
@Controller
public class OAuthController {

    private final String URI_BASE = "/oauth2/authorization/";
    private final List<String> clients =
            List.of("Facebook", "Google", "GitHub");


    @GetMapping("/oauth2login")
    public String oAuth2LoginPage() {
        log.info("inside login redirect");
        /*Map<String, String> clientUrls =
                clients.stream().collect(
                        toMap(identity(),
                                client -> URI_BASE + client.toLowerCase()));

        model.addAttribute("clientUrls", clientUrls);*/
        return "index";
    }
}
