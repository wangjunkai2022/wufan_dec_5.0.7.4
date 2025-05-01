package com.mob.tools.utils;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import com.join.mgps.Util.h0;
import com.mob.commons.a.l;
import com.mob.commons.o;
import com.mob.commons.p;
import com.mob.commons.v;
import com.mob.commons.z;
import com.mob.tools.MobLog;
import com.mob.tools.proguard.EverythingKeeper;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* loaded from: classes5.dex */
public class MobPersistence {

    /* renamed from: h  reason: collision with root package name */
    private static final int f56916h = Process.myPid();

    /* renamed from: a  reason: collision with root package name */
    private final i f56917a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f56918b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, j> f56919c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final ReentrantReadWriteLock f56920d;

    /* renamed from: e  reason: collision with root package name */
    private final ReentrantReadWriteLock.WriteLock f56921e;

    /* renamed from: f  reason: collision with root package name */
    private final ReentrantReadWriteLock.ReadLock f56922f;

    /* renamed from: g  reason: collision with root package name */
    private final f f56923g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class KVEntry<T> implements EverythingKeeper, Serializable {
        private static final long serialVersionUID = -1538971823189206429L;
        private String key;
        private T value;

        public KVEntry(String str, T t4) {
            this.key = str;
            this.value = t4;
        }

        public String getKey() {
            return this.key;
        }

        public T getValue() {
            return this.value;
        }

        public void setKey(String str) {
            this.key = str;
        }

        public void setValue(T t4) {
            this.value = t4;
        }
    }

    /* loaded from: classes5.dex */
    public static class NoValidDataException extends Exception {
        public NoValidDataException() {
            this(l.a("019>fheljgeeTeh+ejedjged+eje^jgfgelehYf$ed"));
        }

        public NoValidDataException(String str) {
            super(str);
        }
    }

    /* loaded from: classes5.dex */
    public static final class SerializableParcel<T extends Parcelable> implements EverythingKeeper, Serializable {
        private static final long serialVersionUID = -2769878423373647357L;
        private Class<T> clazz;
        private byte[] data;

        public SerializableParcel(Parcelable parcelable) {
            this.clazz = (Class<T>) parcelable.getClass();
            this.data = parcelable2Byte(parcelable);
        }

        private T byte2Parcelable(byte[] bArr, Class<T> cls, T t4) {
            if (bArr != null && bArr.length != 0) {
                try {
                    Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    return (T) ((Parcelable.Creator) cls.getDeclaredField(l.a("007=fehkhjgegdhihk")).get(null)).createFromParcel(obtain);
                } catch (Throwable th) {
                    MobLog.getInstance().d(th);
                }
            }
            return t4;
        }

        private byte[] parcelable2Byte(Parcelable parcelable) {
            if (parcelable != null) {
                Parcel obtain = Parcel.obtain();
                parcelable.writeToParcel(obtain, 0);
                return obtain.marshall();
            }
            return new byte[0];
        }

        private void setClazz(Class cls) {
            this.clazz = cls;
        }

        private void setData(byte[] bArr) {
            this.data = bArr;
        }

        public Class getClazz() {
            return this.clazz;
        }

        public byte[] getData() {
            return this.data;
        }

