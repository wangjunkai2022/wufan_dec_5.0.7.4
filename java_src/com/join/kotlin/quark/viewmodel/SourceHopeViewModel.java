package com.join.kotlin.quark.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.join.kotlin.base.viewmodel.BaseViewModel;
import com.join.kotlin.quark.model.bean.SortTypeBean;
import com.join.mgps.activity.LocalGameActivity;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SourceHopeViewModel.kt */
/* loaded from: classes3.dex */
public final class SourceHopeViewModel extends BaseViewModel {
    @Nullable
    private String keyword;
    @NotNull
    private final MutableLiveData<SortTypeBean> sortType;
    @NotNull
    private final ArrayList<SortTypeBean> sortTypeList;
    @NotNull
    private final ArrayList<String> tabItems;
    @NotNull
    private MutableLiveData<String> title = new MutableLiveData<>("资源许愿池");

    public SourceHopeViewModel() {
        ArrayList<String> arrayListOf;
        ArrayList<SortTypeBean> arrayListOf2;
        arrayListOf = CollectionsKt__CollectionsKt.arrayListOf("最热", "最新", "我的");
        this.tabItems = arrayListOf;
        arrayListOf2 = CollectionsKt__CollectionsKt.arrayListOf(new SortTypeBean(-1, LocalGameActivity.f34225s), new SortTypeBean(0, "实现中"), new SortTypeBean(-1, "已实现"));
        this.sortTypeList = arrayListOf2;
        this.sortType = new MutableLiveData<>(arrayListOf2.get(0));
    }

    @Nullable
    public final String getKeyword() {
        return this.keyword;
    }

    @NotNull
    public final MutableLiveData<SortTypeBean> getSortType() {
        return this.sortType;
    }

    @NotNull
    public final ArrayList<String> getTabItems() {
        return this.tabItems;
    }

    @NotNull
    public final MutableLiveData<String> getTitle() {
        return this.title;
    }

    public final void setKeyword(@Nullable String str) {
        this.keyword = str;
    }

    public final void setTitle(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.title = mutableLiveData;
    }
}
