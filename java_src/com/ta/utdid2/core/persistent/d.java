package com.ta.utdid2.core.persistent;

import com.ta.utdid2.core.persistent.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes5.dex */
public class d {

    /* renamed from: d  reason: collision with root package name */
    public static final int f62083d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final int f62084e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f62085f = 0;

    /* renamed from: g  reason: collision with root package name */
    private static final Object f62086g = new Object();

    /* renamed from: b  reason: collision with root package name */
    private File f62088b;

    /* renamed from: a  reason: collision with root package name */
    private final Object f62087a = new Object();

    /* renamed from: c  reason: collision with root package name */
    private HashMap<File, a> f62089c = new HashMap<>();

    /* loaded from: classes5.dex */
    private static final class a implements b {

        /* renamed from: g  reason: collision with root package name */
        private static final Object f62090g = new Object();

        /* renamed from: a  reason: collision with root package name */
        private final File f62091a;

        /* renamed from: b  reason: collision with root package name */
        private final File f62092b;

        /* renamed from: c  reason: collision with root package name */
        private final int f62093c;

        /* renamed from: d  reason: collision with root package name */
        private Map f62094d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f62095e = false;

        /* renamed from: f  reason: collision with root package name */
        private WeakHashMap<b.InterfaceC0656b, Object> f62096f;

        /* renamed from: com.ta.utdid2.core.persistent.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public final class C0657a implements b.a {

            /* renamed from: a  reason: collision with root package name */
            private final Map<String, Object> f62097a = new HashMap();

            /* renamed from: b  reason: collision with root package name */
            private boolean f62098b = false;

            public C0657a() {
            }

            @Override // com.ta.utdid2.core.persistent.b.a
            public final b.a clear() {
                synchronized (this) {
                    this.f62098b = true;
                }
                return this;
            }

