package com.hw.businessserviceuser.mysql;

import org.hibernate.dialect.MySQL5Dialect;

/**
 * @Description TODO
 * @Author hw
 * @Date 2019/2/26 16:36
 * @Version 1.0
 */
public class MySQLDialectUTF8 extends MySQL5Dialect {
    @Override
    public String getTableTypeString() {
        return " ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}
