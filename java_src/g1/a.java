package g1;
/* compiled from: BTree.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private a f69111a;

    /* renamed from: b  reason: collision with root package name */
    private a f69112b;

    /* renamed from: c  reason: collision with root package name */
    private Object f69113c;

    public void a(String str, Object obj) {
        a aVar;
        if (str.length() == 0) {
            this.f69113c = obj;
            return;
        }
        if (str.charAt(0) == '0') {
            if (this.f69111a == null) {
                this.f69111a = new a();
            }
            aVar = this.f69111a;
        } else {
            if (this.f69112b == null) {
                this.f69112b = new a();
            }
            aVar = this.f69112b;
        }
        aVar.a(str.substring(1), obj);
    }

    public a b(int i4) {
        if (i4 == 0) {
            return this.f69111a;
        }
        return this.f69112b;
    }

    public Object c() {
        return this.f69113c;
    }
}
