package q.rorbin.badgeview;

import android.content.Context;
/* compiled from: DisplayUtil.java */
/* loaded from: classes7.dex */
public class d {
    public static int a(Context context, float f5) {
        return (int) ((f5 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int b(Context context, float f5) {
        return (int) ((f5 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
