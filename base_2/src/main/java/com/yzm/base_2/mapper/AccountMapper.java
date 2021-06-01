package com.yzm.base_2.mapper;

import com.yzm.base_2.entity.Account;
import com.yzm.base_2.entity.vo.AccountVo;
import com.yzm.base_2.mapper.base.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountMapper extends BaseMapper<Account, AccountVo> {
}
