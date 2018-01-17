package io.barbatchov.docviewer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@EnableOAuth2Sso
//@EnableOAuth2Client
@SpringBootApplication
public class DocviewerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DocviewerApplication.class, args);
    }
}
