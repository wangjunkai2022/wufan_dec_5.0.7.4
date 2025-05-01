package com.wufan.friend.chat.protocol;

import com.google.protobuf.MessageLiteOrBuilder;
import com.wufan.friend.chat.protocol.PlayGameArgs;
import java.util.List;
/* compiled from: PlayGameArgsOrBuilder.java */
/* loaded from: classes6.dex */
public interface c1 extends MessageLiteOrBuilder {
    boolean F();

    int Q1();

    List<Long> R2();

    int d();

    long e2(int i4);

    long f();

    long getGameId();

    PlayGameArgs.State getState();

    int getStateValue();

    PlayType getType();

    int getTypeValue();
}
