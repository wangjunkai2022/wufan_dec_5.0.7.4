package com.join.mgps.fragment;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.item_shop_fragment)
/* loaded from: classes3.dex */
public class MyShopFragment extends Fragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RadioButton f52359b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    RadioButton f52360c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    RadioButton f52361d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    RadioButton f52362e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f52363f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f52364g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f52365h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f52366i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    FrameLayout f52367j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    RelativeLayout f52368k;

    /* renamed from: l  reason: collision with root package name */
    RecommedFragment f52369l;

    /* renamed from: m  reason: collision with root package name */
    RecommedFragment f52370m;

    /* renamed from: n  reason: collision with root package name */
    RecommedFragment f52371n;

    /* renamed from: o  reason: collision with root package name */
    RecommedFragment f52372o;

    /* renamed from: p  reason: collision with root package name */
    RecommedFragment f52373p;

    /* renamed from: q  reason: collision with root package name */
    String f52374q;

    /* renamed from: r  reason: collision with root package name */
    int f52375r;

    public void V() {
        RecommedFragment recommedFragment = this.f52369l;
        if (recommedFragment != null) {
            recommedFragment.t0();
        }
    }

    void W(FragmentTransaction fragmentTransaction) {
        RecommedFragment recommedFragment = this.f52369l;
        if (recommedFragment != null) {
            fragmentTransaction.hide(recommedFragment);
        }
        RecommedFragment recommedFragment2 = this.f52370m;
        if (recommedFragment2 != null) {
            fragmentTransaction.hide(recommedFragment2);
        }
        RecommedFragment recommedFragment3 = this.f52371n;
        if (recommedFragment3 != null) {
            fragmentTransaction.hide(recommedFragment3);
        }
        RecommedFragment recommedFragment4 = this.f52372o;
        if (recommedFragment4 != null) {
            fragmentTransaction.hide(recommedFragment4);
        }
        RecommedFragment recommedFragment5 = this.f52373p;
        if (recommedFragment5 != null) {
            fragmentTransaction.hide(recommedFragment5);
        }
    }

    void X() {
        if (this.f52375r == 3) {
            this.f52359b.setTextColor(getResources().getColor(R.color.white));
            this.f52360c.setTextColor(getResources().getColor(R.color.white));
            this.f52362e.setTextColor(getResources().getColor(R.color.white));
            this.f52361d.setTextColor(getResources().getColor(R.color.white));
            this.f52359b.setBackgroundDrawable(getResources().getDrawable(R.drawable.archive_tab_nor_bg));
            this.f52360c.setBackgroundDrawable(getResources().getDrawable(R.drawable.archive_tab_nor_bg));
            this.f52362e.setBackgroundDrawable(getResources().getDrawable(R.drawable.archive_tab_nor_bg));
            this.f52361d.setBackgroundDrawable(getResources().getDrawable(R.drawable.archive_tab_nor_bg));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void Z() {
        X();
        this.f52360c.setTextColor(getResources().getColor(R.color.main_bar_color));
        this.f52360c.setBackgroundDrawable(getResources().getDrawable(R.drawable.archive_tab_bg));
        h0(3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void a0() {
        if (AccountUtil_.getInstance_(getContext()).getAccountData() != null && AccountUtil_.getInstance_(getContext()).getAccountData().getUid() != 0 && !AccountUtil_.getInstance_(getContext()).isTourist()) {
            X();
            this.f52362e.setTextColor(getResources().getColor(R.color.main_bar_color));
            this.f52362e.setBackgroundDrawable(getResources().getDrawable(R.drawable.archive_tab_bg));
            h0(4);
            return;
        }
        IntentUtil.getInstance().goLogin(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterView() {
        this.f52374q = getArguments().getString("gameid");
        this.f52375r = getArguments().getInt("type");
        this.f52359b.setChecked(true);
        X();
        this.f52359b.setTextColor(getResources().getColor(R.color.main_bar_color));
        this.f52359b.setBackgroundDrawable(getResources().getDrawable(R.drawable.archive_tab_bg));
        if (this.f52375r == 3) {
            this.f52368k.setVisibility(0);
            h0(1);
            return;
        }
        com.wufan.user.service.protobuf.n0 n0Var = com.join.mgps.rpc.h.N;
        if (n0Var != null && n0Var.getUid() != 0 && !AccountUtil_.getInstance_(getActivity()).isTourist()) {
            this.f52368k.setVisibility(8);
            h0(5);
            return;
        }
        IntentUtil.getInstance().goLogin(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void b0() {
        X();
        this.f52361d.setTextColor(getResources().getColor(R.color.main_bar_color));
        this.f52361d.setBackgroundDrawable(getResources().getDrawable(R.drawable.archive_tab_bg));
        h0(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void c0() {
        X();
        this.f52359b.setTextColor(getResources().getColor(R.color.main_bar_color));
        this.f52359b.setBackgroundDrawable(getResources().getDrawable(R.drawable.archive_tab_bg));
        h0(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void d0() {
        X();
        this.f52360c.setTextColor(getResources().getColor(R.color.main_bar_color));
        this.f52360c.setBackgroundDrawable(getResources().getDrawable(R.drawable.archive_tab_bg));
        h0(3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void e0() {
        if (AccountUtil_.getInstance_(getContext()).getAccountData() != null && AccountUtil_.getInstance_(getContext()).getAccountData().getUid() != 0 && !AccountUtil_.getInstance_(getContext()).isTourist()) {
            X();
            this.f52362e.setBackgroundDrawable(getResources().getDrawable(R.drawable.archive_tab_bg));
            this.f52362e.setTextColor(getResources().getColor(R.color.main_bar_color));
            h0(4);
            return;
        }
        IntentUtil.getInstance().goLogin(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void f0() {
        X();
        this.f52361d.setTextColor(getResources().getColor(R.color.main_bar_color));
        this.f52361d.setBackgroundDrawable(getResources().getDrawable(R.drawable.archive_tab_bg));
        h0(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        X();
        this.f52359b.setBackgroundDrawable(getResources().getDrawable(R.drawable.archive_tab_bg));
        this.f52359b.setTextColor(getResources().getColor(R.color.main_bar_color));
        h0(1);
    }

    void h0(int i4) {
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        W(beginTransaction);
        Bundle bundle = new Bundle();
        if (i4 == 1) {
            bundle.putInt("type", 1);
            bundle.putInt("typeIndex", this.f52375r);
            bundle.putString("gameid", this.f52374q);
            RecommedFragment recommedFragment = this.f52369l;
            if (recommedFragment == null) {
                RecommedFragment_ recommedFragment_ = new RecommedFragment_();
                this.f52369l = recommedFragment_;
                recommedFragment_.setArguments(bundle);
                beginTransaction.add(R.id.frag_shop, this.f52369l);
            } else {
                beginTransaction.show(recommedFragment);
            }
        } else if (i4 == 2) {
            bundle.putInt("type", 2);
            bundle.putString("gameid", this.f52374q);
            bundle.putInt("typeIndex", this.f52375r);
            RecommedFragment recommedFragment2 = this.f52370m;
            if (recommedFragment2 == null) {
                RecommedFragment_ recommedFragment_2 = new RecommedFragment_();
                this.f52370m = recommedFragment_2;
                recommedFragment_2.setArguments(bundle);
                beginTransaction.add(R.id.frag_shop, this.f52370m);
            } else {
                beginTransaction.show(recommedFragment2);
            }
        } else if (i4 == 3) {
            bundle.putInt("type", 3);
            bundle.putString("gameid", this.f52374q);
            bundle.putInt("typeIndex", this.f52375r);
            RecommedFragment recommedFragment3 = this.f52371n;
            if (recommedFragment3 == null) {
                RecommedFragment_ recommedFragment_3 = new RecommedFragment_();
                this.f52371n = recommedFragment_3;
                recommedFragment_3.setArguments(bundle);
                beginTransaction.add(R.id.frag_shop, this.f52371n);
            } else {
                beginTransaction.show(recommedFragment3);
            }
        } else if (i4 == 4) {
            com.wufan.user.service.protobuf.n0 n0Var = com.join.mgps.rpc.h.N;
            if (n0Var != null && n0Var.getUid() != 0 && !AccountUtil_.getInstance_(getActivity()).isTourist()) {
                bundle.putInt("type", 4);
                bundle.putString("gameid", this.f52374q);
                bundle.putInt("typeIndex", this.f52375r);
                RecommedFragment recommedFragment4 = this.f52372o;
                if (recommedFragment4 == null) {
                    RecommedFragment_ recommedFragment_4 = new RecommedFragment_();
                    this.f52372o = recommedFragment_4;
                    recommedFragment_4.setArguments(bundle);
                    beginTransaction.add(R.id.frag_shop, this.f52372o);
                } else {
                    beginTransaction.show(recommedFragment4);
                }
            } else {
                IntentUtil.getInstance().goLogin(getActivity());
                return;
            }
        } else {
            com.wufan.user.service.protobuf.n0 n0Var2 = com.join.mgps.rpc.h.N;
            if (n0Var2 != null && n0Var2.getUid() != 0 && !AccountUtil_.getInstance_(getActivity()).isTourist()) {
                bundle.putInt("type", 1);
                bundle.putString("gameid", this.f52374q);
                bundle.putInt("typeIndex", this.f52375r);
                RecommedFragment recommedFragment5 = this.f52373p;
                if (recommedFragment5 == null) {
                    RecommedFragment_ recommedFragment_5 = new RecommedFragment_();
                    this.f52373p = recommedFragment_5;
                    recommedFragment_5.setArguments(bundle);
                    beginTransaction.add(R.id.frag_shop, this.f52373p);
                } else {
                    beginTransaction.show(recommedFragment5);
                }
            } else {
                IntentUtil.getInstance().goLogin(getActivity());
                return;
            }
        }
        beginTransaction.commitAllowingStateLoss();
    }

    void i0(int i4) {
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        W(beginTransaction);
        Bundle bundle = new Bundle();
        if (i4 == 1) {
            bundle.putInt("type", 1);
            bundle.putInt("typeIndex", this.f52375r);
            bundle.putString("gameid", this.f52374q);
            RecommedFragment recommedFragment = this.f52373p;
            if (recommedFragment == null) {
                RecommedFragment_ recommedFragment_ = new RecommedFragment_();
                this.f52373p = recommedFragment_;
                recommedFragment_.setArguments(bundle);
                beginTransaction.add(R.id.frag_shop, this.f52373p);
            } else {
                beginTransaction.show(recommedFragment);
            }
        }
        beginTransaction.commitAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        RecommedFragment recommedFragment;
        super.onHiddenChanged(z4);
        if (z4) {
            return;
        }
        if (this.f52375r == 4 && this.f52373p != null) {
            com.wufan.user.service.protobuf.n0 n0Var = com.join.mgps.rpc.h.N;
            if (n0Var != null && n0Var.getUid() != 0 && !AccountUtil_.getInstance_(getActivity()).isTourist()) {
                this.f52373p.s0();
            } else {
                IntentUtil.getInstance().goLogin(getActivity());
                return;
            }
        }
        if (this.f52375r != 3 || (recommedFragment = this.f52369l) == null) {
            return;
        }
        recommedFragment.r0();
    }
}
