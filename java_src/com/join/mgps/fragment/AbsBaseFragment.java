package com.join.mgps.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
/* loaded from: classes3.dex */
public abstract class AbsBaseFragment extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    protected Handler f49948b = new Handler();

    protected abstract void V(View view);

    protected abstract View W(LayoutInflater layoutInflater);

    protected abstract void initData();

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initData();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View W = W(layoutInflater);
        V(W);
        return W;
    }
}
