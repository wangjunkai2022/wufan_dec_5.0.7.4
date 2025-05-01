.class Lcom/join/mgps/fragment/NewArenaMainFragment_$d;
.super Ljava/lang/Object;
.source "NewArenaMainFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/NewArenaMainFragment_;->L0(Lcom/join/mgps/dto/GameListBannerBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/GameListBannerBean;

.field final synthetic c:Lcom/join/mgps/fragment/NewArenaMainFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/NewArenaMainFragment_;Lcom/join/mgps/dto/GameListBannerBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/NewArenaMainFragment_$d;->c:Lcom/join/mgps/fragment/NewArenaMainFragment_;

    iput-object p2, p0, Lcom/join/mgps/fragment/NewArenaMainFragment_$d;->b:Lcom/join/mgps/dto/GameListBannerBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment_$d;->c:Lcom/join/mgps/fragment/NewArenaMainFragment_;

    iget-object v1, p0, Lcom/join/mgps/fragment/NewArenaMainFragment_$d;->b:Lcom/join/mgps/dto/GameListBannerBean;

    invoke-static {v0, v1}, Lcom/join/mgps/fragment/NewArenaMainFragment_;->k1(Lcom/join/mgps/fragment/NewArenaMainFragment_;Lcom/join/mgps/dto/GameListBannerBean;)V

    return-void
.end method
