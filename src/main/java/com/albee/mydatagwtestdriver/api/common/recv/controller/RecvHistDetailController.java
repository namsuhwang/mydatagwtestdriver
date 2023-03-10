package com.albee.mydatagwtestdriver.api.common.recv.controller;

import com.albee.mydatagwtestdriver.api.common.recv.models.RecvHistDetailSearch;
import com.albee.mydatagwtestdriver.api.common.recv.models.entity.RecvHistDetailEntity;
import com.albee.mydatagwtestdriver.api.common.recv.models.form.RecvHistDetailForm;
import com.albee.mydatagwtestdriver.api.common.recv.service.RecvHistDetailService;
import com.albee.mydatagwtestdriver.common.models.dto.ResponseDto;
import com.albee.mydatagwtestdriver.common.models.dto.ResultListDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Slf4j
@RestController
@EnableWebMvc
@RequiredArgsConstructor
@RequestMapping(value = "/recvHistDetail", produces="application/json;charset=UTF-8")
public class RecvHistDetailController {
    @Autowired
    RecvHistDetailService recvHistDetailService;

    @PostMapping("/reg")
    public ResponseEntity<ResponseDto<RecvHistDetailEntity>> regRecvHistDetail(
        @RequestBody RecvHistDetailForm dom
    ){
        RecvHistDetailEntity result = recvHistDetailService.regRecvHistDetail(dom);
        return ResponseEntity.ok().body(new ResponseDto<>("0000", "SUCCESS", result));
    }

    @PostMapping("/mod")
    public ResponseEntity<ResponseDto<RecvHistDetailEntity>> modRecvHistDetail(
        @RequestBody RecvHistDetailForm dom
    ){
        RecvHistDetailEntity result = recvHistDetailService.modRecvHistDetail(dom);
        return ResponseEntity.ok().body(new ResponseDto<>("0000", "SUCCESS", result));
    }

    @PostMapping("")
    public ResponseEntity<ResponseDto<RecvHistDetailEntity>> getRecvHistDetail(
        @RequestBody RecvHistDetailSearch dom
    ){
        RecvHistDetailEntity result = recvHistDetailService.getRecvHistDetail(dom);
        return ResponseEntity.ok().body(new ResponseDto<>("0000", "SUCCESS", result));
    }

    @PostMapping("/list")
    public ResponseEntity<ResponseDto<ResultListDto<RecvHistDetailEntity>>> getRecvHistDetailList(
        @RequestBody RecvHistDetailSearch dom
    ){
        ResultListDto<RecvHistDetailEntity> resultList = recvHistDetailService.getRecvHistDetailList(dom);
        return ResponseEntity.ok().body(new ResponseDto<>("0000", "SUCCESS", resultList));
    }

}
