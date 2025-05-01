.class public Lcom/join/mgps/dto/ForumStickyHeaderModel;
.super Lcom/xuanyu/stickyheader/a;
.source "ForumStickyHeaderModel.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/xuanyu/stickyheader/a<",
        "Lcom/join/mgps/adapter/ForumPostsAdapter$e0;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/xuanyu/stickyheader/a;-><init>()V

    return-void
.end method


# virtual methods
.method public getStickyView(Landroid/content/Context;)Landroid/view/View;
    .locals 2

    .line 1
    new-instance v0, Lcom/join/mgps/customview/ForumStickView;

    invoke-direct {v0, p1}, Lcom/join/mgps/customview/ForumStickView;-><init>(Landroid/content/Context;)V

    .line 2
    instance-of v1, p1, Lcom/join/mgps/customview/ForumStickView$e;

    if-eqz v1, :cond_0

    .line 3
    check-cast p1, Lcom/join/mgps/customview/ForumStickView$e;

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/ForumStickView;->setForumStickViewListener(Lcom/join/mgps/customview/ForumStickView$e;)V

    :cond_0
    return-object v0
.end method

.method public onBindView(Landroid/view/View;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/join/mgps/customview/ForumStickView;

    invoke-virtual {p1, p2}, Lcom/join/mgps/customview/ForumStickView;->setData(Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V

    return-void
.end method

.method public bridge synthetic onBindView(Landroid/view/View;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/dto/ForumStickyHeaderModel;->onBindView(Landroid/view/View;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V

    return-void
.end method
