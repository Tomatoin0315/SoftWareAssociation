package com.example.ruanxieserver.service;

import com.example.ruanxieserver.pojo.Mailbox;

import java.util.List;

public interface MailboxService {
    //存储邮件
    public void saveMailbox(Mailbox mailbox);
    //查询全部邮件
    public List<Mailbox> queryAllMailbox();
}
