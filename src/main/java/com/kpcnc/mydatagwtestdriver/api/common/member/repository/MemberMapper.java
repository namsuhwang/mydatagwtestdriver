package com.kpcnc.mydatagwtestdriver.api.common.member.repository;

import com.kpcnc.mydatagwtestdriver.api.common.member.models.member.MemberSearch;
import com.kpcnc.mydatagwtestdriver.api.common.member.models.member.entity.MemberEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MemberMapper {

    String createMemberId();

    int insertMember(MemberEntity dom);

    int updateMember(MemberEntity dom);


    Long selectMemberListTotalCnt(MemberSearch dom);

    List<MemberEntity> selectMemberList(MemberSearch dom);

    MemberEntity selectMember(String memberId);


}
