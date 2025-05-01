package o0;

import android.graphics.drawable.Animatable;
import android.view.MotionEvent;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;
/* compiled from: DraweeController.java */
@ThreadSafe
/* loaded from: classes.dex */
public interface a {
    void a(@Nullable b bVar);

    boolean b(a aVar);

    void c();

    void d(String str);

    @Nullable
    b e();

    Animatable f();

    void g(boolean z4);

    String getContentDescription();

    void onDetach();

    boolean onTouchEvent(MotionEvent motionEvent);
}
