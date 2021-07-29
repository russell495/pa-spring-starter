package com.galvanize.tmo.paspringstarter.repository;

import com.galvanize.tmo.paspringstarter.model.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository  extends JpaRepository<BookEntity,Long> {


}
