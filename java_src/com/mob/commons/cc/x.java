package com.mob.commons.cc;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes5.dex */
public class x {

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        protected ArrayList<Object> f56291a;

        /* renamed from: b  reason: collision with root package name */
        protected DataInputStream f56292b;

        /* renamed from: c  reason: collision with root package name */
        protected int f56293c;

        public void a() throws Throwable {
            this.f56292b.readShort();
        }

        public <T> T b() throws Throwable {
            return (T) this.f56291a.get(this.f56292b.readShort());
        }

        public int c() {
            return this.f56293c;
        }

        private a(ArrayList<Object> arrayList, DataInputStream dataInputStream, int i4) {
            this.f56291a = arrayList;
            this.f56292b = dataInputStream;
            this.f56293c = i4;
        }

        public void a(y yVar) throws Throwable {
            yVar.f56302b = (String) this.f56291a.get(this.f56292b.readShort());
            yVar.f56303c = this.f56292b.readShort();
        }
    }

    /* loaded from: classes5.dex */
    public static class b extends a {
        @Override // com.mob.commons.cc.x.a
        public void a() throws Throwable {
            this.f56292b.readInt();
        }

        @Override // com.mob.commons.cc.x.a
        public <T> T b() throws Throwable {
            return (T) this.f56291a.get(this.f56292b.readInt());
        }

        private b(ArrayList<Object> arrayList, DataInputStream dataInputStream, int i4) {
            super(arrayList, dataInputStream, i4);
        }

        @Override // com.mob.commons.cc.x.a
        public void a(y yVar) throws Throwable {
            yVar.f56302b = (String) this.f56291a.get(this.f56292b.readInt());
            yVar.f56303c = this.f56292b.readInt();
        }
    }

    /* loaded from: classes5.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private d f56294a;

        public c a(Object obj) {
            this.f56294a.a(obj);
            return this;
        }

        private c(Object obj) {
            this.f56294a = new d(obj);
        }

        public d a(String str, Object obj) {
            return this.f56294a.a(str, obj);
        }

        public d a(String str, Class<?> cls) {
            return this.f56294a.a(str, cls);
        }

        public void a() throws Throwable {
            this.f56294a.a();
        }
    }

    /* loaded from: classes5.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private ArrayList<Object> f56295a;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<Object> f56296b;

        /* renamed from: c  reason: collision with root package name */
        private HashMap<String, Object> f56297c;

        /* renamed from: d  reason: collision with root package name */
        private HashMap<String, Object> f56298d;

        /* renamed from: e  reason: collision with root package name */
        private String f56299e;

        /* renamed from: f  reason: collision with root package name */
        private HashMap<Class<?>, Class<? extends t<?>>> f56300f;

        private d(Object obj) {
            ArrayList<Object> arrayList = new ArrayList<>();
            this.f56295a = arrayList;
            arrayList.add(obj);
            this.f56296b = new ArrayList<>();
            this.f56297c = new HashMap<>();
            this.f56298d = new HashMap<>();
            this.f56300f = new HashMap<>();
            this.f56297c.put("t_map", this.f56298d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Object obj) {
            this.f56295a.add(obj);
        }

        public d a(String str, Object obj) {
            this.f56297c.put(str, obj);
            return this;
        }

        public d a(String str, Class<?> cls) {
            w.f56288a.put(str, cls);
            return this;
        }

        public d a(String str) {
            this.f56299e = str;
            return this;
        }

        public <T> d a(Class<T> cls, Class<? extends t<T>> cls2) {
            this.f56300f.put(cls, cls2);
            return this;
        }

        public void a() throws Throwable {
            byte[] bArr;
            InputStream byteArrayInputStream;
            ArrayList<y> arrayList = new ArrayList<>();
            String str = this.f56299e;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
                System.arraycopy(bArr, 0, new byte[16], 0, Math.min(bArr.length, 16));
            } else {
                bArr = null;
            }
            try {
                u uVar = new u();
                Iterator<Object> it2 = this.f56295a.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof String) {
                        byteArrayInputStream = new FileInputStream((String) next);
                    } else if (next instanceof byte[]) {
                        byteArrayInputStream = new ByteArrayInputStream((byte[]) next);
                    } else {
                        throw new ClassCastException("program is not string or byte array");
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    a(byteArrayInputStream, arrayList, uVar);
                    this.f56298d.put("l_t", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                }
                for (Map.Entry<Class<?>, Class<? extends t<?>>> entry : this.f56300f.entrySet()) {
                    uVar.a(entry.getKey(), entry.getValue());
                }
                new w(arrayList, this.f56296b).a(this.f56297c, uVar);
            } catch (Throwable th) {
                th = th;
                if (bArr == null) {
                    throw th;
                }
                String cls = th.getMessage() == null ? th.getClass().toString() : th.getMessage();
                if (th instanceof v) {
                    th = th.getCause();
                }
                throw new v(a(bArr, cls + " " + a(th)), th);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #4 {all -> 0x004c, blocks: (B:18:0x0032, B:20:0x0036, B:24:0x0042), top: B:46:0x0032 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0042 A[Catch: all -> 0x004c, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x004c, blocks: (B:18:0x0032, B:20:0x0036, B:24:0x0042), top: B:46:0x0032 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private java.lang.String a(java.lang.Throwable r5) {
            /*
                r4 = this;
                java.lang.String r0 = ""
                if (r5 != 0) goto L5
                return r0
            L5:
                r1 = 0
                r2 = r5
            L7:
                if (r2 == 0) goto L13
                boolean r3 = r2 instanceof java.net.UnknownHostException     // Catch: java.lang.Throwable -> L31
                if (r3 == 0) goto Le
                return r0
            Le:
                java.lang.Throwable r2 = r2.getCause()     // Catch: java.lang.Throwable -> L31
                goto L7
            L13:
                java.io.StringWriter r0 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L31
                r0.<init>()     // Catch: java.lang.Throwable -> L31
                java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> L2e
                r1.<init>(r0)     // Catch: java.lang.Throwable -> L2e
                r5.printStackTrace(r1)     // Catch: java.lang.Throwable -> L2e
                r1.flush()     // Catch: java.lang.Throwable -> L2e
                r1.close()     // Catch: java.lang.Throwable -> L2e
                java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L2e
                r0.close()     // Catch: java.lang.Throwable -> L2d
            L2d:
                return r5
            L2e:
                r5 = move-exception
                r1 = r0
                goto L32
            L31:
                r5 = move-exception
            L32:
                boolean r0 = r5 instanceof java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L4c
                if (r0 == 0) goto L42
                java.lang.String r5 = "023(glMhk'gn<kfe2gjhefl^fehWgn7k+flfk_gTglkhfmfmfh"
                java.lang.String r5 = com.mob.commons.l.a(r5)     // Catch: java.lang.Throwable -> L4c
                if (r1 == 0) goto L41
                r1.close()     // Catch: java.lang.Throwable -> L41
            L41:
                return r5
            L42:
                java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L4c
                if (r1 == 0) goto L4b
                r1.close()     // Catch: java.lang.Throwable -> L4b
            L4b:
                return r5
            L4c:
                r5 = move-exception
                if (r1 == 0) goto L52
                r1.close()     // Catch: java.lang.Throwable -> L52
            L52:
                goto L54
            L53:
                throw r5
            L54:
                goto L53
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.cc.x.d.a(java.lang.Throwable):java.lang.String");
        }

        private String a(byte[] bArr, String str) {
            Cipher cipher;
            if (bArr != null) {
                try {
                    byte[] bytes = str.getBytes("UTF-8");
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, com.mob.commons.l.a("003+hfikgn"));
                    StringBuilder sb = new StringBuilder();
                    sb.append(com.mob.commons.l.a("003Uhfikgn"));
                    sb.append(com.mob.commons.l.a("003n@ikgf"));
                    sb.append(com.mob.commons.l.a("008EhlVnHinkegfgnkmin"));
                    sb.append(com.mob.commons.l.a("006f)fefefk0g6gl"));
                    Provider provider = Security.getProvider(com.mob.commons.l.a("002+hlgf"));
                    if (provider != null) {
                        cipher = Cipher.getInstance(sb.toString(), provider);
                    } else {
                        cipher = Cipher.getInstance(sb.toString(), com.mob.commons.l.a("002Qhlgf"));
                    }
                    cipher.init(1, secretKeySpec);
                    byte[] bArr2 = new byte[cipher.getOutputSize(bytes.length)];
                    cipher.doFinal(bArr2, cipher.update(bytes, 0, bytes.length, bArr2, 0));
                    return new BigInteger(1, bArr2).toString(16);
                } catch (Throwable unused) {
                    return "";
                }
            }
            return str;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:6|(2:7|8)|(21:(24:12|13|14|15|27|28|(1:30)|31|32|(1:34)|35|36|(1:38)|39|40|(1:42)|43|44|(1:46)|47|48|(9:50|51|52|54|55|56|(3:58|59|60)|69|70)(3:133|(1:135)|136)|71|(4:73|(1:75)(1:125)|76|(4:(3:79|(2:81|82)(1:84)|83)|85|86|(8:88|89|90|(7:99|100|102|103|104|105|106)|92|93|94|95)(2:121|122))(2:123|124))(2:126|127))|27|28|(0)|31|32|(0)|35|36|(0)|39|40|(0)|43|44|(0)|47|48|(0)(0)|71|(0)(0))|142|143|144|145|13|14|15) */
        /* JADX WARN: Code restructure failed: missing block: B:100:0x01e2, code lost:
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x01e3, code lost:
            r7 = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x01e5, code lost:
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x01ec, code lost:
            r2.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:108:0x01f0, code lost:
            r7.close();
         */
        /* JADX WARN: Removed duplicated region for block: B:107:0x01ec A[Catch: all -> 0x01f3, TRY_ENTER, TryCatch #7 {all -> 0x01f3, blocks: (B:107:0x01ec, B:108:0x01f0), top: B:129:0x01ea }] */
        /* JADX WARN: Removed duplicated region for block: B:108:0x01f0 A[Catch: all -> 0x01f3, TRY_LEAVE, TryCatch #7 {all -> 0x01f3, blocks: (B:107:0x01ec, B:108:0x01f0), top: B:129:0x01ea }] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[Catch: all -> 0x01df, LOOP:0: B:18:0x0041->B:19:0x0043, LOOP_END, TryCatch #12 {all -> 0x01df, blocks: (B:17:0x0033, B:19:0x0043, B:20:0x0051, B:22:0x0058, B:23:0x0066, B:25:0x006d, B:26:0x007b, B:28:0x0082, B:29:0x0090, B:31:0x0097, B:32:0x00a5, B:34:0x00ab, B:43:0x00da, B:56:0x00fb, B:58:0x0103, B:60:0x011a, B:62:0x012d, B:65:0x013f, B:67:0x014c, B:68:0x014f, B:69:0x015a, B:71:0x0162, B:92:0x01c7, B:93:0x01ce, B:94:0x01cf, B:95:0x01d6, B:61:0x0124, B:96:0x01d7, B:97:0x01de, B:50:0x00e6, B:52:0x00ed, B:51:0x00ea, B:55:0x00f1), top: B:139:0x0033 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[Catch: all -> 0x01df, LOOP:1: B:21:0x0056->B:22:0x0058, LOOP_END, TryCatch #12 {all -> 0x01df, blocks: (B:17:0x0033, B:19:0x0043, B:20:0x0051, B:22:0x0058, B:23:0x0066, B:25:0x006d, B:26:0x007b, B:28:0x0082, B:29:0x0090, B:31:0x0097, B:32:0x00a5, B:34:0x00ab, B:43:0x00da, B:56:0x00fb, B:58:0x0103, B:60:0x011a, B:62:0x012d, B:65:0x013f, B:67:0x014c, B:68:0x014f, B:69:0x015a, B:71:0x0162, B:92:0x01c7, B:93:0x01ce, B:94:0x01cf, B:95:0x01d6, B:61:0x0124, B:96:0x01d7, B:97:0x01de, B:50:0x00e6, B:52:0x00ed, B:51:0x00ea, B:55:0x00f1), top: B:139:0x0033 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[Catch: all -> 0x01df, LOOP:2: B:24:0x006b->B:25:0x006d, LOOP_END, TryCatch #12 {all -> 0x01df, blocks: (B:17:0x0033, B:19:0x0043, B:20:0x0051, B:22:0x0058, B:23:0x0066, B:25:0x006d, B:26:0x007b, B:28:0x0082, B:29:0x0090, B:31:0x0097, B:32:0x00a5, B:34:0x00ab, B:43:0x00da, B:56:0x00fb, B:58:0x0103, B:60:0x011a, B:62:0x012d, B:65:0x013f, B:67:0x014c, B:68:0x014f, B:69:0x015a, B:71:0x0162, B:92:0x01c7, B:93:0x01ce, B:94:0x01cf, B:95:0x01d6, B:61:0x0124, B:96:0x01d7, B:97:0x01de, B:50:0x00e6, B:52:0x00ed, B:51:0x00ea, B:55:0x00f1), top: B:139:0x0033 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[Catch: all -> 0x01df, LOOP:3: B:27:0x0080->B:28:0x0082, LOOP_END, TryCatch #12 {all -> 0x01df, blocks: (B:17:0x0033, B:19:0x0043, B:20:0x0051, B:22:0x0058, B:23:0x0066, B:25:0x006d, B:26:0x007b, B:28:0x0082, B:29:0x0090, B:31:0x0097, B:32:0x00a5, B:34:0x00ab, B:43:0x00da, B:56:0x00fb, B:58:0x0103, B:60:0x011a, B:62:0x012d, B:65:0x013f, B:67:0x014c, B:68:0x014f, B:69:0x015a, B:71:0x0162, B:92:0x01c7, B:93:0x01ce, B:94:0x01cf, B:95:0x01d6, B:61:0x0124, B:96:0x01d7, B:97:0x01de, B:50:0x00e6, B:52:0x00ed, B:51:0x00ea, B:55:0x00f1), top: B:139:0x0033 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0097 A[Catch: all -> 0x01df, LOOP:4: B:30:0x0095->B:31:0x0097, LOOP_END, TryCatch #12 {all -> 0x01df, blocks: (B:17:0x0033, B:19:0x0043, B:20:0x0051, B:22:0x0058, B:23:0x0066, B:25:0x006d, B:26:0x007b, B:28:0x0082, B:29:0x0090, B:31:0x0097, B:32:0x00a5, B:34:0x00ab, B:43:0x00da, B:56:0x00fb, B:58:0x0103, B:60:0x011a, B:62:0x012d, B:65:0x013f, B:67:0x014c, B:68:0x014f, B:69:0x015a, B:71:0x0162, B:92:0x01c7, B:93:0x01ce, B:94:0x01cf, B:95:0x01d6, B:61:0x0124, B:96:0x01d7, B:97:0x01de, B:50:0x00e6, B:52:0x00ed, B:51:0x00ea, B:55:0x00f1), top: B:139:0x0033 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[Catch: all -> 0x01df, TRY_LEAVE, TryCatch #12 {all -> 0x01df, blocks: (B:17:0x0033, B:19:0x0043, B:20:0x0051, B:22:0x0058, B:23:0x0066, B:25:0x006d, B:26:0x007b, B:28:0x0082, B:29:0x0090, B:31:0x0097, B:32:0x00a5, B:34:0x00ab, B:43:0x00da, B:56:0x00fb, B:58:0x0103, B:60:0x011a, B:62:0x012d, B:65:0x013f, B:67:0x014c, B:68:0x014f, B:69:0x015a, B:71:0x0162, B:92:0x01c7, B:93:0x01ce, B:94:0x01cf, B:95:0x01d6, B:61:0x0124, B:96:0x01d7, B:97:0x01de, B:50:0x00e6, B:52:0x00ed, B:51:0x00ea, B:55:0x00f1), top: B:139:0x0033 }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0103 A[Catch: all -> 0x01df, TryCatch #12 {all -> 0x01df, blocks: (B:17:0x0033, B:19:0x0043, B:20:0x0051, B:22:0x0058, B:23:0x0066, B:25:0x006d, B:26:0x007b, B:28:0x0082, B:29:0x0090, B:31:0x0097, B:32:0x00a5, B:34:0x00ab, B:43:0x00da, B:56:0x00fb, B:58:0x0103, B:60:0x011a, B:62:0x012d, B:65:0x013f, B:67:0x014c, B:68:0x014f, B:69:0x015a, B:71:0x0162, B:92:0x01c7, B:93:0x01ce, B:94:0x01cf, B:95:0x01d6, B:61:0x0124, B:96:0x01d7, B:97:0x01de, B:50:0x00e6, B:52:0x00ed, B:51:0x00ea, B:55:0x00f1), top: B:139:0x0033 }] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01d7 A[Catch: all -> 0x01df, TryCatch #12 {all -> 0x01df, blocks: (B:17:0x0033, B:19:0x0043, B:20:0x0051, B:22:0x0058, B:23:0x0066, B:25:0x006d, B:26:0x007b, B:28:0x0082, B:29:0x0090, B:31:0x0097, B:32:0x00a5, B:34:0x00ab, B:43:0x00da, B:56:0x00fb, B:58:0x0103, B:60:0x011a, B:62:0x012d, B:65:0x013f, B:67:0x014c, B:68:0x014f, B:69:0x015a, B:71:0x0162, B:92:0x01c7, B:93:0x01ce, B:94:0x01cf, B:95:0x01d6, B:61:0x0124, B:96:0x01d7, B:97:0x01de, B:50:0x00e6, B:52:0x00ed, B:51:0x00ea, B:55:0x00f1), top: B:139:0x0033 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a(java.io.InputStream r16, java.util.ArrayList<com.mob.commons.cc.y> r17, com.mob.commons.cc.u r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 502
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.cc.x.d.a(java.io.InputStream, java.util.ArrayList, com.mob.commons.cc.u):void");
        }
    }

    private x() {
    }

    public static int a() {
        return 70;
    }

    public static c a(String... strArr) {
        return a((Object[]) strArr);
    }

    public static c a(byte[]... bArr) {
        return a((Object[]) bArr);
    }

    private static c a(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        c cVar = new c(objArr[0]);
        for (int i4 = 1; i4 < objArr.length; i4++) {
            cVar.a(objArr[i4]);
        }
        return cVar;
    }
}
