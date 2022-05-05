package com.livenow.slf4jlogbacklab.controller;

import com.livenow.slf4jlogbacklab.controller.dto.MemberRequest;
import com.livenow.slf4jlogbacklab.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api/v1/members")
public class MemberController {
    private final Logger log = Logger.getGlobal();
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
        log.severe("Error log");
    }
}
