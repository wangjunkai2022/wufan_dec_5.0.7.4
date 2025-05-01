package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.customview.CarouselPagerAdapter2;
import com.join.mgps.customview.CarouselViewPager2;
import com.join.mgps.dto.BannerBean;
import java.util.List;
/* loaded from: classes4.dex */
public class SimpleCarouselAdapter extends CarouselPagerAdapter2<CarouselViewPager2> {

    /* renamed from: c  reason: collision with root package name */
    private List<BannerBean> f44062c;

    /* renamed from: d  reason: collision with root package name */
    private Context f44063d;

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f44064b;

        a(int i4) {
            this.f44064b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SimpleCarouselAdapter simpleCarouselAdapter = SimpleCarouselAdapter.this;
            simpleCarouselAdapter.g((BannerBean) simpleCarouselAdapter.f44062c.get(this.f44064b));
        }
    }

    public SimpleCarouselAdapter(Context context, CarouselViewPager2 carouselViewPager2, List<BannerBean> list) {
        super(carouselViewPager2);
        this.f44062c = list;
        this.f44063d = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(BannerBean bannerBean) {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setJump_type(bannerBean.getJump_type());
        intentDateBean.setLink_type(bannerBean.getLink_type());
        intentDateBean.setLink_type_val(bannerBean.getLink_type_val());
        if (bannerBean.getLink_type() == 1) {
            intentDateBean.setTpl_type(bannerBean.getGame_info_tpl_type());
        } else {
            intentDateBean.setTpl_type(bannerBean.getTpl_type());
        }
        intentDateBean.setCrc_link_type_val(bannerBean.getCrc_link_type_val());
        intentDateBean.setObject(bannerBean.getTitle());
        IntentUtil.getInstance().intentActivity(this.f44063d, intentDateBean);
    }

    @Override // com.join.mgps.customview.CarouselPagerAdapter2
    public int b() {
        List<BannerBean> list = this.f44062c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // com.join.mgps.customview.CarouselPagerAdapter2
    public Object c(ViewGroup viewGroup, int i4) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detial_viewpager_layout, (ViewGroup) null);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) inflate.findViewById(R.id.adImage);
        simpleDraweeView.setOnClickListener(new a(i4));
        String pic_remote = this.f44062c.get(i4).getPic_remote();
        Context context = this.f44063d;
        MyImageLoader.f(simpleDraweeView, R.drawable.banner_normal_icon, pic_remote, MyImageLoader.E(context, context.getResources().getDimensionPixelOffset(R.dimen.wdp16)));
        viewGroup.addView(inflate, -1, -1);
        return inflate;
    }

    public void f(List<BannerBean> list) {
        this.f44062c = list;
    }
}
