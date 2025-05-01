package com.join.android.app.component.album.adapter;

import android.content.Context;
import android.graphics.ColorFilter;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.album.lib.ImageLoader;
import com.join.android.app.mgsim.wufun.R;
import java.util.ArrayList;
import java.util.List;
import net.lingala.zip4j.util.e;
/* compiled from: MyAlbumAdapter.java */
/* loaded from: classes3.dex */
public class c extends BaseAdapter {

    /* renamed from: f  reason: collision with root package name */
    public static final String f15071f = "camera";

    /* renamed from: b  reason: collision with root package name */
    private List<String> f15072b;

    /* renamed from: c  reason: collision with root package name */
    private String f15073c;

    /* renamed from: d  reason: collision with root package name */
    private Context f15074d;

    /* renamed from: e  reason: collision with root package name */
    private List<String> f15075e;

    /* compiled from: MyAlbumAdapter.java */
    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f15076a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f15077b;

        public a() {
        }
    }

    public c(Context context, List<String> list, String str, List<String> list2) {
        this.f15074d = context;
        this.f15073c = str;
        this.f15072b = list2;
        this.f15075e = list;
    }

    private void a(List<String> list) {
        if (this.f15075e == null) {
            this.f15075e = new ArrayList();
        }
        this.f15075e.clear();
        this.f15075e.add("camera");
        this.f15075e.addAll(list);
    }

    private void b(ImageView imageView, ImageView imageView2, String str) {
        List<String> list = this.f15072b;
        if (list == null || list.size() == 0) {
            return;
        }
        for (int i4 = 0; i4 < this.f15072b.size(); i4++) {
            if (this.f15072b.get(i4).equals(str)) {
                imageView2.setImageResource(R.drawable.pic_select_selected);
            }
        }
    }

    public static ImageLoader c() {
        return ImageLoader.r(3, ImageLoader.Type.LIFO);
    }

    private void d(ImageView imageView, String str) {
        c().v(str, imageView);
    }

    public void e(String str) {
        this.f15073c = str;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<String> list = this.f15075e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return this.f15075e.get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        a aVar;
        if (this.f15074d != null && getCount() != 0) {
            try {
                if (view != null) {
                    aVar = (a) view.getTag();
                } else {
                    aVar = new a();
                    View inflate = LayoutInflater.from(this.f15074d).inflate(R.layout.my_album_item, (ViewGroup) null);
                    aVar.f15076a = (SimpleDraweeView) inflate.findViewById(R.id.image);
                    aVar.f15077b = (ImageView) inflate.findViewById(R.id.image_flag);
                    try {
                        inflate.setTag(aVar);
                        view = inflate;
                    } catch (Exception e5) {
                        e = e5;
                        view = inflate;
                        e.printStackTrace();
                        return view;
                    }
                }
                aVar.f15076a.setImageResource(R.drawable.main_normal_icon);
                aVar.f15076a.setColorFilter((ColorFilter) null);
                aVar.f15077b.setImageResource(R.drawable.pic_select_normal);
                String str = (String) getItem(i4);
                if (this.f15075e.get(i4).equals("camera")) {
                    SimpleDraweeView simpleDraweeView = aVar.f15076a;
                    simpleDraweeView.setImageURI(Uri.parse("res://" + this.f15074d.getPackageName() + e.F0 + R.drawable.camera_default));
                    aVar.f15077b.setVisibility(8);
                } else {
                    SimpleDraweeView simpleDraweeView2 = aVar.f15076a;
                    MyImageLoader.i(simpleDraweeView2, "file://" + str, r.c.f11300g);
                    aVar.f15077b.setVisibility(0);
                    b(aVar.f15076a, aVar.f15077b, str);
                }
            } catch (Exception e6) {
                e = e6;
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }
}
