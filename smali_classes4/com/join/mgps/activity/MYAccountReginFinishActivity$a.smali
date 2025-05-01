.class Lcom/join/mgps/activity/MYAccountReginFinishActivity$a;
.super Ljava/lang/Object;
.source "MYAccountReginFinishActivity.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MYAccountReginFinishActivity;->afterview()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/MYAccountReginFinishActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MYAccountReginFinishActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MYAccountReginFinishActivity$a;->b:Lcom/join/mgps/activity/MYAccountReginFinishActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    if-nez p3, :cond_0

    .line 1
    new-instance p1, Lcom/tbruyelle/rxpermissions2/c;

    iget-object p2, p0, Lcom/join/mgps/activity/MYAccountReginFinishActivity$a;->b:Lcom/join/mgps/activity/MYAccountReginFinishActivity;

    invoke-direct {p1, p2}, Lcom/tbruyelle/rxpermissions2/c;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    const-string p2, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 2
    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/tbruyelle/rxpermissions2/c;->r([Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, Lcom/join/mgps/activity/MYAccountReginFinishActivity$a$a;

    invoke-direct {p2, p0}, Lcom/join/mgps/activity/MYAccountReginFinishActivity$a$a;-><init>(Lcom/join/mgps/activity/MYAccountReginFinishActivity$a;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/MYAccountReginFinishActivity$a;->b:Lcom/join/mgps/activity/MYAccountReginFinishActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MYAccountReginFinishActivity;->h0(Lcom/join/mgps/activity/MYAccountReginFinishActivity;)Lcom/join/mgps/adapter/a;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/join/mgps/adapter/a;->b(I)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/MYAccountReginFinishActivity$a;->b:Lcom/join/mgps/activity/MYAccountReginFinishActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MYAccountReginFinishActivity;->j0(Lcom/join/mgps/activity/MYAccountReginFinishActivity;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/db/tables/HeadPortraitTable;

    invoke-virtual {p2}, Lcom/join/mgps/db/tables/HeadPortraitTable;->getHead_portrait_pic()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/join/mgps/activity/MYAccountReginFinishActivity;->i0(Lcom/join/mgps/activity/MYAccountReginFinishActivity;Ljava/lang/String;)Ljava/lang/String;

    :goto_0
    return-void
.end method
