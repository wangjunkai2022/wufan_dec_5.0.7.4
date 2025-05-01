.class Lcom/join/mgps/adapter/GameTransferListAdapter_$b;
.super Ljava/lang/Object;
.source "GameTransferListAdapter_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/GameTransferListAdapter_;->g(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/join/mgps/adapter/GameTransferListAdapter_;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/GameTransferListAdapter_;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/GameTransferListAdapter_$b;->c:Lcom/join/mgps/adapter/GameTransferListAdapter_;

    iput p2, p0, Lcom/join/mgps/adapter/GameTransferListAdapter_$b;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/GameTransferListAdapter_$b;->c:Lcom/join/mgps/adapter/GameTransferListAdapter_;

    iget v1, p0, Lcom/join/mgps/adapter/GameTransferListAdapter_$b;->b:I

    invoke-static {v0, v1}, Lcom/join/mgps/adapter/GameTransferListAdapter_;->p(Lcom/join/mgps/adapter/GameTransferListAdapter_;I)V

    return-void
.end method
