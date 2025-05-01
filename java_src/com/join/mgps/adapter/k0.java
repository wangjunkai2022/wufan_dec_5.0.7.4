package com.join.mgps.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.FriendBean;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FriendMsgRequestAdapter.java */
/* loaded from: classes4.dex */
public class k0 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    List<FriendBean> f44477b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    Context f44478c;

    /* renamed from: d  reason: collision with root package name */
    a f44479d;

    /* compiled from: FriendMsgRequestAdapter.java */
    /* loaded from: classes4.dex */
    public interface a {
        void E(FriendBean friendBean);

        void m(FriendBean friendBean);

        void u(FriendBean friendBean);
    }

    /* compiled from: FriendMsgRequestAdapter.java */
    /* loaded from: classes4.dex */
    class b {

        /* renamed from: a  reason: collision with root package name */
        public SimpleDraweeView f44480a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f44481b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f44482c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f44483d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f44484e;

        b() {
        }
    }

    public k0(Context context) {
        this.f44478c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(FriendBean friendBean, View view) {
        a aVar = this.f44479d;
        if (aVar != null) {
            aVar.m(friendBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(FriendBean friendBean, View view) {
        a aVar = this.f44479d;
        if (aVar != null) {
            aVar.u(friendBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(FriendBean friendBean, View view) {
        a aVar = this.f44479d;
        if (aVar != null) {
            aVar.E(friendBean);
        }
    }

    @Override // android.widget.Adapter
    /* renamed from: d */
    public FriendBean getItem(int i4) {
        return this.f44477b.get(i4);
    }

    public List<FriendBean> e() {
        return this.f44477b;
    }

    public a f() {
        return this.f44479d;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44477b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        View view2;
        b bVar;
        String str;
        if (view == null) {
            bVar = new b();
            view2 = LayoutInflater.from(this.f44478c).inflate(R.layout.item_friend_add_req, viewGroup, false);
            bVar.f44480a = (SimpleDraweeView) view2.findViewById(R.id.avatar);
            bVar.f44481b = (TextView) view2.findViewById(R.id.name);
            bVar.f44482c = (TextView) view2.findViewById(R.id.msg);
            bVar.f44483d = (TextView) view2.findViewById(R.id.decline);
            bVar.f44484e = (TextView) view2.findViewById(R.id.accept);
            view2.setTag(bVar);
        } else {
            view2 = view;
            bVar = (b) view.getTag();
        }
        final FriendBean item = getItem(i4);
        MyImageLoader.x(bVar.f44480a, item.getAvatar());
        bVar.f44481b.setText(item.getNickName());
        bVar.f44482c.setText(item.getRequestIfo());
        if (item.getStatus() == 0) {
            view2.setBackgroundResource(R.drawable.shape_friend_req_bg);
            bVar.f44483d.setVisibility(0);
            bVar.f44484e.setBackgroundResource(R.drawable.shape_friend_accept);
            bVar.f44484e.setTextColor(Color.parseColor("#ffffff"));
        } else {
            view2.setBackgroundColor(Color.parseColor("#FF1E2025"));
            bVar.f44483d.setVisibility(4);
            bVar.f44484e.setBackgroundColor(this.f44478c.getResources().getColor(R.color.transparent));
            bVar.f44484e.setTextColor(Color.parseColor("#FFB5CBD5"));
        }
        if (item.getStatus() == 0) {
            str = "接受";
        } else if (item.getStatus() == 1) {
            str = "已接受";
        } else if (item.getStatus() == 2) {
            str = "已拒绝";
        } else {
            str = item.getStatus() == 3 ? "已过期" : "";
        }
        bVar.f44484e.setText(str);
        bVar.f44480a.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                k0.this.g(item, view3);
            }
        });
        bVar.f44483d.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                k0.this.h(item, view3);
            }
        });
        if (item.getStatus() == 0) {
            bVar.f44484e.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    k0.this.i(item, view3);
                }
            });
        } else {
            bVar.f44484e.setOnClickListener(null);
        }
        return view2;
    }

    public void j(List<FriendBean> list) {
        this.f44477b = list;
    }

    public void k(a aVar) {
        this.f44479d = aVar;
    }
}
