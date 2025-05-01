package kotlin.collections.unsigned;

import java.util.RandomAccess;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysKt;
/* compiled from: _UArraysJvm.kt */
/* loaded from: classes6.dex */
public final class UArraysKt___UArraysJvmKt$asList$2 extends AbstractList<ULong> implements RandomAccess {
    final /* synthetic */ long[] $this_asList;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UArraysKt___UArraysJvmKt$asList$2(long[] jArr) {
        this.$this_asList = jArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ULong) {
            return m554containsVKZWuLQ(((ULong) obj).m261unboximpl());
        }
        return false;
    }

    /* renamed from: contains-VKZWuLQ  reason: not valid java name */
    public boolean m554containsVKZWuLQ(long j4) {
        return ULongArray.m265containsVKZWuLQ(this.$this_asList, j4);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i4) {
        return ULong.m203boximpl(m555getsVKNKU(i4));
    }

    /* renamed from: get-s-VKNKU  reason: not valid java name */
    public long m555getsVKNKU(int i4) {
        return ULongArray.m269getsVKNKU(this.$this_asList, i4);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return ULongArray.m270getSizeimpl(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ULong) {
            return m556indexOfVKZWuLQ(((ULong) obj).m261unboximpl());
        }
        return -1;
    }

    /* renamed from: indexOf-VKZWuLQ  reason: not valid java name */
    public int m556indexOfVKZWuLQ(long j4) {
        int indexOf;
        indexOf = ArraysKt___ArraysKt.indexOf(this.$this_asList, j4);
        return indexOf;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return ULongArray.m272isEmptyimpl(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ULong) {
            return m557lastIndexOfVKZWuLQ(((ULong) obj).m261unboximpl());
        }
        return -1;
    }

    /* renamed from: lastIndexOf-VKZWuLQ  reason: not valid java name */
    public int m557lastIndexOfVKZWuLQ(long j4) {
        int lastIndexOf;
        lastIndexOf = ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, j4);
        return lastIndexOf;
    }
}
