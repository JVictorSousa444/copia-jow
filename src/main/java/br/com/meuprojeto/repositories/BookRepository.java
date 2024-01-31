package br.com.meuprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.meuprojeto.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
