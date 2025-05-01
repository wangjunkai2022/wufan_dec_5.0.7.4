.class public Lcom/join/mgps/dto/HomeGameMenuListBean;
.super Ljava/lang/Object;
.source "HomeGameMenuListBean.java"


# instance fields
.field private game_ico:Ljava/lang/String;

.field private game_name:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getGame_ico()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/HomeGameMenuListBean;->game_ico:Ljava/lang/String;

    return-object v0
.end method

.method public getGame_name()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/HomeGameMenuListBean;->game_name:Ljava/lang/String;

    return-object v0
.end method

.method public setGame_ico(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/HomeGameMenuListBean;->game_ico:Ljava/lang/String;

    return-void
.end method

.method public setGame_name(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/HomeGameMenuListBean;->game_name:Ljava/lang/String;

    return-void
.end method
