package m.framework.ui.widget.viewpager;

import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes7.dex */
public abstract class ViewPagerAdapter {
    public abstract int getCount();

    public abstract View getView(int i4, ViewGroup viewGroup);

    public void onScreenChange(int i4, int i5) {
    }
}
