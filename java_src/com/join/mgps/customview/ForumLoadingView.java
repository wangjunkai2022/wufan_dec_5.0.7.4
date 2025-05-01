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
public class ForumLoadingView extends RelativeLayout {

    /* renamed from: l  reason: collision with root package name */
    public static final int f47052l = 1;

    /* renamed from: m  reason: collision with root package name */
    public static final int f47053m = 2;

    /* renamed from: n  reason: collision with root package name */
    public static final int f47054n = 4;

    /* renamed from: o  reason: collision with root package name */
    public static final int f47055o = 9;

    /* renamed from: p  reason: collision with root package name */
    public static final int f47056p = 10;

    /* renamed from: q  reason: collision with root package name */
    public static final int f47057q = 16;

    /* renamed from: b  reason: collision with root package name */
    private Context f47058b;

    /* renamed from: c  reason: collision with root package name */
    private View f47059c;

    /* renamed from: d  reason: collision with root package name */
    private View f47060d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f47061e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f47062f;

    /* renamed from: g  reason: collision with root package name */
    private View f47063g;

    /* renamed from: h  reason: collision with root package name */
    private Button f47064h;

    /* renamed from: i  reason: collision with root package name */
    protected int f47065i;

    /* renamed from: j  reason: collision with root package name */
    private Handler f47066j;

