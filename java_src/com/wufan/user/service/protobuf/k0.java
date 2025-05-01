package com.wufan.user.service.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.wufan.user.service.protobuf.enumeration.TheThirdPartLoginType;
/* compiled from: TheThirdPartyLoginRequestParametersOrBuilder.java */
/* loaded from: classes6.dex */
public interface k0 extends MessageLiteOrBuilder {
    ByteString a();

    ByteString b();

    String c();

    String getAppVersion();

    String l();

    int n();

    ByteString o();

    TheThirdPartLoginType t();
}
