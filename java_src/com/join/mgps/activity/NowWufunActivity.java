package com.join.mgps.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.BaseFragmentActivity;
import com.join.android.app.mgsim.wufun.R;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.now_wufun_activity_layout)
/* loaded from: classes4.dex */
public class NowWufunActivity extends BaseFragmentActivity {
    @Extra

    /* renamed from: b  reason: collision with root package name */
    int f36159b = 0;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    FrameLayout f36160c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f36161d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f36162e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f36163f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f36164g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f36165h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f36166i;

    /* renamed from: j  reason: collision with root package name */
    NowWufunFragment_ f36167j;

    /* renamed from: k  reason: collision with root package name */
    NowWufunFragment_ f36168k;

    /* renamed from: l  reason: collision with root package name */
    FragmentManager f36169l;

    private void g0(int i4) {
        h0(this.f36162e);
        h0(this.f36163f);
        h0(this.f36164g);
        h0(this.f36165h);
        h0(this.f36166i);
        if (i4 == 0) {
            m0(this.f36162e);
        } else if (i4 == 1) {
            m0(this.f36163f);
        } else if (i4 == 2) {
            m0(this.f36164g);
        } else if (i4 == 3) {
            m0(this.f36165h);
        } else if (i4 != 4) {
        } else {
            m0(this.f36166i);
        }
    }

    private void h0(TextView textView) {
        textView.setTextColor(Color.parseColor("#696969"));
        textView.setBackgroundResource(R.drawable.now_wufun_tab_back);
    }

    private void j0(FragmentTransaction fragmentTransaction) {
        NowWufunFragment_ nowWufunFragment_ = this.f36167j;
        if (nowWufunFragment_ != null) {
            fragmentTransaction.hide(nowWufunFragment_);
        }
        NowWufunFragment_ nowWufunFragment_2 = this.f36168k;
        if (nowWufunFragment_2 != null) {
            fragmentTransaction.hide(nowWufunFragment_2);
        }
    }

    private void m0(TextView textView) {
        textView.setTextColor(-1);
        textView.setBackgroundResource(R.drawable.now_wufun_tab_back_selected);
    }

    private void selectTab(int i4) {
        g0(i4);
        FragmentTransaction beginTransaction = this.f36169l.beginTransaction();
        j0(beginTransaction);
        if (i4 == 0) {
            Fragment fragment = this.f36167j;
            if (fragment == null) {
                NowWufunFragment_ nowWufunFragment_ = new NowWufunFragment_();
                this.f36167j = nowWufunFragment_;
                beginTransaction.add(R.id.fragmentLayout, nowWufunFragment_);
            } else {
                beginTransaction.show(fragment);
            }
        } else if (i4 == 4) {
            Fragment fragment2 = this.f36168k;
            if (fragment2 == null) {
                this.f36168k = new NowWufunFragment_();
                Bundle bundle = new Bundle();
                bundle.putInt("type", 2);
                this.f36168k.setArguments(bundle);
                beginTransaction.add(R.id.fragmentLayout, this.f36168k);
            } else {
                beginTransaction.show(fragment2);
            }
        }
        beginTransaction.commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        this.f36161d.setText("今日悟饭");
        this.f36169l = getSupportFragmentManager();
        selectTab(this.f36159b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void f0() {
        selectTab(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        selectTab(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.intent.nowwufun.everdaytab"})
    public void k0(Intent intent) {
        selectTab(3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l0() {
        selectTab(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void n0() {
        selectTab(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void o0() {
        selectTab(3);
    }
}
