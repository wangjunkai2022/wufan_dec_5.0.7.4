.class Lcom/join/mgps/fragment/MarketFragment_$b;
.super Ljava/lang/Object;
.source "MarketFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/MarketFragment_;->X()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/MarketFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/MarketFragment_;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/MarketFragment_$b;->b:Lcom/join/mgps/fragment/MarketFragment_;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/MarketFragment_$b;->b:Lcom/join/mgps/fragment/MarketFragment_;

    invoke-static {v0}, Lcom/join/mgps/fragment/MarketFragment_;->c0(Lcom/join/mgps/fragment/MarketFragment_;)V

    return-void
.end method
