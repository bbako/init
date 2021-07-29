package com.example.init.main.controller;

import com.example.init.main.service.MainService;
import com.example.init.main.vo.MainVO;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class MainController {

    MainService mainService;

    @GetMapping("/")
    public String hello(Model model) throws Exception {

        List<MainVO> country_list = mainService.getCountry();
        model.addAttribute("country_list" , country_list);

        return "main";
    }

    @GetMapping("/hello")
    public String main(Model model) throws Exception {
        return "hello";
    }
}
