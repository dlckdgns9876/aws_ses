package com.example.aws_ses;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmailController {

    private final SendEmailService emailService;

    @PostMapping("api/sendEmail")
    public String sendEmail() throws Exception {
        List<String> to = new ArrayList<>();
        to.add("dlckdgns9876@naver.com");

        String subject = "SES TEST";

        String content = "이메일 테스트";

        emailService.send(subject, content, to);
        return "true";
    }
}
