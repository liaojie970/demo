package com.example.demo.config;

import lombok.Data;

/**
 * @Author：v
 * @Description：授权配置
 * @Date: 2018/8/3
 * @Modified By:
 */
@Data
public class AuthProperties {
    private static final Integer DEFAULT_EXPIRE = 14400;

    /**
     * 授权服务ID
     *
     * @Author LJ
     */
    private String serviceId;

    /**
     * 服务认证配置类
     *
     * @Author LJ
     */
    private AuthProperties.ClientProperties client;

    /**
     * 用户认证配置类
     *
     * @Author LJ
     */
    private AuthProperties.UserProperties user;

    @Data
    public class ClientProperties {
        /**
         * 客户端-服务ID
         *
         * @Author LJ
         */
        private String id = "${spring.application.name}";
        /**
         * 客户端-服务密钥
         *
         * @Author LJ
         */
        private String secret;
        /**
         * 服务请求头
         *
         * @Author LJ
         */
        private String tokenHeader = "x-client-token";

        /**
         * 客户端token过期时间--单位秒
         *
         * @Author LJ
         */
        private int expire = DEFAULT_EXPIRE;

        /**
         * 客户端RSA密码
         *
         * @Author LJ
         */
        private String rsaSecret;
        /**
         * 服务认证公钥
         *
         * @Author LJ
         */
        private byte[] publicKey;
        /**
         * 服务认证私钥
         *
         * @Author LJ
         */
        private byte[] privateKey;

    }

    @Data
    public class UserProperties {
        /**
         * 用户token请求头
         *
         * @Author LJ
         */
        private String tokenHeader = "Authorization";

        /**
         * 用户RSA密码
         *
         * @Author LJ
         */
        private String rsaSecret;

        /**
         * 客户端token过期时间--单位秒
         *
         * @Author LJ
         */
        private int expire = DEFAULT_EXPIRE;

        /**
         * 用户认证公钥
         *
         * @Author LJ
         */
        private byte[] publicKey;
        /**
         * 用户认证私钥
         *
         * @Author LJ
         */
        private byte[] privateKey;
    }
}
