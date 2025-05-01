package com.android.dx.cf.code;

import com.android.dx.rop.code.LocalItem;
import com.android.dx.rop.cst.CstString;
import com.android.dx.rop.type.Type;
import com.android.dx.util.FixedSizeList;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class LocalVariableList extends FixedSizeList {
    public static final LocalVariableList EMPTY = new LocalVariableList(0);

    /* loaded from: classes2.dex */
    public static class Item {
        private final CstString descriptor;
        private final int index;
        private final int length;
        private final CstString name;
        private final CstString signature;
        private final int startPc;

        public Item(int i4, int i5, CstString cstString, CstString cstString2, CstString cstString3, int i6) {
            if (i4 < 0) {
                throw new IllegalArgumentException("startPc < 0");
            }
            if (i5 >= 0) {
                Objects.requireNonNull(cstString, "name == null");
                if (cstString2 == null) {
                    Objects.requireNonNull(cstString3, "(descriptor == null) && (signature == null)");
                }
                if (i6 >= 0) {
                    this.startPc = i4;
                    this.length = i5;
                    this.name = cstString;
                    this.descriptor = cstString2;
                    this.signature = cstString3;
                    this.index = i6;
                    return;
                }
                throw new IllegalArgumentException("index < 0");
            }
            throw new IllegalArgumentException("length < 0");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CstString getSignature() {
            return this.signature;
        }

        public CstString getDescriptor() {
            return this.descriptor;
        }

        public int getIndex() {
            return this.index;
        }

        public int getLength() {
            return this.length;
        }

        public LocalItem getLocalItem() {
            return LocalItem.make(this.name, this.signature);
        }

        public int getStartPc() {
            return this.startPc;
        }

        public Type getType() {
            return Type.intern(this.descriptor.getString());
        }

        public boolean matchesAllButType(Item item) {
            return this.startPc == item.startPc && this.length == item.length && this.index == item.index && this.name.equals(item.name);
        }

        public boolean matchesPcAndIndex(int i4, int i5) {
            int i6;
            return i5 == this.index && i4 >= (i6 = this.startPc) && i4 < i6 + this.length;
        }

        public Item withSignature(CstString cstString) {
            return new Item(this.startPc, this.length, this.name, this.descriptor, cstString, this.index);
        }
    }

    public LocalVariableList(int i4) {
        super(i4);
    }

    public static LocalVariableList concat(LocalVariableList localVariableList, LocalVariableList localVariableList2) {
        if (localVariableList == EMPTY) {
            return localVariableList2;
        }
        int size = localVariableList.size();
        int size2 = localVariableList2.size();
        LocalVariableList localVariableList3 = new LocalVariableList(size + size2);
        for (int i4 = 0; i4 < size; i4++) {
            localVariableList3.set(i4, localVariableList.get(i4));
        }
        for (int i5 = 0; i5 < size2; i5++) {
            localVariableList3.set(size + i5, localVariableList2.get(i5));
        }
        localVariableList3.setImmutable();
        return localVariableList3;
    }

    public static LocalVariableList mergeDescriptorsAndSignatures(LocalVariableList localVariableList, LocalVariableList localVariableList2) {
        int size = localVariableList.size();
        LocalVariableList localVariableList3 = new LocalVariableList(size);
        for (int i4 = 0; i4 < size; i4++) {
            Item item = localVariableList.get(i4);
            Item itemToLocal = localVariableList2.itemToLocal(item);
            if (itemToLocal != null) {
                item = item.withSignature(itemToLocal.getSignature());
            }
            localVariableList3.set(i4, item);
        }
        localVariableList3.setImmutable();
        return localVariableList3;
    }

    public Item get(int i4) {
        return (Item) get0(i4);
    }

    public Item itemToLocal(Item item) {
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            Item item2 = (Item) get0(i4);
            if (item2 != null && item2.matchesAllButType(item)) {
                return item2;
            }
        }
        return null;
    }

    public Item pcAndIndexToLocal(int i4, int i5) {
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            Item item = (Item) get0(i6);
            if (item != null && item.matchesPcAndIndex(i4, i5)) {
                return item;
            }
        }
        return null;
    }

    public void set(int i4, Item item) {
        Objects.requireNonNull(item, "item == null");
        set0(i4, item);
    }

    public void set(int i4, int i5, int i6, CstString cstString, CstString cstString2, CstString cstString3, int i7) {
        set0(i4, new Item(i5, i6, cstString, cstString2, cstString3, i7));
    }
}
