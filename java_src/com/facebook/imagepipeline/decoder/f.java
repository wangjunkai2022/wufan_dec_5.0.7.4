package com.facebook.imagepipeline.decoder;

import com.facebook.imagepipeline.image.g;
import com.facebook.imagepipeline.image.h;
import java.util.Collections;
import java.util.List;
/* compiled from: SimpleProgressiveJpegConfig.java */
/* loaded from: classes2.dex */
public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    private final c f11909a;

    /* compiled from: SimpleProgressiveJpegConfig.java */
    /* loaded from: classes2.dex */
    private static class b implements c {
        private b() {
        }

        @Override // com.facebook.imagepipeline.decoder.f.c
        public List<Integer> a() {
            return Collections.EMPTY_LIST;
        }

        @Override // com.facebook.imagepipeline.decoder.f.c
        public int b() {
            return 0;
        }
    }

    /* compiled from: SimpleProgressiveJpegConfig.java */
    /* loaded from: classes2.dex */
    public interface c {
        List<Integer> a();

        int b();
    }

    public f() {
        this(new b());
    }

    @Override // com.facebook.imagepipeline.decoder.d
    public int a(int i4) {
        List<Integer> a5 = this.f11909a.a();
        if (a5 == null || a5.isEmpty()) {
            return i4 + 1;
        }
        for (int i5 = 0; i5 < a5.size(); i5++) {
            if (a5.get(i5).intValue() > i4) {
                return a5.get(i5).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.facebook.imagepipeline.decoder.d
    public h b(int i4) {
        return g.d(i4, i4 >= this.f11909a.b(), false);
    }

    public f(c cVar) {
        this.f11909a = (c) com.facebook.common.internal.h.i(cVar);
    }
}
