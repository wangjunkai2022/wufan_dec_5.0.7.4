package com.join.mgps.customview.wheel.picker;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.join.mgps.customview.wheel.picker.WheelView;
import com.join.mgps.customview.wheel.picker.util.DateUtils;
import com.kwad.library.solder.lib.ext.PluginError;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
/* loaded from: classes4.dex */
public class DateTimePicker extends com.join.mgps.customview.wheel.picker.c {

    /* renamed from: c2  reason: collision with root package name */
    public static final int f48825c2 = -1;

    /* renamed from: d2  reason: collision with root package name */
    public static final int f48826d2 = 0;

    /* renamed from: e2  reason: collision with root package name */
    public static final int f48827e2 = 1;

    /* renamed from: f2  reason: collision with root package name */
    public static final int f48828f2 = 2;

    /* renamed from: g2  reason: collision with root package name */
    public static final int f48829g2 = 3;

    /* renamed from: h2  reason: collision with root package name */
    public static final int f48830h2 = 4;
    private String A1;
    private String B1;
    private String C1;
    private String D1;
    private int E1;
    private int F1;
    private int G1;
    private String H1;
    private String I1;
    private String J1;
    private l K1;
    private h L1;
    private int M1;
    private int N1;
    private int O1;
    private int P1;
    private int Q1;
    private int R1;
    private int S1;
    private int T1;
    private int U1;
    private ArrayList<String> V;
    private int V1;
    private ArrayList<String> W;
    private int W1;
    private ArrayList<String> X;
    private int X1;
    private ArrayList<String> Y;
    private int Y1;
    private ArrayList<String> Z;
    private int Z1;

    /* renamed from: a2  reason: collision with root package name */
    private int f48831a2;

    /* renamed from: b2  reason: collision with root package name */
    private boolean f48832b2;

    /* renamed from: p0  reason: collision with root package name */
    private ArrayList<String> f48833p0;

    /* renamed from: p1  reason: collision with root package name */
    private String f48834p1;

    /* renamed from: v1  reason: collision with root package name */
    private String f48835v1;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface DateMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface TimeMode {
    }

    /* loaded from: classes4.dex */
    class a implements WheelView.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WheelView f48836a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WheelView f48837b;

        a(WheelView wheelView, WheelView wheelView2) {
            this.f48836a = wheelView;
            this.f48837b = wheelView2;
        }

