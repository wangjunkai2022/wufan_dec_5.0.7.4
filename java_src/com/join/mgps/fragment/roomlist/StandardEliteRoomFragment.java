package com.join.mgps.fragment.roomlist;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.AbsListView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.mgsim.arena.AreaInfo;
import app.mgsim.arena.SimpleWrapperRoom;
import b2.o;
import b2.p;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.b0;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.v0;
import com.join.mgps.activity.arena.GameRoomListActivity;
import com.join.mgps.activity.arena.GameRoomListActivity_;
import com.join.mgps.activity.arena.NewArenaDownloadActivity_;
import com.join.mgps.adapter.GameListAdapter;
import com.join.mgps.customview.input.InputNumView;
import com.join.mgps.customview.y;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.dialog.PlugInstallDialog_;
import com.join.mgps.dialog.d1;
import com.join.mgps.dto.FriendBean;
import com.join.mgps.dto.GameConfig;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.papa91.arc.ext.Log;
import com.papa91.battle.protocol.Platform;
import com.papa91.battle.protocol.RoomPosition;
import com.papa91.battle.protocol.SimpleRoom;
import com.wufan.user.service.protobuf.n0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_standardorelite_room)
/* loaded from: classes3.dex */
public class StandardEliteRoomFragment extends Fragment {
    private static final int M = 1000;
    private static Field N = null;
    private static Method O = null;
    private static final int P = 1012;
    private static final int Q = 1013;
    public static final int R = 1014;
    public static final int S = 1015;
    private static final String T = "StandardEliteRoomFragment";
    private Dialog E;
    private n J;
    @Bean

    /* renamed from: b  reason: collision with root package name */
    com.join.mgps.Util.b f53310b;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f53315g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    XRecyclerView f53316h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    PtrClassicFrameLayout f53317i;

    /* renamed from: j  reason: collision with root package name */
    GameRoomListActivity_ f53318j;

    /* renamed from: k  reason: collision with root package name */
    private GameListAdapter f53319k;

    /* renamed from: l  reason: collision with root package name */
    private GridLayoutManager f53320l;

    /* renamed from: r  reason: collision with root package name */
    private com.join.mgps.dialog.j f53326r;

    /* renamed from: u  reason: collision with root package name */
    com.join.mgps.dialog.f f53329u;

    /* renamed from: v  reason: collision with root package name */
    private SimpleRoom f53330v;

    /* renamed from: w  reason: collision with root package name */
    y.e f53331w;

    /* renamed from: x  reason: collision with root package name */
    ConcurrentHashMap<Integer, AreaInfo> f53332x;

    /* renamed from: y  reason: collision with root package name */
    AreaInfo f53333y;

    /* renamed from: z  reason: collision with root package name */
    String f53334z;

    /* renamed from: c  reason: collision with root package name */
    private boolean f53311c = false;

    /* renamed from: d  reason: collision with root package name */
    private List<SimpleWrapperRoom> f53312d = Collections.synchronizedList(new ArrayList());

    /* renamed from: e  reason: collision with root package name */
    private List<SimpleWrapperRoom> f53313e = Collections.synchronizedList(new ArrayList());

    /* renamed from: f  reason: collision with root package name */
    private List<SimpleWrapperRoom> f53314f = Collections.synchronizedList(new ArrayList());

    /* renamed from: m  reason: collision with root package name */
    float f53321m = 0.0f;

    /* renamed from: n  reason: collision with root package name */
    boolean f53322n = false;

    /* renamed from: o  reason: collision with root package name */
    long f53323o = 1000;

    /* renamed from: p  reason: collision with root package name */
    Handler f53324p = new Handler();

    /* renamed from: q  reason: collision with root package name */
    Runnable f53325q = new d();

    /* renamed from: s  reason: collision with root package name */
    long f53327s = 0;

    /* renamed from: t  reason: collision with root package name */
    long f53328t = 0;
    private int A = 3;
    public int B = 1;
    private String C = "";
    private m D = new k();
    private final Comparator<SimpleWrapperRoom> F = new l();
    private final Comparator<SimpleWrapperRoom> G = new a();
    private final Comparator<SimpleWrapperRoom> H = new b();
    private final Comparator<SimpleWrapperRoom> I = new c();
    boolean K = false;
    boolean L = false;

