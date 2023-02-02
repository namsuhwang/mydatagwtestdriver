package com.albee.mydatagwtestdriver.api.common.org.service;

import com.albee.mydatagwtestdriver.api.common.org.models.OrgMstSearch;
import com.albee.mydatagwtestdriver.api.common.org.models.entity.OrgMstEntity;
import com.albee.mydatagwtestdriver.api.common.org.models.form.OrgMstForm;
import com.albee.mydatagwtestdriver.common.models.dto.ResultListDto;

public interface OrgMstService{
    public OrgMstEntity regOrgMst(OrgMstForm dom);

    public OrgMstEntity modOrgMst(OrgMstForm dom);

    public void  delOrgMst(OrgMstForm dom);

    public OrgMstEntity getOrgMst(OrgMstSearch dom);

    public ResultListDto<OrgMstEntity> getOrgMstList(OrgMstSearch dom);
}
