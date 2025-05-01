package com.xinzhu.overmind.server.accounts;

import android.accounts.AuthenticatorDescription;
import android.os.Handler;
import com.xinzhu.overmind.server.pm.m;
import com.xinzhu.overmind.server.pm.n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;
/* compiled from: IAccountAuthenticatorCache.java */
/* loaded from: classes.dex */
public interface d {
    void a(int i4);

    void b(int i4);

    void c(n<AuthenticatorDescription> nVar, Handler handler);

    m.d<AuthenticatorDescription> d(AuthenticatorDescription authenticatorDescription, int i4);

    Collection<m.d<AuthenticatorDescription>> e(int i4);

    void f(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr, int i4);
}
