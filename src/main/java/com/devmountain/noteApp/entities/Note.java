package com.devmountain.noteApp.entities;

import com.devmountain.noteApp.dtos.NoteDto;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="notes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonBackReference
    private User user;
    @Column(columnDefinition = "text")
    private String body;

    public Long getId() {
        return id;
    }

    public Note(NoteDto noteDto) {
        if(noteDto.getBody() != null){
            this.body = noteDto.getBody();
        }
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", body='" + body + '\'' +
                '}';
    }
}
