.class Lcom/join/mgps/activity/ForumPostsActivity$f0$a;
.super Ljava/lang/Object;
.source "ForumPostsActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/ForumPostsActivity$f0;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/ForumPostsActivity$f0;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/ForumPostsActivity$f0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity$f0$a;->b:Lcom/join/mgps/activity/ForumPostsActivity$f0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity$f0$a;->b:Lcom/join/mgps/activity/ForumPostsActivity$f0;

    iget-boolean v0, p1, Lcom/join/mgps/activity/ForumPostsActivity$f0;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p1, Lcom/join/mgps/activity/ForumPostsActivity$f0;->d:Z

    .line 3
    invoke-static {p1}, Lcom/join/mgps/activity/ForumPostsActivity$f0;->a(Lcom/join/mgps/activity/ForumPostsActivity$f0;)Lcom/join/mgps/activity/ForumPostsActivity$f0$c;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity$f0$a;->b:Lcom/join/mgps/activity/ForumPostsActivity$f0;

    invoke-static {p1}, Lcom/join/mgps/activity/ForumPostsActivity$f0;->a(Lcom/join/mgps/activity/ForumPostsActivity$f0;)Lcom/join/mgps/activity/ForumPostsActivity$f0$c;

    move-result-object p1

    invoke-interface {p1}, Lcom/join/mgps/activity/ForumPostsActivity$f0$c;->b()V

    :cond_1
    return-void
.end method
