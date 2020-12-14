package com.tts.WeatherApp;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ZipRepository extends CrudRepository<Zip, Long> {

 long count();
 
  List<Zip> findAll();
  
}
