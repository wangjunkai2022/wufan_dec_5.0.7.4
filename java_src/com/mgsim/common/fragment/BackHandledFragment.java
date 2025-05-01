package com.mgsim.common.fragment;

import android.app.DialogFragment;
import android.os.Bundle;
/* loaded from: classes5.dex */
public abstract class BackHandledFragment extends DialogFragment {

    /* renamed from: b  reason: collision with root package name */
    protected a f55969b;

    public abstract boolean a();

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() instanceof a) {
            this.f55969b = (a) getActivity();
            return;
        }
        throw new ClassCastException("Hosting Activity must implement BackHandledInterface");
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f55969b.V(this);
    }
}
