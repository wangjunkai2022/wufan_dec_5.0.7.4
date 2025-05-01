package com.xinzhu.overmind.server.os;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.AtomicFile;
import com.xinzhu.overmind.server.os.a;
import com.xinzhu.overmind.utils.k;
import com.xinzhu.overmind.utils.m;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
/* compiled from: MindDeviceInfoService.java */
/* loaded from: classes.dex */
public class e extends a.b implements com.xinzhu.overmind.server.d {
    public static final String TAG = e.class.getSimpleName();
    private static final e sService = new e();
    private final Map<Integer, MindDeviceInfo> mDeviceInfoMap = new HashMap();
    private boolean mGlobalEnable = true;

    public e() {
        loadPersistence();
    }

    public static e get() {
        return sService;
    }

    private MindDeviceInfo getOrGenerateMindDeviceInfoLocked(int i4) {
        MindDeviceInfo mindDeviceInfo = this.mDeviceInfoMap.get(Integer.valueOf(i4));
        if (mindDeviceInfo == null) {
            MindDeviceInfo a5 = MindDeviceInfo.a();
            this.mDeviceInfoMap.put(Integer.valueOf(i4), a5);
            savePersistence();
            return a5;
        }
        return mindDeviceInfo;
    }

    @Override // com.xinzhu.overmind.server.os.a
    public MindDeviceInfo getDeviceInfo(int i4) throws RemoteException {
        synchronized (this.mDeviceInfoMap) {
            if (this.mGlobalEnable) {
                return getOrGenerateMindDeviceInfoLocked(i4);
            }
            return null;
        }
    }

    public void loadPersistence() {
        Parcel obtain = Parcel.obtain();
        File z4 = com.xinzhu.overmind.a.z();
        if (z4.exists()) {
            try {
                byte[] v2 = k.v(z4);
                obtain.unmarshall(v2, 0, v2.length);
                obtain.setDataPosition(0);
                this.mDeviceInfoMap.clear();
                this.mGlobalEnable = obtain.readByte() != 0;
                int readInt = obtain.readInt();
                for (int i4 = 0; i4 < readInt; i4++) {
                    this.mDeviceInfoMap.put(Integer.valueOf(obtain.readInt()), (MindDeviceInfo) obtain.readParcelable(MindDeviceInfo.class.getClassLoader()));
                }
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public void savePersistence() {
        Parcel obtain = Parcel.obtain();
        AtomicFile atomicFile = new AtomicFile(com.xinzhu.overmind.a.z());
        FileOutputStream fileOutputStream = null;
        try {
            obtain.writeByte(this.mGlobalEnable ? (byte) 1 : (byte) 0);
            obtain.writeInt(this.mDeviceInfoMap.size());
            for (Map.Entry<Integer, MindDeviceInfo> entry : this.mDeviceInfoMap.entrySet()) {
                obtain.writeInt(entry.getKey().intValue());
                obtain.writeParcelable(entry.getValue(), 0);
            }
            obtain.setDataPosition(0);
            fileOutputStream = atomicFile.startWrite();
            k.z(obtain, fileOutputStream);
            atomicFile.finishWrite(fileOutputStream);
            obtain.recycle();
            m.a(fileOutputStream);
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                atomicFile.failWrite(fileOutputStream);
                obtain.recycle();
                m.a(fileOutputStream);
            } catch (Throwable th2) {
                obtain.recycle();
                m.a(fileOutputStream);
                throw th2;
            }
        }
    }

    @Override // com.xinzhu.overmind.server.os.a
    public void setVirtualDeviceStatus(boolean z4) throws RemoteException {
        this.mGlobalEnable = z4;
        savePersistence();
    }

    @Override // com.xinzhu.overmind.server.d
    public void systemReady() {
    }

    @Override // com.xinzhu.overmind.server.os.a
    public void updateMindDeviceInfo(int i4, MindDeviceInfo mindDeviceInfo) throws RemoteException {
        synchronized (this.mDeviceInfoMap) {
            if (mindDeviceInfo != null) {
                this.mDeviceInfoMap.put(Integer.valueOf(i4), mindDeviceInfo);
                savePersistence();
            }
        }
    }
}
