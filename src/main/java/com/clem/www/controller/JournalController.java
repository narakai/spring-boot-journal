package com.clem.www.controller;

import com.clem.www.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by laileon on 2017/6/7.
 */
@Controller
public class JournalController {
    @Autowired
    JournalRepository repo;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("journal", repo.findAll());
        return "index";
    }
}
