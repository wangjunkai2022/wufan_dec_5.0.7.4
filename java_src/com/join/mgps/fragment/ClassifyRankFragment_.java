package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.SlidingTabLayout2;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class ClassifyRankFragment_ extends ClassifyRankFragment implements y3.a, a4.a, a4.b {

    /* renamed from: k  reason: collision with root package name */
    private View f50093k;

    /* renamed from: j  reason: collision with root package name */
    private final a4.c f50092j = new a4.c();

    /* renamed from: l  reason: collision with root package name */
    private final Map<Class<?>, Object> f50094l = new HashMap();

    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClassifyRankFragment_.this.V();
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends org.androidannotations.api.builder.d<b, ClassifyRankFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public ClassifyRankFragment build() {
            ClassifyRankFragment_ classifyRankFragment_ = new ClassifyRankFragment_();
            classifyRankFragment_.setArguments(this.args);
            return classifyRankFragment_;
        }
    }

    public static b Z() {
        return new b();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f50094l.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f50093k;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f50092j);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f50093k = onCreateView;
        if (onCreateView == null) {
            this.f50093k = layoutInflater.inflate(R.layout.fragment_classify_rank, viewGroup, false);
        }
        return this.f50093k;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f50093k = null;
        this.f50084c = null;
        this.f50085d = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f50084c = (ViewPager) aVar.internalFindViewById(R.id.mViewpagerV4);
        this.f50085d = (SlidingTabLayout2) aVar.internalFindViewById(R.id.mSlidingTabLayout);
        View internalFindViewById = aVar.internalFindViewById(R.id.searchImage);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f50092j.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f50094l.put(cls, t4);
    }
}
