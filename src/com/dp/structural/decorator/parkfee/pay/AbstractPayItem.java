package com.dp.structural.decorator.parkfee.pay;

import java.math.BigDecimal;

/**
 * @author k 2022/8/22 20:55
 */
public abstract class AbstractPayItem implements PayItem {
    private BigDecimal money;
    private PayType payType;
    private PayGroup payGroup;

    public AbstractPayItem(BigDecimal money, PayType payType, PayGroup payGroup) {
        this.money = money;
        this.payType = payType;
        this.payGroup = payGroup;
    }

    public BigDecimal getMoney() {
        return this.money;
    }

    public PayGroup getPayGroup() {
        return this.payGroup;
    }

    public PayType getPayType() {
        return this.payType;
    }
}
