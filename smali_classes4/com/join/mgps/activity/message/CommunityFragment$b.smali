.class Lcom/join/mgps/activity/message/CommunityFragment$b;
.super Ljava/lang/Object;
.source "CommunityFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/message/CommunityFragment;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/message/CommunityFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/message/CommunityFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/message/CommunityFragment$b;->b:Lcom/join/mgps/activity/message/CommunityFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRefresh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment$b;->b:Lcom/join/mgps/activity/message/CommunityFragment;

    invoke-virtual {v0}, Lcom/join/mgps/activity/message/CommunityFragment;->V()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment$b;->b:Lcom/join/mgps/activity/message/CommunityFragment;

    const/4 v1, 0x1

    iput v1, v0, Lcom/join/mgps/activity/message/CommunityFragment;->l:I

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/activity/message/CommunityFragment;->Z()V

    return-void
.end method
