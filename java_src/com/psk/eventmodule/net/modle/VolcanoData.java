package com.psk.eventmodule.net.modle;

import com.join.kotlin.ui.modleregin.modle.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: VolcanoData.kt */
/* loaded from: classes5.dex */
public final class VolcanoData {
    private long bhv_time;
    @NotNull
    private String bhv_type;
    @Nullable
    private String client_version;
    @Nullable
    private String device_id;
    @Nullable
    private String device_model;
    @Nullable
    private String goods_id;
    @Nullable
    private String ip;
    private boolean net_game;
    @Nullable
    private String network;
    @Nullable
    private String os_version;
    @Nullable
    private String req_id;
    @Nullable
    private String scm;
    @Nullable
    private String spm;
    @Nullable
    private String trans_data;
    private long user_id;
    private int user_type;

    public VolcanoData() {
        this(0L, 0, null, null, 0L, null, null, null, null, null, null, null, null, null, null, false, 65535, null);
    }

    public VolcanoData(long j4, int i4, @Nullable String str, @NotNull String bhv_type, long j5, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, boolean z4) {
        Intrinsics.checkNotNullParameter(bhv_type, "bhv_type");
        this.user_id = j4;
        this.user_type = i4;
        this.goods_id = str;
        this.bhv_type = bhv_type;
        this.bhv_time = j5;
        this.device_model = str2;
        this.device_id = str3;
        this.client_version = str4;
        this.os_version = str5;
        this.network = str6;
        this.ip = str7;
        this.spm = str8;
        this.scm = str9;
        this.req_id = str10;
        this.trans_data = str11;
        this.net_game = z4;
    }

    public final long component1() {
        return this.user_id;
    }

    @Nullable
    public final String component10() {
        return this.network;
    }

    @Nullable
    public final String component11() {
        return this.ip;
    }

    @Nullable
    public final String component12() {
        return this.spm;
    }

    @Nullable
    public final String component13() {
        return this.scm;
    }

    @Nullable
    public final String component14() {
        return this.req_id;
    }

    @Nullable
    public final String component15() {
        return this.trans_data;
    }

    public final boolean component16() {
        return this.net_game;
    }

    public final int component2() {
        return this.user_type;
    }

    @Nullable
    public final String component3() {
        return this.goods_id;
    }

    @NotNull
    public final String component4() {
        return this.bhv_type;
    }

    public final long component5() {
        return this.bhv_time;
    }

    @Nullable
    public final String component6() {
        return this.device_model;
    }

    @Nullable
    public final String component7() {
        return this.device_id;
    }

    @Nullable
    public final String component8() {
        return this.client_version;
    }

    @Nullable
    public final String component9() {
        return this.os_version;
    }

    @NotNull
    public final VolcanoData copy(long j4, int i4, @Nullable String str, @NotNull String bhv_type, long j5, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, boolean z4) {
        Intrinsics.checkNotNullParameter(bhv_type, "bhv_type");
        return new VolcanoData(j4, i4, str, bhv_type, j5, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, z4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VolcanoData) {
            VolcanoData volcanoData = (VolcanoData) obj;
            return this.user_id == volcanoData.user_id && this.user_type == volcanoData.user_type && Intrinsics.areEqual(this.goods_id, volcanoData.goods_id) && Intrinsics.areEqual(this.bhv_type, volcanoData.bhv_type) && this.bhv_time == volcanoData.bhv_time && Intrinsics.areEqual(this.device_model, volcanoData.device_model) && Intrinsics.areEqual(this.device_id, volcanoData.device_id) && Intrinsics.areEqual(this.client_version, volcanoData.client_version) && Intrinsics.areEqual(this.os_version, volcanoData.os_version) && Intrinsics.areEqual(this.network, volcanoData.network) && Intrinsics.areEqual(this.ip, volcanoData.ip) && Intrinsics.areEqual(this.spm, volcanoData.spm) && Intrinsics.areEqual(this.scm, volcanoData.scm) && Intrinsics.areEqual(this.req_id, volcanoData.req_id) && Intrinsics.areEqual(this.trans_data, volcanoData.trans_data) && this.net_game == volcanoData.net_game;
        }
        return false;
    }

    public final long getBhv_time() {
        return this.bhv_time;
    }

    @NotNull
    public final String getBhv_type() {
        return this.bhv_type;
    }

    @Nullable
    public final String getClient_version() {
        return this.client_version;
    }

