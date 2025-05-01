.class Lcom/join/mgps/adapter/GameTransferListAdapter_$e;
.super Ljava/lang/Object;
.source "GameTransferListAdapter_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/GameTransferListAdapter_;->clear()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/adapter/GameTransferListAdapter_;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/GameTransferListAdapter_;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/GameTransferListAdapter_$e;->b:Lcom/join/mgps/adapter/GameTransferListAdapter_;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/GameTransferListAdapter_$e;->b:Lcom/join/mgps/adapter/GameTransferListAdapter_;

    invoke-static {v0}, Lcom/join/mgps/adapter/GameTransferListAdapter_;->v(Lcom/join/mgps/adapter/GameTransferListAdapter_;)V

    return-void
.end method
