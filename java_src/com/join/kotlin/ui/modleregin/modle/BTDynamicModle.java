package com.join.kotlin.ui.modleregin.modle;

import com.join.mgps.dto.CollectionBeanSub;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BTDynamicModle.kt */
/* loaded from: classes3.dex */
public final class BTDynamicModle {
    @Nullable
    private final String collectionId;
    @Nullable
    private final String collectionTplId;
    @Nullable
    private final CollectionBeanSub gameEntity;
    @Nullable
    private final List<CollectionBeanSub> gameEntityList;
    @Nullable
    private final Integer modelType;
    @Nullable
    private final Integer sort;

    /* JADX WARN: Multi-variable type inference failed */
    public BTDynamicModle(@Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable String str2, @Nullable List<? extends CollectionBeanSub> list, @Nullable CollectionBeanSub collectionBeanSub) {
        this.modelType = num;
        this.sort = num2;
        this.collectionId = str;
        this.collectionTplId = str2;
        this.gameEntityList = list;
        this.gameEntity = collectionBeanSub;
    }

    public static /* synthetic */ BTDynamicModle copy$default(BTDynamicModle bTDynamicModle, Integer num, Integer num2, String str, String str2, List list, CollectionBeanSub collectionBeanSub, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            num = bTDynamicModle.modelType;
        }
        if ((i4 & 2) != 0) {
            num2 = bTDynamicModle.sort;
        }
        Integer num3 = num2;
        if ((i4 & 4) != 0) {
            str = bTDynamicModle.collectionId;
        }
        String str3 = str;
        if ((i4 & 8) != 0) {
            str2 = bTDynamicModle.collectionTplId;
        }
        String str4 = str2;
        List<CollectionBeanSub> list2 = list;
        if ((i4 & 16) != 0) {
            list2 = bTDynamicModle.gameEntityList;
        }
        List list3 = list2;
        if ((i4 & 32) != 0) {
            collectionBeanSub = bTDynamicModle.gameEntity;
        }
        return bTDynamicModle.copy(num, num3, str3, str4, list3, collectionBeanSub);
    }

    @Nullable
    public final Integer component1() {
        return this.modelType;
    }

    @Nullable
    public final Integer component2() {
        return this.sort;
    }

    @Nullable
    public final String component3() {
        return this.collectionId;
    }

    @Nullable
    public final String component4() {
        return this.collectionTplId;
    }

    @Nullable
    public final List<CollectionBeanSub> component5() {
        return this.gameEntityList;
    }

    @Nullable
    public final CollectionBeanSub component6() {
        return this.gameEntity;
    }

    @NotNull
    public final BTDynamicModle copy(@Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable String str2, @Nullable List<? extends CollectionBeanSub> list, @Nullable CollectionBeanSub collectionBeanSub) {
        return new BTDynamicModle(num, num2, str, str2, list, collectionBeanSub);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BTDynamicModle) {
            BTDynamicModle bTDynamicModle = (BTDynamicModle) obj;
            return Intrinsics.areEqual(this.modelType, bTDynamicModle.modelType) && Intrinsics.areEqual(this.sort, bTDynamicModle.sort) && Intrinsics.areEqual(this.collectionId, bTDynamicModle.collectionId) && Intrinsics.areEqual(this.collectionTplId, bTDynamicModle.collectionTplId) && Intrinsics.areEqual(this.gameEntityList, bTDynamicModle.gameEntityList) && Intrinsics.areEqual(this.gameEntity, bTDynamicModle.gameEntity);
        }
        return false;
    }

    @Nullable
    public final String getCollectionId() {
        return this.collectionId;
    }

    @Nullable
    public final String getCollectionTplId() {
        return this.collectionTplId;
    }

    @Nullable
    public final CollectionBeanSub getGameEntity() {
        return this.gameEntity;
    }

    @Nullable
    public final List<CollectionBeanSub> getGameEntityList() {
        return this.gameEntityList;
    }

    @Nullable
    public final Integer getModelType() {
        return this.modelType;
    }

    @Nullable
    public final Integer getSort() {
        return this.sort;
    }

    public int hashCode() {
        Integer num = this.modelType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.sort;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.collectionId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.collectionTplId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<CollectionBeanSub> list = this.gameEntityList;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        CollectionBeanSub collectionBeanSub = this.gameEntity;
        return hashCode5 + (collectionBeanSub != null ? collectionBeanSub.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BTDynamicModle(modelType=" + this.modelType + ", sort=" + this.sort + ", collectionId=" + this.collectionId + ", collectionTplId=" + this.collectionTplId + ", gameEntityList=" + this.gameEntityList + ", gameEntity=" + this.gameEntity + ')';
    }
}
