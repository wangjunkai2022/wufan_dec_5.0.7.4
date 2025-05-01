package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.BTActivityBean;
import com.join.mgps.dto.BtGameBenefitBean;
import com.join.mgps.dto.BtGameBenefitSummary;
import com.join.mgps.dto.BtGameWelfare;
/* loaded from: classes4.dex */
public class ActivityTabView extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    private View f46326b;

    /* renamed from: c  reason: collision with root package name */
    private View f46327c;

    /* renamed from: d  reason: collision with root package name */
    private View f46328d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f46329e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f46330f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f46331g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f46332h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f46333i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f46334j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f46335k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f46336l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f46337m;

    /* renamed from: n  reason: collision with root package name */
    private d f46338n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ActivityTabView.this.f46338n != null) {
                ActivityTabView.this.f46338n.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BtGameBenefitBean f46340b;

        b(BtGameBenefitBean btGameBenefitBean) {
            this.f46340b = btGameBenefitBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ActivityTabView.this.f46338n != null) {
                ActivityTabView.this.f46338n.c(this.f46340b.getJump_url());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BtGameBenefitBean f46342b;

        c(BtGameBenefitBean btGameBenefitBean) {
            this.f46342b = btGameBenefitBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ActivityTabView.this.f46338n != null) {
                ActivityTabView.this.f46338n.a(this.f46342b.getJump_url());
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface d {
        void a(String str);

        void b();

        void c(String str);
    }

    public ActivityTabView(Context context) {
        super(context);
    }

    private void b(BTActivityBean bTActivityBean) {
        if (bTActivityBean != null) {
            this.f46326b = findViewById(R.id.ll_tab_1);
            this.f46329e = (ImageView) findViewById(R.id.iv_icon_1);
            this.f46332h = (TextView) findViewById(R.id.tv_title_1);
            this.f46335k = (TextView) findViewById(R.id.tv_desc_1);
            this.f46332h.setText(bTActivityBean.getTitle());
            this.f46335k.setText(bTActivityBean.getSub_head());
            this.f46326b.setOnClickListener(new a());
        }
    }

    private void c(BtGameBenefitSummary btGameBenefitSummary) {
        BtGameBenefitBean game_coupon_summary = btGameBenefitSummary.getGame_coupon_summary();
        if (game_coupon_summary != null) {
            this.f46327c = findViewById(R.id.ll_tab_2);
            this.f46330f = (ImageView) findViewById(R.id.iv_icon_2);
            this.f46333i = (TextView) findViewById(R.id.tv_title_2);
            this.f46336l = (TextView) findViewById(R.id.tv_desc_2);
            this.f46333i.setText(game_coupon_summary.getTitle());
            this.f46336l.setText(game_coupon_summary.isExist() ? game_coupon_summary.getSub_title() : game_coupon_summary.getDefault_sub_title());
            this.f46327c.setOnClickListener(new b(game_coupon_summary));
        }
    }

    private void d(BtGameBenefitSummary btGameBenefitSummary) {
        BtGameBenefitBean game_gift_summary = btGameBenefitSummary.getGame_gift_summary();
        if (game_gift_summary != null) {
            this.f46328d = findViewById(R.id.ll_tab_3);
            this.f46331g = (ImageView) findViewById(R.id.iv_icon_3);
            this.f46334j = (TextView) findViewById(R.id.tv_title_3);
            this.f46337m = (TextView) findViewById(R.id.tv_desc_3);
            this.f46334j.setText(game_gift_summary.getTitle());
            this.f46337m.setText(game_gift_summary.isExist() ? game_gift_summary.getSub_title() : game_gift_summary.getDefault_sub_title());
            this.f46328d.setOnClickListener(new c(game_gift_summary));
        }
    }

    public void setListener(d dVar) {
        this.f46338n = dVar;
    }

    public void update(BtGameWelfare btGameWelfare) {
        if (btGameWelfare.getGame_activity_summary() != null && btGameWelfare.getGame_activity_summary().size() > 0 && btGameWelfare.getGame_benefit_summary() != null && btGameWelfare.getGame_benefit_summary().getGame_coupon_summary() != null && btGameWelfare.getGame_benefit_summary().getGame_coupon_summary() != null) {
            View.inflate(getContext(), R.layout.view_activity_tab_view_three, this);
            b(btGameWelfare.getGame_activity_summary().get(0));
            c(btGameWelfare.getGame_benefit_summary());
            d(btGameWelfare.getGame_benefit_summary());
        }
        if (btGameWelfare.getGame_activity_summary() == null && btGameWelfare.getGame_benefit_summary() != null && btGameWelfare.getGame_benefit_summary().getGame_coupon_summary() != null && btGameWelfare.getGame_benefit_summary().getGame_coupon_summary() != null) {
            View.inflate(getContext(), R.layout.view_activity_tab_view_two, this);
            c(btGameWelfare.getGame_benefit_summary());
            d(btGameWelfare.getGame_benefit_summary());
        } else if (btGameWelfare.getGame_activity_summary() == null || btGameWelfare.getGame_activity_summary().size() <= 0) {
        } else {
            View.inflate(getContext(), R.layout.view_activity_tab_view_one, this);
            b(btGameWelfare.getGame_activity_summary().get(0));
        }
    }

    public ActivityTabView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ActivityTabView(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