    @Nullable
    public final String getDevice_id() {
        return this.device_id;
    }

    @Nullable
    public final String getDevice_model() {
        return this.device_model;
    }

    @Nullable
    public final String getGoods_id() {
        return this.goods_id;
    }

    @Nullable
    public final String getIp() {
        return this.ip;
    }

    public final boolean getNet_game() {
        return this.net_game;
    }

    @Nullable
    public final String getNetwork() {
        return this.network;
    }

    @Nullable
    public final String getOs_version() {
        return this.os_version;
    }

    @Nullable
    public final String getReq_id() {
        return this.req_id;
    }

    @Nullable
    public final String getScm() {
        return this.scm;
    }

    @Nullable
    public final String getSpm() {
        return this.spm;
    }

    @Nullable
    public final String getTrans_data() {
        return this.trans_data;
    }

    public final long getUser_id() {
        return this.user_id;
    }

    public final int getUser_type() {
        return this.user_type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int a5 = ((a.a(this.user_id) * 31) + this.user_type) * 31;
        String str = this.goods_id;
        int hashCode = (((((a5 + (str == null ? 0 : str.hashCode())) * 31) + this.bhv_type.hashCode()) * 31) + a.a(this.bhv_time)) * 31;
        String str2 = this.device_model;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.device_id;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.client_version;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.os_version;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.network;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.ip;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.spm;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.scm;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.req_id;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.trans_data;
        int hashCode11 = (hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        boolean z4 = this.net_game;
        int i4 = z4;
        if (z4 != 0) {
            i4 = 1;
        }
        return hashCode11 + i4;
    }

    public final void setBhv_time(long j4) {
        this.bhv_time = j4;
    }

    public final void setBhv_type(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bhv_type = str;
    }

    public final void setClient_version(@Nullable String str) {
        this.client_version = str;
    }

    public final void setDevice_id(@Nullable String str) {
        this.device_id = str;
    }

    public final void setDevice_model(@Nullable String str) {
        this.device_model = str;
    }

    public final void setGoods_id(@Nullable String str) {
        this.goods_id = str;
    }

    public final void setIp(@Nullable String str) {
        this.ip = str;
    }

    public final void setNet_game(boolean z4) {
        this.net_game = z4;
    }

    public final void setNetwork(@Nullable String str) {
        this.network = str;
    }

    public final void setOs_version(@Nullable String str) {
        this.os_version = str;
    }

    public final void setReq_id(@Nullable String str) {
        this.req_id = str;
    }

    public final void setScm(@Nullable String str) {
        this.scm = str;
    }

    public final void setSpm(@Nullable String str) {
        this.spm = str;
    }

    public final void setTrans_data(@Nullable String str) {
        this.trans_data = str;
    }

    public final void setUser_id(long j4) {
        this.user_id = j4;
    }

    public final void setUser_type(int i4) {
        this.user_type = i4;
    }

    @NotNull
    public String toString() {
        return "VolcanoData(user_id=" + this.user_id + ", user_type=" + this.user_type + ", goods_id=" + this.goods_id + ", bhv_type=" + this.bhv_type + ", bhv_time=" + this.bhv_time + ", device_model=" + this.device_model + ", device_id=" + this.device_id + ", client_version=" + this.client_version + ", os_version=" + this.os_version + ", network=" + this.network + ", ip=" + this.ip + ", spm=" + this.spm + ", scm=" + this.scm + ", req_id=" + this.req_id + ", trans_data=" + this.trans_data + ", net_game=" + this.net_game + ')';
    }

    public /* synthetic */ VolcanoData(long j4, int i4, String str, String str2, long j5, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0L : j4, (i5 & 2) != 0 ? 0 : i4, (i5 & 4) != 0 ? "" : str, (i5 & 8) != 0 ? "" : str2, (i5 & 16) == 0 ? j5 : 0L, (i5 & 32) != 0 ? "" : str3, (i5 & 64) != 0 ? "" : str4, (i5 & 128) != 0 ? "" : str5, (i5 & 256) != 0 ? "" : str6, (i5 & 512) != 0 ? "" : str7, (i5 & 1024) != 0 ? "" : str8, (i5 & 2048) != 0 ? "" : str9, (i5 & 4096) != 0 ? "" : str10, (i5 & 8192) != 0 ? "" : str11, (i5 & 16384) != 0 ? "" : str12, (i5 & 32768) != 0 ? false : z4);
    }
}
