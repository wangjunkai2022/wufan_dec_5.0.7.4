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
import com.join.mgps.customview.SquareLayout;
import java.util.ArrayList;
import java.util.List;
import net.lingala.zip4j.util.e;
/* compiled from: MyIconAdapter.java */
/* loaded from: classes3.dex */
public class d extends BaseAdapter {

    /* renamed from: e  reason: collision with root package name */
    public static final String f15079e = "camera";

    /* renamed from: b  reason: collision with root package name */
    private String f15080b;

    /* renamed from: c  reason: collision with root package name */
    private Context f15081c;

    /* renamed from: d  reason: collision with root package name */
    private List<String> f15082d;

    /* compiled from: MyIconAdapter.java */
    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f15083a;

        /* renamed from: b  reason: collision with root package name */
        SquareLayout f15084b;

        public a() {
        }
    }

    public d(Context context, List<String> list, String str) {
        this.f15081c = context;
        this.f15080b = str;
        this.f15082d = list;
    }

    private void a(List<String> list) {
        if (this.f15082d == null) {
            this.f15082d = new ArrayList();
        }
        this.f15082d.clear();
        this.f15082d.add("camera");
        this.f15082d.addAll(list);
    }

    public static ImageLoader b() {
        return ImageLoader.r(3, ImageLoader.Type.LIFO);
    }

    private void c(ImageView imageView, String str) {
        b().v(str, imageView);
    }

    public void d(String str) {
        this.f15080b = str;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<String> list = this.f15082d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return this.f15082d.get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        a aVar;
        if (this.f15081c != null && getCount() != 0) {
            try {
                if (view != null) {
                    aVar = (a) view.getTag();
                } else {
                    aVar = new a();
                    View inflate = LayoutInflater.from(this.f15081c).inflate(R.layout.choose_icon_item, (ViewGroup) null);
                    aVar.f15083a = (SimpleDraweeView) inflate.findViewById(R.id.itemImage);
                    aVar.f15084b = (SquareLayout) inflate.findViewById(R.id.itemLayout);
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
                aVar.f15083a.setImageResource(R.drawable.main_normal_icon);
                aVar.f15083a.setColorFilter((ColorFilter) null);
                String str = (String) getItem(i4);
                if (this.f15082d.get(i4).equals("camera")) {
                    SimpleDraweeView simpleDraweeView = aVar.f15083a;
                    simpleDraweeView.setImageURI(Uri.parse("res://" + this.f15081c.getPackageName() + e.F0 + R.drawable.camera_default));
                } else {
                    SimpleDraweeView simpleDraweeView2 = aVar.f15083a;
                    MyImageLoader.i(simpleDraweeView2, "file://" + str, r.c.f11300g);
                    aVar.f15083a.setVisibility(0);
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
