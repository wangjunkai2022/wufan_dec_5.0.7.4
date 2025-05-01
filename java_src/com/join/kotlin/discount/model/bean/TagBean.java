package com.join.kotlin.discount.model.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: TagBean.kt */
/* loaded from: classes3.dex */
public final class TagBean {
    @Nullable
    private String color;
    @Nullable
    private Integer id;
    @Nullable
    private String name;
    @Nullable
    private Integer type;

    public TagBean() {
        this(null, null, null, null, 15, null);
    }

    public TagBean(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable Integer num2) {
        this.color = str;
        this.id = num;
        this.name = str2;
        this.type = num2;
    }

    public static /* synthetic */ TagBean copy$default(TagBean tagBean, String str, Integer num, String str2, Integer num2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = tagBean.color;
        }
        if ((i4 & 2) != 0) {
            num = tagBean.id;
        }
        if ((i4 & 4) != 0) {
            str2 = tagBean.name;
        }
        if ((i4 & 8) != 0) {
            num2 = tagBean.type;
        }
        return tagBean.copy(str, num, str2, num2);
    }

    @Nullable
    public final String component1() {
        return this.color;
    }

    @Nullable
    public final Integer component2() {
        return this.id;
    }

    @Nullable
    public final String component3() {
        return this.name;
    }

    @Nullable
    public final Integer component4() {
        return this.type;
    }

    @NotNull
    public final TagBean copy(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable Integer num2) {
        return new TagBean(str, num, str2, num2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TagBean) {
            TagBean tagBean = (TagBean) obj;
            return Intrinsics.areEqual(this.color, tagBean.color) && Intrinsics.areEqual(this.id, tagBean.id) && Intrinsics.areEqual(this.name, tagBean.name) && Intrinsics.areEqual(this.type, tagBean.type);
        }
        return false;
    }

    @Nullable
    public final String getColor() {
        return this.color;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.color;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.id;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.type;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setColor(@Nullable String str) {
        this.color = str;
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }

    @NotNull
    public String toString() {
        return "TagBean(color=" + this.color + ", id=" + this.id + ", name=" + this.name + ", type=" + this.type + ')';
    }

    public /* synthetic */ TagBean(String str, Integer num, String str2, Integer num2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : num, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? 0 : num2);
    }
}
