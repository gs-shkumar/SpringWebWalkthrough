package com.saksham.SpringBootWebWalkthrough.utils;

import com.saksham.SpringBootWebWalkthrough.beans.ThreadDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
    @Autowired
    DaoClass dao;

    public ThreadDao performService() throws InterruptedException {
        String threadName = Thread.currentThread().getName();
        dao = new DaoClass();
        Thread.sleep(3000);
        ThreadDao threadDao = new ThreadDao();
        threadDao.setThreadName(Thread.currentThread().getName());
        threadDao.setDao(dao);
        return threadDao;
    }
}
