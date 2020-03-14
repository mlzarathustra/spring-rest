package net.mlz.library.book;

import org.springframework.data.repository.CrudRepository;

// no need to add anything here
// for docs, see:
// https://docs.spring.io/spring-data/commons/docs/current/api/index.html?org/springframework/data/repository/CrudRepository.html
//
public interface BookRepository extends CrudRepository<Book, Integer> {

}
