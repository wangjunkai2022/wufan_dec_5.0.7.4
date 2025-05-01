.class Lcom/join/mgps/activity/ClassifyListGameFragment$a;
.super Ljava/lang/Object;
.source "ClassifyListGameFragment.java"

# interfaces
.implements Lcom/join/android/app/component/xrecyclerview/XRecyclerView$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/ClassifyListGameFragment;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/ClassifyListGameFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/ClassifyListGameFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ClassifyListGameFragment$a;->b:Lcom/join/mgps/activity/ClassifyListGameFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ClassifyListGameFragment$a;->b:Lcom/join/mgps/activity/ClassifyListGameFragment;

    invoke-static {v0}, Lcom/join/mgps/activity/ClassifyListGameFragment;->W(Lcom/join/mgps/activity/ClassifyListGameFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ClassifyListGameFragment$a;->b:Lcom/join/mgps/activity/ClassifyListGameFragment;

    invoke-static {v0}, Lcom/join/mgps/activity/ClassifyListGameFragment;->X(Lcom/join/mgps/activity/ClassifyListGameFragment;)I

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ClassifyListGameFragment$a;->b:Lcom/join/mgps/activity/ClassifyListGameFragment;

    invoke-static {v0}, Lcom/join/mgps/activity/ClassifyListGameFragment;->Z(Lcom/join/mgps/activity/ClassifyListGameFragment;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/ClassifyListGameFragment$a;->b:Lcom/join/mgps/activity/ClassifyListGameFragment;

    invoke-static {v2}, Lcom/join/mgps/activity/ClassifyListGameFragment;->a0(Lcom/join/mgps/activity/ClassifyListGameFragment;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/activity/ClassifyListGameFragment;->c0(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onRefresh()V
    .locals 0

    return-void
.end method
