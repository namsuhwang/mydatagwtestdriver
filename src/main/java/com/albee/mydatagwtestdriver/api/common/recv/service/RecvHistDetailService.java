package com.albee.mydatagwtestdriver.api.common.recv.service;

import com.albee.mydatagwtestdriver.api.common.recv.models.RecvHistDetailSearch;
import com.albee.mydatagwtestdriver.api.common.recv.models.entity.RecvHistDetailEntity;
import com.albee.mydatagwtestdriver.api.common.recv.models.form.RecvHistDetailForm;
import com.albee.mydatagwtestdriver.common.models.dto.ResultListDto;

public interface RecvHistDetailService{
    public RecvHistDetailEntity regRecvHistDetail(RecvHistDetailForm dom);

    public RecvHistDetailEntity modRecvHistDetail(RecvHistDetailForm dom);

    public void  delRecvHistDetail(RecvHistDetailForm dom);

    public RecvHistDetailEntity getRecvHistDetail(RecvHistDetailSearch dom);

    public ResultListDto<RecvHistDetailEntity> getRecvHistDetailList(RecvHistDetailSearch dom);
}
