package com.kwad.components.core.l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import com.kwad.sdk.mvp.Presenter;
import com.kwad.sdk.mvp.a;
import com.kwad.sdk.n.l;
import com.kwad.sdk.widget.KSFrameLayout;
/* loaded from: classes5.dex */
public abstract class c<T extends com.kwad.sdk.mvp.a> extends KSFrameLayout {
    public T MW;
    protected ViewGroup lD;
    protected Presenter mPresenter;

    public c(Context context) {
        this(context, null);
    }

    private void initMVP() {
        this.MW = ku();
        if (this.mPresenter == null) {
            Presenter onCreatePresenter = onCreatePresenter();
            this.mPresenter = onCreatePresenter;
            onCreatePresenter.G(this.lD);
        }
        this.mPresenter.k(this.MW);
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public void ac() {
        super.ac();
        initMVP();
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public void ad() {
        super.ad();
        T t4 = this.MW;
        if (t4 != null) {
            t4.release();
        }
        Presenter presenter = this.mPresenter;
        if (presenter != null) {
            presenter.destroy();
        }
    }

    @LayoutRes
    protected abstract int getLayoutId();

    protected abstract void initData();

    protected boolean kq() {
        return false;
    }

    protected abstract void ks();

    protected abstract T ku();

    @NonNull
    public abstract Presenter onCreatePresenter();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void pi() {
        initData();
        this.lD = (ViewGroup) l.inflate(getContext(), getLayoutId(), this);
        ks();
    }

    private c(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private c(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, 0);
        if (kq()) {
            return;
        }
        pi();
    }
}
