package com.lms.learn.Entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Entity
@Component
/*@Table(schema = "userinfo")*/
@Data
public class UserInfo {
    //id自增长
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;
    private String jobNumber;
    private Date createTime;
}
