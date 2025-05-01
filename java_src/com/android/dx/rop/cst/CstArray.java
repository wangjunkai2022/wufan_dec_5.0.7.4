package com.android.dx.rop.cst;

import com.android.dx.util.FixedSizeList;
import java.util.Objects;
/* loaded from: classes.dex */
public class CstArray extends Constant {
    private final List list;

    /* loaded from: classes.dex */
    public static final class List extends FixedSizeList implements Comparable<List> {
        public List(int i4) {
            super(i4);
        }

        public Constant get(int i4) {
            return (Constant) get0(i4);
        }

        public void set(int i4, Constant constant) {
            set0(i4, constant);
        }

        @Override // java.lang.Comparable
        public int compareTo(List list) {
            int size = size();
            int size2 = list.size();
            int i4 = size < size2 ? size : size2;
            for (int i5 = 0; i5 < i4; i5++) {
                int compareTo = ((Constant) get0(i5)).compareTo((Constant) list.get0(i5));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            if (size < size2) {
                return -1;
            }
            return size > size2 ? 1 : 0;
        }
    }

    public CstArray(List list) {
        Objects.requireNonNull(list, "list == null");
        list.throwIfMutable();
        this.list = list;
    }

    @Override // com.android.dx.rop.cst.Constant
    protected int compareTo0(Constant constant) {
        return this.list.compareTo(((CstArray) constant).list);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CstArray) {
            return this.list.equals(((CstArray) obj).list);
        }
        return false;
    }

    public List getList() {
        return this.list;
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    @Override // com.android.dx.rop.cst.Constant
    public boolean isCategory2() {
        return false;
    }

    @Override // com.android.dx.util.ToHuman
    public String toHuman() {
        return this.list.toHuman("{", ", ", "}");
    }

    public String toString() {
        return this.list.toString("array{", ", ", "}");
    }

    @Override // com.android.dx.rop.cst.Constant
    public String typeName() {
        return "array";
    }
}
