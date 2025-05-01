package com.join.kotlin.base.net.stateCallback;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ListDataUiState.kt */
/* loaded from: classes3.dex */
public final class ListDataUiState<T> {
    @NotNull
    private final String errMessage;
    private final boolean hasMore;
    private final boolean isEmpty;
    private final boolean isFirstEmpty;
    private final boolean isRefresh;
    private final boolean isSuccess;
    @NotNull
    private final ArrayList<T> listData;

    public ListDataUiState(boolean z4, @NotNull String errMessage, boolean z5, boolean z6, boolean z7, boolean z8, @NotNull ArrayList<T> listData) {
        Intrinsics.checkNotNullParameter(errMessage, "errMessage");
        Intrinsics.checkNotNullParameter(listData, "listData");
        this.isSuccess = z4;
        this.errMessage = errMessage;
        this.isRefresh = z5;
        this.isEmpty = z6;
        this.hasMore = z7;
        this.isFirstEmpty = z8;
        this.listData = listData;
    }

    public static /* synthetic */ ListDataUiState copy$default(ListDataUiState listDataUiState, boolean z4, String str, boolean z5, boolean z6, boolean z7, boolean z8, ArrayList arrayList, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = listDataUiState.isSuccess;
        }
        if ((i4 & 2) != 0) {
            str = listDataUiState.errMessage;
        }
        String str2 = str;
        if ((i4 & 4) != 0) {
            z5 = listDataUiState.isRefresh;
        }
        boolean z9 = z5;
        if ((i4 & 8) != 0) {
            z6 = listDataUiState.isEmpty;
        }
        boolean z10 = z6;
        if ((i4 & 16) != 0) {
            z7 = listDataUiState.hasMore;
        }
        boolean z11 = z7;
        if ((i4 & 32) != 0) {
            z8 = listDataUiState.isFirstEmpty;
        }
        boolean z12 = z8;
        ArrayList<T> arrayList2 = arrayList;
        if ((i4 & 64) != 0) {
            arrayList2 = listDataUiState.listData;
        }
        return listDataUiState.copy(z4, str2, z9, z10, z11, z12, arrayList2);
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

    @NotNull
    public final ArrayList<T> component7() {
        return this.listData;
    }

    @NotNull
    public final ListDataUiState<T> copy(boolean z4, @NotNull String errMessage, boolean z5, boolean z6, boolean z7, boolean z8, @NotNull ArrayList<T> listData) {
        Intrinsics.checkNotNullParameter(errMessage, "errMessage");
        Intrinsics.checkNotNullParameter(listData, "listData");
        return new ListDataUiState<>(z4, errMessage, z5, z6, z7, z8, listData);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ListDataUiState) {
            ListDataUiState listDataUiState = (ListDataUiState) obj;
            return this.isSuccess == listDataUiState.isSuccess && Intrinsics.areEqual(this.errMessage, listDataUiState.errMessage) && this.isRefresh == listDataUiState.isRefresh && this.isEmpty == listDataUiState.isEmpty && this.hasMore == listDataUiState.hasMore && this.isFirstEmpty == listDataUiState.isFirstEmpty && Intrinsics.areEqual(this.listData, listDataUiState.listData);
        }
        return false;
    }

    @NotNull
    public final String getErrMessage() {
        return this.errMessage;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    @NotNull
    public final ArrayList<T> getListData() {
        return this.listData;
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
        return ((i9 + (z5 ? 1 : z5 ? 1 : 0)) * 31) + this.listData.hashCode();
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
        return "ListDataUiState(isSuccess=" + this.isSuccess + ", errMessage=" + this.errMessage + ", isRefresh=" + this.isRefresh + ", isEmpty=" + this.isEmpty + ", hasMore=" + this.hasMore + ", isFirstEmpty=" + this.isFirstEmpty + ", listData=" + this.listData + ')';
    }

    public /* synthetic */ ListDataUiState(boolean z4, String str, boolean z5, boolean z6, boolean z7, boolean z8, ArrayList arrayList, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? false : z5, (i4 & 8) != 0 ? false : z6, (i4 & 16) != 0 ? false : z7, (i4 & 32) == 0 ? z8 : false, (i4 & 64) != 0 ? new ArrayList() : arrayList);
    }
}
