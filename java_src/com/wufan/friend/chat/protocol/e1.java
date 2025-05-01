package com.wufan.friend.chat.protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
/* compiled from: PlayStateOrBuilder.java */
/* loaded from: classes6.dex */
public interface e1 extends MessageLiteOrBuilder {
    PlayType a0();

    long f();

    long getGameId();

    String getGameName();

    ByteString getGameNameBytes();

    int getRoomType();

    int t0();
}
