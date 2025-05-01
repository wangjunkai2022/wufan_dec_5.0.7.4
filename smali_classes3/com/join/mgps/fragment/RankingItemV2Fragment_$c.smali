.class Lcom/join/mgps/fragment/RankingItemV2Fragment_$c;
.super Ljava/lang/Object;
.source "RankingItemV2Fragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/RankingItemV2Fragment_;->q0(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

.field final synthetic c:Lcom/join/mgps/fragment/RankingItemV2Fragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/RankingItemV2Fragment_;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment_$c;->c:Lcom/join/mgps/fragment/RankingItemV2Fragment_;

    iput-object p2, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment_$c;->b:Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment_$c;->c:Lcom/join/mgps/fragment/RankingItemV2Fragment_;

    iget-object v1, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment_$c;->b:Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-static {v0, v1}, Lcom/join/mgps/fragment/RankingItemV2Fragment_;->D0(Lcom/join/mgps/fragment/RankingItemV2Fragment_;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    return-void
.end method
