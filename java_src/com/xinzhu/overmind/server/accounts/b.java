package com.xinzhu.overmind.server.accounts;

import android.accounts.Account;
import android.os.Parcel;
import android.util.Pair;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.utils.k;
import com.xinzhu.overmind.utils.m;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: CompatReader.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final File f67867a = new File(Overmind.getContext().getApplicationInfo().dataDir, "data/app/system/account-list.ini");

    /* renamed from: b  reason: collision with root package name */
    private static final File f67868b = new File(Overmind.getContext().getApplicationInfo().dataDir, "data/app/system/account-visibility-list.ini");

    /* compiled from: CompatReader.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f67869a;

        /* renamed from: b  reason: collision with root package name */
        public Account f67870b;

        /* renamed from: c  reason: collision with root package name */
        public String f67871c;

        /* renamed from: d  reason: collision with root package name */
        public String f67872d;

        /* renamed from: e  reason: collision with root package name */
        public long f67873e;

        /* renamed from: f  reason: collision with root package name */
        public final List<Pair<String, String>> f67874f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        public final List<Pair<String, String>> f67875g = new ArrayList();
    }

    /* compiled from: CompatReader.java */
    /* renamed from: com.xinzhu.overmind.server.accounts.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0750b {

        /* renamed from: a  reason: collision with root package name */
        public int f67876a;

        /* renamed from: b  reason: collision with root package name */
        public Account f67877b;

        /* renamed from: c  reason: collision with root package name */
        public final List<Pair<String, Integer>> f67878c = new ArrayList();
    }

    public static boolean a() {
        return f67867a.delete();
    }

    public static boolean b() {
        return f67867a.exists();
    }

    public static List<a> c() {
        FileInputStream fileInputStream;
        Parcel obtain = Parcel.obtain();
        ArrayList arrayList = new ArrayList();
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(f67867a);
            try {
                try {
                    byte[] w4 = k.w(fileInputStream);
                    obtain.unmarshall(w4, 0, w4.length);
                    obtain.setDataPosition(0);
                    obtain.readInt();
                    for (int readInt = obtain.readInt(); readInt > 0; readInt--) {
                        a aVar = new a();
                        aVar.f67869a = obtain.readInt();
                        String readString = obtain.readString();
                        aVar.f67871c = obtain.readString();
                        aVar.f67870b = new Account(readString, obtain.readString());
                        aVar.f67872d = obtain.readString();
                        aVar.f67873e = obtain.readLong();
                        for (int readInt2 = obtain.readInt(); readInt2 > 0; readInt2--) {
                            aVar.f67874f.add(new Pair<>(obtain.readString(), obtain.readString()));
                        }
                        for (int readInt3 = obtain.readInt(); readInt3 > 0; readInt3--) {
                            aVar.f67875g.add(new Pair<>(obtain.readString(), obtain.readString()));
                        }
                        arrayList.add(aVar);
                    }
                    obtain.recycle();
                    m.a(fileInputStream);
                    return arrayList;
                } catch (IOException e5) {
                    e = e5;
                    e.printStackTrace();
                    obtain.recycle();
                    m.a(fileInputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                obtain.recycle();
                m.a(fileInputStream2);
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            obtain.recycle();
            m.a(fileInputStream2);
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0095: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:26:0x0095 */
    public static List<C0750b> d() {
        FileInputStream fileInputStream;
        Closeable closeable;
        Parcel obtain = Parcel.obtain();
        ArrayList arrayList = new ArrayList();
        Closeable closeable2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(f67868b);
                try {
                    byte[] w4 = k.w(fileInputStream);
                    obtain.unmarshall(w4, 0, w4.length);
                    obtain.setDataPosition(0);
                    obtain.readInt();
                    for (int readInt = obtain.readInt(); readInt > 0; readInt--) {
                        obtain.readInt();
                        for (int readInt2 = obtain.readInt(); readInt2 > 0; readInt2--) {
                            C0750b c0750b = new C0750b();
                            c0750b.f67877b = new Account(obtain.readString(), obtain.readString());
                            c0750b.f67876a = obtain.readInt();
                            for (int readInt3 = obtain.readInt(); readInt3 > 0; readInt3--) {
                                String readString = obtain.readString();
                                obtain.readInt();
                                c0750b.f67878c.add(new Pair<>(readString, Integer.valueOf(obtain.readInt())));
                            }
                            arrayList.add(c0750b);
                        }
                    }
                    obtain.recycle();
                    m.a(fileInputStream);
                    return arrayList;
                } catch (IOException e5) {
                    e = e5;
                    e.printStackTrace();
                    obtain.recycle();
                    m.a(fileInputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                obtain.recycle();
                m.a(closeable2);
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            obtain.recycle();
            m.a(closeable2);
            throw th;
        }
    }
}
