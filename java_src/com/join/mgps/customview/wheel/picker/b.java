package com.join.mgps.customview.wheel.picker;

import android.app.Activity;
import com.join.mgps.customview.wheel.picker.DateTimePicker;
/* compiled from: TimePicker.java */
/* loaded from: classes4.dex */
public class b extends DateTimePicker {

    /* compiled from: TimePicker.java */
    /* loaded from: classes4.dex */
    class a implements DateTimePicker.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f48907a;

        a(d dVar) {
            this.f48907a = dVar;
        }

        @Override // com.join.mgps.customview.wheel.picker.DateTimePicker.l
        public void a(int i4, String str) {
            this.f48907a.a(i4, str);
        }

        @Override // com.join.mgps.customview.wheel.picker.DateTimePicker.l
        public void b(int i4, String str) {
        }

        @Override // com.join.mgps.customview.wheel.picker.DateTimePicker.l
        public void c(int i4, String str) {
            this.f48907a.c(i4, str);
        }

        @Override // com.join.mgps.customview.wheel.picker.DateTimePicker.l
        public void d(int i4, String str) {
        }

        @Override // com.join.mgps.customview.wheel.picker.DateTimePicker.l
        public void e(int i4, String str) {
        }

        @Override // com.join.mgps.customview.wheel.picker.DateTimePicker.l
        public void f(int i4, String str) {
        }
    }

    /* compiled from: TimePicker.java */
    /* renamed from: com.join.mgps.customview.wheel.picker.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0363b implements DateTimePicker.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f48909a;

        C0363b(c cVar) {
            this.f48909a = cVar;
        }

        @Override // com.join.mgps.customview.wheel.picker.DateTimePicker.k
        public void d(String str, String str2, String str3) {
            this.f48909a.a(str, str2, str3);
        }
    }

    /* compiled from: TimePicker.java */
    /* loaded from: classes4.dex */
    public interface c {
        void a(String str, String str2, String str3);
    }

    /* compiled from: TimePicker.java */
    /* loaded from: classes4.dex */
    public interface d {
        void a(int i4, String str);

        void c(int i4, String str);
    }

    public b(Activity activity) {
        this(activity, 3);
    }

    @Override // com.join.mgps.customview.wheel.picker.DateTimePicker
    @Deprecated
    public final void C1(int i4, int i5, int i6, int i7) {
        super.C1(i4, i5, i6, i7);
    }

    @Override // com.join.mgps.customview.wheel.picker.DateTimePicker
    @Deprecated
    public final void D1(int i4, int i5, int i6, int i7, int i8) {
        super.D1(i4, i5, i6, i7, i8);
    }

    @Override // com.join.mgps.customview.wheel.picker.DateTimePicker
    @Deprecated
    public void E1(int i4, int i5, int i6) {
        super.E1(i4, i5, i6);
    }

    @Override // com.join.mgps.customview.wheel.picker.DateTimePicker
    @Deprecated
    public void F1(int i4, int i5, int i6) {
        super.F1(i4, i5, i6);
    }

    public void G1(String str, String str2, String str3) {
        super.x1("", "", "", str, str2, str3);
    }

    public void H1(c cVar) {
        if (cVar == null) {
            return;
        }
        super.y1(new C0363b(cVar));
    }

    public void I1(d dVar) {
        if (dVar == null) {
            return;
        }
        super.z1(new a(dVar));
    }

    @Deprecated
    public void J1(int i4, int i5, int i6) {
        super.F1(i4, 0, 0);
        super.E1(i5, 59, i6);
    }

    public void K1(int i4, int i5, int i6) {
        super.E1(i4, i5, i6);
    }

    public void L1(int i4, int i5, int i6) {
        super.F1(i4, i5, i6);
    }

    public void M1(int i4, int i5) {
        super.C1(0, 0, i4, i5);
    }

    @Override // com.join.mgps.customview.wheel.picker.DateTimePicker
    @Deprecated
    public final void t1(int i4, int i5) {
        throw new UnsupportedOperationException("Data range nonsupport");
    }

    @Override // com.join.mgps.customview.wheel.picker.DateTimePicker
    @Deprecated
    public final void u1(int i4, int i5, int i6) {
        throw new UnsupportedOperationException("Date range nonsupport");
    }

    @Override // com.join.mgps.customview.wheel.picker.DateTimePicker
    @Deprecated
    public final void v1(int i4, int i5) {
        throw new UnsupportedOperationException("Date range nonsupport");
    }

    @Override // com.join.mgps.customview.wheel.picker.DateTimePicker
    @Deprecated
    public final void w1(int i4, int i5, int i6) {
        throw new UnsupportedOperationException("Date range nonsupport");
    }

    @Override // com.join.mgps.customview.wheel.picker.DateTimePicker
    @Deprecated
    public final void x1(String str, String str2, String str3, String str4, String str5, String str6) {
        super.x1(str, str2, str3, str4, str5, str6);
    }

    @Override // com.join.mgps.customview.wheel.picker.DateTimePicker
    @Deprecated
    public final void y1(DateTimePicker.h hVar) {
        super.y1(hVar);
    }

    @Override // com.join.mgps.customview.wheel.picker.DateTimePicker
    @Deprecated
    public final void z1(DateTimePicker.l lVar) {
        super.z1(lVar);
    }

    public b(Activity activity, int i4) {
        super(activity, -1, i4);
    }
}
