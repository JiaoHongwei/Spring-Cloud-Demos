package com.hw.businessserviceuser.domain;

import com.hw.businessserviceuser.enumration.StatusEnum;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description 用户实体类
 * @Author hw
 * @Date 2019/2/26 16:09
 * @Version 1.0
 */
@Entity
@Getter
@Setter
@Table(name = "business_user")
@EntityListeners(AuditingEntityListener.class)
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String salt;
    private String sex;
    private String phone;
    private String email;
    private String remark;
    private Byte status = StatusEnum.OK.getCode();
    @CreatedDate
    private Date createDate;
    @LastModifiedDate
    private Date updateDate;
}
