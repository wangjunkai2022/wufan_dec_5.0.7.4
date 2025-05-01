package com.xinzhu.overmind.server.user;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.core.util.AtomicFile;
import com.xinzhu.overmind.server.d;
import com.xinzhu.overmind.server.pm.i;
import com.xinzhu.overmind.server.user.a;
import com.xinzhu.overmind.utils.k;
import com.xinzhu.overmind.utils.m;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: MindUserManagerService.java */
/* loaded from: classes.dex */
public class c extends a.b implements d {
    private static c sService = new c();
    public final HashMap<Integer, MindUserInfo> mUsers = new HashMap<>();
    public final Object mUserLock = new Object();
    private List<b> mUserListeners = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindUserManagerService.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f68261b;

        a(int i4) {
            this.f68261b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (String str : com.xinzhu.overmind.client.hook.env.a.a()) {
                if (!i.get().isInstalled(str, this.f68261b) && i.get().isInstalled(str, 0)) {
                    i.get().installPackageAsExist(str, this.f68261b);
                }
            }
        }
    }

    private MindUserInfo createUserLocked(int i4) {
        MindUserInfo mindUserInfo = new MindUserInfo();
        mindUserInfo.f68255b = i4;
        mindUserInfo.f68256c = MindUserStatus.ENABLE;
        this.mUsers.put(Integer.valueOf(i4), mindUserInfo);
        synchronized (this.mUsers) {
            saveUserInfoLocked();
        }
        for (b bVar : this.mUserListeners) {
            bVar.b(i4);
        }
        if (com.xinzhu.overmind.client.hook.env.b.a()) {
            com.xinzhu.overmind.client.hook.env.b.d(i4);
        }
        if (i4 != 0) {
            new Thread(new a(i4)).start();
        }
        return mindUserInfo;
    }

    public static c get() {
        return sService;
    }

    private void saveUserInfoLocked() {
        Parcel obtain = Parcel.obtain();
        AtomicFile atomicFile = new AtomicFile(com.xinzhu.overmind.a.Z());
        try {
            obtain.writeTypedList(new ArrayList(this.mUsers.values()));
            FileOutputStream fileOutputStream = null;
            try {
                fileOutputStream = atomicFile.startWrite();
                k.z(obtain, fileOutputStream);
                atomicFile.finishWrite(fileOutputStream);
                m.a(fileOutputStream);
            } catch (IOException e5) {
                e5.printStackTrace();
                atomicFile.failWrite(fileOutputStream);
                m.a(fileOutputStream);
            }
        } finally {
            obtain.recycle();
        }
    }

    private void scanUserL() {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e5;
        ArrayList createTypedArrayList;
        synchronized (this.mUserLock) {
            Parcel obtain = Parcel.obtain();
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    obtain.recycle();
                    m.a(null);
                    throw th;
                }
            } catch (Exception e6) {
                fileInputStream = null;
                e5 = e6;
            } catch (Throwable th3) {
                th = th3;
                obtain.recycle();
                m.a(null);
                throw th;
            }
            if (!com.xinzhu.overmind.a.Z().exists()) {
                obtain.recycle();
                m.a(null);
                return;
            }
            fileInputStream = new FileInputStream(com.xinzhu.overmind.a.Z());
            try {
                byte[] w4 = k.w(fileInputStream);
                obtain.unmarshall(w4, 0, w4.length);
                obtain.setDataPosition(0);
                createTypedArrayList = obtain.createTypedArrayList(MindUserInfo.CREATOR);
            } catch (Exception e7) {
                e5 = e7;
                e5.printStackTrace();
                obtain.recycle();
                m.a(fileInputStream);
            }
            if (createTypedArrayList == null) {
                obtain.recycle();
                m.a(fileInputStream);
                return;
            }
            synchronized (this.mUsers) {
                this.mUsers.clear();
                Iterator it2 = createTypedArrayList.iterator();
                while (it2.hasNext()) {
                    MindUserInfo mindUserInfo = (MindUserInfo) it2.next();
                    this.mUsers.put(Integer.valueOf(mindUserInfo.f68255b), mindUserInfo);
                }
            }
            obtain.recycle();
            m.a(fileInputStream);
        }
    }

    @Override // com.xinzhu.overmind.server.user.a
    public MindUserInfo createUser(int i4) throws RemoteException {
        synchronized (this.mUserLock) {
            if (exists(i4)) {
                return getUserInfo(i4);
            }
            return createUserLocked(i4);
        }
    }

    @Override // com.xinzhu.overmind.server.user.a
    public void deleteUser(int i4) throws RemoteException {
        synchronized (this.mUserLock) {
            synchronized (this.mUsers) {
                i.get().deleteUser(i4);
                this.mUsers.remove(Integer.valueOf(i4));
                saveUserInfoLocked();
                k.j(com.xinzhu.overmind.a.X(i4));
                for (b bVar : this.mUserListeners) {
                    bVar.c(i4);
                    bVar.a(i4);
                }
            }
        }
    }

    @Override // com.xinzhu.overmind.server.user.a
    public boolean exists(int i4) {
        boolean z4;
        synchronized (this.mUsers) {
            z4 = this.mUsers.get(Integer.valueOf(i4)) != null;
        }
        return z4;
    }

    public List<MindUserInfo> getAllUsers() {
        ArrayList arrayList;
        synchronized (this.mUsers) {
            arrayList = new ArrayList(this.mUsers.values());
        }
        return arrayList;
    }

    @Override // com.xinzhu.overmind.server.user.a
    public MindUserInfo getUserInfo(int i4) {
        MindUserInfo mindUserInfo;
        synchronized (this.mUserLock) {
            mindUserInfo = this.mUsers.get(Integer.valueOf(i4));
        }
        return mindUserInfo;
    }

    @Override // com.xinzhu.overmind.server.user.a
    public List<MindUserInfo> getUsers() {
        ArrayList arrayList;
        synchronized (this.mUsers) {
            arrayList = new ArrayList();
            for (MindUserInfo mindUserInfo : this.mUsers.values()) {
                if (mindUserInfo.f68255b >= 0) {
                    arrayList.add(mindUserInfo);
                }
            }
        }
        return arrayList;
    }

    public void registerListener(b bVar) {
        synchronized (this.mUserLock) {
            this.mUserListeners.add(bVar);
        }
    }

    public void removeListener(b bVar) {
        synchronized (this.mUserLock) {
            this.mUserListeners.remove(bVar);
        }
    }

    @Override // com.xinzhu.overmind.server.d
    public void systemReady() {
        scanUserL();
    }
}
