package com.join.mgps.activity;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.BaseActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.pref.PrefDef_;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_mygame_manager)
/* loaded from: classes4.dex */
public class MyGameManagerActivity extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    View f35692b;

    /* renamed from: c  reason: collision with root package name */
    Fragment f35693c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        if (new PrefDef_(this).isBsideInt().d().intValue() == 2) {
            this.f35693c = MyGamePapaFragmentV2_.b2().build();
        } else {
            this.f35693c = MyGamePapaFragment_.Z1().build();
        }
        beginTransaction.add(R.id.frame, this.f35693c);
        beginTransaction.commit();
        com.papa.sim.statistic.p.l(this).O1(Event.enterMyGameCentre, new Ext());
    }
}
