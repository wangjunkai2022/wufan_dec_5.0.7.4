package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
@EFragment(R.layout.newgame_fragment_layout)
/* loaded from: classes3.dex */
public class NewGameFragment extends BaseFragment {

    /* renamed from: e  reason: collision with root package name */
    private TextView f52498e;

    /* renamed from: g  reason: collision with root package name */
    private boolean f52500g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f52501h;

    /* renamed from: i  reason: collision with root package name */
    private View f52502i;

    /* renamed from: b  reason: collision with root package name */
    private final int f52495b = 0;

    /* renamed from: c  reason: collision with root package name */
    private final int f52496c = 1;

    /* renamed from: d  reason: collision with root package name */
    private final int f52497d = 2;

    /* renamed from: f  reason: collision with root package name */
    private int f52499f = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
    }

    @Override // com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f52502i == null) {
            this.f52502i = layoutInflater.inflate(R.layout.newgame_fragment_layout, (ViewGroup) null);
            this.f52500g = true;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f52502i.getParent();
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.f52502i);
        }
        return this.f52502i;
    }
}
