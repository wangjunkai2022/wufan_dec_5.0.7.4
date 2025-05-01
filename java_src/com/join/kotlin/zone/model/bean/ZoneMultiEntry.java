package com.join.kotlin.zone.model.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ZoneMultiEntry.kt */
/* loaded from: classes3.dex */
public final class ZoneMultiEntry {
    @Nullable
    private final Integer componentId;
    @Nullable
    private final Object data;
    private final int viewType;

    public ZoneMultiEntry(int i4, @Nullable Integer num, @Nullable Object obj) {
        this.viewType = i4;
        this.componentId = num;
        this.data = obj;
    }

    public static /* synthetic */ ZoneMultiEntry copy$default(ZoneMultiEntry zoneMultiEntry, int i4, Integer num, Object obj, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            i4 = zoneMultiEntry.viewType;
        }
        if ((i5 & 2) != 0) {
            num = zoneMultiEntry.componentId;
        }
        if ((i5 & 4) != 0) {
            obj = zoneMultiEntry.data;
        }
        return zoneMultiEntry.copy(i4, num, obj);
    }

    public final int component1() {
        return this.viewType;
    }

    @Nullable
    public final Integer component2() {
        return this.componentId;
    }

    @Nullable
    public final Object component3() {
        return this.data;
    }

    @NotNull
    public final ZoneMultiEntry copy(int i4, @Nullable Integer num, @Nullable Object obj) {
        return new ZoneMultiEntry(i4, num, obj);
    }

    @Nullable
    public final <T> T dataVal() {
        T t4 = (T) this.data;
        if (t4 == null) {
            return null;
        }
        return t4;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneMultiEntry) {
            ZoneMultiEntry zoneMultiEntry = (ZoneMultiEntry) obj;
            return this.viewType == zoneMultiEntry.viewType && Intrinsics.areEqual(this.componentId, zoneMultiEntry.componentId) && Intrinsics.areEqual(this.data, zoneMultiEntry.data);
        }
        return false;
    }

    @Nullable
    public final Integer getComponentId() {
        return this.componentId;
    }

    @Nullable
    public final Object getData() {
        return this.data;
    }

    public final int getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        int i4 = this.viewType * 31;
        Integer num = this.componentId;
        int hashCode = (i4 + (num == null ? 0 : num.hashCode())) * 31;
        Object obj = this.data;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ZoneMultiEntry(viewType=" + this.viewType + ", componentId=" + this.componentId + ", data=" + this.data + ')';
    }

    public /* synthetic */ ZoneMultiEntry(int i4, Integer num, Object obj, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, (i5 & 2) != 0 ? 0 : num, obj);
    }
}
