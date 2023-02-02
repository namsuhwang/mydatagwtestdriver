package com.albee.mydatagwtestdriver.api.common.api.service;

import com.albee.mydatagwtestdriver.api.common.api.models.ApiMstSearch;
import com.albee.mydatagwtestdriver.api.common.api.models.entity.ApiMstEntity;
import com.albee.mydatagwtestdriver.api.common.api.models.form.ApiMstForm;
import com.albee.mydatagwtestdriver.common.models.dto.ResultListDto;

public interface ApiMstService{
    public ApiMstEntity regApiMst(ApiMstForm dom);

    public ApiMstEntity modApiMst(ApiMstForm dom);

    public void  delApiMst(ApiMstForm dom);

    public ApiMstEntity getApiMst(ApiMstSearch dom);

    public ResultListDto<ApiMstEntity> getApiMstList(ApiMstSearch dom);
}
