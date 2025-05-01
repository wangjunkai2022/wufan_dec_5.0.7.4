package com.join.mgps.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.BaseActivity;
import com.join.android.app.mgsim.wufun.R;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.video_setting_activity)
/* loaded from: classes4.dex */
public class VideoSettingActivity extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f38373b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    View f38374c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    View f38375d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    View f38376e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    ImageView f38377f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ImageView f38378g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    ImageView f38379h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    View f38380i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    View f38381j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    View f38382k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    ImageView f38383l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    ImageView f38384m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    ImageView f38385n;

    private void j0() {
        this.f38377f.setBackgroundResource(R.drawable.alph);
        this.f38378g.setBackgroundResource(R.drawable.alph);
        this.f38379h.setBackgroundResource(R.drawable.alph);
        this.f38383l.setBackgroundResource(R.drawable.alph);
        this.f38384m.setBackgroundResource(R.drawable.alph);
        this.f38385n.setBackgroundResource(R.drawable.alph);
        int e5 = com.join.mgps.pref.h.n(this).e();
        int z4 = com.join.mgps.pref.h.n(this).z();
        if (e5 == 0) {
            this.f38377f.setBackgroundResource(R.drawable.icon_choice_1);
        } else if (e5 == 1) {
            this.f38378g.setBackgroundResource(R.drawable.icon_choice_1);
        } else if (e5 == 2) {
            this.f38379h.setBackgroundResource(R.drawable.icon_choice_1);
        }
        if (z4 == 0) {
            this.f38383l.setBackgroundResource(R.drawable.icon_choice_1);
        } else if (z4 == 1) {
            this.f38384m.setBackgroundResource(R.drawable.icon_choice_1);
        } else if (z4 != 2) {
        } else {
            this.f38385n.setBackgroundResource(R.drawable.icon_choice_1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f38373b.setText("视频播放设置");
        j0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        com.join.mgps.pref.h.n(this).n0(0);
        j0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h0() {
        com.join.mgps.pref.h.n(this).n0(2);
        j0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        com.join.mgps.pref.h.n(this).n0(1);
        j0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void k0() {
        com.join.mgps.pref.h.n(this).T(0);
        j0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l0() {
        com.join.mgps.pref.h.n(this).T(2);
        j0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void m0() {
        com.join.mgps.pref.h.n(this).T(1);
        j0();
    }
}
