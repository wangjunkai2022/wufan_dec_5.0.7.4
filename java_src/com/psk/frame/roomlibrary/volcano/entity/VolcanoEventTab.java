package com.psk.frame.roomlibrary.volcano.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.join.kotlin.ui.modleregin.modle.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: VolcanoEventTab.kt */
@DatabaseTable(tableName = "volcano_event_tab")
/* loaded from: classes.dex */
public final class VolcanoEventTab {
    @DatabaseField
    private long bhv_time;
    @DatabaseField
    @NotNull
    private String bhv_type;
    @DatabaseField
    @Nullable
    private String client_version;
    @DatabaseField
    @Nullable
    private String device_id;
    @DatabaseField
    @Nullable
    private String device_model;
    @DatabaseField
    @Nullable
    private String goods_id;
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    @Nullable
    private String ip;
    @DatabaseField
    private boolean net_game;
    @DatabaseField
    @Nullable
    private String network;
    @DatabaseField
    @Nullable
    private String os_version;
    @DatabaseField
    private int repeatNumber;
    @DatabaseField
    @Nullable
    private String req_id;
    @DatabaseField
    @Nullable
    private String scm;
    @DatabaseField
    @Nullable
    private String spm;
    @DatabaseField
    @Nullable
    private String trans_data;
    @DatabaseField
    private long user_id;
    @DatabaseField
    private int user_type;

    public VolcanoEventTab() {
        this(0, 0, 0L, null, null, 0L, 0, null, null, null, null, null, null, null, null, null, null, false, 262143, null);
    }

    public VolcanoEventTab(int i4, int i5, long j4, @NotNull String bhv_type, @Nullable String str, long j5, int i6, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, boolean z4) {
        Intrinsics.checkNotNullParameter(bhv_type, "bhv_type");
        this.id = i4;
        this.repeatNumber = i5;
        this.bhv_time = j4;
        this.bhv_type = bhv_type;
        this.goods_id = str;
        this.user_id = j5;
        this.user_type = i6;
        this.scm = str2;
        this.spm = str3;
        this.trans_data = str4;
        this.req_id = str5;
        this.ip = str6;
        this.client_version = str7;
        this.device_model = str8;
        this.network = str9;
        this.os_version = str10;
        this.device_id = str11;
        this.net_game = z4;
    }

    public final int component1() {
        return this.id;
    }

    @Nullable
    public final String component10() {
        return this.trans_data;
    }

    @Nullable
    public final String component11() {
        return this.req_id;
    }

    @Nullable
    public final String component12() {
        return this.ip;
    }

    @Nullable
    public final String component13() {
        return this.client_version;
    }

    @Nullable
    public final String component14() {
        return this.device_model;
    }

    @Nullable
    public final String component15() {
        return this.network;
    }

    @Nullable
    public final String component16() {
        return this.os_version;
    }

    @Nullable
    public final String component17() {
        return this.device_id;
    }

    public final boolean component18() {
        return this.net_game;
    }

    public final int component2() {
        return this.repeatNumber;
    }

    public final long component3() {
        return this.bhv_time;
    }

    @NotNull
    public final String component4() {
        return this.bhv_type;
    }

    @Nullable
    public final String component5() {
        return this.goods_id;
    }

    public final long component6() {
        return this.user_id;
    }

    public final int component7() {
        return this.user_type;
    }

    @Nullable
    public final String component8() {
        return this.scm;
    }

    @Nullable
    public final String component9() {
        return this.spm;
    }

