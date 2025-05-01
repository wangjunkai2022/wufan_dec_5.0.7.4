package com.airbnb.lottie;

import androidx.collection.ArraySet;
import androidx.core.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PerformanceTracker.java */
/* loaded from: classes2.dex */
public class x0 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f4373a = false;

    /* renamed from: b  reason: collision with root package name */
    private final Set<b> f4374b = new ArraySet();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, com.airbnb.lottie.utils.f> f4375c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Comparator<Pair<String, Float>> f4376d = new a();

    /* compiled from: PerformanceTracker.java */
    /* loaded from: classes2.dex */
    class a implements Comparator<Pair<String, Float>> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float floatValue = pair.second.floatValue();
            float floatValue2 = pair2.second.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    }

    /* compiled from: PerformanceTracker.java */
    /* loaded from: classes2.dex */
    public interface b {
        void a(float f5);
    }

    public void a(b bVar) {
        this.f4374b.add(bVar);
    }

    public void b() {
        this.f4375c.clear();
    }

    public List<Pair<String, Float>> c() {
        if (!this.f4373a) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.f4375c.size());
        for (Map.Entry<String, com.airbnb.lottie.utils.f> entry : this.f4375c.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), Float.valueOf(entry.getValue().b())));
        }
        Collections.sort(arrayList, this.f4376d);
        return arrayList;
    }

    public void d() {
        if (this.f4373a) {
            List<Pair<String, Float>> c5 = c();
            for (int i4 = 0; i4 < c5.size(); i4++) {
                Pair<String, Float> pair = c5.get(i4);
                String.format("\t\t%30s:%.2f", pair.first, pair.second);
            }
        }
    }

    public void e(String str, float f5) {
        if (this.f4373a) {
            com.airbnb.lottie.utils.f fVar = this.f4375c.get(str);
            if (fVar == null) {
                fVar = new com.airbnb.lottie.utils.f();
                this.f4375c.put(str, fVar);
            }
            fVar.a(f5);
            if (str.equals("__container")) {
                for (b bVar : this.f4374b) {
                    bVar.a(f5);
                }
            }
        }
    }

    public void f(b bVar) {
        this.f4374b.remove(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(boolean z4) {
        this.f4373a = z4;
    }
}
