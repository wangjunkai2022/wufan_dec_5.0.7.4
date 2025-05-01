package w;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: OnItemSwipeListener.kt */
/* loaded from: classes2.dex */
public interface c {
    void a(@Nullable RecyclerView.ViewHolder viewHolder, int i4);

    void b(@Nullable RecyclerView.ViewHolder viewHolder, int i4, int i5);

    void c(@Nullable RecyclerView.ViewHolder viewHolder, int i4);

    void d(@NotNull Canvas canvas, @Nullable RecyclerView.ViewHolder viewHolder, float f5, float f6, boolean z4);
}
