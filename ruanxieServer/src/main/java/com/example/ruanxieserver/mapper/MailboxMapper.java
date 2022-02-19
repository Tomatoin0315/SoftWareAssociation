package com.example.ruanxieserver.mapper;

import com.example.ruanxieserver.pojo.Mailbox;
import com.example.ruanxieserver.pojo.Sign;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MailboxMapper {
    //存储邮件
    public void saveMailbox(Mailbox mailbox);
    //查询全部邮件
    public List<Mailbox> queryAllMailbox();
}
