package com.join.kotlin.ui.modleregin;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.DatabGamelistLayoutBinding;
import com.join.kotlin.ui.modleregin.adapter.GamelistAdapter;
import com.join.kotlin.ui.modleregin.modle.BtOnlineGame;
import com.join.kotlin.ui.modleregin.viewModle.BtReginModle;
import com.join.kotlin.ui.modleregin.viewModle.GameListViewModle;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameListFragment.kt */
/* loaded from: classes3.dex */
public final class GameListFragment extends Fragment {
    @NotNull
    private final Lazy adapter$delegate;
    public DatabGamelistLayoutBinding dataBinding;
    @NotNull
    private final Lazy viewModelMain$delegate;
    @NotNull
    private final Lazy viewModle$delegate;

    public GameListFragment() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<GameListViewModle>() { // from class: com.join.kotlin.ui.modleregin.GameListFragment$viewModle$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GameListViewModle invoke() {
                return (GameListViewModle) new ViewModelProvider(GameListFragment.this, new ViewModelProvider.NewInstanceFactory()).get(GameListViewModle.class);
            }
        });
        this.viewModle$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new Function0<BtReginModle>() { // from class: com.join.kotlin.ui.modleregin.GameListFragment$viewModelMain$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BtReginModle invoke() {
                FragmentActivity activity = GameListFragment.this.getActivity();
                Intrinsics.checkNotNull(activity);
                return (BtReginModle) new ViewModelProvider(activity, new ViewModelProvider.NewInstanceFactory()).get(BtReginModle.class);
            }
        });
        this.viewModelMain$delegate = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new Function0<GamelistAdapter>() { // from class: com.join.kotlin.ui.modleregin.GameListFragment$adapter$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GamelistAdapter invoke() {
                Context context = GameListFragment.this.getContext();
                Intrinsics.checkNotNull(context);
                return new GamelistAdapter(context);
            }
        });
        this.adapter$delegate = lazy3;
    }

    @NotNull
    public final GamelistAdapter getAdapter() {
        return (GamelistAdapter) this.adapter$delegate.getValue();
    }

    @NotNull
    public final DatabGamelistLayoutBinding getDataBinding() {
        DatabGamelistLayoutBinding databGamelistLayoutBinding = this.dataBinding;
        if (databGamelistLayoutBinding != null) {
            return databGamelistLayoutBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dataBinding");
        return null;
    }

    @NotNull
    public final BtReginModle getViewModelMain() {
        return (BtReginModle) this.viewModelMain$delegate.getValue();
    }

    @NotNull
    public final GameListViewModle getViewModle() {
        return (GameListViewModle) this.viewModle$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ViewDataBinding inflate = DataBindingUtil.inflate(inflater, R.layout.datab_gamelist_layout, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            inf…          false\n        )");
        setDataBinding((DatabGamelistLayoutBinding) inflate);
        Bundle arguments = getArguments();
        Intrinsics.checkNotNull(arguments);
        long j4 = arguments.getLong("time");
        List<BtOnlineGame> listBtOnlineGame = getViewModelMain().getListBtOnlineGame();
        if (!(listBtOnlineGame == null || listBtOnlineGame.isEmpty())) {
            getViewModle().showGameList(getViewModelMain().getListBtOnlineGame(), j4);
            getAdapter().notifyDataSetChanged();
        }
        getDataBinding().f18314b.setLoadingMoreEnabled(false);
        getDataBinding().setVariable(34, getViewModle());
        getDataBinding().setVariable(1, getAdapter());
        return getDataBinding().getRoot();
    }

    public final void setDataBinding(@NotNull DatabGamelistLayoutBinding databGamelistLayoutBinding) {
        Intrinsics.checkNotNullParameter(databGamelistLayoutBinding, "<set-?>");
        this.dataBinding = databGamelistLayoutBinding;
    }
}
