package com.example.springprac01.domain;

import com.example.springprac01.dto.MemoRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Memo extends Timestamped {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String contents;

    public Memo(String contents) {
        this.contents = contents;
    }

    public Memo(MemoRequestDto requestDto) {
        this.contents = requestDto.getContents();
    }

}
