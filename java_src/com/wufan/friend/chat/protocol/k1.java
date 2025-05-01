package com.wufan.friend.chat.protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.wufan.friend.chat.protocol.RecommendPlayerArgs;
import java.util.List;
/* compiled from: RecommendPlayerArgsOrBuilder.java */
/* loaded from: classes6.dex */
public interface k1 extends MessageLiteOrBuilder {
    long A0(int i4);

    RecommendPlayerArgs.FriendLocationPageType F0();

    ByteString c1();

    long getGameId();

    int k0();

    int q1();

    List<Long> u1();

    String w0();
}
