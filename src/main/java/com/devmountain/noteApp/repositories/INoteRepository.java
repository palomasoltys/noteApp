package com.devmountain.noteApp.repositories;

import com.devmountain.noteApp.entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INoteRepository extends JpaRepository<Note, Long> {
}
