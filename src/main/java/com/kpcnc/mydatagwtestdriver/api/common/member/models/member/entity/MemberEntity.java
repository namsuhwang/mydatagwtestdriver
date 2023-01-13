package com.kpcnc.mydatagwtestdriver.api.common.member.models.member.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MemberEntity {
    private Long rowNum;
    private String memberId;
    private String ci;
    private String memberRn;
    private String memberPwd;
    private String memberName;
    private String memberStatus;
    private String joinDt;
    private String leaveDt;
    private String lastContactDt;
    private String regUserId;
    private String regDt;
    private String chgUserId;
    private String chgDt;
}
