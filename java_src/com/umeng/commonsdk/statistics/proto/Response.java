package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.bm;
import com.umeng.analytics.pro.bs;
import com.umeng.analytics.pro.bv;
import com.umeng.analytics.pro.cb;
import com.umeng.analytics.pro.cc;
import com.umeng.analytics.pro.ch;
import com.umeng.analytics.pro.ci;
import com.umeng.analytics.pro.cm;
import com.umeng.analytics.pro.co;
import com.umeng.analytics.pro.cp;
import com.umeng.analytics.pro.cu;
import com.umeng.analytics.pro.cv;
import com.umeng.analytics.pro.cx;
import com.umeng.analytics.pro.cz;
import com.umeng.analytics.pro.da;
import com.umeng.analytics.pro.dc;
import com.umeng.analytics.pro.dd;
import com.umeng.analytics.pro.de;
import com.umeng.analytics.pro.df;
import com.umeng.analytics.pro.dg;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes6.dex */
public class Response implements bv<Response, e>, Serializable, Cloneable {
    private static final int __RESP_CODE_ISSET_ID = 0;
    public static final Map<e, ch> metaDataMap;
    private static final Map<Class<? extends dc>, dd> schemes;
    private static final long serialVersionUID = -4549277923241195391L;
    private byte __isset_bitfield;
    public com.umeng.commonsdk.statistics.proto.d imprint;
    public String msg;
    private e[] optionals;
    public int resp_code;
    private static final cz STRUCT_DESC = new cz("Response");
    private static final cp RESP_CODE_FIELD_DESC = new cp("resp_code", (byte) 8, 1);
    private static final cp MSG_FIELD_DESC = new cp("msg", (byte) 11, 2);
    private static final cp IMPRINT_FIELD_DESC = new cp(bm.X, (byte) 12, 3);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class a extends de<Response> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.dc
        /* renamed from: a */
        public void b(cu cuVar, Response response) throws cb {
            cuVar.j();
            while (true) {
                cp l4 = cuVar.l();
                byte b5 = l4.f63628b;
                if (b5 == 0) {
                    break;
                }
                short s4 = l4.f63629c;
                if (s4 != 1) {
                    if (s4 != 2) {
                        if (s4 != 3) {
                            cx.a(cuVar, b5);
                        } else if (b5 == 12) {
                            com.umeng.commonsdk.statistics.proto.d dVar = new com.umeng.commonsdk.statistics.proto.d();
                            response.imprint = dVar;
                            dVar.read(cuVar);
                            response.setImprintIsSet(true);
                        } else {
                            cx.a(cuVar, b5);
                        }
                    } else if (b5 == 11) {
                        response.msg = cuVar.z();
                        response.setMsgIsSet(true);
                    } else {
                        cx.a(cuVar, b5);
                    }
                } else if (b5 == 8) {
                    response.resp_code = cuVar.w();
                    response.setResp_codeIsSet(true);
                } else {
                    cx.a(cuVar, b5);
                }
                cuVar.m();
            }
            cuVar.k();
            if (response.isSetResp_code()) {
                response.validate();
                return;
            }
            throw new cv("Required field 'resp_code' was not found in serialized data! Struct: " + toString());
        }

