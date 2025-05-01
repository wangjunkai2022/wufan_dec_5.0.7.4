package com.join.mgps.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.adapter.z2;
import com.join.mgps.customview.XListView2;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.TodayWufunBean;
import com.join.mgps.dto.TodayWufunBroadcast;
import com.join.mgps.dto.TodayWufunEverday;
import com.join.mgps.dto.TodayWufunTodayNew;
import com.join.mgps.dto.TodayWufunTopic;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.now_wufun_fragment_layout)
/* loaded from: classes.dex */
public class NowWufunFragment extends Fragment implements AbsListView.OnScrollListener {

    /* renamed from: b  reason: collision with root package name */
    private Context f36183b;

    /* renamed from: c  reason: collision with root package name */
    private int f36184c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    PtrClassicFrameLayout f36185d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    XListView2 f36186e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f36187f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f36188g;

    /* renamed from: h  reason: collision with root package name */
    com.join.mgps.rpc.e f36189h;

    /* renamed from: i  reason: collision with root package name */
    List<DownloadTask> f36190i;

    /* renamed from: k  reason: collision with root package name */
    private com.join.mgps.adapter.z2 f36192k;

    /* renamed from: m  reason: collision with root package name */
    private List<c> f36194m;

    /* renamed from: n  reason: collision with root package name */
    private int f36195n;

    /* renamed from: o  reason: collision with root package name */
    private int f36196o;

    /* renamed from: j  reason: collision with root package name */
    private Map<String, DownloadTask> f36191j = new ConcurrentHashMap();

    /* renamed from: l  reason: collision with root package name */
    private boolean f36193l = false;

    /* renamed from: p  reason: collision with root package name */
    private int f36197p = 1;

    /* loaded from: classes4.dex */
    public enum ItemType {
        DATETITLE(0),
        FIND(1),
        BROADCAST(2),
        TODAYNEWITEM(3),
        TODAYNEWBOTTOM(4),
        TOPIC(6),
        TOPIC2(7),
        TODAYNEWTITLE(5),
        EMPYT(8);
        
        private int type;

        ItemType(int i4) {
            this.type = i4;
        }

        public int getType() {
            return this.type;
        }

        public void setType(int i4) {
            this.type = i4;
        }
    }

    /* loaded from: classes4.dex */
    class a implements com.join.mgps.customview.f {
        a() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (NowWufunFragment.this.f36193l) {
                return;
            }
            if (NowWufunFragment.this.f36197p == 2) {
                NowWufunFragment.this.b0();
            } else {
                NowWufunFragment.this.a0();
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements com.join.mgps.customview.g {
        b() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (NowWufunFragment.this.f36193l) {
                return;
            }
            NowWufunFragment.this.f36184c = 1;
            if (NowWufunFragment.this.f36197p == 2) {
                NowWufunFragment.this.b0();
            } else {
                NowWufunFragment.this.a0();
            }
        }
    }

    /* loaded from: classes4.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public ItemType f36200a;

        /* renamed from: b  reason: collision with root package name */
        public Object f36201b;

        /* renamed from: c  reason: collision with root package name */
        public DownloadTask f36202c;

        public c() {
        }
    }

    private DownloadTask c0(String str, int i4, String str2) {
        if (i4 == ConstantIntEnum.H5.value()) {
            DownloadTask downloadTask = new DownloadTask();
            downloadTask.setCrc_link_type_val(str);
            downloadTask.setUrl(str2);
            return downloadTask;
        }
        for (DownloadTask downloadTask2 : this.f36190i) {
            if (downloadTask2.getCrc_link_type_val().equals(str)) {
                return downloadTask2;
            }
        }
        return null;
    }

