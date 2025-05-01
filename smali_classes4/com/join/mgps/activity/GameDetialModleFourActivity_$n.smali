.class Lcom/join/mgps/activity/GameDetialModleFourActivity_$n;
.super Ljava/lang/Object;
.source "GameDetialModleFourActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GameDetialModleFourActivity_;->P0(Lcom/join/mgps/dto/CommentResponse;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/CommentResponse;

.field final synthetic c:Lcom/join/mgps/activity/GameDetialModleFourActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Lcom/join/mgps/dto/CommentResponse;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$n;->c:Lcom/join/mgps/activity/GameDetialModleFourActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$n;->b:Lcom/join/mgps/dto/CommentResponse;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$n;->c:Lcom/join/mgps/activity/GameDetialModleFourActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$n;->b:Lcom/join/mgps/dto/CommentResponse;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->T1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Lcom/join/mgps/dto/CommentResponse;)V

    return-void
.end method
