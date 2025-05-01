package e;
/* compiled from: NumericWheelAdapter.java */
/* loaded from: classes2.dex */
public class b implements c {

    /* renamed from: c  reason: collision with root package name */
    public static final int f68825c = 9;

    /* renamed from: d  reason: collision with root package name */
    private static final int f68826d = 0;

    /* renamed from: a  reason: collision with root package name */
    private int f68827a;

    /* renamed from: b  reason: collision with root package name */
    private int f68828b;

    public b() {
        this(0, 9);
    }

    @Override // e.c
    public int a() {
        return (this.f68828b - this.f68827a) + 1;
    }

    @Override // e.c
    public Object getItem(int i4) {
        if (i4 >= 0 && i4 < a()) {
            return Integer.valueOf(this.f68827a + i4);
        }
        return 0;
    }

    @Override // e.c
    public int indexOf(Object obj) {
        return ((Integer) obj).intValue() - this.f68827a;
    }

    public b(int i4, int i5) {
        this.f68827a = i4;
        this.f68828b = i5;
    }
}
