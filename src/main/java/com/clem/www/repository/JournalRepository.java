package com.clem.www.repository;

import com.clem.www.domain.JournalEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by laileon on 2017/6/7.
 */
@Transactional
public interface JournalRepository extends JpaRepository<JournalEntry, Long>{
    List<JournalEntry> findByCreatedAfter(@Param("after") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date date);
    List<JournalEntry> findByCreatedBetween(@Param("after") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date after, @Param("before") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date before);
    List<JournalEntry> findByTitleContaining(@Param("word") String word);
    List<JournalEntry> findBySummaryContaining(@Param("word") String word);
}
