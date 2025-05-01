package com.join.mgps.fragment;

import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.join.mgps.Util.l2;
/* loaded from: classes3.dex */
public abstract class BaseFragment extends Fragment {
    protected boolean isVisible;
    Handler mHandler = new Handler();

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f49970b;

        a(String str) {
            this.f49970b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            l2.a(BaseFragment.this.getContext()).b(this.f49970b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(String str) {
        this.mHandler.post(new a(str));
    }

    protected abstract void lazyLoad();

    protected void onInvisible() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onVisible() {
        lazyLoad();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z4) {
        super.setUserVisibleHint(z4);
        if (getUserVisibleHint()) {
            this.isVisible = true;
            onVisible();
            return;
        }
        this.isVisible = false;
        onInvisible();
    }
}
