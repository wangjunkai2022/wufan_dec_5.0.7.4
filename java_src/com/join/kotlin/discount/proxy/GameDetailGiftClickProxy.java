package com.join.kotlin.discount.proxy;

import com.join.kotlin.discount.model.bean.GiftItemBean;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailGiftClickProxy.kt */
/* loaded from: classes3.dex */
public interface GameDetailGiftClickProxy {
    void goGiftDetail(@Nullable GiftItemBean giftItemBean);

    void onBackClick();

    void receiveGift(@Nullable GiftItemBean giftItemBean);
}
