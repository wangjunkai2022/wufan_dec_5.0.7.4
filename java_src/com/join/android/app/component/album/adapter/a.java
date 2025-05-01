package com.join.android.app.component.album.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.join.android.app.component.album.lib.ImageLoader;
import com.join.android.app.mgsim.wufun.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AlbumAdapter.java */
/* loaded from: classes3.dex */
public class a extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f15062b;

    /* renamed from: c  reason: collision with root package name */
    private List<com.join.android.app.component.album.lib.a> f15063c;

    /* renamed from: d  reason: collision with root package name */
    ImageLoader f15064d;

    /* compiled from: AlbumAdapter.java */
    /* renamed from: com.join.android.app.component.album.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0317a {

        /* renamed from: a  reason: collision with root package name */
        ImageView f15065a;

        /* renamed from: b  reason: collision with root package name */
        TextView f15066b;

        /* renamed from: c  reason: collision with root package name */
        TextView f15067c;

        public C0317a() {
        }
    }

    public a(Context context, List<com.join.android.app.component.album.lib.a> list) {
        ArrayList arrayList = new ArrayList();
        this.f15063c = arrayList;
        this.f15062b = context;
        arrayList.clear();
        this.f15063c.addAll(list);
        this.f15064d = new ImageLoader(1, ImageLoader.Type.LIFO);
    }

    public static ImageLoader a() {
        return ImageLoader.r(3, ImageLoader.Type.LIFO);
    }

    private void b(ImageView imageView, String str) {
        this.f15064d.v(str, imageView);
    }

    public void c(List<com.join.android.app.component.album.lib.a> list) {
        this.f15063c.clear();
        this.f15063c.addAll(list);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<com.join.android.app.component.album.lib.a> list = this.f15063c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return this.f15063c.get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        C0317a c0317a;
        if (this.f15062b != null && getCount() != 0) {
            try {
                if (view != null) {
                    c0317a = (C0317a) view.getTag();
                } else {
                    c0317a = new C0317a();
                    view = LayoutInflater.from(this.f15062b).inflate(R.layout.album_item, (ViewGroup) null);
                    c0317a.f15065a = (ImageView) view.findViewById(R.id.album_cover);
                    c0317a.f15066b = (TextView) view.findViewById(R.id.album_name);
                    c0317a.f15067c = (TextView) view.findViewById(R.id.album_count);
                    view.setTag(c0317a);
                }
                com.join.android.app.component.album.lib.a aVar = this.f15063c.get(i4);
                b(c0317a.f15065a, aVar.e());
                c0317a.f15066b.setText(aVar.f());
                TextView textView = c0317a.f15067c;
                textView.setText("(" + aVar.c() + ")");
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return view;
    }
}
