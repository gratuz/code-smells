package com.example.bookstore.publishers;


import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;




@Service
public interface PublisherRepository extends CrudRepository<Publisher,Integer> {

  Optional<Publisher> findById(Integer Id);

}