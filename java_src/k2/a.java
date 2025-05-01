package k2;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.kingja.loadsir.callback.Callback;
import com.kingja.loadsir.callback.SuccessCallback;
import com.kingja.loadsir.core.LoadLayout;
/* compiled from: ActivityTarget.java */
/* loaded from: classes5.dex */
public class a implements b {
    @Override // k2.b
    public LoadLayout a(Object obj, Callback.OnReloadListener onReloadListener) {
        Activity activity = (Activity) obj;
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        View childAt = viewGroup.getChildAt(0);
        viewGroup.removeView(childAt);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        LoadLayout loadLayout = new LoadLayout(activity, onReloadListener);
        loadLayout.setupSuccessLayout(new SuccessCallback(childAt, activity, onReloadListener));
        viewGroup.addView(loadLayout, 0, layoutParams);
        return loadLayout;
    }

    @Override // k2.b
    public boolean equals(Object obj) {
        return obj instanceof Activity;
    }
}
