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
import com.join.mgps.dto.FriendBean;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FriendMsgLikeAdapter.java */
/* loaded from: classes4.dex */
public class g0 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    List<FriendBean> f44389b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    Context f44390c;

    /* renamed from: d  reason: collision with root package name */
    a f44391d;

    /* compiled from: FriendMsgLikeAdapter.java */
    /* loaded from: classes4.dex */
    public interface a {
        void m(FriendBean friendBean);
    }

    /* compiled from: FriendMsgLikeAdapter.java */
    /* loaded from: classes4.dex */
    class b {

        /* renamed from: a  reason: collision with root package name */
        public SimpleDraweeView f44392a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f44393b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f44394c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f44395d;

        /* renamed from: e  reason: collision with root package name */
        public View f44396e;

        b() {
        }
    }

    public g0(Context context) {
        this.f44390c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(FriendBean friendBean, View view) {
        a aVar = this.f44391d;
        if (aVar != null) {
            aVar.m(friendBean);
        }
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public FriendBean getItem(int i4) {
        return this.f44389b.get(i4);
    }

    public List<FriendBean> c() {
        return this.f44389b;
    }

    public a d() {
        return this.f44391d;
    }

    public void f(List<FriendBean> list) {
        this.f44389b = list;
    }

    public void g(a aVar) {
        this.f44391d = aVar;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44389b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        View view2;
        b bVar;
        if (view == null) {
            bVar = new b();
            view2 = LayoutInflater.from(this.f44390c).inflate(R.layout.item_friend_like_record, viewGroup, false);
            bVar.f44392a = (SimpleDraweeView) view2.findViewById(R.id.avatar);
            bVar.f44393b = (TextView) view2.findViewById(R.id.name);
            bVar.f44394c = (TextView) view2.findViewById(R.id.msg);
            bVar.f44395d = (TextView) view2.findViewById(R.id.time);
            bVar.f44396e = view2.findViewById(R.id.likeDot);
            view2.setTag(bVar);
        } else {
            view2 = view;
            bVar = (b) view.getTag();
        }
        final FriendBean item = getItem(i4);
        MyImageLoader.x(bVar.f44392a, item.getAvatar());
        bVar.f44393b.setText(item.getNickName());
        bVar.f44394c.setText(item.getMessage());
        bVar.f44395d.setText(item.getTime());
        if (item.getReadFlag() == 1) {
            bVar.f44396e.setVisibility(8);
        } else {
            bVar.f44396e.setVisibility(0);
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                g0.this.e(item, view3);
            }
        });
        return view2;
    }
}
