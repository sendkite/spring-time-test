package com.example.springprac01.service;


import com.example.springprac01.domain.Memo;
import com.example.springprac01.dto.MemoRequestDto;
import com.example.springprac01.repository.MemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class MemoService {

    private final MemoRepository memoRepository;

    public Memo setMemo(MemoRequestDto memoRequestDto) {
        Memo memo = new Memo();
        memo.setContents(memoRequestDto.getContents());
        memoRepository.save(memo);
        return memo;
    }

    public Memo getMemo(Long id) {

        return memoRepository.findById(id).get();
    }
}
