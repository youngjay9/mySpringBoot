package com.jay.config;

import com.jay.domain.Foo;
import com.jay.postprocessor.InstanceValidationBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

  @Bean(initMethod = "init")
  public Foo foo() {
    return new Foo();
  }

  @Bean(initMethod = "processorInit")
  public InstanceValidationBeanPostProcessor instanceValidationBeanPostProcessor() {
    return new InstanceValidationBeanPostProcessor();
  }
}
