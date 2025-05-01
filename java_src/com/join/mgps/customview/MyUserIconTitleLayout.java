package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.wufan.user.service.protobuf.n0;
/* loaded from: classes4.dex */
public class MyUserIconTitleLayout extends RelativeLayout implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private TextView f47450b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f47451c;

    /* renamed from: d  reason: collision with root package name */
    private SimpleDraweeView f47452d;

    /* renamed from: e  reason: collision with root package name */
    private Context f47453e;

    /* renamed from: f  reason: collision with root package name */
    private VipView f47454f;

    /* renamed from: g  reason: collision with root package name */
    b f47455g;

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n0 accountData = AccountUtil_.getInstance_(MyUserIconTitleLayout.this.f47453e).getAccountData();
            if (accountData == null) {
                MyUserIconTitleLayout.this.f47452d.setImageResource(R.drawable.unloginstatus);
                MyUserIconTitleLayout.this.f47450b.setVisibility(8);
                return;
            }
            MyImageLoader.t(MyUserIconTitleLayout.this.f47452d, accountData.d0());
            int i4 = 0;
            try {
                i4 = Integer.parseInt(com.join.mgps.Util.b.vl(com.join.mgps.Util.a.b(accountData.G())));
            } catch (Exception unused) {
            }
            MyUserIconTitleLayout.this.f47454f.setVipData(i4, accountData.j1());
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a();
    }

    public MyUserIconTitleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47453e = context;
    }

    public void e() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f47450b.setVisibility(8);
        if (AccountUtil_.getInstance_(getContext().getApplicationContext()).getToken() != null) {
            com.papa.sim.statistic.pref.b.k(this.f47453e).B(false);
            this.f47451c.setVisibility(8);
        } else {
            Toast.makeText(getContext(), getContext().getString(R.string.forum_user_not_login), 0).show();
        }
        this.f47455g.a();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f47450b = (TextView) findViewById(R.id.papa_user_round);
        this.f47451c = (TextView) findViewById(R.id.papa_user_is_in);
        this.f47452d = (SimpleDraweeView) findViewById(R.id.papa_user_icon);
        this.f47454f = (VipView) findViewById(R.id.papa_vip);
        setOnClickListener(this);
    }

    public void setMsgNumber(int i4) {
        if (i4 < 1) {
            this.f47450b.setVisibility(8);
            return;
        }
        if (i4 < 100) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f47450b.getLayoutParams();
            layoutParams.width = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
            layoutParams.height = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
            this.f47450b.setLayoutParams(layoutParams);
            this.f47450b.setCompoundDrawables(null, null, null, null);
            this.f47450b.setBackgroundResource(R.drawable.mygame_big_round);
            this.f47450b.setPadding(1, 0, 0, 1);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f47450b.getLayoutParams();
            layoutParams2.width = getResources().getDimensionPixelOffset(R.dimen.dp70);
            layoutParams2.height = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
            layoutParams2.setMargins(0, (int) TypedValue.applyDimension(1, 7.0f, getResources().getDisplayMetrics()), 4, 0);
            this.f47450b.setGravity(17);
            this.f47450b.setLayoutParams(layoutParams2);
            this.f47450b.setCompoundDrawables(null, null, null, null);
            this.f47450b.setBackgroundResource(R.drawable.message_round);
            this.f47450b.setPadding(1, 0, 2, 1);
        }
        TextView textView = this.f47450b;
        textView.setText(i4 + "");
        this.f47450b.setVisibility(0);
    }

    public void setUserIcon() {
        this.f47452d.post(new a());
    }

    public void setUserIconClickListener(b bVar) {
        this.f47455g = bVar;
    }
}
