package com.join.kotlin.ui.cloudarchive.dialog;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: DialogData.kt */
/* loaded from: classes3.dex */
public final class DialogData {
    @NotNull
    private final String cancleButn;
    @NotNull
    private final String content;
    @NotNull
    private final String okButn;
    private final boolean showClose;
    @NotNull
    private final String title;

    public DialogData(@NotNull String title, @NotNull String content, @NotNull String okButn, @NotNull String cancleButn, boolean z4) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(okButn, "okButn");
        Intrinsics.checkNotNullParameter(cancleButn, "cancleButn");
        this.title = title;
        this.content = content;
        this.okButn = okButn;
        this.cancleButn = cancleButn;
        this.showClose = z4;
    }

    public static /* synthetic */ DialogData copy$default(DialogData dialogData, String str, String str2, String str3, String str4, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = dialogData.title;
        }
        if ((i4 & 2) != 0) {
            str2 = dialogData.content;
        }
        String str5 = str2;
        if ((i4 & 4) != 0) {
            str3 = dialogData.okButn;
        }
        String str6 = str3;
        if ((i4 & 8) != 0) {
            str4 = dialogData.cancleButn;
        }
        String str7 = str4;
        if ((i4 & 16) != 0) {
            z4 = dialogData.showClose;
        }
        return dialogData.copy(str, str5, str6, str7, z4);
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @NotNull
    public final String component2() {
        return this.content;
    }

    @NotNull
    public final String component3() {
        return this.okButn;
    }

    @NotNull
    public final String component4() {
        return this.cancleButn;
    }

    public final boolean component5() {
        return this.showClose;
    }

    @NotNull
    public final DialogData copy(@NotNull String title, @NotNull String content, @NotNull String okButn, @NotNull String cancleButn, boolean z4) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(okButn, "okButn");
        Intrinsics.checkNotNullParameter(cancleButn, "cancleButn");
        return new DialogData(title, content, okButn, cancleButn, z4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DialogData) {
            DialogData dialogData = (DialogData) obj;
            return Intrinsics.areEqual(this.title, dialogData.title) && Intrinsics.areEqual(this.content, dialogData.content) && Intrinsics.areEqual(this.okButn, dialogData.okButn) && Intrinsics.areEqual(this.cancleButn, dialogData.cancleButn) && this.showClose == dialogData.showClose;
        }
        return false;
    }

    @NotNull
    public final String getCancleButn() {
        return this.cancleButn;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getOkButn() {
        return this.okButn;
    }

    public final boolean getShowClose() {
        return this.showClose;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.title.hashCode() * 31) + this.content.hashCode()) * 31) + this.okButn.hashCode()) * 31) + this.cancleButn.hashCode()) * 31;
        boolean z4 = this.showClose;
        int i4 = z4;
        if (z4 != 0) {
            i4 = 1;
        }
        return hashCode + i4;
    }

    @NotNull
    public String toString() {
        return "DialogData(title=" + this.title + ", content=" + this.content + ", okButn=" + this.okButn + ", cancleButn=" + this.cancleButn + ", showClose=" + this.showClose + ')';
    }

    public /* synthetic */ DialogData(String str, String str2, String str3, String str4, boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i4 & 4) != 0 ? "确定" : str3, (i4 & 8) != 0 ? "取消" : str4, (i4 & 16) != 0 ? false : z4);
    }
}
