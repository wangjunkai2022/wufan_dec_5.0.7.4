package io.netty.util;
/* loaded from: classes6.dex */
public interface ReferenceCounted {
    int refCnt();

    boolean release();

    boolean release(int i4);

    ReferenceCounted retain();

    ReferenceCounted retain(int i4);

    ReferenceCounted touch();

    ReferenceCounted touch(Object obj);
}
