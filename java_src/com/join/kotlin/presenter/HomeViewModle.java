package com.join.kotlin.presenter;

import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: HomeViewModle.kt */
/* loaded from: classes3.dex */
public final class HomeViewModle extends ViewModel {
    @NotNull
    private List<String> lists = new ArrayList();

    @NotNull
    public final List<String> getLists() {
        return this.lists;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void initStat(@org.jetbrains.annotations.NotNull android.content.Context r11) {
        /*
            r10 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            byte r0 = com.join.android.app.common.utils.j.d(r11)
            r1 = -1
            java.lang.String r2 = ""
            if (r0 == r1) goto L2f
            r1 = 1
            if (r0 == r1) goto L2b
            r1 = 2
            if (r0 == r1) goto L28
            r1 = 3
            if (r0 == r1) goto L25
            r1 = 4
            if (r0 == r1) goto L22
            r1 = 5
            if (r0 == r1) goto L1f
            r9 = r2
            goto L32
        L1f:
            java.lang.String r0 = "5g"
            goto L31
        L22:
            java.lang.String r0 = "2g"
            goto L31
        L25:
            java.lang.String r0 = "3g"
            goto L31
        L28:
            java.lang.String r0 = "4g"
            goto L31
        L2b:
            java.lang.String r0 = "wifi"
            goto L31
        L2f:
            java.lang.String r0 = "no"
        L31:
            r9 = r0
        L32:
            com.psk.eventmodule.StatFactory$Companion r0 = com.psk.eventmodule.StatFactory.Companion
            com.psk.eventmodule.StatFactory r3 = r0.getInstance(r11)
            java.lang.String r0 = com.MApplication.B
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L41
            goto L43
        L41:
            java.lang.String r2 = com.MApplication.B
        L43:
            r4 = r2
            com.join.mgps.Util.AccountUtil_ r0 = com.join.mgps.Util.AccountUtil_.getInstance_(r11)
            com.wufan.user.service.protobuf.n0 r0 = r0.getAccountData()
            int r0 = r0.getUid()
            long r5 = (long) r0
            com.join.mgps.Util.AccountUtil_ r11 = com.join.mgps.Util.AccountUtil_.getInstance_(r11)
            com.wufan.user.service.protobuf.n0 r11 = r11.getAccountData()
            int r7 = r11.n2()
            java.lang.String r8 = "417_5.0.7.4"
            r3.initDatas(r4, r5, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.presenter.HomeViewModle.initStat(android.content.Context):void");
    }

    public final void setLists(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.lists = list;
    }
}
