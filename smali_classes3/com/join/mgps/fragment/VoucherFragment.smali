.class public Lcom/join/mgps/fragment/VoucherFragment;
.super Lcom/join/mgps/basefragment/BaseLoadingFragment;
.source "VoucherFragment.java"

# interfaces
.implements Lcom/join/mgps/listener/a$a;


# annotations
.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c028d
.end annotation


# instance fields
.field c:Lcom/join/mgps/customview/XListView2;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Lcom/join/mgps/rpc/o;

.field e:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private f:I

.field private g:Landroid/view/View;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private j:Landroid/widget/LinearLayout;

.field private k:Landroid/widget/LinearLayout;

.field private l:Z

.field private m:Lcom/join/mgps/adapter/x2;

.field private n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private o:Lcom/join/mgps/dto/AccountVoucherAd;

.field private p:Z

.field private q:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/basefragment/BaseLoadingFragment;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->f:I

    return-void
.end method

.method static synthetic f0(Lcom/join/mgps/fragment/VoucherFragment;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/fragment/VoucherFragment;->f:I

    return p1
.end method

.method static synthetic g0(Lcom/join/mgps/fragment/VoucherFragment;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->f:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/join/mgps/fragment/VoucherFragment;->f:I

    return v0
.end method


# virtual methods
.method protected W()I
    .locals 1

    const v0, 0x7f0c028d

    return v0
.end method

.method public X()I
    .locals 1

    const v0, 0x7f090c3f

    return v0
.end method

.method afterViews()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/rpc/impl/n;->h()Lcom/join/mgps/rpc/impl/n;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->d:Lcom/join/mgps/rpc/o;

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->q:Landroid/content/Context;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->n:Ljava/util/List;

    .line 4
    new-instance v0, Lcom/join/mgps/adapter/x2;

    iget-object v1, p0, Lcom/join/mgps/fragment/VoucherFragment;->n:Ljava/util/List;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/join/mgps/adapter/x2;-><init>(Ljava/util/List;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->m:Lcom/join/mgps/adapter/x2;

    .line 5
    iget-object v1, p0, Lcom/join/mgps/fragment/VoucherFragment;->c:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v1, v0}, Lcom/join/mgps/customview/XListView2;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->c:Lcom/join/mgps/customview/XListView2;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/XListView2;->setPreLoadCount(I)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->c:Lcom/join/mgps/customview/XListView2;

    new-instance v1, Lcom/join/mgps/fragment/VoucherFragment$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/VoucherFragment$a;-><init>(Lcom/join/mgps/fragment/VoucherFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/XListView2;->setPullLoadEnable(Lcom/join/mgps/customview/f;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->c:Lcom/join/mgps/customview/XListView2;

    new-instance v1, Lcom/join/mgps/fragment/VoucherFragment$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/VoucherFragment$b;-><init>(Lcom/join/mgps/fragment/VoucherFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/XListView2;->setPullRefreshEnable(Lcom/join/mgps/customview/g;)V

    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c072e

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->g:Landroid/view/View;

    const v1, 0x7f091218

    .line 10
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->j:Landroid/widget/LinearLayout;

    .line 11
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->g:Landroid/view/View;

    const v1, 0x7f090e01

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->k:Landroid/widget/LinearLayout;

    .line 12
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->g:Landroid/view/View;

    const v1, 0x7f090dfd

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->h:Landroid/widget/TextView;

    .line 13
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->g:Landroid/view/View;

    const v1, 0x7f0913c0

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->i:Landroid/widget/TextView;

    const v1, 0x7f10053b

    .line 14
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->h:Landroid/widget/TextView;

    const v1, 0x7f10053a

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->c:Lcom/join/mgps/customview/XListView2;

    iget-object v1, p0, Lcom/join/mgps/fragment/VoucherFragment;->g:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 17
    invoke-static {}, Lcom/join/mgps/listener/a;->b()Lcom/join/mgps/listener/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/listener/a;->a(Lcom/join/mgps/listener/a$a;)V

    .line 18
    invoke-virtual {p0}, Lcom/join/mgps/fragment/VoucherFragment;->loadData()V

    return-void
.end method

.method public h0()Lcom/join/mgps/dto/AccountVoucherAd;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->o:Lcom/join/mgps/dto/AccountVoucherAd;

    return-object v0
.end method

.method i0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/activity/HotVoucherActivity_;->x0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/HotVoucherActivity_$h;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method j0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->c:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->setNoMore()V

    return-void
.end method

.method k0(Lcom/join/mgps/dto/PapayVoucherResultMain;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/PapayVoucherResultMain<",
            "Lcom/join/mgps/dto/ResultMyVoucherBean;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/PapayVoucherResultMain;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/ResultMyVoucherBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/ResultMyVoucherBean;->getRecommend()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->l:Z

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    if-eqz p1, :cond_0

    .line 4
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->n:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->j:Landroid/widget/LinearLayout;

    const v1, 0x7f080fcc

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->j:Landroid/widget/LinearLayout;

    const v1, 0x7f060021

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 10
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/fragment/VoucherFragment;->n0()V

    .line 11
    invoke-virtual {p0}, Lcom/join/mgps/fragment/VoucherFragment;->j0()V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->c:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->g()V

    if-eqz p1, :cond_1

    .line 13
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_1

    goto :goto_1

    .line 14
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/fragment/VoucherFragment;->c:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {p1}, Lcom/join/mgps/customview/XListView2;->e()V

    :goto_1
    return-void
.end method

.method public l()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->f:I

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->c:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->q()V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/VoucherFragment;->loadData()V

    return-void
.end method

.method l0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f100299

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public loadData()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->q:Landroid/content/Context;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 3
    :try_start_0
    new-instance v0, Lorg/springframework/util/LinkedMultiValueMap;

    invoke-direct {v0}, Lorg/springframework/util/LinkedMultiValueMap;-><init>()V

    const-string/jumbo v1, "uid"

    .line 4
    iget-object v2, p0, Lcom/join/mgps/fragment/VoucherFragment;->q:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/springframework/util/LinkedMultiValueMap;->add(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string/jumbo v1, "token"

    .line 5
    iget-object v2, p0, Lcom/join/mgps/fragment/VoucherFragment;->q:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/springframework/util/LinkedMultiValueMap;->add(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "page"

    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget v3, p0, Lcom/join/mgps/fragment/VoucherFragment;->f:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/springframework/util/LinkedMultiValueMap;->add(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "limit"

    const-string v2, "10"

    .line 7
    invoke-virtual {v0, v1, v2}, Lorg/springframework/util/LinkedMultiValueMap;->add(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    iget-object v1, p0, Lcom/join/mgps/fragment/VoucherFragment;->d:Lcom/join/mgps/rpc/o;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/o;->l(Ljava/util/Map;)Lcom/join/mgps/dto/PapayVoucherResultMain;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 9
    invoke-virtual {v0}, Lcom/join/mgps/dto/PapayVoucherResultMain;->getError()I

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_4

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/PapayVoucherResultMain;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/ResultMyVoucherBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ResultMyVoucherBean;->getCoupons()Ljava/util/List;

    move-result-object v1

    .line 11
    invoke-virtual {v0}, Lcom/join/mgps/dto/PapayVoucherResultMain;->getData()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/ResultMyVoucherBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ResultMyVoucherBean;->getAd()Lcom/join/mgps/dto/AccountVoucherAd;

    move-result-object v3

    iput-object v3, p0, Lcom/join/mgps/fragment/VoucherFragment;->o:Lcom/join/mgps/dto/AccountVoucherAd;

    .line 12
    invoke-virtual {v0}, Lcom/join/mgps/dto/PapayVoucherResultMain;->getData()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/ResultMyVoucherBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ResultMyVoucherBean;->is_show_recommend_bar()Z

    move-result v3

    iput-boolean v3, p0, Lcom/join/mgps/fragment/VoucherFragment;->p:Z

    if-eqz v1, :cond_3

    .line 13
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_2

    .line 14
    iget v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->f:I

    if-ne v0, v2, :cond_1

    .line 15
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 16
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->n:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->l:Z

    goto :goto_0

    .line 18
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->n:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 19
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/fragment/VoucherFragment;->n0()V

    .line 20
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xa

    if-gt v0, v1, :cond_8

    .line 21
    invoke-virtual {p0}, Lcom/join/mgps/fragment/VoucherFragment;->j0()V

    goto :goto_1

    .line 22
    :cond_2
    iget v1, p0, Lcom/join/mgps/fragment/VoucherFragment;->f:I

    if-ne v1, v2, :cond_8

    .line 23
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/VoucherFragment;->k0(Lcom/join/mgps/dto/PapayVoucherResultMain;)V

    goto :goto_1

    .line 24
    :cond_3
    iget v1, p0, Lcom/join/mgps/fragment/VoucherFragment;->f:I

    if-ne v1, v2, :cond_8

    .line 25
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/VoucherFragment;->k0(Lcom/join/mgps/dto/PapayVoucherResultMain;)V

    goto :goto_1

    .line 26
    :cond_4
    iget v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->f:I

    if-ne v0, v2, :cond_5

    .line 27
    invoke-virtual {p0}, Lcom/join/mgps/fragment/VoucherFragment;->showLodingFailed()V

    goto :goto_1

    .line 28
    :cond_5
    invoke-virtual {p0}, Lcom/join/mgps/fragment/VoucherFragment;->j0()V

    goto :goto_1

    .line 29
    :cond_6
    invoke-virtual {p0}, Lcom/join/mgps/fragment/VoucherFragment;->showLodingFailed()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 31
    invoke-virtual {p0}, Lcom/join/mgps/fragment/VoucherFragment;->showLodingFailed()V

    goto :goto_1

    .line 32
    :cond_7
    invoke-virtual {p0}, Lcom/join/mgps/fragment/VoucherFragment;->showLodingFailed()V

    .line 33
    invoke-virtual {p0}, Lcom/join/mgps/fragment/VoucherFragment;->l0()V

    .line 34
    :cond_8
    :goto_1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/VoucherFragment;->m0()V

    return-void
.end method

.method m0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->c:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->u()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->c:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->v()V

    return-void
.end method

.method n0()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->l:Z

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->f:I

    const/4 v3, 0x1

    if-ne v0, v3, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->c:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->g()V

    goto :goto_1

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->c:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->q()V

    .line 7
    :goto_1
    iget-boolean v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->p:Z

    if-eqz v0, :cond_2

    .line 8
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_2

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 10
    :goto_2
    invoke-virtual {p0}, Lcom/join/mgps/basefragment/BaseLoadingFragment;->a0()V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->m:Lcom/join/mgps/adapter/x2;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method o0()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/VoucherFragment;->n0()V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 2
    invoke-static {}, Lcom/join/mgps/listener/a;->b()Lcom/join/mgps/listener/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/listener/a;->d(Lcom/join/mgps/listener/a$a;)V

    return-void
.end method

.method showLodingFailed()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment;->n:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/basefragment/BaseLoadingFragment;->c0()V

    :cond_1
    return-void
.end method
