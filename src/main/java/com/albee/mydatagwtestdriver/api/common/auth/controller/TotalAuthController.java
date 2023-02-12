package com.albee.mydatagwtestdriver.api.common.auth.controller;

import com.albee.mydatagwtestdriver.api.common.auth.models.dto.TotalAuthRequest;
import com.albee.mydatagwtestdriver.api.common.auth.models.dto.TotalAuthResponse;
import com.albee.mydatagwtestdriver.common.CommUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.HashMap;

@Slf4j
@RestController
@EnableWebMvc
@RequiredArgsConstructor
@RequestMapping(value = "/common", produces="application/json;charset=UTF-8")
public class TotalAuthController {

    /*
        통합인증-002
        마이데이터사업자는 고객이 선택한 정보제공자를 대상으로 통합인증을 요청(전자서명 전송)
        • 마이데이터 서버는 1개 이상의 정보제공자에게 해당 기관을 대상으로 하는 전자서명을 각각 전송
        • 요청메시지 내 auth_type, consent_type 항목 설정 방식
            - 공동인증서(인증서 본인확인) 기반 통합인증 : auth_type : 0, consent_type : 0
            - 사설인증서(전자서명인증사업자) 기반 통합인증 : auth_type : 1, consent_type : 1
     */
    @PostMapping("/total-auth-002")
    public ResponseEntity<TotalAuthResponse> totalAuth002(
        @RequestBody TotalAuthRequest dom
    ){
        String scopeList = CommUtil.getStringScopeList(CommUtil.getScopeList(dom.getConsent()));

        TotalAuthResponse res = new TotalAuthResponse();
        res.setXApiTranId("111111111");
        res.setTxId(dom.getTxId());
        res.setTokenType("Bearer");
        res.setAccessToken("ACCESS-TOKEN_0000001");
        res.setExpiresIn(31536000L);
        res.setRefreshToken("REFRESH-TOKEN_0000001");
        res.setRefreshTokenExpiresIn(31536000L);
        res.setScope(scopeList);
        return ResponseEntity.ok().body(res);
    }

}
