package com.join.kotlin.quark.model.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: JumpModelEntityListItemBean.kt */
/* loaded from: classes3.dex */
public final class WebDiskEntity {
    @Nullable
    private final String wb_file_date;
    @Nullable
    private final String wb_file_size;
    @Nullable
    private final String wb_switch;
    @Nullable
    private final String wb_url;

    public WebDiskEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.wb_file_date = str;
        this.wb_file_size = str2;
        this.wb_switch = str3;
        this.wb_url = str4;
    }

    public static /* synthetic */ WebDiskEntity copy$default(WebDiskEntity webDiskEntity, String str, String str2, String str3, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = webDiskEntity.wb_file_date;
        }
        if ((i4 & 2) != 0) {
            str2 = webDiskEntity.wb_file_size;
        }
        if ((i4 & 4) != 0) {
            str3 = webDiskEntity.wb_switch;
        }
        if ((i4 & 8) != 0) {
            str4 = webDiskEntity.wb_url;
        }
        return webDiskEntity.copy(str, str2, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.wb_file_date;
    }

    @Nullable
    public final String component2() {
        return this.wb_file_size;
    }

    @Nullable
    public final String component3() {
        return this.wb_switch;
    }

    @Nullable
    public final String component4() {
        return this.wb_url;
    }

    @NotNull
    public final WebDiskEntity copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new WebDiskEntity(str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WebDiskEntity) {
            WebDiskEntity webDiskEntity = (WebDiskEntity) obj;
            return Intrinsics.areEqual(this.wb_file_date, webDiskEntity.wb_file_date) && Intrinsics.areEqual(this.wb_file_size, webDiskEntity.wb_file_size) && Intrinsics.areEqual(this.wb_switch, webDiskEntity.wb_switch) && Intrinsics.areEqual(this.wb_url, webDiskEntity.wb_url);
        }
        return false;
    }

    @Nullable
    public final String getWb_file_date() {
        return this.wb_file_date;
    }

    @Nullable
    public final String getWb_file_size() {
        return this.wb_file_size;
    }

    @Nullable
    public final String getWb_switch() {
        return this.wb_switch;
    }

    @Nullable
    public final String getWb_url() {
        return this.wb_url;
    }

    public int hashCode() {
        String str = this.wb_file_date;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.wb_file_size;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.wb_switch;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.wb_url;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WebDiskEntity(wb_file_date=" + this.wb_file_date + ", wb_file_size=" + this.wb_file_size + ", wb_switch=" + this.wb_switch + ", wb_url=" + this.wb_url + ')';
    }
}
