.class Lcom/join/mgps/activity/message/MessagePriaceFragment$b;
.super Ljava/lang/Object;
.source "MessagePriaceFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/message/MessagePriaceFragment;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/message/MessagePriaceFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/message/MessagePriaceFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment$b;->b:Lcom/join/mgps/activity/message/MessagePriaceFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRefresh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment$b;->b:Lcom/join/mgps/activity/message/MessagePriaceFragment;

    invoke-virtual {v0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->V()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment$b;->b:Lcom/join/mgps/activity/message/MessagePriaceFragment;

    const/4 v1, 0x1

    iput v1, v0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->m:I

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->a0()V

    return-void
.end method
