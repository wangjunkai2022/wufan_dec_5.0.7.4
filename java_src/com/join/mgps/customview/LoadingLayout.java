package com.join.mgps.customview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
/* loaded from: classes4.dex */
public class LoadingLayout extends RelativeLayout implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private TextView f47339b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f47340c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f47341d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f47342e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f47343f;

    /* renamed from: g  reason: collision with root package name */
    private LinearLayout f47344g;

    /* renamed from: h  reason: collision with root package name */
    private LinearLayout f47345h;

    /* renamed from: i  reason: collision with root package name */
    private LinearLayout f47346i;

    /* renamed from: j  reason: collision with root package name */
    private LinearLayout f47347j;

    /* renamed from: k  reason: collision with root package name */
    private ImageView f47348k;

    /* renamed from: l  reason: collision with root package name */
    private b f47349l;

    /* renamed from: m  reason: collision with root package name */
    private a f47350m;

    /* loaded from: classes4.dex */
    public interface a {
        void noDataCallBack();
    }

    /* loaded from: classes4.dex */
    public interface b {
        void callBack();
    }

    public LoadingLayout(Context context) {
        super(context);
    }

    public void a(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        View childAt = viewGroup.getChildAt(0);
        viewGroup.removeView(childAt);
        addView(childAt, 0);
        viewGroup.addView(this);
    }

    public void b(View view, int i4) {
        try {
            View findViewById = view.findViewById(i4);
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            if (viewGroup != null) {
                int i5 = 0;
                while (true) {
                    if (i5 >= viewGroup.getChildCount()) {
                        break;
                    } else if (viewGroup.getChildAt(i5).getId() == i4) {
                        viewGroup.removeView(findViewById);
                        viewGroup.addView(this, i5, findViewById.getLayoutParams());
                        break;
                    } else {
                        i5++;
                    }
                }
                addView(findViewById, 0);
                return;
            }
            throw new Exception("the view must has a parent");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void c(View view, int i4) {
        try {
            View findViewById = view.findViewById(i4);
            if (findViewById == null) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            if (viewGroup == null) {
                addView(findViewById, 0);
                return;
            }
            int i5 = 0;
            while (true) {
                if (i5 >= viewGroup.getChildCount()) {
                    break;
                } else if (viewGroup.getChildAt(i5).getId() == i4) {
                    viewGroup.removeView(findViewById);
                    viewGroup.addView(this, i5, findViewById.getLayoutParams());
                    break;
                } else {
                    i5++;
                }
            }
            addView(findViewById, 0);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void d() {
        this.f47344g.setVisibility(8);
        this.f47345h.setVisibility(8);
        this.f47346i.setVisibility(8);
        this.f47347j.setVisibility(8);
    }

    public boolean e() {
        return this.f47344g.getVisibility() == 8;
    }

    public void f(int i4) {
        this.f47348k.setVisibility(i4);
    }

    public void g() {
        d();
        this.f47345h.setVisibility(0);
    }

    public void h() {
        d();
        this.f47344g.setVisibility(0);
    }

    public void i() {
        d();
        this.f47346i.setVisibility(0);
    }

    public void j() {
        d();
        this.f47347j.setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.relodingimag /* 2131300620 */:
                b bVar = this.f47349l;
                if (bVar != null) {
                    bVar.callBack();
                    return;
                }
                return;
            case R.id.setAll /* 2131300960 */:
                a aVar = this.f47350m;
                if (aVar != null) {
                    aVar.noDataCallBack();
                    return;
                }
                return;
            case R.id.setNetwork /* 2131300961 */:
                UtilsMy.w3(getContext());
                return;
            default:
                return;
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        findViewById(R.id.setNetwork).setOnClickListener(this);
        findViewById(R.id.relodingimag).setOnClickListener(this);
        this.f47339b = (TextView) findViewById(R.id.failedMessage);
        this.f47344g = (LinearLayout) findViewById(R.id.loding_layout);
        this.f47347j = (LinearLayout) findViewById(R.id.nodata_layout);
        this.f47345h = (LinearLayout) findViewById(R.id.loding_faile);
        this.f47346i = (LinearLayout) findViewById(R.id.loading_none);
        this.f47348k = (ImageView) findViewById(R.id.noneReloadImage);
        this.f47340c = (TextView) findViewById(R.id.noneMessage);
        this.f47341d = (TextView) findViewById(R.id.setAll);
        this.f47343f = (TextView) findViewById(R.id.textView2);
        this.f47342e = (TextView) findViewById(R.id.textView_nodata);
        this.f47341d.setOnClickListener(this);
        this.f47344g.setOnClickListener(null);
        this.f47345h.setOnClickListener(null);
        this.f47346i.setOnClickListener(null);
    }

    public void setFailLayoutBgAlpha(float f5) {
        this.f47345h.setAlpha(f5);
    }

    public void setFailedMessage(String str) {
        this.f47339b.setText(str);
    }

    public void setLoadingHintMsg(String str) {
        this.f47343f.setText(str);
    }

    public void setLoadingLayoutBGColor(int i4) {
        this.f47344g.setBackgroundColor(i4);
    }

    public void setLoadingLayoutBgAlpha(float f5) {
        this.f47344g.setAlpha(f5);
    }

    public void setLoadingLayoutMarginTop(int i4) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f47344g.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f47345h.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f47345h.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f47345h.getLayoutParams();
        layoutParams.topMargin = i4;
        layoutParams2.topMargin = i4;
        layoutParams3.topMargin = i4;
        layoutParams4.topMargin = i4;
        this.f47344g.setLayoutParams(layoutParams);
        this.f47345h.setLayoutParams(layoutParams2);
        this.f47347j.setLayoutParams(layoutParams4);
        this.f47346i.setLayoutParams(layoutParams3);
    }

    public void setNoDataAll(String str) {
        this.f47341d.setText(str);
    }

    public void setNoDataCallBackListener(a aVar) {
        this.f47350m = aVar;
    }

    public void setNoDataImage(int i4) {
        this.f47348k.setImageResource(i4);
    }

    public void setNoDataMsg(String str) {
        this.f47340c.setText(str);
    }

    public void setRefreshCallBackListener(b bVar) {
        this.f47349l = bVar;
    }

    public void setTextViewNoData(String str) {
        this.f47342e.setText(str);
    }

    public LoadingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setNoDataImage(Bitmap bitmap) {
        this.f47348k.setImageBitmap(bitmap);
    }

    public LoadingLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
