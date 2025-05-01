package com.join.kotlin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;
import com.BaseAppCompatActivity;
import com.join.android.app.mgsim.wufun.databinding.EverdayNewActivityBinding;
import com.join.mgps.activity.LocalGameActivity;
import com.join.mgps.customview.NavigationAdapter;
import com.psk.kotlin.ext.CommonExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: EverdayNewGameActivity.kt */
/* loaded from: classes3.dex */
public final class EverdayNewGameActivity extends BaseAppCompatActivity {
    public NavigationAdapter adapter;
    public EverdayNewActivityBinding binding;

    @NotNull
    public final NavigationAdapter getAdapter() {
        NavigationAdapter navigationAdapter = this.adapter;
        if (navigationAdapter != null) {
            return navigationAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    @NotNull
    public final EverdayNewActivityBinding getBinding() {
        EverdayNewActivityBinding everdayNewActivityBinding = this.binding;
        if (everdayNewActivityBinding != null) {
            return everdayNewActivityBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        ArrayList arrayListOf;
        super.onCreate(bundle);
        EverdayNewActivityBinding inflate = EverdayNewActivityBinding.inflate(LayoutInflater.from(this));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.from(this))");
        setContentView(inflate.getRoot());
        arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(LocalGameActivity.f34225s, "网游", "单机", "模拟器");
        ArrayList arrayList = new ArrayList();
        Iterator it2 = arrayListOf.iterator();
        while (it2.hasNext()) {
            EverdayNewFragment everdayNewFragment = new EverdayNewFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putString("title", (String) it2.next());
            everdayNewFragment.setArguments(bundle2);
            arrayList.add(everdayNewFragment);
        }
        setAdapter(new NavigationAdapter(getSupportFragmentManager(), arrayList, arrayListOf));
        inflate.f19326e.setAdapter(getAdapter());
        getAdapter().notifyDataSetChanged();
        inflate.f19324c.setViewPager(inflate.f19326e);
        ImageView imageView = inflate.f19325d.f26783c;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.titleLayout.backImage");
        CommonExtKt.onClick(imageView, new Function0<Unit>() { // from class: com.join.kotlin.EverdayNewGameActivity$onCreate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                EverdayNewGameActivity.this.finish();
            }
        });
        inflate.f19325d.f26785e.setText("每日上新");
        inflate.f19326e.setOffscreenPageLimit(5);
        inflate.f19326e.setCurrentItem(getIntent().getIntExtra("default_position", 0));
    }

    public final void setAdapter(@NotNull NavigationAdapter navigationAdapter) {
        Intrinsics.checkNotNullParameter(navigationAdapter, "<set-?>");
        this.adapter = navigationAdapter;
    }

    public final void setBinding(@NotNull EverdayNewActivityBinding everdayNewActivityBinding) {
        Intrinsics.checkNotNullParameter(everdayNewActivityBinding, "<set-?>");
        this.binding = everdayNewActivityBinding;
    }
}
