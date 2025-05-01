package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentTransaction;
import com.BaseFragmentActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GameDiscoverBean;
import com.join.mgps.dto.GameDiscoverMainBean;
import com.join.mgps.dto.GameDiscoverMessageBean;
import com.join.mgps.fragment.CardViewPagerFragment;
import com.uc.crashsdk.export.LogType;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.discover_layout)
/* loaded from: classes4.dex */
public class GameDiscoverActivity extends BaseFragmentActivity implements com.join.mgps.pref.c {

    /* renamed from: b  reason: collision with root package name */
    private Context f32052b;

    /* renamed from: c  reason: collision with root package name */
    com.join.mgps.rpc.e f32053c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    FrameLayout f32054d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f32055e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f32056f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ImageView f32057g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    RelativeLayout f32058h;
    @Extra

    /* renamed from: i  reason: collision with root package name */
    ExtBean f32059i;

    /* renamed from: j  reason: collision with root package name */
    private int f32060j;

    /* renamed from: k  reason: collision with root package name */
    private CardViewPagerFragment f32061k;

    /* renamed from: l  reason: collision with root package name */
    private com.join.android.app.common.manager.b f32062l;

    /* renamed from: m  reason: collision with root package name */
    private int f32063m;

    public static int h0(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i4 = rect.top;
        if (i4 == 0) {
            try {
                Class<?> cls = Class.forName("com.android.internal.R$dimen");
                return activity.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
            } catch (ClassNotFoundException e5) {
                e5.printStackTrace();
                return i4;
            } catch (IllegalAccessException e6) {
                e6.printStackTrace();
                return i4;
            } catch (IllegalArgumentException e7) {
                e7.printStackTrace();
                return i4;
            } catch (InstantiationException e8) {
                e8.printStackTrace();
                return i4;
            } catch (NoSuchFieldException e9) {
                e9.printStackTrace();
                return i4;
            } catch (NumberFormatException e10) {
                e10.printStackTrace();
                return i4;
            } catch (SecurityException e11) {
                e11.printStackTrace();
                return i4;
            }
        }
        return i4;
    }

    private void k0() {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.getDecorView().setSystemUiVisibility(LogType.UNEXP_ANR);
            window.setStatusBarColor(0);
        }
        com.join.android.app.common.manager.b bVar = new com.join.android.app.common.manager.b(this);
        this.f32062l = bVar;
        bVar.m(true);
    }

    @Override // com.join.mgps.pref.c
    public void B(Bundle bundle) {
        if (bundle != null) {
            this.f32060j = bundle.getInt("CurrentPn");
            f0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        try {
            this.f32053c = com.join.mgps.rpc.impl.d.P1();
            this.f32052b = this;
            this.f32060j = 1;
            showLoading();
            f0();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void f0() {
        if (com.join.android.app.common.utils.j.j(this.f32052b)) {
            try {
                GameDiscoverMainBean J0 = this.f32053c.J0(g0(this.f32060j, 10, this.f32059i));
                if (J0 != null) {
                    GameDiscoverMessageBean messages = J0.getMessages();
                    if (messages != null) {
                        List<GameDiscoverBean> data = messages.getData();
                        if (data != null && data.size() > 0) {
                            m0(data);
                        } else {
                            l0();
                        }
                    } else {
                        l0();
                    }
                } else {
                    l0();
                }
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                l0();
                return;
            }
        }
        l0();
    }

    public CommonRequestBean g0(int i4, int i5, ExtBean extBean) {
        return RequestBeanUtil.getInstance(this.f32052b).getGameDiscoverRequestBean(i4, i5, extBean);
    }

    public com.join.android.app.common.manager.b i0() {
        return this.f32062l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0() {
        try {
            if (this.f32060j == 1) {
                LinearLayout linearLayout = this.f32055e;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                FrameLayout frameLayout = this.f32054d;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                LinearLayout linearLayout2 = this.f32056f;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                ImageView imageView = this.f32057g;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0(List<GameDiscoverBean> list) {
        try {
            if (this.f32061k == null) {
                this.f32061k = CardViewPagerFragment.h0();
            }
            this.f32055e.setVisibility(8);
            this.f32054d.setVisibility(0);
            this.f32056f.setVisibility(8);
            this.f32057g.setVisibility(8);
            if (this.f32060j == 1) {
                FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                this.f32061k.m0(list);
                beginTransaction.add(R.id.frameLayout, this.f32061k);
                try {
                    beginTransaction.commit();
                    return;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    return;
                }
            }
            this.f32061k.m0(list);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        showLoading();
        this.f32060j = 1;
        f0();
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        k0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f32052b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoading() {
        try {
            this.f32055e.setVisibility(0);
            this.f32054d.setVisibility(8);
            this.f32056f.setVisibility(8);
            this.f32057g.setVisibility(0);
            if (Build.VERSION.SDK_INT >= 21) {
                int applyDimension = (int) TypedValue.applyDimension(1, 46.0f, getResources().getDisplayMetrics());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(applyDimension, applyDimension);
                int h02 = h0(this) + ((int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics()));
                this.f32063m = h02;
                layoutParams.setMargins(0, h02, 0, 0);
                this.f32058h.setLayoutParams(layoutParams);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.mgps.pref.c
    public void y(Bundle bundle) {
        this.f32057g.setVisibility(8);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        k0();
    }
}
