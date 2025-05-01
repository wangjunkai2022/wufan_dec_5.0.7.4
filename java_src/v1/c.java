package v1;

import com.join.mgps.business.CollectionBeanSubBusiness;
import java.util.List;
/* compiled from: MustPlayNetDataBeanBusiness.java */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private boolean f73394a;

    /* renamed from: b  reason: collision with root package name */
    private String f73395b;

    /* renamed from: c  reason: collision with root package name */
    private List<CollectionBeanSubBusiness> f73396c;

    public c(boolean z4, String str) {
        this.f73394a = z4;
        this.f73395b = str;
    }

    public List<CollectionBeanSubBusiness> a() {
        return this.f73396c;
    }

    public String b() {
        return this.f73395b;
    }

    public boolean c() {
        return this.f73394a;
    }

    public void d(List<CollectionBeanSubBusiness> list) {
        this.f73396c = list;
    }

    public void e(boolean z4) {
        this.f73394a = z4;
    }

    public void f(String str) {
        this.f73395b = str;
    }

    public c(boolean z4, List<CollectionBeanSubBusiness> list) {
        this.f73394a = z4;
        this.f73396c = list;
    }
}
