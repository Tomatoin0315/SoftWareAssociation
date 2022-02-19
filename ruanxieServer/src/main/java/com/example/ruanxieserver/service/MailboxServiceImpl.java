package com.example.ruanxieserver.service;

import com.example.ruanxieserver.mapper.MailboxMapper;
import com.example.ruanxieserver.pojo.Mailbox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailboxServiceImpl implements MailboxService{

    @Autowired
    private MailboxMapper mailboxMapper;

    @Override
    public void saveMailbox(Mailbox mailbox) {
        mailboxMapper.saveMailbox(mailbox);
    }

    @Override
    public List<Mailbox> queryAllMailbox() {
        return mailboxMapper.queryAllMailbox();
    }
}
