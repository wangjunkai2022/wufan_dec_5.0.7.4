package com.xinzhu.overmind.client.hook;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.xinzhu.haunted.android.os.f;
import com.xinzhu.haunted.android.os.s;
import java.io.FileDescriptor;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public abstract class BinderInvocationStub extends b implements IBinder {
    public static final String TAG = BinderInvocationStub.class.getSimpleName();
    private IBinder mBaseBinder;

    /* loaded from: classes.dex */
    class a extends e {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "asBinder";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return BinderInvocationStub.this.mBaseBinder;
        }
    }

    public BinderInvocationStub(IBinder iBinder) {
        this.mBaseBinder = iBinder;
    }

    @Override // android.os.IBinder
    public void dump(@NonNull FileDescriptor fileDescriptor, @Nullable String[] strArr) throws RemoteException {
        this.mBaseBinder.dump(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    public void dumpAsync(@NonNull FileDescriptor fileDescriptor, @Nullable String[] strArr) throws RemoteException {
        this.mBaseBinder.dumpAsync(fileDescriptor, strArr);
    }

    public IBinder getExtension() throws RemoteException {
        IBinder b5 = new f(this.mBaseBinder).b();
        String str = TAG;
        com.xinzhu.overmind.b.c(str, "BinderInvocationStub getExtension get result:" + b5);
        return b5;
    }

    @Override // android.os.IBinder
    @Nullable
    public String getInterfaceDescriptor() throws RemoteException {
        return this.mBaseBinder.getInterfaceDescriptor();
    }

    @Override // android.os.IBinder
    public boolean isBinderAlive() {
        return this.mBaseBinder.isBinderAlive();
    }

    @Override // android.os.IBinder
    public void linkToDeath(@NonNull IBinder.DeathRecipient deathRecipient, int i4) throws RemoteException {
        this.mBaseBinder.linkToDeath(deathRecipient, i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        addMethodHook(new a());
    }

    @Override // android.os.IBinder
    public boolean pingBinder() {
        return this.mBaseBinder.pingBinder();
    }

    @Override // android.os.IBinder
    @Nullable
    public IInterface queryLocalInterface(@NonNull String str) {
        return (IInterface) getProxyInvocation();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void replaceSystemService(String str) {
        s.k().put(str, this);
    }

    @Override // android.os.IBinder
    public boolean transact(int i4, @NonNull Parcel parcel, @Nullable Parcel parcel2, int i5) throws RemoteException {
        return this.mBaseBinder.transact(i4, parcel, parcel2, i5);
    }

    @Override // android.os.IBinder
    public boolean unlinkToDeath(@NonNull IBinder.DeathRecipient deathRecipient, int i4) {
        return this.mBaseBinder.unlinkToDeath(deathRecipient, i4);
    }
}
