package com.join.android.app.common.manager;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: DialogManager.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: k  reason: collision with root package name */
    private static a f14702k = null;

    /* renamed from: l  reason: collision with root package name */
    public static final int f14703l = 80;

    /* renamed from: m  reason: collision with root package name */
    public static final int f14704m = 17;

    /* renamed from: n  reason: collision with root package name */
    public static final int f14705n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f14706o = 2;

    /* renamed from: p  reason: collision with root package name */
    public static final int f14707p = 3;

    /* renamed from: b  reason: collision with root package name */
    private Button f14709b;

    /* renamed from: c  reason: collision with root package name */
    private Button f14710c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f14711d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f14712e;

    /* renamed from: f  reason: collision with root package name */
    private View f14713f;

    /* renamed from: g  reason: collision with root package name */
    private Context f14714g;

    /* renamed from: h  reason: collision with root package name */
    private Toast f14715h;

    /* renamed from: i  reason: collision with root package name */
    private int f14716i = 80;

    /* renamed from: j  reason: collision with root package name */
    private Handler f14717j = new Handler(new C0312a());

    /* renamed from: a  reason: collision with root package name */
    private PopupWindow f14708a = null;

    /* compiled from: DialogManager.java */
    /* renamed from: com.join.android.app.common.manager.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0312a implements Handler.Callback {
        C0312a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            try {
                a.this.f14708a.showAtLocation(a.this.f14713f.findViewById(R.id.full_main), 17, 0, 0);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            return false;
        }
    }

    private a() {
    }

    private DisplayMetrics g(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static a h() {
        if (f14702k == null) {
            f14702k = new a();
        }
        return f14702k;
    }

    private void n() {
        this.f14708a.setFocusable(true);
        this.f14708a.setOutsideTouchable(false);
        this.f14708a.setBackgroundDrawable(new ColorDrawable(0));
        this.f14708a.update();
    }

    public void c(View view, int i4, int i5, int i6, int i7, View view2) {
        this.f14708a = new PopupWindow(view, i4, i5);
        n();
        this.f14708a.showAtLocation(view2, 51, i6, i7);
    }

    public void d(Context context, String str, String str2) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.alert_dialog_view, (ViewGroup) null);
        this.f14713f = inflate;
        this.f14711d = (TextView) inflate.findViewById(R.id.tv_dialog_title);
        this.f14712e = (TextView) this.f14713f.findViewById(R.id.tv_dialog_content);
        this.f14711d.setText(str);
        this.f14712e.setText(str2);
        this.f14710c = (Button) this.f14713f.findViewById(R.id.btn_dialog_cancel);
        this.f14709b = (Button) this.f14713f.findViewById(R.id.btn_dialog_ok);
        this.f14708a = new PopupWindow(this.f14713f, -1, -1);
        n();
        this.f14717j.sendEmptyMessage(0);
    }

    public void e(Context context, String str, String str2) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.alert_dialog_view, (ViewGroup) null);
        this.f14713f = inflate;
        this.f14711d = (TextView) inflate.findViewById(R.id.tv_dialog_title);
        this.f14712e = (TextView) this.f14713f.findViewById(R.id.tv_dialog_content);
        this.f14711d.setText(str);
        this.f14712e.setText(str2);
        this.f14710c = (Button) this.f14713f.findViewById(R.id.btn_dialog_cancel);
        this.f14709b = (Button) this.f14713f.findViewById(R.id.btn_dialog_ok);
        this.f14708a = new PopupWindow(this.f14713f, -1, -1);
        n();
        this.f14717j.sendEmptyMessage(0);
    }

    public void f() {
        PopupWindow popupWindow = this.f14708a;
        if (popupWindow != null) {
            try {
                popupWindow.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    public int i(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    public void j(Context context, String str, int i4) {
        Toast.makeText(context, str, 0).show();
    }

    public void k(String str, View.OnClickListener onClickListener) {
        this.f14710c.setOnClickListener(onClickListener);
        this.f14710c.setText(str);
    }

    public void l(Context context) {
        this.f14714g = context;
    }

    public void m(String str, View.OnClickListener onClickListener) {
        this.f14709b.setOnClickListener(onClickListener);
        this.f14709b.setText(str);
    }

    public void o(int i4) {
        this.f14716i = i4;
    }

    public int p(Activity activity) {
        return g(activity).heightPixels;
    }

    public int q(Activity activity) {
        return g(activity).widthPixels;
    }
}
