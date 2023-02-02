package com.abcc.mydatagwtestdriver.api.common.recv.repository;

import com.abcc.mydatagwtestdriver.api.common.recv.models.RecvHistBaseSearch;
import com.abcc.mydatagwtestdriver.api.common.recv.models.entity.RecvHistBaseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RecvHistBaseMapper{
    int insertRecvHistBase(RecvHistBaseEntity dom);

    int updateRecvHistBase(RecvHistBaseEntity dom);

    int deleteRecvHistBase(RecvHistBaseEntity dom);

    RecvHistBaseEntity selectRecvHistBase(RecvHistBaseSearch dom);

    Long selectRecvHistBaseListTotalCnt(RecvHistBaseSearch dom);

    List<RecvHistBaseEntity> selectRecvHistBaseList(RecvHistBaseSearch dom);
}
