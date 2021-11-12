//package com.example.springprac01.service;
//
//
//import com.example.springprac01.domain.Memo;
//import com.example.springprac01.dto.MemoRequestDto;
//import com.example.springprac01.repository.MemoRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//
//@RequiredArgsConstructor
//@Service
//public class MemoService {
//
//    private final MemoRepository memoRepository;
//
//    @Transactional
//    public Long update(Long id, MemoRequestDto memoRequestDto) {
//        Memo memo = memoRepository.findById(id).orElseThrow(
//                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
//        );
//        memo.update(memoRequestDto);
//        return memo.getId();
//
//    }
//}
