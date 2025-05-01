package com.join.mgps.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.customview.HtmlTextView;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.GameDiscoverBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.List;
/* loaded from: classes.dex */
public class CardFragment extends AbsBaseFragment implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    protected GameDiscoverBean f49972c;

    /* renamed from: d  reason: collision with root package name */
    protected ImageView f49973d;

    /* renamed from: e  reason: collision with root package name */
    protected RelativeLayout f49974e;

    /* renamed from: f  reason: collision with root package name */
    private Button f49975f;

    /* renamed from: g  reason: collision with root package name */
    private LinearLayout f49976g;

    /* renamed from: h  reason: collision with root package name */
    private LinearLayout f49977h;

    /* renamed from: i  reason: collision with root package name */
    private ImageView f49978i;

    /* renamed from: j  reason: collision with root package name */
    protected SimpleDraweeView f49979j;

    /* renamed from: k  reason: collision with root package name */
    protected ImageView f49980k;

    /* renamed from: l  reason: collision with root package name */
    protected HtmlTextView f49981l;

    /* renamed from: m  reason: collision with root package name */
    protected TextView f49982m;

    /* renamed from: n  reason: collision with root package name */
    protected TextView f49983n;

    /* renamed from: o  reason: collision with root package name */
    protected TextView f49984o;

    /* renamed from: p  reason: collision with root package name */
    private DownloadTask f49985p;

    /* renamed from: q  reason: collision with root package name */
    private RelativeLayout f49986q;

    /* renamed from: r  reason: collision with root package name */
    private ProgressBar f49987r;

    /* renamed from: s  reason: collision with root package name */
    private TextView f49988s;

    /* renamed from: t  reason: collision with root package name */
    private BroadcastReceiver f49989t = new a();

    /* loaded from: classes3.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                return;
            }
            String action = intent.getAction();
            CollectionBeanSub collectionBeanSub = intent.getSerializableExtra("gameData") != null ? (CollectionBeanSub) intent.getSerializableExtra("gameData") : null;
            if (action.equals(o1.a.G) || action.equals(o1.a.I)) {
                if (collectionBeanSub != null) {
                    PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
                    if (n4 == null) {
                        n4 = new PurchasedListTable();
                    }
                    n4.setGame_id(collectionBeanSub.getGame_id());
                    b2.e0.o().m(n4);
                }
                CardFragment.this.updateButn();
            }
        }
    }

    public static CardFragment X(GameDiscoverBean gameDiscoverBean) {
        CardFragment cardFragment = new CardFragment();
        cardFragment.b0(gameDiscoverBean);
        return cardFragment;
    }

    @Override // com.join.mgps.fragment.AbsBaseFragment
    protected void V(View view) {
        this.f49975f.setOnClickListener(this);
        this.f49986q.setOnClickListener(this);
        this.f49974e.setOnClickListener(this);
    }

    @Override // com.join.mgps.fragment.AbsBaseFragment
    protected View W(LayoutInflater layoutInflater) {
        com.join.mgps.Util.d0.a().d(this);
        View inflate = layoutInflater.inflate(R.layout.fragment_card, (ViewGroup) null);
        this.f49974e = (RelativeLayout) inflate.findViewById(R.id.box_card);
        this.f49973d = (ImageView) inflate.findViewById(R.id.image_bottom_edge);
        this.f49979j = (SimpleDraweeView) inflate.findViewById(R.id.image_cover);
        this.f49984o = (TextView) inflate.findViewById(R.id.text_title);
        this.f49982m = (TextView) inflate.findViewById(R.id.text_subtitle);
        this.f49981l = (HtmlTextView) inflate.findViewById(R.id.text_digest);
        this.f49980k = (ImageView) inflate.findViewById(R.id.image_tag);
        this.f49983n = (TextView) inflate.findViewById(R.id.date_tag);
        this.f49975f = (Button) inflate.findViewById(R.id.instalButtomButn);
        this.f49978i = (ImageView) inflate.findViewById(R.id.butn_showdownload);
        this.f49986q = (RelativeLayout) inflate.findViewById(R.id.progressbarLayout);
        this.f49976g = (LinearLayout) inflate.findViewById(R.id.progress_layout);
        this.f49977h = (LinearLayout) inflate.findViewById(R.id.detialDownBottom);
        this.f49987r = (ProgressBar) inflate.findViewById(R.id.butnProgressBar);
        this.f49988s = (TextView) inflate.findViewById(R.id.percent);
        try {
            this.f49984o.setText(this.f49972c.getGame_name());
            this.f49982m.setText(this.f49972c.getDiscover().getTitle());
            this.f49981l.setTextViewHtml(this.f49972c.getDiscover().getIntro());
            this.f49983n.setText(new SimpleDateFormat("MM月dd日 EEEE").format(Long.valueOf(this.f49972c.getDiscover().getAddtimes() * 1000)));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        Z();
        updateButn();
        return inflate;
    }

    protected void Z() {
        GameDiscoverBean gameDiscoverBean;
        GameDiscoverBean gameDiscoverBean2 = this.f49972c;
        if (gameDiscoverBean2 == null || g2.h(gameDiscoverBean2.getPlugin_num()) || getActivity() == null || (gameDiscoverBean = this.f49972c) == null) {
            return;
        }
        MyImageLoader.h(this.f49979j, gameDiscoverBean.getDiscover().getPic());
    }

    void a0(int i4) {
        this.f49987r.setProgress(i4);
        TextView textView = this.f49988s;
        textView.setText(i4 + "%");
    }

    public void b0(GameDiscoverBean gameDiscoverBean) {
        this.f49972c = gameDiscoverBean;
    }

    @Override // com.join.mgps.fragment.AbsBaseFragment
    protected void initData() {
        List<DownloadTask> H;
        boolean z4;
        GameDiscoverBean gameDiscoverBean = this.f49972c;
        if (gameDiscoverBean != null) {
            if (gameDiscoverBean.getMod_info() == null) {
                DownloadTask F = p1.f.K().F(this.f49972c.getCrc_sign_id());
                this.f49985p = F;
                if (F == null) {
                    this.f49985p = this.f49972c.getDownloadtaskDown();
                    if (UtilsMy.o0(this.f49972c.getTag_info())) {
                        this.f49985p.setFileType(Dtype.android.name());
                        com.join.android.app.common.utils.e l02 = com.join.android.app.common.utils.e.l0(getActivity());
                        FragmentActivity activity = getActivity();
                        String package_name = this.f49972c.getPackage_name();
                        APKUtils.DEVICE_TYPE device_type = APKUtils.DEVICE_TYPE.ALL;
                        if (l02.e(activity, package_name, device_type)) {
                            APKUtils.a m4 = com.join.android.app.common.utils.e.l0(getActivity()).m(getActivity(), this.f49972c.getPackage_name(), device_type);
                            if (g2.i(this.f49972c.getVer()) && m4.d() < Integer.parseInt(this.f49972c.getVer())) {
                                this.f49985p.setStatus(9);
                                return;
                            } else {
                                this.f49985p.setStatus(5);
                                return;
                            }
                        }
                        this.f49985p.setStatus(0);
                        return;
                    }
                    this.f49985p.setStatus(0);
                    return;
                }
                F.setDownloadType(this.f49972c.getDownloadType());
                this.f49985p.setScreenshot_pic(this.f49972c.getScreenshot_pic());
                return;
            }
            if (this.f49972c.getMod_info() != null) {
                H = p1.f.K().G(this.f49972c.getMod_info().getMod_game_id(), this.f49972c.getMod_info().getMain_game_id());
            } else {
                H = p1.f.K().H(this.f49972c.getPackage_name());
            }
            if (H != null && H.size() > 0) {
                boolean z5 = false;
                loop0: while (true) {
                    z4 = false;
                    for (DownloadTask downloadTask : H) {
                        if (Dtype.MOD.name().equals(downloadTask.getFileType())) {
                            z5 = com.join.mgps.va.overmind.d.o().F(downloadTask.getPackageName()) && downloadTask.getStatus() == 5;
                        } else if (com.join.android.app.common.utils.e.l0(getContext()).e(getContext(), downloadTask.getPackageName(), APKUtils.DEVICE_TYPE.ALL) && downloadTask.getStatus() == 5) {
                            z4 = true;
                        }
                    }
                    break loop0;
                }
                if (z5 && z4) {
                    r0 = p1.f.K().F(this.f49972c.getCrc_sign_id());
                } else if (z5) {
                    if (this.f49972c.getMod_info() != null) {
                        r0 = p1.f.K().F(this.f49972c.getMod_info().getMod_game_id());
                    }
                } else if (z4) {
                    r0 = p1.f.K().F(this.f49972c.getCrc_sign_id());
                } else {
                    r0 = this.f49972c.getMod_info() != null ? p1.f.K().F(this.f49972c.getMod_info().getMod_game_id()) : null;
                    if (r0 == null) {
                        r0 = p1.f.K().F(this.f49972c.getCrc_sign_id());
                    }
                }
            }
            this.f49985p = r0;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(o1.a.G);
            intentFilter.addAction(o1.a.I);
            getActivity().registerReceiver(this.f49989t, intentFilter);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        super.onAttach(context);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        DownloadTask downloadTask;
        int id = view.getId();
        if (id == R.id.box_card) {
            if (this.f49972c.getCrc_sign_id() != null) {
                IntentUtil.getInstance().goGameDetialActivity(getActivity(), this.f49972c.getCrc_sign_id(), this.f49972c.getGame_info_tpl_type(), this.f49972c.getSp_tpl_two_position(), 115);
            }
        } else if (id != R.id.instalButtomButn) {
            if (id == R.id.progressbarLayout && (downloadTask = this.f49985p) != null) {
                if (downloadTask.getStatus() == 2) {
                    com.php25.PDownload.d.i(this.f49985p);
                    updateButn();
                } else if (this.f49985p.getStatus() == 3 || this.f49985p.getStatus() == 6) {
                    com.php25.PDownload.d.c(this.f49985p, getActivity());
                    updateButn();
                }
            }
        } else {
            DownloadTask downloadTask2 = this.f49985p;
            if (downloadTask2 != null && downloadTask2.getStatus() != 0) {
                DownloadTask downloadTask3 = this.f49985p;
                int status = downloadTask3 != null ? downloadTask3.getStatus() : 0;
                if (UtilsMy.w0(this.f49972c.getPay_tag_info(), this.f49972c.getCrc_sign_id()) > 0) {
                    status = 43;
                }
                DownloadTask downloadTask4 = this.f49985p;
                if (downloadTask4 != null && (status == 2 || status == 10)) {
                    com.php25.PDownload.d.i(downloadTask4);
                    return;
                } else if (status == 12) {
                    return;
                } else {
                    if (status == 13) {
                        com.php25.PDownload.d.l(getActivity(), this.f49985p);
                        return;
                    } else if (status == 5) {
                        UtilsMy.T3(getActivity(), this.f49985p);
                        return;
                    } else if (status == 9) {
                        if (!com.join.android.app.common.utils.j.j(getActivity())) {
                            l2.a(getActivity()).b("无网络连接");
                            return;
                        }
                        int downloadType = this.f49985p.getDownloadType();
                        if (downloadType != 0 && downloadType != 1) {
                            if (downloadType != 2) {
                                return;
                            }
                            UtilsMy.u4(this.f49985p);
                            return;
                        } else if (this.f49985p.getCrc_link_type_val() == null || this.f49985p.getCrc_link_type_val().equals("")) {
                            return;
                        } else {
                            DownloadTask downloadTask5 = this.f49985p;
                            UtilsMy.z4(downloadTask5, downloadTask5.getCrc_link_type_val());
                            com.php25.PDownload.d.b(this.f49985p);
                            this.f49985p.setVer(this.f49972c.getVer());
                            this.f49985p.setVer_name(this.f49972c.getVer_name());
                            this.f49985p.setUrl(this.f49972c.getDown_url_remote());
                            this.f49985p.setCfg_ver(this.f49972c.getCfg_ver());
                            this.f49985p.setCfg_ver_name(this.f49972c.getCfg_ver_name());
                            this.f49985p.setCfg_down_url(this.f49972c.getCfg_down_url());
                            if (UtilsMy.y0(this.f49972c.getPay_tag_info(), this.f49972c.getCrc_sign_id()) > 0) {
                                UtilsMy.d4(getActivity(), this.f49985p.getCrc_link_type_val());
                                return;
                            }
                            UtilsMy.B1(this.f49985p, this.f49972c);
                            if (UtilsMy.o1(getActivity(), this.f49985p)) {
                                return;
                            }
                            if (this.f49972c.getDown_status() == 5) {
                                UtilsMy.l1(getActivity(), this.f49985p);
                                return;
                            } else {
                                UtilsMy.R0(getActivity(), this.f49985p, this.f49972c.getTp_down_url(), this.f49972c.getOther_down_switch(), this.f49972c.getCdn_down_switch());
                                return;
                            }
                        }
                    } else if (status == 42) {
                        if (downloadTask4.getCrc_link_type_val() == null || this.f49985p.getCrc_link_type_val().equals("")) {
                            return;
                        }
                        DownloadTask downloadTask6 = this.f49985p;
                        UtilsMy.z4(downloadTask6, downloadTask6.getCrc_link_type_val());
                        this.f49985p.setVer(this.f49972c.getVer());
                        this.f49985p.setVer_name(this.f49972c.getVer_name());
                        this.f49985p.setUrl(this.f49972c.getDown_url_remote());
                        this.f49985p.setCfg_ver(this.f49972c.getCfg_ver());
                        this.f49985p.setCfg_ver_name(this.f49972c.getCfg_ver_name());
                        this.f49985p.setCfg_down_url(this.f49972c.getCfg_down_url());
                        UtilsMy.r4(getContext(), this.f49985p);
                        return;
                    } else if (11 == status) {
                        UtilsMy.a4(downloadTask4, getActivity());
                        return;
                    } else if (27 == status || 48 == status) {
                        return;
                    } else {
                        if (43 == status) {
                            if (UtilsMy.y0(this.f49972c.getPay_tag_info(), this.f49972c.getCrc_sign_id()) > 0) {
                                UtilsMy.d4(getActivity(), this.f49985p.getCrc_link_type_val());
                                return;
                            }
                            UtilsMy.B1(this.f49985p, this.f49972c);
                            if (UtilsMy.o1(getActivity(), this.f49985p)) {
                                return;
                            }
                            if (this.f49972c.getDown_status() == 5) {
                                UtilsMy.l1(getActivity(), this.f49985p);
                                return;
                            } else {
                                UtilsMy.R0(getActivity(), this.f49985p, this.f49972c.getTp_down_url(), this.f49972c.getOther_down_switch(), this.f49972c.getCdn_down_switch());
                                return;
                            }
                        } else if (UtilsMy.y0(this.f49972c.getPay_tag_info(), this.f49972c.getCrc_sign_id()) > 0) {
                            UtilsMy.d4(getActivity(), this.f49985p.getCrc_link_type_val());
                            return;
                        } else {
                            UtilsMy.B1(this.f49985p, this.f49972c);
                            if (UtilsMy.o1(getActivity(), this.f49985p)) {
                                return;
                            }
                            if (this.f49972c.getDown_status() == 5) {
                                UtilsMy.l1(getActivity(), this.f49985p);
                                return;
                            } else {
                                UtilsMy.R0(getActivity(), this.f49985p, this.f49972c.getTp_down_url(), this.f49972c.getOther_down_switch(), this.f49972c.getCdn_down_switch());
                                return;
                            }
                        }
                    }
                }
            }
            UtilsMy.a1(getContext(), this.f49972c);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f49979j.setImageBitmap(null);
        com.join.mgps.Util.d0.a().e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f49979j.setImageBitmap(null);
        try {
            getActivity().unregisterReceiver(this.f49989t);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        super.onDestroyView();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r5 != 48) goto L16;
     */
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onEventMainThread(com.join.mgps.event.n r5) {
        /*
            r4 = this;
            com.github.snowdream.android.app.downloader.DownloadTask r0 = r5.a()
            if (r0 == 0) goto L35
            com.github.snowdream.android.app.downloader.DownloadTask r1 = r4.f49985p
            if (r1 == 0) goto L35
            java.lang.String r1 = r0.getCrc_link_type_val()
            com.github.snowdream.android.app.downloader.DownloadTask r2 = r4.f49985p
            java.lang.String r2 = r2.getCrc_link_type_val()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L35
            r4.f49985p = r0
            int r1 = r0.getStatus()
            r0.setStatus(r1)
            com.github.snowdream.android.app.downloader.DownloadTask r1 = r4.f49985p
            java.lang.String r2 = r0.getPath()
            r1.setPath(r2)
            com.github.snowdream.android.app.downloader.DownloadTask r1 = r4.f49985p
            long r2 = r0.getSize()
            r1.setSize(r2)
        L35:
            int r5 = r5.c()
            r1 = 5
            if (r5 == r1) goto L81
            r1 = 8
            if (r5 == r1) goto L49
            r1 = 11
            if (r5 == r1) goto L81
            r1 = 48
            if (r5 == r1) goto L81
            goto L99
        L49:
            com.github.snowdream.android.app.downloader.DownloadTask r5 = r4.f49985p
            if (r5 == 0) goto L99
            java.lang.String r5 = r5.getPath()
            if (r5 == 0) goto L99
            com.github.snowdream.android.app.downloader.DownloadTask r5 = r4.f49985p
            com.join.mgps.Util.UtilsMy.x4(r5)
            android.widget.ProgressBar r5 = r4.f49987r
            com.github.snowdream.android.app.downloader.DownloadTask r0 = r4.f49985p
            long r0 = r0.getProgress()
            int r1 = (int) r0
            r5.setProgress(r1)
            android.widget.TextView r5 = r4.f49988s
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.github.snowdream.android.app.downloader.DownloadTask r1 = r4.f49985p
            long r1 = r1.getProgress()
            r0.append(r1)
            java.lang.String r1 = "%"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.setText(r0)
            return
        L81:
            if (r0 == 0) goto L99
            com.github.snowdream.android.app.downloader.DownloadTask r5 = r4.f49985p
            if (r5 == 0) goto L99
            java.lang.String r5 = r0.getCrc_link_type_val()
            com.github.snowdream.android.app.downloader.DownloadTask r1 = r4.f49985p
            java.lang.String r1 = r1.getCrc_link_type_val()
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L99
            r4.f49985p = r0
        L99:
            r4.updateButn()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.CardFragment.onEventMainThread(com.join.mgps.event.n):void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        List<DownloadTask> H;
        boolean z4;
        super.onResume();
        if (this.f49972c == null) {
            this.f49972c = new GameDiscoverBean();
        }
        if (this.f49972c.getMod_info() == null) {
            DownloadTask F = p1.f.K().F(this.f49972c.getCrc_sign_id());
            if (F != null && this.f49985p != null && F.getCrc_link_type_val().equals(this.f49985p.getCrc_link_type_val())) {
                this.f49985p = F;
                if (F.getFileType().equals(Dtype.android.name()) && this.f49985p.getStatus() == 5) {
                    if (this.f49972c.getMod_info() == null) {
                        com.join.android.app.common.utils.e l02 = com.join.android.app.common.utils.e.l0(getActivity());
                        FragmentActivity activity = getActivity();
                        String packageName = this.f49985p.getPackageName();
                        APKUtils.DEVICE_TYPE device_type = APKUtils.DEVICE_TYPE.ALL;
                        if (Boolean.valueOf(l02.e(activity, packageName, device_type)).booleanValue()) {
                            APKUtils.a m4 = com.join.android.app.common.utils.e.l0(getActivity()).m(getActivity(), this.f49985p.getPackageName(), device_type);
                            if (g2.i(this.f49985p.getVer()) && m4.d() < Integer.parseInt(this.f49985p.getVer())) {
                                this.f49985p.setStatus(9);
                            } else {
                                this.f49985p.setStatus(5);
                            }
                        } else {
                            this.f49985p.setStatus(11);
                        }
                    }
                } else {
                    this.f49985p.setStatus(F.getStatus());
                }
            }
        } else {
            if (this.f49972c.getMod_info() != null) {
                H = p1.f.K().G(this.f49972c.getMod_info().getMod_game_id(), this.f49972c.getMod_info().getMain_game_id());
            } else {
                H = p1.f.K().H(this.f49972c.getPackage_name());
            }
            if (H != null && H.size() > 0) {
                boolean z5 = false;
                loop0: while (true) {
                    z4 = false;
                    for (DownloadTask downloadTask : H) {
                        if (Dtype.MOD.name().equals(downloadTask.getFileType())) {
                            z5 = com.join.mgps.va.overmind.d.o().F(downloadTask.getPackageName()) && downloadTask.getStatus() == 5;
                        } else if (com.join.android.app.common.utils.e.l0(getContext()).e(getContext(), downloadTask.getPackageName(), APKUtils.DEVICE_TYPE.ALL) && downloadTask.getStatus() == 5) {
                            z4 = true;
                        }
                    }
                    break loop0;
                }
                if (z5 && z4) {
                    r0 = p1.f.K().F(this.f49972c.getCrc_sign_id());
                } else if (z5) {
                    if (this.f49972c.getMod_info() != null) {
                        r0 = p1.f.K().F(this.f49972c.getMod_info().getMod_game_id());
                    }
                } else if (z4) {
                    r0 = p1.f.K().F(this.f49972c.getCrc_sign_id());
                } else {
                    r0 = this.f49972c.getMod_info() != null ? p1.f.K().F(this.f49972c.getMod_info().getMod_game_id()) : null;
                    if (r0 == null) {
                        r0 = p1.f.K().F(this.f49972c.getCrc_sign_id());
                    }
                }
            }
            this.f49985p = r0;
        }
        updateButn();
    }

    void showInstallButn() {
        this.f49975f.setVisibility(0);
        this.f49986q.setVisibility(8);
    }

    void showProgress() {
        this.f49975f.setVisibility(8);
        this.f49986q.setVisibility(0);
    }

    void updateButn() {
        DownloadTask downloadTask;
        if (this.f49972c == null || (downloadTask = this.f49985p) == null) {
            return;
        }
        UtilsMy.j3(downloadTask.getSp_tag_info(), this.f49977h, this.f49985p);
        this.f49975f.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
        DownloadTask downloadTask2 = this.f49985p;
        int status = downloadTask2 != null ? downloadTask2.getStatus() : 0;
        if (UtilsMy.w0(this.f49972c.getPay_tag_info(), this.f49972c.getCrc_sign_id()) > 0) {
            status = 43;
        }
        String plugin_num = this.f49985p.getPlugin_num();
        if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
            this.f49975f.setBackgroundResource(R.drawable.recom_blue_butn);
            this.f49975f.setText("开始");
            this.f49975f.setTextColor(getResources().getColor(R.color.app_blue_color));
        } else if (status == 12) {
            showInstallButn();
            this.f49975f.setText("解压中..");
            this.f49978i.setImageResource(R.drawable.extract);
        } else if (status == 13) {
            showInstallButn();
            this.f49975f.setText("解压");
            this.f49978i.setImageResource(R.drawable.reextract);
        } else if (status == 9) {
            showInstallButn();
            this.f49975f.setText("更新");
            this.f49978i.setImageResource(R.drawable.detail_comment_download_continue);
            this.f49975f.setBackgroundResource(R.drawable.detial_simple_install_selecter);
        } else if (status == 11) {
            showInstallButn();
            this.f49975f.setText("安装");
            this.f49978i.setImageResource(R.drawable.detail_comment_download_continue);
            this.f49975f.setBackgroundResource(R.drawable.detial_simple_install_selecter);
        } else if (status == 5 || status == 42) {
            showInstallButn();
            this.f49975f.setBackgroundResource(R.drawable.detial_simple_open_selecter);
            this.f49975f.setText(getContext().getResources().getString(R.string.download_status_finished));
        } else if (status == 2) {
            showProgress();
            this.f49978i.setImageResource(R.drawable.detail_comment_download_pause);
            if (new File(this.f49985p.getPath()).exists()) {
                int j4 = (int) com.php25.PDownload.d.j(this.f49985p.getPath(), this.f49985p.getSize());
                this.f49987r.setProgress(j4);
                TextView textView = this.f49988s;
                textView.setText(j4 + "%");
            }
        } else if (status == 3 || status == 6) {
            showProgress();
            this.f49978i.setImageResource(R.drawable.detail_comment_download_continue);
            if (new File(this.f49985p.getPath()).exists()) {
                a0((int) com.php25.PDownload.d.j(this.f49985p.getPath(), this.f49985p.getSize()));
            }
        } else if (status == 27) {
            showInstallButn();
            Button button = this.f49975f;
            button.setText("暂停中\u3000" + this.f49972c.getSize() + "M");
            this.f49978i.setImageResource(R.drawable.detail_comment_download_continue);
        } else if (status == 10) {
            showInstallButn();
            Button button2 = this.f49975f;
            button2.setText("等待\u3000" + this.f49972c.getSize() + "M");
            this.f49978i.setImageResource(R.drawable.detail_comment_download_continue);
        } else if (status == 43) {
            showInstallButn();
            if (this.f49972c.getPay_tag_info() != null && this.f49972c.getPay_tag_info().getPay_game_amount() > 0 && !b2.e0.o().p(this.f49972c.getCrc_sign_id())) {
                Button button3 = this.f49975f;
                button3.setText(button3.getResources().getString(R.string.pay_game_amount, this.f49972c.getPay_tag_info().getPayGameAmount()));
            } else {
                Button button4 = this.f49975f;
                button4.setText(getContext().getResources().getString(R.string.download_status_download) + "\u3000" + this.f49972c.getSize() + "M");
            }
            this.f49978i.setImageResource(R.drawable.detail_comment_download_continue);
            GameDiscoverBean gameDiscoverBean = this.f49972c;
            if (gameDiscoverBean != null) {
                UtilsMy.w0(gameDiscoverBean.getPay_tag_info(), this.f49972c.getCrc_sign_id());
                UtilsMy.p3(this.f49975f, this.f49972c);
            }
        } else if (status == 48) {
            showInstallButn();
            this.f49975f.setText(getResources().getString(R.string.download_status_installing));
        } else {
            showInstallButn();
            this.f49975f.setText(getResources().getString(R.string.download_status_download));
            if (this.f49972c.getPay_tag_info() != null && this.f49972c.getPay_tag_info().getPay_game_amount() > 0 && !b2.e0.o().p(this.f49972c.getCrc_sign_id())) {
                Button button5 = this.f49975f;
                button5.setText(button5.getResources().getString(R.string.pay_game_amount, this.f49972c.getPay_tag_info().getPayGameAmount()));
            } else {
                Button button6 = this.f49975f;
                button6.setText(getContext().getResources().getString(R.string.download_status_download) + "\u3000" + this.f49972c.getSize() + "M");
            }
            this.f49978i.setImageResource(R.drawable.detail_comment_download_continue);
            GameDiscoverBean gameDiscoverBean2 = this.f49972c;
            if (gameDiscoverBean2 != null) {
                UtilsMy.w0(gameDiscoverBean2.getPay_tag_info(), this.f49972c.getCrc_sign_id());
                UtilsMy.p3(this.f49975f, this.f49972c);
            }
        }
    }
}
