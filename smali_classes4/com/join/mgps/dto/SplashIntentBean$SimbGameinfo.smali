.class public Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;
.super Ljava/lang/Object;
.source "SplashIntentBean.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/dto/SplashIntentBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SimbGameinfo"
.end annotation


# instance fields
.field private game_info_tpl_type:Ljava/lang/String;

.field private ico_remote:Ljava/lang/String;

.field private id:Ljava/lang/String;

.field private sp_tpl_two_position:Ljava/lang/String;

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static from(Lorg/json/JSONObject;)Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;
    .locals 2

    .line 1
    new-instance v0, Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;

    invoke-direct {v0}, Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;-><init>()V

    :try_start_0
    const-string v1, "id"

    .line 2
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;->setId(Ljava/lang/String;)V

    const-string v1, "title"

    .line 3
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;->setTitle(Ljava/lang/String;)V

    const-string v1, "ico_remote"

    .line 4
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;->setIco_remote(Ljava/lang/String;)V

    const-string v1, "game_info_tpl_type"

    .line 5
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;->setGame_info_tpl_type(Ljava/lang/String;)V

    const-string v1, "sp_tpl_two_position"

    .line 6
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;->setSp_tpl_two_position(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-object v0
.end method


# virtual methods
.method public getGame_info_tpl_type()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;->game_info_tpl_type:Ljava/lang/String;

    return-object v0
.end method

.method public getIco_remote()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;->ico_remote:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getSp_tpl_two_position()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;->sp_tpl_two_position:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;->title:Ljava/lang/String;

    return-object v0
.end method

.method public setGame_info_tpl_type(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;->game_info_tpl_type:Ljava/lang/String;

    return-void
.end method

.method public setIco_remote(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;->ico_remote:Ljava/lang/String;

    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;->id:Ljava/lang/String;

    return-void
.end method

.method public setSp_tpl_two_position(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;->sp_tpl_two_position:Ljava/lang/String;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SplashIntentBean$SimbGameinfo;->title:Ljava/lang/String;

    return-void
.end method
