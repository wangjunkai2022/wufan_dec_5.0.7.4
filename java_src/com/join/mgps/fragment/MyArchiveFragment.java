package com.join.mgps.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.MApplication;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l1;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.DocumentManageActivity;
import com.join.mgps.customview.ClouldItemView;
import com.join.mgps.dialog.a0;
import com.join.mgps.dialog.w;
import com.join.mgps.dialog.x;
import com.join.mgps.dto.ArchiveColudArgs;
import com.join.mgps.dto.ArchiveDataBean;
import com.join.mgps.dto.ArchiveResponseMain;
import com.join.mgps.dto.ArchiveResponseMessage;
import com.join.mgps.dto.CLoudUploadMain;
import com.join.mgps.dto.CloudListDataBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.RecoverFileJson;
import com.join.mgps.dto.RomArchived;
import com.join.mgps.pref.PrefDef_;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.item_archive)
/* loaded from: classes.dex */
public class MyArchiveFragment extends Fragment implements com.join.mgps.listener.c, com.join.android.app.common.http.g, com.join.mgps.listener.e {
    x A;
    ArchiveAdapter B;
    com.join.mgps.dialog.x E;
    com.join.mgps.dialog.d1 F;
    ArchiveDataBean G;
    com.join.mgps.dialog.d1 I;
    Iterator<CloudListDataBean> O;
    List<CloudListDataBean> P;
    String W;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RelativeLayout f52241b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ImageView f52242c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f52243d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    Button f52244e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    Button f52245f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    RecyclerView f52246g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f52247h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f52248i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f52249j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    RelativeLayout f52250k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    TextView f52251l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    LinearLayout f52252m;
    @Pref

    /* renamed from: n  reason: collision with root package name */
    PrefDef_ f52253n;

    /* renamed from: o  reason: collision with root package name */
    List<RomArchived> f52254o;

    /* renamed from: p  reason: collision with root package name */
    List<CloudListDataBean> f52255p;

    /* renamed from: q  reason: collision with root package name */
    List<CloudListDataBean> f52256q;

    /* renamed from: r  reason: collision with root package name */
    private com.wufan.user.service.protobuf.n0 f52257r;

    /* renamed from: s  reason: collision with root package name */
    com.join.mgps.rpc.d f52258s;

    /* renamed from: t  reason: collision with root package name */
    String f52259t;

    /* renamed from: u  reason: collision with root package name */
    int f52260u;

    /* renamed from: v  reason: collision with root package name */
    LocalBroadcastManager f52261v;

    /* renamed from: w  reason: collision with root package name */
    IntentFilter f52262w;

    /* renamed from: x  reason: collision with root package name */
    IntentFilter f52263x;

    /* renamed from: y  reason: collision with root package name */
    u f52264y;

    /* renamed from: z  reason: collision with root package name */
    v f52265z;
    boolean C = false;
    boolean D = false;
    boolean H = false;
    private boolean J = true;
    boolean K = false;
    boolean L = true;
    int M = 0;
    boolean N = false;
    int Q = 0;
    long R = 0;
    long S = 0;
    long T = 0;
    long U = 0;
    int V = 0;

    /* loaded from: classes3.dex */
    public class ArchiveAdapter extends RecyclerView.Adapter<MyViewHolder> {

        /* renamed from: a  reason: collision with root package name */
        Context f52266a;

        /* renamed from: b  reason: collision with root package name */
        boolean f52267b = false;

        /* loaded from: classes3.dex */
        public class MyViewHolder extends RecyclerView.ViewHolder {

            /* renamed from: a  reason: collision with root package name */
            ImageView f52269a;

            /* renamed from: b  reason: collision with root package name */
            ImageView f52270b;

            /* renamed from: c  reason: collision with root package name */
            ClouldItemView f52271c;

            /* renamed from: d  reason: collision with root package name */
            RelativeLayout f52272d;

