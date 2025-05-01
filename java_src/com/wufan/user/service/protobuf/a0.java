package com.wufan.user.service.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.wufan.user.service.protobuf.enumeration.TheThirdPartLoginType;
/* compiled from: RequestOrBuilder.java */
/* loaded from: classes6.dex */
public interface a0 extends MessageLiteOrBuilder {
    ByteString M1();

    ByteString a();

    ByteString b();

    String c();

    String getAccount();

    String getAppId();

    String getAppVersion();

    String getPassword();

    ByteString getPasswordBytes();

    ByteString h();

    String l();

    int n();

    ByteString o();

    ByteString p();

    String r();

    ByteString s();

    TheThirdPartLoginType t();

    String v();
}
