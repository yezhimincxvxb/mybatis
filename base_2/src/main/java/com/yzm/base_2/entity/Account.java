package com.yzm.base_2.entity;

import com.yzm.base_2.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.apache.ibatis.type.Alias;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Alias("account")
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class Account extends BaseEntity {
    private static final long serialVersionUID = -2209821905931217493L;
    private Integer id;
    private String userId;
    private String username;
    private String payPassword;
    private BigDecimal totalMoney;
    private BigDecimal availableMoney;
    private BigDecimal frozenMoney;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
