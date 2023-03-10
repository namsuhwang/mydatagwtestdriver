package com.albee.mydatagwtestdriver.api.common.org.repository;

import com.albee.mydatagwtestdriver.api.common.org.models.OrgMstSearch;
import com.albee.mydatagwtestdriver.api.common.org.models.entity.OrgMstEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrgMstMapper{
    int insertOrgMst(OrgMstEntity dom);

    int updateOrgMst(OrgMstEntity dom);

    int deleteOrgMst(OrgMstEntity dom);

    OrgMstEntity selectOrgMst(OrgMstSearch dom);

    Long selectOrgMstListTotalCnt(OrgMstSearch dom);

    List<OrgMstEntity> selectOrgMstList(OrgMstSearch dom);
}
