package com.chad.library.adapter.base.dragswipe;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.c;
/* compiled from: DragSwipeExt.kt */
/* loaded from: classes2.dex */
public final class DragSwipeExtKt {

    /* compiled from: DragSwipeExt.kt */
    @SourceDebugExtension({"SMAP\nDragSwipeExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragSwipeExt.kt\ncom/chad/library/adapter/base/dragswipe/DragSwipeExtKt$setItemDragListener$4$listener$1\n*L\n1#1,94:1\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a implements w.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function2<RecyclerView.ViewHolder, Integer, Unit> f9023a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function4<RecyclerView.ViewHolder, Integer, RecyclerView.ViewHolder, Integer, Unit> f9024b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2<RecyclerView.ViewHolder, Integer, Unit> f9025c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super RecyclerView.ViewHolder, ? super Integer, Unit> function2, Function4<? super RecyclerView.ViewHolder, ? super Integer, ? super RecyclerView.ViewHolder, ? super Integer, Unit> function4, Function2<? super RecyclerView.ViewHolder, ? super Integer, Unit> function22) {
            this.f9023a = function2;
            this.f9024b = function4;
            this.f9025c = function22;
        }

        @Override // w.b
        public void a(@Nullable RecyclerView.ViewHolder viewHolder, int i4) {
            this.f9025c.invoke(viewHolder, Integer.valueOf(i4));
        }

        @Override // w.b
        public void b(@Nullable RecyclerView.ViewHolder viewHolder, int i4, @Nullable RecyclerView.ViewHolder viewHolder2, int i5) {
            this.f9024b.invoke(viewHolder, Integer.valueOf(i4), viewHolder2, Integer.valueOf(i5));
        }

        @Override // w.b
        public void c(@Nullable RecyclerView.ViewHolder viewHolder, int i4) {
            this.f9023a.invoke(viewHolder, Integer.valueOf(i4));
        }
    }

