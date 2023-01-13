package com.kpcnc.mydatagwtestdriver.api.common.recv.service;

import com.kpcnc.mydatagwtestdriver.api.common.recv.models.RecvHistBaseSearch;
import com.kpcnc.mydatagwtestdriver.api.common.recv.models.entity.RecvHistBaseEntity;
import com.kpcnc.mydatagwtestdriver.api.common.recv.models.form.RecvHistBaseForm;
import com.kpcnc.mydatagwtestdriver.common.models.dto.ResultListDto;

import java.util.List;

public interface RecvHistBaseService{
    public RecvHistBaseEntity regRecvHistBase(RecvHistBaseForm dom);

    public RecvHistBaseEntity modRecvHistBase(RecvHistBaseForm dom);

    public void  delRecvHistBase(RecvHistBaseForm dom);

    public RecvHistBaseEntity getRecvHistBase(RecvHistBaseSearch dom);

    public ResultListDto<RecvHistBaseEntity> getRecvHistBaseList(RecvHistBaseSearch dom);
}
