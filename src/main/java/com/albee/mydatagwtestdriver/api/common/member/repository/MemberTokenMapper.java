package com.albee.mydatagwtestdriver.api.common.member.repository;

import com.albee.mydatagwtestdriver.api.common.member.models.member.MemberTokenSearch;
import com.albee.mydatagwtestdriver.api.common.member.models.member.entity.MemberTokenEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MemberTokenMapper{
    int insertMemberToken(MemberTokenEntity dom);

    int updateMemberToken(MemberTokenEntity dom);

    int deleteMemberToken(MemberTokenEntity dom);

    MemberTokenEntity selectMemberToken(MemberTokenSearch dom);

    Long selectMemberTokenListTotalCnt(MemberTokenSearch dom);

    List<MemberTokenEntity> selectMemberTokenList(MemberTokenSearch dom);
}
