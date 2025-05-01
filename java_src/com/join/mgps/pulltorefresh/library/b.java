package com.join.mgps.pulltorefresh.library;

import android.view.View;
import android.view.animation.Interpolator;
import com.join.mgps.pulltorefresh.library.PullToRefreshBase;
/* compiled from: IPullToRefresh.java */
/* loaded from: classes4.dex */
public interface b<T extends View> {
    boolean a();

    a b(boolean z4, boolean z5);

    boolean c();

    boolean d();

    boolean e();

    void f();

    boolean g();

    PullToRefreshBase.Mode getCurrentMode();

    boolean getFilterTouchEvents();

    a getLoadingLayoutProxy();

    PullToRefreshBase.Mode getMode();

    T getRefreshableView();

    boolean getShowViewWhileRefreshing();

    PullToRefreshBase.State getState();

    void setFilterTouchEvents(boolean z4);

    void setMode(PullToRefreshBase.Mode mode);

    void setOnPullEventListener(PullToRefreshBase.f<T> fVar);

    void setOnRefreshListener(PullToRefreshBase.g<T> gVar);

    void setOnRefreshListener(PullToRefreshBase.h<T> hVar);

    void setPullToRefreshOverScrollEnabled(boolean z4);

    void setRefreshing();

    void setRefreshing(boolean z4);

    void setScrollAnimationInterpolator(Interpolator interpolator);

    void setScrollingWhileRefreshingEnabled(boolean z4);

    void setShowViewWhileRefreshing(boolean z4);
}
