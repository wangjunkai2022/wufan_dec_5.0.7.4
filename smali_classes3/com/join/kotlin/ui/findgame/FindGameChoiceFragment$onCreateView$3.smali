.class public final Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment$onCreateView$3;
.super Ljava/lang/Object;
.source "FindGameChoiceFragment.kt"

# interfaces
.implements Lcom/join/android/app/component/xrecyclerview/XRecyclerView$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $requestArgs:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;


# direct methods
.method constructor <init>(Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment$onCreateView$3;->this$0:Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;

    iput-object p2, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment$onCreateView$3;->$requestArgs:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment$onCreateView$3;->$requestArgs:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;

    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment$onCreateView$3;->this$0:Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getPage()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;->setPage(I)V

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment$onCreateView$3;->this$0:Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;

    invoke-virtual {v0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getPrensenter()Lcom/join/kotlin/presenter/FindModlePrensenter;

    move-result-object v0

    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment$onCreateView$3;->this$0:Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment$onCreateView$3;->$requestArgs:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v2, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;

    invoke-virtual {v0, v1, v2}, Lcom/join/kotlin/presenter/FindModlePrensenter;->loadFindChoiceData(Landroid/content/Context;Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;)V

    return-void
.end method

.method public onRefresh()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment$onCreateView$3;->this$0:Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->setPage(I)V

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment$onCreateView$3;->this$0:Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;

    invoke-virtual {v0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;->f:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->reset()V

    .line 3
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment$onCreateView$3;->$requestArgs:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;

    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment$onCreateView$3;->this$0:Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getPage()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;->setPage(I)V

    .line 4
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment$onCreateView$3;->this$0:Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;

    invoke-virtual {v0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getPrensenter()Lcom/join/kotlin/presenter/FindModlePrensenter;

    move-result-object v0

    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment$onCreateView$3;->this$0:Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment$onCreateView$3;->$requestArgs:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v2, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;

    invoke-virtual {v0, v1, v2}, Lcom/join/kotlin/presenter/FindModlePrensenter;->loadFindChoiceData(Landroid/content/Context;Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;)V

    return-void
.end method
