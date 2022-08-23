package com.dp.structural.decorator.parkfee.fee;

import com.dp.structural.decorator.parkfee.pay.PayItem;

import java.util.List;
import java.util.Map;

/**
 * @author k 2022/8/22 20:26
 */
public interface FeeCalculate<o> {

    Map<FeeItemType, List<PayItem>> payItemList(List<FeeItem<o>> var1);


}
