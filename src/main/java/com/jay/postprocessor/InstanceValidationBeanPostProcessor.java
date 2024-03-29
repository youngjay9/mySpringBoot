package com.jay.postprocessor;


import com.jay.comon.InstanceValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InstanceValidationBeanPostProcessor implements BeanPostProcessor{

  private static Logger logger = LoggerFactory
      .getLogger(InstanceValidationBeanPostProcessor.class);

  public InstanceValidationBeanPostProcessor() {
    logger.info("Created InstanceValidationBeanPostProcessor instance");
  }

  public void processorInit(){
    logger.info("InstanceValidationBeanPostProcessor's processorInit");
  }

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName)
      throws BeansException {
    logger.info(
        "InstanceValidationBeanPostProcessor's postProcessBeforeInitialization method invoked for bean "
            + beanName + " of type ==> " + bean.getClass());
    return bean;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName)
      throws BeansException {
    logger.info(
        "InstanceValidationBeanPostProcessor's postProcessAfterInitialization method invoked for bean "
            + beanName + " of type ==> " + bean.getClass());
    if (bean instanceof InstanceValidator) {
      ((InstanceValidator) bean).validateInstance();
    }
    return bean;
  }
}
