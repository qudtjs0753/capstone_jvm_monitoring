package com.capstone.application.controller;

import com.capstone.application.controller.dto.MemberRequest;
import com.capstone.application.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/members")
public class MemberController {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final MemberService memberService;
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody MemberRequest request) {
        memberService.save(request);
    }

    @PostMapping("/error")
    public void getErrorMessage() {
        try{
            throw new Exception("Error");
        }catch(Exception e) {
            logger.error("ErrorMessage", e);
        }
    }
}
