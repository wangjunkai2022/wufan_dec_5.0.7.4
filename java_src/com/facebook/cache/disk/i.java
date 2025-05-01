package com.facebook.cache.disk;

import com.facebook.cache.disk.c;
import com.facebook.common.internal.VisibleForTesting;
/* compiled from: ScoreBasedEvictionComparatorSupplier.java */
/* loaded from: classes2.dex */
public class i implements g {

    /* renamed from: a  reason: collision with root package name */
    private final float f10807a;

    /* renamed from: b  reason: collision with root package name */
    private final float f10808b;

    /* compiled from: ScoreBasedEvictionComparatorSupplier.java */
    /* loaded from: classes2.dex */
    class a implements f {

        /* renamed from: b  reason: collision with root package name */
        long f10809b = System.currentTimeMillis();

        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(c.InterfaceC0251c interfaceC0251c, c.InterfaceC0251c interfaceC0251c2) {
            float a5 = i.this.a(interfaceC0251c, this.f10809b);
            float a6 = i.this.a(interfaceC0251c2, this.f10809b);
            if (a5 < a6) {
                return 1;
            }
            return a6 == a5 ? 0 : -1;
        }
    }

    public i(float f5, float f6) {
        this.f10807a = f5;
        this.f10808b = f6;
    }

    @VisibleForTesting
    float a(c.InterfaceC0251c interfaceC0251c, long j4) {
        return (this.f10807a * ((float) (j4 - interfaceC0251c.getTimestamp()))) + (this.f10808b * ((float) interfaceC0251c.getSize()));
    }

    @Override // com.facebook.cache.disk.g
    public f get() {
        return new a();
    }
}
