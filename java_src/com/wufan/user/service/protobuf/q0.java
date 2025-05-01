package com.wufan.user.service.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
/* compiled from: UserLoginRequestParametersOrBuilder.java */
/* loaded from: classes6.dex */
public interface q0 extends MessageLiteOrBuilder {
    ByteString a();

    ByteString b();

    String c();

    String getAccount();

    String getAppVersion();

    String getPassword();

    ByteString getPasswordBytes();

    ByteString h();
}
