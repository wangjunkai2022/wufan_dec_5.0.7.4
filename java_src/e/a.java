package e;

import java.util.ArrayList;
/* compiled from: ArrayWheelAdapter.java */
/* loaded from: classes2.dex */
public class a<T> implements c {

    /* renamed from: c  reason: collision with root package name */
    public static final int f68822c = 4;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<T> f68823a;

    /* renamed from: b  reason: collision with root package name */
    private int f68824b;

    public a(ArrayList<T> arrayList, int i4) {
        this.f68823a = arrayList;
        this.f68824b = i4;
    }

    @Override // e.c
    public int a() {
        return this.f68823a.size();
    }

    @Override // e.c
    public Object getItem(int i4) {
        return (i4 < 0 || i4 >= this.f68823a.size()) ? "" : this.f68823a.get(i4);
    }

    @Override // e.c
    public int indexOf(Object obj) {
        return this.f68823a.indexOf(obj);
    }

    public a(ArrayList<T> arrayList) {
        this(arrayList, 4);
    }
}
