.class Lcom/join/mgps/activity/CreateEndGameActivity_$a;
.super Ljava/lang/Object;
.source "CreateEndGameActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/CreateEndGameActivity_;->w0(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/join/mgps/activity/CreateEndGameActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/CreateEndGameActivity_;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity_$a;->c:Lcom/join/mgps/activity/CreateEndGameActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/CreateEndGameActivity_$a;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity_$a;->c:Lcom/join/mgps/activity/CreateEndGameActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/CreateEndGameActivity_$a;->b:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/CreateEndGameActivity_;->z0(Lcom/join/mgps/activity/CreateEndGameActivity_;Ljava/util/List;)V

    return-void
.end method