        @Override // com.umeng.analytics.pro.dc
        /* renamed from: b */
        public void a(cu cuVar, Response response) throws cb {
            response.validate();
            cuVar.a(Response.STRUCT_DESC);
            cuVar.a(Response.RESP_CODE_FIELD_DESC);
            cuVar.a(response.resp_code);
            cuVar.c();
            if (response.msg != null && response.isSetMsg()) {
                cuVar.a(Response.MSG_FIELD_DESC);
                cuVar.a(response.msg);
                cuVar.c();
            }
            if (response.imprint != null && response.isSetImprint()) {
                cuVar.a(Response.IMPRINT_FIELD_DESC);
                response.imprint.write(cuVar);
                cuVar.c();
            }
            cuVar.d();
            cuVar.b();
        }
    }

    /* loaded from: classes6.dex */
    private static class b implements dd {
        private b() {
        }

        @Override // com.umeng.analytics.pro.dd
        /* renamed from: a */
        public a b() {
            return new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class c extends df<Response> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.dc
        public void a(cu cuVar, Response response) throws cb {
            da daVar = (da) cuVar;
            daVar.a(response.resp_code);
            BitSet bitSet = new BitSet();
            if (response.isSetMsg()) {
                bitSet.set(0);
            }
            if (response.isSetImprint()) {
                bitSet.set(1);
            }
            daVar.a(bitSet, 2);
            if (response.isSetMsg()) {
                daVar.a(response.msg);
            }
            if (response.isSetImprint()) {
                response.imprint.write(daVar);
            }
        }

        @Override // com.umeng.analytics.pro.dc
        public void b(cu cuVar, Response response) throws cb {
            da daVar = (da) cuVar;
            response.resp_code = daVar.w();
            response.setResp_codeIsSet(true);
            BitSet b5 = daVar.b(2);
            if (b5.get(0)) {
                response.msg = daVar.z();
                response.setMsgIsSet(true);
            }
            if (b5.get(1)) {
                com.umeng.commonsdk.statistics.proto.d dVar = new com.umeng.commonsdk.statistics.proto.d();
                response.imprint = dVar;
                dVar.read(daVar);
                response.setImprintIsSet(true);
            }
        }
    }

    /* loaded from: classes6.dex */
    private static class d implements dd {
        private d() {
        }

        @Override // com.umeng.analytics.pro.dd
        /* renamed from: a */
        public c b() {
            return new c();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        schemes = hashMap;
        hashMap.put(de.class, new b());
        hashMap.put(df.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.RESP_CODE, (e) new ch("resp_code", (byte) 1, new ci((byte) 8)));
        enumMap.put((EnumMap) e.MSG, (e) new ch("msg", (byte) 2, new ci((byte) 11)));
        enumMap.put((EnumMap) e.IMPRINT, (e) new ch(bm.X, (byte) 2, new cm((byte) 12, com.umeng.commonsdk.statistics.proto.d.class)));
        Map<e, ch> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        ch.a(Response.class, unmodifiableMap);
    }

    public Response() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new e[]{e.MSG, e.IMPRINT};
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = (byte) 0;
            read(new co(new dg(objectInputStream)));
        } catch (cb e5) {
            throw new IOException(e5.getMessage());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new co(new dg(objectOutputStream)));
        } catch (cb e5) {
            throw new IOException(e5.getMessage());
        }
    }

    @Override // com.umeng.analytics.pro.bv
    public void clear() {
        setResp_codeIsSet(false);
        this.resp_code = 0;
        this.msg = null;
        this.imprint = null;
    }

    public com.umeng.commonsdk.statistics.proto.d getImprint() {
        return this.imprint;
    }

    public String getMsg() {
        return this.msg;
    }

    public int getResp_code() {
        return this.resp_code;
    }

    public boolean isSetImprint() {
        return this.imprint != null;
    }

    public boolean isSetMsg() {
        return this.msg != null;
    }

    public boolean isSetResp_code() {
        return bs.a(this.__isset_bitfield, 0);
    }

    @Override // com.umeng.analytics.pro.bv
    public void read(cu cuVar) throws cb {
        schemes.get(cuVar.D()).b().b(cuVar, this);
    }

    public Response setImprint(com.umeng.commonsdk.statistics.proto.d dVar) {
        this.imprint = dVar;
        return this;
    }

    public void setImprintIsSet(boolean z4) {
        if (z4) {
            return;
        }
        this.imprint = null;
    }

    public Response setMsg(String str) {
        this.msg = str;
        return this;
    }

    public void setMsgIsSet(boolean z4) {
        if (z4) {
            return;
        }
        this.msg = null;
    }

    public Response setResp_code(int i4) {
        this.resp_code = i4;
        setResp_codeIsSet(true);
        return this;
    }

    public void setResp_codeIsSet(boolean z4) {
        this.__isset_bitfield = bs.a(this.__isset_bitfield, 0, z4);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Response(");
        sb.append("resp_code:");
        sb.append(this.resp_code);
        if (isSetMsg()) {
            sb.append(", ");
            sb.append("msg:");
            String str = this.msg;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        if (isSetImprint()) {
            sb.append(", ");
            sb.append("imprint:");
            com.umeng.commonsdk.statistics.proto.d dVar = this.imprint;
            if (dVar == null) {
                sb.append("null");
            } else {
                sb.append(dVar);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public void unsetImprint() {
        this.imprint = null;
    }

    public void unsetMsg() {
        this.msg = null;
    }

    public void unsetResp_code() {
        this.__isset_bitfield = bs.b(this.__isset_bitfield, 0);
    }

    public void validate() throws cb {
        com.umeng.commonsdk.statistics.proto.d dVar = this.imprint;
        if (dVar != null) {
            dVar.l();
        }
    }

    @Override // com.umeng.analytics.pro.bv
    public void write(cu cuVar) throws cb {
        schemes.get(cuVar.D()).b().a(cuVar, this);
    }

    /* loaded from: classes6.dex */
    public enum e implements cc {
        RESP_CODE(1, "resp_code"),
        MSG(2, "msg"),
        IMPRINT(3, bm.X);
        

        /* renamed from: d  reason: collision with root package name */
        private static final Map<String, e> f64472d = new HashMap();

        /* renamed from: e  reason: collision with root package name */
        private final short f64474e;

        /* renamed from: f  reason: collision with root package name */
        private final String f64475f;

        static {
            Iterator it2 = EnumSet.allOf(e.class).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                f64472d.put(eVar.b(), eVar);
            }
        }

        e(short s4, String str) {
            this.f64474e = s4;
            this.f64475f = str;
        }

        public static e a(int i4) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        return null;
                    }
                    return IMPRINT;
                }
                return MSG;
            }
            return RESP_CODE;
        }

        public static e b(int i4) {
            e a5 = a(i4);
            if (a5 != null) {
                return a5;
            }
            throw new IllegalArgumentException("Field " + i4 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.cc
        public String b() {
            return this.f64475f;
        }

        public static e a(String str) {
            return f64472d.get(str);
        }

        @Override // com.umeng.analytics.pro.cc
        public short a() {
            return this.f64474e;
        }
    }

    @Override // com.umeng.analytics.pro.bv
    public bv<Response, e> deepCopy() {
        return new Response(this);
    }

    @Override // com.umeng.analytics.pro.bv
    public e fieldForId(int i4) {
        return e.a(i4);
    }

    public Response(int i4) {
        this();
        this.resp_code = i4;
        setResp_codeIsSet(true);
    }

    public Response(Response response) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new e[]{e.MSG, e.IMPRINT};
        this.__isset_bitfield = response.__isset_bitfield;
        this.resp_code = response.resp_code;
        if (response.isSetMsg()) {
            this.msg = response.msg;
        }
        if (response.isSetImprint()) {
            this.imprint = new com.umeng.commonsdk.statistics.proto.d(response.imprint);
        }
    }
}
