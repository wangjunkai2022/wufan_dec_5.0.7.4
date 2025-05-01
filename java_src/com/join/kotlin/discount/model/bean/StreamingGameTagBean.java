package com.join.kotlin.discount.model.bean;

import com.MApplication;
import com.join.android.app.mgsim.wufun.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: StreamingGameTagBean.kt */
/* loaded from: classes3.dex */
public final class StreamingGameTagBean {
    @Nullable
    private final Integer border_shape;
    @Nullable
    private final String color;
    @Nullable
    private final String icon;
    @Nullable
    private final String name;

    public StreamingGameTagBean() {
        this(null, null, null, null, 15, null);
    }

    public StreamingGameTagBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num) {
        this.color = str;
        this.icon = str2;
        this.name = str3;
        this.border_shape = num;
    }

    public static /* synthetic */ StreamingGameTagBean copy$default(StreamingGameTagBean streamingGameTagBean, String str, String str2, String str3, Integer num, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = streamingGameTagBean.color;
        }
        if ((i4 & 2) != 0) {
            str2 = streamingGameTagBean.icon;
        }
        if ((i4 & 4) != 0) {
            str3 = streamingGameTagBean.name;
        }
        if ((i4 & 8) != 0) {
            num = streamingGameTagBean.border_shape;
        }
        return streamingGameTagBean.copy(str, str2, str3, num);
    }

    @Nullable
    public final String component1() {
        return this.color;
    }

    @Nullable
    public final String component2() {
        return this.icon;
    }

    @Nullable
    public final String component3() {
        return this.name;
    }

    @Nullable
    public final Integer component4() {
        return this.border_shape;
    }

    @NotNull
    public final StreamingGameTagBean copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num) {
        return new StreamingGameTagBean(str, str2, str3, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StreamingGameTagBean) {
            StreamingGameTagBean streamingGameTagBean = (StreamingGameTagBean) obj;
            return Intrinsics.areEqual(this.color, streamingGameTagBean.color) && Intrinsics.areEqual(this.icon, streamingGameTagBean.icon) && Intrinsics.areEqual(this.name, streamingGameTagBean.name) && Intrinsics.areEqual(this.border_shape, streamingGameTagBean.border_shape);
        }
        return false;
    }

    @Nullable
    public final Integer getBorder_shape() {
        return this.border_shape;
    }

    @Nullable
    public final String getColor() {
        return this.color;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.color;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.icon;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.border_shape;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final int textSize() {
        float dimension;
        Integer num = this.border_shape;
        if (num != null && num.intValue() == 1) {
            dimension = MApplication.f1497x.getResources().getDimension(R.dimen.wdp18);
        } else {
            dimension = MApplication.f1497x.getResources().getDimension(R.dimen.wdp20);
        }
        return (int) dimension;
    }

    @NotNull
    public String toString() {
        return "StreamingGameTagBean(color=" + this.color + ", icon=" + this.icon + ", name=" + this.name + ", border_shape=" + this.border_shape + ')';
    }

    public /* synthetic */ StreamingGameTagBean(String str, String str2, String str3, Integer num, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? 0 : num);
    }
}
