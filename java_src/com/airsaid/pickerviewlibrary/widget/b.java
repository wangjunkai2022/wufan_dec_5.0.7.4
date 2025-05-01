package com.airsaid.pickerviewlibrary.widget;

import android.view.View;
import com.airsaid.pickerviewlibrary.R;
import com.airsaid.pickerviewlibrary.widget.wheelview.WheelView;
import java.util.ArrayList;
/* compiled from: WheelOptions.java */
/* loaded from: classes2.dex */
public class b<T> {

    /* renamed from: a  reason: collision with root package name */
    private View f4439a;

    /* renamed from: b  reason: collision with root package name */
    private WheelView f4440b;

    /* renamed from: c  reason: collision with root package name */
    private WheelView f4441c;

    /* renamed from: d  reason: collision with root package name */
    private WheelView f4442d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<T> f4443e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<ArrayList<T>> f4444f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<ArrayList<ArrayList<T>>> f4445g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4446h = false;

    /* renamed from: i  reason: collision with root package name */
    private f.c f4447i;

    /* renamed from: j  reason: collision with root package name */
    private f.c f4448j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WheelOptions.java */
    /* loaded from: classes2.dex */
    public class a implements f.c {
        a() {
        }

        @Override // f.c
        public void a(int i4) {
            int i5;
            if (b.this.f4444f != null) {
                i5 = b.this.f4441c.getCurrentItem();
                if (i5 >= ((ArrayList) b.this.f4444f.get(i4)).size() - 1) {
                    i5 = ((ArrayList) b.this.f4444f.get(i4)).size() - 1;
                }
                b.this.f4441c.setAdapter(new e.a((ArrayList) b.this.f4444f.get(i4)));
                b.this.f4441c.setCurrentItem(i5);
            } else {
                i5 = 0;
            }
            if (b.this.f4445g != null) {
                b.this.f4448j.a(i5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WheelOptions.java */
    /* renamed from: com.airsaid.pickerviewlibrary.widget.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0155b implements f.c {
        C0155b() {
        }

        @Override // f.c
        public void a(int i4) {
            if (b.this.f4445g != null) {
                int currentItem = b.this.f4440b.getCurrentItem();
                if (currentItem >= b.this.f4445g.size() - 1) {
                    currentItem = b.this.f4445g.size() - 1;
                }
                if (i4 >= ((ArrayList) b.this.f4444f.get(currentItem)).size() - 1) {
                    i4 = ((ArrayList) b.this.f4444f.get(currentItem)).size() - 1;
                }
                int currentItem2 = b.this.f4442d.getCurrentItem();
                if (currentItem2 >= ((ArrayList) ((ArrayList) b.this.f4445g.get(currentItem)).get(i4)).size() - 1) {
                    currentItem2 = ((ArrayList) ((ArrayList) b.this.f4445g.get(currentItem)).get(i4)).size() - 1;
                }
                b.this.f4442d.setAdapter(new e.a((ArrayList) ((ArrayList) b.this.f4445g.get(b.this.f4440b.getCurrentItem())).get(i4)));
                b.this.f4442d.setCurrentItem(currentItem2);
            }
        }
    }

    public b(View view) {
        this.f4439a = view;
        t(view);
    }

    private void i(int i4, int i5, int i6) {
        ArrayList<ArrayList<T>> arrayList = this.f4444f;
        if (arrayList != null) {
            this.f4441c.setAdapter(new e.a(arrayList.get(i4)));
            this.f4441c.setCurrentItem(i5);
        }
        ArrayList<ArrayList<ArrayList<T>>> arrayList2 = this.f4445g;
        if (arrayList2 != null) {
            this.f4442d.setAdapter(new e.a(arrayList2.get(i4).get(i5)));
            this.f4442d.setCurrentItem(i6);
        }
    }

    public int[] g() {
        return new int[]{this.f4440b.getCurrentItem(), this.f4441c.getCurrentItem(), this.f4442d.getCurrentItem()};
    }

    public View h() {
        return this.f4439a;
    }

    public void j(int i4, int i5, int i6) {
        if (this.f4446h) {
            i(i4, i5, i6);
        }
        this.f4440b.setCurrentItem(i4);
        this.f4441c.setCurrentItem(i5);
        this.f4442d.setCurrentItem(i6);
    }

    public void k(boolean z4) {
        this.f4440b.setCyclic(z4);
        this.f4441c.setCyclic(z4);
        this.f4442d.setCyclic(z4);
    }

    public void l(boolean z4, boolean z5, boolean z6) {
        this.f4440b.setCyclic(z4);
        this.f4441c.setCyclic(z5);
        this.f4442d.setCyclic(z6);
    }

    public void m(String str, String str2, String str3) {
        if (str != null) {
            this.f4440b.setLabel(str);
        }
        if (str2 != null) {
            this.f4441c.setLabel(str2);
        }
        if (str3 != null) {
            this.f4442d.setLabel(str3);
        }
    }

    public void n(boolean z4) {
        this.f4441c.setCyclic(z4);
    }

    public void o(boolean z4) {
        this.f4442d.setCyclic(z4);
    }

    public void p(ArrayList<T> arrayList) {
        q(arrayList, null, null, false);
    }

    public void q(ArrayList<T> arrayList, ArrayList<ArrayList<T>> arrayList2, ArrayList<ArrayList<ArrayList<T>>> arrayList3, boolean z4) {
        this.f4446h = z4;
        this.f4443e = arrayList;
        this.f4444f = arrayList2;
        this.f4445g = arrayList3;
        int i4 = arrayList3 == null ? 8 : 4;
        if (arrayList2 == null) {
            i4 = 12;
        }
        WheelView wheelView = (WheelView) this.f4439a.findViewById(R.id.options1);
        this.f4440b = wheelView;
        wheelView.setAdapter(new e.a(this.f4443e, i4));
        this.f4440b.setCurrentItem(0);
        WheelView wheelView2 = (WheelView) this.f4439a.findViewById(R.id.options2);
        this.f4441c = wheelView2;
        ArrayList<ArrayList<T>> arrayList4 = this.f4444f;
        if (arrayList4 != null) {
            wheelView2.setAdapter(new e.a(arrayList4.get(0)));
        }
        this.f4441c.setCurrentItem(this.f4440b.getCurrentItem());
        WheelView wheelView3 = (WheelView) this.f4439a.findViewById(R.id.options3);
        this.f4442d = wheelView3;
        ArrayList<ArrayList<ArrayList<T>>> arrayList5 = this.f4445g;
        if (arrayList5 != null) {
            wheelView3.setAdapter(new e.a(arrayList5.get(0).get(0)));
        }
        WheelView wheelView4 = this.f4442d;
        wheelView4.setCurrentItem(wheelView4.getCurrentItem());
        if (this.f4444f == null) {
            this.f4441c.setVisibility(8);
        }
        if (this.f4445g == null) {
            this.f4442d.setVisibility(8);
        }
        this.f4447i = new a();
        this.f4448j = new C0155b();
        if (arrayList2 != null && z4) {
            this.f4440b.setOnItemSelectedListener(this.f4447i);
        }
        if (arrayList3 == null || !z4) {
            return;
        }
        this.f4441c.setOnItemSelectedListener(this.f4448j);
    }

    public void r(ArrayList<T> arrayList, ArrayList<ArrayList<T>> arrayList2, boolean z4) {
        q(arrayList, arrayList2, null, z4);
    }

    public void s(float f5) {
        WheelView wheelView = this.f4440b;
        if (wheelView != null) {
            wheelView.setTextSize(f5);
        }
        WheelView wheelView2 = this.f4441c;
        if (wheelView2 != null) {
            wheelView2.setTextSize(f5);
        }
        WheelView wheelView3 = this.f4442d;
        if (wheelView3 != null) {
            wheelView3.setTextSize(f5);
        }
    }

    public void t(View view) {
        this.f4439a = view;
    }
}
