package com.ivoronline.springboot_dto_jmapper.entities;

import com.googlecode.jmapper.annotations.JMap;
import lombok.Data;

@Data
public class Book {

  public Integer id;

  @JMap                   //Source Property should have the same name
  public String title;

}
