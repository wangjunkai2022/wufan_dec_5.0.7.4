package com.android.dx.dex.code;

import com.android.dx.rop.code.SourcePosition;
import com.android.dx.util.FixedSizeList;
import java.util.Objects;
/* loaded from: classes.dex */
public final class PositionList extends FixedSizeList {
    public static final PositionList EMPTY = new PositionList(0);
    public static final int IMPORTANT = 3;
    public static final int LINES = 2;
    public static final int NONE = 1;

    /* loaded from: classes.dex */
    public static class Entry {
        private final int address;
        private final SourcePosition position;

        public Entry(int i4, SourcePosition sourcePosition) {
            if (i4 >= 0) {
                Objects.requireNonNull(sourcePosition, "position == null");
                this.address = i4;
                this.position = sourcePosition;
                return;
            }
            throw new IllegalArgumentException("address < 0");
        }

        public int getAddress() {
            return this.address;
        }

        public SourcePosition getPosition() {
            return this.position;
        }
    }

    public PositionList(int i4) {
        super(i4);
    }

    public static PositionList make(DalvInsnList dalvInsnList, int i4) {
        if (i4 != 1) {
            if (i4 != 2 && i4 != 3) {
                throw new IllegalArgumentException("bogus howMuch");
            }
            SourcePosition sourcePosition = SourcePosition.NO_INFO;
            int size = dalvInsnList.size();
            Entry[] entryArr = new Entry[size];
            SourcePosition sourcePosition2 = sourcePosition;
            int i5 = 0;
            boolean z4 = false;
            for (int i6 = 0; i6 < size; i6++) {
                DalvInsn dalvInsn = dalvInsnList.get(i6);
                if (dalvInsn instanceof CodeAddress) {
                    z4 = true;
                } else {
                    SourcePosition position = dalvInsn.getPosition();
                    if (!position.equals(sourcePosition) && !position.sameLine(sourcePosition2) && (i4 != 3 || z4)) {
                        entryArr[i5] = new Entry(dalvInsn.getAddress(), position);
                        i5++;
                        sourcePosition2 = position;
                        z4 = false;
                    }
                }
            }
            PositionList positionList = new PositionList(i5);
            for (int i7 = 0; i7 < i5; i7++) {
                positionList.set(i7, entryArr[i7]);
            }
            positionList.setImmutable();
            return positionList;
        }
        return EMPTY;
    }

    public Entry get(int i4) {
        return (Entry) get0(i4);
    }

    public void set(int i4, Entry entry) {
        set0(i4, entry);
    }
}
