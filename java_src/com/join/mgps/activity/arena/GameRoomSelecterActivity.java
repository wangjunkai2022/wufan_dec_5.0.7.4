package com.join.mgps.activity.arena;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.BaseAppCompatActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.l2;
import com.join.mgps.adapter.GameInfoAdapterV2;
import com.join.mgps.dto.ArenaGameRoomListConfig;
import com.join.mgps.dto.GameConfig;
import com.join.mgps.dto.GameInfoBean;
import com.join.mgps.dto.GameListBannerBean;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.ResultResMainBean;
import com.join.mgps.rpc.impl.l;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
@EActivity(R.layout.newarena_gameroom_selecter_activity)
/* loaded from: classes4.dex */
public class GameRoomSelecterActivity extends BaseAppCompatActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f38838b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    RecyclerView f38839c;

    /* renamed from: d  reason: collision with root package name */
    Context f38840d;

    /* renamed from: e  reason: collision with root package name */
    g f38841e;
    @Extra

    /* renamed from: f  reason: collision with root package name */
    GameInfoBean f38842f;

    /* renamed from: g  reason: collision with root package name */
    GameInfoAdapterV2 f38843g;

    /* renamed from: h  reason: collision with root package name */
    List<GameInfoBean> f38844h;

    /* renamed from: i  reason: collision with root package name */
    List<GameInfoBean> f38845i = new ArrayList();

    /* loaded from: classes4.dex */
    class a implements e {
        a() {
        }

        @Override // com.join.mgps.activity.arena.GameRoomSelecterActivity.e
        public void onItemClick(int i4) {
            GameRoomSelecterActivity gameRoomSelecterActivity = GameRoomSelecterActivity.this;
            gameRoomSelecterActivity.f38842f = gameRoomSelecterActivity.f38845i.get(i4);
            GameRoomSelecterActivity.this.i0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements GameInfoAdapterV2.e {
        b() {
        }

        @Override // com.join.mgps.adapter.GameInfoAdapterV2.e
        public void a(int i4) {
            Intent intent = new Intent();
            intent.putExtra("mGameInfo", GameRoomSelecterActivity.this.f38844h.get(i4));
            GameRoomSelecterActivity.this.setResult(10001, intent);
            GameRoomSelecterActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements Callback<ResultMainBean<ArenaGameRoomListConfig>> {
        c() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResultMainBean<ArenaGameRoomListConfig>> call, Throwable th) {
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResultMainBean<ArenaGameRoomListConfig>> call, Response<ResultMainBean<ArenaGameRoomListConfig>> response) {
            ResultMainBean<ArenaGameRoomListConfig> body = response.body();
            if (body == null || body.getMessages().getData() == null) {
                GameRoomSelecterActivity.this.showToast("获取游戏配置信息失败！");
            } else if (body.getMessages().getData().getCurrent_collection_cfg() == null) {
                GameRoomSelecterActivity.this.h0();
            } else {
                String collection_id = body.getMessages().getData().getCurrent_collection_cfg().getCollection_id();
                if (TextUtils.isEmpty(collection_id) || Integer.parseInt(collection_id) <= 0) {
                    GameRoomSelecterActivity.this.h0();
                } else if (body.getMessages().getData().getGame_list() == null || body.getMessages().getData().getGame_list().size() <= 0) {
                    GameRoomSelecterActivity.this.h0();
                } else {
                    List<GameConfig> game_list = body.getMessages().getData().getGame_list();
                    ArrayList arrayList = new ArrayList();
                    for (GameConfig gameConfig : game_list) {
                        GameInfoBean gameInfoBean = new GameInfoBean();
                        gameInfoBean.setCollection_id(gameConfig.getCollection_id());
                        gameInfoBean.setPic_remote(gameConfig.getGame_ico());
                        gameInfoBean.setGame_ico(gameConfig.getGame_ico());
                        gameInfoBean.setGame_id(gameConfig.getGame_id());
                        gameInfoBean.setGame_name(gameConfig.getGame_name());
                        gameInfoBean.setRoom_count(gameConfig.getRoom_count());
                        gameInfoBean.setTitle(gameConfig.getTitle());
                        arrayList.add(gameInfoBean);
                    }
                    GameRoomSelecterActivity.this.f38844h.clear();
                    GameRoomSelecterActivity.this.f38844h.addAll(arrayList);
                    GameRoomSelecterActivity.this.f38843g.notifyDataSetChanged();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements Callback<ResultResMainBean<GameListBannerBean>> {
        d() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResultResMainBean<GameListBannerBean>> call, Throwable th) {
            GameRoomSelecterActivity.this.finish();
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResultResMainBean<GameListBannerBean>> call, Response<ResultResMainBean<GameListBannerBean>> response) {
            ResultResMainBean<GameListBannerBean> body = response.body();
            if (body != null) {
                try {
                    List<GameInfoBean> game_list = body.getData().getGame_list();
                    if (game_list != null && game_list.size() > 0) {
                        GameRoomSelecterActivity.this.f38845i.addAll(game_list);
                        GameRoomSelecterActivity.this.f38841e.notifyDataSetChanged();
                    } else {
                        GameRoomSelecterActivity.this.finish();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    GameRoomSelecterActivity.this.finish();
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface e {
        void onItemClick(int i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        View f38850a;

        /* renamed from: b  reason: collision with root package name */
        TextView f38851b;

        public f(@NonNull View view) {
            super(view);
            this.f38850a = view.findViewById(R.id.main);
            this.f38851b = (TextView) view.findViewById(R.id.name);
        }
    }

    /* loaded from: classes4.dex */
    class g extends RecyclerView.Adapter<f> {

        /* renamed from: a  reason: collision with root package name */
        private e f38853a;

        /* renamed from: b  reason: collision with root package name */
        private int f38854b = -1024;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f38856b;

            a(int i4) {
                this.f38856b = i4;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                g gVar = g.this;
                gVar.notifyItemChanged(gVar.f38854b);
                g.this.f38854b = this.f38856b;
                g gVar2 = g.this;
                gVar2.notifyItemChanged(gVar2.f38854b);
                g.this.f38853a.onItemClick(this.f38856b);
            }
        }

        g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: d */
        public void onBindViewHolder(f fVar, int i4) {
            GameInfoBean gameInfoBean = GameRoomSelecterActivity.this.f38845i.get(i4);
            if (this.f38854b == -1024 && gameInfoBean.getCollection_id().equals(GameRoomSelecterActivity.this.f38842f.getCollection_id())) {
                fVar.f38850a.setSelected(true);
            } else {
                fVar.f38850a.setSelected(this.f38854b == i4);
            }
            fVar.f38851b.setText(gameInfoBean.getTitle());
            fVar.f38850a.setOnClickListener(new a(i4));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* renamed from: e */
        public f onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
            return new f(LayoutInflater.from(GameRoomSelecterActivity.this.f38840d).inflate(R.layout.newarena_roomselecter_item, viewGroup, false));
        }

        public void f(e eVar) {
            this.f38853a = eVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return GameRoomSelecterActivity.this.f38845i.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        l2.a(this.f38840d).b("获取数据失败");
    }

    private void j0() {
        l.n0().m0().u(AccountUtil_.getInstance_(this.f38840d).getUid()).enqueue(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showToast(String str) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f38839c.setLayoutManager(new LinearLayoutManager(this));
        g gVar = new g();
        this.f38841e = gVar;
        gVar.f(new a());
        this.f38839c.setAdapter(this.f38841e);
        this.f38840d = this;
        this.f38838b.setLayoutManager(new GridLayoutManager(this, 2));
        GameInfoAdapterV2 gameInfoAdapterV2 = new GameInfoAdapterV2(this.f38840d, false);
        this.f38843g = gameInfoAdapterV2;
        gameInfoAdapterV2.f(new b());
        this.f38844h = this.f38843g.b();
        this.f38838b.setAdapter(this.f38843g);
        i0();
        j0();
    }

    void i0() {
        String collection_id;
        int i4;
        try {
            if (TextUtils.isEmpty(this.f38842f.getCollection_id())) {
                collection_id = this.f38842f.getGame_id();
                i4 = 1;
            } else {
                collection_id = this.f38842f.getCollection_id();
                i4 = 2;
            }
            com.join.mgps.rpc.impl.d.P1().O1().q(RequestBeanUtil.getInstance(this).getRequestArenaRoomListArgs(collection_id, i4)).enqueue(new c());
        } catch (Exception unused) {
            h0();
        }
    }
}
