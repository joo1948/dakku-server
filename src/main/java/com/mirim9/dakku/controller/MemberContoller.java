package com.mirim9.dakku.controller;

import com.mirim9.dakku.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/members")
@RequiredArgsConstructor
public class MemberContoller {

    private final MemberService memberService;

}
