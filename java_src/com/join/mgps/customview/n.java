package com.join.mgps.customview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.ModGameIndexActivity_;
/* compiled from: ModStandInstallPopupWindow.java */
/* loaded from: classes4.dex */
public class n extends p implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    SimpleDraweeView f48578b;

    /* renamed from: c  reason: collision with root package name */
    TextView f48579c;

    /* renamed from: d  reason: collision with root package name */
    View f48580d;

    /* renamed from: e  reason: collision with root package name */
    View f48581e;

    /* renamed from: f  reason: collision with root package name */
    private String f48582f;

    /* renamed from: g  reason: collision with root package name */
    DownloadTask f48583g;

    /* renamed from: h  reason: collision with root package name */
    private String f48584h;

    public n(Context context) {
        super(context);
        init();
    }

    private void c() {
        if (APKUtils.L(this.f48583g)) {
            APKUtils.t(this.mContext, this.f48583g);
        } else if (com.join.android.app.common.utils.n.w() instanceof ModGameIndexActivity_) {
            Intent intent = new Intent(o1.a.f72025s0);
            intent.putExtra("from", "modStdDialog");
            this.mContext.sendBroadcast(intent);
        } else {
            ModGameIndexActivity_.o2(this.mContext).a("modStdDialog").b(this.f48582f).c(this.f48584h).start();
        }
    }

    public void a(View view, String str) {
        b(view, str, str);
    }

    public void b(View view, String str, String str2) {
        this.f48582f = str;
        this.f48584h = str2;
        showAtLocation(view, 80, 0, 0);
        this.f48584h = str;
        DownloadTask F = p1.f.K().F(str);
        this.f48583g = F;
        if (F == null) {
            return;
        }
        MyImageLoader.h(this.f48578b, F.getPortraitURL());
        this.f48579c.setText("是否重新安装标准模式至本地？");
    }

    void init() {
        View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.pop_mod_stand_install, (ViewGroup) null);
        this.parentView = inflate;
        setContentView(inflate);
        setWidth(-1);
        setHeight(-2);
        this.f48578b = (SimpleDraweeView) this.parentView.findViewById(R.id.icon);
        this.f48579c = (TextView) this.parentView.findViewById(R.id.name);
        this.f48580d = this.parentView.findViewById(R.id.install);
        this.f48581e = this.parentView.findViewById(R.id.cancel);
        this.f48580d.setOnClickListener(this);
        this.f48581e.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.install) {
            dismiss();
            c();
        } else if (id == R.id.cancel) {
            dismiss();
        }
    }
}
