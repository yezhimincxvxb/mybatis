package com.yzm.base_2.service.impl;

import com.yzm.base_2.entity.Account;
import com.yzm.base_2.entity.vo.AccountVo;
import com.yzm.base_2.mapper.AccountMapper;
import com.yzm.base_2.service.AccountService;
import com.yzm.base_2.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl extends BaseServiceImpl<Account, AccountVo> implements AccountService {

    private AccountMapper accountMapper = null;

    @Autowired
    private void setAccountMapper(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
        super.setMapper(accountMapper);
    }

}
