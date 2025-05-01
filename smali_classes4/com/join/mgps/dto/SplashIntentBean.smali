.class public Lcom/join/mgps/dto/SplashIntentBean;
.super Ljava/lang/Object;
.source "SplashIntentBean.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;
    }
.end annotation


# instance fields
.field private ad_switch:I

.field private crc_link_type_val:Ljava/lang/String;

.field private game_info:Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;

.field private jump_id:I

.field private jump_type:I

.field private link_type:I

.field private link_type_val:Ljava/lang/String;

.field private pic_remote:Ljava/lang/String;

.field private pic_remote_local:Ljava/lang/String;

.field private showPosition:I

.field private show_time:J

.field private tag_show:I

.field private title:Ljava/lang/String;

.field private tpl_type:Ljava/lang/String;

.field private vedio_url:Ljava/lang/String;

.field private vedio_url_local:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/join/mgps/dto/SplashIntentBean;->showPosition:I

    return-void
.end method

.method public static from(Lorg/json/JSONObject;)Lcom/join/mgps/dto/SplashIntentBean;
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/dto/SplashIntentBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/SplashIntentBean;-><init>()V

    :try_start_0
    const-string v1, "link_type"

    .line 2
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/SplashIntentBean;->setLink_type(I)V

    const-string v1, "link_type_val"

    .line 3
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/SplashIntentBean;->setLink_type_val(Ljava/lang/String;)V

    const-string v1, "crc_link_type_val"

    .line 4
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/SplashIntentBean;->setCrc_link_type_val(Ljava/lang/String;)V

    const-string v1, "jump_type"

    .line 5
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/SplashIntentBean;->setJump_type(I)V

    const-string v1, "jump_id"

    .line 6
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/SplashIntentBean;->setJump_id(I)V

    const-string v1, "tpl_type"

    .line 7
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/SplashIntentBean;->setTpl_type(Ljava/lang/String;)V

    const-string v1, "title"

    .line 8
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/SplashIntentBean;->setTitle(Ljava/lang/String;)V

    const-string v1, "pic_remote"

    .line 9
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/SplashIntentBean;->setPic_remote(Ljava/lang/String;)V

    const-string v1, "pic_remote_local"

    .line 10
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/SplashIntentBean;->setPic_remote_local(Ljava/lang/String;)V

    const-string v1, "ad_switch"

    .line 11
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/SplashIntentBean;->setAd_switch(I)V

    const-string v1, "show_time"

    .line 12
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/dto/SplashIntentBean;->setShow_time(J)V

    const-string v1, "tag_show"

    .line 13
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/SplashIntentBean;->setTag_show(I)V

    const-string v1, "showPosition"

    .line 14
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/SplashIntentBean;->setShowPosition(I)V

    const-string v1, "vedio_url"

    .line 15
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/SplashIntentBean;->setVedio_url(Ljava/lang/String;)V

    const-string v1, "vedio_url_local"

    .line 16
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/SplashIntentBean;->setVedio_url_local(Ljava/lang/String;)V

    const-string v1, "game_info"

    .line 17
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 18
    invoke-static {p0}, Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;->from(Lorg/json/JSONObject;)Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/join/mgps/dto/SplashIntentBean;->setGame_info(Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-object v0
.end method


# virtual methods
.method public getAd_switch()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/SplashIntentBean;->ad_switch:I

    return v0
.end method

.method public getCrc_link_type_val()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SplashIntentBean;->crc_link_type_val:Ljava/lang/String;

    return-object v0
.end method

.method public getGame_info()Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SplashIntentBean;->game_info:Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;

    return-object v0
.end method

.method public getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v0}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    .line 2
    iget v1, p0, Lcom/join/mgps/dto/SplashIntentBean;->jump_type:I

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setJump_type(I)V

    .line 3
    iget v1, p0, Lcom/join/mgps/dto/SplashIntentBean;->link_type:I

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/dto/SplashIntentBean;->link_type_val:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Lcom/join/mgps/dto/SplashIntentBean;->crc_link_type_val:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setCrc_link_type_val(Ljava/lang/String;)V

    .line 6
    iget v1, p0, Lcom/join/mgps/dto/SplashIntentBean;->link_type:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/join/mgps/dto/SplashIntentBean;->game_info:Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;

    if-eqz v1, :cond_0

    .line 7
    invoke-virtual {v1}, Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;->getGame_info_tpl_type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setTpl_type(Ljava/lang/String;)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/dto/SplashIntentBean;->tpl_type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setTpl_type(Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method

.method public getJump_id()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/SplashIntentBean;->jump_id:I

    return v0
.end method

.method public getJump_type()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/SplashIntentBean;->jump_type:I

    return v0
.end method

.method public getLink_type()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/SplashIntentBean;->link_type:I

    return v0
.end method

.method public getLink_type_val()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SplashIntentBean;->link_type_val:Ljava/lang/String;

    return-object v0
.end method

.method public getPic_remote()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SplashIntentBean;->pic_remote:Ljava/lang/String;

    return-object v0
.end method

.method public getPic_remote_local()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SplashIntentBean;->pic_remote_local:Ljava/lang/String;

    return-object v0
.end method

.method public getShowPosition()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/SplashIntentBean;->showPosition:I

    return v0
.end method

.method public getShow_time()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/join/mgps/dto/SplashIntentBean;->show_time:J

    return-wide v0
.end method

.method public getTag_show()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/SplashIntentBean;->tag_show:I

    return v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SplashIntentBean;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getTpl_type()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SplashIntentBean;->tpl_type:Ljava/lang/String;

    return-object v0
.end method

.method public getVedio_url()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SplashIntentBean;->vedio_url:Ljava/lang/String;

    return-object v0
.end method

.method public getVedio_url_local()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SplashIntentBean;->vedio_url_local:Ljava/lang/String;

    return-object v0
.end method

.method public setAd_switch(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/SplashIntentBean;->ad_switch:I

    return-void
.end method

.method public setCrc_link_type_val(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SplashIntentBean;->crc_link_type_val:Ljava/lang/String;

    return-void
.end method

.method public setGame_info(Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SplashIntentBean;->game_info:Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;

    return-void
.end method

.method public setJump_id(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/SplashIntentBean;->jump_id:I

    return-void
.end method

.method public setJump_type(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/SplashIntentBean;->jump_type:I

    return-void
.end method

.method public setLink_type(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/SplashIntentBean;->link_type:I

    return-void
.end method

.method public setLink_type_val(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SplashIntentBean;->link_type_val:Ljava/lang/String;

    return-void
.end method

.method public setPic_remote(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SplashIntentBean;->pic_remote:Ljava/lang/String;

    return-void
.end method

.method public setPic_remote_local(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SplashIntentBean;->pic_remote_local:Ljava/lang/String;

    return-void
.end method

.method public setShowPosition(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/SplashIntentBean;->showPosition:I

    return-void
.end method

.method public setShow_time(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/join/mgps/dto/SplashIntentBean;->show_time:J

    return-void
.end method

.method public setTag_show(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/SplashIntentBean;->tag_show:I

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SplashIntentBean;->title:Ljava/lang/String;

    return-void
.end method

.method public setTpl_type(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SplashIntentBean;->tpl_type:Ljava/lang/String;

    return-void
.end method

.method public setVedio_url(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SplashIntentBean;->vedio_url:Ljava/lang/String;

    return-void
.end method

.method public setVedio_url_local(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SplashIntentBean;->vedio_url_local:Ljava/lang/String;

    return-void
.end method
