package com.join.kotlin.base.ext;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.base.net.stateCallback.ListDataUiState;
import com.join.kotlin.base.widget.loadCallBack.EmptyCallback;
import com.join.kotlin.base.widget.loadCallBack.ErrorCallback;
import com.join.kotlin.base.widget.loadCallBack.LoadingCallback;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.kingja.loadsir.core.c;
import com.kingja.loadsir.core.d;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CustomViewExt.kt */
/* loaded from: classes3.dex */
public final class CustomViewExtKt {
    @NotNull
    public static final XQuickRecyclerView init(@NotNull XQuickRecyclerView xQuickRecyclerView, @NotNull RecyclerView.LayoutManager layoutManger, @NotNull RecyclerView.Adapter<?> bindAdapter, boolean z4) {
        Intrinsics.checkNotNullParameter(xQuickRecyclerView, "<this>");
        Intrinsics.checkNotNullParameter(layoutManger, "layoutManger");
        Intrinsics.checkNotNullParameter(bindAdapter, "bindAdapter");
        xQuickRecyclerView.setLayoutManager(layoutManger);
        xQuickRecyclerView.setHasFixedSize(true);
        xQuickRecyclerView.setAdapter(bindAdapter);
        xQuickRecyclerView.setNestedScrollingEnabled(z4);
        return xQuickRecyclerView;
    }

    public static /* synthetic */ XQuickRecyclerView init$default(XQuickRecyclerView xQuickRecyclerView, RecyclerView.LayoutManager layoutManager, RecyclerView.Adapter adapter, boolean z4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        return init(xQuickRecyclerView, layoutManager, adapter, z4);
    }

    public static final <T> void loadListData(@NotNull ListDataUiState<T> data, @NotNull BaseQuickAdapter<T, ?> baseQuickAdapter, @NotNull com.kingja.loadsir.core.b<?> loadService, @NotNull XQuickRecyclerView recyclerView, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "baseQuickAdapter");
        Intrinsics.checkNotNullParameter(loadService, "loadService");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        recyclerView.loadMoreComplete();
        if (data.isSuccess()) {
            if (data.isFirstEmpty()) {
                if (function0 != null) {
                    function0.invoke();
                } else {
                    showEmpty(loadService);
                }
                recyclerView.refreshComplete();
            } else if (data.isRefresh()) {
                baseQuickAdapter.submitList(data.getListData());
                recyclerView.refreshComplete();
                loadService.h();
                if (data.getListData().isEmpty() || !data.getHasMore()) {
                    recyclerView.setNoMore();
                }
            } else {
                baseQuickAdapter.addAll(data.getListData());
                loadService.h();
                if (data.getListData().isEmpty()) {
                    recyclerView.setNoMore();
                }
            }
        } else if (data.isRefresh()) {
            showError(loadService, data.getErrMessage());
        }
    }

    public static /* synthetic */ void loadListData$default(ListDataUiState listDataUiState, BaseQuickAdapter baseQuickAdapter, com.kingja.loadsir.core.b bVar, XQuickRecyclerView xQuickRecyclerView, Function0 function0, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            function0 = null;
        }
        loadListData(listDataUiState, baseQuickAdapter, bVar, xQuickRecyclerView, function0);
    }

    @NotNull
    public static final com.kingja.loadsir.core.b<Object> loadServiceInit(@NotNull View view, @NotNull Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(callback, "callback");
        com.kingja.loadsir.core.b<Object> loadsir = c.c().e(view, new a(callback));
        loadsir.h();
        Intrinsics.checkNotNullExpressionValue(loadsir, "loadsir");
        return loadsir;
    }

    public static final void loadServiceInit$lambda$0(Function0 callback, View view) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke();
    }

    public static final void setErrorText(@NotNull com.kingja.loadsir.core.b<?> bVar, @NotNull final String message) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        if (message.length() > 0) {
            bVar.f(ErrorCallback.class, new d() { // from class: com.join.kotlin.base.ext.b
                @Override // com.kingja.loadsir.core.d
                public final void a(Context context, View view) {
                    CustomViewExtKt.setErrorText$lambda$1(message, context, view);
                }
            });
        }
    }

    public static final void setErrorText$lambda$1(String message, Context context, View view) {
        Intrinsics.checkNotNullParameter(message, "$message");
        ((TextView) view.findViewById(R.id.failedMessage)).setText(message);
    }

    public static final void showEmpty(@NotNull com.kingja.loadsir.core.b<?> bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        bVar.g(EmptyCallback.class);
    }

    public static final void showError(@NotNull com.kingja.loadsir.core.b<?> bVar, @NotNull String message) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        setErrorText(bVar, message);
        bVar.g(ErrorCallback.class);
    }

    public static /* synthetic */ void showError$default(com.kingja.loadsir.core.b bVar, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = "";
        }
        showError(bVar, str);
    }

    public static final void showLoading(@NotNull com.kingja.loadsir.core.b<?> bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        bVar.g(LoadingCallback.class);
    }

    public static /* synthetic */ ViewPager2 init$default(ViewPager2 viewPager2, Fragment fragment, ArrayList arrayList, boolean z4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        return init(viewPager2, fragment, arrayList, z4);
    }

    @NotNull
    public static final ViewPager2 init(@NotNull ViewPager2 viewPager2, @NotNull Fragment fragment, @NotNull final ArrayList<Fragment> fragments, boolean z4) {
        Intrinsics.checkNotNullParameter(viewPager2, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(fragments, "fragments");
        viewPager2.setUserInputEnabled(z4);
        viewPager2.setAdapter(new FragmentStateAdapter(fragment) { // from class: com.join.kotlin.base.ext.CustomViewExtKt$init$1
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter
            @NotNull
            public Fragment createFragment(int i4) {
                Fragment fragment2 = fragments.get(i4);
                Intrinsics.checkNotNullExpressionValue(fragment2, "fragments[position]");
                return fragment2;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemCount() {
                return fragments.size();
            }
        });
        return viewPager2;
    }
}
