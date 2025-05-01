package com.join.mgps.activity;

import androidx.fragment.app.FragmentTransaction;
import com.BaseFragmentActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.fragment.UserCenterFragment_;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
@EActivity(R.layout.activity_account_center_new)
/* loaded from: classes4.dex */
public class AccountCenterNewActivity extends BaseFragmentActivity {
    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(R.id.fragmentLayout, new UserCenterFragment_());
        beginTransaction.commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back() {
        finish();
    }
}
