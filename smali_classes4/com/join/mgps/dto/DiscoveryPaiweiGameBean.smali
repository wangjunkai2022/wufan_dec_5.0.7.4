.class public Lcom/join/mgps/dto/DiscoveryPaiweiGameBean;
.super Ljava/lang/Object;
.source "DiscoveryPaiweiGameBean.java"


# instance fields
.field private detail:Lcom/join/mgps/dto/DiscoveryPaiweiGameDetailBean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDetail()Lcom/join/mgps/dto/DiscoveryPaiweiGameDetailBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/DiscoveryPaiweiGameBean;->detail:Lcom/join/mgps/dto/DiscoveryPaiweiGameDetailBean;

    return-object v0
.end method

.method public setDetail(Lcom/join/mgps/dto/DiscoveryPaiweiGameDetailBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/DiscoveryPaiweiGameBean;->detail:Lcom/join/mgps/dto/DiscoveryPaiweiGameDetailBean;

    return-void
.end method
