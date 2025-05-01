package com.join.kotlin.ui.introduction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class IntroductionProgressFragment_ extends IntroductionProgressFragment implements y3.a, a4.a, a4.b {
    private View contentView_;
    private final a4.c onViewChangedNotifier_ = new a4.c();
    private final Map<Class<?>, Object> beans_ = new HashMap();

    /* loaded from: classes3.dex */
    public static class FragmentBuilder_ extends org.androidannotations.api.builder.d<FragmentBuilder_, IntroductionProgressFragment> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.androidannotations.api.builder.d
        public IntroductionProgressFragment build() {
            IntroductionProgressFragment_ introductionProgressFragment_ = new IntroductionProgressFragment_();
            introductionProgressFragment_.setArguments(this.args);
            return introductionProgressFragment_;
        }
    }

    public static FragmentBuilder_ builder() {
        return new FragmentBuilder_();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
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
        a4.c c5 = a4.c.c(this.onViewChangedNotifier_);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.contentView_ = onCreateView;
        if (onCreateView == null) {
            this.contentView_ = layoutInflater.inflate(R.layout.introduction_progress_fragment, viewGroup, false);
        }
        return this.contentView_;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.contentView_ = null;
        this.ll_empty = null;
        this.tv_title = null;
        this.rv_list_data = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.ll_empty = (LinearLayout) aVar.internalFindViewById(R.id.ll_empty);
        this.tv_title = (TextView) aVar.internalFindViewById(R.id.tv_title);
        this.rv_list_data = (RecyclerView) aVar.internalFindViewById(R.id.rv_list_data);
        View internalFindViewById = aVar.internalFindViewById(R.id.iv_close);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.ui.introduction.IntroductionProgressFragment_.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IntroductionProgressFragment_.this.onClockClick();
                }
            });
        }
        afterView();
    }

    @Override // com.join.kotlin.ui.introduction.IntroductionProgressFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.onViewChangedNotifier_.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.beans_.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.kotlin.ui.introduction.IntroductionProgressFragment
    public void showMessage(final String str) {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.kotlin.ui.introduction.IntroductionProgressFragment_.2
            @Override // java.lang.Runnable
            public void run() {
                IntroductionProgressFragment_.super.showMessage(str);
            }
        }, 0L);
    }
}
