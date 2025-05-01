package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: ForumLoadingDialog.java */
/* loaded from: classes4.dex */
public class w0 extends Dialog {

    /* renamed from: i  reason: collision with root package name */
    public static final int f49737i = -1;

    /* renamed from: j  reason: collision with root package name */
    public static final int f49738j = 0;

    /* renamed from: k  reason: collision with root package name */
    public static final int f49739k = 1;

    /* renamed from: l  reason: collision with root package name */
    public static final int f49740l = 2;

    /* renamed from: m  reason: collision with root package name */
    public static int f49741m = -1;

    /* renamed from: b  reason: collision with root package name */
    private Context f49742b;

    /* renamed from: c  reason: collision with root package name */
    View f49743c;

    /* renamed from: d  reason: collision with root package name */
    View f49744d;

    /* renamed from: e  reason: collision with root package name */
    View f49745e;

    /* renamed from: f  reason: collision with root package name */
    TextView f49746f;

    /* renamed from: g  reason: collision with root package name */
    TextView f49747g;

    /* renamed from: h  reason: collision with root package name */
    public Handler f49748h;

    /* compiled from: ForumLoadingDialog.java */
    /* loaded from: classes4.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i4 = message.what;
            if (i4 != -1) {
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            return;
                        }
                        w0.this.c(2);
                        return;
                    }
                    w0.this.c(1);
                }
                w0.this.c(0);
                return;
            }
            w0.this.c(-1);
        }
    }

    public w0(Context context, int i4) {
        super(context, i4);
        this.f49748h = new a();
        this.f49742b = context;
    }

    public void a(CharSequence charSequence) {
        if (this.f49747g == null) {
            this.f49747g = (TextView) this.f49745e.findViewById(R.id.forum_send_failed_tv);
        }
        this.f49747g.setText(charSequence);
    }

    public void b(CharSequence charSequence) {
        if (this.f49746f == null) {
            this.f49746f = (TextView) this.f49744d.findViewById(R.id.forum_send_success_tv);
        }
        this.f49746f.setText(charSequence);
    }

    public void c(int i4) {
        f49741m = i4;
        if (i4 == -1) {
            dismiss();
            return;
        }
        if (isShowing()) {
            dismiss();
        }
        this.f49743c.setVisibility(8);
        this.f49744d.setVisibility(8);
        this.f49745e.setVisibility(8);
        if (i4 == 0) {
            this.f49743c.setVisibility(0);
        } else if (i4 == 1) {
            this.f49745e.setVisibility(0);
            this.f49748h.sendEmptyMessageDelayed(-1, 500L);
        } else if (i4 == 2) {
            this.f49744d.setVisibility(0);
            this.f49748h.sendEmptyMessageDelayed(-1, 500L);
        }
        if (isShowing()) {
            return;
        }
        show();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
    }

    public w0(Context context) {
        super(context, R.style.dialog_error);
        this.f49748h = new a();
        this.f49742b = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.forum_send_loading_layout, (ViewGroup) null);
        this.f49743c = inflate.findViewById(R.id.forum_send_loading_container);
        this.f49744d = inflate.findViewById(R.id.forum_send_success_container);
        this.f49745e = inflate.findViewById(R.id.forum_send_failed_container);
        setContentView(inflate);
        setCancelable(true);
        setCanceledOnTouchOutside(false);
    }
}
