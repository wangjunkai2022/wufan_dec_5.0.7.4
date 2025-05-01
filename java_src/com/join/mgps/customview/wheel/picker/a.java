package com.join.mgps.customview.wheel.picker;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.join.mgps.customview.wheel.picker.DateTimePicker;
import com.join.mgps.customview.wheel.picker.WheelView;
import com.join.mgps.customview.wheel.picker.util.DateUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* compiled from: EndGameTimePicker.java */
/* loaded from: classes4.dex */
public class a extends com.join.mgps.customview.wheel.picker.c {
    private int A1;
    private int B1;
    private int C1;
    private int D1;
    private int E1;
    private boolean F1;
    private ArrayList<String> V;
    private ArrayList<String> W;
    private String X;
    private String Y;
    private String Z;

    /* renamed from: p0  reason: collision with root package name */
    private String f48900p0;

    /* renamed from: p1  reason: collision with root package name */
    private DateTimePicker.l f48901p1;

    /* renamed from: v1  reason: collision with root package name */
    private DateTimePicker.h f48902v1;

    /* compiled from: EndGameTimePicker.java */
    /* renamed from: com.join.mgps.customview.wheel.picker.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0362a implements WheelView.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WheelView f48903a;

        C0362a(WheelView wheelView) {
            this.f48903a = wheelView;
        }

        @Override // com.join.mgps.customview.wheel.picker.WheelView.g
        public void onSelected(int i4) {
            a aVar = a.this;
            aVar.Z = (String) aVar.V.get(i4);
            if (a.this.f48901p1 != null) {
                a.this.f48901p1.a(i4, a.this.Z);
            }
            a aVar2 = a.this;
            aVar2.Q0(DateUtils.u(aVar2.f48900p0), DateUtils.u(a.this.Z));
            this.f48903a.setItems(a.this.W, a.this.f48900p0);
        }
    }

    /* compiled from: EndGameTimePicker.java */
    /* loaded from: classes4.dex */
    class b implements WheelView.g {
        b() {
        }

        @Override // com.join.mgps.customview.wheel.picker.WheelView.g
        public void onSelected(int i4) {
            a aVar = a.this;
            aVar.f48900p0 = (String) aVar.W.get(i4);
            if (a.this.f48901p1 != null) {
                a.this.f48901p1.b(i4, a.this.f48900p0);
            }
        }
    }

    /* compiled from: EndGameTimePicker.java */
    /* loaded from: classes4.dex */
    class c implements Comparator<Object> {
        c() {
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

    /* compiled from: EndGameTimePicker.java */
    /* loaded from: classes4.dex */
    public interface d extends DateTimePicker.h {
        void b(String str, String str2);
    }

    /* compiled from: EndGameTimePicker.java */
    /* loaded from: classes4.dex */
    public interface e {
        void a(int i4, String str);

        void b(int i4, String str);
    }

    public a(Activity activity) {
        super(activity);
        this.V = new ArrayList<>();
        this.W = new ArrayList<>();
        this.X = "分";
        this.Y = "秒";
        this.Z = "";
        this.f48900p0 = "";
        this.B1 = 0;
        this.C1 = 59;
        this.D1 = 59;
        this.E1 = 16;
        this.F1 = true;
    }

    private void P0() {
        this.V.clear();
        for (int i4 = 0; i4 <= 5; i4++) {
            ArrayList<String> arrayList = this.V;
            arrayList.add(i4 + "");
        }
        if (this.V.indexOf(this.Z) == -1) {
            this.Z = this.V.get(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q0(int i4, int i5) {
        this.W.clear();
        int i6 = 0;
        while (true) {
            if (i6 > (i5 < 5 ? 59 : 0)) {
                break;
            }
            ArrayList<String> arrayList = this.W;
            arrayList.add(i6 + "");
            i6++;
        }
        if (this.W.indexOf(Integer.valueOf(i4)) == -1) {
            this.f48900p0 = this.W.get(0);
        }
    }

    private int R0(ArrayList<String> arrayList, int i4) {
        int binarySearch = Collections.binarySearch(arrayList, Integer.valueOf(i4), new c());
        if (binarySearch >= 0) {
            return binarySearch;
        }
        throw new IllegalArgumentException("Item[" + i4 + "] out of range");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.customview.popup.b
    @NonNull
    public View G() {
        if (this.V.size() == 0) {
            P0();
        }
        if (this.W.size() == 0) {
            Q0(DateUtils.u(this.f48900p0), DateUtils.u(this.Z));
        }
        LinearLayout linearLayout = new LinearLayout(this.f48589b);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        WheelView l02 = l0();
        WheelView l03 = l0();
        l02.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        l02.setItems(this.V, this.Z);
        l02.setOnItemSelectListener(new C0362a(l03));
        l02.setCycleDisable(true);
        linearLayout.addView(l02);
        if (!TextUtils.isEmpty(this.X)) {
            TextView k02 = k0();
            k02.setTextSize(this.E1);
            k02.setText(this.X);
            linearLayout.addView(k02);
        }
        l03.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        l03.setItems(this.W, this.f48900p0);
        l03.setOnItemSelectListener(new b());
        l03.setCycleDisable(true);
        linearLayout.addView(l03);
        if (!TextUtils.isEmpty(this.Y)) {
            TextView k03 = k0();
            k03.setTextSize(this.E1);
            k03.setText(this.Y);
            linearLayout.addView(k03);
        }
        return linearLayout;
    }

    @Override // com.join.mgps.customview.popup.b
    protected void K() {
        if (this.f48902v1 == null) {
            return;
        }
        ((d) this.f48902v1).b(S0(), T0());
    }

    public String S0() {
        return this.Z;
    }

    public String T0() {
        return this.f48900p0;
    }

    public void U0(String str, String str2) {
        this.X = str;
        this.Y = str2;
    }

    public void V0(DateTimePicker.h hVar) {
        this.f48902v1 = hVar;
    }

    public void W0(DateTimePicker.l lVar) {
        this.f48901p1 = lVar;
    }

    public void X0(boolean z4) {
        this.F1 = z4;
    }

    public void Y0(int i4, int i5) {
        this.C1 = i4;
        this.D1 = i5;
    }

    public void Z0(int i4, int i5) {
        this.A1 = i4;
        this.B1 = i5;
    }
}
