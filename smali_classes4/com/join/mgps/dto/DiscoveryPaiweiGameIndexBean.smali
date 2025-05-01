.class public Lcom/join/mgps/dto/DiscoveryPaiweiGameIndexBean;
.super Ljava/lang/Object;
.source "DiscoveryPaiweiGameIndexBean.java"


# instance fields
.field private game_id:Ljava/lang/String;

.field private icon:Ljava/lang/String;

.field private max_battle_count:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getGame_id()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/DiscoveryPaiweiGameIndexBean;->game_id:Ljava/lang/String;

    return-object v0
.end method

.method public getIcon()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/DiscoveryPaiweiGameIndexBean;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public getMax_battle_count()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/DiscoveryPaiweiGameIndexBean;->max_battle_count:I

    return v0
.end method

.method public setGame_id(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/DiscoveryPaiweiGameIndexBean;->game_id:Ljava/lang/String;

    return-void
.end method

.method public setIcon(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/DiscoveryPaiweiGameIndexBean;->icon:Ljava/lang/String;

    return-void
.end method

.method public setMax_battle_count(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/DiscoveryPaiweiGameIndexBean;->max_battle_count:I

    return-void
.end method
