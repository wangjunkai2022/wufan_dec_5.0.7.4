.class Lcom/join/mgps/activity/GameCommentActivity$c;
.super Ljava/lang/Object;
.source "GameCommentActivity.java"

# interfaces
.implements Lcom/join/mgps/customview/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GameCommentActivity;->afterview()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/GameCommentActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GameCommentActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameCommentActivity$c;->b:Lcom/join/mgps/activity/GameCommentActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameCommentActivity$c;->b:Lcom/join/mgps/activity/GameCommentActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/GameCommentActivity;->j0(Lcom/join/mgps/activity/GameCommentActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameCommentActivity$c;->b:Lcom/join/mgps/activity/GameCommentActivity;

    invoke-virtual {v0}, Lcom/join/mgps/activity/GameCommentActivity;->o0()V

    return-void
.end method
