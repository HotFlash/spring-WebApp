package com.gb.spring;

import lombok.Getter;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Component
//@Scope("singleton")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
// scope session
// scope request
// dao
//@Service
//@Repository
public class Box {

  private static long id_sequence = 1L;

  @Getter
  private final long id;

  public Box() {
    this.id = id_sequence++;
  }

  @PostConstruct
  public void init() {
    System.out.println("Box #" + id + " создана");
  }


}
