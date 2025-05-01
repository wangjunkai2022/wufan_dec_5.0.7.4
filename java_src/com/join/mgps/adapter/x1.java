package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.business.RecomDatabeanBusiness;
import com.join.mgps.dto.AppBean;
import com.join.mgps.dto.AppBeanMain;
import com.join.mgps.enums.ConstantIntEnum;
import com.papa.sim.statistic.ExtFrom;
import java.util.ArrayList;
import java.util.List;
/* compiled from: InterstingListAdapter.java */
/* loaded from: classes4.dex */
public class x1 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f45987b;

    /* renamed from: c  reason: collision with root package name */
    private List<RecomDatabeanBusiness> f45988c;

    /* renamed from: d  reason: collision with root package name */
    private LayoutInflater f45989d;

    /* compiled from: InterstingListAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        AppBean f45990b;

        /* renamed from: c  reason: collision with root package name */
        RecomDatabeanBusiness f45991c;

        /* renamed from: d  reason: collision with root package name */
        int f45992d;

        /* renamed from: e  reason: collision with root package name */
        String f45993e;

        public a(RecomDatabeanBusiness recomDatabeanBusiness, int i4, String str) {
            List<AppBeanMain> sub = recomDatabeanBusiness.getSub();
            if (sub != null && sub.size() > 0) {
                this.f45990b = sub.get(0).getGame_info();
            }
            this.f45991c = recomDatabeanBusiness;
            this.f45992d = i4;
            this.f45993e = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask a5 = this.f45991c.a();
            String plugin_num = this.f45990b.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(this.f45990b.getDown_url_remote());
                if (a5 == null) {
                    a5 = this.f45990b.getDownloadtaskDown();
                }
                UtilsMy.T2(a5, x1.this.f45987b);
                IntentUtil.getInstance().intentActivity(x1.this.f45987b, intentDateBean);
            } else if (a5 == null) {
                if (UtilsMy.o0(this.f45990b.getTag_info())) {
                    if (this.f45990b.getMod_info() == null) {
                        if (com.join.android.app.common.utils.e.l0(x1.this.f45987b).d(x1.this.f45987b, this.f45990b.getPackageName())) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(x1.this.f45987b).l(x1.this.f45987b, this.f45990b.getPackageName());
                            if (!com.join.mgps.Util.g2.i(this.f45990b.getVer()) || l4.d() >= Integer.parseInt(this.f45990b.getVer())) {
                                com.join.android.app.common.utils.e.l0(x1.this.f45987b);
                                APKUtils.a0(x1.this.f45987b, this.f45990b.getPackageName());
                                return;
                            }
                        }
                    } else {
                        boolean d5 = com.join.android.app.common.utils.e.l0(x1.this.f45987b).d(x1.this.f45987b, this.f45990b.getPackageName());
                        boolean F = com.join.mgps.va.overmind.d.o().F(this.f45990b.getPackageName());
                        if (d5 || F) {
                            com.join.android.app.common.utils.e.l0(x1.this.f45987b);
                            APKUtils.V(x1.this.f45987b, this.f45990b.getMod_info());
                            return;
                        }
                    }
                }
                x1 x1Var = x1.this;
                x1Var.d(this.f45993e + "1");
                UtilsMy.W0(x1.this.f45987b, this.f45990b);
            } else {
                int status = a5 != null ? a5.getStatus() : 0;
                AppBean appBean = this.f45990b;
                if (appBean != null && UtilsMy.w0(appBean.getPay_tag_info(), this.f45990b.getCrc_sign_id()) > 0) {
                    status = 43;
                }
                if (status != 0) {
                    if (status == 13) {
                        com.php25.PDownload.d.l(x1.this.f45987b, a5);
                        return;
                    }
                    if (status != 2) {
                        if (status != 3) {
                            if (status == 5) {
                                UtilsMy.T3(x1.this.f45987b, a5);
                                return;
                            } else if (status != 6) {
                                if (status != 7) {
                                    if (status == 42) {
                                        if (!com.join.android.app.common.utils.j.j(x1.this.f45987b)) {
                                            com.join.mgps.Util.l2.a(x1.this.f45987b).b("无网络连接");
                                            return;
                                        } else {
                                            UtilsMy.r4(x1.this.f45987b, a5);
                                            return;
                                        }
                                    } else if (status != 43) {
                                        switch (status) {
                                            case 9:
                                                if (!com.join.android.app.common.utils.j.j(x1.this.f45987b)) {
                                                    com.join.mgps.Util.l2.a(x1.this.f45987b).b("无网络连接");
                                                    return;
                                                }
                                                int downloadType = this.f45990b.getDownloadType();
                                                if (downloadType != 0 && downloadType != 1) {
                                                    if (downloadType != 2) {
                                                        return;
                                                    }
                                                    UtilsMy.u4(a5);
                                                    return;
                                                } else if (!com.join.android.app.common.utils.j.j(x1.this.f45987b)) {
                                                    com.join.mgps.Util.l2.a(x1.this.f45987b).b("无网络连接");
                                                    return;
                                                } else {
                                                    UtilsMy.I2(x1.this.f45987b, a5);
                                                    return;
                                                }
                                            case 10:
                                                break;
                                            case 11:
                                                UtilsMy.a4(a5, x1.this.f45987b);
                                                return;
                                            default:
                                                return;
                                        }
                                    }
                                }
                            }
                        }
                        com.php25.PDownload.d.c(a5, x1.this.f45987b);
                        return;
                    }
                    com.php25.PDownload.d.i(a5);
                    return;
                }
                if (this.f45990b != null) {
                    x1 x1Var2 = x1.this;
                    x1Var2.d(this.f45993e + "1");
                    if (UtilsMy.y0(this.f45990b.getPay_tag_info(), this.f45990b.getCrc_sign_id()) > 0) {
                        UtilsMy.d4(x1.this.f45987b, a5.getCrc_link_type_val());
                        return;
                    }
                    UtilsMy.x1(a5, this.f45990b);
                    if (UtilsMy.o1(x1.this.f45987b, a5)) {
                        return;
                    }
                    if (this.f45990b.getDown_status() == 5) {
                        UtilsMy.l1(x1.this.f45987b, a5);
                    } else {
                        UtilsMy.R0(x1.this.f45987b, a5, this.f45990b.getTp_down_url(), this.f45990b.getOther_down_switch(), this.f45990b.getCdn_down_switch());
                    }
                }
            }
        }
    }

    public x1() {
    }

    private void c(int i4) {
        if (i4 < this.f45988c.size()) {
            IntentUtil.getInstance().intentActivity(this.f45987b, this.f45988c.get(i4).getSub().get(0).getIntentDataBean());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(this.f45987b);
        String name = ExtFrom.home.name();
        l4.t(name, "22-" + str, AccountUtil_.getInstance_(this.f45987b).getUid());
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f45988c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f45989d.inflate(R.layout.intersting_horiz_listitem, viewGroup, false);
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) com.join.mgps.Util.s2.a(view, R.id.image1);
        TextView textView = (TextView) com.join.mgps.Util.s2.a(view, R.id.mgListviewItemInstall);
        RecomDatabeanBusiness recomDatabeanBusiness = this.f45988c.get(i4);
        textView.setOnClickListener(new a(this.f45988c.get(i4), i4, recomDatabeanBusiness.b()));
        TextView textView2 = (TextView) com.join.mgps.Util.s2.a(view, R.id.appname1);
        List<AppBeanMain> sub = recomDatabeanBusiness.getSub();
        if (sub != null && sub.size() > 0) {
            AppBean game_info = recomDatabeanBusiness.getSub().get(0).getGame_info();
            if (game_info != null) {
                textView2.setText(game_info.getGame_name());
                MyImageLoader.h(simpleDraweeView, game_info.getIco_remote());
            }
            DownloadTask a5 = recomDatabeanBusiness.a();
            UtilsMy.j3(game_info.getSp_tag_info(), view, a5);
            if ((ConstantIntEnum.H5.value() + "").equals(game_info.getPlugin_num())) {
                textView.setBackgroundResource(R.drawable.recom_blue_butn);
                textView.setText("开始");
                textView.setTextColor(this.f45987b.getResources().getColor(R.color.app_blue_color));
            } else if (a5 == null) {
                if (UtilsMy.o0(game_info.getTag_info())) {
                    if (UtilsMy.w0(game_info.getPay_tag_info(), game_info.getCrc_sign_id()) <= 0 ? com.join.android.app.common.utils.e.l0(this.f45987b).d(this.f45987b, game_info.getPackageName()) : false) {
                        APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f45987b).l(this.f45987b, game_info.getPackageName());
                        if (com.join.mgps.Util.g2.i(game_info.getVer()) && l4.d() < Integer.parseInt(game_info.getVer())) {
                            textView.setBackgroundResource(R.drawable.recom_green_butn);
                            textView.setText("更新");
                            textView.setTextColor(this.f45987b.getResources().getColor(R.color.app_green_color));
                        } else {
                            textView.setBackgroundResource(R.drawable.recom_maincolor_butn);
                            textView.setText(this.f45987b.getResources().getString(R.string.download_status_finished));
                            textView.setTextColor(this.f45987b.getResources().getColor(R.color.app_main_color));
                        }
                    } else {
                        textView.setBackgroundResource(R.drawable.recom_green_butn);
                        UtilsMy.w0(game_info.getPay_tag_info(), game_info.getCrc_sign_id());
                        UtilsMy.c3(textView, game_info);
                    }
                } else {
                    textView.setBackgroundResource(R.drawable.recom_green_butn);
                    UtilsMy.w0(game_info.getPay_tag_info(), game_info.getCrc_sign_id());
                    UtilsMy.c3(textView, game_info);
                }
            } else {
                int status = a5.getStatus();
                if (UtilsMy.w0(game_info.getPay_tag_info(), game_info.getCrc_sign_id()) > 0) {
                    status = 43;
                }
                if (status != 0) {
                    if (status == 27) {
                        textView.setText("暂停中");
                    } else if (status == 48) {
                        textView.setBackgroundResource(R.drawable.recom_blue_butn);
                        textView.setText("安装中");
                        textView.setTextColor(this.f45987b.getResources().getColor(R.color.app_blue_color));
                    } else if (status != 2) {
                        if (status != 3) {
                            if (status != 5) {
                                if (status != 6) {
                                    if (status != 7) {
                                        if (status != 42) {
                                            if (status != 43) {
                                                switch (status) {
                                                    case 9:
                                                        textView.setBackgroundResource(R.drawable.recom_green_butn);
                                                        textView.setText("更新");
                                                        textView.setTextColor(this.f45987b.getResources().getColor(R.color.app_green_color));
                                                        break;
                                                    case 10:
                                                        textView.setBackgroundResource(R.drawable.recom_blue_butn);
                                                        textView.setText("等待");
                                                        textView.setTextColor(this.f45987b.getResources().getColor(R.color.app_blue_color));
                                                        break;
                                                    case 11:
                                                        textView.setBackgroundResource(R.drawable.recom_green_butn);
                                                        textView.setText("安装");
                                                        textView.setTextColor(this.f45987b.getResources().getColor(R.color.app_green_color));
                                                        break;
                                                    case 12:
                                                        textView.setBackgroundResource(R.drawable.extract);
                                                        textView.setText("解压中");
                                                        textView.setTextColor(this.f45987b.getResources().getColor(R.color.app_grey_color));
                                                        break;
                                                    case 13:
                                                        textView.setBackgroundResource(R.drawable.reextract);
                                                        textView.setText("解压");
                                                        textView.setTextColor(this.f45987b.getResources().getColor(R.color.app_blue_color));
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            textView.setBackgroundResource(R.drawable.recom_maincolor_butn);
                            textView.setText(this.f45987b.getResources().getString(R.string.download_status_finished));
                            textView.setTextColor(this.f45987b.getResources().getColor(R.color.app_main_color));
                        }
                        textView.setBackgroundResource(R.drawable.recom_blue_butn);
                        textView.setText("继续");
                        textView.setTextColor(this.f45987b.getResources().getColor(R.color.app_blue_color));
                    } else {
                        UtilsMy.x4(a5);
                        textView.setBackgroundResource(R.drawable.recom_blue_butn);
                        textView.setText("暂停");
                        textView.setTextColor(this.f45987b.getResources().getColor(R.color.app_blue_color));
                    }
                }
                textView.setBackgroundResource(R.drawable.recom_green_butn);
                UtilsMy.w0(game_info.getPay_tag_info(), game_info.getCrc_sign_id());
                UtilsMy.c3(textView, game_info);
            }
        }
        return view;
    }

    public x1(Context context, List<RecomDatabeanBusiness> list) {
        this.f45987b = context;
        if (list == null) {
            this.f45988c = new ArrayList();
        } else {
            this.f45988c = list;
        }
        this.f45989d = LayoutInflater.from(context);
    }
}
