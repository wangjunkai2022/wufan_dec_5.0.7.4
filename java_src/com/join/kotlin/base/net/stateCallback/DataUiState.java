package com.join.kotlin.base.net.stateCallback;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: DataUiState.kt */
/* loaded from: classes3.dex */
public final class DataUiState<T> {
    @Nullable
    private final T data;
    @NotNull
    private final String errMessage;
    private final boolean hasMore;
    private final boolean isEmpty;
    private final boolean isFirstEmpty;
    private final boolean isRefresh;
    private final boolean isSuccess;

    public DataUiState(boolean z4, @NotNull String errMessage, boolean z5, boolean z6, boolean z7, boolean z8, @Nullable T t4) {
        Intrinsics.checkNotNullParameter(errMessage, "errMessage");
        this.isSuccess = z4;
        this.errMessage = errMessage;
        this.isRefresh = z5;
        this.isEmpty = z6;
        this.hasMore = z7;
        this.isFirstEmpty = z8;
        this.data = t4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataUiState copy$default(DataUiState dataUiState, boolean z4, String str, boolean z5, boolean z6, boolean z7, boolean z8, Object obj, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            z4 = dataUiState.isSuccess;
        }
        if ((i4 & 2) != 0) {
            str = dataUiState.errMessage;
        }
        String str2 = str;
        if ((i4 & 4) != 0) {
            z5 = dataUiState.isRefresh;
        }
        boolean z9 = z5;
        if ((i4 & 8) != 0) {
            z6 = dataUiState.isEmpty;
        }
        boolean z10 = z6;
        if ((i4 & 16) != 0) {
            z7 = dataUiState.hasMore;
        }
        boolean z11 = z7;
        if ((i4 & 32) != 0) {
            z8 = dataUiState.isFirstEmpty;
        }
        boolean z12 = z8;
        T t4 = obj;
        if ((i4 & 64) != 0) {
            t4 = dataUiState.data;
        }
        return dataUiState.copy(z4, str2, z9, z10, z11, z12, t4);
    }

    public final boolean component1() {
        return this.isSuccess;
    }

    @NotNull
    public final String component2() {
        return this.errMessage;
    }

    public final boolean component3() {
        return this.isRefresh;
    }

    public final boolean component4() {
        return this.isEmpty;
    }

    public final boolean component5() {
        return this.hasMore;
    }

    public final boolean component6() {
        return this.isFirstEmpty;
    }

    @Nullable
    public final T component7() {
        return this.data;
    }

    @NotNull
    public final DataUiState<T> copy(boolean z4, @NotNull String errMessage, boolean z5, boolean z6, boolean z7, boolean z8, @Nullable T t4) {
        Intrinsics.checkNotNullParameter(errMessage, "errMessage");
        return new DataUiState<>(z4, errMessage, z5, z6, z7, z8, t4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataUiState) {
            DataUiState dataUiState = (DataUiState) obj;
            return this.isSuccess == dataUiState.isSuccess && Intrinsics.areEqual(this.errMessage, dataUiState.errMessage) && this.isRefresh == dataUiState.isRefresh && this.isEmpty == dataUiState.isEmpty && this.hasMore == dataUiState.hasMore && this.isFirstEmpty == dataUiState.isFirstEmpty && Intrinsics.areEqual(this.data, dataUiState.data);
        }
        return false;
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    @NotNull
    public final String getErrMessage() {
        return this.errMessage;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        boolean z4 = this.isSuccess;
        ?? r02 = z4;
        if (z4) {
            r02 = 1;
        }
        int hashCode = ((r02 * 31) + this.errMessage.hashCode()) * 31;
        ?? r22 = this.isRefresh;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode + i4) * 31;
        ?? r23 = this.isEmpty;
        int i6 = r23;
        if (r23 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        ?? r24 = this.hasMore;
        int i8 = r24;
        if (r24 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        boolean z5 = this.isFirstEmpty;
        int i10 = (i9 + (z5 ? 1 : z5 ? 1 : 0)) * 31;
        T t4 = this.data;
        return i10 + (t4 == null ? 0 : t4.hashCode());
    }

    public final boolean isEmpty() {
        return this.isEmpty;
    }

    public final boolean isFirstEmpty() {
        return this.isFirstEmpty;
    }

    public final boolean isRefresh() {
        return this.isRefresh;
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public String toString() {
        return "DataUiState(isSuccess=" + this.isSuccess + ", errMessage=" + this.errMessage + ", isRefresh=" + this.isRefresh + ", isEmpty=" + this.isEmpty + ", hasMore=" + this.hasMore + ", isFirstEmpty=" + this.isFirstEmpty + ", data=" + this.data + ')';
    }

    public /* synthetic */ DataUiState(boolean z4, String str, boolean z5, boolean z6, boolean z7, boolean z8, Object obj, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? false : z5, (i4 & 8) != 0 ? false : z6, (i4 & 16) != 0 ? false : z7, (i4 & 32) == 0 ? z8 : false, (i4 & 64) != 0 ? null : obj);
    }
}
