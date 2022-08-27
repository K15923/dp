package com.dp.structural.decorator.old.parkfee.pay;

import java.math.BigDecimal;

/**
 * @author k 2022/8/22 20:55
 */
public class CoinPayItem extends AbstractPayItem {

    private String source;

    public CoinPayItem(BigDecimal money) {
        super(money, PayType.COIN, PayGroup.VIRTUAL_PROPERTY);
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }
}

