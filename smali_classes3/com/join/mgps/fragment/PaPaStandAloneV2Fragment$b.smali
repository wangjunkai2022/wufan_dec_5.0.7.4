.class Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$b;
.super Ljava/lang/Object;
.source "PaPaStandAloneV2Fragment.java"

# interfaces
.implements Lcom/join/mgps/customview/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$b;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRefresh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$b;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->isActivityFinish()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$b;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->W(Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$b;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->f:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->v()V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$b;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    const v1, 0x7f100299

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->showToast(Ljava/lang/String;)V

    return-void

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$b;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->X(Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;I)I

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$b;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->b0()V

    return-void
.end method