            public MyViewHolder(View view) {
                super(view);
                this.f52269a = (ImageView) view.findViewById(R.id.iv_nor);
                this.f52270b = (ImageView) view.findViewById(R.id.iv_select);
                this.f52271c = (ClouldItemView) view.findViewById(R.id.coulditem);
                this.f52272d = (RelativeLayout) view.findViewById(R.id.rl_image);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f52274b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ MyViewHolder f52275c;

            a(int i4, MyViewHolder myViewHolder) {
                this.f52274b = i4;
                this.f52275c = myViewHolder;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int i4 = 0;
                if (MyArchiveFragment.this.f52255p.get(this.f52274b).getIsCheck() == 0) {
                    MyArchiveFragment myArchiveFragment = MyArchiveFragment.this;
                    if (myArchiveFragment.f52260u == 2) {
                        if (myArchiveFragment.f52255p.get(this.f52274b).getStatus() != 5) {
                            this.f52275c.f52269a.setVisibility(8);
                            this.f52275c.f52270b.setVisibility(0);
                            MyArchiveFragment.this.f52255p.get(this.f52274b).setIsCheck(1);
                            int i5 = 0;
                            for (int i6 = 0; i6 < MyArchiveFragment.this.f52255p.size(); i6++) {
                                if (MyArchiveFragment.this.f52255p.get(i6).getIsCheck() == 1 && MyArchiveFragment.this.f52255p.get(i6).getStatus() != 5) {
                                    i5++;
                                }
                            }
                            int i7 = 0;
                            while (i4 < MyArchiveFragment.this.f52255p.size()) {
                                if (MyArchiveFragment.this.f52255p.get(i4).getStatus() == 5) {
                                    i7++;
                                }
                                i4++;
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append("SSS-->");
                            sb.append(i5);
                            sb.append("ssss->");
                            sb.append(i7);
                            TextView textView = MyArchiveFragment.this.f52243d;
                            textView.setText("已选择" + i5 + "个存档");
                            if (MyArchiveFragment.this.f52255p.size() - i7 == i5) {
                                MyArchiveFragment myArchiveFragment2 = MyArchiveFragment.this;
                                myArchiveFragment2.K = true;
                                myArchiveFragment2.f52242c.setBackgroundResource(R.drawable.batch_select);
                            }
                        } else {
                            MyArchiveFragment.this.D0("已备份");
                        }
                    } else if (myArchiveFragment.f52255p.get(this.f52274b).getStatus() != 0) {
                        this.f52275c.f52269a.setVisibility(8);
                        this.f52275c.f52270b.setVisibility(0);
                        MyArchiveFragment.this.f52255p.get(this.f52274b).setIsCheck(1);
                        int i8 = 0;
                        for (int i9 = 0; i9 < MyArchiveFragment.this.f52255p.size(); i9++) {
                            if (MyArchiveFragment.this.f52255p.get(i9).getIsCheck() == 1 && MyArchiveFragment.this.f52255p.get(i9).getStatus() != 0) {
                                i8++;
                            }
                        }
                        int i10 = 0;
                        while (i4 < MyArchiveFragment.this.f52255p.size()) {
                            if (MyArchiveFragment.this.f52255p.get(i4).getStatus() == 0) {
                                i10++;
                            }
                            i4++;
                        }
                        TextView textView2 = MyArchiveFragment.this.f52243d;
                        textView2.setText("已选择" + i8 + "个存档");
                        if (MyArchiveFragment.this.f52255p.size() - i10 == i8) {
                            MyArchiveFragment.this.f52242c.setBackgroundResource(R.drawable.batch_select);
                            MyArchiveFragment.this.K = true;
                        }
                    } else {
                        MyArchiveFragment.this.D0("已下载");
                    }
                    MyArchiveFragment.this.B.notifyDataSetChanged();
                    return;
                }
                this.f52275c.f52270b.setVisibility(8);
                this.f52275c.f52269a.setVisibility(0);
                MyArchiveFragment.this.f52255p.get(this.f52274b).setIsCheck(0);
                int i11 = 0;
                while (i4 < MyArchiveFragment.this.f52255p.size()) {
                    if (MyArchiveFragment.this.f52255p.get(i4).getIsCheck() == 1) {
                        i11++;
                    }
                    i4++;
                }
                TextView textView3 = MyArchiveFragment.this.f52243d;
                textView3.setText("已选择" + i11 + "个存档");
                if (MyArchiveFragment.this.f52255p.size() != i11) {
                    MyArchiveFragment.this.f52242c.setBackgroundResource(R.drawable.batch_nor);
                }
                MyArchiveFragment.this.B.notifyDataSetChanged();
            }
        }

        public ArchiveAdapter(Context context) {
            this.f52266a = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: a */
        public void onBindViewHolder(MyViewHolder myViewHolder, int i4) {
            if (i4 >= MyArchiveFragment.this.f52255p.size()) {
                return;
            }
            if (MyArchiveFragment.this.f52255p.get(i4).getIsCheck() == 1) {
                myViewHolder.f52270b.setVisibility(0);
                myViewHolder.f52269a.setVisibility(8);
            } else {
                myViewHolder.f52270b.setVisibility(8);
                myViewHolder.f52269a.setVisibility(0);
            }
            myViewHolder.f52272d.setOnClickListener(new a(i4, myViewHolder));
            MyArchiveFragment myArchiveFragment = MyArchiveFragment.this;
            if (myArchiveFragment.C) {
                int i5 = myArchiveFragment.f52260u;
                if (i5 == 2) {
                    if (myArchiveFragment.f52255p.get(i4).getStatus() != 5) {
                        myViewHolder.f52272d.setVisibility(0);
                    } else {
                        myViewHolder.f52272d.setVisibility(0);
                        myViewHolder.f52269a.setVisibility(4);
                        myViewHolder.f52270b.setVisibility(4);
                    }
                } else if (i5 == 1) {
                    if (myArchiveFragment.f52255p.get(i4).getStatus() != 0) {
                        myViewHolder.f52272d.setVisibility(0);
                    } else {
                        myViewHolder.f52272d.setVisibility(0);
                        myViewHolder.f52269a.setVisibility(4);
                        myViewHolder.f52270b.setVisibility(4);
                    }
                }
            } else {
                myViewHolder.f52272d.setVisibility(8);
            }
            myViewHolder.f52271c.setCloudItemListener(MyArchiveFragment.this);
            ClouldItemView clouldItemView = myViewHolder.f52271c;
            MyArchiveFragment myArchiveFragment2 = MyArchiveFragment.this;
            MyArchiveFragment myArchiveFragment3 = MyArchiveFragment.this;
            clouldItemView.setData(myArchiveFragment2.f52259t, myArchiveFragment2.f52255p.get(i4), myArchiveFragment3.f52260u, 9, myArchiveFragment3.C, false, myArchiveFragment3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: d */
        public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
            return new MyViewHolder(LayoutInflater.from(this.f52266a).inflate(R.layout.item_rcy_archive, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return MyArchiveFragment.this.f52255p.size();
        }
    }

    /* loaded from: classes3.dex */
    class a implements w.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f52277a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f52278b;

        a(CloudListDataBean cloudListDataBean, boolean z4) {
            this.f52277a = cloudListDataBean;
            this.f52278b = z4;
        }

        @Override // com.join.mgps.dialog.w.e
        public void a(com.join.mgps.dialog.w wVar) {
            MyArchiveFragment.this.j0(this.f52277a, this.f52278b);
            if (!MyArchiveFragment.this.J) {
                MyArchiveFragment.this.f52253n.DownloadRecoderNotice().g(Boolean.FALSE);
            }
            wVar.dismiss();
        }
    }

    /* loaded from: classes3.dex */
    class b implements w {
        b() {
        }

        @Override // com.join.mgps.fragment.MyArchiveFragment.w
        public void a(boolean z4, CloudListDataBean cloudListDataBean) {
            MyArchiveFragment.this.H0(cloudListDataBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements CompoundButton.OnCheckedChangeListener {
        c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
            if (z4) {
                MyArchiveFragment.this.L = false;
            } else {
                MyArchiveFragment.this.L = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements w.e {
        d() {
        }

        @Override // com.join.mgps.dialog.w.e
        public void a(com.join.mgps.dialog.w wVar) {
            wVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements w.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f52283a;

        e(CloudListDataBean cloudListDataBean) {
            this.f52283a = cloudListDataBean;
        }

        @Override // com.join.mgps.dialog.w.e
        public void a(com.join.mgps.dialog.w wVar) {
            MyArchiveFragment.this.O0(this.f52283a);
            MyArchiveFragment myArchiveFragment = MyArchiveFragment.this;
            if (!myArchiveFragment.L) {
                myArchiveFragment.f52253n.uploadRecoderNotice().g(Boolean.FALSE);
            }
            wVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f52285a;

        f(w wVar) {
            this.f52285a = wVar;
        }

        @Override // com.join.mgps.fragment.MyArchiveFragment.w
        public void a(boolean z4, CloudListDataBean cloudListDataBean) {
            if (!z4) {
                this.f52285a.a(z4, cloudListDataBean);
            } else if (z4) {
                MyArchiveFragment.this.M++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g implements a0.c {
        g() {
        }

        @Override // com.join.mgps.dialog.a0.c
        public void a(com.join.mgps.dialog.a0 a0Var) {
            a0Var.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class h implements a0.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f52288a;

        h(CloudListDataBean cloudListDataBean) {
            this.f52288a = cloudListDataBean;
        }

        @Override // com.join.mgps.dialog.a0.c
        public void a(com.join.mgps.dialog.a0 a0Var) {
            if (g2.h(a0Var.a())) {
                MyArchiveFragment.this.showMessage("描述信息不能为空");
                return;
            }
            MyArchiveFragment.this.E.f("存档分享中");
            MyArchiveFragment.this.E.e("取消分享");
            MyArchiveFragment myArchiveFragment = MyArchiveFragment.this;
            if (myArchiveFragment.N) {
                l2.a(myArchiveFragment.getContext()).b("已有上传进行中");
                com.join.mgps.dialog.x xVar = MyArchiveFragment.this.E;
                if (xVar != null) {
                    xVar.show();
                    return;
                }
                return;
            }
            myArchiveFragment.A0(this.f52288a, a0Var.a());
            MyArchiveFragment myArchiveFragment2 = MyArchiveFragment.this;
            if (!myArchiveFragment2.L) {
                myArchiveFragment2.f52253n.uploadRecoderNotice().g(Boolean.FALSE);
            }
            a0Var.dismiss();
        }
    }

    /* loaded from: classes3.dex */
    class i implements w {
        i() {
        }

        @Override // com.join.mgps.fragment.MyArchiveFragment.w
        public void a(boolean z4, CloudListDataBean cloudListDataBean) {
            MyArchiveFragment.this.G0(cloudListDataBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class j implements com.join.mgps.listener.e {
        j() {
        }

        @Override // com.join.mgps.listener.e
        public void J(CloudListDataBean cloudListDataBean) {
            MyArchiveFragment myArchiveFragment = MyArchiveFragment.this;
            myArchiveFragment.N = false;
            myArchiveFragment.C0(false);
        }

        @Override // com.join.mgps.listener.e
        public void Q(CloudListDataBean cloudListDataBean) {
            MyArchiveFragment myArchiveFragment = MyArchiveFragment.this;
            myArchiveFragment.N = false;
            myArchiveFragment.C0(false);
            MyArchiveFragment myArchiveFragment2 = MyArchiveFragment.this;
            if (myArchiveFragment2.H) {
                return;
            }
            myArchiveFragment2.showMessage("备份失败");
        }
    }

    /* loaded from: classes3.dex */
    class k implements x.c {
        k() {
        }

        @Override // com.join.mgps.dialog.x.c
        public void a(com.join.mgps.dialog.x xVar) {
            xVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class l implements com.join.android.app.common.http.g {
        l() {
        }

        @Override // com.join.android.app.common.http.g
        public void onRequestProgress(long j4, long j5, boolean z4, String str) {
        }

        @Override // com.join.android.app.common.http.g
        public void onUploadFailed(String str) {
        }
    }

    /* loaded from: classes3.dex */
    class m implements x.c {
        m() {
        }

        @Override // com.join.mgps.dialog.x.c
        public void a(com.join.mgps.dialog.x xVar) {
            if (MyArchiveFragment.this.O != null) {
                while (MyArchiveFragment.this.O.hasNext()) {
                    MyArchiveFragment.this.O.next();
                    MyArchiveFragment.this.O.remove();
                }
            }
            MyArchiveFragment myArchiveFragment = MyArchiveFragment.this;
            myArchiveFragment.N = false;
            myArchiveFragment.H = true;
            xVar.dismiss();
        }
    }

    /* loaded from: classes3.dex */
    class n implements View.OnClickListener {

        /* loaded from: classes3.dex */
        class a implements CompoundButton.OnCheckedChangeListener {
            a() {
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                if (z4) {
                    MyArchiveFragment.this.J = false;
                } else {
                    MyArchiveFragment.this.J = true;
                }
            }
        }

        /* loaded from: classes3.dex */
        class b implements w.e {
            b() {
            }

            @Override // com.join.mgps.dialog.w.e
            public void a(com.join.mgps.dialog.w wVar) {
                wVar.dismiss();
            }
        }

        /* loaded from: classes3.dex */
        class c implements w.e {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List f52298a;

            c(List list) {
                this.f52298a = list;
            }

            @Override // com.join.mgps.dialog.w.e
            public void a(com.join.mgps.dialog.w wVar) {
                MyArchiveFragment.this.k0(this.f52298a);
                if (!MyArchiveFragment.this.J) {
                    MyArchiveFragment.this.f52253n.DownloadRecoderNotice().g(Boolean.FALSE);
                }
                wVar.dismiss();
            }
        }

        /* loaded from: classes3.dex */
        class d implements w {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List f52300a;

            d(List list) {
                this.f52300a = list;
            }

            @Override // com.join.mgps.fragment.MyArchiveFragment.w
            public void a(boolean z4, CloudListDataBean cloudListDataBean) {
                MyArchiveFragment.this.I.dismiss();
                if (z4) {
                    MyArchiveFragment.this.u0(this.f52300a);
                } else {
                    l2.a(MyArchiveFragment.this.getContext()).b("备份失败");
                }
            }
        }

        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MyArchiveFragment.this.q0()) {
                if (AccountUtil_.getInstance_(MyArchiveFragment.this.getContext()).isTourist()) {
                    IntentUtil.getInstance().goMyAccountLoginActivity(MyArchiveFragment.this.getContext());
                } else if (MyArchiveFragment.this.f52260u == 1) {
                    ArrayList arrayList = new ArrayList();
                    for (CloudListDataBean cloudListDataBean : MyArchiveFragment.this.f52255p) {
                        if (cloudListDataBean.getIsCheck() == 1 && cloudListDataBean.getStatus() == 6) {
                            arrayList.add(cloudListDataBean);
                        }
                    }
                    if (arrayList.size() == 0) {
                        MyArchiveFragment.this.showMessage("请选择存档");
                    } else if (!MyArchiveFragment.this.f52253n.DownloadRecoderNotice().d().booleanValue()) {
                        MyArchiveFragment.this.k0(arrayList);
                    } else {
                        new com.join.mgps.dialog.w(MyArchiveFragment.this.getActivity(), R.style.HKDialogLoading).g("下载须知").d("下载后，将以备份存档为准，覆盖本地同名存档").f("确定").b("取消").e(new c(arrayList)).a(new b()).c(new a()).show();
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (CloudListDataBean cloudListDataBean2 : MyArchiveFragment.this.f52255p) {
                        if (cloudListDataBean2.getIsCheck() == 1 && cloudListDataBean2.getStatus() != 5) {
                            arrayList2.add(cloudListDataBean2);
                        }
                    }
                    if (arrayList2.size() == 0) {
                        MyArchiveFragment.this.showMessage("请选择存档");
                        return;
                    }
                    MyArchiveFragment.this.I.b();
                    MyArchiveFragment.this.z0(arrayList2, true, new d(arrayList2));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid(MApplication.P);
            com.join.mgps.Util.j0.w0(MyArchiveFragment.this.getActivity(), forumPostsBean, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class p implements CompoundButton.OnCheckedChangeListener {
        p() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
            if (z4) {
                MyArchiveFragment.this.J = false;
            } else {
                MyArchiveFragment.this.J = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class q implements w.e {
        q() {
        }

        @Override // com.join.mgps.dialog.w.e
        public void a(com.join.mgps.dialog.w wVar) {
            wVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class r implements w.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f52305a;

        r(List list) {
            this.f52305a = list;
        }

        @Override // com.join.mgps.dialog.w.e
        public void a(com.join.mgps.dialog.w wVar) {
            MyArchiveFragment.this.P0(this.f52305a);
            if (!MyArchiveFragment.this.J) {
                MyArchiveFragment.this.f52253n.DownloadRecoderNotice().g(Boolean.FALSE);
            }
            wVar.dismiss();
        }
    }

    /* loaded from: classes3.dex */
    class s implements CompoundButton.OnCheckedChangeListener {
        s() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
            if (z4) {
                MyArchiveFragment.this.J = false;
            } else {
                MyArchiveFragment.this.J = true;
            }
        }
    }

    /* loaded from: classes3.dex */
    class t implements w.e {
        t() {
        }

        @Override // com.join.mgps.dialog.w.e
        public void a(com.join.mgps.dialog.w wVar) {
            wVar.dismiss();
        }
    }

    /* loaded from: classes3.dex */
    class u extends BroadcastReceiver {
        u() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                MyArchiveFragment myArchiveFragment = MyArchiveFragment.this;
                myArchiveFragment.C = true;
                myArchiveFragment.f52241b.setVisibility(0);
                MyArchiveFragment.this.B.notifyDataSetChanged();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* loaded from: classes3.dex */
    class v extends BroadcastReceiver {
        v() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                MyArchiveFragment myArchiveFragment = MyArchiveFragment.this;
                myArchiveFragment.C = false;
                myArchiveFragment.f52241b.setVisibility(8);
                if (MyArchiveFragment.this.f52255p != null) {
                    for (int i4 = 0; i4 < MyArchiveFragment.this.f52255p.size(); i4++) {
                        MyArchiveFragment.this.f52255p.get(i4).setIsCheck(0);
                    }
                }
                MyArchiveFragment.this.f52242c.setBackgroundResource(R.drawable.batch_nor);
                MyArchiveFragment.this.f52243d.setText("已选择0个存档");
                MyArchiveFragment.this.B.notifyDataSetChanged();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface w {
        void a(boolean z4, CloudListDataBean cloudListDataBean);
    }

    /* loaded from: classes3.dex */
    class x extends BroadcastReceiver {
        x() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com.join.mgps.dialog.x xVar;
            MyArchiveFragment myArchiveFragment = MyArchiveFragment.this;
            if (!myArchiveFragment.N || (xVar = myArchiveFragment.E) == null) {
                return;
            }
            xVar.show();
        }
    }

    public static byte[] B0(short s4) {
        byte[] bArr = new byte[2];
        int i4 = 0;
        int i5 = s4;
        while (i4 < 2) {
            bArr[i4] = new Integer(i5 & 255).byteValue();
            i4++;
            i5 >>= 8;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0(CloudListDataBean cloudListDataBean) {
        List<CloudListDataBean> list = this.P;
        if (list != null) {
            list.clear();
        }
        this.E.f("存档备份中");
        this.E.e("取消备份");
        C0(true);
        this.N = true;
        this.H = false;
        Q0(cloudListDataBean, new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0(List<CloudListDataBean> list) {
        List<CloudListDataBean> list2 = this.P;
        if (list2 != null) {
            list2.clear();
        }
        this.P = list;
        this.O = list.iterator();
        this.Q = 0;
        this.H = false;
        this.E.f("存档备份中");
        this.E.e("取消备份");
        this.N = true;
        C0(true);
        if (this.O.hasNext()) {
            Q0(this.O.next(), this);
            this.Q++;
            return;
        }
        this.N = false;
        C0(false);
    }

    private void S0(CloudListDataBean cloudListDataBean, InputStream inputStream, byte[] bArr, File file, w wVar) {
        File file2 = new File(cloudListDataBean.getArchiveFilePath() + "default");
        try {
            if (file2.exists()) {
                UtilsMy.delete(file2);
            }
            try {
                file2.createNewFile();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                try {
                    RecoverFileJson recoverFileJson = new RecoverFileJson();
                    recoverFileJson.setGameID(this.f52259t);
                    recoverFileJson.setUserID(AccountUtil_.getInstance_(getContext()).getUid());
                    String json = JsonMapper.getInstance().toJson(recoverFileJson);
                    byte[] F0 = F0(json);
                    byte[] B0 = B0((short) (json.length() + 1));
                    ByteBuffer allocate = ByteBuffer.allocate(json.length() + 3);
                    allocate.put(B0);
                    allocate.put(F0);
                    allocate.put((byte) 0);
                    byte[] F02 = F0(com.join.mgps.Util.x0.a(allocate.array()));
                    ByteBuffer allocate2 = ByteBuffer.allocate(json.length() + 39 + 3);
                    allocate2.put(F0("WFSTE"));
                    allocate2.put((byte) 0);
                    allocate2.put(F02);
                    allocate2.put((byte) 0);
                    allocate2.put(allocate.array());
                    fileOutputStream.write(allocate2.array());
                    System.out.println(new String(allocate2.array()));
                    if (bArr != null) {
                        fileOutputStream.write(bArr);
                    }
                    byte[] bArr2 = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr2);
                        if (read != -1) {
                            fileOutputStream.write(bArr2, 0, read);
                        } else {
                            fileOutputStream.close();
                            inputStream.close();
                            UtilsMy.delete(file);
                            file2.renameTo(file);
                            wVar.a(true, cloudListDataBean);
                            try {
                                fileOutputStream.close();
                                inputStream.close();
                                return;
                            } catch (IOException e6) {
                                e = e6;
                                e.printStackTrace();
                            }
                        }
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                    throw th;
                }
            } catch (IOException e8) {
                showMessage("写入信息异常");
                e8.printStackTrace();
                try {
                    fileOutputStream.close();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e9) {
                    e = e9;
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e10) {
            e10.printStackTrace();
            showMessage("文件没找到异常");
        }
    }

    private void h0(String str) {
        try {
            File file = new File(str.replace(com.join.mgps.Util.v.f28104d, Environment.getExternalStorageDirectory().getAbsolutePath()));
            if (file.exists()) {
                boolean delete = UtilsMy.delete(file);
                StringBuilder sb = new StringBuilder();
                sb.append(delete);
                sb.append(str);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(CloudListDataBean cloudListDataBean, boolean z4) {
        if (z4) {
            cloudListDataBean.setArchiveFilePath(com.join.mgps.Util.v.f28109i + File.separator + cloudListDataBean.getArchiveFileName());
        } else {
            cloudListDataBean.setArchiveFilePath(com.join.mgps.Util.v.f28108h + File.separator + cloudListDataBean.getArchiveFileName());
        }
        Intent intent = new Intent(o1.a.f72003h0);
        intent.putExtra("downCloud", cloudListDataBean);
        getActivity().sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(List<CloudListDataBean> list) {
        Intent intent = new Intent("com.cloud.downCloud.all");
        intent.putExtra("downClouds", (Serializable) list);
        getActivity().sendBroadcast(intent);
    }

    private ArchiveColudArgs l0() {
        if (this.f52257r == null) {
            l2.a(getActivity()).b("请先登录");
            return null;
        }
        RequestBeanUtil requestBeanUtil = RequestBeanUtil.getInstance(getActivity());
        return requestBeanUtil.getArchiveColud(this.f52257r.getUid() + "", this.f52257r.getToken(), this.f52259t);
    }

    private String o0(String str) {
        String substring = str.substring(str.lastIndexOf(com.join.mgps.Util.h0.f27805a) + 1, str.length());
        if ("0".equals(substring)) {
            return "快速存档";
        }
        if ("99".equals(substring)) {
            return "自动保存的存档";
        }
        return "存档" + substring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q0() {
        if (AccountUtil_.getInstance_(getContext()).isTourist()) {
            IntentUtil.getInstance().goMyAccountLoginActivity(getContext());
            return false;
        } else if (AccountUtil_.getInstance_(getContext()).getAccountData().getUid() == 0) {
            IntentUtil.getInstance().goMyAccountLoginActivity(getContext());
            return false;
        } else {
            return true;
        }
    }

    private void v0(CloudListDataBean cloudListDataBean, int i4) {
        com.join.mgps.event.f fVar = new com.join.mgps.event.f();
        cloudListDataBean.setStatus(i4);
        fVar.f(cloudListDataBean);
        fVar.j(i4);
        org.greenrobot.eventbus.c.f().o(fVar);
    }

    private void w0(int i4) {
        try {
            ArchiveColudArgs l02 = l0();
            if (l02 == null) {
                return;
            }
            if (!AccountUtil_.getInstance_(getActivity()).getToken().equals("") && this.f52257r.getUid() != 0 && !AccountUtil_.getInstance_(getActivity()).isTourist()) {
                ArchiveDataBean h4 = this.f52258s.h(l02.getArgs());
                this.G = h4;
                if (i4 == 1) {
                    if (h4.getCode() == -1 && this.G.getMsg().equals("701")) {
                        AccountUtil_.getInstance_(getActivity()).accountLoginOut(getActivity());
                        I0();
                    }
                    ArchiveDataBean archiveDataBean = this.G;
                    if (archiveDataBean == null) {
                        s0();
                        return;
                    }
                    List<CloudListDataBean> cloudList = archiveDataBean.getData_info().getCloudList();
                    DownloadTask F = p1.f.K().F(this.f52259t);
                    if (F != null) {
                        List<RomArchived> m4 = com.join.mgps.Util.g0.m(F.getPlugin_num(), F.getGameZipPath());
                        this.f52254o = m4;
                        if (m4 != null) {
                            for (CloudListDataBean cloudListDataBean : cloudList) {
                                cloudListDataBean.setStatus(6);
                                for (RomArchived romArchived : this.f52254o) {
                                    if (cloudListDataBean.getArchiveFileName().equals(romArchived.getFileName()) && cloudListDataBean.getFileMd5().equals(romArchived.getMd5())) {
                                        cloudListDataBean.setStatus(0);
                                        cloudListDataBean.setArchiveFilePath(romArchived.getArchivedPath());
                                    }
                                }
                            }
                        }
                    }
                    updateUi(cloudList);
                    return;
                }
                this.f52256q = h4.getData_info().getCloudList();
                K0(this.f52254o);
                return;
            }
            s0();
        } catch (Exception e5) {
            e5.printStackTrace();
            if (i4 == 2) {
                n0();
            }
        }
    }

    private void x0() {
        DownloadTask F = p1.f.K().F(this.f52259t);
        if (F == null) {
            s0();
            return;
        }
        List<RomArchived> m4 = com.join.mgps.Util.g0.m(F.getPlugin_num(), F.getGameZipPath());
        boolean z4 = false;
        if (F.getPlugin_num().equals("31")) {
            boolean z5 = false;
            boolean z6 = false;
            for (RomArchived romArchived : m4) {
                if (romArchived.getFileName().contains("_v2")) {
                    z5 = true;
                } else {
                    z6 = true;
                }
            }
            Iterator<RomArchived> it2 = m4.iterator();
            while (it2.hasNext()) {
                RomArchived next = it2.next();
                if (!z6 || z5) {
                    if (z6 && z5) {
                        if (l1.a(F.getPackageName())) {
                            if (next.getFileName().contains("_v2")) {
                                it2.remove();
                            }
                        } else if (!next.getFileName().contains("_v2")) {
                            it2.remove();
                        }
                    }
                } else if (!l1.a(F.getPackageName())) {
                    it2.remove();
                }
            }
        }
        if (F.getPlugin_num().equals("31")) {
            boolean z7 = false;
            for (RomArchived romArchived2 : m4) {
                if (romArchived2.getFileName().contains("_v2")) {
                    z4 = true;
                } else {
                    z7 = true;
                }
            }
            Iterator<RomArchived> it3 = m4.iterator();
            while (it3.hasNext()) {
                RomArchived next2 = it3.next();
                if (!z7 || z4) {
                    if (z7 && z4) {
                        if (l1.a(F.getPackageName())) {
                            if (next2.getFileName().contains("_v2")) {
                                it3.remove();
                            }
                        } else if (!next2.getFileName().contains("_v2")) {
                            it3.remove();
                        }
                    }
                } else if (!l1.a(F.getPackageName())) {
                    it3.remove();
                }
            }
        }
        K0(m4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void A0(CloudListDataBean cloudListDataBean, String str) {
        String[] strArr;
        try {
            E0(true);
            if (this.f52260u == 1) {
                strArr = new String[]{"", ""};
            } else if (cloudListDataBean.getArchiveCoverFilePath() == null) {
                return;
            } else {
                strArr = new String[]{cloudListDataBean.getArchiveFilePath(), cloudListDataBean.getArchiveCoverFilePath()};
            }
            l lVar = new l();
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getActivity()).getAccountData();
            com.join.android.app.common.http.h b5 = com.join.android.app.common.http.h.b();
            String d5 = b5.d(strArr, accountData.getUid() + "", accountData.getToken(), this.f52259t, cloudListDataBean.getArchiveName(), cloudListDataBean.getArchiveFileName(), lVar, str, this.f52260u);
            if (g2.i(d5)) {
                CLoudUploadMain cLoudUploadMain = (CLoudUploadMain) JsonMapper.getInstance().fromJson(d5, CLoudUploadMain.class);
                if (cLoudUploadMain.getCode() == 600) {
                    E0(false);
                    showMessage(cLoudUploadMain.getData_info().getMsg());
                    return;
                } else if ("701".equals(cLoudUploadMain.getMsg())) {
                    I0();
                    showMessage("你的登陆已失效，请重新登陆。");
                } else {
                    showMessage(cLoudUploadMain.getMsg());
                }
            } else {
                showMessage("分享失败");
            }
            E0(false);
        } catch (Exception e5) {
            e5.printStackTrace();
            showMessage("分享失败");
            E0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void C0(boolean z4) {
        try {
            if (z4) {
                this.E.show();
            } else {
                this.E.dismiss();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void D0(String str) {
        l2.a(getActivity()).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void E0(boolean z4) {
        try {
            if (z4) {
                this.F.show();
            } else {
                this.F.dismiss();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public byte[] F0(String str) {
        if (str == null) {
            return null;
        }
        return str.getBytes();
    }

    @Override // com.join.mgps.listener.c
    public void G(CloudListDataBean cloudListDataBean) {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getContext()).getAccountData();
        if (accountData != null && accountData.getUid() != 0 && !AccountUtil_.getInstance_(getContext()).isTourist()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(cloudListDataBean);
            if (this.f52260u == 1) {
                G0(cloudListDataBean);
                return;
            } else {
                z0(arrayList, false, new i());
                return;
            }
        }
        IntentUtil.getInstance().goMyAccountLoginActivity(getContext());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void G0(CloudListDataBean cloudListDataBean) {
        if (q0()) {
            if (p1.f.K().F(this.f52259t).getPlugin_num().equals("31") && !cloudListDataBean.getArchiveFileName().contains("_v2")) {
                l2.a(getContext()).b("此版本存档不能分享");
            } else if (this.f52257r.O1() < this.f52253n.getArchiveCoinPref().d().intValue()) {
                l2.a(getContext()).b("铜板余额不足");
            } else {
                com.join.mgps.dialog.a0 a0Var = new com.join.mgps.dialog.a0(getActivity(), R.style.HKDialogLoading);
                com.join.mgps.dialog.a0 b5 = a0Var.d("发布需要先扣除您" + this.f52253n.getArchiveCoinPref().d() + "铜板保证金，他人下载所支付铜板将完全归你所有。").g("确定").c("取消").f(new h(cloudListDataBean)).b(new g());
                StringBuilder sb = new StringBuilder();
                sb.append(this.f52253n.getArchiveCoinPref().d());
                sb.append("铜板");
                b5.e(sb.toString()).show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void H0(CloudListDataBean cloudListDataBean) {
        if (!this.f52253n.uploadRecoderNotice().d().booleanValue()) {
            O0(cloudListDataBean);
        } else {
            new com.join.mgps.dialog.w(getActivity(), R.style.HKDialogLoading).g("备份须知").d("上传后，将以本地存档为准，覆盖云端同名存档。").f("确定").b("取消").e(new e(cloudListDataBean)).a(new d()).c(new c()).h(false).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void I0() {
        AccountUtil_.getInstance_(getContext()).accountLoginOut(getContext());
        IntentUtil.getInstance().goMyAccountLoginActivity(getContext());
    }

    @Override // com.join.mgps.listener.e
    public void J(CloudListDataBean cloudListDataBean) {
        R0(cloudListDataBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void J0(List<RomArchived> list) {
        if (this.f52247h == null || this.f52249j == null || this.f52246g == null) {
            return;
        }
        if (list != null) {
            try {
                if (list.size() != 0) {
                    this.f52247h.setVisibility(8);
                    this.f52246g.setVisibility(0);
                    return;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        this.f52247h.setVisibility(0);
        if (this.f52260u == 2) {
            this.f52249j.setText("请先启动游戏保存存档");
        } else {
            this.f52249j.setText("请先从本地备份存档");
        }
        this.f52246g.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void K0(List<RomArchived> list) {
        ArrayList arrayList = null;
        if (list != null) {
            try {
            } catch (Exception e5) {
                e = e5;
            }
            if (list.size() != 0) {
                this.f52254o = list;
                ArrayList arrayList2 = new ArrayList();
                for (int i4 = 0; i4 < list.size(); i4++) {
                    try {
                        if (!g2.h(list.get(i4).getArchivedImagePath())) {
                            CloudListDataBean cloudListDataBean = new CloudListDataBean();
                            cloudListDataBean.setAddTime(list.get(i4).getArchivedTime());
                            cloudListDataBean.setArchiveFilePath(list.get(i4).getArchivedPath());
                            cloudListDataBean.setArchiveCover("file://" + list.get(i4).getArchivedImagePath());
                            cloudListDataBean.setArchiveCoverFilePath(list.get(i4).getArchivedImagePath());
                            cloudListDataBean.setArchiveFileName(list.get(i4).getFileName());
                            cloudListDataBean.setArchiveName(o0(list.get(i4).getArchivedPath()));
                            cloudListDataBean.setFileSize(list.get(i4).getSize());
                            cloudListDataBean.setFileMd5(list.get(i4).getMd5());
                            cloudListDataBean.setStatus(0);
                            List<CloudListDataBean> list2 = this.f52256q;
                            if (list2 != null) {
                                Iterator<CloudListDataBean> it2 = list2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    CloudListDataBean next = it2.next();
                                    if (next.getArchiveFileName().equals(new File(list.get(i4).getArchivedPath()).getName()) && next.getFileMd5().equals(list.get(i4).getMd5())) {
                                        cloudListDataBean.setStatus(5);
                                        break;
                                    }
                                }
                            }
                            List<CloudListDataBean> list3 = this.f52255p;
                            if (list3 != null) {
                                for (CloudListDataBean cloudListDataBean2 : list3) {
                                    if (cloudListDataBean2.getArchiveFileName().equals(new File(list.get(i4).getArchivedPath()).getName()) && cloudListDataBean2.getStatus() == 7) {
                                        cloudListDataBean.setStatus(cloudListDataBean2.getStatus());
                                    }
                                }
                            }
                            arrayList2.add(cloudListDataBean);
                        }
                    } catch (Exception e6) {
                        e = e6;
                        arrayList = arrayList2;
                        e.printStackTrace();
                        arrayList2 = arrayList;
                        updateUi(arrayList2);
                        return;
                    }
                }
                updateUi(arrayList2);
                return;
            }
        }
        J0(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void L0(String str) {
        try {
            List<CloudListDataBean> list = this.P;
            if (list != null && list.size() > 1) {
                this.E.c(this.Q + net.lingala.zip4j.util.e.F0 + this.P.size(), UtilsMy.c(this.T) + "/S", this.V);
            } else {
                this.E.c(str, UtilsMy.c(this.T) + "/S", this.V);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 500)
    public void M0() {
        if (this.B != null) {
            try {
                if (this.f52255p.size() == 0) {
                    s0();
                }
                if (this.D) {
                    return;
                }
                this.B.notifyDataSetChanged();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    @Override // com.join.mgps.listener.c
    public void N(CloudListDataBean cloudListDataBean, int i4) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void N0() {
        if (this.B != null) {
            try {
                if (this.f52255p.size() == 0) {
                    s0();
                }
                if (this.D) {
                    return;
                }
                this.B.notifyDataSetChanged();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    @Override // com.join.mgps.listener.e
    public void Q(CloudListDataBean cloudListDataBean) {
        if (this.O.hasNext()) {
            Q0(this.O.next(), this);
            this.Q++;
            return;
        }
        C0(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void Q0(CloudListDataBean cloudListDataBean, com.join.mgps.listener.e eVar) {
        try {
            if (cloudListDataBean.getArchiveCoverFilePath() == null) {
                return;
            }
            v0(cloudListDataBean, 7);
            String[] strArr = {cloudListDataBean.getArchiveFilePath(), cloudListDataBean.getArchiveCoverFilePath()};
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getActivity()).getAccountData();
            com.join.android.app.common.http.h b5 = com.join.android.app.common.http.h.b();
            String j4 = b5.j(strArr, accountData.getUid() + "", accountData.getToken(), this.f52259t, cloudListDataBean.getArchiveName(), cloudListDataBean.getArchiveFileName(), cloudListDataBean.getFileMd5(), this);
            if (g2.i(j4)) {
                CLoudUploadMain cLoudUploadMain = (CLoudUploadMain) JsonMapper.getInstance().fromJson(j4, CLoudUploadMain.class);
                if (cLoudUploadMain.getCode() == 600) {
                    if (this.H) {
                        eVar.Q(cloudListDataBean);
                        return;
                    }
                    v0(cloudListDataBean, 5);
                    eVar.J(cloudListDataBean);
                    return;
                }
                if ("701".equals(cLoudUploadMain.getMsg())) {
                    I0();
                    showMessage("你的登陆已失效，请重新登陆。");
                } else {
                    showMessage(cLoudUploadMain.getMsg());
                }
                eVar.Q(cloudListDataBean);
                v0(cloudListDataBean, 4);
            } else {
                eVar.Q(cloudListDataBean);
                v0(cloudListDataBean, 4);
            }
            eVar.Q(cloudListDataBean);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void R0(CloudListDataBean cloudListDataBean) {
        try {
            Iterator<CloudListDataBean> it2 = this.O;
            if (it2 != null && it2.hasNext()) {
                Q0(this.O.next(), this);
                this.Q++;
                return;
            }
            this.N = false;
            this.f52242c.setBackgroundResource(R.drawable.batch_nor);
            int i4 = 0;
            for (int i5 = 0; i5 < this.f52255p.size(); i5++) {
                if (this.f52255p.get(i5).getIsCheck() == 1 && this.f52255p.get(i5).getStatus() != 5) {
                    i4++;
                }
            }
            this.f52243d.setText("已选择" + i4 + "个存档");
            cloudListDataBean.setStatus(5);
            C0(false);
            this.f52261v.sendBroadcast(new Intent("com.join.mgps.activity.quitManage"));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void V() {
        if (MApplication.N) {
            RelativeLayout relativeLayout = this.f52250k;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
                this.f52251l.setText(MApplication.O);
                this.f52252m.setOnClickListener(new o());
                return;
            }
            return;
        }
        RelativeLayout relativeLayout2 = this.f52250k;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        com.join.mgps.Util.d0.a().d(this);
        this.I = com.join.mgps.Util.b0.f0(getContext()).x(getContext());
        this.f52246g.setLayoutManager(linearLayoutManager);
        this.f52258s = com.join.mgps.rpc.impl.c.k();
        this.f52261v = LocalBroadcastManager.getInstance(getActivity());
        this.f52257r = AccountUtil_.getInstance_(getActivity()).getAccountData();
        this.f52259t = getArguments().getString("gameid");
        this.f52260u = getArguments().getInt("type");
        this.f52262w = new IntentFilter();
        this.f52263x = new IntentFilter();
        this.f52262w.addAction("com.join.mgps.activity.joinManage");
        this.f52263x.addAction("com.join.mgps.activity.quitManage");
        this.f52264y = new u();
        this.f52265z = new v();
        this.f52261v.registerReceiver(this.f52264y, this.f52262w);
        this.f52261v.registerReceiver(this.f52265z, this.f52263x);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.wufun.cloud.showUploadDialog");
        x xVar = new x();
        this.A = xVar;
        this.f52261v.registerReceiver(xVar, intentFilter);
        this.f52255p = new ArrayList();
        this.f52256q = new ArrayList();
        ArchiveAdapter archiveAdapter = new ArchiveAdapter(getActivity());
        this.B = archiveAdapter;
        this.f52246g.setAdapter(archiveAdapter);
        this.E = new com.join.mgps.dialog.x(getActivity(), R.style.HKDialogLoading).f("存档备份中").e("取消备份").b("后台运行").d(new m()).a(new k());
        this.F = com.join.mgps.Util.b0.f0(getContext()).x(getContext());
        this.f52244e.setOnClickListener(new n());
        V();
    }

    public byte[] e0(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void f0() {
        this.f52261v.sendBroadcast(new Intent("com.join.mgps.activity.quitManage"));
    }

    public short g0(byte[] bArr) {
        return (short) (((short) (((short) (bArr[1] & 255)) << 8)) | ((short) (bArr[0] & 255)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void i0(CloudListDataBean cloudListDataBean) {
        if (q0()) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getContext()).getAccountData();
                HashMap hashMap = new HashMap();
                hashMap.put("gameId", this.f52259t);
                hashMap.put("uid", accountData.getUid() + "");
                hashMap.put("token", accountData.getToken());
                hashMap.put("archiveName", cloudListDataBean.getArchiveName());
                ArchiveResponseMain<ArchiveResponseMessage> c5 = this.f52258s.c(hashMap);
                if (c5 != null && c5.getCode() == 600) {
                    Iterator<CloudListDataBean> it2 = this.f52255p.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().getArchiveFileName().equals(cloudListDataBean.getArchiveFileName())) {
                            it2.remove();
                            N0();
                            return;
                        }
                    }
                } else if (c5 != null) {
                    if ("701".equals(c5.getMsg())) {
                        I0();
                        showMessage("你的登陆已失效，请重新登陆。");
                        return;
                    }
                    showMessage(c5.getMsg());
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    @Background
    public void m0(int i4) {
        if (i4 == 2) {
            try {
                n0();
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        if (com.join.android.app.common.utils.j.j(getActivity())) {
            w0(i4);
        }
    }

    @Background
    public void n0() {
        try {
            x0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.mgps.listener.c
    public void o(CloudListDataBean cloudListDataBean) {
        if (q0()) {
            if (this.N) {
                l2.a(getContext()).b("已有备份进行中");
                com.join.mgps.dialog.x xVar = this.E;
                if (xVar != null) {
                    xVar.show();
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(cloudListDataBean);
            z0(arrayList, true, new b());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.D = true;
        com.join.mgps.dialog.x xVar = this.E;
        if (xVar != null) {
            xVar.dismiss();
        }
        this.f52261v.unregisterReceiver(this.f52264y);
        this.f52261v.unregisterReceiver(this.A);
        this.f52261v.unregisterReceiver(this.f52264y);
        com.join.mgps.Util.d0.a().e(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.f fVar) {
        for (int i4 = 0; i4 < this.f52255p.size(); i4++) {
            CloudListDataBean cloudListDataBean = this.f52255p.get(i4);
            if (fVar.a().getArchiveFileName().equals(cloudListDataBean.getArchiveFileName())) {
                if (fVar.e() == 3 && cloudListDataBean.getStatus() == fVar.e()) {
                    return;
                }
                cloudListDataBean.setStatus(fVar.e());
                cloudListDataBean.setArchiveFilePath(fVar.a().getArchiveFilePath());
                this.B.notifyItemChanged(i4);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
        if (!z4) {
            m0(this.f52260u);
        }
        V();
    }

    @Override // com.join.android.app.common.http.g
    public void onRequestProgress(long j4, long j5, boolean z4, String str) {
        if (this.H) {
            for (CloudListDataBean cloudListDataBean : this.f52255p) {
                if (cloudListDataBean.getArchiveFileName().equals(str)) {
                    v0(cloudListDataBean, 4);
                }
            }
            return;
        }
        this.W = UtilsMy.d(j4) + net.lingala.zip4j.util.e.F0 + UtilsMy.d(j5) + "K";
        long currentTimeMillis = System.currentTimeMillis();
        long j6 = currentTimeMillis - this.U;
        if (j6 > 1000) {
            this.T = ((j4 - this.S) * 1000) / j6;
            this.U = currentTimeMillis;
            this.S = j4;
        }
        this.R = System.currentTimeMillis();
        com.join.mgps.dialog.x xVar = this.E;
        if (xVar != null && xVar.isShowing()) {
            this.V = (int) ((j4 * 100) / j5);
            L0(this.W);
        }
        if (z4) {
            this.S = 0L;
            this.R = 0L;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f52257r = AccountUtil_.getInstance_(getActivity()).getAccountData();
        int i4 = this.f52260u;
        if (i4 == 1) {
            m0(i4);
            this.f52244e.setText("下载");
            return;
        }
        this.f52244e.setText("备份");
        m0(this.f52260u);
    }

    @Override // com.join.android.app.common.http.g
    public void onUploadFailed(String str) {
    }

    public void p0() {
        V();
    }

    @Override // com.join.mgps.listener.c
    public void r(CloudListDataBean cloudListDataBean) {
        DocumentManageActivity documentManageActivity = (DocumentManageActivity) getActivity();
        if (documentManageActivity.s0()) {
            documentManageActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void r0() {
        RecyclerView recyclerView = this.f52246g;
        if (recyclerView == null || this.f52247h == null) {
            return;
        }
        try {
            recyclerView.setVisibility(0);
            this.f52247h.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void s0() {
        RecyclerView recyclerView = this.f52246g;
        if (recyclerView == null || this.f52247h == null) {
            return;
        }
        try {
            recyclerView.setVisibility(8);
            this.f52247h.setVisibility(0);
            if (this.f52260u == 1) {
                this.f52249j.setText("请先从本地备份存档");
            } else {
                this.f52249j.setText("请先启动游戏保存存档");
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        l2.a(getContext()).b(str);
    }

    @Override // com.join.mgps.listener.c
    public String t() {
        return this.f52253n.cloudVipLink().d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void t0() {
        int i4 = 0;
        if (!this.K) {
            this.K = true;
            if (this.f52260u == 2) {
                int i5 = 0;
                for (int i6 = 0; i6 < this.f52255p.size(); i6++) {
                    if (this.f52255p.get(i6).getStatus() != 5) {
                        this.f52255p.get(i6).setIsCheck(1);
                        i5++;
                    }
                }
                int i7 = 0;
                while (i4 < this.f52255p.size()) {
                    if (this.f52255p.get(i4).getStatus() == 5) {
                        i7++;
                    }
                    i4++;
                }
                if (i5 == this.f52255p.size() - i7 && i5 != 0 && this.f52255p.size() - i7 != 0) {
                    this.f52242c.setBackgroundResource(R.drawable.batch_select);
                }
                TextView textView = this.f52243d;
                textView.setText("已选择" + i5 + "个存档");
            } else {
                int i8 = 0;
                for (int i9 = 0; i9 < this.f52255p.size(); i9++) {
                    if (this.f52255p.get(i9).getStatus() != 0) {
                        this.f52255p.get(i9).setIsCheck(1);
                        i8++;
                    }
                }
                int i10 = 0;
                while (i4 < this.f52255p.size()) {
                    if (this.f52255p.get(i4).getStatus() == 0) {
                        i10++;
                    }
                    i4++;
                }
                if (i8 == this.f52255p.size() - i10 && i8 != 0 && this.f52255p.size() - i10 != 0) {
                    this.f52242c.setBackgroundResource(R.drawable.batch_select);
                }
                TextView textView2 = this.f52243d;
                textView2.setText("已选择" + i8 + "个存档");
            }
        } else {
            this.K = false;
            if (this.f52260u == 2) {
                for (int i11 = 0; i11 < this.f52255p.size(); i11++) {
                    if (this.f52255p.get(i11).getStatus() != 5) {
                        this.f52255p.get(i11).setIsCheck(0);
                    }
                }
                this.f52242c.setBackgroundResource(R.drawable.batch_nor);
                this.f52243d.setText("已选择0个存档");
            } else {
                for (int i12 = 0; i12 < this.f52255p.size(); i12++) {
                    if (this.f52255p.get(i12).getStatus() != 0) {
                        this.f52255p.get(i12).setIsCheck(0);
                    }
                }
                this.f52242c.setBackgroundResource(R.drawable.batch_nor);
                this.f52243d.setText("已选择0个存档");
            }
        }
        this.B.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void u0(List<CloudListDataBean> list) {
        if (!this.f52253n.DownloadRecoderNotice().d().booleanValue()) {
            P0(list);
        } else {
            new com.join.mgps.dialog.w(getActivity(), R.style.HKDialogLoading).g("备份须知").d("上传后，将以本地存档为准，覆盖云端同名存档。").f("确定").b("取消").e(new r(list)).a(new q()).c(new p()).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateUi(List<CloudListDataBean> list) {
        if (this.B != null) {
            try {
                this.f52255p.clear();
                if (list != null) {
                    this.f52255p.addAll(list);
                }
                if (this.f52255p.size() == 0) {
                    s0();
                } else {
                    r0();
                }
                if (this.D) {
                    return;
                }
                this.B.notifyDataSetChanged();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    @Override // com.join.mgps.listener.c
    public void v(CloudListDataBean cloudListDataBean, boolean z4) {
        if (q0()) {
            if (!this.f52253n.DownloadRecoderNotice().d().booleanValue()) {
                j0(cloudListDataBean, z4);
            } else {
                new com.join.mgps.dialog.w(getActivity(), R.style.HKDialogLoading).g("下载须知").d("下载后，将以备份存档为准，覆盖本地同名存档").f("确定").b("取消").e(new a(cloudListDataBean, z4)).a(new t()).c(new s()).show();
            }
        }
    }

    @Override // com.join.mgps.listener.c
    public void w(CloudListDataBean cloudListDataBean, int i4) {
        File file;
        File file2;
        if (i4 == 1) {
            i0(cloudListDataBean);
        } else if (i4 == 2) {
            Iterator<CloudListDataBean> it2 = this.f52255p.iterator();
            while (it2.hasNext()) {
                CloudListDataBean next = it2.next();
                if (next.getArchiveFileName().equals(cloudListDataBean.getArchiveFileName())) {
                    it2.remove();
                    String archiveFilePath = next.getArchiveFilePath();
                    if (archiveFilePath.contains("file://")) {
                        archiveFilePath = archiveFilePath.replace("file://", "");
                    }
                    UtilsMy.delete(new File(archiveFilePath));
                    h0(archiveFilePath);
                    DownloadTask F = p1.f.K().F(this.f52259t);
                    if (F != null) {
                        String str = getActivity().getFilesDir().toString() + "/emus/" + UtilsMy.X1(Integer.parseInt(F.getRomType())) + net.lingala.zip4j.util.e.F0 + new File(UtilsMy.p4(F.getGameZipPath())).getName() + net.lingala.zip4j.util.e.F0;
                        UtilsMy.delete(new File(str + file.getName()));
                        String replace = next.getArchiveCoverFilePath().replace("file://", "");
                        UtilsMy.delete(new File(replace));
                        UtilsMy.delete(new File(str + file2.getName()));
                        h0(replace);
                    }
                    Iterator<RomArchived> it3 = this.f52254o.iterator();
                    if (it3.hasNext() && it3.next().getFileName().equals(next.getArchiveFileName())) {
                        it3.remove();
                    }
                    M0();
                    return;
                }
            }
        }
    }

    void y0(CloudListDataBean cloudListDataBean, boolean z4, w wVar) {
        try {
            File file = new File(cloudListDataBean.getArchiveFilePath());
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[6];
                try {
                    fileInputStream.read(bArr);
                    ByteBuffer allocate = ByteBuffer.allocate(6);
                    allocate.put((byte) 87);
                    allocate.put((byte) 70);
                    allocate.put((byte) 83);
                    allocate.put((byte) 84);
                    allocate.put((byte) 69);
                    allocate.put((byte) 0);
                    if (Arrays.equals(allocate.array(), bArr)) {
                        byte[] bArr2 = new byte[33];
                        fileInputStream.read(bArr2);
                        String str = new String(bArr2);
                        byte[] bArr3 = new byte[2];
                        fileInputStream.read(bArr3);
                        int g02 = g0(bArr3);
                        byte[] bArr4 = new byte[g02];
                        fileInputStream.read(bArr4);
                        String str2 = new String(bArr4);
                        ByteBuffer allocate2 = ByteBuffer.allocate(2 + g02);
                        allocate2.put(bArr3);
                        allocate2.put(bArr4);
                        if (com.join.mgps.Util.x0.a(allocate2.array()).equals(str.substring(0, 32))) {
                            RecoverFileJson recoverFileJson = (RecoverFileJson) JsonMapper.getInstance().fromJson(str2, RecoverFileJson.class);
                            if (recoverFileJson.getUserID().equals("0")) {
                                S0(cloudListDataBean, fileInputStream, null, file, wVar);
                            } else if (recoverFileJson.getUserID().equals(AccountUtil_.getInstance_(getContext()).getUid())) {
                                wVar.a(true, cloudListDataBean);
                            } else if (z4) {
                                wVar.a(true, cloudListDataBean);
                            } else {
                                showMessage("请勿分享他人原创存档");
                            }
                        } else {
                            showMessage("存档不合法");
                        }
                    } else {
                        S0(cloudListDataBean, fileInputStream, bArr, file, wVar);
                    }
                } catch (IOException e5) {
                    e5.printStackTrace();
                    showMessage("写入信息异常");
                }
            } catch (FileNotFoundException e6) {
                showMessage("文件没找到");
                e6.printStackTrace();
            }
        } catch (Exception e7) {
            e7.printStackTrace();
            showMessage("写入信息异常2");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void z0(List<CloudListDataBean> list, boolean z4, w wVar) {
        if (list == null) {
            return;
        }
        if (list.size() == 1) {
            try {
                y0(list.get(0), z4, wVar);
                return;
            } catch (Exception unused) {
                wVar.a(false, null);
                return;
            }
        }
        this.M = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            y0(list.get(i4), z4, new f(wVar));
        }
        if (this.M == list.size()) {
            wVar.a(true, null);
        }
    }
}
