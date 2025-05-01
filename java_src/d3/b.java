package d3;

import android.os.Parcel;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.server.pm.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/* compiled from: PackageListIniSolver.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final int f68818a = 6;

    public static void a(boolean z4) {
        int length;
        byte[] bArr;
        int read;
        File f5 = com.xinzhu.datatransfer.b.f();
        Parcel obtain = Parcel.obtain();
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(f5);
                length = (int) f5.length();
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
                obtain.createCharArray();
                int readInt = obtain.readInt();
                int readInt2 = obtain.readInt();
                if (readInt == 6) {
                    for (int i4 = 0; i4 < readInt2; i4++) {
                        String readString = obtain.readString();
                        int readInt3 = obtain.readInt();
                        obtain.readString();
                        obtain.readString();
                        boolean z5 = obtain.readByte() != 0;
                        obtain.readByte();
                        int readInt4 = obtain.readInt();
                        for (int i5 = 0; i5 < readInt4; i5++) {
                            int readInt5 = obtain.readInt();
                            obtain.readInt();
                            obtain.readString();
                            obtain.readByte();
                            obtain.readByte();
                            obtain.readByte();
                            if (b(z4, z5)) {
                                i.get().installPackageAsTransfer(com.xinzhu.overmind.a.j(readString).getAbsolutePath(), readInt5, readInt3);
                            }
                        }
                        obtain.readInt();
                        obtain.readLong();
                        obtain.readLong();
                    }
                } else if (readInt == 5) {
                    for (int i6 = 0; i6 < readInt2; i6++) {
                        String readString2 = obtain.readString();
                        int readInt6 = obtain.readInt();
                        obtain.readInt();
                        int readInt7 = obtain.readInt();
                        for (int i7 = 0; i7 < readInt7; i7++) {
                            int readInt8 = obtain.readInt();
                            obtain.readInt();
                            obtain.readString();
                            obtain.readByte();
                            obtain.readByte();
                            obtain.readByte();
                            i.get().installPackageAsTransfer(com.xinzhu.overmind.a.j(readString2).getAbsolutePath(), readInt8, readInt6);
                        }
                        obtain.readInt();
                        obtain.readLong();
                        obtain.readLong();
                    }
                } else if (readInt < 5) {
                    for (int i8 = 0; i8 < readInt2; i8++) {
                        String readString3 = obtain.readString();
                        obtain.readString();
                        obtain.readString();
                        obtain.readByte();
                        int readInt9 = obtain.readInt();
                        int readInt10 = obtain.readInt();
                        for (int i9 = 0; i9 < readInt10; i9++) {
                            int readInt11 = obtain.readInt();
                            obtain.readInt();
                            obtain.readString();
                            obtain.readByte();
                            obtain.readByte();
                            obtain.readByte();
                            i.get().installPackageAsTransfer(com.xinzhu.overmind.a.j(readString3).getAbsolutePath(), readInt11, readInt9);
                        }
                        obtain.readByte();
                        if (readInt == 4) {
                            obtain.readInt();
                        }
                    }
                }
                return;
            }
            throw new IOException("Unable to read Persistence file.");
        } finally {
            obtain.recycle();
        }
    }

    private static boolean b(boolean z4, boolean z5) {
        if (z4) {
            return Overmind.get().use32BitMainPackage() ? !z5 : z5;
        }
        return true;
    }
}
