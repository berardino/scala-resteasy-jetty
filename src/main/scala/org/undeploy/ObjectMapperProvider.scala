package org.undeploy


import com.fasterxml.jackson.module.scala.DefaultScalaModule
import javax.ws.rs.ext.ContextResolver
import com.fasterxml.jackson.databind.{DeserializationFeature, SerializationFeature, ObjectMapper}

class ObjectMapperProvider extends ContextResolver[ObjectMapper]{
  def getContext(`type`: Class[_]): ObjectMapper = {
    val objectMapper = new ObjectMapper();
    objectMapper.registerModule(DefaultScalaModule)
    objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    return objectMapper;
  }
}
