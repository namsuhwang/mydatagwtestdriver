package com.albee.mydatagwtestdriver.api.common.recv.service;

import com.albee.mydatagwtestdriver.api.common.recv.models.RecvHistBaseSearch;
import com.albee.mydatagwtestdriver.api.common.recv.models.entity.RecvHistBaseEntity;
import com.albee.mydatagwtestdriver.api.common.recv.models.form.RecvHistBaseForm;
import com.albee.mydatagwtestdriver.common.models.dto.ResultListDto;

public interface RecvHistBaseService{
    public RecvHistBaseEntity regRecvHistBase(RecvHistBaseForm dom);

    public RecvHistBaseEntity modRecvHistBase(RecvHistBaseForm dom);

    public void  delRecvHistBase(RecvHistBaseForm dom);

    public RecvHistBaseEntity getRecvHistBase(RecvHistBaseSearch dom);

    public ResultListDto<RecvHistBaseEntity> getRecvHistBaseList(RecvHistBaseSearch dom);
}
