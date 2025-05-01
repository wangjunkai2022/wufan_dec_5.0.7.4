package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.FlowLayout;
import com.join.mgps.dto.ClassifyBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class ClassifyFragment_ extends ClassifyFragment implements y3.a, a4.a, a4.b {

    /* renamed from: j  reason: collision with root package name */
    private View f50078j;

    /* renamed from: i  reason: collision with root package name */
    private final a4.c f50077i = new a4.c();

    /* renamed from: k  reason: collision with root package name */
    private final Map<Class<?>, Object> f50079k = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ClassifyBean f50080b;

        a(ClassifyBean classifyBean) {
            this.f50080b = classifyBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            ClassifyFragment_.super.h0(this.f50080b);
        }
    }

    /* loaded from: classes3.dex */
    class b extends a.c {
        b(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ClassifyFragment_.super.loadData();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class c extends org.androidannotations.api.builder.d<c, ClassifyFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public ClassifyFragment build() {
            ClassifyFragment_ classifyFragment_ = new ClassifyFragment_();
            classifyFragment_.setArguments(this.args);
            return classifyFragment_;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    public static c l0() {
        return new c();
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f50079k.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ClassifyFragment
    public void h0(ClassifyBean classifyBean) {
        org.androidannotations.api.b.e("", new a(classifyBean), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f50078j;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.fragment.ClassifyFragment, com.join.mgps.basefragment.BaseLoadingFragment
    public void loadData() {
        org.androidannotations.api.a.l(new b("", 0L, ""));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f50077i);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f50078j = onCreateView;
        if (onCreateView == null) {
            this.f50078j = layoutInflater.inflate(R.layout.fragment_classify, viewGroup, false);
        }
        return this.f50078j;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f50078j = null;
        this.f50063c = null;
        this.f50064d = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f50063c = (FlowLayout) aVar.internalFindViewById(R.id.classify_game);
        this.f50064d = (LinearLayout) aVar.internalFindViewById(R.id.game_classify);
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f50077i.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f50079k.put(cls, t4);
    }
}
