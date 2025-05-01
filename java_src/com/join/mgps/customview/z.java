package com.join.mgps.customview;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.posting.PostingActivity;
import com.join.mgps.dto.GroupInfoBean;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PopSelectPostingGroup.java */
/* loaded from: classes4.dex */
public class z extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    ListView f48988a;

    /* renamed from: b  reason: collision with root package name */
    PostingActivity.m f48989b;

    /* compiled from: PopSelectPostingGroup.java */
    /* loaded from: classes4.dex */
    class a implements AdapterView.OnItemClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f48990b;

        a(List list) {
            this.f48990b = list;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView<?> adapterView, View view, int i4, long j4) {
            if (((b) this.f48990b.get(i4)).f48994a == 2) {
                z.this.f48989b.c(((b) this.f48990b.get(i4)).f48995b);
                z.this.dismiss();
            }
        }
    }

    /* compiled from: PopSelectPostingGroup.java */
    /* loaded from: classes4.dex */
    class b {

        /* renamed from: e  reason: collision with root package name */
        static final int f48992e = 1;

        /* renamed from: f  reason: collision with root package name */
        static final int f48993f = 2;

        /* renamed from: a  reason: collision with root package name */
        int f48994a;

        /* renamed from: b  reason: collision with root package name */
        GroupInfoBean f48995b;

        /* renamed from: c  reason: collision with root package name */
        String f48996c;

        b() {
        }
    }

    /* compiled from: PopSelectPostingGroup.java */
    /* loaded from: classes4.dex */
    class c extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        private List<b> f48998b;

        /* compiled from: PopSelectPostingGroup.java */
        /* loaded from: classes4.dex */
        class a {

            /* renamed from: a  reason: collision with root package name */
            TextView f49000a;

            a() {
            }
        }

        /* compiled from: PopSelectPostingGroup.java */
        /* loaded from: classes4.dex */
        class b {

            /* renamed from: a  reason: collision with root package name */
            TextView f49002a;

            /* renamed from: b  reason: collision with root package name */
            ImageView f49003b;

            b() {
            }
        }

        public c(List<b> list) {
            this.f48998b = list;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f48998b.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return this.f48998b.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i4) {
            return this.f48998b.get(i4).f48994a;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            b bVar;
            b bVar2;
            int i5 = this.f48998b.get(i4).f48994a;
            a aVar = null;
            if (view == null) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_select_posting_group, (ViewGroup) null);
                        bVar2 = new b();
                        bVar2.f49002a = (TextView) view.findViewById(R.id.tv_name);
                        bVar2.f49003b = (ImageView) view.findViewById(R.id.iv_selected);
                        view.setTag(bVar2);
                    }
                    bVar2 = null;
                } else {
                    a aVar2 = new a();
                    View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_posting_group_title, (ViewGroup) null);
                    aVar2.f49000a = (TextView) inflate.findViewById(R.id.tv_title);
                    inflate.setTag(aVar2);
                    bVar = null;
                    aVar = aVar2;
                    view = inflate;
                    bVar2 = bVar;
                }
            } else if (i5 != 1) {
                if (i5 == 2) {
                    bVar2 = (b) view.getTag();
                }
                bVar2 = null;
            } else {
                bVar = null;
                aVar = (a) view.getTag();
                bVar2 = bVar;
            }
            if (i5 == 1) {
                aVar.f49000a.setText(this.f48998b.get(i4).f48996c);
            } else if (i5 == 2) {
                bVar2.f49002a.setText(this.f48998b.get(i4).f48995b.getName());
                if (this.f48998b.get(i4).f48995b.isSelected()) {
                    bVar2.f49003b.setVisibility(0);
                } else {
                    bVar2.f49003b.setVisibility(8);
                }
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }
    }

    public z(Activity activity, PostingActivity.m mVar) {
        this.f48989b = mVar;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.pop_select_posting_group, (ViewGroup) null);
        this.f48988a = (ListView) inflate.findViewById(R.id.mListView);
        setContentView(inflate);
        setSoftInputMode(16);
        setWidth(activity.getWindowManager().getDefaultDisplay().getWidth());
        setHeight(-1);
        setFocusable(true);
        setTouchable(true);
        setOutsideTouchable(true);
        update();
        setBackgroundDrawable(new ColorDrawable(0));
        setAnimationStyle(R.style.PopupAnimation_100);
    }

    public void a(List<GroupInfoBean> list, List<GroupInfoBean> list2, GroupInfoBean groupInfoBean) {
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        if (list != null && list.size() > 0) {
            if (groupInfoBean != null) {
                int i5 = 0;
                while (true) {
                    if (i5 >= list.size()) {
                        break;
                    } else if (list.get(i5).getFid() == groupInfoBean.getFid()) {
                        list.get(i5).setSelected(true);
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            b bVar = new b();
            bVar.f48994a = 1;
            bVar.f48996c = "推荐";
            arrayList.add(bVar);
            for (GroupInfoBean groupInfoBean2 : list) {
                b bVar2 = new b();
                bVar2.f48994a = 2;
                bVar2.f48995b = groupInfoBean2;
                arrayList.add(bVar2);
            }
        }
        if (list2 != null && list2.size() > 0) {
            if (groupInfoBean != null) {
                while (true) {
                    if (i4 >= list2.size()) {
                        break;
                    } else if (list2.get(i4).getFid() == groupInfoBean.getFid()) {
                        list2.get(i4).setSelected(true);
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            b bVar3 = new b();
            bVar3.f48994a = 1;
            bVar3.f48996c = "我的";
            arrayList.add(bVar3);
            for (GroupInfoBean groupInfoBean3 : list2) {
                b bVar4 = new b();
                bVar4.f48994a = 2;
                bVar4.f48995b = groupInfoBean3;
                arrayList.add(bVar4);
            }
        }
        this.f48988a.setAdapter((ListAdapter) new c(arrayList));
        this.f48988a.setOnItemClickListener(new a(arrayList));
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        if (Build.VERSION.SDK_INT == 24) {
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            setHeight(view.getResources().getDisplayMetrics().heightPixels - rect.bottom);
        }
        super.showAsDropDown(view);
    }
}
