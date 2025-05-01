package com.join.kotlin.ui.modleregin.modle;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BTDynamicMain.kt */
/* loaded from: classes3.dex */
public final class BTDynamicMain {
    @Nullable
    private final List<BTDynamicModle> components;
    @Nullable
    private final String subTitle;
    @NotNull
    private final String title;

    public BTDynamicMain(@Nullable List<BTDynamicModle> list, @NotNull String title, @Nullable String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.components = list;
        this.title = title;
        this.subTitle = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BTDynamicMain copy$default(BTDynamicMain bTDynamicMain, List list, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = bTDynamicMain.components;
        }
        if ((i4 & 2) != 0) {
            str = bTDynamicMain.title;
        }
        if ((i4 & 4) != 0) {
            str2 = bTDynamicMain.subTitle;
        }
        return bTDynamicMain.copy(list, str, str2);
    }

    @Nullable
    public final List<BTDynamicModle> component1() {
        return this.components;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @Nullable
    public final String component3() {
        return this.subTitle;
    }

    @NotNull
    public final BTDynamicMain copy(@Nullable List<BTDynamicModle> list, @NotNull String title, @Nullable String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new BTDynamicMain(list, title, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BTDynamicMain) {
            BTDynamicMain bTDynamicMain = (BTDynamicMain) obj;
            return Intrinsics.areEqual(this.components, bTDynamicMain.components) && Intrinsics.areEqual(this.title, bTDynamicMain.title) && Intrinsics.areEqual(this.subTitle, bTDynamicMain.subTitle);
        }
        return false;
    }

    @Nullable
    public final List<BTDynamicModle> getComponents() {
        return this.components;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        List<BTDynamicModle> list = this.components;
        int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.title.hashCode()) * 31;
        String str = this.subTitle;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BTDynamicMain(components=" + this.components + ", title=" + this.title + ", subTitle=" + this.subTitle + ')';
    }
}
