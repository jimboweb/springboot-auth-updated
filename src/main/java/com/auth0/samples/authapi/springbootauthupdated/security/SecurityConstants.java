package com.auth0.samples.authapi.springbootauthupdated.security;

public class SecurityConstants {
    public static final String SECRET="MySecretKey";
    public static final long EXPIRATION_TIME=864_000_000;
    public static final String TOKEN_PREFIX="Bearer";
    public static final String HEADER_STRING="Authorization";
    public static final String SIGN_UP_URL="/users/sign-up";
}