    /* compiled from: DragSwipeExt.kt */
    @SourceDebugExtension({"SMAP\nDragSwipeExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragSwipeExt.kt\ncom/chad/library/adapter/base/dragswipe/DragSwipeExtKt$setItemSwipeListener$5$listener$1\n*L\n1#1,94:1\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function2<RecyclerView.ViewHolder, Integer, Unit> f9026a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2<RecyclerView.ViewHolder, Integer, Unit> f9027b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function3<RecyclerView.ViewHolder, Integer, Integer, Unit> f9028c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Function5<Canvas, RecyclerView.ViewHolder, Float, Float, Boolean, Unit> f9029d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super RecyclerView.ViewHolder, ? super Integer, Unit> function2, Function2<? super RecyclerView.ViewHolder, ? super Integer, Unit> function22, Function3<? super RecyclerView.ViewHolder, ? super Integer, ? super Integer, Unit> function3, Function5<? super Canvas, ? super RecyclerView.ViewHolder, ? super Float, ? super Float, ? super Boolean, Unit> function5) {
            this.f9026a = function2;
            this.f9027b = function22;
            this.f9028c = function3;
            this.f9029d = function5;
        }

        @Override // w.c
        public void a(@Nullable RecyclerView.ViewHolder viewHolder, int i4) {
            this.f9026a.invoke(viewHolder, Integer.valueOf(i4));
        }

        @Override // w.c
        public void b(@Nullable RecyclerView.ViewHolder viewHolder, int i4, int i5) {
            this.f9028c.invoke(viewHolder, Integer.valueOf(i4), Integer.valueOf(i5));
        }

        @Override // w.c
        public void c(@Nullable RecyclerView.ViewHolder viewHolder, int i4) {
            this.f9027b.invoke(viewHolder, Integer.valueOf(i4));
        }

        @Override // w.c
        public void d(@NotNull Canvas canvas, @Nullable RecyclerView.ViewHolder viewHolder, float f5, float f6, boolean z4) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            this.f9029d.invoke(canvas, viewHolder, Float.valueOf(f5), Float.valueOf(f6), Boolean.valueOf(z4));
        }
    }

    @NotNull
    public static final QuickDragAndSwipe a(@NotNull QuickDragAndSwipe quickDragAndSwipe, @NotNull Function2<? super RecyclerView.ViewHolder, ? super Integer, Unit> onItemDragStart, @NotNull Function4<? super RecyclerView.ViewHolder, ? super Integer, ? super RecyclerView.ViewHolder, ? super Integer, Unit> onItemDragMoving, @NotNull Function2<? super RecyclerView.ViewHolder, ? super Integer, Unit> onItemDragEnd) {
        Intrinsics.checkNotNullParameter(quickDragAndSwipe, "<this>");
        Intrinsics.checkNotNullParameter(onItemDragStart, "onItemDragStart");
        Intrinsics.checkNotNullParameter(onItemDragMoving, "onItemDragMoving");
        Intrinsics.checkNotNullParameter(onItemDragEnd, "onItemDragEnd");
        quickDragAndSwipe.k(new a(onItemDragStart, onItemDragMoving, onItemDragEnd));
        return quickDragAndSwipe;
    }

    public static /* synthetic */ QuickDragAndSwipe b(QuickDragAndSwipe quickDragAndSwipe, Function2 onItemDragStart, Function4 onItemDragMoving, Function2 onItemDragEnd, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            onItemDragStart = new Function2<RecyclerView.ViewHolder, Integer, Unit>() { // from class: com.chad.library.adapter.base.dragswipe.DragSwipeExtKt$setItemDragListener$1
                public final void a(@Nullable RecyclerView.ViewHolder viewHolder, int i5) {
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(RecyclerView.ViewHolder viewHolder, Integer num) {
                    a(viewHolder, num.intValue());
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i4 & 2) != 0) {
            onItemDragMoving = new Function4<RecyclerView.ViewHolder, Integer, RecyclerView.ViewHolder, Integer, Unit>() { // from class: com.chad.library.adapter.base.dragswipe.DragSwipeExtKt$setItemDragListener$2
                public final void a(@Nullable RecyclerView.ViewHolder viewHolder, int i5, @Nullable RecyclerView.ViewHolder viewHolder2, int i6) {
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(RecyclerView.ViewHolder viewHolder, Integer num, RecyclerView.ViewHolder viewHolder2, Integer num2) {
                    a(viewHolder, num.intValue(), viewHolder2, num2.intValue());
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i4 & 4) != 0) {
            onItemDragEnd = new Function2<RecyclerView.ViewHolder, Integer, Unit>() { // from class: com.chad.library.adapter.base.dragswipe.DragSwipeExtKt$setItemDragListener$3
                public final void a(@Nullable RecyclerView.ViewHolder viewHolder, int i5) {
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(RecyclerView.ViewHolder viewHolder, Integer num) {
                    a(viewHolder, num.intValue());
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(quickDragAndSwipe, "<this>");
        Intrinsics.checkNotNullParameter(onItemDragStart, "onItemDragStart");
        Intrinsics.checkNotNullParameter(onItemDragMoving, "onItemDragMoving");
        Intrinsics.checkNotNullParameter(onItemDragEnd, "onItemDragEnd");
        quickDragAndSwipe.k(new a(onItemDragStart, onItemDragMoving, onItemDragEnd));
        return quickDragAndSwipe;
    }

    @NotNull
    public static final QuickDragAndSwipe c(@NotNull QuickDragAndSwipe quickDragAndSwipe, @NotNull Function2<? super RecyclerView.ViewHolder, ? super Integer, Unit> onItemSwipeStart, @NotNull Function5<? super Canvas, ? super RecyclerView.ViewHolder, ? super Float, ? super Float, ? super Boolean, Unit> onItemSwipeMoving, @NotNull Function3<? super RecyclerView.ViewHolder, ? super Integer, ? super Integer, Unit> onItemSwiped, @NotNull Function2<? super RecyclerView.ViewHolder, ? super Integer, Unit> onItemSwipeEnd) {
        Intrinsics.checkNotNullParameter(quickDragAndSwipe, "<this>");
        Intrinsics.checkNotNullParameter(onItemSwipeStart, "onItemSwipeStart");
        Intrinsics.checkNotNullParameter(onItemSwipeMoving, "onItemSwipeMoving");
        Intrinsics.checkNotNullParameter(onItemSwiped, "onItemSwiped");
        Intrinsics.checkNotNullParameter(onItemSwipeEnd, "onItemSwipeEnd");
        quickDragAndSwipe.l(new b(onItemSwipeStart, onItemSwipeEnd, onItemSwiped, onItemSwipeMoving));
        return quickDragAndSwipe;
    }

    public static /* synthetic */ QuickDragAndSwipe d(QuickDragAndSwipe quickDragAndSwipe, Function2 onItemSwipeStart, Function5 onItemSwipeMoving, Function3 onItemSwiped, Function2 onItemSwipeEnd, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            onItemSwipeStart = new Function2<RecyclerView.ViewHolder, Integer, Unit>() { // from class: com.chad.library.adapter.base.dragswipe.DragSwipeExtKt$setItemSwipeListener$1
                public final void a(@Nullable RecyclerView.ViewHolder viewHolder, int i5) {
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(RecyclerView.ViewHolder viewHolder, Integer num) {
                    a(viewHolder, num.intValue());
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i4 & 2) != 0) {
            onItemSwipeMoving = new Function5<Canvas, RecyclerView.ViewHolder, Float, Float, Boolean, Unit>() { // from class: com.chad.library.adapter.base.dragswipe.DragSwipeExtKt$setItemSwipeListener$2
                public final void a(@NotNull Canvas canvas, @Nullable RecyclerView.ViewHolder viewHolder, float f5, float f6, boolean z4) {
                    Intrinsics.checkNotNullParameter(canvas, "<anonymous parameter 0>");
                }

                @Override // kotlin.jvm.functions.Function5
                public /* bridge */ /* synthetic */ Unit invoke(Canvas canvas, RecyclerView.ViewHolder viewHolder, Float f5, Float f6, Boolean bool) {
                    a(canvas, viewHolder, f5.floatValue(), f6.floatValue(), bool.booleanValue());
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i4 & 4) != 0) {
            onItemSwiped = new Function3<RecyclerView.ViewHolder, Integer, Integer, Unit>() { // from class: com.chad.library.adapter.base.dragswipe.DragSwipeExtKt$setItemSwipeListener$3
                public final void a(@Nullable RecyclerView.ViewHolder viewHolder, int i5, int i6) {
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RecyclerView.ViewHolder viewHolder, Integer num, Integer num2) {
                    a(viewHolder, num.intValue(), num2.intValue());
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i4 & 8) != 0) {
            onItemSwipeEnd = new Function2<RecyclerView.ViewHolder, Integer, Unit>() { // from class: com.chad.library.adapter.base.dragswipe.DragSwipeExtKt$setItemSwipeListener$4
                public final void a(@Nullable RecyclerView.ViewHolder viewHolder, int i5) {
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(RecyclerView.ViewHolder viewHolder, Integer num) {
                    a(viewHolder, num.intValue());
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(quickDragAndSwipe, "<this>");
        Intrinsics.checkNotNullParameter(onItemSwipeStart, "onItemSwipeStart");
        Intrinsics.checkNotNullParameter(onItemSwipeMoving, "onItemSwipeMoving");
        Intrinsics.checkNotNullParameter(onItemSwiped, "onItemSwiped");
        Intrinsics.checkNotNullParameter(onItemSwipeEnd, "onItemSwipeEnd");
        quickDragAndSwipe.l(new b(onItemSwipeStart, onItemSwipeEnd, onItemSwiped, onItemSwipeMoving));
        return quickDragAndSwipe;
    }
}
