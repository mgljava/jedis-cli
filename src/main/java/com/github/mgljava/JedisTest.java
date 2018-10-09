package com.github.mgljava;

import redis.clients.jedis.Jedis;

/**
 *
 */
public class JedisTest {
  public static void main(String[] args) {
    Jedis jedis = new Jedis("120.78.144.147", 6379);
    System.out.println(jedis.exists("name"));
    jedis.set("name", "zhangsan");
    System.out.println(jedis.get("name"));
    jedis.select(1);
    System.out.println(jedis.hget("myhash", "file1"));

  }
}