    @NotNull
    public final VolcanoEventTab copy(int i4, int i5, long j4, @NotNull String bhv_type, @Nullable String str, long j5, int i6, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, boolean z4) {
        Intrinsics.checkNotNullParameter(bhv_type, "bhv_type");
        return new VolcanoEventTab(i4, i5, j4, bhv_type, str, j5, i6, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, z4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VolcanoEventTab) {
            VolcanoEventTab volcanoEventTab = (VolcanoEventTab) obj;
            return this.id == volcanoEventTab.id && this.repeatNumber == volcanoEventTab.repeatNumber && this.bhv_time == volcanoEventTab.bhv_time && Intrinsics.areEqual(this.bhv_type, volcanoEventTab.bhv_type) && Intrinsics.areEqual(this.goods_id, volcanoEventTab.goods_id) && this.user_id == volcanoEventTab.user_id && this.user_type == volcanoEventTab.user_type && Intrinsics.areEqual(this.scm, volcanoEventTab.scm) && Intrinsics.areEqual(this.spm, volcanoEventTab.spm) && Intrinsics.areEqual(this.trans_data, volcanoEventTab.trans_data) && Intrinsics.areEqual(this.req_id, volcanoEventTab.req_id) && Intrinsics.areEqual(this.ip, volcanoEventTab.ip) && Intrinsics.areEqual(this.client_version, volcanoEventTab.client_version) && Intrinsics.areEqual(this.device_model, volcanoEventTab.device_model) && Intrinsics.areEqual(this.network, volcanoEventTab.network) && Intrinsics.areEqual(this.os_version, volcanoEventTab.os_version) && Intrinsics.areEqual(this.device_id, volcanoEventTab.device_id) && this.net_game == volcanoEventTab.net_game;
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

    public final int getId() {
        return this.id;
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

    public final int getRepeatNumber() {
        return this.repeatNumber;
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
        int a5 = ((((((this.id * 31) + this.repeatNumber) * 31) + a.a(this.bhv_time)) * 31) + this.bhv_type.hashCode()) * 31;
        String str = this.goods_id;
        int hashCode = (((((a5 + (str == null ? 0 : str.hashCode())) * 31) + a.a(this.user_id)) * 31) + this.user_type) * 31;
        String str2 = this.scm;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.spm;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.trans_data;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.req_id;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.ip;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.client_version;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.device_model;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.network;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.os_version;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.device_id;
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

    public final void setId(int i4) {
        this.id = i4;
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

    public final void setRepeatNumber(int i4) {
        this.repeatNumber = i4;
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
        return "VolcanoEventTab(id=" + this.id + ", repeatNumber=" + this.repeatNumber + ", bhv_time=" + this.bhv_time + ", bhv_type=" + this.bhv_type + ", goods_id=" + this.goods_id + ", user_id=" + this.user_id + ", user_type=" + this.user_type + ", scm=" + this.scm + ", spm=" + this.spm + ", trans_data=" + this.trans_data + ", req_id=" + this.req_id + ", ip=" + this.ip + ", client_version=" + this.client_version + ", device_model=" + this.device_model + ", network=" + this.network + ", os_version=" + this.os_version + ", device_id=" + this.device_id + ", net_game=" + this.net_game + ')';
    }

    public /* synthetic */ VolcanoEventTab(int i4, int i5, long j4, String str, String str2, long j5, int i6, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i4, (i7 & 2) != 0 ? 0 : i5, (i7 & 4) != 0 ? 0L : j4, (i7 & 8) != 0 ? "" : str, (i7 & 16) != 0 ? "" : str2, (i7 & 32) == 0 ? j5 : 0L, (i7 & 64) != 0 ? 0 : i6, (i7 & 128) != 0 ? "" : str3, (i7 & 256) != 0 ? "" : str4, (i7 & 512) != 0 ? "" : str5, (i7 & 1024) != 0 ? "" : str6, (i7 & 2048) != 0 ? "" : str7, (i7 & 4096) != 0 ? "" : str8, (i7 & 8192) != 0 ? "" : str9, (i7 & 16384) != 0 ? "" : str10, (i7 & 32768) != 0 ? "" : str11, (i7 & 65536) != 0 ? "" : str12, (i7 & 131072) != 0 ? false : z4);
    }
}
