package c3;
/* compiled from: ChannelInfo.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private int f355a;

    /* renamed from: b  reason: collision with root package name */
    private String f356b;

    public String a() {
        return this.f356b;
    }

    public void b(String str) {
        this.f356b = str;
    }

    public void c(int i4) {
        this.f355a = i4;
    }

    public String d() {
        return "{\n    \"type\":" + this.f355a + ",    \"appId\":\"" + this.f356b + "\"}";
    }

    public int getType() {
        return this.f355a;
    }

    public String toString() {
        return "ChannelInfo{type=" + this.f355a + ", appId='" + this.f356b + "'}";
    }
}
