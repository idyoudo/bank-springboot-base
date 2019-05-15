package com.icangjinge.bank.springboot.base;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.icangjinge.bank.springboot.base.entity.Account;
import com.icangjinge.bank.springboot.base.model.AccountModel;
import com.icangjinge.bank.springboot.base.persistence.AccountMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MybatisApplicationTest {
    @Autowired
    private AccountMapper accountMapper;

    /**
     *
     * @throws Exception
     */
    @Before
    public void init() throws Exception {
        accountMapper.deleteAll();
    }

    /**
     * 简单增删查操作
     * @throws Exception
     */
    @Test
    public void saveTest() throws Exception {
        String acno = UUID.randomUUID().toString().replace("-","");
        Account record = new Account();
        record.setAcno(acno);
        record.setAcname("藏金阁");
        record.setCreatetime(new Date());
        record.setIdno("421123199007221760");
        record.setStatus("00");
        record.setUpdatetime(new Date());
        accountMapper.insert(record);
        Account recordDB = accountMapper.selectByPrimaryKey(acno);
        Assert.assertEquals(recordDB.getAcno(),record.getAcno());
        accountMapper.deleteByPrimaryKey(acno);
    }

    /**
     * 分页查询测试
     * @throws Exception
     */
    @Test
    public void pageTest() throws Exception {
        //模拟10条数据
        for(int i = 0;i<10;i++){
            String acno = UUID.randomUUID().toString().replace("-","");
            Account record = new Account();
            record.setAcno(acno);
            record.setAcname("藏金阁");
            record.setCreatetime(new Date());
            record.setIdno("421123199007221760");
            record.setStatus("00");
            record.setUpdatetime(new Date());
            accountMapper.insert(record);
        }
        //设置查询条件
        AccountModel accountModel = new AccountModel();
        accountModel.setBeginNum(1);
        accountModel.setPageSize(5);
        accountModel.setStatus("00");
        PageHelper.startPage(accountModel.beginNum, accountModel.pageSize);

        List<Account> accountList = accountMapper.selectAccountListByCondition(accountModel);
        PageInfo<Account> pageInfo = new PageInfo<>(accountList);
        Assert.assertEquals(pageInfo.getList().size(),5);
        Assert.assertEquals(accountList.size(),5);
    }

}