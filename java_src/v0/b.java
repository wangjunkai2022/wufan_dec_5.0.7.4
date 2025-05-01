package v0;

import com.facebook.imagepipeline.request.ImageRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
/* compiled from: ForwardingRequestListener.java */
/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: b  reason: collision with root package name */
    private static final String f73382b = "ForwardingRequestListener";

    /* renamed from: a  reason: collision with root package name */
    private final List<c> f73383a;

    public b(Set<c> set) {
        this.f73383a = new ArrayList(set.size());
        for (c cVar : set) {
            if (cVar != null) {
                this.f73383a.add(cVar);
            }
        }
    }

    private void m(String str, Throwable th) {
        com.facebook.common.logging.a.v(f73382b, str, th);
    }

    @Override // v0.c
    public void a(ImageRequest imageRequest, Object obj, String str, boolean z4) {
        int size = this.f73383a.size();
        for (int i4 = 0; i4 < size; i4++) {
            try {
                this.f73383a.get(i4).a(imageRequest, obj, str, z4);
            } catch (Exception e5) {
                m("InternalListener exception in onRequestStart", e5);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public void b(String str, String str2) {
        int size = this.f73383a.size();
        for (int i4 = 0; i4 < size; i4++) {
            try {
                this.f73383a.get(i4).b(str, str2);
            } catch (Exception e5) {
                m("InternalListener exception in onProducerStart", e5);
            }
        }
    }

    @Override // v0.c
    public void c(ImageRequest imageRequest, String str, boolean z4) {
        int size = this.f73383a.size();
        for (int i4 = 0; i4 < size; i4++) {
            try {
                this.f73383a.get(i4).c(imageRequest, str, z4);
            } catch (Exception e5) {
                m("InternalListener exception in onRequestSuccess", e5);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public boolean d(String str) {
        int size = this.f73383a.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (this.f73383a.get(i4).d(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public void e(String str, String str2, @Nullable Map<String, String> map) {
        int size = this.f73383a.size();
        for (int i4 = 0; i4 < size; i4++) {
            try {
                this.f73383a.get(i4).e(str, str2, map);
            } catch (Exception e5) {
                m("InternalListener exception in onProducerFinishWithSuccess", e5);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public void f(String str, String str2, Throwable th, @Nullable Map<String, String> map) {
        int size = this.f73383a.size();
        for (int i4 = 0; i4 < size; i4++) {
            try {
                this.f73383a.get(i4).f(str, str2, th, map);
            } catch (Exception e5) {
                m("InternalListener exception in onProducerFinishWithFailure", e5);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public void g(String str, String str2, @Nullable Map<String, String> map) {
        int size = this.f73383a.size();
        for (int i4 = 0; i4 < size; i4++) {
            try {
                this.f73383a.get(i4).g(str, str2, map);
            } catch (Exception e5) {
                m("InternalListener exception in onProducerFinishWithCancellation", e5);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public void h(String str, String str2, boolean z4) {
        int size = this.f73383a.size();
        for (int i4 = 0; i4 < size; i4++) {
            try {
                this.f73383a.get(i4).h(str, str2, z4);
            } catch (Exception e5) {
                m("InternalListener exception in onProducerFinishWithSuccess", e5);
            }
        }
    }

    @Override // v0.c
    public void i(ImageRequest imageRequest, String str, Throwable th, boolean z4) {
        int size = this.f73383a.size();
        for (int i4 = 0; i4 < size; i4++) {
            try {
                this.f73383a.get(i4).i(imageRequest, str, th, z4);
            } catch (Exception e5) {
                m("InternalListener exception in onRequestFailure", e5);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public void j(String str, String str2, String str3) {
        int size = this.f73383a.size();
        for (int i4 = 0; i4 < size; i4++) {
            try {
                this.f73383a.get(i4).j(str, str2, str3);
            } catch (Exception e5) {
                m("InternalListener exception in onIntermediateChunkStart", e5);
            }
        }
    }

    @Override // v0.c
    public void k(String str) {
        int size = this.f73383a.size();
        for (int i4 = 0; i4 < size; i4++) {
            try {
                this.f73383a.get(i4).k(str);
            } catch (Exception e5) {
                m("InternalListener exception in onRequestCancellation", e5);
            }
        }
    }

    public void l(c cVar) {
        this.f73383a.add(cVar);
    }

    public b(c... cVarArr) {
        this.f73383a = new ArrayList(cVarArr.length);
        for (c cVar : cVarArr) {
            if (cVar != null) {
                this.f73383a.add(cVar);
            }
        }
    }
}
