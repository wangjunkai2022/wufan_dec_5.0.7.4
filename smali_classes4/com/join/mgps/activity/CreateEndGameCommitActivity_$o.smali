.class Lcom/join/mgps/activity/CreateEndGameCommitActivity_$o;
.super Ljava/lang/Object;
.source "CreateEndGameCommitActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/CreateEndGameCommitActivity_;->y0(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/join/mgps/activity/CreateEndGameCommitActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$o;->c:Lcom/join/mgps/activity/CreateEndGameCommitActivity_;

    iput p2, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$o;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$o;->c:Lcom/join/mgps/activity/CreateEndGameCommitActivity_;

    iget v1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$o;->b:I

    invoke-static {v0, v1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_;->G0(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;I)V

    return-void
.end method
