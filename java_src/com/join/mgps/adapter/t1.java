package com.join.mgps.adapter;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.dto.CompanySubBean;
import com.join.mgps.dto.GameOLHeadAdBean;
import java.util.ArrayList;
import java.util.List;
/* compiled from: GameSingleConpanyAdapter.java */
/* loaded from: classes4.dex */
public class t1 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    List<v1.b> f45826b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    Context f45827c;

    /* renamed from: d  reason: collision with root package name */
    LayoutInflater f45828d;

    /* compiled from: GameSingleConpanyAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameOLHeadAdBean f45829b;

        a(GameOLHeadAdBean gameOLHeadAdBean) {
            this.f45829b = gameOLHeadAdBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List<CompanySubBean> sub = this.f45829b.getSub();
            if (sub == null || sub.size() <= 0) {
                return;
            }
            IntentUtil.getInstance().intentActivity(t1.this.f45827c, sub.get(0).getIntentDataBean());
        }
    }

    /* compiled from: GameSingleConpanyAdapter.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameOLHeadAdBean f45831b;

        b(GameOLHeadAdBean gameOLHeadAdBean) {
            this.f45831b = gameOLHeadAdBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List<CompanySubBean> sub = this.f45831b.getSub();
            if (sub == null || sub.size() <= 0) {
                return;
            }
            IntentUtil.getInstance().intentActivity(t1.this.f45827c, sub.get(0).getIntentDataBean());
        }
    }

    public t1(Context context) {
        this.f45827c = context;
        this.f45828d = LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public v1.b getItem(int i4) {
        return this.f45826b.get(i4);
    }

    public List<v1.b> b() {
        return this.f45826b;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f45826b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f45828d.inflate(R.layout.game_single_company_item_layout, (ViewGroup) null);
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) com.join.mgps.Util.s2.a(view, R.id.imageLeft);
        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) com.join.mgps.Util.s2.a(view, R.id.imageRight);
        TextView textView = (TextView) com.join.mgps.Util.s2.a(view, R.id.appNumberLeft);
        TextView textView2 = (TextView) com.join.mgps.Util.s2.a(view, R.id.companyRight);
        TextView textView3 = (TextView) com.join.mgps.Util.s2.a(view, R.id.appNumberRight);
        RelativeLayout relativeLayout = (RelativeLayout) com.join.mgps.Util.s2.a(view, R.id.rightLayout);
        v1.b item = getItem(i4);
        GameOLHeadAdBean a5 = item.a();
        GameOLHeadAdBean b5 = item.b();
        MyImageLoader.d(simpleDraweeView, R.drawable.banner_normal_icon, a5.getMain().getPic_remote());
        ((TextView) com.join.mgps.Util.s2.a(view, R.id.companyLeft)).setText(a5.getMain().getSub_title());
        List<CompanySubBean> sub = a5.getSub();
        if (sub != null && sub.size() > 0) {
            textView.setText(Html.fromHtml("<font color='0xF47500' >" + sub.get(0).getGame_count() + "</font>款游戏"), TextView.BufferType.SPANNABLE);
        }
        if (b5 != null) {
            List<CompanySubBean> sub2 = b5.getSub();
            if (sub2 != null && sub2.size() > 0) {
                textView3.setText(Html.fromHtml("<font color='0xF47500' >" + sub2.get(0).getGame_count() + "</font>款游戏"), TextView.BufferType.SPANNABLE);
            }
            MyImageLoader.d(simpleDraweeView2, R.drawable.rect_normal_icon, b5.getMain().getPic_remote());
            textView2.setText(b5.getMain().getSub_title());
            relativeLayout.setVisibility(0);
        } else {
            relativeLayout.setVisibility(4);
        }
        simpleDraweeView.setOnClickListener(new a(a5));
        simpleDraweeView2.setOnClickListener(new b(b5));
        return view;
    }
}
