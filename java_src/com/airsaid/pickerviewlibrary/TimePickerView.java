package com.airsaid.pickerviewlibrary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
/* loaded from: classes2.dex */
public class TimePickerView extends com.airsaid.pickerviewlibrary.widget.a implements View.OnClickListener {

    /* renamed from: o  reason: collision with root package name */
    private Context f4393o;

    /* renamed from: p  reason: collision with root package name */
    private View f4394p;

    /* renamed from: q  reason: collision with root package name */
    private TextView f4395q;

    /* renamed from: r  reason: collision with root package name */
    private com.airsaid.pickerviewlibrary.widget.c f4396r;

    /* renamed from: s  reason: collision with root package name */
    private Button f4397s;

    /* renamed from: t  reason: collision with root package name */
    private Button f4398t;

    /* renamed from: u  reason: collision with root package name */
    private a f4399u;

    /* loaded from: classes2.dex */
    public enum Type {
        ALL,
        YEAR_MONTH_DAY,
        HOURS_MINS,
        MONTH_DAY_HOUR_MIN,
        YEAR_MONTH
    }

    /* loaded from: classes2.dex */
    public interface a {
        void a(Date date);
    }

    /* loaded from: classes2.dex */
    public class b {

        /* renamed from: b  reason: collision with root package name */
        public static final float f4400b = 6.0f;

        /* renamed from: c  reason: collision with root package name */
        public static final float f4401c = 5.0f;

        /* renamed from: d  reason: collision with root package name */
        public static final float f4402d = 4.0f;

        public b() {
        }
    }

    public TimePickerView(Context context, Type type) {
        super(context);
        this.f4393o = context;
        p();
        o(type);
    }

    private void o(Type type) {
        this.f4396r = new com.airsaid.pickerviewlibrary.widget.c(d(R.id.timepicker), type);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i4 = calendar.get(1);
        int i5 = calendar.get(2);
        int i6 = calendar.get(5);
        int i7 = calendar.get(11);
        int i8 = calendar.get(12);
        Calendar calendar2 = Calendar.getInstance();
        w(calendar2.get(1) - 100, calendar2.get(1) + 100);
        this.f4396r.l(i4, i5, i6, i7, i8);
    }

    private void p() {
        LayoutInflater.from(this.f4393o).inflate(R.layout.pickerview_time, this.f4425d);
        this.f4394p = d(R.id.rlt_head_view);
        this.f4395q = (TextView) d(R.id.tvTitle);
        this.f4397s = (Button) d(R.id.btnSubmit);
        this.f4398t = (Button) d(R.id.btnCancel);
        this.f4397s.setOnClickListener(this);
        this.f4398t.setOnClickListener(this);
    }

    public void A(float f5) {
        this.f4396r.o(f5);
    }

    public void B(Date date) {
        Calendar calendar = Calendar.getInstance();
        if (date == null) {
            calendar.setTimeInMillis(System.currentTimeMillis());
        } else {
            calendar.setTime(date);
        }
        this.f4396r.l(calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(11), calendar.get(12));
    }

    public void C(String str) {
        this.f4395q.setText(str);
    }

    public void D(int i4) {
        this.f4395q.setTextColor(i4);
    }

    public void E(float f5) {
        this.f4395q.setTextSize(f5);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btnSubmit) {
            if (this.f4399u != null) {
                try {
                    this.f4399u.a(com.airsaid.pickerviewlibrary.widget.c.f4451k.parse(this.f4396r.g()));
                } catch (ParseException e5) {
                    e5.printStackTrace();
                }
            }
            b();
        } else if (id == R.id.btnCancel) {
            b();
        }
    }

    public void q(String str) {
        this.f4398t.setText(str);
    }

    public void r(int i4) {
        this.f4398t.setTextColor(i4);
    }

    public void s(float f5) {
        this.f4398t.setTextSize(f5);
    }

    public void t(boolean z4) {
        this.f4396r.i(z4);
    }

    public void u(int i4) {
        this.f4394p.setBackgroundColor(i4);
    }

    public void v(a aVar) {
        this.f4399u = aVar;
    }

    public void w(int i4, int i5) {
        this.f4396r.m(i4);
        this.f4396r.j(i5);
    }

    public void x(String str) {
        this.f4397s.setText(str);
    }

    public void y(int i4) {
        this.f4397s.setTextColor(i4);
    }

    public void z(float f5) {
        this.f4397s.setTextSize(f5);
    }
}
