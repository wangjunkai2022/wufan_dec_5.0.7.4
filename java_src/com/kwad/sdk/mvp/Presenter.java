package com.kwad.sdk.mvp;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.kwad.sdk.n.l;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.service.c;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes5.dex */
public class Presenter {
    private Object aKU;
    private View mRootView;
    private final List<Presenter> aKT = new CopyOnWriteArrayList();
    private PresenterState aKV = PresenterState.INIT;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public enum PresenterState {
        INIT(0) { // from class: com.kwad.sdk.mvp.Presenter.PresenterState.1
            @Override // com.kwad.sdk.mvp.Presenter.PresenterState
            public final void performCallState(Presenter presenter) {
            }
        },
        CREATE(1) { // from class: com.kwad.sdk.mvp.Presenter.PresenterState.2
            @Override // com.kwad.sdk.mvp.Presenter.PresenterState
            public final void performCallState(Presenter presenter) {
                for (Presenter presenter2 : presenter.aKT) {
                    try {
                        presenter2.G(presenter.mRootView);
                    } catch (Exception e5) {
                        c.gatherException(e5);
                        com.kwad.sdk.core.e.c.printStackTrace(e5);
                    }
                }
            }
        },
        BIND(2) { // from class: com.kwad.sdk.mvp.Presenter.PresenterState.3
            @Override // com.kwad.sdk.mvp.Presenter.PresenterState
            final void performCallState(Presenter presenter) {
                for (Presenter presenter2 : presenter.aKT) {
                    try {
                        presenter2.k(presenter.aKU);
                    } catch (Throwable th) {
                        c.gatherException(th);
                        com.kwad.sdk.core.e.c.printStackTrace(th);
                    }
                }
            }
        },
        UNBIND(3) { // from class: com.kwad.sdk.mvp.Presenter.PresenterState.4
            @Override // com.kwad.sdk.mvp.Presenter.PresenterState
            final void performCallState(Presenter presenter) {
                for (Presenter presenter2 : presenter.aKT) {
                    try {
                        presenter2.mw();
                    } catch (Exception e5) {
                        c.gatherException(e5);
                        com.kwad.sdk.core.e.c.printStackTrace(e5);
                    }
                }
            }
        },
        DESTROY(4) { // from class: com.kwad.sdk.mvp.Presenter.PresenterState.5
            @Override // com.kwad.sdk.mvp.Presenter.PresenterState
            final void performCallState(Presenter presenter) {
                for (Presenter presenter2 : presenter.aKT) {
                    try {
                        presenter2.destroy();
                    } catch (Exception e5) {
                        c.gatherException(e5);
                        com.kwad.sdk.core.e.c.printStackTrace(e5);
                    }
                }
            }
        };
        
        private int mIndex;

        public int index() {
            return this.mIndex;
        }

        abstract void performCallState(Presenter presenter);

        PresenterState(int i4) {
            this.mIndex = i4;
        }
    }

    private boolean Kd() {
        return this.aKV.index() >= PresenterState.CREATE.index();
    }

    private void b(Presenter presenter) {
        Object obj;
        View view;
        int index = this.aKV.index();
        PresenterState presenterState = PresenterState.UNBIND;
        if (index >= presenterState.index() || presenter.aKV.index() >= presenterState.index()) {
            return;
        }
        if (Kd() && !presenter.Kd() && (view = this.mRootView) != null) {
            presenter.G(view);
        }
        if (!isBound() || !presenter.Kd() || presenter.isBound() || (obj = this.aKU) == null) {
            return;
        }
        presenter.k(obj);
    }

    private boolean isBound() {
        return this.aKV == PresenterState.BIND;
    }

    @UiThread
    public final void G(View view) {
        try {
            this.aKV = PresenterState.CREATE;
            this.mRootView = view;
            onCreate();
            this.aKV.performCallState(this);
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    public final List<Presenter> Ke() {
        return this.aKT;
    }

    public final Object Kf() {
        return this.aKU;
    }

    public final void a(Presenter presenter) {
        this.aKT.add(presenter);
        if (!Kd() || presenter.Kd()) {
            return;
        }
        G(this.mRootView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void aj() {
    }

    @UiThread
    public final void destroy() {
        try {
            if (this.aKV == PresenterState.BIND) {
                mw();
            }
            this.aKV = PresenterState.DESTROY;
            onDestroy();
            this.aKV.performCallState(this);
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    public final <T extends View> T findViewById(int i4) {
        return (T) this.mRootView.findViewById(i4);
    }

    @Nullable
    @UiThread
    public final Activity getActivity() {
        return l.dB(getContext());
    }

    @NonNull
    public final Context getContext() {
        return this.mRootView.getContext();
    }

    public final View getRootView() {
        return this.mRootView;
    }

    @UiThread
    public final void k(@NonNull Object obj) {
        try {
            PresenterState presenterState = this.aKV;
            if (presenterState != PresenterState.INIT) {
                PresenterState presenterState2 = PresenterState.DESTROY;
            }
            PresenterState presenterState3 = PresenterState.BIND;
            if (presenterState == presenterState3) {
                mw();
            }
            this.aKV = presenterState3;
            this.aKU = obj;
            aj();
            this.aKV.performCallState(this);
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    @UiThread
    public final void mw() {
        try {
            this.aKV = PresenterState.UNBIND;
            onUnbind();
            this.aKV.performCallState(this);
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onCreate() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onDestroy() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onUnbind() {
    }

    public final void a(Presenter presenter, boolean z4) {
        this.aKT.add(presenter);
        try {
            b(presenter);
        } catch (Throwable th) {
            c.gatherException(th);
            com.kwad.sdk.core.e.c.printStackTrace(th);
        }
    }
}
