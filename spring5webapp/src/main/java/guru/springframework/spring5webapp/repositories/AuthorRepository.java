package guru.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.domain.Author;
/*
 * Interface que será usada como base para interface com o banco de dados
 */
public interface AuthorRepository extends CrudRepository<Author, Long>  {

}
