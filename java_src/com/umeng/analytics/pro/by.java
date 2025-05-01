package com.umeng.analytics.pro;

import com.umeng.analytics.pro.co;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
/* compiled from: TDeserializer.java */
/* loaded from: classes6.dex */
public class by {

    /* renamed from: a  reason: collision with root package name */
    private final cu f63547a;

    /* renamed from: b  reason: collision with root package name */
    private final dh f63548b;

    public by() {
        this(new co.a());
    }

    private cp j(byte[] bArr, cc ccVar, cc... ccVarArr) throws cb {
        this.f63548b.a(bArr);
        int length = ccVarArr.length + 1;
        cc[] ccVarArr2 = new cc[length];
        int i4 = 0;
        ccVarArr2[0] = ccVar;
        int i5 = 0;
        while (i5 < ccVarArr.length) {
            int i6 = i5 + 1;
            ccVarArr2[i6] = ccVarArr[i5];
            i5 = i6;
        }
        this.f63547a.j();
        cp cpVar = null;
        while (i4 < length) {
            cpVar = this.f63547a.l();
            if (cpVar.f63628b == 0 || cpVar.f63629c > ccVarArr2[i4].a()) {
                return null;
            }
            if (cpVar.f63629c != ccVarArr2[i4].a()) {
                cx.a(this.f63547a, cpVar.f63628b);
                this.f63547a.m();
            } else {
                i4++;
                if (i4 < length) {
                    this.f63547a.j();
                }
            }
        }
        return cpVar;
    }

    public void a(bv bvVar, byte[] bArr) throws cb {
        try {
            this.f63548b.a(bArr);
            bvVar.read(this.f63547a);
        } finally {
            this.f63548b.e();
            this.f63547a.B();
        }
    }

    public Byte b(byte[] bArr, cc ccVar, cc... ccVarArr) throws cb {
        return (Byte) a((byte) 3, bArr, ccVar, ccVarArr);
    }

    public Double c(byte[] bArr, cc ccVar, cc... ccVarArr) throws cb {
        return (Double) a((byte) 4, bArr, ccVar, ccVarArr);
    }

    public Short d(byte[] bArr, cc ccVar, cc... ccVarArr) throws cb {
        return (Short) a((byte) 6, bArr, ccVar, ccVarArr);
    }

    public Integer e(byte[] bArr, cc ccVar, cc... ccVarArr) throws cb {
        return (Integer) a((byte) 8, bArr, ccVar, ccVarArr);
    }

    public Long f(byte[] bArr, cc ccVar, cc... ccVarArr) throws cb {
        return (Long) a((byte) 10, bArr, ccVar, ccVarArr);
    }

    public String g(byte[] bArr, cc ccVar, cc... ccVarArr) throws cb {
        return (String) a((byte) 11, bArr, ccVar, ccVarArr);
    }

    public ByteBuffer h(byte[] bArr, cc ccVar, cc... ccVarArr) throws cb {
        return (ByteBuffer) a((byte) 100, bArr, ccVar, ccVarArr);
    }

    public Short i(byte[] bArr, cc ccVar, cc... ccVarArr) throws cb {
        Short sh;
        try {
            try {
                if (j(bArr, ccVar, ccVarArr) != null) {
                    this.f63547a.j();
                    sh = Short.valueOf(this.f63547a.l().f63629c);
                } else {
                    sh = null;
                }
                return sh;
            } catch (Exception e5) {
                throw new cb(e5);
            }
        } finally {
            this.f63548b.e();
            this.f63547a.B();
        }
    }

    public by(cw cwVar) {
        dh dhVar = new dh();
        this.f63548b = dhVar;
        this.f63547a = cwVar.a(dhVar);
    }

    public void a(bv bvVar, String str, String str2) throws cb {
        try {
            try {
                a(bvVar, str.getBytes(str2));
            } catch (UnsupportedEncodingException unused) {
                throw new cb("JVM DOES NOT SUPPORT ENCODING: " + str2);
            }
        } finally {
            this.f63547a.B();
        }
    }

    public void a(bv bvVar, byte[] bArr, cc ccVar, cc... ccVarArr) throws cb {
        try {
            try {
                if (j(bArr, ccVar, ccVarArr) != null) {
                    bvVar.read(this.f63547a);
                }
            } catch (Exception e5) {
                throw new cb(e5);
            }
        } finally {
            this.f63548b.e();
            this.f63547a.B();
        }
    }

    public Boolean a(byte[] bArr, cc ccVar, cc... ccVarArr) throws cb {
        return (Boolean) a((byte) 2, bArr, ccVar, ccVarArr);
    }

    private Object a(byte b5, byte[] bArr, cc ccVar, cc... ccVarArr) throws cb {
        Object obj;
        try {
            try {
                cp j4 = j(bArr, ccVar, ccVarArr);
                if (j4 != null) {
                    if (b5 != 2) {
                        if (b5 != 3) {
                            if (b5 != 4) {
                                if (b5 != 6) {
                                    if (b5 != 8) {
                                        if (b5 != 100) {
                                            if (b5 != 10) {
                                                if (b5 == 11 && j4.f63628b == 11) {
                                                    obj = this.f63547a.z();
                                                }
                                            } else if (j4.f63628b == 10) {
                                                obj = Long.valueOf(this.f63547a.x());
                                            }
                                        } else if (j4.f63628b == 11) {
                                            obj = this.f63547a.A();
                                        }
                                    } else if (j4.f63628b == 8) {
                                        obj = Integer.valueOf(this.f63547a.w());
                                    }
                                } else if (j4.f63628b == 6) {
                                    obj = Short.valueOf(this.f63547a.v());
                                }
                            } else if (j4.f63628b == 4) {
                                obj = Double.valueOf(this.f63547a.y());
                            }
                        } else if (j4.f63628b == 3) {
                            obj = Byte.valueOf(this.f63547a.u());
                        }
                    } else if (j4.f63628b == 2) {
                        obj = Boolean.valueOf(this.f63547a.t());
                    }
                    return obj;
                }
                obj = null;
                return obj;
            } catch (Exception e5) {
                throw new cb(e5);
            }
        } finally {
            this.f63548b.e();
            this.f63547a.B();
        }
    }

    public void a(bv bvVar, String str) throws cb {
        a(bvVar, str.getBytes());
    }
}
