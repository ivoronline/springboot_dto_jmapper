package com.ivoronline.springboot_dto_jmapper.entities;

import com.googlecode.jmapper.annotations.JMap;
import lombok.Data;

@Data
public class Author {

  public Integer id;    //Can't be mapped since there is no Annotation

  @JMap("authorName")   //Name of the Source Property
  public String  name;

  @JMap("authorAge")    //Name of the Source Property
  public Integer age;

}