    /* renamed from: k  reason: collision with root package name */
    private e f47067k;

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
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goWirelessSettings(view.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumLoadingView.this.f47067k != null) {
                ForumLoadingView.this.f47067k.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ForumLoadingView.this.f47067k != null) {
                ForumLoadingView.this.f47067k.a(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d extends Handler {
        d() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                int i4 = message.what;
                if (i4 == HandleId.LOADING.ordinal()) {
                    ForumLoadingView.this.n();
                } else if (i4 == HandleId.LOADING_FAILED.ordinal()) {
                    ForumLoadingView.this.o();
                } else if (i4 == HandleId.LOADING_SUCCESS.ordinal()) {
                    ForumLoadingView.this.p(true);
                } else if (i4 == HandleId.SET_FAILED_IMG_VISIBILITY.ordinal()) {
                    ForumLoadingView.this.setFailedImgVisibilityP(message.arg1);
                } else if (i4 == HandleId.SET_RELOADING_VISIBILITY.ordinal()) {
                    ForumLoadingView.this.setReloadingVisibilityP(message.arg1);
                } else if (i4 == HandleId.SET_FAILED_IMG_RES.ordinal()) {
                    ForumLoadingView.this.setFailedImgResP(message.arg1);
                } else if (i4 == HandleId.SET_FAILED_RELOADING_RES.ordinal()) {
                    ForumLoadingView.this.setFailedReloadingResP(message.arg1);
                } else if (i4 == HandleId.SET_FAILED_MSG.ordinal()) {
                    ForumLoadingView.this.setFailedMsgP((String) message.obj);
                }
                ForumLoadingView.this.invalidate();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        ForumLoadingView f47072a;

        public e(ForumLoadingView forumLoadingView) {
            this.f47072a = forumLoadingView;
        }

        public void a(View view) {
            Context context = view.getContext();
            if (this.f47072a.getLoadingState() == 9) {
                IntentUtil.getInstance().goWirelessSettings(context);
            } else if (this.f47072a.getLoadingState() == 10) {
                com.join.mgps.Util.j0.E0(context);
            }
        }

        public void b() {
        }

        public void c(boolean z4) {
        }
    }

    public ForumLoadingView(Context context) {
        super(context);
        this.f47065i = 1;
        k(context);
    }

    private void k(Context context) {
        this.f47058b = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.loding_layout_include, (ViewGroup) null);
        this.f47059c = inflate.findViewById(R.id.loding_layout);
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.failed_layout_include, (ViewGroup) null);
        this.f47060d = inflate2.findViewById(R.id.loding_faile);
        this.f47061e = (ImageView) inflate2.findViewById(R.id.relodingimag);
        this.f47062f = (TextView) inflate2.findViewById(R.id.failedMessage);
        this.f47063g = inflate2.findViewById(R.id.lodingBackImage);
        this.f47064h = (Button) inflate2.findViewById(R.id.setNetwork);
        addView(inflate);
        addView(inflate2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        inflate.setLayoutParams(layoutParams);
        inflate2.setLayoutParams(layoutParams);
        this.f47059c.setVisibility(8);
        this.f47060d.setVisibility(8);
        this.f47064h.setOnClickListener(new a());
        this.f47061e.setOnClickListener(new b());
        this.f47064h.setOnClickListener(new c());
        this.f47066j = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        this.f47059c.setVisibility(0);
        this.f47060d.setVisibility(8);
        p(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        this.f47059c.setVisibility(8);
        this.f47060d.setVisibility(0);
        p(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(boolean z4) {
        int i4 = !z4 ? 8 : 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt != this.f47059c && childAt != this.f47060d) {
                childAt.setVisibility(i4);
            } else if (z4) {
                childAt.setVisibility(8);
            }
        }
        e eVar = this.f47067k;
        if (eVar != null) {
            eVar.c(z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailedImgResP(int i4) {
        if (i4 == 9) {
            return;
        }
        try {
            if (i4 == 10) {
                this.f47064h.setText("点击查看相关帖子");
            } else {
                this.f47064h.setText("");
                this.f47064h.setBackgroundResource(i4);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailedImgVisibilityP(int i4) {
        int i5 = i4 == 0 ? 0 : 8;
        this.f47063g.setVisibility(i5);
        this.f47064h.setVisibility(i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailedMsgP(String str) {
        TextView textView = this.f47062f;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailedReloadingResP(int i4) {
        try {
            this.f47061e.setImageResource(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReloadingVisibilityP(int i4) {
        this.f47061e.setVisibility(i4 != 8 ? 0 : 8);
    }

    public int getLoadingState() {
        return this.f47065i;
    }

    public void j(int i4) {
        setFailedImgVisibility(0);
        setReloadingVisibility(0);
        int i5 = this.f47065i;
        if (i5 == 2) {
            return;
        }
        if (i4 == 2) {
            this.f47065i = 2;
        } else if (i4 == 1) {
            this.f47065i = 1;
        } else if (i4 == 9) {
            this.f47065i = 9;
            setFailedMsg("网络连接失败，再试试吧~");
            setFailedImgRes(9);
        } else if (i4 == 10) {
            this.f47065i = 10;
            setReloadingVisibility(8);
            setFailedImgRes(10);
        } else {
            if ((i4 & 16) == 16) {
                this.f47065i = i4 | i5;
            } else {
                this.f47065i = i4 | i5;
            }
            setFailedMsg("加载失败，再试试吧~");
            setFailedImgVisibility(8);
        }
        int i6 = this.f47065i;
        char c5 = i6 == 1 ? (char) 1 : i6 == 2 ? (char) 2 : (char) 4;
        Message obtainMessage = this.f47066j.obtainMessage();
        if (c5 == 1) {
            obtainMessage.what = HandleId.LOADING.ordinal();
        } else if (c5 == 2) {
            obtainMessage.what = HandleId.LOADING_SUCCESS.ordinal();
        } else if (c5 == 4) {
            obtainMessage.what = HandleId.LOADING_FAILED.ordinal();
        }
        obtainMessage.sendToTarget();
    }

    public boolean l() {
        return this.f47065i == 2;
    }

    public void m() {
        if (this.f47065i != 1) {
            this.f47065i = 1;
        }
    }

    public void setFailedImgRes(int i4) {
        Message obtainMessage = this.f47066j.obtainMessage();
        obtainMessage.what = HandleId.SET_FAILED_IMG_RES.ordinal();
        obtainMessage.arg1 = i4;
        obtainMessage.sendToTarget();
    }

    public void setFailedImgVisibility(int i4) {
        Message obtainMessage = this.f47066j.obtainMessage();
        obtainMessage.what = HandleId.SET_FAILED_IMG_VISIBILITY.ordinal();
        obtainMessage.arg1 = i4;
        obtainMessage.sendToTarget();
    }

    public void setFailedMsg(String str) {
        Message obtainMessage = this.f47066j.obtainMessage();
        obtainMessage.what = HandleId.SET_FAILED_MSG.ordinal();
        obtainMessage.obj = str;
        obtainMessage.sendToTarget();
    }

    public void setFailedReloadingRes(int i4) {
        Message obtainMessage = this.f47066j.obtainMessage();
        obtainMessage.what = HandleId.SET_FAILED_RELOADING_RES.ordinal();
        obtainMessage.arg1 = i4;
        obtainMessage.sendToTarget();
    }

    public void setListener(e eVar) {
        this.f47067k = eVar;
    }

    public void setReloadingVisibility(int i4) {
        Message obtainMessage = this.f47066j.obtainMessage();
        obtainMessage.what = HandleId.SET_RELOADING_VISIBILITY.ordinal();
        obtainMessage.arg1 = i4;
        obtainMessage.sendToTarget();
    }

    public ForumLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47065i = 1;
        k(context);
    }

    public ForumLoadingView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47065i = 1;
        k(context);
    }
}
