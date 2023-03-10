package com.bookStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.MyBookList;
import com.bookStore.repository.MyBookRepository;
import java.util.*;

@Service
public class MyBookListService {
    @Autowired
    private MyBookRepository mybookRepo;

    public void saveMyBooks(MyBookList book){
        mybookRepo.save(book);
    }

    public List<MyBookList> getAllMyBooks(){
        return mybookRepo.findAll();
    }

    public void deleteMyBooksById(int id){
        mybookRepo.deleteById(id);
    }
}
