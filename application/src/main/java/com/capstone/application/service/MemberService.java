package com.capstone.application.service;

import com.capstone.application.domain.MemberRepository;
import com.capstone.application.controller.dto.MemberRequest;
import com.capstone.application.domain.Member;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Transactional
    public void save(MemberRequest memberRequest) {
        Member member = memberRequest.toEntity();
        memberRepository.save(member);
    }
}