            @Override // com.ta.utdid2.core.persistent.b.a
            public final boolean commit() {
                boolean z4;
                ArrayList arrayList;
                HashSet<b.InterfaceC0656b> hashSet;
                boolean k4;
                synchronized (d.f62086g) {
                    z4 = a.this.f62096f.size() > 0;
                    arrayList = null;
                    if (z4) {
                        arrayList = new ArrayList();
                        hashSet = new HashSet(a.this.f62096f.keySet());
                    } else {
                        hashSet = null;
                    }
                    synchronized (this) {
                        if (this.f62098b) {
                            a.this.f62094d.clear();
                            this.f62098b = false;
                        }
                        for (Map.Entry<String, Object> entry : this.f62097a.entrySet()) {
                            String key = entry.getKey();
                            Object value = entry.getValue();
                            if (value == this) {
                                a.this.f62094d.remove(key);
                            } else {
                                a.this.f62094d.put(key, value);
                            }
                            if (z4) {
                                arrayList.add(key);
                            }
                        }
                        this.f62097a.clear();
                    }
                    k4 = a.this.k();
                    if (k4) {
                        a.this.j(true);
                    }
                }
                if (z4) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        String str = (String) arrayList.get(size);
                        for (b.InterfaceC0656b interfaceC0656b : hashSet) {
                            if (interfaceC0656b != null) {
                                interfaceC0656b.a(a.this, str);
                            }
                        }
                    }
                }
                return k4;
            }

            @Override // com.ta.utdid2.core.persistent.b.a
            public final b.a putBoolean(String str, boolean z4) {
                synchronized (this) {
                    this.f62097a.put(str, Boolean.valueOf(z4));
                }
                return this;
            }

            @Override // com.ta.utdid2.core.persistent.b.a
            public final b.a putFloat(String str, float f5) {
                synchronized (this) {
                    this.f62097a.put(str, Float.valueOf(f5));
                }
                return this;
            }

            @Override // com.ta.utdid2.core.persistent.b.a
            public final b.a putInt(String str, int i4) {
                synchronized (this) {
                    this.f62097a.put(str, Integer.valueOf(i4));
                }
                return this;
            }

            @Override // com.ta.utdid2.core.persistent.b.a
            public final b.a putLong(String str, long j4) {
                synchronized (this) {
                    this.f62097a.put(str, Long.valueOf(j4));
                }
                return this;
            }

            @Override // com.ta.utdid2.core.persistent.b.a
            public final b.a putString(String str, String str2) {
                synchronized (this) {
                    this.f62097a.put(str, str2);
                }
                return this;
            }

            @Override // com.ta.utdid2.core.persistent.b.a
            public final b.a remove(String str) {
                synchronized (this) {
                    this.f62097a.put(str, this);
                }
                return this;
            }
        }

        a(File file, int i4, Map map) {
            this.f62091a = file;
            this.f62092b = d.f(file);
            this.f62093c = i4;
            this.f62094d = map == null ? new HashMap() : map;
            this.f62096f = new WeakHashMap<>();
        }

        private FileOutputStream g(File file) {
            FileOutputStream fileOutputStream;
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (FileNotFoundException unused) {
                if (!file.getParentFile().mkdir()) {
                    return null;
                }
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (FileNotFoundException unused2) {
                    return null;
                }
            }
            return fileOutputStream;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean k() {
            if (this.f62091a.exists()) {
                if (!this.f62092b.exists()) {
                    if (!this.f62091a.renameTo(this.f62092b)) {
                        return false;
                    }
                } else {
                    this.f62091a.delete();
                }
            }
            try {
                FileOutputStream g4 = g(this.f62091a);
                if (g4 == null) {
                    return false;
                }
                e.j(this.f62094d, g4);
                g4.close();
                this.f62092b.delete();
                return true;
            } catch (IOException | XmlPullParserException unused) {
                if (this.f62091a.exists()) {
                    this.f62091a.delete();
                }
                return false;
            }
        }

        @Override // com.ta.utdid2.core.persistent.b
        public final boolean a() {
            return this.f62091a != null && new File(this.f62091a.getAbsolutePath()).exists();
        }

        @Override // com.ta.utdid2.core.persistent.b
        public final void b(b.InterfaceC0656b interfaceC0656b) {
            synchronized (this) {
                this.f62096f.remove(interfaceC0656b);
            }
        }

        @Override // com.ta.utdid2.core.persistent.b
        public final void c(b.InterfaceC0656b interfaceC0656b) {
            synchronized (this) {
                this.f62096f.put(interfaceC0656b, f62090g);
            }
        }

        @Override // com.ta.utdid2.core.persistent.b
        public final boolean contains(String str) {
            boolean containsKey;
            synchronized (this) {
                containsKey = this.f62094d.containsKey(str);
            }
            return containsKey;
        }

        @Override // com.ta.utdid2.core.persistent.b
        public final b.a edit() {
            return new C0657a();
        }

        @Override // com.ta.utdid2.core.persistent.b
        public final Map<String, ?> getAll() {
            HashMap hashMap;
            synchronized (this) {
                hashMap = new HashMap(this.f62094d);
            }
            return hashMap;
        }

        @Override // com.ta.utdid2.core.persistent.b
        public final boolean getBoolean(String str, boolean z4) {
            synchronized (this) {
                Boolean bool = (Boolean) this.f62094d.get(str);
                if (bool != null) {
                    z4 = bool.booleanValue();
                }
            }
            return z4;
        }

        @Override // com.ta.utdid2.core.persistent.b
        public final float getFloat(String str, float f5) {
            synchronized (this) {
                Float f6 = (Float) this.f62094d.get(str);
                if (f6 != null) {
                    f5 = f6.floatValue();
                }
            }
            return f5;
        }

        @Override // com.ta.utdid2.core.persistent.b
        public final int getInt(String str, int i4) {
            synchronized (this) {
                Integer num = (Integer) this.f62094d.get(str);
                if (num != null) {
                    i4 = num.intValue();
                }
            }
            return i4;
        }

        @Override // com.ta.utdid2.core.persistent.b
        public final long getLong(String str, long j4) {
            synchronized (this) {
                Long l4 = (Long) this.f62094d.get(str);
                if (l4 != null) {
                    j4 = l4.longValue();
                }
            }
            return j4;
        }

        @Override // com.ta.utdid2.core.persistent.b
        public final String getString(String str, String str2) {
            synchronized (this) {
                String str3 = (String) this.f62094d.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            }
            return str2;
        }

        public final boolean h() {
            boolean z4;
            synchronized (this) {
                z4 = this.f62095e;
            }
            return z4;
        }

        public final void i(Map map) {
            if (map != null) {
                synchronized (this) {
                    this.f62094d = map;
                }
            }
        }

        public final void j(boolean z4) {
            synchronized (this) {
                this.f62095e = z4;
            }
        }
    }

    public d(String str) {
        if (str != null && str.length() > 0) {
            this.f62088b = new File(str);
            return;
        }
        throw new RuntimeException("Directory can not be empty");
    }

    private File d() {
        File file;
        synchronized (this.f62087a) {
            file = this.f62088b;
        }
        return file;
    }

    private File e(String str) {
        File d5 = d();
        return g(d5, str + ".xml");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static File f(File file) {
        return new File(file.getPath() + ".bak");
    }

    private File g(File file, String str) {
        if (str.indexOf(File.separatorChar) < 0) {
            return new File(file, str);
        }
        throw new IllegalArgumentException("File " + str + " contains a path separator");
    }

    public b c(String str, int i4) {
        File e5 = e(str);
        synchronized (f62086g) {
            a aVar = this.f62089c.get(e5);
            if (aVar == null || aVar.h()) {
                File f5 = f(e5);
                if (f5.exists()) {
                    e5.delete();
                    f5.renameTo(e5);
                }
                if (e5.exists()) {
                    e5.canRead();
                }
                HashMap hashMap = null;
                if (e5.exists() && e5.canRead()) {
                    try {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(e5);
                            hashMap = e.a(fileInputStream);
                            fileInputStream.close();
                        } catch (FileNotFoundException e6) {
                            e6.printStackTrace();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                    } catch (FileNotFoundException e8) {
                        e8.printStackTrace();
                    } catch (IOException e9) {
                        e9.printStackTrace();
                    } catch (XmlPullParserException unused) {
                        FileInputStream fileInputStream2 = new FileInputStream(e5);
                        int available = fileInputStream2.available();
                        byte[] bArr = new byte[available];
                        fileInputStream2.read(bArr);
                        new String(bArr, 0, available, "UTF-8");
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                synchronized (f62086g) {
                    if (aVar != null) {
                        aVar.i(hashMap);
                    } else {
                        aVar = this.f62089c.get(e5);
                        if (aVar == null) {
                            aVar = new a(e5, i4, hashMap);
                            this.f62089c.put(e5, aVar);
                        }
                    }
                }
                return aVar;
            }
            return aVar;
        }
    }
}
