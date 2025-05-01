package com.join.kotlin.discount.model.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailBookingInfoBean.kt */
/* loaded from: classes3.dex */
public final class GameDetailBookingInfoBean {
    @Nullable
    private Integer booking_count;
    @Nullable
    private Integer booking_switch;
    @Nullable
    private Integer game_status;
    @Nullable
    private Integer is_booking;
    @Nullable
    private String online_time;

    public GameDetailBookingInfoBean() {
        this(null, null, null, null, null, 31, null);
    }

    public GameDetailBookingInfoBean(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str) {
        this.booking_count = num;
        this.booking_switch = num2;
        this.game_status = num3;
        this.is_booking = num4;
        this.online_time = str;
    }

    public static /* synthetic */ GameDetailBookingInfoBean copy$default(GameDetailBookingInfoBean gameDetailBookingInfoBean, Integer num, Integer num2, Integer num3, Integer num4, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            num = gameDetailBookingInfoBean.booking_count;
        }
        if ((i4 & 2) != 0) {
            num2 = gameDetailBookingInfoBean.booking_switch;
        }
        Integer num5 = num2;
        if ((i4 & 4) != 0) {
            num3 = gameDetailBookingInfoBean.game_status;
        }
        Integer num6 = num3;
        if ((i4 & 8) != 0) {
            num4 = gameDetailBookingInfoBean.is_booking;
        }
        Integer num7 = num4;
        if ((i4 & 16) != 0) {
            str = gameDetailBookingInfoBean.online_time;
        }
        return gameDetailBookingInfoBean.copy(num, num5, num6, num7, str);
    }

    @Nullable
    public final Integer component1() {
        return this.booking_count;
    }

    @Nullable
    public final Integer component2() {
        return this.booking_switch;
    }

    @Nullable
    public final Integer component3() {
        return this.game_status;
    }

    @Nullable
    public final Integer component4() {
        return this.is_booking;
    }

    @Nullable
    public final String component5() {
        return this.online_time;
    }

    @NotNull
    public final GameDetailBookingInfoBean copy(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str) {
        return new GameDetailBookingInfoBean(num, num2, num3, num4, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GameDetailBookingInfoBean) {
            GameDetailBookingInfoBean gameDetailBookingInfoBean = (GameDetailBookingInfoBean) obj;
            return Intrinsics.areEqual(this.booking_count, gameDetailBookingInfoBean.booking_count) && Intrinsics.areEqual(this.booking_switch, gameDetailBookingInfoBean.booking_switch) && Intrinsics.areEqual(this.game_status, gameDetailBookingInfoBean.game_status) && Intrinsics.areEqual(this.is_booking, gameDetailBookingInfoBean.is_booking) && Intrinsics.areEqual(this.online_time, gameDetailBookingInfoBean.online_time);
        }
        return false;
    }

    @Nullable
    public final Integer getBooking_count() {
        return this.booking_count;
    }

    @Nullable
    public final Integer getBooking_switch() {
        return this.booking_switch;
    }

    @Nullable
    public final Integer getGame_status() {
        return this.game_status;
    }

    @Nullable
    public final String getOnline_time() {
        return this.online_time;
    }

    public int hashCode() {
        Integer num = this.booking_count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.booking_switch;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.game_status;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.is_booking;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.online_time;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    @Nullable
    public final Integer is_booking() {
        return this.is_booking;
    }

    public final void setBooking_count(@Nullable Integer num) {
        this.booking_count = num;
    }

    public final void setBooking_switch(@Nullable Integer num) {
        this.booking_switch = num;
    }

    public final void setGame_status(@Nullable Integer num) {
        this.game_status = num;
    }

    public final void setOnline_time(@Nullable String str) {
        this.online_time = str;
    }

    public final void set_booking(@Nullable Integer num) {
        this.is_booking = num;
    }

    @NotNull
    public String toString() {
        return "GameDetailBookingInfoBean(booking_count=" + this.booking_count + ", booking_switch=" + this.booking_switch + ", game_status=" + this.game_status + ", is_booking=" + this.is_booking + ", online_time=" + this.online_time + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ GameDetailBookingInfoBean(java.lang.Integer r4, java.lang.Integer r5, java.lang.Integer r6, java.lang.Integer r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r10 == 0) goto Lb
            r10 = r0
            goto Lc
        Lb:
            r10 = r4
        Lc:
            r4 = r9 & 2
            if (r4 == 0) goto L12
            r1 = r0
            goto L13
        L12:
            r1 = r5
        L13:
            r4 = r9 & 4
            if (r4 == 0) goto L19
            r2 = r0
            goto L1a
        L19:
            r2 = r6
        L1a:
            r4 = r9 & 8
            if (r4 == 0) goto L1f
            goto L20
        L1f:
            r0 = r7
        L20:
            r4 = r9 & 16
            if (r4 == 0) goto L26
            java.lang.String r8 = ""
        L26:
            r9 = r8
            r4 = r3
            r5 = r10
            r6 = r1
            r7 = r2
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.discount.model.bean.GameDetailBookingInfoBean.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
