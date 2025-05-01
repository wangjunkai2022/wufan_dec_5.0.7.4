.class Lcom/join/mgps/activity/GivePraiceActivity_$k;
.super Ljava/lang/Object;
.source "GivePraiceActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GivePraiceActivity_;->l0(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/join/mgps/activity/GivePraiceActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GivePraiceActivity_;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GivePraiceActivity_$k;->c:Lcom/join/mgps/activity/GivePraiceActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/GivePraiceActivity_$k;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GivePraiceActivity_$k;->c:Lcom/join/mgps/activity/GivePraiceActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/GivePraiceActivity_$k;->b:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/GivePraiceActivity_;->A0(Lcom/join/mgps/activity/GivePraiceActivity_;Ljava/util/List;)V

    return-void
.end method
