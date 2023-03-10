package com.albee.mydatagwtestdriver.api.common.recv.service.impl;

import com.albee.mydatagwtestdriver.api.common.recv.repository.RecvBaselineMapper;
import com.albee.mydatagwtestdriver.api.common.recv.service.RecvBaselineService;
import com.albee.mydatagwtestdriver.api.common.recv.models.RecvBaselineSearch;
import com.albee.mydatagwtestdriver.api.common.recv.models.entity.RecvBaselineEntity;
import com.albee.mydatagwtestdriver.api.common.recv.models.form.RecvBaselineForm;
import com.albee.mydatagwtestdriver.common.models.dto.ResultListDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
@Transactional
public class RecvBaselineServiceImpl implements RecvBaselineService {
    @Autowired
    RecvBaselineMapper recvBaselineMapper;

    @Override
    public RecvBaselineEntity regRecvBaseline(RecvBaselineForm dom) {
        recvBaselineMapper.insertRecvBaseline(dom.getEntity());
        return recvBaselineMapper.selectRecvBaseline(new RecvBaselineSearch(dom));
    }

    @Override
    public RecvBaselineEntity modRecvBaseline(RecvBaselineForm dom) {
        recvBaselineMapper.updateRecvBaseline(dom.getEntity());
        return recvBaselineMapper.selectRecvBaseline(new RecvBaselineSearch(dom));
    }

    @Override
    public void delRecvBaseline(RecvBaselineForm dom) {
        recvBaselineMapper.deleteRecvBaseline(dom.getEntity());
        return;
    }

    @Override
    public RecvBaselineEntity getRecvBaseline(RecvBaselineSearch dom) {
        return recvBaselineMapper.selectRecvBaseline(dom);
    }

    @Override
    public ResultListDto<RecvBaselineEntity> getRecvBaselineList(RecvBaselineSearch dom) {
        ResultListDto<RecvBaselineEntity> result = new ResultListDto<>();
        Long totalCnt = recvBaselineMapper.selectRecvBaselineListTotalCnt(dom);
        result.setTotalCnt(totalCnt != null ? totalCnt : 0L);
        if(result.getTotalCnt() > 0){
            List<RecvBaselineEntity> list = recvBaselineMapper.selectRecvBaselineList(dom);
            result.setList(list);
            result.setPageCnt(list != null && list.size() > 0 ? list.size() : 0);
        }
        return result;
    }
}
