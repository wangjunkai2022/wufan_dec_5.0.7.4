package kotlin.collections;

import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
/* compiled from: _ArraysJvm.kt */
/* loaded from: classes.dex */
public final class ArraysKt___ArraysJvmKt$asList$8 extends AbstractList<Character> implements RandomAccess {
    final /* synthetic */ char[] $this_asList;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArraysKt___ArraysJvmKt$asList$8(char[] cArr) {
        this.$this_asList = cArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Character) {
            return contains(((Character) obj).charValue());
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.$this_asList.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Character) {
            return indexOf(((Character) obj).charValue());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.$this_asList.length == 0;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Character) {
            return lastIndexOf(((Character) obj).charValue());
        }
        return -1;
    }

    public boolean contains(char c5) {
        boolean contains;
        contains = ArraysKt___ArraysKt.contains(this.$this_asList, c5);
        return contains;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @NotNull
    public Character get(int i4) {
        return Character.valueOf(this.$this_asList[i4]);
    }

    public int indexOf(char c5) {
        return ArraysKt___ArraysKt.indexOf(this.$this_asList, c5);
    }

    public int lastIndexOf(char c5) {
        return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, c5);
    }
}
