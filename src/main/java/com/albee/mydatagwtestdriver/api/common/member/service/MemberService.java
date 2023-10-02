package com.albee.mydatagwtestdriver.api.common.member.service;


import com.albee.mydatagwtestdriver.api.common.member.models.member.form.MemberForm;
import com.albee.mydatagwtestdriver.api.common.member.models.member.MemberSearch;
import com.albee.mydatagwtestdriver.api.common.member.models.member.entity.MemberEntity;
import com.albee.mydatagwtestdriver.common.models.dto.ResultListDto;

public interface MemberService {
    public MemberEntity regMember(MemberForm dom);

    public MemberEntity modMember(MemberForm dom);

    public MemberEntity getMember(String memberId);

    public ResultListDto<MemberEntity> getMemberList(MemberSearch dom);
}
