package com.join.mgps.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.BaseAppCompatActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.dto.FavoritesCenterData;
import com.join.mgps.dto.ForumResponse;
import it.sephiroth.android.library.widget.HListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_account_center_detial_new)
/* loaded from: classes4.dex */
public class AccountCenterDetialNewActivity extends BaseAppCompatActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    SimpleDraweeView f28300b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    SimpleDraweeView f28301c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f28302d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f28303e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f28304f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    RecyclerView f28305g;

    /* renamed from: h  reason: collision with root package name */
    com.join.mgps.rpc.b f28306h;

    /* renamed from: i  reason: collision with root package name */
    Context f28307i;

    /* renamed from: j  reason: collision with root package name */
    List<b> f28308j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends RecyclerView.Adapter {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 4;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i4) {
            return AccountCenterDetialNewActivity.this.f28308j.get(i4).f28310a;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i4) {
            if (getItemViewType(i4) != 29) {
                return;
            }
            ((c) viewHolder).f28313a.setAdapter((ListAdapter) new com.join.mgps.adapter.i(AccountCenterDetialNewActivity.this.f28307i, (List) AccountCenterDetialNewActivity.this.f28308j.get(i4).f28311b, 2));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
            if (i4 == 1) {
                new d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_title, viewGroup, false));
                return null;
            } else if (i4 != 29) {
                return null;
            } else {
                new c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detial_favortis_layout, viewGroup, false));
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        int f28310a;

        /* renamed from: b  reason: collision with root package name */
        Object f28311b;

        public b(int i4, Object obj) {
            this.f28310a = i4;
            this.f28311b = obj;
        }
    }

    /* loaded from: classes4.dex */
    class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        HListView f28313a;

        public c(View view) {
            super(view);
            this.f28313a = (HListView) view.findViewById(R.id.favoriteList);
        }
    }

    /* loaded from: classes4.dex */
    class d extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public TextView f28315a;

        /* renamed from: b  reason: collision with root package name */
        public LinearLayout f28316b;

        /* renamed from: c  reason: collision with root package name */
        public View f28317c;

        /* renamed from: d  reason: collision with root package name */
        public View f28318d;

        public d(View view) {
            super(view);
            this.f28315a = (TextView) view.findViewById(R.id.titleText);
            this.f28318d = view.findViewById(R.id.line_h);
            this.f28316b = (LinearLayout) view.findViewById(R.id.look_other);
            this.f28317c = view.findViewById(R.id.layoutTop);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f28306h = com.join.mgps.rpc.impl.a.c0();
        this.f28307i = this;
        this.f28305g.setLayoutManager(new LinearLayoutManager(this));
        getData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void f0(FavoritesCenterData favoritesCenterData) {
        String[] split;
        MyImageLoader.h(this.f28300b, favoritesCenterData.getMember_info().getPortrait());
        MyImageLoader.h(this.f28301c, favoritesCenterData.getMember_info().getPortrait());
        this.f28302d.setText(favoritesCenterData.getMember_info().getNick_name());
        this.f28303e.setText(favoritesCenterData.getMember_info().getRank());
        for (String str : favoritesCenterData.getMember_info().getTag_info().split(",")) {
            View inflate = LayoutInflater.from(this.f28307i).inflate(R.layout.gamedetail_item_tipitem, (ViewGroup) null);
            this.f28304f.addView(inflate);
            ((TextView) inflate.findViewById(R.id.tipText)).setText(str);
        }
        a aVar = new a();
        this.f28308j = new ArrayList();
        this.f28305g.setAdapter(aVar);
        if (favoritesCenterData.getCreate_group_list().size() > 0) {
            this.f28308j.add(new b(1, "创建的游戏单"));
            this.f28308j.add(new b(29, favoritesCenterData.getCreate_group_list()));
        }
        if (favoritesCenterData.getBook_group_list().size() > 0) {
            this.f28308j.add(new b(1, "订阅的游戏单"));
            this.f28308j.add(new b(29, favoritesCenterData.getBook_group_list()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getData() {
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
            HashMap hashMap = new HashMap();
            hashMap.put("uid", "" + accountData.getUid());
            hashMap.put("device_id", "");
            StringBuilder sb = new StringBuilder();
            sb.append("");
            RequestBeanUtil.getInstance(this);
            sb.append(RequestBeanUtil.getVersionAndVersionName());
            hashMap.put("version ", sb.toString());
            ForumResponse<FavoritesCenterData> Y = this.f28306h.Y(hashMap);
            if (Y == null || Y.getError() != 0) {
                return;
            }
            f0(Y.getData());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
