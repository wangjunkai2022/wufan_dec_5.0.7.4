package com.join.mgps.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.MGMainActivity;
import com.join.mgps.dto.DownloadCenterBean;
import com.join.mgps.enums.Dtype;
import com.join.mgps.pref.PrefDef_;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.download_mygame_fragment)
/* loaded from: classes.dex */
public class DownloadMYGameFragment extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private Activity f51037c;

    /* renamed from: d  reason: collision with root package name */
    DownloadCenterBean f51038d;
    @Pref

    /* renamed from: e  reason: collision with root package name */
    PrefDef_ f51039e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    ListView f51040f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f51041g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f51042h;

    /* renamed from: i  reason: collision with root package name */
    com.join.mgps.adapter.o f51043i;

    /* renamed from: j  reason: collision with root package name */
    private List<DownloadTask> f51044j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f51045k;

    /* renamed from: b  reason: collision with root package name */
    private final String f51036b = "DownloadMYGameFragment";

    /* renamed from: l  reason: collision with root package name */
    com.join.mgps.pref.f f51046l = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72036y})
    public void V(Intent intent) {
        try {
            X();
            this.f51043i.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void W() {
        if (this.f51044j.size() == 0) {
            TextView textView = this.f51045k;
            if (textView != null) {
                textView.setVisibility(8);
            }
            this.f51041g.setVisibility(0);
        } else {
            TextView textView2 = this.f51045k;
            if (textView2 != null) {
                textView2.setVisibility(0);
                TextView textView3 = this.f51045k;
                textView3.setText("共" + this.f51044j.size() + "款游戏");
            }
            this.f51041g.setVisibility(8);
        }
        if (this.f51044j.size() <= 0 || !this.f51039e.FirstShowMYgameTopTip().d().booleanValue()) {
            return;
        }
        this.f51042h.setVisibility(0);
    }

    void X() {
        List<DownloadTask> R = p1.f.K().R(null);
        Iterator<DownloadTask> it2 = R.iterator();
        while (it2.hasNext()) {
            if (it2.next().getStatus() == 11) {
                it2.remove();
            }
        }
        this.f51044j.clear();
        this.f51044j.addAll(R);
        this.f51043i.notifyDataSetChanged();
        W();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void Z() {
        this.f51042h.setVisibility(8);
        this.f51039e.FirstShowMYgameTopTip().g(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72008k})
    public void a0(@Receiver.Extra String str) {
        Iterator<DownloadTask> it2 = this.f51044j.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(str)) {
                next.setOpen(true);
                break;
            }
        }
        this.f51043i.notifyDataSetChanged();
        W();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f51037c = getActivity();
        this.f51043i = new com.join.mgps.adapter.o(this.f51037c);
        View inflate = LayoutInflater.from(this.f51037c).inflate(R.layout.download_center_footer, (ViewGroup) null);
        this.f51045k = (TextView) inflate.findViewById(R.id.textViewCount);
        this.f51040f.addFooterView(inflate);
        this.f51040f.setAdapter((ListAdapter) this.f51043i);
        this.f51043i.e(this.f51040f);
        DownloadCenterBean c5 = this.f51043i.c();
        this.f51038d = c5;
        this.f51044j = c5.getDownloadFiles();
        StringBuilder sb = new StringBuilder();
        sb.append("hasCode=");
        sb.append(hashCode());
        sb.append("");
        com.join.mgps.Util.d0.a().d(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void b0(Context context, String str) {
        p1.f.K().i0(str, true);
        Intent intent = new Intent(o1.a.f72008k);
        intent.putExtra("gameId", str);
        context.sendBroadcast(intent);
    }

    @SuppressLint({"LongLogTag"})
    void c0(DownloadTask downloadTask, int i4) {
        boolean z4;
        StringBuilder sb = new StringBuilder();
        sb.append("downloadTask:from =");
        sb.append(i4);
        if (i4 == 4) {
            return;
        }
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (status == 7) {
            Iterator<DownloadTask> it2 = this.f51044j.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (it2.next().getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                    it2.remove();
                    this.f51043i.notifyDataSetChanged();
                    com.join.mgps.Util.v0.c("移除数据");
                    break;
                }
            }
            W();
            return;
        }
        if (status == 5 || status == 11) {
            if (downloadTask.getFileType() != null && downloadTask.getFileType().equals(Dtype.chajian.name())) {
                return;
            }
            List<DownloadTask> downloadFiles = this.f51043i.c().getDownloadFiles();
            boolean z5 = true;
            if (downloadTask.getFileType() != null && downloadTask.getFileType().equals(Dtype.apk.name())) {
                Iterator<DownloadTask> it3 = downloadFiles.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z4 = false;
                        break;
                    }
                    DownloadTask next = it3.next();
                    if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                        next.setStatus(downloadTask.getStatus());
                        z4 = true;
                        break;
                    }
                }
                if (!z4) {
                    downloadFiles.add(0, downloadTask);
                }
                this.f51043i.notifyDataSetChanged();
            }
            if (downloadTask.getFileType() != null && downloadTask.getFileType().equals(Dtype.android.name())) {
                Iterator<DownloadTask> it4 = downloadFiles.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z5 = false;
                        break;
                    }
                    DownloadTask next2 = it4.next();
                    if (next2.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                        next2.setStatus(downloadTask.getStatus());
                        break;
                    }
                }
                if (!z5) {
                    downloadFiles.add(0, downloadTask);
                }
                this.f51043i.notifyDataSetChanged();
            }
        }
        W();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f51046l = (MGMainActivity) getParentFragment().getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        org.greenrobot.eventbus.c.f().y(this);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        W();
        DownloadTask a5 = nVar.a();
        int c5 = nVar.c();
        if (c5 == 5 || c5 == 11 || c5 == 48) {
            c0(a5, 5);
        } else if (c5 == 7) {
            a5.setStatus(7);
            c0(a5, 3);
        } else if (c5 != 8) {
        } else {
            c0(a5, 4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        try {
            X();
            this.f51043i.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f51046l.callbackClassify(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        this.f51046l.callbackHome(null);
    }
}
