package g1;
/* compiled from: CharCache.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private char[] f69114a;

    /* renamed from: b  reason: collision with root package name */
    private int f69115b;

    public b(int i4) {
        this.f69114a = new char[i4];
    }

    public void a(char c5) {
        int i4 = this.f69115b;
        char[] cArr = this.f69114a;
        if (i4 < cArr.length - 1) {
            cArr[i4] = c5;
            this.f69115b = i4 + 1;
        }
    }

    public void b(String str) {
        char[] charArray = str.toCharArray();
        char[] cArr = this.f69114a;
        int length = cArr.length;
        int i4 = this.f69115b;
        int i5 = length - i4;
        if (charArray.length < i5) {
            i5 = charArray.length;
        }
        System.arraycopy(charArray, 0, cArr, i4, i5);
        this.f69115b += i5;
    }

    public void c() {
        this.f69115b = 0;
    }

    public int d() {
        return this.f69115b;
    }

    public String toString() {
        return new String(this.f69114a, 0, this.f69115b);
    }
}
