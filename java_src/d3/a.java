package d3;

import android.os.Parcel;
import com.xinzhu.overmind.client.frameworks.c;
import com.xinzhu.overmind.server.os.MindDeviceInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/* compiled from: DeviceConfigIniSolver.java */
/* loaded from: classes6.dex */
public class a {
    public static void a() {
        int length;
        byte[] bArr;
        int read;
        File c5 = com.xinzhu.datatransfer.b.c();
        Parcel obtain = Parcel.obtain();
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(c5);
                length = (int) c5.length();
                bArr = new byte[length];
                read = fileInputStream.read(bArr);
                fileInputStream.close();
            } catch (Exception e5) {
                if (!(e5 instanceof FileNotFoundException)) {
                    e5.printStackTrace();
                }
            }
            if (read == length) {
                obtain.unmarshall(bArr, 0, length);
                obtain.setDataPosition(0);
                obtain.readInt();
                int readInt = obtain.readInt();
                for (int i4 = 0; i4 < readInt; i4++) {
                    MindDeviceInfo mindDeviceInfo = new MindDeviceInfo();
                    int readInt2 = obtain.readInt();
                    mindDeviceInfo.f68007b = obtain.readByte() != 0;
                    mindDeviceInfo.f68009d = obtain.readString();
                    mindDeviceInfo.f68008c = obtain.readString();
                    mindDeviceInfo.f68011f = obtain.readString();
                    mindDeviceInfo.f68012g = obtain.readString();
                    mindDeviceInfo.f68010e = obtain.readString();
                    mindDeviceInfo.f68013h = obtain.readString();
                    mindDeviceInfo.f68014i = obtain.readString();
                    int readInt3 = obtain.readInt();
                    for (int i5 = 0; i5 < readInt3; i5++) {
                        mindDeviceInfo.f68015j.put(obtain.readString(), obtain.readString());
                    }
                    c.a().e(readInt2, mindDeviceInfo);
                }
                return;
            }
            throw new IOException("Unable to read Persistence file.");
        } finally {
            obtain.recycle();
        }
    }
}
