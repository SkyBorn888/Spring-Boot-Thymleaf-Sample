package com.example.demo.PostButton;

import org.springframework.boot.SpringApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController; /

//model.addAttribute("title", "Hello World");
//model.addAttribute("message", "Welcome to my site");
//src/main/resources/templatesの中のhtmlファイルを指定


@SpringBootApplication //このアノテーションで Spring Bootのアプリだと宣言します。

@Controller
public class HomeController {
    // main関数でこのファイルのクラスコードHomeController.classをSpringApplication.run()で実行する
    public static void main(String[] args) {
        SpringApplication.run(HomeController.class, args);
    }

    // Getリクエストを受けた際の実行
    @GetMapping("/button")
    public String Index(Model model) {

        return "button/index";
    }

    // index.htmlが/post/firstに移動する様になり、こちらにアクセスがくる
    // POSTされて。first.htmlのhtmlを表示する
    @RequestMapping(value = "/post/first", method = RequestMethod.POST)
    public String POST_First(Model model) {
        return "button/first";
    }
}
