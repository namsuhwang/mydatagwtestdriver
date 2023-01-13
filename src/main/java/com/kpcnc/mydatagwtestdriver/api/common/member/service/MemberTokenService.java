package com.kpcnc.mydatagwtestdriver.api.common.member.service;

import com.kpcnc.mydatagwtestdriver.api.common.member.models.member.MemberTokenSearch;
import com.kpcnc.mydatagwtestdriver.api.common.member.models.member.entity.MemberTokenEntity;
import com.kpcnc.mydatagwtestdriver.api.common.member.models.member.form.MemberTokenForm;
import com.kpcnc.mydatagwtestdriver.common.models.dto.ResultListDto;

import java.util.List;

public interface MemberTokenService{
    public MemberTokenEntity regMemberToken(MemberTokenForm dom);

    public MemberTokenEntity modMemberToken(MemberTokenForm dom);

    public void  delMemberToken(MemberTokenForm dom);

    public MemberTokenEntity getMemberToken(MemberTokenSearch dom);

    public ResultListDto<MemberTokenEntity> getMemberTokenList(MemberTokenSearch dom);
}
