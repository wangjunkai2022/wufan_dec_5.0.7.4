package com.join.kotlin.ui.findgame.data;

import com.join.mgps.dto.CommonGameInfoBean;
import java.util.List;
/* loaded from: classes3.dex */
public class FindClassifyResultData {
    List<FindChoiceBannerData> banner;
    List<CommonGameInfoBean> collection_list;
    List<GameTypeData> game_type;
    List<TagData> guess_you_like;

    public FindClassifyResultData() {
    }

    public List<FindChoiceBannerData> getBanner() {
        return this.banner;
    }

    public List<CommonGameInfoBean> getCollection_list() {
        return this.collection_list;
    }

    public List<GameTypeData> getGame_type() {
        return this.game_type;
    }

    public List<TagData> getGuess_you_like() {
        return this.guess_you_like;
    }

    public void setBanner(List<FindChoiceBannerData> list) {
        this.banner = list;
    }

    public void setCollection_list(List<CommonGameInfoBean> list) {
        this.collection_list = list;
    }

    public void setGame_type(List<GameTypeData> list) {
        this.game_type = list;
    }

    public void setGuess_you_like(List<TagData> list) {
        this.guess_you_like = list;
    }

    public FindClassifyResultData(List<FindChoiceBannerData> list, List<CommonGameInfoBean> list2, List<TagData> list3, List<GameTypeData> list4) {
        this.banner = list;
        this.collection_list = list2;
        this.guess_you_like = list3;
        this.game_type = list4;
    }
}
