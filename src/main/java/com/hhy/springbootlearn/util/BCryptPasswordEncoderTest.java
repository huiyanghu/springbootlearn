package com.hhy.springbootlearn.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by yangyibo on 17/3/2.
 */
public class BCryptPasswordEncoderTest {
    public static void main(String[] args) {

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("abel"));//$2a$10$Ws5Wt2H8YW9VUU/XbmkSkOKxhP.wXl53Vkt5eSw0ENXi5dZ8XlnXC
        System.out.println(encoder.encode("admin"));//$2a$10$YKetH9yg0Ta4YZoW/UqAkO8ILMF5YZnN39R2jR4FddPS/ZLFXrX1q


    }
}
