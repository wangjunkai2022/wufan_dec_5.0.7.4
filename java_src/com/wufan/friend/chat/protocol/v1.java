package com.wufan.friend.chat.protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
/* compiled from: RequestOrBuilder.java */
/* loaded from: classes6.dex */
public interface v1 extends MessageLiteOrBuilder {
    int C();

    ServiceName E();

    int I();

    t1 J();

    ByteString a();

    String getAppVersion();

    ServicePath getPath();

    Platform getPlatform();

    int getPlatformValue();

    long getRequestId();

    long getTimestamp();

    boolean x1();
}
