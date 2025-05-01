package com.join.mgps.Util;

import android.os.Handler;
import android.os.Message;
import com.BaseActivity;
import com.join.mgps.customview.LoopViewPager;
import java.lang.ref.WeakReference;
/* loaded from: classes3.dex */
public class ImageHandlerDetial extends Handler {

    /* renamed from: c  reason: collision with root package name */
    public static final int f27421c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f27422d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final int f27423e = 3;

    /* renamed from: f  reason: collision with root package name */
    public static final int f27424f = 4;

    /* renamed from: g  reason: collision with root package name */
    public static final long f27425g = 5000;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<AdFragment> f27426a;

    /* renamed from: b  reason: collision with root package name */
    private int f27427b = 0;

    /* loaded from: classes3.dex */
    public static class AdFragment extends BaseActivity {

        /* renamed from: b  reason: collision with root package name */
        protected ImageHandlerDetial f27428b;

        /* renamed from: c  reason: collision with root package name */
        protected LoopViewPager f27429c;

        public LoopViewPager g0() {
            return this.f27429c;
        }

        public void h0(LoopViewPager loopViewPager) {
            this.f27429c = loopViewPager;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImageHandlerDetial(WeakReference<? extends AdFragment> weakReference) {
        this.f27426a = weakReference;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        AdFragment adFragment = this.f27426a.get();
        if (adFragment == null) {
            return;
        }
        if (adFragment.f27428b.hasMessages(1)) {
            adFragment.f27428b.removeMessages(1);
        }
        int i4 = message.what;
        if (i4 == 1) {
            LoopViewPager loopViewPager = adFragment.f27429c;
            if (loopViewPager != null && loopViewPager.getAdapter() != null) {
                adFragment.f27429c.setCurrentItem(adFragment.f27429c.getCurrentItem() + 1);
            }
            adFragment.f27428b.sendEmptyMessageDelayed(1, 5000L);
        } else if (i4 == 3) {
            adFragment.f27428b.sendEmptyMessageDelayed(1, 5000L);
        } else if (i4 != 4) {
        } else {
            this.f27427b = message.arg1;
            adFragment.f27428b.sendEmptyMessageDelayed(1, 5000L);
        }
    }
}
