.class public Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;
.super Landroidx/fragment/app/Fragment;
.source "PaPaStandAloneOverSeaFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment$d;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c0292
.end annotation


# static fields
.field public static final h:I = 0x1

.field public static final i:I = 0x2

.field public static final j:I = 0x3


# instance fields
.field b:I

.field c:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Lcom/join/mgps/customview/InterceptEventViewPager;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Lcom/join/mgps/fragment/PaPaBannerListFragment;

.field g:Lcom/join/mgps/fragment/PaPaBannerListFragment;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method

.method public static X(I)Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment_;

    invoke-direct {v0}, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment_;-><init>()V

    .line 2
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string/jumbo v2, "type"

    .line 3
    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 4
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method V()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/16 v0, 0xe

    return v0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    const/16 v0, 0x10

    return v0

    :cond_1
    const/16 v0, 0x12

    return v0
.end method

.method W()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/16 v0, 0xf

    return v0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    const/16 v0, 0x11

    return v0

    :cond_1
    const/16 v0, 0x13

    return v0
.end method

.method Z(I)Landroidx/fragment/app/Fragment;
    .locals 1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->g:Lcom/join/mgps/fragment/PaPaBannerListFragment;

    if-nez p1, :cond_1

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->W()I

    move-result p1

    invoke-static {p1}, Lcom/join/mgps/fragment/PaPaBannerListFragment;->l0(I)Lcom/join/mgps/fragment/PaPaBannerListFragment;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->g:Lcom/join/mgps/fragment/PaPaBannerListFragment;

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->g:Lcom/join/mgps/fragment/PaPaBannerListFragment;

    return-object p1

    .line 4
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->f:Lcom/join/mgps/fragment/PaPaBannerListFragment;

    if-nez p1, :cond_3

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->V()I

    move-result p1

    invoke-static {p1}, Lcom/join/mgps/fragment/PaPaBannerListFragment;->l0(I)Lcom/join/mgps/fragment/PaPaBannerListFragment;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->f:Lcom/join/mgps/fragment/PaPaBannerListFragment;

    .line 6
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->f:Lcom/join/mgps/fragment/PaPaBannerListFragment;

    return-object p1
.end method

.method afterViews()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->c:Landroid/widget/TextView;

    new-instance v1, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment$a;-><init>(Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->d:Landroid/widget/TextView;

    new-instance v1, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment$b;-><init>(Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3
    new-instance v0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment$d;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment$d;-><init>(Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;Landroidx/fragment/app/FragmentManager;)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->e:Lcom/join/mgps/customview/InterceptEventViewPager;

    new-instance v2, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment$c;

    invoke-direct {v2, p0}, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment$c;-><init>(Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;)V

    invoke-virtual {v1, v2}, Lcom/join/mgps/customview/InterceptEventViewPager;->setViewPagerCallback(Lcom/join/mgps/customview/InterceptEventViewPager$c;)V

    .line 5
    iget-object v1, p0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->e:Lcom/join/mgps/customview/InterceptEventViewPager;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/join/mgps/customview/InterceptEventViewPager;->setIsAsParentViewPager(Z)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->e:Lcom/join/mgps/customview/InterceptEventViewPager;

    invoke-virtual {v1, v0}, Lcom/join/mgps/customview/InterceptEventViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->e:Lcom/join/mgps/customview/InterceptEventViewPager;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->e:Lcom/join/mgps/customview/InterceptEventViewPager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/InterceptEventViewPager;->setCurrentItem(I)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->c:Landroid/widget/TextView;

    const-string v1, "#F47500"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->d:Landroid/widget/TextView;

    const-string v1, "#4A4A4A"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string/jumbo v0, "type"

    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->b:I

    return-void
.end method
