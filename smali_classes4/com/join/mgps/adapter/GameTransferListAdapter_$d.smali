.class Lcom/join/mgps/adapter/GameTransferListAdapter_$d;
.super Ljava/lang/Object;
.source "GameTransferListAdapter_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/GameTransferListAdapter_;->a(Landroid/util/SparseArray;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/util/SparseArray;

.field final synthetic c:Lcom/join/mgps/adapter/GameTransferListAdapter_;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/GameTransferListAdapter_;Landroid/util/SparseArray;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/GameTransferListAdapter_$d;->c:Lcom/join/mgps/adapter/GameTransferListAdapter_;

    iput-object p2, p0, Lcom/join/mgps/adapter/GameTransferListAdapter_$d;->b:Landroid/util/SparseArray;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/GameTransferListAdapter_$d;->c:Lcom/join/mgps/adapter/GameTransferListAdapter_;

    iget-object v1, p0, Lcom/join/mgps/adapter/GameTransferListAdapter_$d;->b:Landroid/util/SparseArray;

    invoke-static {v0, v1}, Lcom/join/mgps/adapter/GameTransferListAdapter_;->t(Lcom/join/mgps/adapter/GameTransferListAdapter_;Landroid/util/SparseArray;)V

    return-void
.end method
