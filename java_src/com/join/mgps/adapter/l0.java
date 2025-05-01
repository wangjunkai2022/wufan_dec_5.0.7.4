package com.join.mgps.adapter;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.GiftPackageDataInfoBean;
import java.util.ArrayList;
import java.util.List;
/* compiled from: GamDetialGiftMoreAdapter.java */
/* loaded from: classes4.dex */
public class l0 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f44534b;

    /* renamed from: c  reason: collision with root package name */
    private List<GiftPackageDataInfoBean> f44535c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f44536d;

    /* compiled from: GamDetialGiftMoreAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f44537b;

        a(GiftPackageDataInfoBean giftPackageDataInfoBean) {
            this.f44537b = giftPackageDataInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f44537b.getGift_package_status() == 1 && !TextUtils.isEmpty(this.f44537b.getGift_package_code())) {
                Message message = new Message();
                message.what = 2;
                message.obj = this.f44537b;
                l0.this.f44536d.sendMessage(message);
                return;
            }
            Message message2 = new Message();
            message2.what = 3;
            message2.obj = this.f44537b;
            l0.this.f44536d.sendMessage(message2);
        }
    }

    /* compiled from: GamDetialGiftMoreAdapter.java */
    /* loaded from: classes4.dex */
    class b {

        /* renamed from: a  reason: collision with root package name */
        TextView f44539a;

        /* renamed from: b  reason: collision with root package name */
        TextView f44540b;

        /* renamed from: c  reason: collision with root package name */
        TextView f44541c;

        /* renamed from: d  reason: collision with root package name */
        Button f44542d;

        /* renamed from: e  reason: collision with root package name */
        ProgressBar f44543e;

        b() {
        }
    }

    public l0(Context context, Handler handler) {
        this.f44536d = handler;
        this.f44534b = context;
    }

    public List<GiftPackageDataInfoBean> b() {
        if (this.f44535c == null) {
            this.f44535c = new ArrayList();
        }
        return this.f44535c;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44535c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        b bVar;
        if (view == null) {
            view = LayoutInflater.from(this.f44534b).inflate(R.layout.gamedetial_more_gift_item_layout, (ViewGroup) null);
            bVar = new b();
            bVar.f44541c = (TextView) view.findViewById(R.id.content);
            bVar.f44540b = (TextView) view.findViewById(R.id.percent);
            bVar.f44539a = (TextView) view.findViewById(R.id.title);
            bVar.f44542d = (Button) view.findViewById(R.id.getGift);
            bVar.f44543e = (ProgressBar) view.findViewById(R.id.progress);
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        GiftPackageDataInfoBean giftPackageDataInfoBean = this.f44535c.get(i4);
        bVar.f44541c.setText(giftPackageDataInfoBean.getGift_package_content());
        int gift_package_surplus = (giftPackageDataInfoBean.getGift_package_surplus() == 0 || giftPackageDataInfoBean.getGift_package_count() == 0) ? 0 : (giftPackageDataInfoBean.getGift_package_surplus() * 100) / giftPackageDataInfoBean.getGift_package_count();
        if (giftPackageDataInfoBean.getGift_package_status() == 1 && !TextUtils.isEmpty(giftPackageDataInfoBean.getGift_package_code())) {
            bVar.f44542d.setText("查看");
        } else {
            bVar.f44542d.setText("领取");
        }
        TextView textView = bVar.f44540b;
        textView.setText("剩余" + gift_package_surplus + "%");
        bVar.f44543e.setProgress(100 - gift_package_surplus);
        TextView textView2 = bVar.f44541c;
        textView2.setText("礼包内容：" + giftPackageDataInfoBean.getGift_package_content());
        bVar.f44539a.setText(giftPackageDataInfoBean.getGift_package_title());
        bVar.f44542d.setOnClickListener(new a(giftPackageDataInfoBean));
        return view;
    }
}
