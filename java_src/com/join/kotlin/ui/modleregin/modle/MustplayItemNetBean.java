package com.join.kotlin.ui.modleregin.modle;

import com.join.mgps.dto.CollectionBeanSub;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: MustplayItemNetBean.kt */
/* loaded from: classes3.dex */
public final class MustplayItemNetBean {
    @NotNull
    private final String gameId;
    @NotNull
    private final String gameImg;
    @NotNull
    private final CollectionBeanSub gameInfo;
    @NotNull
    private final String gameName;
    @NotNull
    private final String gameTags;
    @NotNull
    private final String gameTitle;
    @NotNull
    private final String gameVideo;
    @NotNull
    private final String mainTitle;

    public MustplayItemNetBean(@NotNull String gameId, @NotNull String gameImg, @NotNull String gameName, @NotNull String gameTags, @NotNull String gameTitle, @NotNull String mainTitle, @NotNull String gameVideo, @NotNull CollectionBeanSub gameInfo) {
        Intrinsics.checkNotNullParameter(gameId, "gameId");
        Intrinsics.checkNotNullParameter(gameImg, "gameImg");
        Intrinsics.checkNotNullParameter(gameName, "gameName");
        Intrinsics.checkNotNullParameter(gameTags, "gameTags");
        Intrinsics.checkNotNullParameter(gameTitle, "gameTitle");
        Intrinsics.checkNotNullParameter(mainTitle, "mainTitle");
        Intrinsics.checkNotNullParameter(gameVideo, "gameVideo");
        Intrinsics.checkNotNullParameter(gameInfo, "gameInfo");
        this.gameId = gameId;
        this.gameImg = gameImg;
        this.gameName = gameName;
        this.gameTags = gameTags;
        this.gameTitle = gameTitle;
        this.mainTitle = mainTitle;
        this.gameVideo = gameVideo;
        this.gameInfo = gameInfo;
    }

    @NotNull
    public final String component1() {
        return this.gameId;
    }

    @NotNull
    public final String component2() {
        return this.gameImg;
    }

    @NotNull
    public final String component3() {
        return this.gameName;
    }

    @NotNull
    public final String component4() {
        return this.gameTags;
    }

    @NotNull
    public final String component5() {
        return this.gameTitle;
    }

    @NotNull
    public final String component6() {
        return this.mainTitle;
    }

    @NotNull
    public final String component7() {
        return this.gameVideo;
    }

    @NotNull
    public final CollectionBeanSub component8() {
        return this.gameInfo;
    }

    @NotNull
    public final MustplayItemNetBean copy(@NotNull String gameId, @NotNull String gameImg, @NotNull String gameName, @NotNull String gameTags, @NotNull String gameTitle, @NotNull String mainTitle, @NotNull String gameVideo, @NotNull CollectionBeanSub gameInfo) {
        Intrinsics.checkNotNullParameter(gameId, "gameId");
        Intrinsics.checkNotNullParameter(gameImg, "gameImg");
        Intrinsics.checkNotNullParameter(gameName, "gameName");
        Intrinsics.checkNotNullParameter(gameTags, "gameTags");
        Intrinsics.checkNotNullParameter(gameTitle, "gameTitle");
        Intrinsics.checkNotNullParameter(mainTitle, "mainTitle");
        Intrinsics.checkNotNullParameter(gameVideo, "gameVideo");
        Intrinsics.checkNotNullParameter(gameInfo, "gameInfo");
        return new MustplayItemNetBean(gameId, gameImg, gameName, gameTags, gameTitle, mainTitle, gameVideo, gameInfo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MustplayItemNetBean) {
            MustplayItemNetBean mustplayItemNetBean = (MustplayItemNetBean) obj;
            return Intrinsics.areEqual(this.gameId, mustplayItemNetBean.gameId) && Intrinsics.areEqual(this.gameImg, mustplayItemNetBean.gameImg) && Intrinsics.areEqual(this.gameName, mustplayItemNetBean.gameName) && Intrinsics.areEqual(this.gameTags, mustplayItemNetBean.gameTags) && Intrinsics.areEqual(this.gameTitle, mustplayItemNetBean.gameTitle) && Intrinsics.areEqual(this.mainTitle, mustplayItemNetBean.mainTitle) && Intrinsics.areEqual(this.gameVideo, mustplayItemNetBean.gameVideo) && Intrinsics.areEqual(this.gameInfo, mustplayItemNetBean.gameInfo);
        }
        return false;
    }

    @NotNull
    public final String getGameId() {
        return this.gameId;
    }

    @NotNull
    public final String getGameImg() {
        return this.gameImg;
    }

    @NotNull
    public final CollectionBeanSub getGameInfo() {
        return this.gameInfo;
    }

    @NotNull
    public final String getGameName() {
        return this.gameName;
    }

    @NotNull
    public final String getGameTags() {
        return this.gameTags;
    }

    @NotNull
    public final String getGameTitle() {
        return this.gameTitle;
    }

    @NotNull
    public final String getGameVideo() {
        return this.gameVideo;
    }

    @NotNull
    public final String getMainTitle() {
        return this.mainTitle;
    }

    public int hashCode() {
        return (((((((((((((this.gameId.hashCode() * 31) + this.gameImg.hashCode()) * 31) + this.gameName.hashCode()) * 31) + this.gameTags.hashCode()) * 31) + this.gameTitle.hashCode()) * 31) + this.mainTitle.hashCode()) * 31) + this.gameVideo.hashCode()) * 31) + this.gameInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "MustplayItemNetBean(gameId=" + this.gameId + ", gameImg=" + this.gameImg + ", gameName=" + this.gameName + ", gameTags=" + this.gameTags + ", gameTitle=" + this.gameTitle + ", mainTitle=" + this.mainTitle + ", gameVideo=" + this.gameVideo + ", gameInfo=" + this.gameInfo + ')';
    }
}
