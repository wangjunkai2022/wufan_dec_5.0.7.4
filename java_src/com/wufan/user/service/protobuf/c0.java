package com.wufan.user.service.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
/* compiled from: RequestParametersOrBuilder.java */
/* loaded from: classes6.dex */
public interface c0 extends MessageLiteOrBuilder {
    ByteString a();

    ByteString b();

    String c();

    String getAppVersion();

    String getToken();

    ByteString getTokenBytes();

    int getUid();
}
