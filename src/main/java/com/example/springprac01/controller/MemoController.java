package com.example.springprac01.controller;

import com.example.springprac01.domain.Memo;
import com.example.springprac01.dto.MemoRequestDto;
import com.example.springprac01.repository.MemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemoController {

    private final MemoRepository memoRepository;


    @GetMapping("/api/contents")
    public List<Memo> getMemos() {
        return memoRepository.findAllByOrderByModifiedAtDesc();
    }


    @PostMapping("/api/contents")
    public Memo createMemo(@RequestBody MemoRequestDto requestDto) {
        Memo memo = new Memo(requestDto);
        return memoRepository.save(memo);
    }

}



