package com.abcc.mydatagwtestdriver.api.common.recv.service;

import com.abcc.mydatagwtestdriver.api.common.recv.models.RecvHistDetailSearch;
import com.abcc.mydatagwtestdriver.api.common.recv.models.entity.RecvHistDetailEntity;
import com.abcc.mydatagwtestdriver.api.common.recv.models.form.RecvHistDetailForm;
import com.abcc.mydatagwtestdriver.common.models.dto.ResultListDto;

public interface RecvHistDetailService{
    public RecvHistDetailEntity regRecvHistDetail(RecvHistDetailForm dom);

    public RecvHistDetailEntity modRecvHistDetail(RecvHistDetailForm dom);

    public void  delRecvHistDetail(RecvHistDetailForm dom);

    public RecvHistDetailEntity getRecvHistDetail(RecvHistDetailSearch dom);

    public ResultListDto<RecvHistDetailEntity> getRecvHistDetailList(RecvHistDetailSearch dom);
}
