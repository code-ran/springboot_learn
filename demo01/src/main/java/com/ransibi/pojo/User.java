package com.ransibi.pojo;

/**
 * @Author: ransibi
 * @Date: 2024/10/20/21:04
 * @Description:
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
