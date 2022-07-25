package cn.liuxn.api;

import lombok.Data;

/**
 * 用户
 *
 * @author liuxn
 * @date 2022/7/25
 */
public interface UserApi {


    @r
    User getUser();


    @Data
    class User {
        private Long id;

        private String name;

        private String username;

        private String password;

    }

}
