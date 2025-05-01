package k2;

import android.view.View;
import android.view.ViewGroup;
import com.kingja.loadsir.callback.Callback;
import com.kingja.loadsir.callback.SuccessCallback;
import com.kingja.loadsir.core.LoadLayout;
/* compiled from: ViewTarget.java */
/* loaded from: classes5.dex */
public class c implements b {
    @Override // k2.b
    public LoadLayout a(Object obj, Callback.OnReloadListener onReloadListener) {
        View view = (View) obj;
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int i4 = 0;
        int childCount = viewGroup == null ? 0 : viewGroup.getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            } else if (viewGroup.getChildAt(i5) == view) {
                i4 = i5;
                break;
            } else {
                i5++;
            }
        }
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LoadLayout loadLayout = new LoadLayout(view.getContext(), onReloadListener);
        loadLayout.setupSuccessLayout(new SuccessCallback(view, view.getContext(), onReloadListener));
        if (viewGroup != null) {
            viewGroup.addView(loadLayout, i4, layoutParams);
        }
        return loadLayout;
    }

    @Override // k2.b
    public boolean equals(Object obj) {
        return obj instanceof View;
    }
}
