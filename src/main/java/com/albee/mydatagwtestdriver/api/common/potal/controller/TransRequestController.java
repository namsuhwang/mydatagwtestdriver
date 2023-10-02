package com.albee.mydatagwtestdriver.api.common.potal.controller;

import com.albee.mydatagwtestdriver.api.common.potal.dto.TransRequestProcResult;
import com.albee.mydatagwtestdriver.common.models.ResRootDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
@RequestMapping(value = "/potal", produces="application/json;charset=UTF-8")
public class TransRequestController {

    /*
        전송요구-003
        정보수신가, 종합포털, 거점기관
        마이데이터사업자로부터 전송요구등록/수정 또는 전송요구철회 처리 결과를 수신
     */
    @PostMapping("/trans-request-003")
    public ResponseEntity<ResRootDto> trans003(
        @RequestBody TransRequestProcResult dom
    ){
        ResRootDto result = new ResRootDto();
        result.setXApiTranId(dom.getXApiTranId());
        result.setRspCode("00000");
        result.setRspMsg("성공");
        return ResponseEntity.ok().body(result);
    }

}
