package com.albee.mydatagwtestdriver.api.common.recv.controller;

import com.albee.mydatagwtestdriver.api.common.recv.models.RecvHistBaseSearch;
import com.albee.mydatagwtestdriver.api.common.recv.models.entity.RecvHistBaseEntity;
import com.albee.mydatagwtestdriver.api.common.recv.models.form.RecvHistBaseForm;
import com.albee.mydatagwtestdriver.api.common.recv.service.RecvHistBaseService;
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
@RequestMapping(value = "/recvHistBase", produces="application/json;charset=UTF-8")
public class RecvHistBaseController {
    @Autowired
    RecvHistBaseService recvHistBaseService;

    @PostMapping("/reg")
    public ResponseEntity<ResponseDto<RecvHistBaseEntity>> regRecvHistBase(
        @RequestBody RecvHistBaseForm dom
    ){
        RecvHistBaseEntity result = recvHistBaseService.regRecvHistBase(dom);
        return ResponseEntity.ok().body(new ResponseDto<>("0000", "SUCCESS", result));
    }

    @PostMapping("/mod")
    public ResponseEntity<ResponseDto<RecvHistBaseEntity>> modRecvHistBase(
        @RequestBody RecvHistBaseForm dom
    ){
        RecvHistBaseEntity result = recvHistBaseService.modRecvHistBase(dom);
        return ResponseEntity.ok().body(new ResponseDto<>("0000", "SUCCESS", result));
    }

    @PostMapping("")
    public ResponseEntity<ResponseDto<RecvHistBaseEntity>> getRecvHistBase(
        @RequestBody RecvHistBaseSearch dom
    ){
        RecvHistBaseEntity result = recvHistBaseService.getRecvHistBase(dom);
        return ResponseEntity.ok().body(new ResponseDto<>("0000", "SUCCESS", result));
    }

    @PostMapping("/list")
    public ResponseEntity<ResponseDto<ResultListDto<RecvHistBaseEntity>>> getRecvHistBaseList(
        @RequestBody RecvHistBaseSearch dom
    ){
        ResultListDto<RecvHistBaseEntity> resultList = recvHistBaseService.getRecvHistBaseList(dom);
        return ResponseEntity.ok().body(new ResponseDto<>("0000", "SUCCESS", resultList));
    }

}
