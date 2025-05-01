package com.zhy.view.flowlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.join.mgps.customview.WrapContentGridView;
import com.zhy.view.flowlayout.TagFlowLayout3;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes6.dex */
public class TagFlowLayout3 extends WrapContentGridView {

    /* renamed from: b  reason: collision with root package name */
    int f68627b;

    /* renamed from: c  reason: collision with root package name */
    List<String> f68628c;

    /* renamed from: d  reason: collision with root package name */
    a f68629d;

    /* renamed from: e  reason: collision with root package name */
    b f68630e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class a extends BaseAdapter {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zhy.view.flowlayout.TagFlowLayout3$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public class C0764a {

            /* renamed from: a  reason: collision with root package name */
            public TextView f68632a;

            C0764a() {
            }
        }

        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i4, C0764a c0764a, ViewGroup viewGroup, View view) {
            TagFlowLayout3 tagFlowLayout3 = TagFlowLayout3.this;
            tagFlowLayout3.f68627b = i4;
            b bVar = tagFlowLayout3.f68630e;
            if (bVar != null) {
                bVar.a(c0764a.f68632a, i4, viewGroup);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<String> list = TagFlowLayout3.this.f68628c;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            List<String> list = TagFlowLayout3.this.f68628c;
            if (list != null) {
                return list.get(i4);
            }
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i4) {
            return super.getItemViewType(i4);
        }

        @Override // android.widget.Adapter
        public View getView(final int i4, View view, final ViewGroup viewGroup) {
            final C0764a c0764a;
            if (view != null) {
                c0764a = (C0764a) view.getTag();
            } else {
                c0764a = new C0764a();
                view = LayoutInflater.from(TagFlowLayout3.this.getContext()).inflate(com.join.android.app.mgsim.wufun.R.layout.serchtag_item_layout1, (ViewGroup) null);
                c0764a.f68632a = (TextView) view.findViewById(com.join.android.app.mgsim.wufun.R.id.tv_tab_title);
                view.setTag(c0764a);
            }
            c0764a.f68632a.setText((String) getItem(i4));
            c0764a.f68632a.setOnClickListener(new View.OnClickListener() { // from class: com.zhy.view.flowlayout.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    TagFlowLayout3.a.this.b(i4, c0764a, viewGroup, view2);
                }
            });
            TagFlowLayout3 tagFlowLayout3 = TagFlowLayout3.this;
            if (i4 == tagFlowLayout3.f68627b) {
                c0764a.f68632a.setTextColor(tagFlowLayout3.getResources().getColor(com.join.android.app.mgsim.wufun.R.color.tag_back_color));
                c0764a.f68632a.setBackgroundResource(com.join.android.app.mgsim.wufun.R.drawable.tab_selected_f7f7f7_r12);
            } else {
                c0764a.f68632a.setTextColor(tagFlowLayout3.getResources().getColor(com.join.android.app.mgsim.wufun.R.color.money_text_color));
                c0764a.f68632a.setBackgroundResource(com.join.android.app.mgsim.wufun.R.drawable.transparent_bg);
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return super.getViewTypeCount();
        }
    }

    /* loaded from: classes6.dex */
    public interface b {
        void a(View view, int i4, ViewGroup viewGroup);
    }

    public TagFlowLayout3(Context context) {
        super(context);
        this.f68627b = 0;
        this.f68628c = new ArrayList();
        this.f68629d = new a();
        a(context);
    }

    private void a(Context context) {
        setAdapter((ListAdapter) this.f68629d);
    }

    public List<String> getData() {
        return this.f68628c;
    }

    public b getListener() {
        return this.f68630e;
    }

    public int getSelectedPosition() {
        return this.f68627b;
    }

    public void setData(List<String> list) {
        this.f68628c.clear();
        if (list == null) {
            return;
        }
        this.f68628c.addAll(list);
        a aVar = this.f68629d;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public void setListener(b bVar) {
        this.f68630e = bVar;
    }

    public void setSelectedPosition(int i4) {
        this.f68627b = i4;
        a aVar = this.f68629d;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public TagFlowLayout3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68627b = 0;
        this.f68628c = new ArrayList();
        this.f68629d = new a();
        a(context);
    }

    public TagFlowLayout3(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f68627b = 0;
        this.f68628c = new ArrayList();
        this.f68629d = new a();
        a(context);
    }
}
