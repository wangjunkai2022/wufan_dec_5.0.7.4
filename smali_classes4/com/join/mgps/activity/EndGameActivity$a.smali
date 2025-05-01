.class Lcom/join/mgps/activity/EndGameActivity$a;
.super Ljava/lang/Object;
.source "EndGameActivity.java"

# interfaces
.implements Lcom/join/mgps/base/BaseQuickAdapter$l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/EndGameActivity;->afterviews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/EndGameActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/EndGameActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/EndGameActivity$a;->a:Lcom/join/mgps/activity/EndGameActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMoreRequested()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity$a;->a:Lcom/join/mgps/activity/EndGameActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameActivity;->h0(Lcom/join/mgps/activity/EndGameActivity;)I

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity$a;->a:Lcom/join/mgps/activity/EndGameActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameActivity;->g0(Lcom/join/mgps/activity/EndGameActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/EndGameActivity;->w0(I)V

    return-void
.end method
