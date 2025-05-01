package com.join.mgps.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.adapter.o;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.DownloadCenterBean;
import com.join.mgps.enums.Dtype;
import com.join.mgps.pref.PrefDef_;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.my_papa_layout)
/* loaded from: classes.dex */
public class MyPapaFragment extends Fragment implements o.k {

    /* renamed from: c  reason: collision with root package name */
    private Activity f36073c;

    /* renamed from: d  reason: collision with root package name */
    DownloadCenterBean f36074d;

    /* renamed from: f  reason: collision with root package name */
    private String f36076f;
    @Pref

    /* renamed from: g  reason: collision with root package name */
    PrefDef_ f36077g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    XListView2 f36078h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f36079i;

    /* renamed from: j  reason: collision with root package name */
    com.join.mgps.adapter.o f36080j;

    /* renamed from: k  reason: collision with root package name */
    private List<DownloadTask> f36081k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f36082l;

    /* renamed from: b  reason: collision with root package name */
    private final String f36072b = "DownloadMYGameFragment";

    /* renamed from: e  reason: collision with root package name */
    private List<DownloadTask> f36075e = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    com.join.mgps.pref.f f36083m = null;

    @Override // com.join.mgps.adapter.o.k
    public void M(int i4, DownloadTask downloadTask) {
        new com.join.android.app.common.dialog.l(getActivity(), downloadTask, this.f36080j).show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void V() {
        try {
            if (this.f36081k.size() == 0) {
                TextView textView = this.f36082l;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                this.f36079i.setVisibility(0);
                return;
            }
            TextView textView2 = this.f36082l;
            if (textView2 != null) {
                textView2.setVisibility(0);
                TextView textView3 = this.f36082l;
                textView3.setText("共" + this.f36081k.size() + "款游戏");
            }
            LinearLayout linearLayout = this.f36079i;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @UiThread
    public void W() {
        com.join.mgps.adapter.o oVar = this.f36080j;
        if (oVar != null) {
            oVar.notifyDataSetChanged();
        }
    }

    @UiThread
    public void X(List<DownloadTask> list) {
        if (this.f36080j != null) {
            this.f36081k.clear();
            this.f36081k.addAll(list);
            V();
            this.f36080j.notifyDataSetChanged();
        }
    }

    public void Z(List<DownloadTask> list) {
        this.f36075e = list;
    }

    public void a0(String str) {
        this.f36076f = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        com.join.mgps.Util.v0.c("wode item showstart   " + System.currentTimeMillis());
        this.f36073c = getActivity();
        this.f36080j = new com.join.mgps.adapter.o(this.f36073c, this);
        View inflate = LayoutInflater.from(this.f36073c).inflate(R.layout.download_center_footer, (ViewGroup) null);
        this.f36082l = (TextView) inflate.findViewById(R.id.textViewCount);
        this.f36078h.addFooterView(inflate);
        DownloadCenterBean c5 = this.f36080j.c();
        this.f36074d = c5;
        this.f36081k = c5.getDownloadFiles();
        this.f36078h.setAdapter((ListAdapter) this.f36080j);
        if (this.f36075e != null) {
            ArrayList<DownloadTask> arrayList = new ArrayList();
            arrayList.addAll(this.f36075e);
            for (DownloadTask downloadTask : arrayList) {
                if (!TextUtils.isEmpty(downloadTask.getFileType()) && downloadTask.getFileType().equals(Dtype.android.name()) && UtilsMy.v0(downloadTask.getPay_game_amount(), downloadTask.getCrc_link_type_val()) > 0) {
                    downloadTask.setStatus(43);
                    this.f36075e.remove(downloadTask);
                }
            }
        }
        this.f36081k.addAll(this.f36075e);
        this.f36080j.notifyDataSetChanged();
        StringBuilder sb = new StringBuilder();
        sb.append("hasCode=");
        sb.append(hashCode());
        sb.append("");
        V();
    }

    @SuppressLint({"LongLogTag"})
    void b0(DownloadTask downloadTask, int i4) {
        boolean z4;
        StringBuilder sb = new StringBuilder();
        sb.append("downloadTask:from =");
        sb.append(i4);
        if (i4 == 4) {
            return;
        }
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (status != 7 && status != 2) {
            if (status == 5) {
                if (downloadTask.getFileType() != null && downloadTask.getFileType().equals(Dtype.chajian.name())) {
                    return;
                }
                List<DownloadTask> downloadFiles = this.f36080j.c().getDownloadFiles();
                boolean z5 = true;
                if (downloadTask.getFileType() != null && downloadTask.getFileType().equals(Dtype.apk.name())) {
                    Iterator<DownloadTask> it2 = downloadFiles.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z4 = false;
                            break;
                        }
                        DownloadTask next = it2.next();
                        if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                            next.setStatus(downloadTask.getStatus());
                            z4 = true;
                            break;
                        }
                    }
                    if (!z4) {
                        downloadFiles.add(0, downloadTask);
                    }
                    this.f36080j.notifyDataSetChanged();
                }
                if (downloadTask.getFileType() != null && downloadTask.getFileType().equals(Dtype.android.name())) {
                    Iterator<DownloadTask> it3 = downloadFiles.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z5 = false;
                            break;
                        }
                        DownloadTask next2 = it3.next();
                        if (next2.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                            next2.setStatus(downloadTask.getStatus());
                            break;
                        }
                    }
                    if (!z5) {
                        downloadFiles.add(0, downloadTask);
                    }
                    this.f36080j.notifyDataSetChanged();
                }
            }
            V();
            return;
        }
        Iterator<DownloadTask> it4 = this.f36081k.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            } else if (it4.next().getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                it4.remove();
                this.f36080j.notifyDataSetChanged();
                com.join.mgps.Util.v0.c("移除数据");
                break;
            }
        }
        V();
    }

    public String getType() {
        return this.f36076f;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f36083m = (MGMainActivity) getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        org.greenrobot.eventbus.c.f().y(this);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        V();
        DownloadTask a5 = nVar.a();
        int c5 = nVar.c();
        if (c5 == 2) {
            b0(a5, 1);
        } else if (c5 == 5) {
            b0(a5, 5);
        } else if (c5 == 7) {
            a5.setStatus(7);
            b0(a5, 3);
        } else if (c5 != 8) {
        } else {
            b0(a5, 4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f36083m.callbackClassify(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        this.f36083m.callbackHome(null);
    }
}
