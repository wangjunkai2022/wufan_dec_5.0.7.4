.class public Lcom/join/mgps/dto/PapaHomeBeanV9;
.super Ljava/lang/Object;
.source "PapaHomeBeanV9.java"


# instance fields
.field private banner:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;"
        }
    .end annotation
.end field

.field private dynamic_module:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/HomeDynamicListBean;",
            ">;"
        }
    .end annotation
.end field

.field private eo_playing:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;"
        }
    .end annotation
.end field

.field private fast_entry:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;"
        }
    .end annotation
.end field

.field private game_section_id:Ljava/lang/String;

.field private guess_you_like:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;"
        }
    .end annotation
.end field

.field private hot_game_fav:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameFromPopoWinBeanV2$DataBean;",
            ">;"
        }
    .end annotation
.end field

.field private new_online_game:Lcom/join/mgps/dto/HomeDynamicListBean;

.field private ranking_list:Lcom/join/mgps/dto/HomeRankingListBean;

.field private s_scrolling_txt_v2:Lcom/join/mgps/dto/SScrollingTxtDTOV2;

.field private simulator_channel:Lcom/join/mgps/dto/HomeDynamicListBean;

.field private top_channel:Lcom/join/mgps/dto/HomeTopChannelBean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBanner()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->banner:Ljava/util/List;

    return-object v0
.end method

.method public getDynamic_module()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/HomeDynamicListBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->dynamic_module:Ljava/util/List;

    return-object v0
.end method

.method public getEo_playing()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->eo_playing:Ljava/util/List;

    return-object v0
.end method

.method public getFast_entry()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->fast_entry:Ljava/util/List;

    return-object v0
.end method

.method public getGame_section_id()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->game_section_id:Ljava/lang/String;

    return-object v0
.end method

.method public getGuess_you_like()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->guess_you_like:Ljava/util/List;

    return-object v0
.end method

.method public getHot_game_fav()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameFromPopoWinBeanV2$DataBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->hot_game_fav:Ljava/util/List;

    return-object v0
.end method

.method public getNew_online_game()Lcom/join/mgps/dto/HomeDynamicListBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->new_online_game:Lcom/join/mgps/dto/HomeDynamicListBean;

    return-object v0
.end method

.method public getRanking_list()Lcom/join/mgps/dto/HomeRankingListBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->ranking_list:Lcom/join/mgps/dto/HomeRankingListBean;

    return-object v0
.end method

.method public getS_scrolling_txt_v2()Lcom/join/mgps/dto/SScrollingTxtDTOV2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->s_scrolling_txt_v2:Lcom/join/mgps/dto/SScrollingTxtDTOV2;

    return-object v0
.end method

.method public getSimulator_channel()Lcom/join/mgps/dto/HomeDynamicListBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->simulator_channel:Lcom/join/mgps/dto/HomeDynamicListBean;

    return-object v0
.end method

.method public getTop_channel()Lcom/join/mgps/dto/HomeTopChannelBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->top_channel:Lcom/join/mgps/dto/HomeTopChannelBean;

    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->banner:Ljava/util/List;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->fast_entry:Ljava/util/List;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->top_channel:Lcom/join/mgps/dto/HomeTopChannelBean;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->eo_playing:Ljava/util/List;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->guess_you_like:Ljava/util/List;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->new_online_game:Lcom/join/mgps/dto/HomeDynamicListBean;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->ranking_list:Lcom/join/mgps/dto/HomeRankingListBean;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->simulator_channel:Lcom/join/mgps/dto/HomeDynamicListBean;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->dynamic_module:Ljava/util/List;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->hot_game_fav:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setBanner(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->banner:Ljava/util/List;

    return-void
.end method

.method public setDynamic_module(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/HomeDynamicListBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->dynamic_module:Ljava/util/List;

    return-void
.end method

.method public setEo_playing(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->eo_playing:Ljava/util/List;

    return-void
.end method

.method public setFast_entry(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->fast_entry:Ljava/util/List;

    return-void
.end method

.method public setGame_section_id(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->game_section_id:Ljava/lang/String;

    return-void
.end method

.method public setGuess_you_like(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->guess_you_like:Ljava/util/List;

    return-void
.end method

.method public setHot_game_fav(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameFromPopoWinBeanV2$DataBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->hot_game_fav:Ljava/util/List;

    return-void
.end method

.method public setNew_online_game(Lcom/join/mgps/dto/HomeDynamicListBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->new_online_game:Lcom/join/mgps/dto/HomeDynamicListBean;

    return-void
.end method

.method public setRanking_list(Lcom/join/mgps/dto/HomeRankingListBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->ranking_list:Lcom/join/mgps/dto/HomeRankingListBean;

    return-void
.end method

.method public setS_scrolling_txt_v2(Lcom/join/mgps/dto/SScrollingTxtDTOV2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->s_scrolling_txt_v2:Lcom/join/mgps/dto/SScrollingTxtDTOV2;

    return-void
.end method

.method public setSimulator_channel(Lcom/join/mgps/dto/HomeDynamicListBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->simulator_channel:Lcom/join/mgps/dto/HomeDynamicListBean;

    return-void
.end method

.method public setTop_channel(Lcom/join/mgps/dto/HomeTopChannelBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/PapaHomeBeanV9;->top_channel:Lcom/join/mgps/dto/HomeTopChannelBean;

    return-void
.end method
