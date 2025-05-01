.class public Lcom/join/mgps/dto/GInfoBean;
.super Ljava/lang/Object;
.source "GInfoBean.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private app_size:Ljava/lang/String;

.field private arm64:I

.field private bespeak_switch:I

.field private comment_score_switch:I

.field private down_count:I

.field private down_state:Ljava/lang/Integer;

.field private download_close:I

.field private game_book:I

.field private game_info_tpl_type:Ljava/lang/String;

.field private gif_ico:Ljava/lang/String;

.field private gift_package_switch:I

.field private ico:Ljava/lang/String;

.field private id:Ljava/lang/String;

.field private info:Ljava/lang/String;

.field private mod_id:Ljava/lang/String;

.field private mod_package_name:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private package_name:Ljava/lang/String;

.field private pay_tag_info:Lcom/join/mgps/dto/PayTagInfo;

.field private pic_info:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private pic_position:Ljava/lang/Integer;

.field private plugin_num:Ljava/lang/String;

.field private position_path:Lcom/psk/eventmodule/StatFactory$VolcanoOther;

.field private score:Ljava/lang/Double;

.field private sp_tag_info:Lcom/join/mgps/dto/TipNew;

.field private sp_tpl_two_position:I

.field private sync_memory:Ljava/lang/String;

.field private tag_id:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private tag_info:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/TipBean;",
            ">;"
        }
    .end annotation
.end field

.field private tag_name:Ljava/lang/String;

.field private ver:Ljava/lang/String;

.field private ver_name:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/join/mgps/dto/GInfoBean;->bespeak_switch:I

    return-void
.end method


# virtual methods
.method public getApp_size()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->app_size:Ljava/lang/String;

    return-object v0
.end method

.method public getArm64()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/GInfoBean;->arm64:I

    return v0
.end method

.method public getBespeak_switch()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/GInfoBean;->bespeak_switch:I

    return v0
.end method

.method public getComment_score_switch()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/GInfoBean;->comment_score_switch:I

    return v0
.end method

.method public getDown_count()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/GInfoBean;->down_count:I

    return v0
.end method

.method public getDown_state()Ljava/lang/Integer;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->down_state:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/join/mgps/dto/GInfoBean;->bespeak_switch:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x6

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->down_state:Ljava/lang/Integer;

    return-object v0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->down_state:Ljava/lang/Integer;

    return-object v0
.end method

.method public getDownload_close()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/GInfoBean;->download_close:I

    return v0
.end method

.method public getGame_book()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/GInfoBean;->game_book:I

    return v0
.end method

.method public getGame_info_tpl_type()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->game_info_tpl_type:Ljava/lang/String;

    return-object v0
.end method

.method public getGif_ico()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->gif_ico:Ljava/lang/String;

    return-object v0
.end method

.method public getGift_package_switch()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/GInfoBean;->gift_package_switch:I

    return v0
.end method

.method public getIco()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->ico:Ljava/lang/String;

    return-object v0
.end method

.method public getIcon()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->gif_ico:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->gif_ico:Ljava/lang/String;

    return-object v0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->ico:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getInfo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->info:Ljava/lang/String;

    return-object v0
.end method

.method public getMod_id()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->mod_id:Ljava/lang/String;

    return-object v0
.end method

.method public getMod_package_name()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->mod_package_name:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getPackage_name()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->package_name:Ljava/lang/String;

    return-object v0
.end method

.method public getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->pay_tag_info:Lcom/join/mgps/dto/PayTagInfo;

    return-object v0
.end method

.method public getPic_info()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->pic_info:Ljava/util/List;

    return-object v0
.end method

.method public getPic_position()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->pic_position:Ljava/lang/Integer;

    return-object v0
.end method

.method public getPlugin_num()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->plugin_num:Ljava/lang/String;

    return-object v0
.end method

.method public getPosition_path()Lcom/psk/eventmodule/StatFactory$VolcanoOther;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->position_path:Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    return-object v0
.end method

.method public getScore()Ljava/lang/Double;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->score:Ljava/lang/Double;

    return-object v0
.end method

.method public getSp_tag_info()Lcom/join/mgps/dto/TipNew;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->sp_tag_info:Lcom/join/mgps/dto/TipNew;

    return-object v0
.end method

.method public getSp_tpl_two_position()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/GInfoBean;->sp_tpl_two_position:I

    return v0
.end method

.method public getSync_memory()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->sync_memory:Ljava/lang/String;

    return-object v0
.end method

.method public getTag_id()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->tag_id:Ljava/util/List;

    return-object v0
.end method

.method public getTag_info()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/TipBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->tag_info:Ljava/util/List;

    return-object v0
.end method

.method public getTag_name()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->tag_name:Ljava/lang/String;

    return-object v0
.end method

