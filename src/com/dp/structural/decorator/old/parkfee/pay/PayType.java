package com.dp.structural.decorator.old.parkfee.pay;

import com.dp.structural.decorator.old.parkfee.fee.BaseEnum;

import java.util.Optional;

/**
 * @author k 2022/8/22 20:54
 */
public enum PayType implements BaseEnum<PayType> {
    WECHAT(1, "微信支付"),
    ALIPAY(2, "支付宝"),
    COIN(3, "虚拟币"),
    ACTIVITY(4, "活动");

    private Integer code;
    private String name;

    private PayType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public static Optional<PayType> of(Integer code) {
        return Optional.ofNullable(BaseEnum.parseByCode(PayType.class, code));
    }
}
