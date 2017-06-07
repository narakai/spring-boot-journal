package com.clem.www.controller;

import com.clem.www.domain.JournalEntry;
import com.clem.www.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by laileon on 2017/6/7.
 */
@RestController
public class JournalController {
    @Autowired
    JournalRepository repo;

//    @RequestMapping("/")
//    public String index(Model model) {
//        model.addAttribute("journal", repo.findAll());
//        return "index";
//    }
//
//    @RequestMapping(value = "/journal", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
//    public @ResponseBody List<JournalEntry> getJournal() {
//        return repo.findAll();
//    }

    private static final String VIEW_INDEX = "index";
    private static final String VIEW_LOGIN = "login";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName(VIEW_INDEX);
        modelAndView.addObject("journal", repo.findAll());
        return modelAndView;
    }

    @RequestMapping(value = "/api", method = RequestMethod.GET)
    public List<JournalEntry> getList() {
        List<JournalEntry> r = repo.findAll();
        return r;
    }

    @RequestMapping(value = "/api", method = RequestMethod.POST)
    public void saveUser(@RequestBody JournalEntry user) {
        repo.save(user);
    }

    @RequestMapping(value = "/login")
    public ModelAndView login(ModelAndView modelAndView) {
        modelAndView.setViewName(VIEW_LOGIN);
        return modelAndView;
    }
}