    /* loaded from: classes3.dex */
    class a implements Comparator<SimpleWrapperRoom> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(SimpleWrapperRoom simpleWrapperRoom, SimpleWrapperRoom simpleWrapperRoom2) {
            if (simpleWrapperRoom.simpleRoom.getVip() || !simpleWrapperRoom2.simpleRoom.getVip()) {
                if (!simpleWrapperRoom.simpleRoom.getVip() || simpleWrapperRoom2.simpleRoom.getVip()) {
                    if (simpleWrapperRoom.simpleRoom.getCopper() > simpleWrapperRoom2.simpleRoom.getCopper()) {
                        return 1;
                    }
                    return simpleWrapperRoom.simpleRoom.getCopper() == simpleWrapperRoom2.simpleRoom.getCopper() ? 0 : -1;
                }
                return -1;
            }
            return 1;
        }
    }

    /* loaded from: classes3.dex */
    class b implements Comparator<SimpleWrapperRoom> {
        b() {
        }

        private int a(long j4, int i4) {
            return (int) ((((SystemClock.elapsedRealtime() - j4) / 1000) + i4) - 1);
        }

        @Override // java.util.Comparator
        /* renamed from: b */
        public int compare(SimpleWrapperRoom simpleWrapperRoom, SimpleWrapperRoom simpleWrapperRoom2) {
            if (simpleWrapperRoom.simpleRoom.getVip() || !simpleWrapperRoom2.simpleRoom.getVip()) {
                if (!simpleWrapperRoom.simpleRoom.getVip() || simpleWrapperRoom2.simpleRoom.getVip()) {
                    if (a(simpleWrapperRoom.initialStartTime, simpleWrapperRoom.simpleRoom.getPlaySeconds()) > a(simpleWrapperRoom2.initialStartTime, simpleWrapperRoom2.simpleRoom.getPlaySeconds())) {
                        return 1;
                    }
                    return a(simpleWrapperRoom.initialStartTime, simpleWrapperRoom.simpleRoom.getPlaySeconds()) == a(simpleWrapperRoom2.initialStartTime, simpleWrapperRoom2.simpleRoom.getPlaySeconds()) ? 0 : -1;
                }
                return -1;
            }
            return 1;
        }
    }

    /* loaded from: classes3.dex */
    class c implements Comparator<SimpleWrapperRoom> {
        c() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(SimpleWrapperRoom simpleWrapperRoom, SimpleWrapperRoom simpleWrapperRoom2) {
            if (simpleWrapperRoom.simpleRoom.getVip() || !simpleWrapperRoom2.simpleRoom.getVip()) {
                if (!simpleWrapperRoom.simpleRoom.getVip() || simpleWrapperRoom2.simpleRoom.getVip()) {
                    int seatsNumber = simpleWrapperRoom.simpleRoom.getSeatsNumber() - simpleWrapperRoom.simpleRoom.getSitDownloadNumber();
                    int seatsNumber2 = simpleWrapperRoom2.simpleRoom.getSeatsNumber() - simpleWrapperRoom2.simpleRoom.getSitDownloadNumber();
                    if (seatsNumber < seatsNumber2) {
                        return 1;
                    }
                    return seatsNumber == seatsNumber2 ? 0 : -1;
                }
                return -1;
            }
            return 1;
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            XRecyclerView xRecyclerView = StandardEliteRoomFragment.this.f53316h;
            if (xRecyclerView == null) {
                return;
            }
            if (xRecyclerView.getScrollState() == 0 && !StandardEliteRoomFragment.this.f53314f.equals(StandardEliteRoomFragment.this.f53313e)) {
                StandardEliteRoomFragment.this.f53314f.clear();
                StandardEliteRoomFragment standardEliteRoomFragment = StandardEliteRoomFragment.this;
                if (standardEliteRoomFragment.f53321m == 0.0f) {
                    float width = standardEliteRoomFragment.f53316h.getWidth();
                    float dimensionPixelOffset = StandardEliteRoomFragment.this.getResources().getDimensionPixelOffset(R.dimen.wdp858);
                    if (width > 1.25f * dimensionPixelOffset) {
                        StandardEliteRoomFragment.this.f53321m = width / dimensionPixelOffset;
                    } else {
                        StandardEliteRoomFragment.this.f53321m = 1.0f;
                    }
                    StandardEliteRoomFragment.this.f53319k.h(StandardEliteRoomFragment.this.f53321m);
                }
                StandardEliteRoomFragment.this.f53314f.addAll(StandardEliteRoomFragment.this.f53313e);
                if (StandardEliteRoomFragment.this.f53319k != null) {
                    StandardEliteRoomFragment.this.f53319k.notifyDataSetChanged();
                }
            }
            StandardEliteRoomFragment standardEliteRoomFragment2 = StandardEliteRoomFragment.this;
            if (standardEliteRoomFragment2.f53322n) {
                standardEliteRoomFragment2.f53324p.postDelayed(this, standardEliteRoomFragment2.f53323o);
            }
        }
    }

    /* loaded from: classes3.dex */
    class e extends GridLayoutManager.SpanSizeLookup {
        e() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i4) {
            return 1;
        }
    }

    /* loaded from: classes3.dex */
    class f implements GameListAdapter.b {
        f() {
        }

        @Override // com.join.mgps.adapter.GameListAdapter.b
        public void a(RecyclerView.ViewHolder viewHolder, int i4) {
            StandardEliteRoomFragment.this.E0(i4);
        }
    }

    /* loaded from: classes3.dex */
    class g implements XRecyclerView.f {
        g() {
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
        public void onLoadMore() {
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
        public void onRefresh() {
            if (!com.join.android.app.common.utils.j.j(StandardEliteRoomFragment.this.f53318j)) {
                StandardEliteRoomFragment.this.showToast("当前网络不可用!");
                StandardEliteRoomFragment.this.f53316h.stopRefresh();
                return;
            }
            StandardEliteRoomFragment standardEliteRoomFragment = StandardEliteRoomFragment.this;
            standardEliteRoomFragment.f53318j.K2(standardEliteRoomFragment.f53311c);
        }
    }

    /* loaded from: classes3.dex */
    class h extends RecyclerView.OnScrollListener {
        h() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
            super.onScrollStateChanged(recyclerView, i4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
            super.onScrolled(recyclerView, i4, i5);
            if (!StandardEliteRoomFragment.this.f53311c && (StandardEliteRoomFragment.this.getActivity() instanceof GameRoomListActivity)) {
                ((GameRoomListActivity) StandardEliteRoomFragment.this.getActivity()).H2(i5);
            }
        }
    }

    /* loaded from: classes3.dex */
    class i extends RecyclerView.ItemDecoration {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f53343a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f53344b;

        i(int i4, int i5) {
            this.f53343a = i4;
            this.f53344b = i5;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            if (recyclerView.getChildPosition(view) % 2 == 0) {
                rect.right = this.f53343a;
            } else {
                rect.left = this.f53343a;
            }
            int i4 = this.f53344b;
            rect.top = i4;
            rect.bottom = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class j implements InputNumView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.input.a f53346a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SimpleRoom f53347b;

        j(com.join.mgps.customview.input.a aVar, SimpleRoom simpleRoom) {
            this.f53346a = aVar;
            this.f53347b = simpleRoom;
        }

        @Override // com.join.mgps.customview.input.InputNumView.d
        public void a(String str) {
            this.f53346a.c();
            StandardEliteRoomFragment.this.f53318j.C2(this.f53347b.getRoomId(), str, StandardEliteRoomFragment.this.f53311c);
        }

        @Override // com.join.mgps.customview.input.InputNumView.d
        public void hide() {
            this.f53346a.c();
        }
    }

    /* loaded from: classes3.dex */
    class k implements m {
        k() {
        }

        @Override // com.join.mgps.fragment.roomlist.StandardEliteRoomFragment.m
        public void a(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            StandardEliteRoomFragment standardEliteRoomFragment = StandardEliteRoomFragment.this;
            standardEliteRoomFragment.G0("----onRoomSortChanged onGameListSelected---  gameId :" + str);
            long currentTimeMillis = System.currentTimeMillis();
            StandardEliteRoomFragment standardEliteRoomFragment2 = StandardEliteRoomFragment.this;
            standardEliteRoomFragment2.G0("----onRoomSortChanged onGameListSelected---  sort data start  Time :" + currentTimeMillis);
            StandardEliteRoomFragment.this.S0();
            StandardEliteRoomFragment.this.C = str;
            if (TextUtils.isEmpty(StandardEliteRoomFragment.this.C)) {
                synchronized (StandardEliteRoomFragment.this.f53313e) {
                    StandardEliteRoomFragment.this.f53313e.clear();
                    StandardEliteRoomFragment.this.f53313e.addAll(StandardEliteRoomFragment.this.f53312d);
                    StandardEliteRoomFragment.this.g1();
                    StandardEliteRoomFragment.this.V0();
                }
            } else {
                StandardEliteRoomFragment.this.s0(true, str);
            }
            StandardEliteRoomFragment.this.l0();
            StandardEliteRoomFragment.this.m0();
            StandardEliteRoomFragment.this.x0();
            StandardEliteRoomFragment standardEliteRoomFragment3 = StandardEliteRoomFragment.this;
            standardEliteRoomFragment3.G0("----onRoomSortChanged onGameListSelected---sort data spend  Time :" + (System.currentTimeMillis() - currentTimeMillis));
        }

        @Override // com.join.mgps.fragment.roomlist.StandardEliteRoomFragment.m
        public void b(int i4, int i5) {
            long currentTimeMillis = System.currentTimeMillis();
            StandardEliteRoomFragment standardEliteRoomFragment = StandardEliteRoomFragment.this;
            standardEliteRoomFragment.G0("----onRoomSortChanged onPrioritySortChanged---  sort data start  Time :" + currentTimeMillis);
            StandardEliteRoomFragment.this.S0();
            StandardEliteRoomFragment standardEliteRoomFragment2 = StandardEliteRoomFragment.this;
            standardEliteRoomFragment2.B = i5;
            standardEliteRoomFragment2.g1();
            StandardEliteRoomFragment.this.A = i4;
            StandardEliteRoomFragment.this.V0();
            StandardEliteRoomFragment standardEliteRoomFragment3 = StandardEliteRoomFragment.this;
            standardEliteRoomFragment3.s0(false, standardEliteRoomFragment3.C);
            StandardEliteRoomFragment.this.l0();
            StandardEliteRoomFragment.this.m0();
            StandardEliteRoomFragment.this.x0();
            StandardEliteRoomFragment.this.J.a(StandardEliteRoomFragment.this.f53313e.size(), StandardEliteRoomFragment.this.f53311c);
            StandardEliteRoomFragment standardEliteRoomFragment4 = StandardEliteRoomFragment.this;
            standardEliteRoomFragment4.G0("----onRoomSortChanged onPrioritySortChanged---sort data spend  Time :" + (System.currentTimeMillis() - currentTimeMillis));
        }

        @Override // com.join.mgps.fragment.roomlist.StandardEliteRoomFragment.m
        public void c(int i4) {
            StandardEliteRoomFragment.this.B = i4;
            long currentTimeMillis = System.currentTimeMillis();
            StandardEliteRoomFragment standardEliteRoomFragment = StandardEliteRoomFragment.this;
            standardEliteRoomFragment.G0("----onRoomSortChanged onShowPeripheralChanged---  sort data start  Time :" + currentTimeMillis);
            StandardEliteRoomFragment.this.S0();
            StandardEliteRoomFragment.this.g1();
            StandardEliteRoomFragment standardEliteRoomFragment2 = StandardEliteRoomFragment.this;
            standardEliteRoomFragment2.s0(false, standardEliteRoomFragment2.C);
            StandardEliteRoomFragment.this.l0();
            StandardEliteRoomFragment.this.m0();
            StandardEliteRoomFragment.this.x0();
            StandardEliteRoomFragment.this.J.a(StandardEliteRoomFragment.this.f53313e.size(), StandardEliteRoomFragment.this.f53311c);
            StandardEliteRoomFragment standardEliteRoomFragment3 = StandardEliteRoomFragment.this;
            standardEliteRoomFragment3.G0("----onRoomSortChanged onShowPeripheralChanged ---sort data spend  Time :" + (System.currentTimeMillis() - currentTimeMillis));
        }

        @Override // com.join.mgps.fragment.roomlist.StandardEliteRoomFragment.m
        public void d(GameConfig gameConfig) {
            StandardEliteRoomFragment standardEliteRoomFragment = StandardEliteRoomFragment.this;
            if (standardEliteRoomFragment.B0("" + gameConfig.getGame_id())) {
                p1.f K = p1.f.K();
                DownloadTask F = K.F("" + gameConfig.getGame_id());
                PlugInstallDialog_.k0(StandardEliteRoomFragment.this.getContext()).c(o.o().n(F.getPlugin_num())).a(F).b(2).start();
            } else if (StandardEliteRoomFragment.this.o0(gameConfig.getGame_id())) {
                if (StandardEliteRoomFragment.this.C0(gameConfig.getGame_id())) {
                    return;
                }
                if (!(StandardEliteRoomFragment.this.getActivity() instanceof GameRoomListActivity) || ((GameRoomListActivity) StandardEliteRoomFragment.this.getActivity()).k2() == null) {
                    StandardEliteRoomFragment.this.f53318j.Y1(gameConfig.getGame_id(), StandardEliteRoomFragment.this.f53311c);
                    return;
                }
                FriendBean k22 = ((GameRoomListActivity) StandardEliteRoomFragment.this.getActivity()).k2();
                k22.setGameId(gameConfig.getGame_id());
                k22.setElite(StandardEliteRoomFragment.this.f53311c);
                com.wufan.friend.chat.c.u().o(k22);
                ((GameRoomListActivity) StandardEliteRoomFragment.this.getActivity()).U2(null);
            } else {
                StandardEliteRoomFragment.this.X0(gameConfig.getGame_id(), 1013);
            }
        }
    }

    /* loaded from: classes3.dex */
    class l implements Comparator<SimpleWrapperRoom> {
        l() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(SimpleWrapperRoom simpleWrapperRoom, SimpleWrapperRoom simpleWrapperRoom2) {
            if (simpleWrapperRoom.simpleRoom.getVip() || !simpleWrapperRoom2.simpleRoom.getVip()) {
                if (!simpleWrapperRoom.simpleRoom.getVip() || simpleWrapperRoom2.simpleRoom.getVip()) {
                    if (simpleWrapperRoom.simpleRoom.getCopper() < simpleWrapperRoom2.simpleRoom.getCopper()) {
                        return 1;
                    }
                    return simpleWrapperRoom.simpleRoom.getCopper() == simpleWrapperRoom2.simpleRoom.getCopper() ? 0 : -1;
                }
                return -1;
            }
            return 1;
        }
    }

    /* loaded from: classes3.dex */
    public interface m {

        /* renamed from: a  reason: collision with root package name */
        public static final int f53351a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f53352b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f53353c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f53354d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f53355e = 5;

        /* renamed from: f  reason: collision with root package name */
        public static final int f53356f = 6;

        void a(String str);

        void b(int i4, int i5);

        void c(int i4);

        void d(GameConfig gameConfig);
    }

    /* loaded from: classes3.dex */
    public interface n {
        void a(int i4, boolean z4);

        void b(boolean z4);
    }

    static {
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mFlingRunnable");
            N = declaredField;
            declaredField.setAccessible(true);
            Method declaredMethod = N.getType().getDeclaredMethod("endFling", new Class[0]);
            O = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception unused) {
            O = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C0(String str) {
        try {
            DownloadTask F = p1.f.K().F(str);
            return UtilsMy.V1(getContext(), str, F, p.o().n(F.getPlugin_num()), true);
        } catch (Exception unused) {
            return false;
        }
    }

    private void J0(ArrayList<SimpleWrapperRoom> arrayList) {
        if (arrayList == null) {
            return;
        }
        synchronized (this.f53312d) {
            ArrayList arrayList2 = new ArrayList();
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                SimpleRoom simpleRoom = arrayList.get(i4).simpleRoom;
                int i5 = 0;
                while (true) {
                    if (i5 < this.f53312d.size()) {
                        SimpleWrapperRoom simpleWrapperRoom = this.f53312d.get(i5);
                        if (simpleRoom.getRoomId() == simpleWrapperRoom.simpleRoom.getRoomId()) {
                            arrayList2.add(simpleWrapperRoom);
                            break;
                        }
                        i5++;
                    }
                }
            }
            this.f53312d.removeAll(arrayList2);
        }
    }

    private void L0() {
        this.A = 3;
        this.B = 1;
        this.C = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S0() {
        x0();
        d1 x4 = b0.f0(this.f53318j).x(this.f53318j);
        this.E = x4;
        x4.setTitle("正在刷新数据，请稍等...");
        this.E.setCancelable(false);
        this.E.setCanceledOnTouchOutside(false);
        this.E.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V0() {
        synchronized (this.f53313e) {
            int i4 = this.A;
            if (i4 == 3) {
                Collections.sort(this.f53313e, this.F);
            } else if (i4 == 4) {
                Collections.sort(this.f53313e, this.G);
            } else if (i4 == 5) {
                Collections.sort(this.f53313e, this.H);
            } else if (i4 == 6) {
                Collections.sort(this.f53313e, this.I);
            }
        }
    }

    public static void Z0(RecyclerView recyclerView) {
        Method method = O;
        if (method != null) {
            try {
                method.invoke(N.get(recyclerView), new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    private void d1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g1() {
        synchronized (this.f53313e) {
            this.f53313e.clear();
            this.f53313e.addAll(this.f53312d);
            Iterator<SimpleWrapperRoom> it2 = this.f53313e.iterator();
            while (it2.hasNext()) {
                SimpleWrapperRoom next = it2.next();
                if (this.B == 2 && !i1(next.simpleRoom)) {
                    it2.remove();
                    this.f53313e.remove(next);
                }
            }
        }
        return false;
    }

    private n0 k0(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    private List<SimpleWrapperRoom> p0(List<SimpleRoom> list, boolean z4) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (SimpleRoom simpleRoom : list) {
                SimpleWrapperRoom cloneSimpleRoom = SimpleWrapperRoom.cloneSimpleRoom(simpleRoom);
                boolean z5 = false;
                if (z4) {
                    Iterator<SimpleWrapperRoom> it2 = this.f53312d.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (it2.next().simpleRoom.getRoomId() == simpleRoom.getRoomId()) {
                                z5 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (!z5) {
                    arrayList.add(cloneSimpleRoom);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(boolean z4, String str) {
        synchronized (this.f53313e) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (z4) {
                this.f53313e.clear();
                this.f53313e.addAll(this.f53312d);
            }
            try {
                long parseLong = Long.parseLong(str);
                Iterator<SimpleWrapperRoom> it2 = this.f53313e.iterator();
                while (it2.hasNext()) {
                    SimpleWrapperRoom next = it2.next();
                    if (next.simpleRoom.getGameId() != parseLong) {
                        it2.remove();
                        this.f53313e.remove(next);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    private boolean z0(String str) {
        try {
            this.f53318j.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public boolean A0() {
        boolean z4 = true;
        if (this.f53318j == null) {
            return true;
        }
        synchronized (this.f53313e) {
            if (this.f53313e.size() > 0) {
                z4 = false;
            }
        }
        return z4;
    }

    public boolean B0(String str) {
        DownloadTask F = p1.f.K().F(str);
        if (F == null || F.getDown_type() == 2) {
            EMUApkTable n4 = F != null ? o.o().n(F.getPlugin_num()) : null;
            if (F == null || F.getStatus() != 11) {
                return n4 != null && com.join.android.app.common.utils.l.i(n4);
            }
            return true;
        }
        return false;
    }

    public void D0(String str) {
        m mVar = this.D;
        if (mVar != null) {
            mVar.a(str);
        }
    }

    void E0(int i4) {
        if (this.f53328t > 0 && System.currentTimeMillis() - this.f53328t <= 1000) {
            G0("join room so fast ,waiting a moment!");
            return;
        }
        this.f53328t = System.currentTimeMillis();
        if (!com.join.android.app.common.utils.j.j(this.f53318j)) {
            showToast("当前网络不可用，请检查网络！");
            return;
        }
        synchronized (this.f53313e) {
            if (this.f53313e.size() <= 0) {
                return;
            }
            if (i4 >= this.f53313e.size()) {
                return;
            }
            SimpleRoom simpleRoom = this.f53313e.get(i4).simpleRoom;
            this.f53330v = simpleRoom;
            if (!simpleRoom.getAllowPCJoin() && com.join.mgps.socket.fight.arena.c.o(this.f53318j)) {
                showToast("禁止PC用户加入!");
            } else if (!this.f53330v.getAllowSpectatorJoin() && this.f53330v.getSeatsNumber() == this.f53330v.getSitDownloadNumber()) {
                showToast("房间已满，禁止观赛！");
            } else if (!h1()) {
                T0();
            } else {
                if (B0("" + this.f53330v.getGameId())) {
                    p1.f K = p1.f.K();
                    DownloadTask F = K.F("" + this.f53330v.getGameId());
                    PlugInstallDialog_.k0(getContext()).c(o.o().n(F.getPlugin_num())).a(F).b(2).start();
                    return;
                }
                if (!o0("" + this.f53330v.getGameId())) {
                    X0("" + this.f53330v.getGameId(), 1012);
                } else {
                    if (!C0(this.f53330v.getGameId() + "")) {
                        if (this.f53330v.getHasJoinPassword()) {
                            Q0(this.f53330v);
                        } else {
                            this.f53318j.C2(this.f53330v.getRoomId(), "", this.f53311c);
                        }
                    }
                }
            }
        }
    }

    public void F0(String str) {
        if (str == null || str.equals(this.f53334z)) {
            return;
        }
        this.f53334z = str;
        this.f53312d.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void G0(String str) {
        v0.b(T, str);
    }

    public void H0() {
        this.f53316h.scrollToPosition(0);
        this.f53317i.g(true);
    }

    public void I0(List<SimpleRoom> list, boolean z4) {
        if (this.f53318j == null) {
            G0("---refreshPushListData activity is null ---");
            return;
        }
        synchronized (this.f53313e) {
            long currentTimeMillis = System.currentTimeMillis();
            G0("---refreshPushListData---- start Time :" + currentTimeMillis);
            if (list != null && list.size() >= 0) {
                List<SimpleWrapperRoom> p02 = p0(list, false);
                this.f53312d.clear();
                this.f53313e.clear();
                this.f53312d.addAll(p02);
                this.f53313e.addAll(p02);
            }
            if (z4) {
                g1();
                this.A = 3;
                V0();
                s0(false, this.C);
                this.J.b(this.f53311c);
                this.f53316h.stopRefresh();
            }
            l0();
            this.J.a(this.f53313e.size(), this.f53311c);
            G0("---refreshPushListData---- spend Time :" + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    @UiThread
    public void K0(int i4) {
        if (this.f53318j == null) {
            return;
        }
        synchronized (this.f53313e) {
            ArrayList<SimpleWrapperRoom> arrayList = new ArrayList<>();
            Iterator<SimpleWrapperRoom> it2 = this.f53313e.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                SimpleWrapperRoom next = it2.next();
                SimpleRoom simpleRoom = next.simpleRoom;
                if (simpleRoom != null && i4 == simpleRoom.getRoomId()) {
                    arrayList.add(next);
                    break;
                }
            }
            if (arrayList.size() > 0) {
                w0(arrayList);
            }
        }
    }

    public void M0(List<SimpleWrapperRoom> list) {
        this.f53312d = list;
    }

    public void N0(List<SimpleWrapperRoom> list) {
        this.f53313e = list;
    }

    public void O0(n nVar) {
        this.J = nVar;
    }

    void P0() {
        com.join.mgps.dialog.f fVar = this.f53329u;
        if (fVar != null) {
            fVar.b();
        }
        if (getActivity() == null) {
            return;
        }
        GameRoomListActivity gameRoomListActivity = (GameRoomListActivity) getActivity();
        if (B0("" + gameRoomListActivity.h2().getGame_list().get(0).getGame_id())) {
            p1.f K = p1.f.K();
            DownloadTask F = K.F("" + gameRoomListActivity.h2().getGame_list().get(0).getGame_id());
            PlugInstallDialog_.k0(getContext()).c(o.o().n(F.getPlugin_num())).a(F).b(2).start();
        } else if (gameRoomListActivity.h2().getGame_list().size() == 1) {
            if (o0(gameRoomListActivity.h2().getGame_list().get(0).getGame_id())) {
                this.f53318j.Y1(gameRoomListActivity.h2().getGame_list().get(0).getGame_id(), this.f53311c);
            } else {
                X0(gameRoomListActivity.h2().getGame_list().get(0).getGame_id(), 1013);
            }
        } else {
            com.join.mgps.dialog.f fVar2 = new com.join.mgps.dialog.f(getActivity(), this.D);
            this.f53329u = fVar2;
            fVar2.d(gameRoomListActivity.h2().getGame_list(), this.f53311c);
            this.f53329u.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Q0(SimpleRoom simpleRoom) {
        com.join.mgps.customview.input.a aVar = new com.join.mgps.customview.input.a(this.f53318j, "请输入房间密码", 4, false);
        aVar.g(new j(aVar, simpleRoom));
        aVar.h();
    }

    public void R0(int i4) {
        if (this.f53318j == null) {
            return;
        }
        synchronized (this.f53313e) {
            int i5 = 0;
            while (true) {
                if (i5 >= this.f53313e.size()) {
                    break;
                }
                SimpleWrapperRoom simpleWrapperRoom = this.f53313e.get(i5);
                if (simpleWrapperRoom.simpleRoom.getRoomId() == i4) {
                    Q0(simpleWrapperRoom.simpleRoom);
                    break;
                }
                i5++;
            }
        }
    }

    public void T0() {
        IntentUtil.getInstance().goLoginBattle(this.f53318j);
    }

    public void U0(y.e eVar, ConcurrentHashMap<Integer, AreaInfo> concurrentHashMap, AreaInfo areaInfo, int i4) {
        synchronized (this.f53312d) {
            this.f53331w = eVar;
            this.f53332x = concurrentHashMap;
            this.f53333y = areaInfo;
            com.join.mgps.dialog.j jVar = this.f53326r;
            if (jVar != null) {
                jVar.a();
            }
            if (getActivity() == null) {
                return;
            }
            com.join.mgps.dialog.j jVar2 = new com.join.mgps.dialog.j(this.f53318j, this.D, eVar, concurrentHashMap, areaInfo, i4);
            this.f53326r = jVar2;
            jVar2.d(this.B, ((GameRoomListActivity) getActivity()).h2().getGame_list(), this.C, this.A);
            this.f53326r.f();
        }
    }

    void W0() {
        this.f53322n = true;
        this.f53324p.post(this.f53325q);
    }

    public void X0(String str, int i4) {
        Intent intent = new Intent(this.f53318j, NewArenaDownloadActivity_.class);
        intent.putExtra("gameId", str);
        intent.putExtra(NewArenaDownloadActivity_.P, this.L);
        intent.putExtra(NewArenaDownloadActivity_.Q, this.K);
        startActivityForResult(intent, i4);
    }

    public void Y0() {
        if (!com.join.android.app.common.utils.j.j(this.f53318j)) {
            showToast("当前网络不可用，请检查网络！");
        } else if (!h1()) {
            T0();
        } else {
            String game_id = ((GameRoomListActivity) getActivity()).h2().getGame_list().get(0).getGame_id();
            if (B0("" + game_id)) {
                p1.f K = p1.f.K();
                DownloadTask F = K.F("" + game_id);
                PlugInstallDialog_.k0(getContext()).c(o.o().n(F.getPlugin_num())).a(F).b(2).start();
            } else if (o0(game_id)) {
                this.f53318j.b2(Long.parseLong(game_id));
            } else {
                X0(game_id, 1014);
            }
        }
    }

    void a1() {
        this.f53322n = false;
        this.f53324p.removeCallbacks(this.f53325q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f53319k = new GameListAdapter(this.f53318j, this.f53314f);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f53318j, 2);
        this.f53320l = gridLayoutManager;
        gridLayoutManager.setSpanSizeLookup(new e());
        this.f53316h.setLayoutManager(this.f53320l);
        this.f53316h.setAdapter(this.f53319k);
        this.f53319k.f(new f());
        this.f53316h.setPreLoadCount(10);
        this.f53316h.setPullRefreshEnabled(true);
        this.f53316h.setLoadingMoreEnabled(false);
        this.f53316h.setLoadingListener(new g());
        this.f53316h.addOnScrollListener(new h());
        getResources().getDimensionPixelSize(R.dimen.wdp32);
        this.f53316h.addItemDecoration(new i(getResources().getDimensionPixelSize(R.dimen.wdp14) / 2, getResources().getDimensionPixelSize(R.dimen.wdp14) / 2));
    }

    public void b1() {
        if (this.f53318j == null) {
            return;
        }
        this.f53316h.stopRefresh();
    }

    public void c1() {
        Z0(this.f53316h);
    }

    @UiThread
    public void e1(ArrayList<SimpleRoom> arrayList) {
        if (this.f53318j == null || arrayList == null || arrayList.size() <= 0) {
            return;
        }
        synchronized (this.f53313e) {
            long currentTimeMillis = System.currentTimeMillis();
            G0("---updateItemForDissolve---- start Time :" + currentTimeMillis);
            ArrayList<SimpleWrapperRoom> arrayList2 = new ArrayList<>();
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                SimpleRoom simpleRoom = arrayList.get(i4);
                int i5 = 0;
                while (true) {
                    if (i5 < this.f53313e.size()) {
                        SimpleWrapperRoom simpleWrapperRoom = this.f53313e.get(i5);
                        if (simpleRoom.getRoomId() == simpleWrapperRoom.simpleRoom.getRoomId()) {
                            arrayList2.add(simpleWrapperRoom);
                            break;
                        }
                        i5++;
                    }
                }
            }
            if (arrayList2.size() > 0) {
                w0(arrayList2);
            }
            G0("---updateItemForDissolve---- spend   Time :" + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f A[Catch: all -> 0x01da, TryCatch #0 {, blocks: (B:10:0x0015, B:12:0x001a, B:17:0x0026, B:19:0x004f, B:20:0x0056, B:22:0x005e, B:24:0x0072, B:28:0x0081, B:29:0x0088, B:25:0x007b, B:30:0x008b, B:34:0x0094, B:35:0x00a2, B:37:0x00a8, B:39:0x00c0, B:41:0x00c9, B:42:0x00cd, B:44:0x00d3, B:45:0x00d8, B:47:0x00e1, B:48:0x00e8, B:50:0x00f0, B:52:0x0104, B:56:0x0113, B:57:0x011a, B:53:0x010d, B:58:0x011d, B:62:0x0127, B:63:0x0134, B:65:0x013a, B:67:0x0150, B:69:0x0154, B:71:0x015c, B:72:0x0162, B:73:0x016b, B:74:0x0171, B:75:0x0174, B:78:0x017b, B:80:0x0181, B:82:0x018b, B:84:0x0193, B:86:0x019e, B:85:0x0199, B:87:0x01a1, B:89:0x01af, B:90:0x01b2, B:91:0x01d8), top: B:97:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3 A[Catch: all -> 0x01da, TryCatch #0 {, blocks: (B:10:0x0015, B:12:0x001a, B:17:0x0026, B:19:0x004f, B:20:0x0056, B:22:0x005e, B:24:0x0072, B:28:0x0081, B:29:0x0088, B:25:0x007b, B:30:0x008b, B:34:0x0094, B:35:0x00a2, B:37:0x00a8, B:39:0x00c0, B:41:0x00c9, B:42:0x00cd, B:44:0x00d3, B:45:0x00d8, B:47:0x00e1, B:48:0x00e8, B:50:0x00f0, B:52:0x0104, B:56:0x0113, B:57:0x011a, B:53:0x010d, B:58:0x011d, B:62:0x0127, B:63:0x0134, B:65:0x013a, B:67:0x0150, B:69:0x0154, B:71:0x015c, B:72:0x0162, B:73:0x016b, B:74:0x0171, B:75:0x0174, B:78:0x017b, B:80:0x0181, B:82:0x018b, B:84:0x0193, B:86:0x019e, B:85:0x0199, B:87:0x01a1, B:89:0x01af, B:90:0x01b2, B:91:0x01d8), top: B:97:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1 A[Catch: all -> 0x01da, TryCatch #0 {, blocks: (B:10:0x0015, B:12:0x001a, B:17:0x0026, B:19:0x004f, B:20:0x0056, B:22:0x005e, B:24:0x0072, B:28:0x0081, B:29:0x0088, B:25:0x007b, B:30:0x008b, B:34:0x0094, B:35:0x00a2, B:37:0x00a8, B:39:0x00c0, B:41:0x00c9, B:42:0x00cd, B:44:0x00d3, B:45:0x00d8, B:47:0x00e1, B:48:0x00e8, B:50:0x00f0, B:52:0x0104, B:56:0x0113, B:57:0x011a, B:53:0x010d, B:58:0x011d, B:62:0x0127, B:63:0x0134, B:65:0x013a, B:67:0x0150, B:69:0x0154, B:71:0x015c, B:72:0x0162, B:73:0x016b, B:74:0x0171, B:75:0x0174, B:78:0x017b, B:80:0x0181, B:82:0x018b, B:84:0x0193, B:86:0x019e, B:85:0x0199, B:87:0x01a1, B:89:0x01af, B:90:0x01b2, B:91:0x01d8), top: B:97:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01af A[Catch: all -> 0x01da, TryCatch #0 {, blocks: (B:10:0x0015, B:12:0x001a, B:17:0x0026, B:19:0x004f, B:20:0x0056, B:22:0x005e, B:24:0x0072, B:28:0x0081, B:29:0x0088, B:25:0x007b, B:30:0x008b, B:34:0x0094, B:35:0x00a2, B:37:0x00a8, B:39:0x00c0, B:41:0x00c9, B:42:0x00cd, B:44:0x00d3, B:45:0x00d8, B:47:0x00e1, B:48:0x00e8, B:50:0x00f0, B:52:0x0104, B:56:0x0113, B:57:0x011a, B:53:0x010d, B:58:0x011d, B:62:0x0127, B:63:0x0134, B:65:0x013a, B:67:0x0150, B:69:0x0154, B:71:0x015c, B:72:0x0162, B:73:0x016b, B:74:0x0171, B:75:0x0174, B:78:0x017b, B:80:0x0181, B:82:0x018b, B:84:0x0193, B:86:0x019e, B:85:0x0199, B:87:0x01a1, B:89:0x01af, B:90:0x01b2, B:91:0x01d8), top: B:97:0x0015 }] */
    @org.androidannotations.annotations.UiThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f1(java.util.ArrayList<com.papa91.battle.protocol.SimpleRoom> r19) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.roomlist.StandardEliteRoomFragment.f1(java.util.ArrayList):void");
    }

    public boolean h1() {
        return (k0(this.f53318j) == null || AccountUtil_.getInstance_(this.f53318j).isTourist()) ? false : true;
    }

    boolean i1(SimpleRoom simpleRoom) {
        if (simpleRoom != null) {
            int i4 = 0;
            int i5 = 0;
            boolean z4 = false;
            for (int i6 = 0; i6 < simpleRoom.getPlayerListCount(); i6++) {
                RoomPosition playerList = simpleRoom.getPlayerList(i6);
                if (playerList.getUid() == 0) {
                    i5++;
                } else if (playerList.getPlatform() == Platform.MOBILE) {
                    i4++;
                    if (playerList.getUid() == simpleRoom.getLeaderId()) {
                        z4 = true;
                    }
                }
            }
            return !simpleRoom.getAllowPCJoin() && (i4 + i5 == simpleRoom.getPlayerListCount()) && z4;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0() {
        if (this.f53315g == null) {
            return;
        }
        if (this.f53314f != null && this.f53313e.size() == 0) {
            this.f53315g.setVisibility(0);
        } else {
            this.f53315g.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0() {
        this.f53324p.removeCallbacks(this.f53325q);
        this.f53324p.post(this.f53325q);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f A[Catch: all -> 0x0099, TryCatch #0 {, blocks: (B:8:0x000d, B:10:0x0013, B:15:0x001f, B:17:0x0039, B:19:0x003f, B:21:0x004f, B:22:0x0069, B:24:0x006e, B:25:0x0071, B:26:0x0097), top: B:31:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e A[Catch: all -> 0x0099, TryCatch #0 {, blocks: (B:8:0x000d, B:10:0x0013, B:15:0x001f, B:17:0x0039, B:19:0x003f, B:21:0x004f, B:22:0x0069, B:24:0x006e, B:25:0x0071, B:26:0x0097), top: B:31:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n0(java.util.List<com.papa91.battle.protocol.SimpleRoom> r9, boolean r10) {
        /*
            r8 = this;
            com.join.mgps.activity.arena.GameRoomListActivity_ r0 = r8.f53318j
            if (r0 != 0) goto La
            java.lang.String r9 = "---addPushListData activity is null ---"
            r8.G0(r9)
            return
        La:
            java.util.List<app.mgsim.arena.SimpleWrapperRoom> r0 = r8.f53313e
            monitor-enter(r0)
            java.util.List<app.mgsim.arena.SimpleWrapperRoom> r1 = r8.f53314f     // Catch: java.lang.Throwable -> L99
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            java.util.List<app.mgsim.arena.SimpleWrapperRoom> r1 = r8.f53313e     // Catch: java.lang.Throwable -> L99
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L99
            if (r1 != 0) goto L1c
            goto L1e
        L1c:
            r1 = 0
            goto L1f
        L1e:
            r1 = 1
        L1f:
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L99
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L99
            r6.<init>()     // Catch: java.lang.Throwable -> L99
            java.lang.String r7 = "---addPushListData---- start Time :"
            r6.append(r7)     // Catch: java.lang.Throwable -> L99
            r6.append(r4)     // Catch: java.lang.Throwable -> L99
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L99
            r8.G0(r6)     // Catch: java.lang.Throwable -> L99
            if (r9 == 0) goto L4d
            int r6 = r9.size()     // Catch: java.lang.Throwable -> L99
            if (r6 <= 0) goto L4d
            java.util.List r9 = r8.p0(r9, r2)     // Catch: java.lang.Throwable -> L99
            java.util.List<app.mgsim.arena.SimpleWrapperRoom> r2 = r8.f53312d     // Catch: java.lang.Throwable -> L99
            r2.addAll(r9)     // Catch: java.lang.Throwable -> L99
            java.util.List<app.mgsim.arena.SimpleWrapperRoom> r2 = r8.f53313e     // Catch: java.lang.Throwable -> L99
            r2.addAll(r9)     // Catch: java.lang.Throwable -> L99
        L4d:
            if (r10 == 0) goto L69
            r8.g1()     // Catch: java.lang.Throwable -> L99
            r9 = 3
            r8.A = r9     // Catch: java.lang.Throwable -> L99
            r8.V0()     // Catch: java.lang.Throwable -> L99
            java.lang.String r9 = r8.C     // Catch: java.lang.Throwable -> L99
            r8.s0(r3, r9)     // Catch: java.lang.Throwable -> L99
            com.join.mgps.fragment.roomlist.StandardEliteRoomFragment$n r9 = r8.J     // Catch: java.lang.Throwable -> L99
            boolean r10 = r8.f53311c     // Catch: java.lang.Throwable -> L99
            r9.b(r10)     // Catch: java.lang.Throwable -> L99
            com.join.android.app.component.xrecyclerview.XRecyclerView r9 = r8.f53316h     // Catch: java.lang.Throwable -> L99
            r9.stopRefresh()     // Catch: java.lang.Throwable -> L99
        L69:
            r8.l0()     // Catch: java.lang.Throwable -> L99
            if (r1 == 0) goto L71
            r8.m0()     // Catch: java.lang.Throwable -> L99
        L71:
            com.join.mgps.fragment.roomlist.StandardEliteRoomFragment$n r9 = r8.J     // Catch: java.lang.Throwable -> L99
            java.util.List<app.mgsim.arena.SimpleWrapperRoom> r10 = r8.f53313e     // Catch: java.lang.Throwable -> L99
            int r10 = r10.size()     // Catch: java.lang.Throwable -> L99
            boolean r1 = r8.f53311c     // Catch: java.lang.Throwable -> L99
            r9.a(r10, r1)     // Catch: java.lang.Throwable -> L99
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L99
            r9.<init>()     // Catch: java.lang.Throwable -> L99
            java.lang.String r10 = "---addPushListData---- spend Time :"
            r9.append(r10)     // Catch: java.lang.Throwable -> L99
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L99
            long r1 = r1 - r4
            r9.append(r1)     // Catch: java.lang.Throwable -> L99
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L99
            r8.G0(r9)     // Catch: java.lang.Throwable -> L99
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L99
            return
        L99:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L99
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.roomlist.StandardEliteRoomFragment.n0(java.util.List, boolean):void");
    }

    public boolean o0(String str) {
        this.K = false;
        this.L = false;
        DownloadTask F = p1.f.K().F(str);
        if (F != null && F.getStatus() == 5) {
            this.K = true;
            EMUApkTable n4 = o.o().n(F.getPlugin_num());
            if (n4 != null) {
                if (com.join.android.app.common.utils.l.t(this.f53318j, n4, false, new String[0]) && !UtilsMy.B0(this.f53318j, n4)) {
                    this.L = true;
                } else {
                    this.L = false;
                }
            } else {
                this.L = true;
            }
        } else {
            this.K = false;
        }
        return this.L && this.K;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i4, int i5, Intent intent) {
        SimpleRoom simpleRoom;
        super.onActivityResult(i4, i5, intent);
        if (i5 == -1) {
            if (i4 == 1012) {
                if (this.f53318j == null || (simpleRoom = this.f53330v) == null) {
                    return;
                }
                if (simpleRoom.getHasJoinPassword()) {
                    Q0(this.f53330v);
                } else {
                    this.f53318j.C2(this.f53330v.getRoomId(), "", this.f53311c);
                }
            } else if (i4 == 1013) {
                this.f53318j.Y1(intent.getStringExtra("gameId"), this.f53311c);
            } else if (i4 == 1014) {
                this.f53318j.b2(Long.parseLong(intent.getStringExtra("gameId")));
            } else if (i4 == 1015) {
                intent.getStringExtra("gameId");
                this.f53318j.c2();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        G0("---onAttach---");
        this.f53318j = (GameRoomListActivity_) context;
        W0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        G0("---onCreate---");
        Bundle arguments = getArguments();
        this.f53311c = arguments.getBoolean("isElite");
        this.C = arguments.getString("filterGameId", "");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        a1();
        d1();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f53318j = null;
    }

    public void q0() {
        if (this.f53327s > 0 && System.currentTimeMillis() - this.f53327s <= 1000) {
            G0("fast join room so fast ,waiting a moment!");
            return;
        }
        this.f53327s = System.currentTimeMillis();
        if (!com.join.android.app.common.utils.j.j(this.f53318j)) {
            showToast("当前网络不可用，请检查网络！");
        } else if (!h1()) {
            T0();
        } else {
            P0();
        }
    }

    void r0(boolean z4) {
        if (z4) {
            return;
        }
        this.f53317i.C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        try {
            if (requireContext() == null) {
                return;
            }
            l2.a(requireContext()).b(str);
        } catch (Exception e5) {
            Log.d(T, str);
            e5.printStackTrace();
        }
    }

    public List<SimpleWrapperRoom> t0() {
        return this.f53312d;
    }

    public List<SimpleWrapperRoom> u0() {
        return this.f53313e;
    }

    public int v0() {
        return this.B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w0(ArrayList<SimpleWrapperRoom> arrayList) {
        if (arrayList == null) {
            return;
        }
        synchronized (this.f53313e) {
            if (arrayList.size() > 0) {
                this.f53313e.removeAll(arrayList);
                J0(arrayList);
                if (this.f53313e.size() <= 0) {
                    L0();
                }
                this.J.a(this.f53313e.size(), this.f53311c);
            }
        }
    }

    void x0() {
        Dialog dialog = this.E;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.E.dismiss();
    }

    void y0() {
        if (getActivity() == null) {
            return;
        }
        PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) getActivity().findViewById(16908290).findViewById(R.id.mPtrFrame);
        this.f53317i = ptrClassicFrameLayout;
        ptrClassicFrameLayout.C();
    }
}
