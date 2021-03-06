package com.nowcoder.community.util;

import com.nowcoder.community.entity.User;
import org.springframework.stereotype.Component;


/**
 * 持有用户对象，用于代替session对象
 */
@Component
public class HostHolder {
    // 线程隔离
    private ThreadLocal<User> users = new ThreadLocal<User>();

    public void setUsers(User user) {
        users.set(user);
    }

    public User getUser() {
        return users.get();
    }
    public void clear() {
        users.remove();
    }
}
