.class Lcom/join/mgps/activity/GamedetialModleBtFragemnt$d;
.super Ljava/lang/Object;
.source "GamedetialModleBtFragemnt.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$d;->b:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$d;->b:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget-object p1, p1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->v1:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/PaPaBannerListActivity_;->k0(Landroid/content/Context;)Lcom/join/mgps/activity/PaPaBannerListActivity_$f;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/PaPaBannerListActivity_$f;->e(I)Lcom/join/mgps/activity/PaPaBannerListActivity_$f;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/PaPaBannerListActivity_$f;->a(Z)Lcom/join/mgps/activity/PaPaBannerListActivity_$f;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$d;->b:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    invoke-static {v0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->h0(Lcom/join/mgps/activity/GamedetialModleBtFragemnt;)Lcom/join/mgps/dto/GamedetialModleFourBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_company_id()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/PaPaBannerListActivity_$f;->c(Ljava/lang/String;)Lcom/join/mgps/activity/PaPaBannerListActivity_$f;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$d;->b:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    invoke-static {v0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->h0(Lcom/join/mgps/activity/GamedetialModleBtFragemnt;)Lcom/join/mgps/dto/GamedetialModleFourBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCompany_name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/PaPaBannerListActivity_$f;->d(Ljava/lang/String;)Lcom/join/mgps/activity/PaPaBannerListActivity_$f;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method
