package com.bookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bookStore.service.MyBookListService;

@Controller
public class MyBookListController {

    @Autowired
    private MyBookListService myBookListService;
    @RequestMapping("/deleteMyBookList/{id}")
    public String deleteMyBookList(@PathVariable("id") int id){
        myBookListService.deleteMyBooksById(id);
        return "redirect:/my_books";
    }
}
