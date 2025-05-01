package com.join.mgps.Util;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import com.MApplication;
/* compiled from: ToastUtils.java */
/* loaded from: classes3.dex */
public class l2 {

    /* renamed from: c  reason: collision with root package name */
    private static l2 f27925c;

    /* renamed from: a  reason: collision with root package name */
    Toast f27926a;

    /* renamed from: b  reason: collision with root package name */
    Handler f27927b;

    /* compiled from: ToastUtils.java */
    /* loaded from: classes3.dex */
    class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f27928a;

        a(Context context) {
            this.f27928a = context;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            try {
                String str = (String) message.obj;
                l2 l2Var = l2.this;
                Toast toast = l2Var.f27926a;
                if (toast == null) {
                    l2Var.f27926a = Toast.makeText(this.f27928a, str, 1);
                } else {
                    toast.cancel();
                    l2.this.f27926a = Toast.makeText(this.f27928a, str, 1);
                    l2.this.f27926a.setText((CharSequence) message.obj);
                }
                l2.this.f27926a.show();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    private l2(Context context) {
        this.f27926a = new Toast(context);
        this.f27926a = Toast.makeText(context, "", 1);
        this.f27927b = new a(context);
    }

    public static l2 a(Context context) {
        if (context == null) {
            context = MApplication.f1497x;
        }
        if (f27925c == null) {
            f27925c = new l2(context);
        }
        return f27925c;
    }

    public void b(String str) {
        Message obtainMessage = this.f27927b.obtainMessage();
        obtainMessage.obj = str;
        obtainMessage.sendToTarget();
    }
}
