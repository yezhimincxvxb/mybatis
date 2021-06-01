package com.yzm.base.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Alias("user")
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class User implements Serializable {
    private static final long serialVersionUID = 2062504472352642553L;
    private Integer id;
    private String username;
    private String realName;
    private String password;
    private String gender;
    private String remark;
    private boolean state;
    private boolean deleted;
    private LocalDateTime updateDate;
    private LocalDateTime createDate;
    private String createDateUnix;
}
