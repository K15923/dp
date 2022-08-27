package com.dp.structural.decorator.old.parkfee.pay;

import com.dp.structural.decorator.old.parkfee.fee.BaseEnum;

import java.util.Optional;

/**
 * @author k 2022/8/22 20:53
 */
public enum PayGroup implements BaseEnum<PayGroup> {
    THIRD_PAY(1, "三方支付"),
    PLATFORM_PAY(2, "平台支付"),
    VIRTUAL_PROPERTY(3, "虚拟资产"),
    BANK(4, "银行卡支付"),
    COUPON(4, "优惠劵");

    private Integer code;
    private String name;

    private PayGroup(Integer code, String name) {
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

    public static Optional<PayGroup> of(Integer code) {
        return Optional.ofNullable(BaseEnum.parseByCode(PayGroup.class, code));
    }
}
