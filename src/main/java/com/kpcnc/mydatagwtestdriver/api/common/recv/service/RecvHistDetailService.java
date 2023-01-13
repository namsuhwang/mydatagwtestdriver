package com.kpcnc.mydatagwtestdriver.api.common.recv.service;

import com.kpcnc.mydatagwtestdriver.api.common.recv.models.RecvHistDetailSearch;
import com.kpcnc.mydatagwtestdriver.api.common.recv.models.entity.RecvHistDetailEntity;
import com.kpcnc.mydatagwtestdriver.api.common.recv.models.form.RecvHistDetailForm;
import com.kpcnc.mydatagwtestdriver.common.models.dto.ResultListDto;

import java.util.List;

public interface RecvHistDetailService{
    public RecvHistDetailEntity regRecvHistDetail(RecvHistDetailForm dom);

    public RecvHistDetailEntity modRecvHistDetail(RecvHistDetailForm dom);

    public void  delRecvHistDetail(RecvHistDetailForm dom);

    public RecvHistDetailEntity getRecvHistDetail(RecvHistDetailSearch dom);

    public ResultListDto<RecvHistDetailEntity> getRecvHistDetailList(RecvHistDetailSearch dom);
}
