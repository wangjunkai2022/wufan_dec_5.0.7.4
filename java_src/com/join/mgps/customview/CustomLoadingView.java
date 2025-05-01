package com.join.mgps.customview;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
/* loaded from: classes4.dex */
public class CustomLoadingView extends RelativeLayout {

    /* renamed from: k  reason: collision with root package name */
    public static final int f46793k = 1;

    /* renamed from: l  reason: collision with root package name */
    public static final int f46794l = 2;

    /* renamed from: m  reason: collision with root package name */
    public static final int f46795m = 4;

    /* renamed from: n  reason: collision with root package name */
    public static final int f46796n = 9;

    /* renamed from: o  reason: collision with root package name */
    public static final int f46797o = 10;

    /* renamed from: p  reason: collision with root package name */
    public static final int f46798p = 16;

    /* renamed from: b  reason: collision with root package name */
    private View f46799b;

    /* renamed from: c  reason: collision with root package name */
    private View f46800c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f46801d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f46802e;

    /* renamed from: f  reason: collision with root package name */
    private View f46803f;

    /* renamed from: g  reason: collision with root package name */
    private Button f46804g;

    /* renamed from: h  reason: collision with root package name */
    protected int f46805h;

    /* renamed from: i  reason: collision with root package name */
    private Handler f46806i;

    /* renamed from: j  reason: collision with root package name */
    private e f46807j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public enum HandleId {
        LOADING,
        LOADING_SUCCESS,
        LOADING_FAILED,
        SET_RELOADING_VISIBILITY,
        SET_FAILED_IMG_VISIBILITY,
        SET_FAILED_IMG_RES,
        SET_FAILED_RELOADING_RES,
        SET_FAILED_MSG
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                int i4 = message.what;
                if (i4 == HandleId.LOADING.ordinal()) {
                    CustomLoadingView.this.q();
                } else if (i4 == HandleId.LOADING_FAILED.ordinal()) {
                    CustomLoadingView.this.r();
                } else if (i4 == HandleId.LOADING_SUCCESS.ordinal()) {
                    CustomLoadingView.this.t(true);
                } else if (i4 == HandleId.SET_FAILED_IMG_VISIBILITY.ordinal()) {
                    CustomLoadingView.this.setFailedImgVisibilityP(message.arg1);
                } else if (i4 == HandleId.SET_RELOADING_VISIBILITY.ordinal()) {
                    CustomLoadingView.this.setReloadingVisibilityP(message.arg1);
                } else if (i4 == HandleId.SET_FAILED_IMG_RES.ordinal()) {
                    CustomLoadingView.this.setFailedImgResP(message.arg1);
                } else if (i4 == HandleId.SET_FAILED_RELOADING_RES.ordinal()) {
                    CustomLoadingView.this.setFailedReloadingResP(message.arg1);
                } else if (i4 == HandleId.SET_FAILED_MSG.ordinal()) {
                    CustomLoadingView.this.setFailedMsgP((String) message.obj);
                }
                CustomLoadingView.this.invalidate();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goWirelessSettings(view.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CustomLoadingView.this.f46807j != null) {
                CustomLoadingView.this.f46807j.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CustomLoadingView.this.f46807j != null) {
                CustomLoadingView.this.f46807j.a(view);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        CustomLoadingView f46812a;

        public e(CustomLoadingView customLoadingView) {
            this.f46812a = customLoadingView;
        }

        public void a(View view) {
            Context context = view.getContext();
            if (this.f46812a.getLoadingState() == 9) {
                IntentUtil.getInstance().goWirelessSettings(context);
            } else if (this.f46812a.getLoadingState() == 10) {
                com.join.mgps.Util.j0.E0(context);
            }
        }

        public void b() {
        }

        public void c(boolean z4) {
        }
    }

    public CustomLoadingView(Context context) {
        super(context);
        this.f46805h = 1;
        m(context);
    }

    private void j() {
        if (this.f46800c == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_custom_failed, (ViewGroup) null);
            this.f46800c = inflate.findViewById(R.id.loding_faile);
            this.f46801d = (ImageView) inflate.findViewById(R.id.relodingimag);
            this.f46802e = (TextView) inflate.findViewById(R.id.failedMessage);
            this.f46803f = inflate.findViewById(R.id.lodingBackImage);
            this.f46804g = (Button) inflate.findViewById(R.id.setNetwork);
            addView(inflate);
            inflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.f46804g.setOnClickListener(new b());
            this.f46801d.setOnClickListener(new c());
            this.f46804g.setOnClickListener(new d());
        }
    }

    private void k() {
        if (this.f46799b == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_custom_loading, (ViewGroup) null);
            this.f46799b = inflate.findViewById(R.id.loding_layout);
            addView(inflate);
            inflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }

