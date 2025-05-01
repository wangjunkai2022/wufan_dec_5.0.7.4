package com.join.mgps.activity.gamedetail;

import a4.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.LJNestScrollWebView;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.builder.d;
/* loaded from: classes4.dex */
public final class CommonWebviewFragment_ extends CommonWebviewFragment implements y3.a, a4.a, a4.b {
    private View contentView_;
    private final c onViewChangedNotifier_ = new c();
    private final Map<Class<?>, Object> beans_ = new HashMap();

    /* loaded from: classes4.dex */
    public static class FragmentBuilder_ extends d<FragmentBuilder_, CommonWebviewFragment> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.androidannotations.api.builder.d
        public CommonWebviewFragment build() {
            CommonWebviewFragment_ commonWebviewFragment_ = new CommonWebviewFragment_();
            commonWebviewFragment_.setArguments(this.args);
            return commonWebviewFragment_;
        }
    }

    public static FragmentBuilder_ builder() {
        return new FragmentBuilder_();
    }

    private void init_(Bundle bundle) {
        this.prefDef = new PrefDef_(getActivity());
        c.b(this);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.beans_.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.contentView_;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        c c5 = c.c(this.onViewChangedNotifier_);
        init_(bundle);
        super.onCreate(bundle);
        c.c(c5);
    }

    @Override // com.join.mgps.activity.gamedetail.CommonWebviewFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.contentView_ = onCreateView;
        if (onCreateView == null) {
            this.contentView_ = layoutInflater.inflate(R.layout.fragment_common_webview, viewGroup, false);
        }
        return this.contentView_;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.contentView_ = null;
        this.loding_layout = null;
        this.loding_faile = null;
        this.failedMessage = null;
        this.weblayout = null;
        this.web = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.loding_layout = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.loding_faile = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.failedMessage = (TextView) aVar.internalFindViewById(R.id.failedMessage);
        this.weblayout = (RelativeLayout) aVar.internalFindViewById(R.id.weblayout);
        this.web = (LJNestScrollWebView) aVar.internalFindViewById(R.id.web);
        View internalFindViewById = aVar.internalFindViewById(R.id.setNetwork);
        LinearLayout linearLayout = this.loding_faile;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment_.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    CommonWebviewFragment_.this.loding_faile();
                }
            });
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment_.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    CommonWebviewFragment_.this.setNetwork();
                }
            });
        }
        afterview();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.onViewChangedNotifier_.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.beans_.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.gamedetail.CommonWebviewFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment_.3
            @Override // java.lang.Runnable
            public void run() {
                CommonWebviewFragment_.super.showLoding();
            }
        }, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.gamedetail.CommonWebviewFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment_.4
            @Override // java.lang.Runnable
            public void run() {
                CommonWebviewFragment_.super.showLodingFailed();
            }
        }, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.gamedetail.CommonWebviewFragment
    public void showMain() {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment_.5
            @Override // java.lang.Runnable
            public void run() {
                CommonWebviewFragment_.super.showMain();
            }
        }, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.gamedetail.CommonWebviewFragment
    public void showTost(final String str) {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment_.6
            @Override // java.lang.Runnable
            public void run() {
                CommonWebviewFragment_.super.showTost(str);
            }
        }, 0L);
    }
}
