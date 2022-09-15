package com.springboot.springboottest.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping({"/", "/index"}) // 매핑 주소
    public String loadIndex() {
        return "index"; // html 파일명
    }

}
