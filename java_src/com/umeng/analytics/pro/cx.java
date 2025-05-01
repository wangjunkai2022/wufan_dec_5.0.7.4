package com.umeng.analytics.pro;

import com.umeng.analytics.pro.co;
/* compiled from: TProtocolUtil.java */
/* loaded from: classes6.dex */
public class cx {

    /* renamed from: a  reason: collision with root package name */
    private static int f63651a = Integer.MAX_VALUE;

    public static void a(int i4) {
        f63651a = i4;
    }

    public static void a(cu cuVar, byte b5) throws cb {
        a(cuVar, b5, f63651a);
    }

    public static void a(cu cuVar, byte b5, int i4) throws cb {
        if (i4 > 0) {
            int i5 = 0;
            switch (b5) {
                case 2:
                    cuVar.t();
                    return;
                case 3:
                    cuVar.u();
                    return;
                case 4:
                    cuVar.y();
                    return;
                case 5:
                case 7:
                case 9:
                default:
                    return;
                case 6:
                    cuVar.v();
                    return;
                case 8:
                    cuVar.w();
                    return;
                case 10:
                    cuVar.x();
                    return;
                case 11:
                    cuVar.A();
                    return;
                case 12:
                    cuVar.j();
                    while (true) {
                        byte b6 = cuVar.l().f63628b;
                        if (b6 == 0) {
                            cuVar.k();
                            return;
                        } else {
                            a(cuVar, b6, i4 - 1);
                            cuVar.m();
                        }
                    }
                case 13:
                    cr n4 = cuVar.n();
                    while (i5 < n4.f63634c) {
                        int i6 = i4 - 1;
                        a(cuVar, n4.f63632a, i6);
                        a(cuVar, n4.f63633b, i6);
                        i5++;
                    }
                    cuVar.o();
                    return;
                case 14:
                    cy r4 = cuVar.r();
                    while (i5 < r4.f63653b) {
                        a(cuVar, r4.f63652a, i4 - 1);
                        i5++;
                    }
                    cuVar.s();
                    return;
                case 15:
                    cq p4 = cuVar.p();
                    while (i5 < p4.f63631b) {
                        a(cuVar, p4.f63630a, i4 - 1);
                        i5++;
                    }
                    cuVar.q();
                    return;
            }
        } else {
            throw new cb("Maximum skip depth exceeded");
        }
    }

    public static cw a(byte[] bArr, cw cwVar) {
        if (bArr[0] > 16) {
            return new co.a();
        }
        return (bArr.length <= 1 || (bArr[1] & 128) == 0) ? cwVar : new co.a();
    }
}
