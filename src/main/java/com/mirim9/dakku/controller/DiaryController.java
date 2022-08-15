package com.mirim9.dakku.controller;

import com.mirim9.dakku.service.DiaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/diaries")
@RequiredArgsConstructor
public class DiaryController {
    private final DiaryService diaryService;
}
