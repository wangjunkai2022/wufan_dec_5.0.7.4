package com.join.kotlin.ui.introduction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.BbsListBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class ModIntroductionListFragment_ extends ModIntroductionListFragment implements y3.a, a4.a, a4.b {
    private View contentView_;
    private final a4.c onViewChangedNotifier_ = new a4.c();
    private final Map<Class<?>, Object> beans_ = new HashMap();

    /* loaded from: classes3.dex */
    public static class FragmentBuilder_ extends org.androidannotations.api.builder.d<FragmentBuilder_, ModIntroductionListFragment> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.androidannotations.api.builder.d
        public ModIntroductionListFragment build() {
            ModIntroductionListFragment_ modIntroductionListFragment_ = new ModIntroductionListFragment_();
            modIntroductionListFragment_.setArguments(this.args);
            return modIntroductionListFragment_;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.kotlin.ui.introduction.ModIntroductionListFragment
    public void hideLoading() {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.kotlin.ui.introduction.ModIntroductionListFragment_.5
            @Override // java.lang.Runnable
            public void run() {
                ModIntroductionListFragment_.super.hideLoading();
            }
        }, 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.contentView_;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.kotlin.ui.introduction.ModIntroductionListFragment
    public void loadData(final int i4) {
        org.androidannotations.api.a.l(new a.c("", 0L, "") { // from class: com.join.kotlin.ui.introduction.ModIntroductionListFragment_.7
            @Override // org.androidannotations.api.a.c
            public void execute() {
                try {
                    ModIntroductionListFragment_.super.loadData(i4);
                } catch (Throwable th) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
                }
            }
        });
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
            this.contentView_ = layoutInflater.inflate(R.layout.fragment_mod_introduction_list, viewGroup, false);
        }
        return this.contentView_;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.contentView_ = null;
        this.rv_list_data = null;
        this.loding_layout = null;
        this.loding_faile = null;
        this.setNetwork = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.rv_list_data = (RecyclerView) aVar.internalFindViewById(R.id.rv_list_data);
        this.loding_layout = aVar.internalFindViewById(R.id.loding_layout);
        this.loding_faile = aVar.internalFindViewById(R.id.loding_faile);
        this.setNetwork = aVar.internalFindViewById(R.id.setNetwork);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View view = this.setNetwork;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.ui.introduction.ModIntroductionListFragment_.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    ModIntroductionListFragment_.this.setNetwork();
                }
            });
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.ui.introduction.ModIntroductionListFragment_.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    ModIntroductionListFragment_.this.relodingimag();
                }
            });
        }
        aftervidew();
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
    @Override // com.join.kotlin.ui.introduction.ModIntroductionListFragment
    public void showLoadFailed(final String str) {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.kotlin.ui.introduction.ModIntroductionListFragment_.4
            @Override // java.lang.Runnable
            public void run() {
                ModIntroductionListFragment_.super.showLoadFailed(str);
            }
        }, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.kotlin.ui.introduction.ModIntroductionListFragment
    public void showLoadingView() {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.kotlin.ui.introduction.ModIntroductionListFragment_.6
            @Override // java.lang.Runnable
            public void run() {
                ModIntroductionListFragment_.super.showLoadingView();
            }
        }, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.kotlin.ui.introduction.ModIntroductionListFragment
    public void showMain(final List<BbsListBean> list, final boolean z4) {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.kotlin.ui.introduction.ModIntroductionListFragment_.3
            @Override // java.lang.Runnable
            public void run() {
                ModIntroductionListFragment_.super.showMain(list, z4);
            }
        }, 0L);
    }
}
