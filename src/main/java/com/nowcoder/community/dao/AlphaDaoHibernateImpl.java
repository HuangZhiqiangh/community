package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by hzq on 2022/4/2.
 *
 * @Description:
 */
@Repository("alphaDaoHibernateImpl")
public class AlphaDaoHibernateImpl implements AlphaDao {
    @Override
    public String select() {
        return "Hibernate";
    }
}
