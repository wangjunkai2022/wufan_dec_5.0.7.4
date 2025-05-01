package com.join.mgps.Util;

import android.os.Handler;
import android.os.Message;
import androidx.fragment.app.Fragment;
import com.join.mgps.customview.LoopViewPager;
import java.lang.ref.WeakReference;
/* loaded from: classes3.dex */
public class ImageHandler extends Handler {

    /* renamed from: c  reason: collision with root package name */
    public static final int f27412c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f27413d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final int f27414e = 3;

    /* renamed from: f  reason: collision with root package name */
    public static final int f27415f = 4;

    /* renamed from: g  reason: collision with root package name */
    public static final long f27416g = 5000;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<AdFragment> f27417a;

    /* renamed from: b  reason: collision with root package name */
    private int f27418b = 0;

    /* loaded from: classes3.dex */
    public static class AdFragment extends Fragment {

        /* renamed from: b  reason: collision with root package name */
        protected ImageHandler f27419b;

        /* renamed from: c  reason: collision with root package name */
        protected LoopViewPager f27420c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImageHandler(WeakReference<? extends AdFragment> weakReference) {
        this.f27417a = weakReference;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        AdFragment adFragment = this.f27417a.get();
        if (adFragment == null) {
            return;
        }
        if (adFragment.f27419b.hasMessages(1)) {
            adFragment.f27419b.removeMessages(1);
        }
        int i4 = message.what;
        if (i4 == 1) {
            LoopViewPager loopViewPager = adFragment.f27420c;
            if (loopViewPager != null && loopViewPager.getAdapter() != null) {
                adFragment.f27420c.setCurrentItem(adFragment.f27420c.getCurrentItem() + 1);
            }
            adFragment.f27419b.sendEmptyMessageDelayed(1, 5000L);
        } else if (i4 == 3) {
            adFragment.f27419b.sendEmptyMessageDelayed(1, 5000L);
        } else if (i4 != 4) {
        } else {
            this.f27418b = message.arg1;
            adFragment.f27419b.sendEmptyMessageDelayed(1, 5000L);
        }
    }
}