        @Override // com.join.mgps.customview.wheel.picker.WheelView.g
        public void onSelected(int i4) {
            DateTimePicker.this.E1 = i4;
            String str = (String) DateTimePicker.this.V.get(DateTimePicker.this.E1);
            if (DateTimePicker.this.K1 != null) {
                DateTimePicker.this.K1.f(DateTimePicker.this.E1, str);
            }
            if (DateTimePicker.this.f48832b2) {
                DateTimePicker.this.F1 = 0;
                DateTimePicker.this.G1 = 0;
            }
            int u4 = DateUtils.u(str);
            DateTimePicker.this.i1(u4);
            this.f48836a.setItems(DateTimePicker.this.W, DateTimePicker.this.F1);
            if (DateTimePicker.this.K1 != null) {
                DateTimePicker.this.K1.e(DateTimePicker.this.F1, (String) DateTimePicker.this.W.get(DateTimePicker.this.F1));
            }
            DateTimePicker dateTimePicker = DateTimePicker.this;
            dateTimePicker.g1(u4, DateUtils.u((String) dateTimePicker.W.get(DateTimePicker.this.F1)));
            this.f48837b.setItems(DateTimePicker.this.X, DateTimePicker.this.G1);
            if (DateTimePicker.this.K1 != null) {
                DateTimePicker.this.K1.d(DateTimePicker.this.G1, (String) DateTimePicker.this.X.get(DateTimePicker.this.G1));
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements WheelView.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WheelView f48839a;

        b(WheelView wheelView) {
            this.f48839a = wheelView;
        }

        @Override // com.join.mgps.customview.wheel.picker.WheelView.g
        public void onSelected(int i4) {
            int i5;
            DateTimePicker.this.F1 = i4;
            String str = (String) DateTimePicker.this.W.get(DateTimePicker.this.F1);
            if (DateTimePicker.this.K1 != null) {
                DateTimePicker.this.K1.e(DateTimePicker.this.F1, str);
            }
            if (DateTimePicker.this.M1 == 0 || DateTimePicker.this.M1 == 2) {
                if (DateTimePicker.this.f48832b2) {
                    DateTimePicker.this.G1 = 0;
                }
                if (DateTimePicker.this.M1 == 0) {
                    i5 = DateUtils.u(DateTimePicker.this.q1());
                } else {
                    i5 = Calendar.getInstance(Locale.CHINA).get(1);
                }
                DateTimePicker.this.g1(i5, DateUtils.u(str));
                this.f48839a.setItems(DateTimePicker.this.X, DateTimePicker.this.G1);
                if (DateTimePicker.this.K1 != null) {
                    DateTimePicker.this.K1.d(DateTimePicker.this.G1, (String) DateTimePicker.this.X.get(DateTimePicker.this.G1));
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    class c implements WheelView.g {
        c() {
        }

        @Override // com.join.mgps.customview.wheel.picker.WheelView.g
        public void onSelected(int i4) {
            DateTimePicker.this.G1 = i4;
            if (DateTimePicker.this.K1 != null) {
                DateTimePicker.this.K1.d(DateTimePicker.this.G1, (String) DateTimePicker.this.X.get(DateTimePicker.this.G1));
            }
        }
    }

    /* loaded from: classes4.dex */
    class d implements WheelView.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WheelView f48842a;

        d(WheelView wheelView) {
            this.f48842a = wheelView;
        }

        @Override // com.join.mgps.customview.wheel.picker.WheelView.g
        public void onSelected(int i4) {
            DateTimePicker dateTimePicker = DateTimePicker.this;
            dateTimePicker.H1 = (String) dateTimePicker.Y.get(i4);
            if (DateTimePicker.this.K1 != null) {
                DateTimePicker.this.K1.c(i4, DateTimePicker.this.H1);
            }
            DateTimePicker dateTimePicker2 = DateTimePicker.this;
            dateTimePicker2.h1(DateUtils.u(dateTimePicker2.H1));
            this.f48842a.setItems(DateTimePicker.this.Z, DateTimePicker.this.I1);
        }
    }

    /* loaded from: classes4.dex */
    class e implements WheelView.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WheelView f48844a;

        e(WheelView wheelView) {
            this.f48844a = wheelView;
        }

        @Override // com.join.mgps.customview.wheel.picker.WheelView.g
        public void onSelected(int i4) {
            DateTimePicker dateTimePicker = DateTimePicker.this;
            dateTimePicker.I1 = (String) dateTimePicker.Z.get(i4);
            if (DateTimePicker.this.K1 != null) {
                DateTimePicker.this.K1.a(i4, DateTimePicker.this.I1);
            }
            DateTimePicker dateTimePicker2 = DateTimePicker.this;
            dateTimePicker2.j1(DateUtils.u(dateTimePicker2.J1));
            this.f48844a.setItems(DateTimePicker.this.f48833p0, DateTimePicker.this.J1);
        }
    }

    /* loaded from: classes4.dex */
    class f implements WheelView.g {
        f() {
        }

        @Override // com.join.mgps.customview.wheel.picker.WheelView.g
        public void onSelected(int i4) {
            DateTimePicker dateTimePicker = DateTimePicker.this;
            dateTimePicker.J1 = (String) dateTimePicker.f48833p0.get(i4);
            if (DateTimePicker.this.K1 != null) {
                DateTimePicker.this.K1.b(i4, DateTimePicker.this.J1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements Comparator<Object> {
        g() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            String obj3 = obj.toString();
            String obj4 = obj2.toString();
            if (obj3.startsWith("0")) {
                obj3 = obj3.substring(1);
            }
            if (obj4.startsWith("0")) {
                obj4 = obj4.substring(1);
            }
            try {
                return Integer.parseInt(obj3) - Integer.parseInt(obj4);
            } catch (NumberFormatException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
    }

    /* loaded from: classes4.dex */
    protected interface h {
    }

    @Deprecated
    /* loaded from: classes4.dex */
    public interface i extends j {
    }

    /* loaded from: classes4.dex */
    public interface j extends h {
        void a(String str, String str2, String str3, String str4);
    }

    /* loaded from: classes4.dex */
    public interface k extends h {
        void d(String str, String str2, String str3);
    }

    /* loaded from: classes4.dex */
    public interface l {
        void a(int i4, String str);

        void b(int i4, String str);

        void c(int i4, String str);

        void d(int i4, String str);

        void e(int i4, String str);

        void f(int i4, String str);
    }

    /* loaded from: classes4.dex */
    public interface m extends h {
        void c(String str, String str2, String str3, String str4, String str5);
    }

    @Deprecated
    /* loaded from: classes4.dex */
    public interface n extends o {
    }

    /* loaded from: classes4.dex */
    public interface o extends h {
        void a(String str, String str2, String str3, String str4);
    }

    public DateTimePicker(Activity activity, int i4) {
        this(activity, 0, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g1(int i4, int i5) {
        String str;
        int b5 = DateUtils.b(i4, i5);
        if (this.f48832b2) {
            str = "";
        } else {
            if (this.G1 >= b5) {
                this.G1 = b5 - 1;
            }
            int size = this.X.size();
            int i6 = this.G1;
            if (size > i6) {
                str = this.X.get(i6);
            } else {
                str = DateUtils.o(Calendar.getInstance().get(5));
            }
        }
        this.X.clear();
        int i7 = this.O1;
        if (i4 == i7 && i5 == this.P1 && i4 == this.R1 && i5 == this.S1) {
            for (int i8 = this.Q1; i8 <= this.T1; i8++) {
                this.X.add(DateUtils.o(i8));
            }
        } else if (i4 == i7 && i5 == this.P1) {
            for (int i9 = this.Q1; i9 <= b5; i9++) {
                this.X.add(DateUtils.o(i9));
            }
        } else {
            int i10 = 1;
            if (i4 == this.R1 && i5 == this.S1) {
                while (i10 <= this.T1) {
                    this.X.add(DateUtils.o(i10));
                    i10++;
                }
            } else {
                while (i10 <= b5) {
                    this.X.add(DateUtils.o(i10));
                    i10++;
                }
            }
        }
        if (this.f48832b2) {
            return;
        }
        int indexOf = this.X.indexOf(str);
        if (indexOf == -1) {
            indexOf = 0;
        }
        this.G1 = indexOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h1(int i4) {
        this.Z.clear();
        int i5 = this.U1;
        int i6 = this.X1;
        if (i5 == i6) {
            int i7 = this.V1;
            int i8 = this.Y1;
            if (i7 > i8) {
                this.V1 = i8;
                this.Y1 = i7;
            }
            for (int i9 = this.V1; i9 <= this.Y1; i9++) {
                this.Z.add(DateUtils.o(i9));
            }
        } else if (i4 == i5) {
            for (int i10 = this.V1; i10 <= 59; i10++) {
                this.Z.add(DateUtils.o(i10));
            }
        } else if (i4 == i6) {
            for (int i11 = 0; i11 <= this.Y1; i11++) {
                this.Z.add(DateUtils.o(i11));
            }
        } else {
            for (int i12 = 0; i12 <= 59; i12++) {
                this.Z.add(DateUtils.o(i12));
            }
        }
        if (this.Z.indexOf(this.I1) == -1) {
            this.I1 = this.Z.get(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i1(int i4) {
        String str;
        int i5;
        int i6 = 1;
        if (this.f48832b2) {
            str = "";
        } else {
            int size = this.W.size();
            int i7 = this.F1;
            if (size > i7) {
                str = this.W.get(i7);
            } else {
                str = DateUtils.o(Calendar.getInstance().get(2) + 1);
            }
        }
        this.W.clear();
        int i8 = this.P1;
        if (i8 >= 1 && (i5 = this.S1) >= 1 && i8 <= 12 && i5 <= 12) {
            int i9 = this.O1;
            int i10 = this.R1;
            if (i9 == i10) {
                if (i8 > i5) {
                    while (i5 >= this.P1) {
                        this.W.add(DateUtils.o(i5));
                        i5--;
                    }
                } else {
                    while (i8 <= this.S1) {
                        this.W.add(DateUtils.o(i8));
                        i8++;
                    }
                }
            } else if (i4 == i9) {
                while (i8 <= 12) {
                    this.W.add(DateUtils.o(i8));
                    i8++;
                }
            } else if (i4 == i10) {
                while (i6 <= this.S1) {
                    this.W.add(DateUtils.o(i6));
                    i6++;
                }
            } else {
                while (i6 <= 12) {
                    this.W.add(DateUtils.o(i6));
                    i6++;
                }
            }
            if (this.f48832b2) {
                return;
            }
            int indexOf = this.W.indexOf(str);
            if (indexOf == -1) {
                indexOf = 0;
            }
            this.F1 = indexOf;
            return;
        }
        throw new IllegalArgumentException("Month out of range [1-12]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j1(int i4) {
        this.f48833p0.clear();
        for (int i5 = 0; i5 <= 59; i5++) {
            this.f48833p0.add(DateUtils.o(i5));
        }
        if (this.f48833p0.indexOf(Integer.valueOf(i4)) == -1) {
            this.J1 = this.f48833p0.get(0);
        }
    }

    private int k1(ArrayList<String> arrayList, int i4) {
        int binarySearch = Collections.binarySearch(arrayList, Integer.valueOf(i4), new g());
        if (binarySearch >= 0) {
            return binarySearch;
        }
        throw new IllegalArgumentException("Item[" + i4 + "] out of range");
    }

    private void r1() {
        int i4;
        this.Y.clear();
        if (this.f48832b2) {
            i4 = 0;
        } else if (this.N1 == 3) {
            i4 = Calendar.getInstance().get(11);
        } else {
            i4 = Calendar.getInstance().get(10);
        }
        for (int i5 = this.U1; i5 <= this.X1; i5++) {
            String o4 = DateUtils.o(i5);
            if (!this.f48832b2 && i5 == i4) {
                this.H1 = o4;
            }
            this.Y.add(o4);
        }
        if (this.Y.indexOf(this.H1) == -1) {
            this.H1 = this.Y.get(0);
        }
        if (this.f48832b2) {
            return;
        }
        this.I1 = DateUtils.o(Calendar.getInstance().get(12));
    }

    private void s1() {
        this.V.clear();
        int i4 = this.O1;
        int i5 = this.R1;
        if (i4 == i5) {
            this.V.add(String.valueOf(i4));
        } else if (i4 < i5) {
            while (i4 <= this.R1) {
                this.V.add(String.valueOf(i4));
                i4++;
            }
        } else {
            while (i4 >= this.R1) {
                this.V.add(String.valueOf(i4));
                i4--;
            }
        }
        if (this.f48832b2) {
            return;
        }
        int i6 = this.M1;
        if (i6 == 0 || i6 == 1) {
            int indexOf = this.V.indexOf(DateUtils.o(Calendar.getInstance().get(1)));
            if (indexOf == -1) {
                this.E1 = 0;
            } else {
                this.E1 = indexOf;
            }
        }
    }

    @Deprecated
    public void A1(int i4, int i5) {
        if (this.M1 != -1) {
            this.O1 = i4;
            this.R1 = i5;
            s1();
            return;
        }
        throw new IllegalArgumentException("Date mode invalid");
    }

    public void B1(boolean z4) {
        this.f48832b2 = z4;
    }

    public void C1(int i4, int i5, int i6, int i7) {
        int i8 = this.M1;
        if (i8 != 0) {
            if (i8 == 2) {
                int i9 = Calendar.getInstance(Locale.CHINA).get(1);
                this.R1 = i9;
                this.O1 = i9;
                i1(i9);
                g1(i9, i4);
                this.F1 = k1(this.W, i4);
                this.G1 = k1(this.X, i5);
            } else if (i8 == 1) {
                i1(i4);
                this.E1 = k1(this.V, i4);
                this.F1 = k1(this.W, i5);
            }
            if (this.N1 != -1) {
                this.H1 = DateUtils.o(i6);
                this.I1 = DateUtils.o(i7);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Date mode invalid");
    }

    public void D1(int i4, int i5, int i6, int i7, int i8) {
        if (this.M1 == 0) {
            i1(i4);
            g1(i4, i5);
            this.E1 = k1(this.V, i4);
            this.F1 = k1(this.W, i5);
            this.G1 = k1(this.X, i6);
            if (this.N1 != -1) {
                this.H1 = DateUtils.o(i7);
                this.I1 = DateUtils.o(i8);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Date mode invalid");
    }

    public void E1(int i4, int i5, int i6) {
        int i7 = this.N1;
        if (i7 == -1) {
            throw new IllegalArgumentException("Time mode invalid");
        }
        boolean z4 = false;
        boolean z5 = true;
        z4 = (i4 < 0 || i5 < 0 || i5 > 59) ? true : true;
        if (i7 == 4 && (i4 == 0 || i4 > 12)) {
            z4 = true;
        }
        if (i7 != 3 || i4 < 24) {
            z5 = z4;
        }
        if (!z5) {
            this.X1 = i4;
            this.Y1 = i5;
            this.Z1 = i6;
            r1();
            return;
        }
        throw new IllegalArgumentException("Time out of range");
    }

    public void F1(int i4, int i5, int i6) {
        int i7 = this.N1;
        if (i7 == -1) {
            throw new IllegalArgumentException("Time mode invalid");
        }
        boolean z4 = false;
        boolean z5 = true;
        z4 = (i4 < 0 || i5 < 0 || i5 > 59) ? true : true;
        if (i7 == 4 && (i4 == 0 || i4 > 12)) {
            z4 = true;
        }
        if (i7 != 3 || i4 < 24) {
            z5 = z4;
        }
        if (!z5) {
            this.U1 = i4;
            this.V1 = i5;
            this.W1 = i6;
            r1();
            return;
        }
        throw new IllegalArgumentException("Time out of range");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.customview.popup.b
    @NonNull
    public View G() {
        int i4;
        int i5 = this.M1;
        if ((i5 == 0 || i5 == 1) && this.V.size() == 0) {
            s1();
        }
        if (this.M1 != -1 && this.W.size() == 0) {
            i1(DateUtils.u(q1()));
        }
        int i6 = this.M1;
        if ((i6 == 0 || i6 == 2) && this.X.size() == 0) {
            if (this.M1 == 0) {
                i4 = DateUtils.u(q1());
            } else {
                i4 = Calendar.getInstance(Locale.CHINA).get(1);
            }
            g1(i4, DateUtils.u(o1()));
        }
        if (this.N1 != -1 && this.Y.size() == 0) {
            r1();
        }
        if (this.N1 != -1 && this.Z.size() == 0) {
            h1(DateUtils.u(this.H1));
        }
        if (this.N1 != -1 && this.f48833p0.size() == 0) {
            j1(DateUtils.u(this.I1));
        }
        LinearLayout linearLayout = new LinearLayout(this.f48589b);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        WheelView l02 = l0();
        WheelView l03 = l0();
        WheelView l04 = l0();
        WheelView l05 = l0();
        WheelView l06 = l0();
        WheelView l07 = l0();
        int i7 = this.M1;
        if (i7 == 0 || i7 == 1) {
            l02.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            l02.setItems(this.V, this.E1);
            l02.setOnItemSelectListener(new a(l03, l04));
            linearLayout.addView(l02);
            if (!TextUtils.isEmpty(this.f48834p1)) {
                TextView k02 = k0();
                k02.setTextSize(this.f48831a2);
                k02.setText(this.f48834p1);
                linearLayout.addView(k02);
            }
        }
        if (this.M1 != -1) {
            l03.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            l03.setItems(this.W, this.F1);
            l03.setOnItemSelectListener(new b(l04));
            linearLayout.addView(l03);
            if (!TextUtils.isEmpty(this.f48835v1)) {
                TextView k03 = k0();
                k03.setTextSize(this.f48831a2);
                k03.setText(this.f48835v1);
                linearLayout.addView(k03);
            }
        }
        int i8 = this.M1;
        if (i8 == 0 || i8 == 2) {
            l04.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            l04.setItems(this.X, this.G1);
            l04.setOnItemSelectListener(new c());
            linearLayout.addView(l04);
            if (!TextUtils.isEmpty(this.A1)) {
                TextView k04 = k0();
                k04.setTextSize(this.f48831a2);
                k04.setText(this.A1);
                linearLayout.addView(k04);
            }
        }
        if (this.N1 != -1) {
            l05.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            l05.setItems(this.Y, this.H1);
            l05.setOnItemSelectListener(new d(l06));
            linearLayout.addView(l05);
            if (!TextUtils.isEmpty(this.B1)) {
                TextView k05 = k0();
                k05.setTextSize(this.f48831a2);
                k05.setText(this.B1);
                linearLayout.addView(k05);
            }
            l06.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            l06.setItems(this.Z, this.I1);
            l06.setOnItemSelectListener(new e(l07));
            linearLayout.addView(l06);
            if (!TextUtils.isEmpty(this.C1)) {
                TextView k06 = k0();
                k06.setTextSize(this.f48831a2);
                k06.setText(this.C1);
                linearLayout.addView(k06);
            }
            l07.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            l07.setItems(this.f48833p0, this.J1);
            l07.setOnItemSelectListener(new f());
            linearLayout.addView(l07);
            if (!TextUtils.isEmpty(this.D1)) {
                TextView k07 = k0();
                k07.setTextSize(this.f48831a2);
                k07.setText(this.D1);
                linearLayout.addView(k07);
            }
        }
        return linearLayout;
    }

    @Override // com.join.mgps.customview.popup.b
    protected void K() {
        if (this.L1 == null) {
            return;
        }
        String q12 = q1();
        String o12 = o1();
        String l12 = l1();
        String m12 = m1();
        String n12 = n1();
        String p12 = p1();
        int i4 = this.M1;
        if (i4 == -1) {
            ((k) this.L1).d(m12, n12, p12);
        } else if (i4 == 0) {
            ((m) this.L1).c(q12, o12, l12, m12, n12);
        } else if (i4 == 1) {
            ((o) this.L1).a(q12, o12, m12, n12);
        } else if (i4 != 2) {
        } else {
            ((j) this.L1).a(o12, l12, m12, n12);
        }
    }

    public String l1() {
        int i4 = this.M1;
        if (i4 == 0 || i4 == 2) {
            if (this.X.size() <= this.G1) {
                this.G1 = this.X.size() - 1;
            }
            return this.X.get(this.G1);
        }
        return "";
    }

    public String m1() {
        return this.N1 != -1 ? this.H1 : "";
    }

    public String n1() {
        return this.N1 != -1 ? this.I1 : "";
    }

    public String o1() {
        if (this.M1 != -1) {
            if (this.W.size() <= this.F1) {
                this.F1 = this.W.size() - 1;
            }
            return this.W.get(this.F1);
        }
        return "";
    }

    public String p1() {
        return this.N1 != -1 ? this.J1 : "";
    }

    public String q1() {
        int i4 = this.M1;
        if (i4 == 0 || i4 == 1) {
            if (this.V.size() <= this.E1) {
                this.E1 = this.V.size() - 1;
            }
            return this.V.get(this.E1);
        }
        return "";
    }

    public void t1(int i4, int i5) {
        int i6 = this.M1;
        if (i6 == -1) {
            throw new IllegalArgumentException("Date mode invalid");
        }
        if (i6 != 0) {
            if (i6 == 1) {
                this.R1 = i4;
                this.S1 = i5;
            } else if (i6 == 2) {
                this.S1 = i4;
                this.T1 = i5;
            }
            s1();
            return;
        }
        throw new IllegalArgumentException("Not support year/month/day mode");
    }

    public void u1(int i4, int i5, int i6) {
        if (this.M1 != -1) {
            this.R1 = i4;
            this.S1 = i5;
            this.T1 = i6;
            s1();
            return;
        }
        throw new IllegalArgumentException("Date mode invalid");
    }

    public void v1(int i4, int i5) {
        int i6 = this.M1;
        if (i6 == -1) {
            throw new IllegalArgumentException("Date mode invalid");
        }
        if (i6 != 0) {
            if (i6 == 1) {
                this.O1 = i4;
                this.P1 = i5;
            } else if (i6 == 2) {
                int i7 = Calendar.getInstance(Locale.CHINA).get(1);
                this.R1 = i7;
                this.O1 = i7;
                this.P1 = i4;
                this.Q1 = i5;
            }
            s1();
            return;
        }
        throw new IllegalArgumentException("Not support year/month/day mode");
    }

    public void w1(int i4, int i5, int i6) {
        if (this.M1 != -1) {
            this.O1 = i4;
            this.P1 = i5;
            this.Q1 = i6;
            s1();
            return;
        }
        throw new IllegalArgumentException("Date mode invalid");
    }

    public void x1(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f48834p1 = str;
        this.f48835v1 = str2;
        this.A1 = str3;
        this.B1 = str4;
        this.C1 = str5;
        this.D1 = str6;
    }

    public void y1(h hVar) {
        this.L1 = hVar;
    }

    public void z1(l lVar) {
        this.K1 = lVar;
    }

    public DateTimePicker(Activity activity, int i4, int i5) {
        super(activity);
        this.V = new ArrayList<>();
        this.W = new ArrayList<>();
        this.X = new ArrayList<>();
        this.Y = new ArrayList<>();
        this.Z = new ArrayList<>();
        this.f48833p0 = new ArrayList<>();
        this.f48834p1 = "年";
        this.f48835v1 = "月";
        this.A1 = "日";
        this.B1 = "时";
        this.C1 = "分";
        this.D1 = "秒";
        this.E1 = 0;
        this.F1 = 0;
        this.G1 = 0;
        this.H1 = "";
        this.I1 = "";
        this.J1 = "";
        this.M1 = 0;
        this.N1 = 3;
        this.O1 = PluginError.ERROR_UPD_PLUGIN_CONNECTION;
        this.P1 = 1;
        this.Q1 = 1;
        this.R1 = 2020;
        this.S1 = 12;
        this.T1 = 31;
        this.W1 = 0;
        this.Y1 = 59;
        this.Z1 = 59;
        this.f48831a2 = 16;
        this.f48832b2 = true;
        if (i4 == -1 && i5 == -1) {
            throw new IllegalArgumentException("The modes are NONE at the same time");
        }
        if (i4 == 0 && i5 != -1) {
            int i6 = this.f48590c;
            if (i6 < 720) {
                this.f48831a2 = 14;
            } else if (i6 < 480) {
                this.f48831a2 = 12;
            }
        }
        this.M1 = i4;
        if (i5 == 4) {
            this.U1 = 1;
            this.X1 = 12;
        } else {
            this.U1 = 0;
            this.X1 = 23;
        }
        this.N1 = i5;
    }
}
