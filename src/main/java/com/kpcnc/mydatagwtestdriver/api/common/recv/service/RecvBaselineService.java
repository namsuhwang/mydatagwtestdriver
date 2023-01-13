package com.kpcnc.mydatagwtestdriver.api.common.recv.service;

import com.kpcnc.mydatagwtestdriver.api.common.recv.models.RecvBaselineSearch;
import com.kpcnc.mydatagwtestdriver.api.common.recv.models.entity.RecvBaselineEntity;
import com.kpcnc.mydatagwtestdriver.api.common.recv.models.form.RecvBaselineForm;
import com.kpcnc.mydatagwtestdriver.common.models.dto.ResultListDto;


public interface RecvBaselineService{
    public RecvBaselineEntity regRecvBaseline(RecvBaselineForm dom);

    public RecvBaselineEntity modRecvBaseline(RecvBaselineForm dom);

    public void  delRecvBaseline(RecvBaselineForm dom);

    public RecvBaselineEntity getRecvBaseline(RecvBaselineSearch dom);

    public ResultListDto<RecvBaselineEntity> getRecvBaselineList(RecvBaselineSearch dom);
}
