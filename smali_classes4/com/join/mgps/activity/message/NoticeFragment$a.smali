.class Lcom/join/mgps/activity/message/NoticeFragment$a;
.super Ljava/lang/Object;
.source "NoticeFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/message/NoticeFragment;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/message/NoticeFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/message/NoticeFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/message/NoticeFragment$a;->b:Lcom/join/mgps/activity/message/NoticeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRefresh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/NoticeFragment$a;->b:Lcom/join/mgps/activity/message/NoticeFragment;

    const/4 v1, 0x1

    iput v1, v0, Lcom/join/mgps/activity/message/NoticeFragment;->k:I

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/activity/message/NoticeFragment;->V()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/message/NoticeFragment$a;->b:Lcom/join/mgps/activity/message/NoticeFragment;

    iget-boolean v1, v0, Lcom/join/mgps/activity/message/NoticeFragment;->m:Z

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/activity/message/NoticeFragment;->a0()V

    :cond_0
    return-void
.end method
