package com.join.kotlin.discount.adapter;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.join.kotlin.discount.CommentStatisticDataFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CommentDataViewpagerAdapter.kt */
/* loaded from: classes3.dex */
public final class CommentDataViewpagerAdapter extends FragmentStateAdapter {
    @Nullable
    private String data;
    @Nullable
    private String ext;
    @NotNull
    private ArrayList<String> types;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentDataViewpagerAdapter(@NotNull ArrayList<String> types, @Nullable String str, @NotNull FragmentActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.types = new ArrayList<>();
        this.data = "";
        this.types = types;
        this.data = str;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public boolean containsItem(long j4) {
        return j4 >= 0 && j4 < ((long) this.types.size());
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public Fragment createFragment(int i4) {
        Bundle bundle = new Bundle();
        bundle.putString("type", this.types.get(i4));
        bundle.putString("data", this.data);
        CommentStatisticDataFragment commentStatisticDataFragment = new CommentStatisticDataFragment();
        commentStatisticDataFragment.setArguments(bundle);
        return commentStatisticDataFragment;
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final String getExt() {
        return this.ext;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.types.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @NotNull
    public final ArrayList<String> getTypes() {
        return this.types;
    }

    public final void setData(@Nullable String str) {
        this.data = str;
    }

    public final void setExt(@Nullable String str) {
        this.ext = str;
    }

    public final void setTypes(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.types = arrayList;
    }
}
