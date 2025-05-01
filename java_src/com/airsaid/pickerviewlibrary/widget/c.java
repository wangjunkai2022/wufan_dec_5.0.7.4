package com.airsaid.pickerviewlibrary.widget;

import android.content.Context;
import android.view.View;
import com.airsaid.pickerviewlibrary.R;
import com.airsaid.pickerviewlibrary.TimePickerView;
import com.airsaid.pickerviewlibrary.widget.wheelview.WheelView;
import com.facebook.common.statfs.StatFsHelper;
import com.join.mgps.Util.v;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
/* compiled from: WheelTime.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: k  reason: collision with root package name */
    public static DateFormat f4451k = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    /* renamed from: l  reason: collision with root package name */
    public static final int f4452l = 1990;

    /* renamed from: m  reason: collision with root package name */
    public static final int f4453m = 2100;

    /* renamed from: a  reason: collision with root package name */
    private View f4454a;

    /* renamed from: b  reason: collision with root package name */
    private WheelView f4455b;

    /* renamed from: c  reason: collision with root package name */
    private WheelView f4456c;

    /* renamed from: d  reason: collision with root package name */
    private WheelView f4457d;

    /* renamed from: e  reason: collision with root package name */
    private WheelView f4458e;

    /* renamed from: f  reason: collision with root package name */
    private WheelView f4459f;

    /* renamed from: g  reason: collision with root package name */
    private TimePickerView.Type f4460g;

    /* renamed from: h  reason: collision with root package name */
    private int f4461h;

    /* renamed from: i  reason: collision with root package name */
    private int f4462i;

    /* renamed from: j  reason: collision with root package name */
    private float f4463j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WheelTime.java */
    /* loaded from: classes2.dex */
    public class a implements f.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f4464a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f4465b;

        a(List list, List list2) {
            this.f4464a = list;
            this.f4465b = list2;
        }

        @Override // f.c
        public void a(int i4) {
            int i5 = i4 + c.this.f4461h;
            int i6 = 28;
            if (this.f4464a.contains(String.valueOf(c.this.f4456c.getCurrentItem() + 1))) {
                c.this.f4457d.setAdapter(new e.b(1, 31));
                i6 = 31;
            } else if (this.f4465b.contains(String.valueOf(c.this.f4456c.getCurrentItem() + 1))) {
                c.this.f4457d.setAdapter(new e.b(1, 30));
                i6 = 30;
            } else if ((i5 % 4 != 0 || i5 % 100 == 0) && i5 % StatFsHelper.f10899h != 0) {
                c.this.f4457d.setAdapter(new e.b(1, 28));
            } else {
                c.this.f4457d.setAdapter(new e.b(1, 29));
                i6 = 29;
            }
            int i7 = i6 - 1;
            if (c.this.f4457d.getCurrentItem() > i7) {
                c.this.f4457d.setCurrentItem(i7);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WheelTime.java */
    /* loaded from: classes2.dex */
    public class b implements f.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f4467a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f4468b;

        b(List list, List list2) {
            this.f4467a = list;
            this.f4468b = list2;
        }

        @Override // f.c
        public void a(int i4) {
            int i5 = i4 + 1;
            int i6 = 28;
            if (this.f4467a.contains(String.valueOf(i5))) {
                c.this.f4457d.setAdapter(new e.b(1, 31));
                i6 = 31;
            } else if (this.f4468b.contains(String.valueOf(i5))) {
                c.this.f4457d.setAdapter(new e.b(1, 30));
                i6 = 30;
            } else if (((c.this.f4455b.getCurrentItem() + c.this.f4461h) % 4 != 0 || (c.this.f4455b.getCurrentItem() + c.this.f4461h) % 100 == 0) && (c.this.f4455b.getCurrentItem() + c.this.f4461h) % StatFsHelper.f10899h != 0) {
                c.this.f4457d.setAdapter(new e.b(1, 28));
            } else {
                c.this.f4457d.setAdapter(new e.b(1, 29));
                i6 = 29;
            }
            int i7 = i6 - 1;
            if (c.this.f4457d.getCurrentItem() > i7) {
                c.this.f4457d.setCurrentItem(i7);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WheelTime.java */
    /* renamed from: com.airsaid.pickerviewlibrary.widget.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C0156c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f4470a;

        static {
            int[] iArr = new int[TimePickerView.Type.values().length];
            f4470a = iArr;
            try {
                iArr[TimePickerView.Type.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4470a[TimePickerView.Type.YEAR_MONTH_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4470a[TimePickerView.Type.HOURS_MINS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4470a[TimePickerView.Type.MONTH_DAY_HOUR_MIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4470a[TimePickerView.Type.YEAR_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public c(View view) {
        this.f4461h = f4452l;
        this.f4462i = 2100;
        this.f4463j = 5.0f;
        this.f4454a = view;
        this.f4460g = TimePickerView.Type.ALL;
        p(view);
    }

    private void n() {
        StringBuilder sb = new StringBuilder();
        sb.append("mTextSize: ");
        sb.append(this.f4463j);
        float f5 = this.f4463j;
        int i4 = C0156c.f4470a[this.f4460g.ordinal()];
        if (i4 == 1) {
            f5 *= 3.0f;
        } else if (i4 == 2) {
            f5 *= 4.0f;
            this.f4458e.setVisibility(8);
            this.f4459f.setVisibility(8);
        } else if (i4 == 3) {
            f5 *= 4.0f;
            this.f4455b.setVisibility(8);
            this.f4456c.setVisibility(8);
            this.f4457d.setVisibility(8);
        } else if (i4 == 4) {
            f5 *= 3.0f;
            this.f4455b.setVisibility(8);
        } else if (i4 == 5) {
            f5 *= 4.0f;
            this.f4457d.setVisibility(8);
            this.f4458e.setVisibility(8);
            this.f4459f.setVisibility(8);
        }
        this.f4457d.setTextSize(f5);
        this.f4456c.setTextSize(f5);
        this.f4455b.setTextSize(f5);
        this.f4458e.setTextSize(f5);
        this.f4459f.setTextSize(f5);
    }

    public int e() {
        return this.f4462i;
    }

    public int f() {
        return this.f4461h;
    }

    public String g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f4455b.getCurrentItem() + this.f4461h);
        stringBuffer.append("-");
        stringBuffer.append(this.f4456c.getCurrentItem() + 1);
        stringBuffer.append("-");
        stringBuffer.append(this.f4457d.getCurrentItem() + 1);
        stringBuffer.append(" ");
        stringBuffer.append(this.f4458e.getCurrentItem());
        stringBuffer.append(":");
        stringBuffer.append(this.f4459f.getCurrentItem());
        return stringBuffer.toString();
    }

    public View h() {
        return this.f4454a;
    }

    public void i(boolean z4) {
        this.f4455b.setCyclic(z4);
        this.f4456c.setCyclic(z4);
        this.f4457d.setCyclic(z4);
        this.f4458e.setCyclic(z4);
        this.f4459f.setCyclic(z4);
    }

    public void j(int i4) {
        this.f4462i = i4;
    }

    public void k(int i4, int i5, int i6) {
        l(i4, i5, i6, 0, 0);
    }

    public void l(int i4, int i5, int i6, int i7, int i8) {
        List asList = Arrays.asList("1", "3", "5", "7", "8", v.f28122v, "12");
        List asList2 = Arrays.asList("4", "6", "9", "11");
        Context context = this.f4454a.getContext();
        WheelView wheelView = (WheelView) this.f4454a.findViewById(R.id.year);
        this.f4455b = wheelView;
        wheelView.setAdapter(new e.b(this.f4461h, this.f4462i));
        this.f4455b.setLabel(context.getString(R.string.pickerview_year));
        this.f4455b.setCurrentItem(i4 - this.f4461h);
        WheelView wheelView2 = (WheelView) this.f4454a.findViewById(R.id.month);
        this.f4456c = wheelView2;
        wheelView2.setAdapter(new e.b(1, 12));
        this.f4456c.setLabel(context.getString(R.string.pickerview_month));
        this.f4456c.setCurrentItem(i5);
        this.f4457d = (WheelView) this.f4454a.findViewById(R.id.day);
        int i9 = i5 + 1;
        if (asList.contains(String.valueOf(i9))) {
            this.f4457d.setAdapter(new e.b(1, 31));
        } else if (asList2.contains(String.valueOf(i9))) {
            this.f4457d.setAdapter(new e.b(1, 30));
        } else if ((i4 % 4 == 0 && i4 % 100 != 0) || i4 % StatFsHelper.f10899h == 0) {
            this.f4457d.setAdapter(new e.b(1, 29));
        } else {
            this.f4457d.setAdapter(new e.b(1, 28));
        }
        this.f4457d.setLabel(context.getString(R.string.pickerview_day));
        this.f4457d.setCurrentItem(i6 - 1);
        WheelView wheelView3 = (WheelView) this.f4454a.findViewById(R.id.hour);
        this.f4458e = wheelView3;
        wheelView3.setAdapter(new e.b(0, 23));
        this.f4458e.setLabel(context.getString(R.string.pickerview_hours));
        this.f4458e.setCurrentItem(i7);
        WheelView wheelView4 = (WheelView) this.f4454a.findViewById(R.id.min);
        this.f4459f = wheelView4;
        wheelView4.setAdapter(new e.b(0, 59));
        this.f4459f.setLabel(context.getString(R.string.pickerview_minutes));
        this.f4459f.setCurrentItem(i8);
        a aVar = new a(asList, asList2);
        b bVar = new b(asList, asList2);
        this.f4455b.setOnItemSelectedListener(aVar);
        this.f4456c.setOnItemSelectedListener(bVar);
        n();
    }

    public void m(int i4) {
        this.f4461h = i4;
    }

    public void o(float f5) {
        this.f4463j = f5;
        n();
    }

    public void p(View view) {
        this.f4454a = view;
    }

    public c(View view, TimePickerView.Type type) {
        this.f4461h = f4452l;
        this.f4462i = 2100;
        this.f4463j = 5.0f;
        this.f4454a = view;
        this.f4460g = type;
        p(view);
    }
}
