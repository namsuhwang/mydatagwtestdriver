package com.albee.mydatagwtestdriver.api.common.member.service.impl;

import com.albee.mydatagwtestdriver.api.common.member.models.member.form.MemberForm;
import com.albee.mydatagwtestdriver.api.common.member.repository.MemberMapper;
import com.albee.mydatagwtestdriver.api.common.member.service.MemberService;
import com.albee.mydatagwtestdriver.common.exception.MyDataGwTestDriverException;
import com.albee.mydatagwtestdriver.common.models.ErrorCode;
import com.albee.mydatagwtestdriver.common.models.dto.ResultListDto;
import com.albee.mydatagwtestdriver.api.common.member.models.member.entity.MemberEntity;
import com.albee.mydatagwtestdriver.api.common.member.models.member.MemberSearch;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
@Transactional
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberMapper memberMapper;

    @Override
    public MemberEntity regMember(MemberForm dom) {
        MemberEntity inputEntity = dom.getEntity();
        inputEntity.setMemberId(memberMapper.createMemberId());
        memberMapper.insertMember(inputEntity);

        return memberMapper.selectMember(inputEntity.getMemberId());
    }

    @Override
    public MemberEntity modMember(MemberForm dom) {
        MemberEntity inputEntity = dom.getEntity();
        inputEntity.setMemberId(dom.getMemberId());
        memberMapper.updateMember(inputEntity);

        return memberMapper.selectMember(inputEntity.getMemberId());
    }

    @Override
    public MemberEntity getMember(String memberId) {
        MemberEntity memberEntity = memberMapper.selectMember(memberId);
        if(memberEntity == null) {
            throw new MyDataGwTestDriverException(ErrorCode.MYDATA_ERROR_1001, "Not Exist Member");
        }
        return memberEntity;
    }

    @Override
    public ResultListDto<MemberEntity> getMemberList(MemberSearch dom) {

        ResultListDto<MemberEntity> result = new ResultListDto<>();
        Long totalCnt = memberMapper.selectMemberListTotalCnt(dom);
        result.setTotalCnt(totalCnt != null ? totalCnt : 0L);
        if(result.getTotalCnt() > 0){
            List<MemberEntity> list = memberMapper.selectMemberList(dom);
            result.setList(list);
            result.setPageCnt(list != null && list.size() > 0 ? list.size() : 0);
        }

        return result;
    }
}
