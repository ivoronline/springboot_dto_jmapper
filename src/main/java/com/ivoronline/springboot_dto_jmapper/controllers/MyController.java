package com.ivoronline.springboot_dto_jmapper.controllers;

import com.googlecode.jmapper.JMapper;
import com.ivoronline.springboot_dto_jmapper.DTO.AuthorBookDTO;
import com.ivoronline.springboot_dto_jmapper.entities.Author;
import com.ivoronline.springboot_dto_jmapper.entities.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("addAuthorBook")
  public String addAuthorBook(@RequestBody AuthorBookDTO authorBookDTO) {

    //INSTANTIATE JMAPPER<DESTINATION, SOURCE>
    JMapper<Book,   AuthorBookDTO> bookMapper   = new JMapper<>(Book  .class, AuthorBookDTO.class);
    JMapper<Author, AuthorBookDTO> authorMapper = new JMapper<>(Author.class, AuthorBookDTO.class);

    //MATP AuthorBookDTO TO AUTHOR & BOOK.
    Book   book   = bookMapper  .getDestination(authorBookDTO);
    Author author = authorMapper.getDestination(authorBookDTO);

    //RETURN SOMETHING
    return author.name + " has written: " + book.title;

  }

}
