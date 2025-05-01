package com.wufan.friend.chat.protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
/* compiled from: ResponseOrBuilder.java */
/* loaded from: classes6.dex */
public interface z1 extends MessageLiteOrBuilder {
    int B1();

    int C();

    ServiceName E();

    int I();

    String K();

    ByteString N();

    NotificationType U();

    int e1();

    x1 getData();

    String getMessage();

    ByteString getMessageBytes();

    ServicePath getPath();

    long getRequestId();

    ResponseStatus getStatus();

    long getTimestamp();

    int h1();

    boolean m();

    ResponseType r0();
}
