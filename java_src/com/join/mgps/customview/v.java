package com.join.mgps.customview;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.q1;
import com.join.mgps.Util.w1;
import com.join.mgps.enums.Dtype;
/* compiled from: MyGameGameOperatePopupWindow.java */
/* loaded from: classes4.dex */
public class v extends p implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    View f48807b;

    /* renamed from: c  reason: collision with root package name */
    View f48808c;

    /* renamed from: d  reason: collision with root package name */
    View f48809d;

    /* renamed from: e  reason: collision with root package name */
    View f48810e;

    /* renamed from: f  reason: collision with root package name */
    View f48811f;

    /* renamed from: g  reason: collision with root package name */
    View f48812g;

    /* renamed from: h  reason: collision with root package name */
    View f48813h;

    /* renamed from: i  reason: collision with root package name */
    View f48814i;

    /* renamed from: j  reason: collision with root package name */
    View f48815j;

    /* renamed from: k  reason: collision with root package name */
    View f48816k;

    /* renamed from: l  reason: collision with root package name */
    View f48817l;

    /* renamed from: m  reason: collision with root package name */
    private String f48818m;

    /* renamed from: n  reason: collision with root package name */
    a f48819n;

    /* compiled from: MyGameGameOperatePopupWindow.java */
    /* loaded from: classes4.dex */
    public interface a {
        void a(String str);

        void b(String str);

        void c(String str);

        void d(String str);

        void e(String str);
    }

    public v(Context context) {
        super(context);
        init();
    }

    public a a() {
        return this.f48819n;
    }

    public void b(a aVar) {
        this.f48819n = aVar;
    }

    public void c(View view, String str) {
        d(view, str, false, false);
    }

    public void d(View view, String str, boolean z4, boolean z5) {
        showAtLocation(view, 80, 0, 0);
        this.f48818m = str;
        if (z4) {
            this.f48809d.setVisibility(0);
            this.f48817l.setVisibility(0);
        } else {
            this.f48809d.setVisibility(8);
            this.f48817l.setVisibility(8);
        }
        DownloadTask F = p1.f.K().F(str);
        if (F == null) {
            this.f48808c.setVisibility(8);
            this.f48816k.setVisibility(8);
        } else if (F.getStatus() == 5 || F.getStatus() == 9) {
            if (q1.f(F.getPackageName())) {
                this.f48807b.setVisibility(8);
            } else {
                this.f48807b.setVisibility(0);
            }
            DownloadTask F2 = p1.f.K().F(F.getCrc_link_type_val());
            boolean z6 = true;
            if ((F2 == null || !F2.getUrl().endsWith(".apk")) && !"androidobb".equals(F2.getRomType()) && !"46".equals(F2.getRomType())) {
                this.f48812g.setVisibility(0);
                this.f48811f.setVisibility(0);
            } else {
                String url = F2.getUrl();
                url.substring(url.lastIndexOf(net.lingala.zip4j.util.e.F0) + 1).replace(".apk", "").toCharArray();
                String packageName = F2.getPackageName();
                if (!g2.h(packageName) && com.join.mgps.Util.g.e(this.mContext, packageName) && g2.i(F.getTips()) && !F.getTips().contains("网游")) {
                    this.f48812g.setVisibility(0);
                    this.f48811f.setVisibility(0);
                } else if ((APKUtils.G(F) && !w1.d(this.mContext, F.getRef_crc_sign_id())) || F.isMiniGame()) {
                    this.f48812g.setVisibility(0);
                    this.f48811f.setVisibility(0);
                } else {
                    this.f48812g.setVisibility(8);
                    this.f48811f.setVisibility(8);
                }
            }
            if (z5 && this.f48812g.getVisibility() == 0) {
                this.f48812g.setVisibility(8);
                this.f48811f.setVisibility(8);
            }
            if (APKUtils.L(F)) {
                if (!com.join.android.app.common.utils.e.l0(this.mContext).e(this.mContext, F.getPackageName(), APKUtils.DEVICE_TYPE.REAL) && F.getCost_type() != 1) {
                    if (!F.getRomType().equals(Dtype.androidobb.name()) && !F.getRomType().equals(Dtype.androiddata.name()) && !F.getRomType().equals(Dtype.androidobbdata.name())) {
                        z6 = false;
                    }
                    if (Build.VERSION.SDK_INT >= 30 && z6) {
                        this.f48814i.setVisibility(8);
                        this.f48813h.setVisibility(8);
                    } else {
                        this.f48814i.setVisibility(0);
                        this.f48813h.setVisibility(0);
                    }
                } else {
                    this.f48814i.setVisibility(8);
                    this.f48813h.setVisibility(8);
                }
                this.f48813h.setOnClickListener(this);
            }
        }
    }

    void init() {
        View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.pop_my_game_operate, (ViewGroup) null);
        this.parentView = inflate;
        setContentView(inflate);
        setWidth(-1);
        setHeight(-2);
        this.f48807b = this.parentView.findViewById(R.id.detail);
        this.f48808c = this.parentView.findViewById(R.id.delete);
        this.f48809d = this.parentView.findViewById(R.id.deleteArchieve);
        this.f48810e = this.parentView.findViewById(R.id.cancel);
        this.f48812g = this.parentView.findViewById(R.id.addShortcut);
        this.f48811f = this.parentView.findViewById(R.id.line);
        this.f48813h = this.parentView.findViewById(R.id.tv_stand_mode);
        this.f48814i = this.parentView.findViewById(R.id.v_line_1);
        this.f48815j = this.parentView.findViewById(R.id.lineDetail);
        this.f48816k = this.parentView.findViewById(R.id.lineDeleteGame);
        this.f48817l = this.parentView.findViewById(R.id.lineDeleteArchieve);
        this.f48807b.setOnClickListener(this);
        this.f48808c.setOnClickListener(this);
        this.f48809d.setOnClickListener(this);
        this.f48810e.setOnClickListener(this);
        this.f48812g.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.detail) {
            a aVar = this.f48819n;
            if (aVar != null) {
                aVar.a(this.f48818m);
            }
            dismiss();
        } else if (id == R.id.delete) {
            a aVar2 = this.f48819n;
            if (aVar2 != null) {
                aVar2.c(this.f48818m);
            }
            dismiss();
        } else if (id == R.id.deleteArchieve) {
            a aVar3 = this.f48819n;
            if (aVar3 != null) {
                aVar3.e(this.f48818m);
            }
            dismiss();
        } else if (id == R.id.cancel) {
            dismiss();
        } else if (id == R.id.addShortcut) {
            a aVar4 = this.f48819n;
            if (aVar4 != null) {
                aVar4.b(this.f48818m);
            }
            dismiss();
        } else if (id == R.id.tv_stand_mode) {
            dismiss();
            a aVar5 = this.f48819n;
            if (aVar5 != null) {
                aVar5.d(this.f48818m);
            }
        }
    }
}