        public T getParcel(T t4) {
            return byte2Parcelable(this.data, this.clazz, t4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private String f56926a;

        /* renamed from: b  reason: collision with root package name */
        private T f56927b;

        public a(String str, T t4) {
            this.f56926a = str;
            this.f56927b = t4;
        }

        public HashMap<Byte, Object> b() {
            HashMap<Byte, Object> hashMap = new HashMap<>();
            hashMap.put((byte) 0, this.f56926a);
            hashMap.put((byte) 1, this.f56927b);
            return hashMap;
        }

        public T a() {
            return this.f56927b;
        }

        public static <T> a<T> a(HashMap<Byte, Object> hashMap) {
            if (hashMap != null) {
                return new a<>((String) hashMap.get((byte) 0), hashMap.get((byte) 1));
            }
            return null;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b<T extends Parcelable> {

        /* renamed from: a  reason: collision with root package name */
        private Class<T> f56928a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f56929b;

        public b(Parcelable parcelable) {
            this.f56928a = (Class<T>) parcelable.getClass();
            this.f56929b = b(parcelable);
        }

        public Class a() {
            return this.f56928a;
        }

        public HashMap<Byte, Object> b() {
            HashMap<Byte, Object> hashMap = new HashMap<>();
            hashMap.put((byte) 0, this.f56928a);
            hashMap.put((byte) 1, this.f56929b);
            return hashMap;
        }

        public T a(T t4) {
            return a(this.f56929b, this.f56928a, t4);
        }

        public static <T extends Parcelable> b<T> a(HashMap<Byte, Object> hashMap) {
            if (hashMap != null) {
                return new b<>((Class) hashMap.get((byte) 0), (byte[]) hashMap.get((byte) 1));
            }
            return null;
        }

        public b(Class<T> cls, byte[] bArr) {
            this.f56928a = cls;
            this.f56929b = bArr;
        }

        private byte[] b(Parcelable parcelable) {
            if (parcelable != null) {
                Parcel obtain = Parcel.obtain();
                parcelable.writeToParcel(obtain, 0);
                return obtain.marshall();
            }
            return new byte[0];
        }

        private T a(byte[] bArr, Class<T> cls, T t4) {
            if (bArr != null && bArr.length != 0) {
                try {
                    Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    return (T) ((Parcelable.Creator) cls.getDeclaredField(l.a("0072fehkhjgegdhihk")).get(null)).createFromParcel(obtain);
                } catch (Throwable th) {
                    MobLog.getInstance().d(th);
                }
            }
            return t4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private long f56930a;

        /* renamed from: b  reason: collision with root package name */
        private Object f56931b;

        private c(long j4, Object obj) {
            this.f56930a = j4;
            this.f56931b = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a() {
            long j4 = this.f56930a;
            return j4 != 0 && j4 <= System.currentTimeMillis();
        }
    }

    /* loaded from: classes5.dex */
    private class d implements Runnable {
        private d() {
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00a2 A[Catch: all -> 0x00ec, TRY_LEAVE, TryCatch #9 {all -> 0x013b, blocks: (B:46:0x00fb, B:3:0x0002, B:28:0x008c, B:42:0x00de, B:14:0x0047, B:21:0x0064, B:22:0x0071, B:30:0x0092, B:32:0x00a2, B:38:0x00c9, B:40:0x00d4, B:41:0x00dd), top: B:69:0x0002 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 360
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.utils.MobPersistence.d.run():void");
        }
    }

    /* loaded from: classes5.dex */
    public static class e<T> {

        /* renamed from: a  reason: collision with root package name */
        private String f56933a;

        public e(String str) {
            this.f56933a = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public T a(Object obj) {
            return obj;
        }

        public String a() {
            return this.f56933a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        private byte[] f56934a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f56935b;

        private static Object b(byte[] bArr) throws Throwable {
            ByteArrayInputStream byteArrayInputStream;
            Throwable th;
            ObjectInputStream objectInputStream;
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        Object readObject = objectInputStream.readObject();
                        v.a(objectInputStream, byteArrayInputStream);
                        return readObject;
                    } catch (Throwable th2) {
                        th = th2;
                        v.a(objectInputStream, byteArrayInputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    objectInputStream = null;
                }
            } catch (Throwable th4) {
                byteArrayInputStream = null;
                th = th4;
                objectInputStream = null;
            }
        }

        private f(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f56935b = false;
                return;
            }
            this.f56935b = true;
            try {
                this.f56934a = str.getBytes("utf-8");
            } catch (Throwable unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object a(byte[] bArr, Object obj) {
            try {
                return a(bArr);
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return obj;
            }
        }

        private Object a(byte[] bArr) throws Throwable {
            if (bArr == null || bArr.length == 0) {
                return null;
            }
            if (this.f56935b) {
                if (bArr.length % 16 == 0) {
                    try {
                        return b(Data.paddingDecode(this.f56934a, bArr));
                    } catch (Throwable unused) {
                        MobPersistence.d("decode fail ", "ENCIPER");
                        return b(bArr);
                    }
                }
                return b(bArr);
            }
            return b(bArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte[] a(Object obj) throws Throwable {
            ByteArrayOutputStream byteArrayOutputStream;
            if (obj == null) {
                return new byte[0];
            }
            ObjectOutputStream objectOutputStream = null;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream2.writeObject(obj);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        if (!this.f56935b) {
                            v.a(objectOutputStream2, byteArrayOutputStream);
                            return byteArray;
                        }
                        byte[] AES128Encode = Data.AES128Encode(this.f56934a, byteArray);
                        v.a(objectOutputStream2, byteArrayOutputStream);
                        return AES128Encode;
                    } catch (Throwable th) {
                        th = th;
                        objectOutputStream = objectOutputStream2;
                        v.a(objectOutputStream, byteArrayOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f56936a;

        public g(byte[] bArr) {
            this.f56936a = bArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || g.class != obj.getClass()) {
                return false;
            }
            return Arrays.equals(this.f56936a, ((g) obj).f56936a);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f56936a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        private final int f56937a;

        /* renamed from: b  reason: collision with root package name */
        private volatile LinkedHashMap<g, c> f56938b;

        private h(int i4) {
            this.f56937a = i4;
            this.f56938b = new LinkedHashMap<g, c>(i4, 0.75f, true) { // from class: com.mob.tools.utils.MobPersistence.h.1
                @Override // java.util.LinkedHashMap
                protected boolean removeEldestEntry(Map.Entry<g, c> entry) {
                    return size() > h.this.f56937a;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(g gVar) {
            this.f56938b.remove(gVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c a(g gVar) {
            return this.f56938b.get(gVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(g gVar, c cVar) {
            this.f56938b.put(gVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            this.f56938b.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        private final ReentrantReadWriteLock f56940a;

        /* renamed from: b  reason: collision with root package name */
        private final ReentrantReadWriteLock.WriteLock f56941b;

        /* renamed from: c  reason: collision with root package name */
        private final ReentrantReadWriteLock.ReadLock f56942c;

        /* renamed from: d  reason: collision with root package name */
        private File f56943d;

        /* renamed from: e  reason: collision with root package name */
        private volatile RandomAccessFile f56944e;

        /* renamed from: f  reason: collision with root package name */
        private volatile long f56945f;

        /* renamed from: g  reason: collision with root package name */
        private volatile LinkedList<a> f56946g;

        /* renamed from: h  reason: collision with root package name */
        private volatile HashMap<g, a> f56947h;

        /* renamed from: i  reason: collision with root package name */
        private final Context f56948i;

        /* renamed from: j  reason: collision with root package name */
        private final String f56949j;

        /* renamed from: k  reason: collision with root package name */
        private final File f56950k;

        /* renamed from: l  reason: collision with root package name */
        private final f f56951l;

        /* renamed from: m  reason: collision with root package name */
        private final h f56952m;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes5.dex */
        public static class a implements Comparable<a> {

            /* renamed from: a  reason: collision with root package name */
            private int f56970a;

            /* renamed from: b  reason: collision with root package name */
            private byte f56971b;

            /* renamed from: c  reason: collision with root package name */
            private byte[] f56972c;

            /* renamed from: d  reason: collision with root package name */
            private long f56973d;

            /* renamed from: e  reason: collision with root package name */
            private long f56974e;

            /* renamed from: f  reason: collision with root package name */
            private long f56975f;

            /* renamed from: g  reason: collision with root package name */
            private long f56976g;

            public a(int i4) {
                this.f56970a = i4;
                this.f56976g = (i4 * 41) + 1024;
            }

            public boolean e() {
                return d() != 0 && d() <= System.currentTimeMillis();
            }

            public void f() {
                this.f56971b = (byte) 1;
                this.f56972c = null;
                this.f56975f = -1L;
                this.f56973d = 0L;
                this.f56974e = 0L;
            }

            public long b() {
                return this.f56973d;
            }

            public long c() {
                return this.f56974e;
            }

            public long d() {
                return this.f56975f;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void b(long j4) {
                this.f56974e = j4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void c(long j4) {
                this.f56975f = j4;
            }

            public long a() {
                return this.f56976g;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void a(byte b5) {
                this.f56971b = b5;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void a(byte[] bArr) {
                this.f56972c = bArr;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void a(long j4) {
                this.f56973d = j4;
            }

            public void a(byte b5, byte[] bArr, long j4, long j5) {
                this.f56971b = b5;
                this.f56972c = bArr;
                this.f56974e = j4;
                this.f56975f = j5;
            }

            @Override // java.lang.Comparable
            /* renamed from: a */
            public int compareTo(a aVar) {
                return Long.compare(b(), aVar.b());
            }
        }

        public i(Context context, String str, f fVar) {
            ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
            this.f56940a = reentrantReadWriteLock;
            this.f56941b = reentrantReadWriteLock.writeLock();
            this.f56942c = reentrantReadWriteLock.readLock();
            this.f56948i = context;
            this.f56949j = str;
            this.f56950k = p.a(p.f56430h + str);
            this.f56951l = fVar;
            this.f56952m = new h(60);
            f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k() throws Throwable {
            if (new Random().nextInt(10) < 1) {
                g();
            }
            this.f56945f = System.currentTimeMillis();
            this.f56944e.seek(0L);
            this.f56944e.writeLong(this.f56945f);
        }

        private long l() throws Throwable {
            this.f56944e.seek(0L);
            return this.f56944e.readLong();
        }

        private long d(long j4) throws Throwable {
            try {
                this.f56944e.seek(j4 + 33);
                return this.f56944e.readLong();
            } catch (Throwable th) {
                MobPersistence.b(th, a());
                return 0L;
            }
        }

        private void f() {
            this.f56941b.lock();
            try {
                p.a(this.f56950k.getAbsolutePath(), true, 1500L, 50L, new o() { // from class: com.mob.tools.utils.MobPersistence.i.1
                    @Override // com.mob.commons.o
                    public boolean a(FileLocker fileLocker) {
                        try {
                            if (i.this.f56948i != null) {
                                File a5 = MobPersistence.a(i.this.f56948i);
                                i.this.f56943d = new File(a5, i.this.f56949j);
                                if (!i.this.f56943d.getParentFile().exists()) {
                                    i.this.f56943d.getParentFile().mkdirs();
                                }
                                if (i.this.f56943d.exists() && i.this.f56943d.length() < 43008) {
                                    MobPersistence.c("Del dirty, size: " + i.this.f56943d.length() + ", min: 43008", i.this.f56949j);
                                    i.this.f56943d.delete();
                                }
                                if (!i.this.f56943d.exists()) {
                                    i.this.f56943d.createNewFile();
                                    i.this.f56944e = new RandomAccessFile(i.this.f56943d, l.a("002?ekgh"));
                                    i.this.b(1024);
                                    return false;
                                }
                                i.this.f56944e = new RandomAccessFile(i.this.f56943d, l.a("002'ekgh"));
                                i.this.i();
                                MobPersistence.d("ava sz " + i.this.f56946g.size() + " useds " + i.this.f56947h.size(), i.this.f56949j);
                                return false;
                            }
                            return false;
                        } catch (Throwable th) {
                            MobPersistence.b(th, i.this.f56949j);
                            return false;
                        }
                    }
                });
            } finally {
                this.f56941b.unlock();
            }
        }

        private void g() throws Throwable {
            long c5;
            MobPersistence.d(" [trim] try ", this.f56949j);
            long size = ((this.f56947h.size() + this.f56946g.size()) * 41) + 1024;
            long length = this.f56944e.length();
            double d5 = 0.0d;
            for (a aVar : this.f56947h.values()) {
                double c6 = aVar.c();
                Double.isNaN(c6);
                d5 += c6;
            }
            long j4 = length - size;
            double d6 = j4;
            Double.isNaN(d6);
            if (d5 / d6 <= 0.5d) {
                Iterator<a> it2 = h().iterator();
                long j5 = size;
                while (it2.hasNext()) {
                    a next = it2.next();
                    if (next.e()) {
                        e(next);
                    } else {
                        if (next.b() == j5) {
                            c5 = next.c();
                        } else if (next.b() > j5) {
                            a(next, j5);
                            c5 = next.c();
                        }
                        j5 += c5;
                    }
                }
                this.f56944e.setLength(j5);
                MobPersistence.d(" [trim] real over  before dataBlockSize " + j4 + " cur " + (j5 - size), this.f56949j);
            }
        }

        private ArrayList<a> h() {
            ArrayList<a> arrayList = new ArrayList<>(this.f56947h.values());
            Collections.sort(arrayList);
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean i() throws Throwable {
            boolean[] zArr = {false};
            long l4 = l();
            if (l4 != this.f56945f) {
                this.f56941b.lock();
                try {
                    this.f56952m.a();
                    this.f56945f = l4;
                    this.f56946g = new LinkedList<>();
                    this.f56947h = new HashMap<>();
                    int c5 = c();
                    for (int i4 = 0; i4 < c5; i4++) {
                        a aVar = new a(i4);
                        if (b(aVar) == 1) {
                            this.f56946g.add(aVar);
                        } else {
                            a(aVar);
                            this.f56947h.put(new g(aVar.f56972c), aVar);
                        }
                    }
                    MobPersistence.d("update lstt " + this.f56945f + " a " + this.f56946g.size() + " u " + this.f56947h.size(), this.f56949j);
                    zArr[0] = true;
                } finally {
                    this.f56941b.unlock();
                }
            }
            return zArr[0];
        }

        private void j() throws Throwable {
            int c5 = c();
            int i4 = c5 + 1024;
            MobPersistence.d("[exp] old " + c5 + " new " + i4, this.f56949j);
            long j4 = (((long) i4) * 41) + 1024;
            if (((this.f56947h.size() + this.f56946g.size()) * 41) + 1024 < j4) {
                Iterator<a> it2 = h().iterator();
                while (it2.hasNext()) {
                    a next = it2.next();
                    if (next.b() >= j4) {
                        break;
                    }
                    long b5 = next.b() + next.c();
                    if (next.e()) {
                        e(next);
                    } else {
                        a(next, this.f56944e.length());
                    }
                    if (b5 >= j4) {
                        break;
                    }
                }
            }
            this.f56944e.seek(j4);
            for (int i5 = c5 - 1; i5 < i4; i5++) {
                a aVar = new a(i5);
                this.f56946g.add(aVar);
                a(aVar.f56976g, (byte) 1);
            }
            MobPersistence.d("[exp] ovr", this.f56949j);
            a(i4);
        }

        public List<byte[]> e() {
            this.f56941b.lock();
            final ArrayList arrayList = new ArrayList();
            try {
                p.a(this.f56950k.getAbsolutePath(), true, 1500L, 50L, new o() { // from class: com.mob.tools.utils.MobPersistence.i.5
                    @Override // com.mob.commons.o
                    public boolean a(FileLocker fileLocker) {
                        try {
                            i.this.i();
                            if (i.this.f56947h != null) {
                                for (a aVar : i.this.f56947h.values()) {
                                    arrayList.add(i.this.f(aVar));
                                }
                                return false;
                            }
                            return false;
                        } catch (Throwable th) {
                            MobPersistence.b(th, i.this.a());
                            return false;
                        }
                    }
                });
                return arrayList;
            } finally {
                this.f56941b.unlock();
            }
        }

        private long c(long j4) throws Throwable {
            try {
                this.f56944e.seek(j4 + 25);
                return this.f56944e.readLong();
            } catch (Throwable th) {
                MobPersistence.b(th, a());
                return -1L;
            }
        }

        public ReentrantReadWriteLock.WriteLock b() {
            return this.f56941b;
        }

        private long b(long j4) throws Throwable {
            try {
                this.f56944e.seek(j4 + 17);
                return this.f56944e.readLong();
            } catch (Throwable th) {
                MobPersistence.b(th, a());
                return -1L;
            }
        }

        public boolean d() {
            this.f56941b.lock();
            final boolean[] zArr = new boolean[1];
            try {
                p.a(this.f56950k.getAbsolutePath(), true, 1500L, 50L, new o() { // from class: com.mob.tools.utils.MobPersistence.i.3
                    @Override // com.mob.commons.o
                    public boolean a(FileLocker fileLocker) {
                        try {
                            for (a aVar : i.this.f56947h.values()) {
                                i.this.f56944e.seek(aVar.a());
                                i.this.f56944e.writeByte(1);
                                aVar.f();
                            }
                            i.this.f56946g.addAll(i.this.f56947h.values());
                            i.this.f56947h.clear();
                            i.this.f56944e.setLength((i.this.f56946g.size() * 41) + 1024);
                            zArr[0] = true;
                            i.this.k();
                            MobPersistence.d("Clear done, new size: ", i.this.f56949j);
                        } catch (Throwable th) {
                            MobPersistence.b(th, i.this.f56949j);
                        }
                        return false;
                    }
                });
                this.f56941b.unlock();
                return zArr[0];
            } catch (Throwable th) {
                this.f56941b.unlock();
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte[] f(a aVar) throws Throwable {
            this.f56944e.seek(aVar.b());
            byte[] bArr = new byte[(int) aVar.f56974e];
            this.f56944e.readFully(bArr);
            return bArr;
        }

        public int c() {
            try {
                this.f56944e.seek(8L);
                return this.f56944e.readInt();
            } catch (Throwable th) {
                MobPersistence.b(th, this.f56949j);
                return 0;
            }
        }

        private void e(a aVar) throws Throwable {
            this.f56947h.remove(new g(aVar.f56972c));
            this.f56944e.seek(aVar.a());
            this.f56944e.writeByte(1);
            this.f56946g.add(aVar);
            aVar.f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i4) throws Throwable {
            this.f56946g = new LinkedList<>();
            this.f56947h = new HashMap<>();
            a(0, i4);
            a(i4);
            this.f56945f = System.currentTimeMillis();
            this.f56944e.seek(0L);
            this.f56944e.writeLong(this.f56945f);
            MobPersistence.d("new a " + this.f56946g.size() + " u " + this.f56947h.size(), this.f56949j);
        }

        private void c(int i4) {
            if (i4 >= 0) {
                int c5 = c();
                if (i4 >= c5) {
                    throw new IndexOutOfBoundsException(b(i4, c5));
                }
                return;
            }
            throw new IllegalArgumentException("index : " + i4);
        }

        public String a() {
            return this.f56949j;
        }

        public void a(a aVar) {
            try {
                c(aVar.f56970a);
                this.f56944e.seek(aVar.a());
                aVar.a(this.f56944e.readByte());
                aVar.a(a(aVar.f56976g));
                aVar.a(b(aVar.f56976g));
                aVar.b(c(aVar.f56976g));
                aVar.c(d(aVar.f56976g));
            } catch (Throwable th) {
                MobPersistence.b(th, this.f56949j);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(a aVar) throws Throwable {
            this.f56941b.lock();
            try {
                e(aVar);
                k();
            } finally {
                this.f56941b.unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean c(a aVar) {
            try {
                byte[] bArr = new byte[41];
                bArr[0] = 0;
                System.arraycopy(aVar.f56972c, 0, bArr, 1, 16);
                a(aVar.f56973d, bArr, 17);
                a(aVar.f56974e, bArr, 25);
                a(aVar.f56975f, bArr, 33);
                this.f56944e.seek(aVar.f56976g);
                this.f56944e.write(bArr);
                return true;
            } catch (Throwable th) {
                MobPersistence.b(th, this.f56949j);
                return false;
            }
        }

        public byte b(a aVar) throws Throwable {
            try {
                this.f56944e.seek(aVar.f56976g);
                return this.f56944e.readByte();
            } catch (Throwable th) {
                MobPersistence.b(th, this.f56949j);
                return (byte) 0;
            }
        }

        private byte[] a(long j4) throws Throwable {
            byte[] bArr = new byte[16];
            this.f56944e.seek(j4 + 1);
            this.f56944e.read(bArr, 0, 16);
            return bArr;
        }

        private String b(int i4, int i5) {
            return "Index: " + i4 + ", Size: " + i5;
        }

        private void a(a aVar, long j4) throws Throwable {
            byte[] bArr = new byte[(int) aVar.f56974e];
            this.f56944e.seek(aVar.f56973d);
            this.f56944e.readFully(bArr);
            this.f56944e.seek(j4);
            this.f56944e.write(bArr);
            this.f56944e.seek(aVar.f56976g + 17);
            this.f56944e.writeLong(j4);
            aVar.a(j4);
            this.f56947h.put(new g(aVar.f56972c), aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b(g gVar) {
            try {
                i();
                a aVar = this.f56947h.get(gVar);
                if (aVar != null) {
                    d(aVar);
                }
                this.f56952m.b(gVar);
                return true;
            } catch (Throwable th) {
                MobPersistence.b(th, a());
                return false;
            }
        }

        public void a(int i4) {
            if (i4 > 0) {
                try {
                    this.f56944e.seek(8L);
                    this.f56944e.writeInt(i4);
                    return;
                } catch (Throwable th) {
                    try {
                        MobPersistence.b(th, this.f56949j);
                        return;
                    } catch (Throwable th2) {
                        MobPersistence.b(th2, this.f56949j);
                        return;
                    }
                }
            }
            throw new IllegalArgumentException("indexNum : " + i4);
        }

        private void a(int i4, int i5) {
            while (i4 < i5) {
                a aVar = new a(i4);
                this.f56946g.add(aVar);
                a(aVar.f56976g, (byte) 1);
                i4++;
            }
        }

        public void a(long j4, byte b5) {
            try {
                this.f56944e.seek(j4);
                this.f56944e.writeByte(b5);
            } catch (Throwable unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(a aVar, j jVar) throws Throwable {
            FileOutputStream fileOutputStream;
            byte[] a5 = this.f56951l.a(new a(jVar.a(), jVar.c()).b());
            long length = this.f56944e.length();
            BufferedOutputStream bufferedOutputStream = null;
            try {
                fileOutputStream = new FileOutputStream(this.f56944e.getFD());
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                    try {
                        this.f56944e.seek(length);
                        bufferedOutputStream2.write(a5);
                        bufferedOutputStream2.flush();
                        v.a(bufferedOutputStream2, fileOutputStream);
                        aVar.a((byte) 0, jVar.f56980d, a5.length, jVar.f56979c);
                        aVar.f56973d = length;
                        c(aVar);
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        v.a(bufferedOutputStream, fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a a(g gVar) throws Throwable {
            a aVar = this.f56947h.get(gVar);
            if (aVar == null) {
                if (this.f56946g.isEmpty()) {
                    j();
                }
                a removeFirst = this.f56946g.removeFirst();
                removeFirst.a((byte) 0);
                this.f56947h.put(gVar, removeFirst);
                return removeFirst;
            }
            return aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List<j> a(final List<j> list) {
            this.f56941b.lock();
            final ArrayList arrayList = new ArrayList();
            try {
                p.a(this.f56950k.getAbsolutePath(), true, 2000L, 50L, new o() { // from class: com.mob.tools.utils.MobPersistence.i.2
                    /* JADX WARN: Removed duplicated region for block: B:34:0x014d  */
                    @Override // com.mob.commons.o
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public boolean a(com.mob.tools.utils.FileLocker r23) {
                        /*
                            Method dump skipped, instructions count: 529
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.utils.MobPersistence.i.AnonymousClass2.a(com.mob.tools.utils.FileLocker):boolean");
                    }
                });
                return arrayList;
            } finally {
                this.f56941b.unlock();
            }
        }

        private void a(long j4, byte[] bArr, int i4) {
            for (int i5 = i4 + 7; i5 >= i4; i5--) {
                bArr[i5] = (byte) (255 & j4);
                j4 >>= 8;
            }
        }

        public <T> T a(final g gVar, e<T> eVar) throws Throwable {
            a a5;
            final byte[][] bArr = new byte[1];
            final long[] jArr = new long[1];
            final int[] iArr = new int[1];
            final Object[] objArr = new Object[1];
            this.f56941b.lock();
            try {
                p.a(this.f56950k.getAbsolutePath(), true, 1500L, 50L, new o() { // from class: com.mob.tools.utils.MobPersistence.i.4
                    @Override // com.mob.commons.o
                    public boolean a(FileLocker fileLocker) {
                        c a6;
                        try {
                            if (!i.this.i() && (a6 = i.this.f56952m.a(gVar)) != null && a6.f56931b != null) {
                                if (a6.a()) {
                                    i.this.a(gVar, false);
                                    iArr[0] = 2;
                                } else {
                                    iArr[0] = 4;
                                    objArr[0] = a6.f56931b;
                                }
                            }
                            a aVar = (a) i.this.f56947h.get(gVar);
                            if (aVar != null) {
                                if (!aVar.e()) {
                                    jArr[0] = aVar.f56975f;
                                    bArr[0] = i.this.f(aVar);
                                    iArr[0] = 3;
                                } else {
                                    i.this.d(aVar);
                                    iArr[0] = 2;
                                }
                            } else {
                                iArr[0] = 1;
                            }
                        } catch (Throwable th) {
                            MobPersistence.b(th, i.this.f56949j);
                        }
                        return false;
                    }
                });
                this.f56941b.unlock();
                if (iArr[0] == 4) {
                    return (T) objArr[0];
                }
                if (iArr[0] == 3) {
                    Object a6 = this.f56951l.a(bArr[0], (Object) null);
                    if (a6 instanceof KVEntry) {
                        KVEntry kVEntry = (KVEntry) a6;
                        a5 = new a(kVEntry.getKey(), kVEntry.getValue());
                    } else {
                        a5 = a.a((HashMap) a6);
                    }
                    if (a5 != null) {
                        T a7 = eVar.a(a5.a());
                        this.f56952m.a(gVar, new c(Long.valueOf(jArr[0]).longValue(), a7));
                        return a7;
                    }
                    throw new NoValidDataException();
                }
                throw new NoValidDataException();
            } catch (Throwable th) {
                this.f56941b.unlock();
                throw th;
            }
        }

        public boolean a(final g gVar, boolean z4) {
            this.f56941b.lock();
            final boolean[] zArr = new boolean[1];
            try {
                if (z4) {
                    p.a(this.f56950k.getAbsolutePath(), true, 1500L, 50L, new o() { // from class: com.mob.tools.utils.MobPersistence.i.6
                        @Override // com.mob.commons.o
                        public boolean a(FileLocker fileLocker) {
                            zArr[0] = i.this.b(gVar);
                            return false;
                        }
                    });
                } else {
                    zArr[0] = b(gVar);
                }
                this.f56941b.unlock();
                return zArr[0];
            } catch (Throwable th) {
                this.f56941b.unlock();
                throw th;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        private String f56977a;

        /* renamed from: b  reason: collision with root package name */
        private Object f56978b;

        /* renamed from: c  reason: collision with root package name */
        private long f56979c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f56980d;

        public j(String str, Object obj, long j4) {
            this.f56977a = str;
            this.f56978b = obj;
            this.f56979c = j4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte[] f() {
            return this.f56980d;
        }

        public Object b() {
            return this.f56978b;
        }

        public Object c() {
            return this.f56978b;
        }

        public long d() {
            return this.f56979c;
        }

        public boolean e() {
            return d() != 0 && d() <= System.currentTimeMillis();
        }

        public String a() {
            return this.f56977a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(byte[] bArr) {
            this.f56980d = bArr;
        }
    }

    public MobPersistence(Context context, final String str, String str2) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f56920d = reentrantReadWriteLock;
        this.f56921e = reentrantReadWriteLock.writeLock();
        this.f56922f = reentrantReadWriteLock.readLock();
        f fVar = new f(str2);
        this.f56923g = fVar;
        this.f56917a = new i(context, str, fVar);
        if (str != null && str.startsWith(h0.f27805a) && str.length() > 1) {
            str = str.substring(1);
        }
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: com.mob.tools.utils.MobPersistence.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, z.f56518b + "MP-" + str);
            }
        });
        this.f56918b = newSingleThreadScheduledExecutor;
        newSingleThreadScheduledExecutor.schedule(new d(), 3000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, String str2) {
        a(str, true, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str, String str2) {
        a(str, false, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1 A[Catch: all -> 0x00cf, TryCatch #5 {all -> 0x00cf, blocks: (B:32:0x00ab, B:34:0x00b1, B:35:0x00bf, B:37:0x00c2), top: B:101:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd A[Catch: all -> 0x0110, TryCatch #0 {all -> 0x0110, blocks: (B:43:0x00d4, B:45:0x00dd, B:47:0x00e1, B:52:0x00f6, B:53:0x00fa, B:55:0x0100, B:48:0x00e7, B:50:0x00eb, B:51:0x00f1), top: B:91:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011e A[Catch: all -> 0x0169, TryCatch #3 {all -> 0x0169, blocks: (B:61:0x0115, B:63:0x011e, B:65:0x0122, B:73:0x0141, B:74:0x0149, B:76:0x014f, B:66:0x0128, B:68:0x012c, B:69:0x0132, B:71:0x0136, B:72:0x013c), top: B:97:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016d  */
    /* JADX WARN: Type inference failed for: r10v13, types: [android.os.Parcelable[]] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.TreeMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.HashMap<java.lang.String, java.lang.Object> b() {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.utils.MobPersistence.b():java.util.HashMap");
    }

    public static synchronized boolean a(Context context, String str) {
        boolean z4;
        synchronized (MobPersistence.class) {
            File file = new File(a(context), str);
            if (file.exists()) {
                z4 = file.length() > 0;
            }
        }
        return z4;
    }

    public static synchronized File a(Context context) {
        File file;
        synchronized (MobPersistence.class) {
            file = new File(context.getFilesDir(), l.a("0077idelgghmQg)ekgj"));
        }
        return file;
    }

    public void a(j jVar) {
        if (jVar != null) {
            String a5 = jVar.a();
            long d5 = jVar.d();
            if (!TextUtils.isEmpty(a5) && d5 >= 0) {
                jVar.a(Data.rawMD5(a5));
                this.f56921e.lock();
                try {
                    this.f56919c.put(a5, jVar);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Key: " + a5 + ", expAt: " + d5);
        }
        throw new IllegalArgumentException("dataEntry is null");
    }

    public boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            byte[] rawMD5 = Data.rawMD5(str);
            boolean[] zArr = {false};
            String[] strArr = {com.xinzhu.overmind.utils.helpers.f.f68332a};
            this.f56921e.lock();
            try {
                if (!this.f56919c.isEmpty() && this.f56919c.containsKey(str)) {
                    this.f56919c.remove(str);
                    zArr[0] = true;
                    strArr[0] = "m";
                }
            } finally {
                try {
                    zArr[0] = this.f56917a.a(new g(rawMD5), true);
                    d("rmv: " + str + ", from: " + strArr[0] + ", succ is " + zArr[0], this.f56917a.f56949j);
                    return zArr[0];
                } finally {
                }
            }
            zArr[0] = this.f56917a.a(new g(rawMD5), true);
            d("rmv: " + str + ", from: " + strArr[0] + ", succ is " + zArr[0], this.f56917a.f56949j);
            return zArr[0];
        }
        throw new IllegalArgumentException("Key: " + str);
    }

    public boolean a() {
        d("cln", this.f56917a.f56949j);
        this.f56921e.lock();
        try {
            if (!this.f56919c.isEmpty()) {
                this.f56919c.clear();
            }
        } finally {
            try {
                return this.f56917a.d();
            } finally {
            }
        }
        return this.f56917a.d();
    }

    public <T> T a(e<T> eVar) throws NoValidDataException {
        if (eVar != null) {
            String a5 = eVar.a();
            if (!TextUtils.isEmpty(a5)) {
                this.f56922f.lock();
                try {
                    try {
                        if (!this.f56919c.isEmpty() && this.f56919c.containsKey(a5)) {
                            j jVar = this.f56919c.get(a5);
                            if (!jVar.e()) {
                                return (T) jVar.b();
                            }
                            this.f56919c.remove(a5);
                            d("Get done, exp-m: " + a5, this.f56917a.f56949j);
                            throw new NoValidDataException();
                        }
                    } finally {
                        this.f56922f.unlock();
                    }
                } catch (NoValidDataException e5) {
                    throw e5;
                } catch (Throwable th) {
                    b(th, this.f56917a.f56949j);
                }
                return (T) this.f56917a.a(new g(Data.rawMD5(a5)), eVar);
            }
            throw new IllegalArgumentException("Key: " + a5);
        }
        throw new IllegalArgumentException("deserializer is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Throwable th, String str) {
        a(th, true, str);
    }

    private static void a(Throwable th, boolean z4, String str) {
        if (z4) {
            String str2 = "[MPF][" + f56916h + "]";
            if (str != null) {
                str2 = str2 + "[" + str + "]";
            }
            MobLog.getInstance().d(th, str2, new Object[0]);
        }
    }

    private static void a(String str, boolean z4, String str2) {
        if (z4) {
            String str3 = "[MPF][" + f56916h + "]";
            if (str2 != null) {
                str3 = str3 + "[" + str2 + "]";
            }
            MobLog.getInstance().d(str3 + str, new Object[0]);
        }
    }
}
