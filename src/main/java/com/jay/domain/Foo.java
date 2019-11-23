package com.jay.domain;

import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Foo {

  private static Logger logger = LoggerFactory.getLogger(Foo.class);

  public Foo() {
    logger.info("Foo constructor!!");
  }

  public void init(){
    logger.info("Foo init!!");
  }

  @PostConstruct
  public void postConstruct() {
    logger.info("Foo PostConstruct!!");
  }
}
