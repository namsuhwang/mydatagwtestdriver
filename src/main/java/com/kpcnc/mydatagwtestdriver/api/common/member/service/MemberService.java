package com.kpcnc.mydatagwtestdriver.api.common.member.service;


import com.kpcnc.mydatagwtestdriver.api.common.member.models.member.MemberSearch;
import com.kpcnc.mydatagwtestdriver.api.common.member.models.member.entity.MemberEntity;
import com.kpcnc.mydatagwtestdriver.api.common.member.models.member.form.MemberForm;
import com.kpcnc.mydatagwtestdriver.common.models.dto.ResultListDto;

public interface MemberService {
    public MemberEntity regMember(MemberForm dom);

    public MemberEntity modMember(MemberForm dom);

    public MemberEntity getMember(String memberId);

    public ResultListDto<MemberEntity> getMemberList(MemberSearch dom);
}
