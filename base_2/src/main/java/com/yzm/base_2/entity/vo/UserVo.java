package com.yzm.base_2.entity.vo;

import com.yzm.base_2.entity.base.BaseVo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;

@Data
@Alias("userVo")
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class UserVo extends BaseVo {
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
