package com.kuaishou.weapon.p0;

import android.os.Build;
/* loaded from: classes5.dex */
public class cq {

    /* renamed from: a  reason: collision with root package name */
    static cq f55455a;

    /* renamed from: b  reason: collision with root package name */
    static cq f55456b;

    /* renamed from: c  reason: collision with root package name */
    static cq f55457c;

    /* renamed from: d  reason: collision with root package name */
    private long f55458d;

    /* renamed from: e  reason: collision with root package name */
    private a f55459e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public enum a {
        DWORD(4),
        QWORD(8);
        

        /* renamed from: c  reason: collision with root package name */
        int f55463c;

        a(int i4) {
            this.f55463c = i4;
        }
    }

    static {
        c();
    }

    private static void c() {
        f55455a = new cq();
        f55456b = new cq();
        f55457c = new cq();
        cq cqVar = f55456b;
        a aVar = a.DWORD;
        cqVar.a(aVar);
        int i4 = Build.VERSION.SDK_INT;
        if (cr.a()) {
            cq cqVar2 = f55455a;
            a aVar2 = a.QWORD;
            cqVar2.a(aVar2);
            f55457c.a(aVar2);
            switch (i4) {
                case 19:
                    f55455a.a(32L);
                    f55456b.a(28L);
                    return;
                case 20:
                default:
                    throw new RuntimeException("API LEVEL: " + i4 + " is not supported now : (");
                case 21:
                    f55455a.a(40L);
                    f55455a.a(aVar2);
                    f55457c.a(32L);
                    f55457c.a(aVar2);
                    f55456b.a(56L);
                    return;
                case 22:
                    f55455a.a(52L);
                    f55457c.a(44L);
                    f55456b.a(20L);
                    return;
                case 23:
                    f55455a.a(48L);
                    f55457c.a(40L);
                    f55456b.a(12L);
                    return;
                case 24:
                case 25:
                    f55455a.a(48L);
                    f55457c.a(40L);
                    f55456b.a(4L);
                    return;
                case 26:
                case 27:
                    f55455a.a(40L);
                    f55457c.a(32L);
                    f55456b.a(4L);
                    return;
                case 28:
                case 29:
                    f55455a.a(32L);
                    f55457c.a(24L);
                    f55456b.a(4L);
                    return;
            }
        }
        f55455a.a(aVar);
        f55457c.a(aVar);
        switch (i4) {
            case 19:
                f55455a.a(32L);
                f55456b.a(28L);
                return;
            case 20:
            default:
                throw new RuntimeException("API LEVEL: " + i4 + " is not supported now : (");
            case 21:
                f55455a.a(40L);
                cq cqVar3 = f55455a;
                a aVar3 = a.QWORD;
                cqVar3.a(aVar3);
                f55457c.a(32L);
                f55457c.a(aVar3);
                f55456b.a(56L);
                return;
            case 22:
                f55455a.a(44L);
                f55457c.a(40L);
                f55456b.a(20L);
                return;
            case 23:
                f55455a.a(36L);
                f55457c.a(32L);
                f55456b.a(12L);
                return;
            case 24:
            case 25:
                f55455a.a(32L);
                f55457c.a(28L);
                f55456b.a(4L);
                return;
            case 26:
            case 27:
                f55455a.a(28L);
                f55457c.a(24L);
                f55456b.a(4L);
                return;
            case 28:
            case 29:
                f55455a.a(24L);
                f55457c.a(20L);
                f55456b.a(4L);
                return;
        }
    }

    public long a() {
        return this.f55458d;
    }

    public a b() {
        return this.f55459e;
    }

    public void a(long j4) {
        this.f55458d = j4;
    }

    public void a(a aVar) {
        this.f55459e = aVar;
    }
}
