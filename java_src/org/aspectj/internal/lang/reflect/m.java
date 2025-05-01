package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.PerClauseKind;
import org.aspectj.lang.reflect.w;
import org.aspectj.lang.reflect.x;
/* compiled from: PointcutBasedPerClauseImpl.java */
/* loaded from: classes7.dex */
public class m extends l implements w {

    /* renamed from: b  reason: collision with root package name */
    private final x f72170b;

    /* compiled from: PointcutBasedPerClauseImpl.java */
    /* loaded from: classes7.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f72171a;

        static {
            int[] iArr = new int[PerClauseKind.values().length];
            f72171a = iArr;
            try {
                iArr[PerClauseKind.PERCFLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72171a[PerClauseKind.PERCFLOWBELOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72171a[PerClauseKind.PERTARGET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72171a[PerClauseKind.PERTHIS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public m(PerClauseKind perClauseKind, String str) {
        super(perClauseKind);
        this.f72170b = new n(str);
    }

    @Override // org.aspectj.lang.reflect.w
    public x b() {
        return this.f72170b;
    }

    @Override // org.aspectj.internal.lang.reflect.l
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        int i4 = a.f72171a[getKind().ordinal()];
        if (i4 == 1) {
            stringBuffer.append("percflow(");
        } else if (i4 == 2) {
            stringBuffer.append("percflowbelow(");
        } else if (i4 == 3) {
            stringBuffer.append("pertarget(");
        } else if (i4 == 4) {
            stringBuffer.append("perthis(");
        }
        stringBuffer.append(this.f72170b.a());
        stringBuffer.append(")");
        return stringBuffer.toString();
    }
}
