package com.facebook.cache.disk;

import com.facebook.cache.disk.c;
/* compiled from: DefaultEntryEvictionComparatorSupplier.java */
/* loaded from: classes2.dex */
public class a implements g {

    /* compiled from: DefaultEntryEvictionComparatorSupplier.java */
    /* renamed from: com.facebook.cache.disk.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0249a implements f {
        C0249a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(c.InterfaceC0251c interfaceC0251c, c.InterfaceC0251c interfaceC0251c2) {
            long timestamp = interfaceC0251c.getTimestamp();
            long timestamp2 = interfaceC0251c2.getTimestamp();
            if (timestamp < timestamp2) {
                return -1;
            }
            return timestamp2 == timestamp ? 0 : 1;
        }
    }

    @Override // com.facebook.cache.disk.g
    public f get() {
        return new C0249a();
    }
}
