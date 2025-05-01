package com.join.mgps.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.adapter.UninstallGuessLikeAdapter;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GInfoBean;
import com.join.mgps.enums.ConstantIntEnum;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* loaded from: classes4.dex */
public class UninstallGuessLikeAdapter extends BaseQuickAdapter<CommonGameInfoBean, BaseViewHolder> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        CommonGameInfoBean f44150b;

        public a(CommonGameInfoBean commonGameInfoBean) {
            this.f44150b = commonGameInfoBean;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit b(Context context, View view) {
            if (!com.join.android.app.common.utils.j.j(context)) {
                com.join.mgps.Util.l2.a(context).b("网络连接异常");
                return null;
            }
            View findViewById = view.findViewById(R.id.pb_loading);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            TextView textView = (TextView) view.findViewById(R.id.mgListviewItemInstall);
            if (textView != null) {
                textView.setText("");
            }
            UtilsMy.F2(context, this.f44150b);
            return null;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(final View view) {
            final Context context = view.getContext();
            DownloadTask downloadTask = this.f44150b.getDownloadTask();
            GInfoBean g_info = this.f44150b.getG_info();
            if (g_info != null) {
                if (downloadTask == null) {
                    if (this.f44150b.isGameVm() && this.f44150b.isMiniGame() && this.f44150b.is64Bit() && (APKUtils.c(context, this.f44150b) || APKUtils.g(context, new Function0() { // from class: com.join.mgps.adapter.d6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit b5;
                            b5 = UninstallGuessLikeAdapter.a.this.b(context, view);
                            return b5;
                        }
                    }))) {
                        return;
                    }
                    if (!com.join.android.app.common.utils.j.j(context)) {
                        com.join.mgps.Util.l2.a(context).b("网络连接异常");
                        return;
                    }
                    View findViewById = view.findViewById(R.id.pb_loading);
                    if (findViewById != null) {
                        findViewById.setVisibility(0);
                    }
                    TextView textView = (TextView) view.findViewById(R.id.mgListviewItemInstall);
                    if (textView != null) {
                        textView.setText("");
                    }
                    UtilsMy.F2(context, this.f44150b);
                    return;
                }
                String plugin_num = g_info.getPlugin_num();
                if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                    IntentDateBean intentDateBean = new IntentDateBean();
                    ExtBean extBean = new ExtBean();
                    extBean.setReMarks(this.f44150b.getReMarks());
                    intentDateBean.setExtBean(extBean);
                    intentDateBean.setLink_type(4);
                    intentDateBean.setLink_type_val(downloadTask.getDown_url_remote());
                    UtilsMy.T2(downloadTask, context);
                    IntentUtil.getInstance().intentActivity(context, intentDateBean);
                    return;
                }
                int status = downloadTask != null ? downloadTask.getStatus() : 0;
                if (UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId()) > 0) {
                    status = 43;
                }
                if (status != 0) {
                    if (status != 13) {
                        if (status != 2) {
                            if (status != 3) {
                                if (status == 5) {
                                    UtilsMy.T3(context, downloadTask);
                                    return;
                                } else if (status != 6) {
                                    if (status != 7) {
                                        if (status == 42) {
                                            UtilsMy.s4(context, this.f44150b);
                                            return;
                                        } else if (status != 43) {
                                            switch (status) {
                                                case 9:
                                                    if (!com.join.android.app.common.utils.j.j(context)) {
                                                        com.join.mgps.Util.l2.a(context).b("无网络连接");
                                                        return;
                                                    } else {
                                                        UtilsMy.H2(context, downloadTask.getCrc_link_type_val(), this.f44150b);
                                                        return;
                                                    }
                                                case 10:
                                                    break;
                                                case 11:
                                                    UtilsMy.a4(downloadTask, context);
                                                    return;
                                                default:
                                                    return;
                                            }
                                        }
                                    }
                                }
                            }
                            if (downloadTask.isMiniGame()) {
                                APKUtils.U(context, downloadTask);
                            }
                            com.php25.PDownload.d.c(downloadTask, context);
                            return;
                        }
                        if (downloadTask.isMiniGame()) {
                            APKUtils.U(context, downloadTask);
                            return;
                        } else {
                            com.php25.PDownload.d.i(downloadTask);
                            return;
                        }
                    }
                    com.php25.PDownload.d.l(context, downloadTask);
                    return;
                }
                UtilsMy.F2(context, this.f44150b);
            }
        }
    }

    public UninstallGuessLikeAdapter(@Nullable List<CommonGameInfoBean> list) {
        super(R.layout.item_uninstall_recom_list, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Context context, CommonGameInfoBean commonGameInfoBean, View view) {
        IntentUtil.getInstance().intentActivity(context, commonGameInfoBean.getIntentDataBean());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.base.BaseQuickAdapter
    /* renamed from: b */
    public void convert(@NonNull BaseViewHolder baseViewHolder, final CommonGameInfoBean commonGameInfoBean) {
        if (commonGameInfoBean == null || commonGameInfoBean.getG_info() == null) {
            return;
        }
        DownloadTask downloadTask = commonGameInfoBean.getDownloadTask();
        GInfoBean g_info = commonGameInfoBean.getG_info();
        if (g_info != null) {
            final Context context = this.mContext;
            baseViewHolder.setText(R.id.tvGameName, g_info.getName());
            baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.c6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UninstallGuessLikeAdapter.c(context, commonGameInfoBean, view);
                }
            });
            if (com.join.mgps.Util.g2.i(commonGameInfoBean.getBig_pic())) {
                MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.gamePic), commonGameInfoBean.getBig_pic());
            } else {
                List<String> pic_info = g_info.getPic_info();
                if (com.join.mgps.Util.g2.h("") && pic_info != null && pic_info.size() > 0) {
                    MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.gamePic), pic_info.get(0));
                }
            }
            String plugin_num = g_info.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                baseViewHolder.setText(R.id.tvLaunch, "启动");
            } else if (downloadTask == null) {
                if (UtilsMy.o0(g_info.getTag_info())) {
                    if (com.join.android.app.common.utils.e.l0(context).d(context, g_info.getPackage_name()) && UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId()) == 0) {
                        APKUtils.a l4 = com.join.android.app.common.utils.e.l0(context).l(context, g_info.getPackage_name());
                        if (com.join.mgps.Util.g2.i(g_info.getVer()) && l4.d() < Integer.parseInt(g_info.getVer())) {
                            baseViewHolder.setText(R.id.tvLaunch, "更新");
                        } else {
                            baseViewHolder.setText(R.id.tvLaunch, context.getResources().getString(R.string.download_status_finished));
                        }
                    } else {
                        baseViewHolder.setText(R.id.tvLaunch, context.getResources().getString(R.string.download_status_download));
                        UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                    }
                } else {
                    baseViewHolder.setText(R.id.tvLaunch, context.getResources().getString(R.string.download_status_download));
                    UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("convert: ");
                sb.append(baseViewHolder.getLayoutPosition());
                sb.append("  ");
                sb.append(downloadTask);
                int status = downloadTask.getStatus();
                if (UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId()) > 0) {
                    status = 43;
                }
                if (status != 0) {
                    if (status == 27) {
                        baseViewHolder.setText(R.id.tvLaunch, "暂停中");
                    } else if (status == 48) {
                        baseViewHolder.setText(R.id.tvLaunch, "安装中");
                    } else if (status != 2) {
                        if (status != 3) {
                            if (status != 5) {
                                if (status != 6) {
                                    if (status != 7) {
                                        if (status != 42) {
                                            if (status != 43) {
                                                switch (status) {
                                                    case 9:
                                                        baseViewHolder.setText(R.id.tvLaunch, "更新");
                                                        break;
                                                    case 10:
                                                        baseViewHolder.setText(R.id.tvLaunch, "等待");
                                                        break;
                                                    case 11:
                                                        baseViewHolder.setText(R.id.tvLaunch, "安装");
                                                        break;
                                                    case 12:
                                                        baseViewHolder.setText(R.id.tvLaunch, "解压中");
                                                        break;
                                                    case 13:
                                                        baseViewHolder.setText(R.id.tvLaunch, "解压");
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            baseViewHolder.setText(R.id.tvLaunch, context.getResources().getString(R.string.download_status_finished));
                        }
                        baseViewHolder.setText(R.id.tvLaunch, "继续");
                    } else {
                        UtilsMy.x4(downloadTask);
                        baseViewHolder.setText(R.id.tvLaunch, downloadTask.getProgress() + "%");
                    }
                }
                UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                baseViewHolder.setText(R.id.tvLaunch, context.getResources().getString(R.string.download_status_download));
            }
            baseViewHolder.getView(R.id.tvLaunch).setOnClickListener(new a(commonGameInfoBean));
        }
    }
}
