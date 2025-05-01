.class Lcom/join/mgps/activity/message/CommunityFragment$g$d;
.super Ljava/lang/Object;
.source "CommunityFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/message/CommunityFragment$g;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

.field final synthetic c:Lcom/join/mgps/activity/message/CommunityFragment$g;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/message/CommunityFragment$g;Lcom/join/mgps/dto/ForumBean$ForumPostsBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/message/CommunityFragment$g$d;->c:Lcom/join/mgps/activity/message/CommunityFragment$g;

    iput-object p2, p0, Lcom/join/mgps/activity/message/CommunityFragment$g$d;->b:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    new-instance p1, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-direct {p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;-><init>()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment$g$d;->b:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->setPid(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment$g$d;->c:Lcom/join/mgps/activity/message/CommunityFragment$g;

    iget-object v0, v0, Lcom/join/mgps/activity/message/CommunityFragment$g;->b:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lcom/join/mgps/Util/j0;->w0(Landroid/content/Context;Lcom/join/mgps/dto/ForumBean$ForumPostsBean;Lcom/join/mgps/dto/ExtBean;)V

    return-void
.end method
