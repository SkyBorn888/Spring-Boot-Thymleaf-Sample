package com.example.demo;

import org.springframework.boot.SpringApplication; //

//tymeliefを使用する /src/templates/application/spring.thymeleaf.mode=HTML

import org.springframework.ui.Model; // Spring MVC addAtrributeを使ってvalueの値を代入

import org.springframework.web.bind.annotation.GetMapping; //GETリクエストされた際の

//import org.springframework.web.bind.annotation.RequestMapping; //数種のRequestのマッピング
//import org.springframework.web.bind.annotation.RequestMethod; //　RequestMappingの引数の中で使える. リクエストの受付種類を method =　 RequesrtMethod.GET/POST



import org.springframework.boot.autoconfigure.SpringBootApplication; //	Webページアプリ用,メソッドの戻り値が遷移先のview
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RestController; //APIサーバーなどに使われる、XML JSON



@SpringBootApplication //このアノテーションで Spring Bootのアプリだと宣言します。
@Controller
public class HelloWorld {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class, args);
        }
    
    //リクエスト URL に対して、どのメソッドが処理を実行するか定義するアノテーション。GETでアクセスされたリクエストの場合
    //@RequestMapping(value = "/", method = RequestMethod.GET)

    //
    @GetMapping("/")
    public String Hello(Model model) {
        model.addAttribute("title", "Hello World");
        model.addAttribute("message", "Welcome to my site");
        return "hello";
    }

}
