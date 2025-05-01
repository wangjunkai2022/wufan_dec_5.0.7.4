package com.join.mgps.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.FriendBean;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class FriendAddAdapter extends RecyclerView.Adapter {

    /* renamed from: a  reason: collision with root package name */
    private Context f41980a;

    /* renamed from: b  reason: collision with root package name */
    private List<FriendBean> f41981b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    a f41982c;

    /* loaded from: classes4.dex */
    public interface a {
        void P(FriendBean friendBean);
    }

    /* loaded from: classes4.dex */
    class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public TextView f41983a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f41984b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f41985c;

        /* renamed from: d  reason: collision with root package name */
        public SimpleDraweeView f41986d;

        public b(@NonNull View view) {
            super(view);
            this.f41983a = (TextView) view.findViewById(R.id.name);
            this.f41984b = (TextView) view.findViewById(R.id.desc);
            this.f41985c = (TextView) view.findViewById(R.id.button);
            this.f41986d = (SimpleDraweeView) view.findViewById(R.id.avatar);
        }
    }

    public FriendAddAdapter(Context context) {
        this.f41980a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(FriendBean friendBean, View view) {
        a aVar = this.f41982c;
        if (aVar != null) {
            aVar.P(friendBean);
        }
    }

    public List<FriendBean> b() {
        return this.f41981b;
    }

    public a c() {
        return this.f41982c;
    }

    public void e(List<FriendBean> list) {
        this.f41981b = list;
    }

    public void f(a aVar) {
        this.f41982c = aVar;
    }

    public Context getContext() {
        return this.f41980a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f41981b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i4) {
        if (viewHolder instanceof b) {
            b bVar = (b) viewHolder;
            final FriendBean friendBean = this.f41981b.get(i4);
            bVar.f41983a.setText(friendBean.getNickName());
            bVar.f41984b.setText(friendBean.getAccount());
            MyImageLoader.h(bVar.f41986d, friendBean.getAvatar());
            if (TextUtils.isEmpty(friendBean.getFriendRequestType())) {
                return;
            }
            if (friendBean.getFriendRequestType().equals("ACCEPT")) {
                bVar.f41985c.setText("已添加");
                bVar.f41985c.setSelected(true);
                bVar.f41985c.setOnClickListener(null);
            } else if (!friendBean.getFriendRequestType().equals("REJECT") && !friendBean.getFriendRequestType().equals("INIT")) {
                bVar.f41985c.setText("加好友");
                bVar.f41985c.setSelected(false);
                bVar.f41985c.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.t
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FriendAddAdapter.this.d(friendBean, view);
                    }
                });
            } else {
                bVar.f41985c.setText("已发送");
                bVar.f41985c.setSelected(true);
                bVar.f41985c.setOnClickListener(null);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
        return new b(LayoutInflater.from(this.f41980a).inflate(R.layout.item_friend_add, viewGroup, false));
    }

    public void setContext(Context context) {
        this.f41980a = context;
    }
}
