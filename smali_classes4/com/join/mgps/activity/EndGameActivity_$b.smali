.class Lcom/join/mgps/activity/EndGameActivity_$b;
.super Ljava/lang/Object;
.source "EndGameActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/EndGameActivity_;->F0(Lcom/join/mgps/dto/EndGameListBean;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/EndGameListBean;

.field final synthetic c:I

.field final synthetic d:Lcom/join/mgps/activity/EndGameActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/EndGameActivity_;Lcom/join/mgps/dto/EndGameListBean;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/EndGameActivity_$b;->d:Lcom/join/mgps/activity/EndGameActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/EndGameActivity_$b;->b:Lcom/join/mgps/dto/EndGameListBean;

    iput p3, p0, Lcom/join/mgps/activity/EndGameActivity_$b;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity_$b;->d:Lcom/join/mgps/activity/EndGameActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity_$b;->b:Lcom/join/mgps/dto/EndGameListBean;

    iget v2, p0, Lcom/join/mgps/activity/EndGameActivity_$b;->c:I

    invoke-static {v0, v1, v2}, Lcom/join/mgps/activity/EndGameActivity_;->O0(Lcom/join/mgps/activity/EndGameActivity_;Lcom/join/mgps/dto/EndGameListBean;I)V

    return-void
.end method
