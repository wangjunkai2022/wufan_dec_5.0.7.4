package com.join.mgps.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.GameConfig;
import com.join.mgps.fragment.roomlist.StandardEliteRoomFragment;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ArenaCreateDialog.java */
/* loaded from: classes4.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private Dialog f49347a;

    /* renamed from: b  reason: collision with root package name */
    Activity f49348b;

    /* renamed from: c  reason: collision with root package name */
    ListView f49349c;

    /* renamed from: d  reason: collision with root package name */
    StandardEliteRoomFragment.m f49350d;

    /* renamed from: e  reason: collision with root package name */
    int f49351e = 1;

    /* renamed from: f  reason: collision with root package name */
    int f49352f = 2;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaCreateDialog.java */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f.this.b();
        }
    }

    /* compiled from: ArenaCreateDialog.java */
    /* loaded from: classes4.dex */
    class b implements AdapterView.OnItemClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f49354b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f49355c;

        b(List list, boolean z4) {
            this.f49354b = list;
            this.f49355c = z4;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            if (((c) this.f49354b.get(i4)).f49358b == f.this.f49351e) {
                return;
            }
            GameConfig gameConfig = ((c) this.f49354b.get(i4)).f49357a;
            if (!this.f49355c) {
                f.this.b();
                f.this.f49350d.d(gameConfig);
                return;
            }
            f.this.b();
            if (gameConfig.getElite_match_switch() == 1) {
                f.this.f49350d.d(gameConfig);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArenaCreateDialog.java */
    /* loaded from: classes4.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        GameConfig f49357a;

        /* renamed from: b  reason: collision with root package name */
        int f49358b;

        /* renamed from: c  reason: collision with root package name */
        boolean f49359c;

        c() {
        }
    }

    /* compiled from: ArenaCreateDialog.java */
    /* loaded from: classes4.dex */
    private class d extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        private List<c> f49361b;

        /* compiled from: ArenaCreateDialog.java */
        /* loaded from: classes4.dex */
        class a {

            /* renamed from: a  reason: collision with root package name */
            TextView f49363a;

            /* renamed from: b  reason: collision with root package name */
            View f49364b;

            a() {
            }
        }

        /* compiled from: ArenaCreateDialog.java */
        /* loaded from: classes4.dex */
        class b {

            /* renamed from: a  reason: collision with root package name */
            TextView f49366a;

            b() {
            }
        }

        public d(List<c> list) {
            this.f49361b = list;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f49361b.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return this.f49361b.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i4) {
            return this.f49361b.get(i4).f49358b;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i4);
            a aVar = null;
            if (view == null) {
                if (itemViewType == f.this.f49351e) {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_arena_create_title, (ViewGroup) null);
                    b bVar = new b();
                    bVar.f49366a = (TextView) view.findViewById(R.id.tv_title);
                    view.setTag(bVar);
                } else {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_arena_room_sort, (ViewGroup) null);
                    aVar = new a();
                    aVar.f49363a = (TextView) view.findViewById(R.id.tv_info);
                    View findViewById = view.findViewById(R.id.emptyView);
                    aVar.f49364b = findViewById;
                    findViewById.setVisibility(0);
                    view.setTag(aVar);
                }
            } else if (itemViewType == f.this.f49351e) {
                b bVar2 = (b) view.getTag();
            } else {
                aVar = (a) view.getTag();
            }
            c cVar = this.f49361b.get(i4);
            if (itemViewType != f.this.f49351e) {
                aVar.f49363a.setText(cVar.f49357a.getGame_name());
                aVar.f49363a.setBackgroundResource(R.drawable.room_sort_gray_border);
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }
    }

    public f(Activity activity, StandardEliteRoomFragment.m mVar) {
        this.f49350d = mVar;
        this.f49348b = activity;
        c(activity);
    }

    private c a(GameConfig gameConfig, int i4, boolean z4) {
        c cVar = new c();
        cVar.f49358b = i4;
        cVar.f49357a = gameConfig;
        cVar.f49359c = z4;
        return cVar;
    }

    public void b() {
        this.f49347a.dismiss();
    }

    void c(Activity activity) {
        Dialog dialog = new Dialog(activity, R.style.newtrans_floating_dialog);
        this.f49347a = dialog;
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            this.f49347a.getWindow().setAttributes(attributes);
        }
        View inflate = LayoutInflater.from(activity).inflate(R.layout.dialog_arena_create, (ViewGroup) null);
        inflate.findViewById(R.id.iv_close).setOnClickListener(new a());
        this.f49349c = (ListView) inflate.findViewById(R.id.list);
        this.f49347a.setContentView(inflate);
        Window window = this.f49347a.getWindow();
        WindowManager.LayoutParams attributes2 = window.getAttributes();
        attributes2.width = -1;
        attributes2.height = -1;
        window.setGravity(17);
    }

    public void d(List<GameConfig> list, boolean z4) {
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!z4) {
            for (GameConfig gameConfig : list) {
                if (!z4) {
                    arrayList.add(a(gameConfig, this.f49352f, false));
                }
            }
        } else {
            ArrayList<GameConfig> arrayList2 = new ArrayList();
            ArrayList<GameConfig> arrayList3 = new ArrayList();
            for (GameConfig gameConfig2 : list) {
                if (gameConfig2.getElite_match_switch() == 1) {
                    arrayList2.add(gameConfig2);
                } else {
                    arrayList3.add(gameConfig2);
                }
            }
            if (arrayList2.size() > 0) {
                for (GameConfig gameConfig3 : arrayList2) {
                    arrayList.add(a(gameConfig3, this.f49352f, true));
                }
            }
            if (arrayList3.size() > 0) {
                arrayList.add(a(null, this.f49351e, true));
                for (GameConfig gameConfig4 : arrayList3) {
                    arrayList.add(a(gameConfig4, this.f49352f, true));
                }
            }
        }
        this.f49349c.setAdapter((ListAdapter) new d(arrayList));
        this.f49349c.setOnItemClickListener(new b(arrayList, z4));
    }

    public void e() {
        if (this.f49347a.isShowing()) {
            return;
        }
        this.f49347a.show();
    }
}
