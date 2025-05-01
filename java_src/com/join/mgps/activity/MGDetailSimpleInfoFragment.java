package com.join.mgps.activity;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ObservableWebView;
import com.join.mgps.dto.DetailResultBean;
import com.join.mgps.dto.TipBean;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.detail_simple_info_layout)
/* loaded from: classes4.dex */
public class MGDetailSimpleInfoFragment extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    String f34285b = MGDetailSimpleInfoFragment.class.getSimpleName();
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f34286c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ObservableWebView f34287d;

    /* renamed from: e  reason: collision with root package name */
    private Context f34288e;

    /* renamed from: f  reason: collision with root package name */
    private LinearLayout.LayoutParams f34289f;

    /* renamed from: g  reason: collision with root package name */
    private DetailResultBean f34290g;

    /* renamed from: h  reason: collision with root package name */
    float f34291h;

    /* renamed from: i  reason: collision with root package name */
    float f34292i;

    private void V(List<TipBean> list, LinearLayout linearLayout) {
        linearLayout.removeAllViews();
        for (TipBean tipBean : list) {
            TextView textView = new TextView(this.f34288e);
            textView.setLayoutParams(this.f34289f);
            textView.setGravity(17);
            textView.setText(tipBean.getName());
            textView.setTextColor(-1);
            textView.setPadding(0, 0, 0, 0);
            textView.setTextSize(this.f34288e.getResources().getDimensionPixelSize(R.dimen.main_detial_textsize));
            textView.setTextSize(10.0f);
            textView.setBackgroundDrawable(com.join.mgps.Util.k2.a(this.f34288e, tipBean.getColor()));
            linearLayout.addView(textView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterView() {
        this.f34288e = getActivity();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.f34289f = layoutParams;
        layoutParams.setMargins(getResources().getDimensionPixelSize(R.dimen.detail_tipsitem_magin), 0, getResources().getDimensionPixelSize(R.dimen.detail_tipsitem_magin), 0);
        DetailResultBean detailResultBean = (DetailResultBean) getArguments().getSerializable("simpleInfoData");
        this.f34290g = detailResultBean;
        V(detailResultBean.getTag_info(), this.f34286c);
        this.f34287d.getSettings().setDefaultTextEncodingName("utf-8");
        this.f34287d.loadData(this.f34290g.getDescribe(), "text/html;charset=UTF-8", "utf-8");
        this.f34287d.getSettings().setJavaScriptEnabled(true);
        this.f34287d.setWebChromeClient(new WebChromeClient());
        this.f34287d.getParent().requestDisallowInterceptTouchEvent(true);
    }
}
