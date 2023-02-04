package com.albee.mydatagwtestdriver.api.common.api.controller;

import com.albee.mydatagwtestdriver.api.common.api.models.ApiMstSearch;
import com.albee.mydatagwtestdriver.api.common.api.models.dto.CallTestParam;
import com.albee.mydatagwtestdriver.api.common.api.models.entity.ApiMstEntity;
import com.albee.mydatagwtestdriver.api.common.api.models.form.ApiMstForm;
import com.albee.mydatagwtestdriver.api.common.api.service.ApiMstService;
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

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@EnableWebMvc
@RequiredArgsConstructor
@RequestMapping(value = "/test", produces="application/json;charset=UTF-8")
public class TestController {

    @PostMapping("")
    public ResponseEntity<ResponseDto<Map<String, String>>> test(
        @RequestBody CallTestParam dom
    ){
        Map<String, String> result = new HashMap<>();
        result.put("test_result", "OK");
        result.put("msg", dom.getMsg());
        return ResponseEntity.ok().body(new ResponseDto<>("0000", "SUCCESS", result));
    }

}
