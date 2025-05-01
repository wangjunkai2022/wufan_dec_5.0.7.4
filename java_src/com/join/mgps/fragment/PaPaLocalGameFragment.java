package com.join.mgps.fragment;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.fragment.app.Fragment;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.adapter.a3;
import com.join.mgps.customview.XListView2;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_papa_game_local)
/* loaded from: classes3.dex */
public class PaPaLocalGameFragment extends Fragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    XListView2 f52550b;

    /* renamed from: c  reason: collision with root package name */
    a3 f52551c;

    /* renamed from: d  reason: collision with root package name */
    private List<Object> f52552d = new ArrayList();

    /* loaded from: classes3.dex */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            Intent intent = new Intent();
            intent.putExtra("gameInfo", (DownloadTask) PaPaLocalGameFragment.this.f52552d.get(i4));
            ((Activity) PaPaLocalGameFragment.this.getContext()).setResult(-1, intent);
            ((Activity) PaPaLocalGameFragment.this.getContext()).finish();
        }
    }

    @UiThread
    public void W() {
        a3 a3Var = this.f52551c;
        if (a3Var != null) {
            a3Var.notifyDataSetChanged();
        }
        this.f52550b.v();
        this.f52550b.u();
        this.f52550b.setNoMore();
    }

    @UiThread
    public void X(List<DownloadTask> list) {
        if (this.f52551c != null) {
            this.f52552d.clear();
            this.f52552d.addAll(list);
            this.f52551c.notifyDataSetChanged();
        }
        this.f52550b.v();
        this.f52550b.u();
        this.f52550b.setNoMore();
    }

    public void Z(List<DownloadTask> list) {
        this.f52552d.clear();
        this.f52552d.addAll(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        a3 a3Var = new a3(this.f52552d);
        this.f52551c = a3Var;
        this.f52550b.setAdapter((ListAdapter) a3Var);
        this.f52550b.setOnItemClickListener(new a());
    }
}
