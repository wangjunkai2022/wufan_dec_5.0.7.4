.class public Lcom/join/mgps/activity/MyGameManagerActivity;
.super Lcom/BaseActivity;
.source "MyGameManagerActivity.java"


# annotations
.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c0079
.end annotation


# instance fields
.field b:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Landroidx/fragment/app/Fragment;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/BaseActivity;-><init>()V

    return-void
.end method


# virtual methods
.method afterViews()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v0

    .line 3
    new-instance v1, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {v1, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->isBsideInt()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v1

    invoke-virtual {v1}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    .line 4
    invoke-static {}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->b2()Lcom/join/mgps/activity/MyGamePapaFragmentV2_$b0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$b0;->a()Lcom/join/mgps/activity/MyGamePapaFragmentV2;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/MyGameManagerActivity;->c:Landroidx/fragment/app/Fragment;

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {}, Lcom/join/mgps/activity/MyGamePapaFragment_;->Z1()Lcom/join/mgps/activity/MyGamePapaFragment_$b0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/activity/MyGamePapaFragment_$b0;->a()Lcom/join/mgps/activity/MyGamePapaFragment;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/MyGameManagerActivity;->c:Landroidx/fragment/app/Fragment;

    :goto_0
    const v1, 0x7f09061c

    .line 6
    iget-object v2, p0, Lcom/join/mgps/activity/MyGameManagerActivity;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 7
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    .line 8
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->enterMyGameCentre:Lcom/papa/sim/statistic/Event;

    new-instance v2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    return-void
.end method
