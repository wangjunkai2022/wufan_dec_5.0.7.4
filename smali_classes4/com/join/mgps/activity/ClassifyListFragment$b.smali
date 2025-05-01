.class Lcom/join/mgps/activity/ClassifyListFragment$b;
.super Ljava/lang/Object;
.source "ClassifyListFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/ClassifyListFragment;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/ClassifyListFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/ClassifyListFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ClassifyListFragment$b;->b:Lcom/join/mgps/activity/ClassifyListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRefresh()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ClassifyListFragment$b;->b:Lcom/join/mgps/activity/ClassifyListFragment;

    invoke-static {v0}, Lcom/join/mgps/activity/ClassifyListFragment;->W(Lcom/join/mgps/activity/ClassifyListFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ClassifyListFragment$b;->b:Lcom/join/mgps/activity/ClassifyListFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/join/mgps/activity/ClassifyListFragment;->X(Lcom/join/mgps/activity/ClassifyListFragment;I)I

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ClassifyListFragment$b;->b:Lcom/join/mgps/activity/ClassifyListFragment;

    invoke-static {v0}, Lcom/join/mgps/activity/ClassifyListFragment;->a0(Lcom/join/mgps/activity/ClassifyListFragment;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/ClassifyListFragment$b;->b:Lcom/join/mgps/activity/ClassifyListFragment;

    invoke-static {v2}, Lcom/join/mgps/activity/ClassifyListFragment;->b0(Lcom/join/mgps/activity/ClassifyListFragment;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/activity/ClassifyListFragment;->f0(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
