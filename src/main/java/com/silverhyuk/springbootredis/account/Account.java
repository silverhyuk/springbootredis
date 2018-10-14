package com.silverhyuk.springbootredis.account;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;


@Getter
@Setter
@ToString
@EqualsAndHashCode
@RedisHash("accounts")
public class Account {
    @Id
    private String id;
    private String username;
    private String email;
}