    private void e0(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.f36190i.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.f36191j.remove(next.getCrc_link_type_val());
                it2.remove();
                for (c cVar : this.f36194m) {
                    Object obj = cVar.f36201b;
                    if (obj instanceof TodayWufunEverday) {
                        TodayWufunEverday todayWufunEverday = (TodayWufunEverday) obj;
                        if (todayWufunEverday.getMod_info() != null) {
                            DownloadTask downloadTask2 = this.f36191j.get(todayWufunEverday.getMod_info().getMod_game_id());
                            DownloadTask downloadTask3 = this.f36191j.get(todayWufunEverday.getGame_id());
                            if (downloadTask2 == null && downloadTask3 == null) {
                                todayWufunEverday.setDownloadTask(null);
                            } else if (downloadTask2 != null) {
                                todayWufunEverday.setDownloadTask(downloadTask2);
                            } else if (downloadTask3 != null) {
                                todayWufunEverday.setDownloadTask(downloadTask3);
                            } else if (todayWufunEverday.getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                                todayWufunEverday.setDownloadTask(null);
                            }
                        } else if (todayWufunEverday.getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                            todayWufunEverday.setDownloadTask(null);
                        }
                    }
                    if (obj instanceof TodayWufunBroadcast) {
                        TodayWufunBroadcast todayWufunBroadcast = (TodayWufunBroadcast) obj;
                        if (todayWufunBroadcast.getMod_info() != null) {
                            DownloadTask F = p1.f.K().F(todayWufunBroadcast.getMod_info().getMod_game_id());
                            DownloadTask F2 = p1.f.K().F(todayWufunBroadcast.getGame_id());
                            if (F == null && F2 == null) {
                                todayWufunBroadcast.setDownloadTask(null);
                            } else if (F != null) {
                                todayWufunBroadcast.setDownloadTask(F);
                            } else if (F2 != null) {
                                todayWufunBroadcast.setDownloadTask(F2);
                            } else if (todayWufunBroadcast.getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                                todayWufunBroadcast.setDownloadTask(null);
                            }
                        } else if (todayWufunBroadcast.getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                            todayWufunBroadcast.setDownloadTask(null);
                        }
                    }
                    if (obj instanceof TodayWufunTodayNew) {
                        TodayWufunTodayNew todayWufunTodayNew = (TodayWufunTodayNew) obj;
                        if (todayWufunTodayNew.getMod_info() != null) {
                            DownloadTask F3 = p1.f.K().F(todayWufunTodayNew.getMod_info().getMod_game_id());
                            DownloadTask F4 = p1.f.K().F(todayWufunTodayNew.getGame_id());
                            if (F3 == null && F4 == null) {
                                todayWufunTodayNew.setDownloadTask(null);
                            } else if (F3 != null) {
                                todayWufunTodayNew.setDownloadTask(F3);
                            } else if (F4 != null) {
                                todayWufunTodayNew.setDownloadTask(F4);
                            } else if (todayWufunTodayNew.getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                                todayWufunTodayNew.setDownloadTask(null);
                            }
                        } else if (todayWufunTodayNew.getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                            todayWufunTodayNew.setDownloadTask(null);
                        }
                    }
                }
            }
        }
        this.f36192k.notifyDataSetChanged();
    }

    private void f0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f36191j;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            this.f36192k.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void g0(DownloadTask downloadTask) {
        UtilsMy.B4(this.f36190i, downloadTask);
        if (!this.f36191j.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f36190i.add(downloadTask);
            this.f36191j.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        m0(downloadTask);
        this.f36192k.notifyDataSetChanged();
    }

    private void h0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f36191j;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f36190i.add(downloadTask);
            this.f36191j.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        m0(downloadTask);
        DownloadTask downloadTask2 = this.f36191j.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        this.f36192k.notifyDataSetChanged();
    }

    private void m0(DownloadTask downloadTask) {
        for (c cVar : this.f36194m) {
            Object obj = cVar.f36201b;
            boolean z4 = false;
            if (obj instanceof TodayWufunEverday) {
                TodayWufunEverday todayWufunEverday = (TodayWufunEverday) obj;
                if (todayWufunEverday.getMod_info() != null) {
                    ModInfoBean mod_info = todayWufunEverday.getMod_info();
                    DownloadTask downloadTask2 = this.f36191j.get(mod_info.getMain_game_id());
                    boolean d5 = (downloadTask2 == null || downloadTask2.getStatus() != 5) ? false : com.join.android.app.common.utils.e.l0(getContext()).d(getContext(), downloadTask2.getPackageName());
                    DownloadTask downloadTask3 = this.f36191j.get(mod_info.getMod_game_id());
                    boolean F = (downloadTask3 == null || downloadTask3.getStatus() != 5) ? false : com.join.mgps.va.overmind.d.o().F(downloadTask3.getPackageName());
                    if (F && d5) {
                        if (downloadTask.getCrc_link_type_val().equals(todayWufunEverday.getGame_id())) {
                            todayWufunEverday.setDownloadTask(downloadTask);
                            return;
                        }
                    } else if (F) {
                        if (todayWufunEverday.getMod_info() != null && downloadTask.getCrc_link_type_val().equals(todayWufunEverday.getMod_info().getMod_game_id())) {
                            todayWufunEverday.setDownloadTask(downloadTask);
                            return;
                        }
                    } else if (d5) {
                        if (downloadTask.getCrc_link_type_val().equals(todayWufunEverday.getGame_id())) {
                            todayWufunEverday.setDownloadTask(downloadTask);
                            return;
                        }
                    } else {
                        DownloadTask F2 = todayWufunEverday.getMod_info() != null ? p1.f.K().F(todayWufunEverday.getMod_info().getMod_game_id()) : null;
                        if (F2 == null) {
                            F2 = p1.f.K().F(todayWufunEverday.getGame_id());
                        }
                        if (F2 != null && downloadTask.getCrc_link_type_val().equals(F2.getCrc_link_type_val())) {
                            todayWufunEverday.setDownloadTask(downloadTask);
                            return;
                        }
                    }
                } else if (todayWufunEverday.getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                    todayWufunEverday.setDownloadTask(downloadTask);
                }
            }
            if (obj instanceof TodayWufunBroadcast) {
                TodayWufunBroadcast todayWufunBroadcast = (TodayWufunBroadcast) obj;
                if (todayWufunBroadcast.getMod_info() != null) {
                    ModInfoBean mod_info2 = todayWufunBroadcast.getMod_info();
                    DownloadTask downloadTask4 = this.f36191j.get(mod_info2.getMain_game_id());
                    boolean d6 = (downloadTask4 == null || downloadTask4.getStatus() != 5) ? false : com.join.android.app.common.utils.e.l0(getContext()).d(getContext(), downloadTask4.getPackageName());
                    DownloadTask downloadTask5 = this.f36191j.get(mod_info2.getMod_game_id());
                    boolean F3 = (downloadTask5 == null || downloadTask5.getStatus() != 5) ? false : com.join.mgps.va.overmind.d.o().F(downloadTask5.getPackageName());
                    if (F3 && d6) {
                        if (downloadTask.getCrc_link_type_val().equals(todayWufunBroadcast.getGame_id())) {
                            todayWufunBroadcast.setDownloadTask(downloadTask);
                            return;
                        }
                    } else if (F3) {
                        if (todayWufunBroadcast.getMod_info() != null && downloadTask.getCrc_link_type_val().equals(todayWufunBroadcast.getMod_info().getMod_game_id())) {
                            todayWufunBroadcast.setDownloadTask(downloadTask);
                            return;
                        }
                    } else if (d6) {
                        if (downloadTask.getCrc_link_type_val().equals(todayWufunBroadcast.getGame_id())) {
                            todayWufunBroadcast.setDownloadTask(downloadTask);
                            return;
                        }
                    } else {
                        DownloadTask F4 = todayWufunBroadcast.getMod_info() != null ? p1.f.K().F(todayWufunBroadcast.getMod_info().getMod_game_id()) : null;
                        if (F4 == null) {
                            F4 = p1.f.K().F(todayWufunBroadcast.getGame_id());
                        }
                        if (F4 != null && downloadTask.getCrc_link_type_val().equals(F4.getCrc_link_type_val())) {
                            todayWufunBroadcast.setDownloadTask(downloadTask);
                            return;
                        }
                    }
                } else if (todayWufunBroadcast.getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                    todayWufunBroadcast.setDownloadTask(downloadTask);
                }
            }
            if (obj instanceof TodayWufunTodayNew) {
                TodayWufunTodayNew todayWufunTodayNew = (TodayWufunTodayNew) obj;
                if (todayWufunTodayNew.getMod_info() != null) {
                    ModInfoBean mod_info3 = todayWufunTodayNew.getMod_info();
                    DownloadTask downloadTask6 = this.f36191j.get(mod_info3.getMain_game_id());
                    boolean d7 = (downloadTask6 == null || downloadTask6.getStatus() != 5) ? false : com.join.android.app.common.utils.e.l0(getContext()).d(getContext(), downloadTask6.getPackageName());
                    DownloadTask downloadTask7 = this.f36191j.get(mod_info3.getMod_game_id());
                    if (downloadTask7 != null && downloadTask7.getStatus() == 5) {
                        z4 = com.join.mgps.va.overmind.d.o().F(downloadTask7.getPackageName());
                    }
                    if (z4 && d7) {
                        if (downloadTask.getCrc_link_type_val().equals(todayWufunTodayNew.getGame_id())) {
                            todayWufunTodayNew.setDownloadTask(downloadTask);
                            return;
                        }
                    } else if (z4) {
                        if (todayWufunTodayNew.getMod_info() != null && downloadTask.getCrc_link_type_val().equals(todayWufunTodayNew.getMod_info().getMod_game_id())) {
                            todayWufunTodayNew.setDownloadTask(downloadTask);
                            return;
                        }
                    } else if (d7) {
                        if (downloadTask.getCrc_link_type_val().equals(todayWufunTodayNew.getGame_id())) {
                            todayWufunTodayNew.setDownloadTask(downloadTask);
                            return;
                        }
                    } else {
                        DownloadTask F5 = todayWufunTodayNew.getMod_info() != null ? p1.f.K().F(todayWufunTodayNew.getMod_info().getMod_game_id()) : null;
                        if (F5 == null) {
                            F5 = p1.f.K().F(todayWufunTodayNew.getGame_id());
                        }
                        if (F5 != null && downloadTask.getCrc_link_type_val().equals(F5.getCrc_link_type_val())) {
                            todayWufunTodayNew.setDownloadTask(downloadTask);
                            return;
                        }
                    }
                } else if (todayWufunTodayNew.getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                    todayWufunTodayNew.setDownloadTask(downloadTask);
                }
            }
        }
    }

    private void n0() {
        String str;
        String game_id;
        String game_id2;
        for (int i4 = this.f36196o; i4 <= this.f36195n; i4++) {
            c cVar = (c) this.f36186e.getItemAtPosition(i4);
            if (cVar != null) {
                Object obj = cVar.f36201b;
                DownloadTask downloadTask = null;
                if (obj instanceof TodayWufunEverday) {
                    TodayWufunEverday todayWufunEverday = (TodayWufunEverday) obj;
                    DownloadTask downloadTask2 = todayWufunEverday.getDownloadTask();
                    if (downloadTask2 != null) {
                        game_id2 = downloadTask2.getCrc_link_type_val();
                    } else {
                        game_id2 = todayWufunEverday.getGame_id();
                    }
                    str = game_id2;
                    downloadTask = downloadTask2;
                } else {
                    str = "";
                }
                if (obj instanceof TodayWufunBroadcast) {
                    TodayWufunBroadcast todayWufunBroadcast = (TodayWufunBroadcast) obj;
                    DownloadTask downloadTask3 = todayWufunBroadcast.getDownloadTask();
                    if (downloadTask3 != null) {
                        game_id = downloadTask3.getCrc_link_type_val();
                    } else {
                        game_id = todayWufunBroadcast.getGame_id();
                    }
                    str = game_id;
                    downloadTask = downloadTask3;
                }
                if (obj instanceof TodayWufunTodayNew) {
                    TodayWufunTodayNew todayWufunTodayNew = (TodayWufunTodayNew) obj;
                    downloadTask = todayWufunTodayNew.getDownloadTask();
                    if (downloadTask != null) {
                        str = downloadTask.getCrc_link_type_val();
                    } else {
                        str = todayWufunTodayNew.getGame_id();
                    }
                }
                if (downloadTask != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                    View childAt = this.f36186e.getChildAt(i4 - this.f36196o);
                    if (childAt.getTag() instanceof z2.l) {
                        z2.l lVar = (z2.l) childAt.getTag();
                        try {
                            DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(str);
                            if (f5 == null) {
                                return;
                            }
                            long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
                            if (downloadTask.getSize() == 0) {
                                TextView textView = lVar.f46142d;
                                textView.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                            } else {
                                TextView textView2 = lVar.f46142d;
                                textView2.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                            }
                            if (downloadTask.getStatus() == 12) {
                                lVar.f46145g.setProgress((int) f5.getProgress());
                            } else {
                                lVar.f46146h.setProgress((int) f5.getProgress());
                            }
                            if (downloadTask.getStatus() == 2) {
                                TextView textView3 = lVar.f46143e;
                                textView3.setText(f5.getSpeed() + "/S");
                            }
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    } else if (childAt.getTag() instanceof z2.k) {
                        z2.k kVar = (z2.k) childAt.getTag();
                        try {
                            kVar.f46134f.setProgress((int) com.join.android.app.common.servcie.i.e().f(str).getProgress());
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void V() {
        this.f36189h = com.join.mgps.rpc.impl.d.P1();
        try {
            this.f36183b = getActivity();
            com.join.mgps.Util.d0.a().d(this);
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.f36197p = arguments.getInt("type");
            }
            List<DownloadTask> d5 = p1.f.K().d();
            this.f36190i = d5;
            if (d5 != null && d5.size() > 0) {
                for (DownloadTask downloadTask : this.f36190i) {
                    this.f36191j.put(downloadTask.getCrc_link_type_val(), downloadTask);
                }
            }
            this.f36186e.setPreLoadCount(10);
            this.f36186e.setPullLoadEnable(new a());
            this.f36186e.setPullRefreshEnable(new b());
            this.f36186e.setOnScrollListener(this);
            this.f36194m = new ArrayList();
            j0();
            com.join.mgps.adapter.z2 z2Var = new com.join.mgps.adapter.z2(this.f36183b, this.f36194m);
            this.f36192k = z2Var;
            this.f36186e.setAdapter((ListAdapter) z2Var);
            this.f36184c = 1;
            if (this.f36197p == 2) {
                b0();
            } else {
                a0();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void a0() {
        if (com.join.android.app.common.utils.j.j(this.f36183b)) {
            this.f36193l = true;
            try {
                try {
                    ResultMainBean<List<TodayWufunBean>> m02 = this.f36189h.m0(RequestBeanUtil.getInstance(this.f36183b).getNowWufun(this.f36184c));
                    if (m02 != null) {
                        List<TodayWufunBean> data = m02.getMessages().getData();
                        if (data != null) {
                            if (data.size() == 0 && this.f36184c == 1) {
                                i0();
                            } else {
                                k0(data);
                            }
                        } else {
                            i0();
                        }
                    } else {
                        i0();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    i0();
                }
                return;
            } finally {
                this.f36193l = false;
            }
        }
        i0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void b0() {
        if (com.join.android.app.common.utils.j.j(this.f36183b)) {
            this.f36193l = true;
            try {
                try {
                    ResultMainBean<List<TodayWufunTopic>> A0 = this.f36189h.A0(RequestBeanUtil.getInstance(this.f36183b).getNowWufun(this.f36184c));
                    if (A0 != null) {
                        List<TodayWufunTopic> data = A0.getMessages().getData();
                        if (data != null) {
                            l0(data);
                        } else {
                            i0();
                        }
                    } else {
                        i0();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    i0();
                }
                return;
            } finally {
                this.f36193l = false;
            }
        }
        i0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void d0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        com.join.mgps.adapter.z2 z2Var = this.f36192k;
        if (z2Var != null) {
            z2Var.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i0() {
        LinearLayout linearLayout = this.f36187f;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f36188g;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f36185d;
        if (ptrClassicFrameLayout != null) {
            ptrClassicFrameLayout.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j0() {
        LinearLayout linearLayout = this.f36187f;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f36188g;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f36185d;
        if (ptrClassicFrameLayout != null) {
            ptrClassicFrameLayout.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0(List<TodayWufunBean> list) {
        LinearLayout linearLayout = this.f36187f;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f36188g;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f36185d;
        if (ptrClassicFrameLayout != null) {
            ptrClassicFrameLayout.setVisibility(0);
        }
        XListView2 xListView2 = this.f36186e;
        if (xListView2 != null) {
            xListView2.u();
            this.f36186e.v();
        }
        if (this.f36184c == 1) {
            this.f36194m.clear();
        }
        if (list.size() > 0) {
            for (TodayWufunBean todayWufunBean : list) {
                c cVar = new c();
                cVar.f36200a = ItemType.DATETITLE;
                cVar.f36201b = Long.valueOf(todayWufunBean.getTimes() * 1000);
                this.f36194m.add(cVar);
                c cVar2 = new c();
                cVar2.f36200a = ItemType.FIND;
                TodayWufunEverday every_day_discover = todayWufunBean.getEvery_day_discover();
                if (every_day_discover != null) {
                    every_day_discover.setDownloadTask(c0(every_day_discover.getGame_id(), every_day_discover.getGame_plugin_num(), every_day_discover.getGame_down()));
                    cVar2.f36201b = every_day_discover;
                    this.f36194m.add(cVar2);
                }
                c cVar3 = new c();
                ItemType itemType = ItemType.EMPYT;
                cVar3.f36200a = itemType;
                this.f36194m.add(cVar3);
                c cVar4 = new c();
                cVar4.f36200a = ItemType.BROADCAST;
                TodayWufunBroadcast bm_broadcast = todayWufunBean.getBm_broadcast();
                if (bm_broadcast != null) {
                    bm_broadcast.setDownloadTask(c0(bm_broadcast.getGame_id(), bm_broadcast.getGame_plugin_num(), bm_broadcast.getGame_down()));
                    cVar4.f36201b = bm_broadcast;
                    this.f36194m.add(cVar4);
                }
                c cVar5 = new c();
                cVar5.f36200a = itemType;
                this.f36194m.add(cVar5);
                List<TodayWufunTodayNew> today_is_new = todayWufunBean.getToday_is_new();
                if (today_is_new != null) {
                    c cVar6 = new c();
                    cVar6.f36200a = ItemType.TODAYNEWTITLE;
                    cVar6.f36201b = "今日上线";
                    this.f36194m.add(cVar6);
                    for (TodayWufunTodayNew todayWufunTodayNew : today_is_new) {
                        c cVar7 = new c();
                        cVar7.f36200a = ItemType.TODAYNEWITEM;
                        todayWufunTodayNew.setDownloadTask(c0(todayWufunTodayNew.getGame_id(), todayWufunTodayNew.getGame_plugin_num(), todayWufunTodayNew.getGame_down()));
                        cVar7.f36201b = todayWufunTodayNew;
                        this.f36194m.add(cVar7);
                    }
                    c cVar8 = new c();
                    cVar8.f36200a = ItemType.TODAYNEWBOTTOM;
                    cVar8.f36201b = "查看更多";
                    this.f36194m.add(cVar8);
                }
                c cVar9 = new c();
                cVar9.f36200a = ItemType.EMPYT;
                this.f36194m.add(cVar9);
                if (todayWufunBean.getToday_is_topic() != null) {
                    c cVar10 = new c();
                    cVar10.f36200a = ItemType.TOPIC;
                    cVar10.f36201b = todayWufunBean.getToday_is_topic();
                    this.f36194m.add(cVar10);
                }
            }
            this.f36184c++;
        } else {
            XListView2 xListView22 = this.f36186e;
            if (xListView22 != null) {
                xListView22.setNoMore();
            }
        }
        this.f36192k.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0(List<TodayWufunTopic> list) {
        LinearLayout linearLayout = this.f36187f;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f36188g;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f36185d;
        if (ptrClassicFrameLayout != null) {
            ptrClassicFrameLayout.setVisibility(0);
        }
        XListView2 xListView2 = this.f36186e;
        if (xListView2 != null) {
            xListView2.u();
            this.f36186e.v();
        }
        if (this.f36184c == 1) {
            this.f36194m.clear();
        }
        if (list.size() > 0) {
            for (TodayWufunTopic todayWufunTopic : list) {
                c cVar = new c();
                cVar.f36200a = ItemType.TOPIC2;
                cVar.f36201b = todayWufunTopic;
                this.f36194m.add(cVar);
            }
            this.f36184c++;
        } else {
            XListView2 xListView22 = this.f36186e;
            if (xListView22 != null) {
                xListView22.setNoMore();
            }
        }
        com.join.mgps.adapter.z2 z2Var = this.f36192k;
        if (z2Var != null) {
            z2Var.notifyDataSetChanged();
        }
    }

    void o0(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    g0(downloadTask);
                    break;
                case 3:
                    e0(downloadTask);
                    break;
                case 5:
                    h0(downloadTask);
                    break;
                case 6:
                    f0(downloadTask);
                    break;
            }
        }
        this.f36192k.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.join.mgps.Util.d0.a().e(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        switch (nVar.c()) {
            case 2:
                o0(a5, 1);
                return;
            case 3:
                o0(a5, 2);
                return;
            case 4:
            case 9:
            default:
                return;
            case 5:
            case 11:
                o0(a5, 5);
                return;
            case 6:
                o0(a5, 6);
                return;
            case 7:
                o0(a5, 3);
                return;
            case 8:
                n0();
                return;
            case 10:
                o0(a5, 7);
                return;
            case 12:
                o0(a5, 8);
                return;
            case 13:
                o0(a5, 9);
                return;
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f36195n = (i5 + i4) - 1;
        this.f36196o = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        j0();
        this.f36184c = 1;
        if (this.f36197p == 2) {
            b0();
        } else {
            a0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f36183b);
    }
}
