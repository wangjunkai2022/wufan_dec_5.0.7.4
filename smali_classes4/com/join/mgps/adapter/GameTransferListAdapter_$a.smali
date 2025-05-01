.class Lcom/join/mgps/adapter/GameTransferListAdapter_$a;
.super Ljava/lang/Object;
.source "GameTransferListAdapter_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/GameTransferListAdapter_;->w(ILcom/join/mgps/dto/GameTransferBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/join/mgps/dto/GameTransferBean;

.field final synthetic d:Lcom/join/mgps/adapter/GameTransferListAdapter_;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/GameTransferListAdapter_;ILcom/join/mgps/dto/GameTransferBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/GameTransferListAdapter_$a;->d:Lcom/join/mgps/adapter/GameTransferListAdapter_;

    iput p2, p0, Lcom/join/mgps/adapter/GameTransferListAdapter_$a;->b:I

    iput-object p3, p0, Lcom/join/mgps/adapter/GameTransferListAdapter_$a;->c:Lcom/join/mgps/dto/GameTransferBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/GameTransferListAdapter_$a;->d:Lcom/join/mgps/adapter/GameTransferListAdapter_;

    iget v1, p0, Lcom/join/mgps/adapter/GameTransferListAdapter_$a;->b:I

    iget-object v2, p0, Lcom/join/mgps/adapter/GameTransferListAdapter_$a;->c:Lcom/join/mgps/dto/GameTransferBean;

    invoke-static {v0, v1, v2}, Lcom/join/mgps/adapter/GameTransferListAdapter_;->n(Lcom/join/mgps/adapter/GameTransferListAdapter_;ILjava/lang/Object;)V

    return-void
.end method
