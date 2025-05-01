package com.join.mgps.activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.BaseActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.RomArchived;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.cloud_rom_list)
/* loaded from: classes4.dex */
public class CloudRomListActivity extends BaseActivity {
    @Extra

    /* renamed from: b  reason: collision with root package name */
    DownloadTask f28982b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ListView f28983c;

    /* renamed from: d  reason: collision with root package name */
    List<RomArchived> f28984d;

    /* loaded from: classes4.dex */
    class a extends BaseAdapter {
        a() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return CloudRomListActivity.this.f28984d.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return CloudRomListActivity.this.f28984d.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(CloudRomListActivity.this).inflate(R.layout.cloud_rom_item, (ViewGroup) null);
            }
            TextView textView = (TextView) view.findViewById(R.id.time);
            ((TextView) view.findViewById(R.id.name)).setText("存档 " + (i4 + 1));
            MyImageLoader.h((SimpleDraweeView) view.findViewById(R.id.img), CloudRomListActivity.this.f28984d.get(i4).getArchivedImagePath());
            return view;
        }
    }

    /* loaded from: classes4.dex */
    public class b implements Comparator {
        public b() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            RomArchived romArchived = (RomArchived) obj;
            RomArchived romArchived2 = (RomArchived) obj2;
            if (Long.parseLong(romArchived.getArchivedTime()) > Long.parseLong(romArchived2.getArchivedTime())) {
                return 1;
            }
            return Long.parseLong(romArchived.getArchivedTime()) == Long.parseLong(romArchived2.getArchivedTime()) ? 0 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterView() {
        List<RomArchived> l4 = com.join.mgps.Util.g0.l(this.f28982b.getPlugin_num(), this.f28982b.getGameZipPath());
        this.f28984d = l4;
        Collections.sort(l4, new b());
        this.f28983c.setAdapter((ListAdapter) new a());
    }
}
