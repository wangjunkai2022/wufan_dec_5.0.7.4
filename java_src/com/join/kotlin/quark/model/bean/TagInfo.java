package com.join.kotlin.quark.model.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: JumpModelEntityListItemBean.kt */
/* loaded from: classes3.dex */
public final class TagInfo {
    @Nullable
    private final String color;
    @Nullable
    private final String id;
    @Nullable
    private final String name;

    public TagInfo(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.color = str;
        this.id = str2;
        this.name = str3;
    }

    public static /* synthetic */ TagInfo copy$default(TagInfo tagInfo, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = tagInfo.color;
        }
        if ((i4 & 2) != 0) {
            str2 = tagInfo.id;
        }
        if ((i4 & 4) != 0) {
            str3 = tagInfo.name;
        }
        return tagInfo.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.color;
    }

    @Nullable
    public final String component2() {
        return this.id;
    }

    @Nullable
    public final String component3() {
        return this.name;
    }

    @NotNull
    public final TagInfo copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new TagInfo(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TagInfo) {
            TagInfo tagInfo = (TagInfo) obj;
            return Intrinsics.areEqual(this.color, tagInfo.color) && Intrinsics.areEqual(this.id, tagInfo.id) && Intrinsics.areEqual(this.name, tagInfo.name);
        }
        return false;
    }

    @Nullable
    public final String getColor() {
        return this.color;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.color;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TagInfo(color=" + this.color + ", id=" + this.id + ", name=" + this.name + ')';
    }
}
