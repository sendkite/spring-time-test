package com.example.springprac01.controller;

import com.example.springprac01.domain.Memo;
import com.example.springprac01.dto.MemoRequestDto;
import com.example.springprac01.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
public class MemoController {

    private final MemoService memoService;


    @GetMapping("/api/contents/{id}")
    public Memo getMemo(@PathVariable Long id) {
        return memoService.getMemo(id);
    }


    @PostMapping("/api/contents")
    public Memo createMemo(@RequestBody MemoRequestDto memoRequestDto) {

        return memoService.setMemo(memoRequestDto);
    }

}



