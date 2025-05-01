package com.join.mgps.activity.message;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.join.android.app.common.utils.j;
import com.join.android.app.common.utils.n;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.customview.XListView2;
import com.join.mgps.customview.f;
import com.join.mgps.customview.g;
import com.join.mgps.dto.NoticeFragmentBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.join.mgps.rpc.i;
import com.wufan.user.service.protobuf.n0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_message_notice)
/* loaded from: classes4.dex */
public class NoticeFragment extends Fragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    PtrClassicFrameLayout f39405b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    XListView2 f39406c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f39407d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f39408e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f39409f;

    /* renamed from: g  reason: collision with root package name */
    i f39410g;

    /* renamed from: h  reason: collision with root package name */
    private n0 f39411h;

    /* renamed from: i  reason: collision with root package name */
    Context f39412i;

    /* renamed from: j  reason: collision with root package name */
    d f39413j;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    Button f39415l;

    /* renamed from: o  reason: collision with root package name */
    List<c> f39418o;

    /* renamed from: k  reason: collision with root package name */
    int f39414k = 1;

    /* renamed from: m  reason: collision with root package name */
    boolean f39416m = true;

    /* renamed from: n  reason: collision with root package name */
    boolean f39417n = false;

    /* loaded from: classes4.dex */
    class a implements g {
        a() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            NoticeFragment noticeFragment = NoticeFragment.this;
            noticeFragment.f39414k = 1;
            noticeFragment.V();
            NoticeFragment noticeFragment2 = NoticeFragment.this;
            if (noticeFragment2.f39416m) {
                noticeFragment2.a0();
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements f {
        b() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            NoticeFragment.this.V();
            NoticeFragment noticeFragment = NoticeFragment.this;
            if (noticeFragment.f39416m) {
                noticeFragment.a0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public Object f39421a;

        /* renamed from: b  reason: collision with root package name */
        public int f39422b;

        public c(Object obj, int i4) {
            this.f39421a = obj;
            this.f39422b = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d extends BaseAdapter {

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ NoticeFragmentBean.DataBean.NotificationListBean f39425b;

            a(NoticeFragmentBean.DataBean.NotificationListBean notificationListBean) {
                this.f39425b = notificationListBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NoticeFragment.this.b0(this.f39425b.getJump_info().get(0).getSub().get(0), Integer.valueOf(this.f39425b.getJump_info().get(0).getSub().get(0).getLink_type()).intValue());
            }
        }

        /* loaded from: classes4.dex */
        class b {

            /* renamed from: a  reason: collision with root package name */
            TextView f39427a;

            /* renamed from: b  reason: collision with root package name */
            TextView f39428b;

            b() {
            }
        }

        /* loaded from: classes4.dex */
        class c {

            /* renamed from: a  reason: collision with root package name */
            TextView f39430a;

            /* renamed from: b  reason: collision with root package name */
            TextView f39431b;

            /* renamed from: c  reason: collision with root package name */
            TextView f39432c;

            c() {
            }
        }

        d() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return NoticeFragment.this.f39418o.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return NoticeFragment.this.f39418o.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i4) {
            return NoticeFragment.this.f39418o.get(i4).f39422b;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            c cVar;
            b bVar;
            int itemViewType = getItemViewType(i4);
            if (itemViewType == 1) {
                if (view == null) {
                    view = LayoutInflater.from(NoticeFragment.this.f39412i).inflate(R.layout.notice_fragment_item, (ViewGroup) null);
                    cVar = new c();
                    cVar.f39430a = (TextView) view.findViewById(R.id.tv_title);
                    cVar.f39431b = (TextView) view.findViewById(R.id.tv_time);
                    cVar.f39432c = (TextView) view.findViewById(R.id.showDetail);
                    view.setTag(cVar);
                } else {
                    cVar = (c) view.getTag();
                }
                NoticeFragmentBean.DataBean.NotificationListBean notificationListBean = (NoticeFragmentBean.DataBean.NotificationListBean) NoticeFragment.this.f39418o.get(i4).f39421a;
                cVar.f39431b.setText(notificationListBean.getAdd_time());
                cVar.f39432c.setOnClickListener(new a(notificationListBean));
                cVar.f39430a.setText(notificationListBean.getTitle());
            } else if (itemViewType == 2) {
                if (view == null) {
                    view = LayoutInflater.from(NoticeFragment.this.f39412i).inflate(R.layout.notice_fragment_item_no, (ViewGroup) null);
                    bVar = new b();
                    bVar.f39428b = (TextView) view.findViewById(R.id.tv_time);
                    bVar.f39427a = (TextView) view.findViewById(R.id.tv_title);
                    view.setTag(bVar);
                } else {
                    bVar = (b) view.getTag();
                }
                NoticeFragmentBean.DataBean.NotificationListBean notificationListBean2 = (NoticeFragmentBean.DataBean.NotificationListBean) NoticeFragment.this.f39418o.get(i4).f39421a;
                bVar.f39428b.setText(notificationListBean2.getAdd_time());
                bVar.f39427a.setText(notificationListBean2.getTitle());
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void V() {
        try {
            XListView2 xListView2 = this.f39406c;
            if (xListView2 != null) {
                xListView2.l();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void W(List<c> list) {
        try {
            this.f39418o.addAll(list);
            d dVar = this.f39413j;
            if (dVar != null) {
                dVar.notifyDataSetChanged();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void X(List<c> list) {
        list.clear();
        this.f39413j.notifyDataSetChanged();
    }

    String Z(long j4) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        Date date2 = new Date(j4);
        String format = simpleDateFormat.format(date);
        String format2 = simpleDateFormat.format(date2);
        String substring = format2.substring(0, format2.indexOf("年"));
        String substring2 = format2.substring(format2.indexOf("年") + 1, format2.indexOf("月"));
        String substring3 = format2.substring(format2.indexOf("月") + 1, format2.indexOf("日"));
        String substring4 = format.substring(0, format.indexOf("年"));
        String substring5 = format.substring(format.indexOf("年") + 1, format.indexOf("月"));
        String substring6 = format.substring(format.indexOf("月") + 1, format.indexOf("日"));
        if (substring.equals(substring4)) {
            if (substring2.equals(substring5)) {
                if (substring3.equals(substring6)) {
                    if (format2.contains(":")) {
                        return format2.substring(format2.indexOf(" ") + 1, format2.lastIndexOf(":"));
                    }
                    return format2.substring(format2.indexOf(" ") + 1, format2.indexOf("分"));
                }
                return substring2 + "月" + substring3 + "日";
            }
            return substring2 + "月" + substring3 + "日";
        }
        return substring + "年" + substring2 + "月" + substring3 + "日";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void a0() {
        if (j.j(this.f39412i)) {
            try {
                this.f39416m = false;
                ArrayList arrayList = new ArrayList();
                String str = n.n(this.f39412i).y() + "_" + n.n(this.f39412i).z();
                i iVar = this.f39410g;
                int uid = this.f39411h.getUid();
                String token = this.f39411h.getToken();
                int i4 = this.f39414k;
                this.f39414k = i4 + 1;
                NoticeFragmentBean Q = iVar.Q(uid, token, i4, 10, str, "wufun");
                if (Q != null) {
                    g0();
                    if (Q.getData() != null) {
                        if (Q.getData().getNotification_list() != null && Q.getData().getNotification_list().size() > 0) {
                            if (this.f39414k == 2) {
                                X(this.f39418o);
                            }
                            for (NoticeFragmentBean.DataBean.NotificationListBean notificationListBean : Q.getData().getNotification_list()) {
                                if (notificationListBean.getJump_info() != null && !notificationListBean.getJump_info().equals("")) {
                                    arrayList.add(new c(notificationListBean, 1));
                                } else {
                                    arrayList.add(new c(notificationListBean, 2));
                                }
                            }
                            if (Q.getData().getNotification_list().size() < 10) {
                                e0();
                            }
                            this.f39416m = true;
                            W(arrayList);
                            c0();
                            return;
                        }
                        this.f39416m = true;
                        if (this.f39414k == 2) {
                            c0();
                            f0(1);
                            e0();
                            return;
                        }
                        e0();
                        return;
                    }
                    this.f39416m = true;
                    return;
                }
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                this.f39416m = true;
                c0();
                showLodingFailed();
                return;
            }
        }
        f0(2);
        c0();
        showLodingFailed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f39412i = getActivity();
        this.f39410g = com.join.mgps.rpc.impl.g.A0();
        this.f39411h = AccountUtil_.getInstance_(getActivity()).getAccountData();
        this.f39418o = new ArrayList();
        d dVar = new d();
        this.f39413j = dVar;
        this.f39406c.setAdapter((ListAdapter) dVar);
        this.f39406c.setPullRefreshEnable(new a());
        this.f39406c.setPullLoadEnable(new b());
        this.f39406c.l();
        showLoding();
        if (this.f39416m) {
            a0();
        }
    }

    void b0(NoticeFragmentBean.DataBean.NotificationListBean.JumpInfoBean.SubBean subBean, int i4) {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setTpl_type(subBean.getTpl_type());
        intentDateBean.setLink_type(i4);
        intentDateBean.setJump_type(Integer.valueOf(subBean.getJump_type()).intValue());
        intentDateBean.setCrc_link_type_val(subBean.getCrc_link_type_val());
        intentDateBean.setLink_type_val(subBean.getLink_type_val());
        IntentUtil.getInstance().intentActivity(this.f39412i, intentDateBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void c0() {
        LinearLayout linearLayout = this.f39407d;
        if (linearLayout == null || this.f39408e == null) {
            return;
        }
        try {
            linearLayout.setVisibility(8);
            this.f39408e.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void d0() {
        XListView2 xListView2;
        if (this.f39405b == null || (xListView2 = this.f39406c) == null || this.f39409f == null) {
            return;
        }
        xListView2.setVisibility(0);
        this.f39405b.setVisibility(0);
        this.f39409f.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e0() {
        XListView2 xListView2 = this.f39406c;
        if (xListView2 != null) {
            xListView2.setNoMore();
            this.f39406c.v();
            this.f39406c.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void f0(int i4) {
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f39405b;
        if (ptrClassicFrameLayout == null || this.f39406c == null || this.f39409f == null) {
            return;
        }
        if (i4 == 1) {
            ptrClassicFrameLayout.setVisibility(8);
            this.f39406c.setVisibility(8);
            this.f39409f.setVisibility(0);
            return;
        }
        ptrClassicFrameLayout.setVisibility(8);
        this.f39406c.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g0() {
        XListView2 xListView2 = this.f39406c;
        if (xListView2 != null) {
            try {
                xListView2.u();
                this.f39406c.v();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f39416m = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f39412i);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z4) {
        super.setUserVisibleHint(z4);
        if (z4 && this.f39417n) {
            this.f39417n = false;
            this.f39414k = 1;
            a0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            LinearLayout linearLayout = this.f39407d;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            LinearLayout linearLayout2 = this.f39408e;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        LinearLayout linearLayout = this.f39408e;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f39407d;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }
}