.method public getVer()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->ver:Ljava/lang/String;

    return-object v0
.end method

.method public getVer_name()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->ver_name:Ljava/lang/String;

    return-object v0
.end method

.method public isBtGame()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->sp_tag_info:Lcom/join/mgps/dto/TipNew;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/TipNew;->getBt_game()Lcom/join/mgps/dto/TipBean;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isCpsGame()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/GInfoBean;->download_close:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isMiniGame()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->sp_tag_info:Lcom/join/mgps/dto/TipNew;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/TipNew;->getMini_game()Lcom/join/mgps/dto/TipBean;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isModGameVm()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->sp_tag_info:Lcom/join/mgps/dto/TipNew;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/TipNew;->getMod_game_vm()Lcom/join/mgps/dto/TipBean;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isNetGameVm()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->sp_tag_info:Lcom/join/mgps/dto/TipNew;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/TipNew;->getNet_game_vm()Lcom/join/mgps/dto/TipBean;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isSingleGameVm()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GInfoBean;->sp_tag_info:Lcom/join/mgps/dto/TipNew;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/TipNew;->getSingle_game_vm()Lcom/join/mgps/dto/TipBean;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setApp_size(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GInfoBean;->app_size:Ljava/lang/String;

    return-void
.end method

.method public setArm64(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/GInfoBean;->arm64:I

    return-void
.end method

.method public setBespeak_switch(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/GInfoBean;->bespeak_switch:I

    return-void
.end method

.method public setComment_score_switch(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/GInfoBean;->comment_score_switch:I

    return-void
.end method

.method public setDown_count(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/GInfoBean;->down_count:I

    return-void
.end method

.method public setDown_state(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GInfoBean;->down_state:Ljava/lang/Integer;

    return-void
.end method

.method public setDownload_close(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/GInfoBean;->download_close:I

    return-void
.end method

.method public setGame_book(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/GInfoBean;->game_book:I

    return-void
.end method

.method public setGame_info_tpl_type(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GInfoBean;->game_info_tpl_type:Ljava/lang/String;

    return-void
.end method

.method public setGif_ico(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GInfoBean;->gif_ico:Ljava/lang/String;

    return-void
.end method

.method public setGift_package_switch(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/GInfoBean;->gift_package_switch:I

    return-void
.end method

.method public setIco(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GInfoBean;->ico:Ljava/lang/String;

    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GInfoBean;->id:Ljava/lang/String;

    return-void
.end method

.method public setInfo(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GInfoBean;->info:Ljava/lang/String;

    return-void
.end method

.method public setMod_id(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GInfoBean;->mod_id:Ljava/lang/String;

    return-void
.end method

.method public setMod_package_name(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GInfoBean;->mod_package_name:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GInfoBean;->name:Ljava/lang/String;

    return-void
.end method

.method public setPackage_name(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GInfoBean;->package_name:Ljava/lang/String;

    return-void
.end method

.method public setPay_tag_info(Lcom/join/mgps/dto/PayTagInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GInfoBean;->pay_tag_info:Lcom/join/mgps/dto/PayTagInfo;

    return-void
.end method

.method public setPic_info(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GInfoBean;->pic_info:Ljava/util/List;

    return-void
.end method

.method public setPic_position(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GInfoBean;->pic_position:Ljava/lang/Integer;

    return-void
.end method

.method public setPlugin_num(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GInfoBean;->plugin_num:Ljava/lang/String;

    return-void
.end method

.method public setPosition_path(Lcom/psk/eventmodule/StatFactory$VolcanoOther;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GInfoBean;->position_path:Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    return-void
.end method

.method public setScore(Ljava/lang/Double;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GInfoBean;->score:Ljava/lang/Double;

    return-void
.end method

.method public setSp_tag_info(Lcom/join/mgps/dto/TipNew;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GInfoBean;->sp_tag_info:Lcom/join/mgps/dto/TipNew;

    return-void
.end method

.method public setSp_tpl_two_position(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/GInfoBean;->sp_tpl_two_position:I

    return-void
.end method

.method public setSync_memory(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GInfoBean;->sync_memory:Ljava/lang/String;

    return-void
.end method

.method public setTag_id(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GInfoBean;->tag_id:Ljava/util/List;

    return-void
.end method

.method public setTag_info(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/TipBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GInfoBean;->tag_info:Ljava/util/List;

    return-void
.end method

.method public setTag_name(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GInfoBean;->tag_name:Ljava/lang/String;

    return-void
.end method

.method public setVer(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GInfoBean;->ver:Ljava/lang/String;

    return-void
.end method

.method public setVer_name(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GInfoBean;->ver_name:Ljava/lang/String;

    return-void
.end method

.method public showScore()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/GInfoBean;->comment_score_switch:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method
