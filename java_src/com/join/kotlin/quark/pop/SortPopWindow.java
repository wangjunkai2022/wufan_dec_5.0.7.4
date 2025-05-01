package com.join.kotlin.quark.pop;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.quark.pop.SortPopWindow;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SortPopWindow.kt */
/* loaded from: classes3.dex */
public final class SortPopWindow extends PopupWindow {
    public Button btnAll;
    public Button btnSxz;
    public Button btnYsx;
    @Nullable
    private String currentOrder;
    @NotNull
    private Context mContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SortPopWindow(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mContext = context;
        init();
    }

    private final void setupAttrs() {
        setBackgroundDrawable(new BitmapDrawable());
        setFocusable(true);
        setTouchable(true);
        setOutsideTouchable(true);
        setTouchInterceptor(new View.OnTouchListener() { // from class: r1.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean z4;
                z4 = SortPopWindow.setupAttrs$lambda$0(SortPopWindow.this, view, motionEvent);
                return z4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupAttrs$lambda$0(SortPopWindow this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (motionEvent.getAction() == 4) {
            this$0.dismiss();
            return true;
        }
        return false;
    }

    @NotNull
    public final Button getBtnAll() {
        Button button = this.btnAll;
        if (button != null) {
            return button;
        }
        Intrinsics.throwUninitializedPropertyAccessException("btnAll");
        return null;
    }

    @NotNull
    public final Button getBtnSxz() {
        Button button = this.btnSxz;
        if (button != null) {
            return button;
        }
        Intrinsics.throwUninitializedPropertyAccessException("btnSxz");
        return null;
    }

    @NotNull
    public final Button getBtnYsx() {
        Button button = this.btnYsx;
        if (button != null) {
            return button;
        }
        Intrinsics.throwUninitializedPropertyAccessException("btnYsx");
        return null;
    }

    @Nullable
    public final String getCurrentOrder() {
        return this.currentOrder;
    }

    public final void init() {
        View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.pop_wish_list_sort, (ViewGroup) null);
        setContentView(inflate);
        setWidth(-2);
        setHeight(-2);
        setupAttrs();
        View findViewById = inflate.findViewById(R.id.btn_sxz);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.btn_sxz)");
        setBtnSxz((Button) findViewById);
        View findViewById2 = inflate.findViewById(R.id.btn_ysx);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.btn_ysx)");
        setBtnYsx((Button) findViewById2);
        View findViewById3 = inflate.findViewById(R.id.btn_all);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.btn_all)");
        setBtnAll((Button) findViewById3);
    }

    public final void setBtnAll(@NotNull Button button) {
        Intrinsics.checkNotNullParameter(button, "<set-?>");
        this.btnAll = button;
    }

    public final void setBtnSxz(@NotNull Button button) {
        Intrinsics.checkNotNullParameter(button, "<set-?>");
        this.btnSxz = button;
    }

    public final void setBtnYsx(@NotNull Button button) {
        Intrinsics.checkNotNullParameter(button, "<set-?>");
        this.btnYsx = button;
    }

    public final void setCurrentOrder(@Nullable String str) {
        this.currentOrder = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SortPopWindow(@NotNull Context mContext, int i4, int i5) {
        super(i4, i5);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        init();
    }
}
