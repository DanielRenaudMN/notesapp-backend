package demo.notesappbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.notesappbackend.entity.Note;

public interface NotesRepository extends JpaRepository<Note, Long> {

}
