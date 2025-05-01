.class Lcom/join/mgps/activity/CreateEndGameActivity$b;
.super Ljava/lang/Object;
.source "CreateEndGameActivity.java"

# interfaces
.implements Lcom/join/mgps/base/BaseQuickAdapter$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/CreateEndGameActivity;->v0(Landroid/view/View;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/CreateEndGameActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/CreateEndGameActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity$b;->a:Lcom/join/mgps/activity/CreateEndGameActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity$b;->a:Lcom/join/mgps/activity/CreateEndGameActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/CreateEndGameActivity;->v:Lcom/join/mgps/activity/CreateEndGameActivity$f;

    invoke-virtual {p1, p3}, Lcom/join/mgps/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/UserGameListBean;

    if-eqz p1, :cond_0

    .line 2
    iget-object p2, p0, Lcom/join/mgps/activity/CreateEndGameActivity$b;->a:Lcom/join/mgps/activity/CreateEndGameActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/CreateEndGameActivity;->B:Lcom/join/mgps/dto/UserGameListBean;

    invoke-virtual {p1, p2}, Lcom/join/mgps/dto/UserGameListBean;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 3
    iget-object p2, p0, Lcom/join/mgps/activity/CreateEndGameActivity$b;->a:Lcom/join/mgps/activity/CreateEndGameActivity;

    iput-object p1, p2, Lcom/join/mgps/activity/CreateEndGameActivity;->B:Lcom/join/mgps/dto/UserGameListBean;

    const/4 p3, 0x0

    .line 4
    iput-object p3, p2, Lcom/join/mgps/activity/CreateEndGameActivity;->s:Ljava/util/List;

    .line 5
    iput-object p3, p2, Lcom/join/mgps/activity/CreateEndGameActivity;->E:Lcom/join/mgps/dto/BossBean;

    .line 6
    iget-object p2, p2, Lcom/join/mgps/activity/CreateEndGameActivity;->p:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/UserGameListBean;->getGameName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity$b;->a:Lcom/join/mgps/activity/CreateEndGameActivity;

    iget-object p2, p1, Lcom/join/mgps/activity/CreateEndGameActivity;->q:Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-object p1, p1, Lcom/join/mgps/activity/CreateEndGameActivity;->B:Lcom/join/mgps/dto/UserGameListBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/UserGameListBean;->getGameIcon()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity$b;->a:Lcom/join/mgps/activity/CreateEndGameActivity;

    iget-object p2, p1, Lcom/join/mgps/activity/CreateEndGameActivity;->B:Lcom/join/mgps/dto/UserGameListBean;

    invoke-virtual {p2}, Lcom/join/mgps/dto/UserGameListBean;->getGameId()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Lcom/join/mgps/activity/CreateEndGameActivity;->b:Ljava/lang/String;

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity$b;->a:Lcom/join/mgps/activity/CreateEndGameActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/CreateEndGameActivity;->h0(Lcom/join/mgps/activity/CreateEndGameActivity;)V

    .line 10
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity$b;->a:Lcom/join/mgps/activity/CreateEndGameActivity;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/CreateEndGameActivity;->n0(Z)V

    .line 11
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity$b;->a:Lcom/join/mgps/activity/CreateEndGameActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/CreateEndGameActivity;->z:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    invoke-virtual {p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->p()V

    return-void
.end method
