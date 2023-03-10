package com.albee.mydatagwtestdriver.api.common.member.service.impl;

import com.albee.mydatagwtestdriver.api.common.member.models.member.form.MemberTokenForm;
import com.albee.mydatagwtestdriver.api.common.member.repository.MemberTokenMapper;
import com.albee.mydatagwtestdriver.api.common.member.service.MemberTokenService;
import com.albee.mydatagwtestdriver.api.common.member.models.member.MemberTokenSearch;
import com.albee.mydatagwtestdriver.api.common.member.models.member.entity.MemberTokenEntity;
import com.albee.mydatagwtestdriver.common.models.dto.ResultListDto;
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
public class MemberTokenServiceImpl implements MemberTokenService {
    @Autowired
    MemberTokenMapper memberTokenMapper;

    @Override
    public MemberTokenEntity regMemberToken(MemberTokenForm dom) {
        memberTokenMapper.insertMemberToken(dom.getEntity());
        return memberTokenMapper.selectMemberToken(new MemberTokenSearch(dom));
    }

    @Override
    public MemberTokenEntity modMemberToken(MemberTokenForm dom) {
        memberTokenMapper.updateMemberToken(dom.getEntity());
        return memberTokenMapper.selectMemberToken(new MemberTokenSearch(dom));
    }

    @Override
    public void delMemberToken(MemberTokenForm dom) {
        memberTokenMapper.deleteMemberToken(dom.getEntity());
        return;
    }

    @Override
    public MemberTokenEntity getMemberToken(MemberTokenSearch dom) {
        return memberTokenMapper.selectMemberToken(dom);
    }

    @Override
    public ResultListDto<MemberTokenEntity> getMemberTokenList(MemberTokenSearch dom) {
        ResultListDto<MemberTokenEntity> result = new ResultListDto<>();
        Long totalCnt = memberTokenMapper.selectMemberTokenListTotalCnt(dom);
        result.setTotalCnt(totalCnt != null ? totalCnt : 0L);
        if(result.getTotalCnt() > 0){
            List<MemberTokenEntity> list = memberTokenMapper.selectMemberTokenList(dom);
            result.setList(list);
            result.setPageCnt(list != null && list.size() > 0 ? list.size() : 0);
        }
        return result;
    }
}
