package com.tencent.cos.task.slice;

import java.io.Serializable;
/* loaded from: classes6.dex */
public class SlicePart implements Serializable {
    private static final long serialVersionUID = -8847711809744693626L;
    private long offset;
    private boolean overFlag;
    private int sliceSize;

    public long getOffset() {
        return this.offset;
    }

    public boolean getOverFlag() {
        return this.overFlag;
    }

    public int getSliceSize() {
        return this.sliceSize;
    }

    public void setOffset(long j4) {
        this.offset = j4;
    }

    public void setOverFlag(boolean z4) {
        this.overFlag = z4;
    }

    public void setSliceSize(int i4) {
        this.sliceSize = i4;
    }
}
