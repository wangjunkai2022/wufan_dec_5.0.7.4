.class Lcom/join/mgps/activity/CreateEndGameActivity_$m;
.super Ljava/lang/Object;
.source "CreateEndGameActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/CreateEndGameActivity_;->x0(ZLjava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Z

.field final synthetic c:Ljava/util/List;

.field final synthetic d:Lcom/join/mgps/activity/CreateEndGameActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/CreateEndGameActivity_;ZLjava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity_$m;->d:Lcom/join/mgps/activity/CreateEndGameActivity_;

    iput-boolean p2, p0, Lcom/join/mgps/activity/CreateEndGameActivity_$m;->b:Z

    iput-object p3, p0, Lcom/join/mgps/activity/CreateEndGameActivity_$m;->c:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity_$m;->d:Lcom/join/mgps/activity/CreateEndGameActivity_;

    iget-boolean v1, p0, Lcom/join/mgps/activity/CreateEndGameActivity_$m;->b:Z

    iget-object v2, p0, Lcom/join/mgps/activity/CreateEndGameActivity_$m;->c:Ljava/util/List;

    invoke-static {v0, v1, v2}, Lcom/join/mgps/activity/CreateEndGameActivity_;->y0(Lcom/join/mgps/activity/CreateEndGameActivity_;ZLjava/util/List;)V

    return-void
.end method
