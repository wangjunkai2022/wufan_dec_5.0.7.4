package com.join.mgps.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.location.LocationManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.dto.FriendBean;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes4.dex */
public class FriendListAdapter extends RecyclerView.Adapter {

    /* renamed from: a  reason: collision with root package name */
    private Context f41988a;

    /* renamed from: b  reason: collision with root package name */
    private int f41989b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f41990c = false;

    /* renamed from: d  reason: collision with root package name */
    private List<FriendBean> f41991d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private List<FriendBean> f41992e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private List<FriendBean> f41993f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private b f41994g;

    /* loaded from: classes4.dex */
    public class FriendHeaderViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public ImageView f41995a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f41996b;

        /* renamed from: c  reason: collision with root package name */
        private View f41997c;

        public FriendHeaderViewHolder(@NonNull View view) {
            super(view);
            this.f41995a = (ImageView) view.findViewById(R.id.icCollapse);
            this.f41996b = (TextView) view.findViewById(R.id.onlineNum);
            this.f41997c = view.findViewById(R.id.add);
        }
    }

    /* loaded from: classes4.dex */
    public class FriendRecommHeaderViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public View f41999a;

        /* renamed from: b  reason: collision with root package name */
        public View f42000b;

        public FriendRecommHeaderViewHolder(@NonNull View view) {
            super(view);
            this.f42000b = view.findViewById(R.id.label);
            this.f41999a = view.findViewById(R.id.reqPermission);
        }
    }

    /* loaded from: classes4.dex */
    public class FriendViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public SimpleDraweeView f42002a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f42003b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f42004c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f42005d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f42006e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f42007f;

        /* renamed from: g  reason: collision with root package name */
        public ImageView f42008g;

        /* renamed from: h  reason: collision with root package name */
        public ImageView f42009h;

        /* renamed from: i  reason: collision with root package name */
        public ImageView f42010i;

        /* renamed from: j  reason: collision with root package name */
        public ImageView f42011j;

        /* renamed from: k  reason: collision with root package name */
        public View f42012k;

        public FriendViewHolder(@NonNull View view) {
            super(view);
            this.f42002a = (SimpleDraweeView) view.findViewById(R.id.avatar);
            this.f42003b = (TextView) view.findViewById(R.id.name);
            this.f42005d = (TextView) view.findViewById(R.id.locTxt);
            this.f42006e = (TextView) view.findViewById(R.id.levelTxt);
            this.f42007f = (TextView) view.findViewById(R.id.button);
            this.f42008g = (ImageView) view.findViewById(R.id.icLoc);
            this.f42009h = (ImageView) view.findViewById(R.id.icLevel);
            this.f42010i = (ImageView) view.findViewById(R.id.icLevel1);
            this.f42011j = (ImageView) view.findViewById(R.id.icLevel1Bg);
            this.f42004c = (TextView) view.findViewById(R.id.recommend);
            this.f42012k = view.findViewById(R.id.offlineOver);
        }
    }

    /* loaded from: classes4.dex */
    class a extends RecyclerView.ViewHolder {
        a(View view) {
            super(view);
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void K(String str);

        void O(FriendBean friendBean);

        void n(FriendBean friendBean);

        void u();
    }

    public FriendListAdapter(Context context) {
        this.f41988a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(View view) {
        this.f41988a.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int B(FriendBean friendBean, FriendBean friendBean2) {
        if (friendBean == null || friendBean2 == null) {
            if (friendBean != friendBean2) {
                if (friendBean == null) {
                    return 1;
                }
                if (friendBean2 == null) {
                    return -1;
                }
            }
            return 0;
        }
        if (friendBean.getState() != friendBean2.getState()) {
            if (friendBean.getState() == 0) {
                return -1;
            }
            if (friendBean2.getState() == 0) {
                return 1;
            }
        }
        if (friendBean.isRecommend() != friendBean2.isRecommend()) {
            if (friendBean.isRecommend()) {
                return 1;
            }
            if (friendBean2.isRecommend()) {
                return -1;
            }
        }
        return 0;
    }

    private boolean l() {
        return ((LocationManager) this.f41988a.getSystemService("location")).isProviderEnabled("gps");
    }

    private int m(int i4) {
        if (i4 == 0) {
            return i4;
        }
        int i5 = i4 - 1;
        if (i5 < this.f41991d.size()) {
            return i5;
        }
        int size = i5 - this.f41991d.size();
        if (this.f41993f.size() <= 0 || size == 0) {
            return size;
        }
        int i6 = size - 1;
        return i6 < this.f41993f.size() ? i6 : i6 - this.f41993f.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(FriendBean friendBean, View view) {
        if (IntentUtil.getInstance().goLoginBattle(view.getContext())) {
            return;
        }
        if (com.wufan.friend.chat.c.u().D()) {
            k("您的对战功能已被封禁！");
            return;
        }
        b bVar = this.f41994g;
        if (bVar != null) {
            bVar.O(friendBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(FriendBean friendBean, View view) {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(view.getContext()).getAccountData();
        Ext ext = new Ext();
        if (accountData != null) {
            ext.setUid(accountData.getUid());
        }
        ext.setPosition(friendBean.isRecommend() ? "1" : "0");
        com.papa.sim.statistic.p.l(view.getContext()).O1(Event.LobbyInvite, ext);
        if (IntentUtil.getInstance().goLoginBattle(view.getContext())) {
            return;
        }
        if (com.wufan.friend.chat.c.u().D()) {
            k("您的对战功能已被封禁！");
        } else if (friendBean.isBanned()) {
            k("邀请失败：好友已被封禁！");
        } else if (friendBean.getState() != 0) {
            com.join.mgps.Util.l2.a(view.getContext()).b("对方已离线，无法约战！");
        } else {
            if ((accountData != null ? AccountUtil_.getInstance_(view.getContext()).getAccountData().O1() : 0L) < 10) {
                k("铜板数不足，对战至少需要10铜板");
                return;
            }
            b bVar = this.f41994g;
            if (bVar != null) {
                bVar.n(friendBean);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(FriendBean friendBean, View view) {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(view.getContext()).getAccountData();
        Ext ext = new Ext();
        if (accountData != null) {
            ext.setUid(accountData.getUid());
        }
        ext.setPosition(friendBean.isRecommend() ? "1" : "0");
        com.papa.sim.statistic.p.l(view.getContext()).O1(Event.LobbyInvite, ext);
        if (IntentUtil.getInstance().goLoginBattle(view.getContext())) {
            return;
        }
        if (com.wufan.friend.chat.c.u().D()) {
            k("您的对战功能已被封禁！");
        } else if (friendBean.isBanned()) {
            k("邀请失败：好友已被封禁！");
        } else {
            if ((accountData != null ? AccountUtil_.getInstance_(view.getContext()).getAccountData().O1() : 0L) < 10) {
                k("铜板数不足，对战至少需要10铜板");
                return;
            }
            b bVar = this.f41994g;
            if (bVar != null) {
                bVar.n(friendBean);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(FriendBean friendBean, View view) {
        b bVar = this.f41994g;
        if (bVar != null) {
            bVar.K(friendBean.getUid() + "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(FriendBean friendBean, View view) {
        b bVar = this.f41994g;
        if (bVar != null) {
            bVar.K(friendBean.getUid() + "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(FriendBean friendBean, View view) {
        b bVar = this.f41994g;
        if (bVar != null) {
            bVar.n(friendBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(View view) {
        b bVar = this.f41994g;
        if (bVar != null) {
            bVar.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(View view) {
        if (this.f41990c) {
            if (this.f41992e.size() != 0) {
                this.f41991d.addAll(this.f41992e);
                this.f41992e.clear();
                notifyItemRangeInserted(1, this.f41991d.size());
            }
        } else if (this.f41991d.size() != 0) {
            this.f41992e.addAll(this.f41991d);
            this.f41991d.clear();
            notifyItemRangeRemoved(1, this.f41992e.size());
        }
        this.f41990c = !this.f41990c;
        notifyItemChanged(0);
    }

    void C(@NonNull RecyclerView.ViewHolder viewHolder, int i4) {
        try {
            if (viewHolder instanceof FriendViewHolder) {
                FriendViewHolder friendViewHolder = (FriendViewHolder) viewHolder;
                final FriendBean friendBean = i4 < this.f41991d.size() ? this.f41991d.get(i4) : null;
                if (friendBean == null) {
                    return;
                }
                RoundingParams roundingParams = new RoundingParams();
                roundingParams.s(this.f41988a.getResources().getDimensionPixelOffset(R.dimen.wdp47));
                roundingParams.v(true);
                MyImageLoader.v(((FriendViewHolder) viewHolder).f42002a, R.drawable.main_normal_icon, friendBean.getAvatar(), roundingParams);
                friendViewHolder.f42003b.setText(friendBean.getNickName());
                friendViewHolder.f42009h.setVisibility(8);
                friendViewHolder.f42008g.setVisibility(8);
                friendViewHolder.f42006e.setVisibility(4);
                TextView textView = friendViewHolder.f42005d;
                TextView textView2 = friendViewHolder.f42007f;
                if (friendBean.getState() == 0) {
                    if (!TextUtils.isEmpty(friendBean.getGameName())) {
                        textView.setText(friendBean.getGameName());
                        textView.setTextColor(Color.parseColor("#FFFFA841"));
                    } else {
                        textView.setTextColor(Color.parseColor("#FF16DB16"));
                        textView.setText("在线");
                    }
                } else {
                    textView.setTextColor(Color.parseColor("#FF6E6E6E"));
                    textView.setText("离线");
                }
                if (!TextUtils.isEmpty(friendBean.getGameId()) && !"0".equals(friendBean.getGameId())) {
                    textView2.setVisibility(0);
                    if (friendBean.getRoomId() != 0) {
                        textView2.setText("加入");
                        if (friendBean.getState() == 0) {
                            textView.setTextColor(Color.parseColor("#FFFFA841"));
                        }
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.a0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                FriendListAdapter.this.s(friendBean, view);
                            }
                        });
                    } else {
                        if (friendBean.getState() == 0) {
                            textView.setTextColor(Color.parseColor("#FF16DB16"));
                        }
                        textView2.setText("约战");
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.c0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                FriendListAdapter.this.t(friendBean, view);
                            }
                        });
                    }
                } else if (friendBean.getState() == 0) {
                    textView2.setVisibility(0);
                    textView2.setText("约战");
                    textView2.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.b0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            FriendListAdapter.this.u(friendBean, view);
                        }
                    });
                }
                com.wufan.friend.chat.c u4 = com.wufan.friend.chat.c.u();
                if (u4.E(friendBean.getUid() + "")) {
                    textView2.setSelected(true);
                    textView2.setEnabled(false);
                } else {
                    textView2.setSelected(false);
                    textView2.setEnabled(true);
                }
                H(friendViewHolder.f42009h, friendViewHolder.f42006e, friendBean.getLevel());
                I(friendViewHolder.f42011j, friendViewHolder.f42010i, friendBean.getLevel());
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.join.mgps.adapter.d0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FriendListAdapter.this.v(friendBean, view);
                    }
                };
                friendViewHolder.f42002a.setOnClickListener(onClickListener);
                friendViewHolder.f42003b.setOnClickListener(onClickListener);
                if (friendBean.isRecommend()) {
                    friendViewHolder.f42010i.setVisibility(0);
                    friendViewHolder.f42004c.setVisibility(0);
                    friendViewHolder.f42007f.setVisibility(0);
                    friendViewHolder.f42012k.setVisibility(8);
                    friendViewHolder.f42003b.setTextColor(Color.parseColor("#ffffff"));
                } else if (friendBean.getState() == 0) {
                    friendViewHolder.f42004c.setVisibility(8);
                    if (!TextUtils.isEmpty(friendBean.getGameId()) && !"0".equals(friendBean.getGameId())) {
                        if (friendBean.getRoomType() != 31 && friendBean.getRoomType() != 35) {
                            if (friendBean.getRoomType() != 0) {
                                friendViewHolder.f42007f.setVisibility(4);
                            }
                        }
                        friendViewHolder.f42007f.setVisibility(0);
                    } else {
                        friendViewHolder.f42007f.setVisibility(0);
                    }
                    friendViewHolder.f42010i.setVisibility(0);
                    friendViewHolder.f42012k.setVisibility(8);
                    friendViewHolder.f42003b.setTextColor(Color.parseColor("#ffffff"));
                } else {
                    friendViewHolder.f42010i.setVisibility(4);
                    friendViewHolder.f42004c.setVisibility(8);
                    friendViewHolder.f42007f.setVisibility(4);
                    friendViewHolder.f42012k.setVisibility(0);
                    friendViewHolder.f42003b.setTextColor(Color.parseColor("#FFA0A0A0"));
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void D(boolean z4) {
        this.f41990c = z4;
    }

    public void E(int i4) {
        this.f41989b = i4;
    }

    public void F(List<FriendBean> list) {
        this.f41991d = list;
    }

    public void G(List<FriendBean> list) {
        this.f41993f = list;
    }

    void H(ImageView imageView, TextView textView, int i4) {
        String str;
        if (i4 == 1) {
            imageView.setBackgroundResource(R.drawable.gameleve1);
            str = "见习";
        } else if (i4 == 2) {
            imageView.setBackgroundResource(R.drawable.gameleve3);
            str = "资深";
        } else if (i4 == 3) {
            imageView.setBackgroundResource(R.drawable.gameleve2);
            str = "精英";
        } else if (i4 == 4) {
            imageView.setBackgroundResource(R.drawable.gameleve4);
            str = "宗师";
        } else if (i4 != 5) {
            str = "";
        } else {
            imageView.setBackgroundResource(R.drawable.gameleve5);
            str = "传说";
        }
        if (textView != null) {
            textView.setText(str);
        }
    }

    void I(View view, ImageView imageView, int i4) {
        if (i4 > 0 && i4 < 7) {
            imageView.setVisibility(0);
            view.setVisibility(0);
        } else {
            imageView.setVisibility(8);
            view.setVisibility(8);
        }
        switch (i4) {
            case 1:
                imageView.setBackgroundResource(R.drawable.mg_proficiency_level_trainee);
                view.setBackgroundResource(R.drawable.bg_border_yellow);
                return;
            case 2:
                imageView.setBackgroundResource(R.drawable.mg_proficiency_level_senior);
                view.setBackgroundResource(R.drawable.mg_proficiency_level_senior_bg);
                return;
            case 3:
                imageView.setBackgroundResource(R.drawable.mg_proficiency_level_elite);
                view.setBackgroundResource(R.drawable.mg_proficiency_level_elite_bg);
                return;
            case 4:
                imageView.setBackgroundResource(R.drawable.mg_proficiency_level_master);
                view.setBackgroundResource(R.drawable.mg_proficiency_level_master_bg);
                return;
            case 5:
                imageView.setBackgroundResource(R.drawable.mg_proficiency_level_legend);
                view.setBackgroundResource(R.drawable.mg_proficiency_level_legend_bg);
                return;
            case 6:
                imageView.setBackgroundResource(R.drawable.mg_proficiency_level_special_guest);
                view.setBackgroundResource(R.drawable.mg_proficiency_level_special_guest_bg);
                return;
            default:
                imageView.setVisibility(8);
                view.setVisibility(8);
                return;
        }
    }

    public void J(b bVar) {
        this.f41994g = bVar;
    }

    public void K() {
        List<FriendBean> list = this.f41991d;
        if (list == null || list.size() == 0) {
            return;
        }
        try {
            Collections.sort(this.f41991d, new Comparator() { // from class: com.join.mgps.adapter.e0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int B;
                    B = FriendListAdapter.B((FriendBean) obj, (FriendBean) obj2);
                    return B;
                }
            });
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<FriendBean> list = this.f41991d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i4) {
        return 2;
    }

    void k(String str) {
        com.join.mgps.Util.l2.a(this.f41988a).b(str);
    }

    public int n() {
        return this.f41989b;
    }

    public List<FriendBean> o() {
        return this.f41991d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i4) {
        int itemViewType = getItemViewType(i4);
        if (viewHolder instanceof FriendViewHolder) {
            int m4 = m(i4);
            if (itemViewType == 2) {
                C(viewHolder, i4);
            } else if (itemViewType == 4) {
                final FriendBean friendBean = m4 < this.f41993f.size() ? this.f41993f.get(m4) : null;
                if (friendBean == null) {
                    return;
                }
                FriendViewHolder friendViewHolder = (FriendViewHolder) viewHolder;
                MyImageLoader.x(friendViewHolder.f42002a, friendBean.getAvatar());
                friendViewHolder.f42003b.setText(friendBean.getNickName());
                friendViewHolder.f42009h.setVisibility(8);
                friendViewHolder.f42006e.setVisibility(4);
                friendViewHolder.f42008g.setVisibility(8);
                friendViewHolder.f42005d.setVisibility(8);
                H(friendViewHolder.f42009h, friendViewHolder.f42006e, friendBean.getLevel());
                I(friendViewHolder.f42011j, friendViewHolder.f42010i, friendBean.getLevel());
                if (!TextUtils.isEmpty(friendBean.getGameName())) {
                    friendViewHolder.f42005d.setVisibility(0);
                    friendViewHolder.f42005d.setText(friendBean.getGameName());
                    friendViewHolder.f42005d.setTextColor(Color.parseColor("#FFFFA841"));
                }
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.join.mgps.adapter.z
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FriendListAdapter.this.w(friendBean, view);
                    }
                };
                friendViewHolder.f42002a.setOnClickListener(onClickListener);
                friendViewHolder.f42003b.setOnClickListener(onClickListener);
                friendViewHolder.f42007f.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.y
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FriendListAdapter.this.x(friendBean, view);
                    }
                });
            }
        } else if (viewHolder instanceof FriendHeaderViewHolder) {
            int size = this.f41991d.size();
            if (this.f41990c) {
                size = this.f41992e.size();
            }
            FriendHeaderViewHolder friendHeaderViewHolder = (FriendHeaderViewHolder) viewHolder;
            TextView textView = friendHeaderViewHolder.f41996b;
            textView.setText("在线(" + size + net.lingala.zip4j.util.e.F0 + this.f41989b + ")");
            friendHeaderViewHolder.f41997c.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.w
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FriendListAdapter.this.y(view);
                }
            });
            if (this.f41990c) {
                friendHeaderViewHolder.f41995a.setBackgroundResource(R.drawable.ic_add);
            } else {
                friendHeaderViewHolder.f41995a.setBackgroundResource(R.drawable.ic_minus);
            }
            View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.join.mgps.adapter.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FriendListAdapter.this.z(view);
                }
            };
            friendHeaderViewHolder.f41995a.setOnClickListener(onClickListener2);
            friendHeaderViewHolder.f41996b.setOnClickListener(onClickListener2);
        } else if (viewHolder instanceof FriendRecommHeaderViewHolder) {
            FriendRecommHeaderViewHolder friendRecommHeaderViewHolder = (FriendRecommHeaderViewHolder) viewHolder;
            friendRecommHeaderViewHolder.f42000b.setVisibility(8);
            friendRecommHeaderViewHolder.f41999a.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FriendListAdapter.this.A(view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
        if (i4 == 1) {
            return new FriendHeaderViewHolder(LayoutInflater.from(this.f41988a).inflate(R.layout.item_friend_item_header, viewGroup, false));
        }
        if (i4 == 2 || i4 == 4) {
            return new FriendViewHolder(LayoutInflater.from(this.f41988a).inflate(R.layout.item_friend_item, viewGroup, false));
        }
        if (i4 == 3) {
            return new FriendRecommHeaderViewHolder(LayoutInflater.from(this.f41988a).inflate(R.layout.item_friend_item_header_recommend, viewGroup, false));
        }
        return new a(new View(this.f41988a));
    }

    public List<FriendBean> p() {
        return this.f41993f;
    }

    public b q() {
        return this.f41994g;
    }

    public boolean r() {
        return this.f41990c;
    }
}
