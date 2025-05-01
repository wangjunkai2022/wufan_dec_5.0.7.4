package com.wufan.user.service.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.wufan.user.service.protobuf.enumeration.ContentType;
import com.wufan.user.service.protobuf.enumeration.SourceType;
/* compiled from: SmsCodeRequestParametersOrBuilder.java */
/* loaded from: classes6.dex */
public interface i0 extends MessageLiteOrBuilder {
    int H2();

    int K2();

    SourceType P1();

    ByteString a();

    ByteString b();

    String c();

    String getAppVersion();

    ContentType getContentType();

    int getUid();

    ByteString x();

    String z();
}
