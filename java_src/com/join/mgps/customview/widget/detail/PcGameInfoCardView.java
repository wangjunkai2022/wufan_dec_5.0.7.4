package com.join.mgps.customview.widget.detail;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.ExtInfoBean;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.TipBean;
import com.join.mgps.dto.TipNew;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.p;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes4.dex */
public class PcGameInfoCardView extends LinearLayout implements com.join.mgps.customview.widget.detail.b {

    /* renamed from: b  reason: collision with root package name */
    private SimpleDraweeView f48933b;

    /* renamed from: c  reason: collision with root package name */
    private SimpleDraweeView f48934c;

    /* renamed from: d  reason: collision with root package name */
    private SimpleDraweeView f48935d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f48936e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f48937f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f48938g;

    /* renamed from: h  reason: collision with root package name */
    private LinearLayout f48939h;

    /* renamed from: i  reason: collision with root package name */
    private View f48940i;

    /* renamed from: j  reason: collision with root package name */
    private View f48941j;

    /* renamed from: k  reason: collision with root package name */
    private com.join.mgps.customview.widget.detail.a f48942k;

    /* renamed from: l  reason: collision with root package name */
    c f48943l;

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExtInfoBean f48944b;

        a(ExtInfoBean extInfoBean) {
            this.f48944b = extInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PcGameInfoCardView pcGameInfoCardView = PcGameInfoCardView.this;
            pcGameInfoCardView.g(pcGameInfoCardView.f48934c, this.f48944b.getShare_info().getDescription());
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommonGameInfoBean f48946b;

        b(CommonGameInfoBean commonGameInfoBean) {
            this.f48946b = commonGameInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p.l(PcGameInfoCardView.this.getContext()).O1(Event.clickAD, new Ext().setFrom("2"));
            IntentUtil.getInstance().intentActivity(PcGameInfoCardView.this.getContext(), this.f48946b.getIntentDataBean());
        }
    }

    public PcGameInfoCardView(Context context) {
        super(context);
        e(context);
    }

    private void e(Context context) {
        LinearLayout.inflate(context, R.layout.view_game_detail_game_info_pc, this);
        this.f48933b = (SimpleDraweeView) findViewById(R.id.sdv_game_icon);
        this.f48934c = (SimpleDraweeView) findViewById(R.id.sdv_share_user);
        this.f48935d = (SimpleDraweeView) findViewById(R.id.sdv_top_ad);
        this.f48936e = (TextView) findViewById(R.id.tv_app_name);
        this.f48937f = (TextView) findViewById(R.id.tv_game_desc);
        this.f48938g = (TextView) findViewById(R.id.tv_score);
        this.f48939h = (LinearLayout) findViewById(R.id.ll_tags);
        this.f48940i = findViewById(R.id.v_score);
        this.f48941j = findViewById(R.id.ll_share_by);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int f(TipBean tipBean, TipBean tipBean2) {
        if ("134".equals(tipBean.getId())) {
            return -1;
        }
        return "134".equals(tipBean2.getId()) ? 1 : 0;
    }

    @Override // com.join.mgps.customview.widget.detail.b
    public void a(GamedetialModleFourBean gamedetialModleFourBean) {
        MyImageLoader.h(this.f48933b, gamedetialModleFourBean.getIco_remote());
        ExtInfoBean ext_info = gamedetialModleFourBean.getExt_info();
        if (ext_info != null) {
            if (ext_info.getShare_info() != null) {
                this.f48941j.setVisibility(0);
                MyImageLoader.h(this.f48934c, ext_info.getShare_info().getHead_url());
            } else {
                this.f48941j.setVisibility(8);
            }
            this.f48941j.setOnClickListener(new a(ext_info));
        }
        if (gamedetialModleFourBean.isCpsGame()) {
            TextView textView = this.f48936e;
            textView.setText(gamedetialModleFourBean.getGame_name() + "（云游戏）");
        } else {
            this.f48936e.setText(gamedetialModleFourBean.getGame_name());
        }
        this.f48937f.setText(gamedetialModleFourBean.getInfo());
        if (gamedetialModleFourBean.getGame_score() != null) {
            this.f48938g.setText(gamedetialModleFourBean.getGame_score().getScore());
        }
        d(this.f48939h, gamedetialModleFourBean.getTag_info(), gamedetialModleFourBean.getSp_tag_info());
        CommonGameInfoBean ad_info = gamedetialModleFourBean.getAd_info();
        if (ad_info != null) {
            this.f48935d.setVisibility(0);
            MyImageLoader.r(this.f48935d, ad_info.getCoverPicUrl());
            this.f48935d.setOnClickListener(new b(ad_info));
            return;
        }
        this.f48935d.setVisibility(8);
    }

    void d(LinearLayout linearLayout, List<TipBean> list, TipNew tipNew) {
        if (linearLayout == null) {
            return;
        }
        try {
            linearLayout.removeAllViews();
            if (list == null || list.size() <= 0) {
                return;
            }
            Collections.sort(list, new Comparator() { // from class: com.join.mgps.customview.widget.detail.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int f5;
                    f5 = PcGameInfoCardView.f((TipBean) obj, (TipBean) obj2);
                    return f5;
                }
            });
            for (TipBean tipBean : list) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.rightMargin = (int) linearLayout.getContext().getResources().getDimension(R.dimen.wdp20);
                View inflate = View.inflate(linearLayout.getContext(), R.layout.item_tag_common_zone_detail, null);
                TextView textView = (TextView) inflate.findViewById(R.id.tv_tag);
                if ("134".equals(tipBean.getId())) {
                    textView.setText("平台:" + tipBean.getName());
                } else {
                    textView.setText(tipBean.getName());
                }
                linearLayout.addView(inflate, layoutParams);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void g(View view, String str) {
        c cVar = this.f48943l;
        if (cVar != null && cVar.isShowing()) {
            this.f48943l.dismiss();
        }
        if (this.f48943l == null) {
            this.f48943l = new c(getContext(), (int) getResources().getDimension(R.dimen.wdp440), -2);
        }
        this.f48943l.showAsDropDown(view, (int) (view.getMeasuredWidth() - getResources().getDimension(R.dimen.dp24)), 0);
        this.f48943l.b(str);
    }

    @Override // com.join.mgps.customview.widget.detail.b
    public View getContentView() {
        return this;
    }

    @Override // com.join.mgps.customview.widget.detail.b
    public void setGameInfoCallback(com.join.mgps.customview.widget.detail.a aVar) {
        this.f48942k = aVar;
    }

    public PcGameInfoCardView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends PopupWindow {

        /* renamed from: a  reason: collision with root package name */
        private Context f48948a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f48949b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 4) {
                    c.this.dismiss();
                    return true;
                }
                return false;
            }
        }

        public c(Context context) {
            super(context);
            this.f48948a = context;
            a();
        }

        private void c() {
            setBackgroundDrawable(new BitmapDrawable());
            setFocusable(true);
            setTouchable(true);
            setOutsideTouchable(true);
            setTouchInterceptor(new a());
        }

        void a() {
            View inflate = LayoutInflater.from(this.f48948a).inflate(R.layout.pop_detail_share_user, (ViewGroup) null);
            setContentView(inflate);
            this.f48949b = (TextView) inflate.findViewById(R.id.tv_text);
            c();
        }

        public void b(String str) {
            this.f48949b.setText(str);
        }

        public c(Context context, int i4, int i5) {
            super(i4, i5);
            this.f48948a = context;
            a();
        }
    }

    public PcGameInfoCardView(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        e(context);
    }
}
