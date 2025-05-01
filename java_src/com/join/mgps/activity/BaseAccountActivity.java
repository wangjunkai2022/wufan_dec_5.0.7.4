package com.join.mgps.activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.BaseActivity;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class BaseAccountActivity extends BaseActivity {

    /* renamed from: b  reason: collision with root package name */
    protected ImageView f28477b;

    /* renamed from: c  reason: collision with root package name */
    protected TextView f28478c;

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseAccountActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g0(View.OnClickListener onClickListener) {
        this.f28477b.setOnClickListener(onClickListener);
    }

    public void h0(String str) {
        this.f28478c.setText(str);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        View inflate = LayoutInflater.from(this).inflate(R.layout.account_base_activity, (ViewGroup) null);
        ((FrameLayout) inflate.findViewById(R.id.childLayout)).addView(LayoutInflater.from(this).inflate(i4, (ViewGroup) null));
        super.setContentView(inflate);
        this.f28477b = (ImageView) inflate.findViewById(R.id.backButn);
        this.f28478c = (TextView) inflate.findViewById(R.id.titleText);
        this.f28477b.setOnClickListener(new a());
        com.join.mgps.Util.c2.o(this, -1215968, false);
    }
}
