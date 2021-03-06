package edu.nf.ch07.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangl
 * @date 2020/11/11
 */
@Data
public class Users {
    private Integer uid;
    private String userName;
    private Integer age;
    private String tel;

    public Users(String userName, Integer age, String tel) {
        this.userName = userName;
        this.age = age;
        this.tel = tel;
    }

    public Users() {
    }
}
