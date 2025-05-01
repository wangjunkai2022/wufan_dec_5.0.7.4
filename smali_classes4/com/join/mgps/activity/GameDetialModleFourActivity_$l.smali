.class Lcom/join/mgps/activity/GameDetialModleFourActivity_$l;
.super Ljava/lang/Object;
.source "GameDetialModleFourActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GameDetialModleFourActivity_;->j0(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Lcom/join/mgps/activity/GameDetialModleFourActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$l;->d:Lcom/join/mgps/activity/GameDetialModleFourActivity_;

    iput p2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$l;->b:I

    iput p3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$l;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$l;->d:Lcom/join/mgps/activity/GameDetialModleFourActivity_;

    iget v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$l;->b:I

    iget v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$l;->c:I

    invoke-static {v0, v1, v2}, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->D1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;II)V

    return-void
.end method
