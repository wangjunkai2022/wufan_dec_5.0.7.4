package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.dto.GameMainV4DataBean;
import java.util.ArrayList;
import java.util.List;
/* compiled from: MemberFunAdapter1.java */
/* loaded from: classes4.dex */
public class c2 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private List<GameMainV4DataBean.MemberFunBean> f44239b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private Context f44240c;

    /* renamed from: d  reason: collision with root package name */
    private String f44241d;

    /* compiled from: MemberFunAdapter1.java */
    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        TextView f44242a;

        /* renamed from: b  reason: collision with root package name */
        SimpleDraweeView f44243b;

        public a() {
        }
    }

    public c2(Context context, String str) {
        this.f44241d = str;
        this.f44240c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(GameMainV4DataBean.MemberFunBean memberFunBean, View view) {
        String str;
        if (com.join.mgps.Util.g2.h(memberFunBean.getUrl())) {
            return;
        }
        String url = memberFunBean.getUrl();
        if (url.contains("?")) {
            str = url + "&game_id=" + this.f44241d;
        } else {
            str = url + "?game_id=" + this.f44241d;
        }
        IntentUtil.getInstance().goShareWebActivity(this.f44240c, str);
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public GameMainV4DataBean.MemberFunBean getItem(int i4) {
        List<GameMainV4DataBean.MemberFunBean> list = this.f44239b;
        if (list != null) {
            return list.get(i4);
        }
        return null;
    }

    public void d(List<GameMainV4DataBean.MemberFunBean> list) {
        this.f44239b = list;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<GameMainV4DataBean.MemberFunBean> list = this.f44239b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        View view2;
        a aVar;
        if (view == null) {
            aVar = new a();
            view2 = LayoutInflater.from(this.f44240c).inflate(R.layout.item_vip_fun2, viewGroup, false);
            aVar.f44242a = (TextView) view2.findViewById(R.id.name);
            aVar.f44243b = (SimpleDraweeView) view2.findViewById(R.id.ic);
            view2.setTag(aVar);
        } else {
            view2 = view;
            aVar = (a) view.getTag();
        }
        if (getItem(i4) == null) {
            view2.setOnClickListener(null);
            return view2;
        }
        final GameMainV4DataBean.MemberFunBean item = getItem(i4);
        aVar.f44242a.setText(item.getTitle());
        MyImageLoader.h(aVar.f44243b, item.getPic());
        view2.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.b2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                c2.this.c(item, view3);
            }
        });
        return view2;
    }
}