    private void m(Context context) {
        this.f46806i = new a();
    }

    private void p() {
        j();
        this.f46800c.setVisibility(0);
        this.f46799b.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        s();
        t(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        p();
        t(false);
    }

    private void s() {
        k();
        this.f46799b.setVisibility(0);
        this.f46800c.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailedImgResP(int i4) {
        j();
        if (i4 == 9) {
            return;
        }
        try {
            if (i4 == 10) {
                this.f46804g.setText("点击查看相关帖子");
            } else {
                this.f46804g.setText("");
                this.f46804g.setBackgroundResource(i4);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailedImgVisibilityP(int i4) {
        int i5 = i4 == 0 ? 0 : 8;
        j();
        this.f46803f.setVisibility(i5);
        this.f46804g.setVisibility(i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailedMsgP(String str) {
        j();
        TextView textView = this.f46802e;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailedReloadingResP(int i4) {
        try {
            j();
            this.f46801d.setImageResource(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReloadingVisibilityP(int i4) {
        int i5 = i4 != 8 ? 0 : 8;
        j();
        this.f46801d.setVisibility(i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(boolean z4) {
        int i4 = !z4 ? 8 : 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt != this.f46799b && childAt != this.f46800c) {
                childAt.setVisibility(i4);
            } else if (z4) {
                childAt.setVisibility(8);
            }
        }
        e eVar = this.f46807j;
        if (eVar != null) {
            eVar.c(z4);
        }
    }

    public int getLoadingState() {
        return this.f46805h;
    }

    public void l(int i4) {
        setFailedImgVisibility(0);
        setReloadingVisibility(0);
        int i5 = this.f46805h;
        if (i5 == 2) {
            return;
        }
        if (i4 == 2) {
            this.f46805h = 2;
        } else if (i4 == 1) {
            this.f46805h = 1;
        } else if (i4 == 9) {
            this.f46805h = 9;
            setFailedMsg("网络连接失败，再试试吧~");
            setFailedImgRes(9);
        } else if (i4 == 10) {
            this.f46805h = 10;
            setReloadingVisibility(8);
            setFailedImgRes(10);
        } else {
            if ((i4 & 16) == 16) {
                this.f46805h = i4 | i5;
            } else {
                this.f46805h = i4 | i5;
            }
            setFailedMsg("加载失败，再试试吧~");
            setFailedImgVisibility(8);
        }
        int i6 = this.f46805h;
        char c5 = i6 == 1 ? (char) 1 : i6 == 2 ? (char) 2 : (char) 4;
        Message obtainMessage = this.f46806i.obtainMessage();
        if (c5 == 1) {
            obtainMessage.what = HandleId.LOADING.ordinal();
        } else if (c5 == 2) {
            obtainMessage.what = HandleId.LOADING_SUCCESS.ordinal();
        } else if (c5 == 4) {
            obtainMessage.what = HandleId.LOADING_FAILED.ordinal();
        }
        obtainMessage.sendToTarget();
    }

    public boolean n() {
        return this.f46805h == 2;
    }

    public void o() {
        if (this.f46805h != 1) {
            this.f46805h = 1;
        }
    }

    public void setFailedImgRes(int i4) {
        Message obtainMessage = this.f46806i.obtainMessage();
        obtainMessage.what = HandleId.SET_FAILED_IMG_RES.ordinal();
        obtainMessage.arg1 = i4;
        obtainMessage.sendToTarget();
    }

    public void setFailedImgVisibility(int i4) {
        Message obtainMessage = this.f46806i.obtainMessage();
        obtainMessage.what = HandleId.SET_FAILED_IMG_VISIBILITY.ordinal();
        obtainMessage.arg1 = i4;
        obtainMessage.sendToTarget();
    }

    public void setFailedMsg(String str) {
        Message obtainMessage = this.f46806i.obtainMessage();
        obtainMessage.what = HandleId.SET_FAILED_MSG.ordinal();
        obtainMessage.obj = str;
        obtainMessage.sendToTarget();
    }

    public void setFailedReloadingRes(int i4) {
        Message obtainMessage = this.f46806i.obtainMessage();
        obtainMessage.what = HandleId.SET_FAILED_RELOADING_RES.ordinal();
        obtainMessage.arg1 = i4;
        obtainMessage.sendToTarget();
    }

    public void setListener(e eVar) {
        this.f46807j = eVar;
    }

    public void setReloadingVisibility(int i4) {
        Message obtainMessage = this.f46806i.obtainMessage();
        obtainMessage.what = HandleId.SET_RELOADING_VISIBILITY.ordinal();
        obtainMessage.arg1 = i4;
        obtainMessage.sendToTarget();
    }

    public CustomLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46805h = 1;
        m(context);
    }

    public CustomLoadingView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f46805h = 1;
        m(context);
    }
}
