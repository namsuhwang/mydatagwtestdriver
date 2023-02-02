package com.abcc.mydatagwtestdriver.api.common.org.service;

import com.abcc.mydatagwtestdriver.api.common.org.models.OrgMstSearch;
import com.abcc.mydatagwtestdriver.api.common.org.models.entity.OrgMstEntity;
import com.abcc.mydatagwtestdriver.api.common.org.models.form.OrgMstForm;
import com.abcc.mydatagwtestdriver.common.models.dto.ResultListDto;

public interface OrgMstService{
    public OrgMstEntity regOrgMst(OrgMstForm dom);

    public OrgMstEntity modOrgMst(OrgMstForm dom);

    public void  delOrgMst(OrgMstForm dom);

    public OrgMstEntity getOrgMst(OrgMstSearch dom);

    public ResultListDto<OrgMstEntity> getOrgMstList(OrgMstSearch dom);
}
