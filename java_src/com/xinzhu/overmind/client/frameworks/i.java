package com.xinzhu.overmind.client.frameworks;

import android.os.RemoteException;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.server.user.MindUserInfo;
import com.xinzhu.overmind.server.user.a;
import java.util.Collections;
import java.util.List;
/* compiled from: MindUserManager.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: b  reason: collision with root package name */
    private static i f67564b = new i();

    /* renamed from: a  reason: collision with root package name */
    private com.xinzhu.overmind.server.user.a f67565a;

    public static i d() {
        return f67564b;
    }

    private com.xinzhu.overmind.server.user.a e() {
        com.xinzhu.overmind.server.user.a aVar = this.f67565a;
        if (aVar != null && aVar.asBinder().isBinderAlive()) {
            return this.f67565a;
        }
        this.f67565a = a.b.asInterface(Overmind.get().getService(com.xinzhu.overmind.server.i.f67996h));
        return e();
    }

    public MindUserInfo a(int i4) {
        try {
            return e().createUser(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public void b(int i4) {
        try {
            e().deleteUser(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public boolean c(int i4) {
        try {
            return e().exists(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public List<MindUserInfo> f() {
        try {
            return e().getUsers();
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return Collections.emptyList();
        }
    }
}
