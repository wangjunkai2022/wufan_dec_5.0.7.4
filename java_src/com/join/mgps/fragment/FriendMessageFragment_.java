package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class FriendMessageFragment_ extends FriendMessageFragment implements y3.a, a4.a, a4.b {

    /* renamed from: i  reason: collision with root package name */
    private View f51605i;

    /* renamed from: h  reason: collision with root package name */
    private final a4.c f51604h = new a4.c();

    /* renamed from: j  reason: collision with root package name */
    private final Map<Class<?>, Object> f51606j = new HashMap();

    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FriendMessageFragment_.this.Z();
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends org.androidannotations.api.builder.d<b, FriendMessageFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public FriendMessageFragment build() {
            FriendMessageFragment_ friendMessageFragment_ = new FriendMessageFragment_();
            friendMessageFragment_.setArguments(this.args);
            return friendMessageFragment_;
        }
    }

    public static b d0() {
        return new b();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f51606j.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f51605i;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f51604h);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f51605i = onCreateView;
        if (onCreateView == null) {
            this.f51605i = layoutInflater.inflate(R.layout.fragment_friend_msg, viewGroup, false);
        }
        return this.f51605i;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f51605i = null;
        this.f51596b = null;
        this.f51597c = null;
        this.f51598d = null;
        this.f51599e = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f51596b = (TextView) aVar.internalFindViewById(R.id.tabReq);
        this.f51597c = (TextView) aVar.internalFindViewById(R.id.tabLike);
        this.f51598d = aVar.internalFindViewById(R.id.likeDot);
        this.f51599e = (ViewPager) aVar.internalFindViewById(R.id.viewPager);
        View internalFindViewById = aVar.internalFindViewById(R.id.close);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f51604h.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f51606j.put(cls, t4);
    }
}
