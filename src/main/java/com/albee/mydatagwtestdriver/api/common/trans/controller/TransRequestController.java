package com.albee.mydatagwtestdriver.api.common.trans.controller;

import com.albee.mydatagwtestdriver.api.common.api.models.dto.CallTestParam;
import com.albee.mydatagwtestdriver.api.common.trans.models.dto.TransRequestProcResult;
import com.albee.mydatagwtestdriver.api.common.trans.models.dto.TransRequestWithdraw;
import com.albee.mydatagwtestdriver.common.models.ResRootDto;
import com.albee.mydatagwtestdriver.common.models.dto.ResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@EnableWebMvc
@RequiredArgsConstructor
@RequestMapping(value = "/common", produces="application/json;charset=UTF-8")
public class TransRequestController {

    /*
        전송요구-003
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
