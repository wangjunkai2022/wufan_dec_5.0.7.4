.class public Lcom/join/mgps/dialog/DownloadMethodMultiDialog;
.super Lcom/BaseActivity;
.source "DownloadMethodMultiDialog.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/dialog/DownloadMethodMultiDialog$c;,
        Lcom/join/mgps/dialog/DownloadMethodMultiDialog$b;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c051e
.end annotation


# instance fields
.field private A:Lcom/join/mgps/dialog/DownloadMethodMultiDialog$c;

.field private B:Z

.field C:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field D:Lcom/join/mgps/dialog/DownloadMethodMultiDialog$b;

.field private E:Landroid/database/ContentObserver;

.field b:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field i:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field j:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field k:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field l:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field m:Lcom/join/mgps/pref/PrefDef_;
    .annotation build Lorg/androidannotations/annotations/sharedpreferences/Pref;
    .end annotation
.end field

.field n:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field o:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field p:Z
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field q:Z
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field r:Lcom/join/mgps/dto/DownloadGameArgsBean;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field s:Z
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field t:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field u:I
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field v:I
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field w:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field x:Z
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field y:Lcom/join/mgps/rpc/k;

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/BaseActivity;-><init>()V

    .line 2
    new-instance v0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog$a;

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog$a;-><init>(Lcom/join/mgps/dialog/DownloadMethodMultiDialog;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->E:Landroid/database/ContentObserver;

    return-void
.end method

.method public static checkDeviceHasNavigationBar(Landroid/content/Context;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const-string v0, "config_showNavigationBar"

    const-string v1, "bool"

    const-string v2, "android"

    .line 2
    invoke-virtual {p0, v0, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    :try_start_0
    const-string v0, "android.os.SystemProperties"

    .line 4
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v2, "get"

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Class;

    .line 5
    const-class v5, Ljava/lang/String;

    aput-object v5, v4, v1

    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v4, v3, [Ljava/lang/Object;

    const-string v5, "qemu.hw.mainkeys"

    aput-object v5, v4, v1

    .line 6
    invoke-virtual {v2, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v2, "1"

    .line 7
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    const-string v1, "0"

    .line 8
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    move v1, p0

    :goto_1
    move p0, v1

    :catch_0
    return p0
.end method

.method public static synthetic g0(Lcom/join/mgps/dialog/DownloadMethodMultiDialog;Ljava/util/List;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->n0(Ljava/util/List;Landroid/view/View;)V

    return-void
.end method

.method private getNavigationBarHeight()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "navigation_bar_height"

    const-string v2, "dimen"

    const-string v3, "android"

    .line 2
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    return v0
.end method

.method public static getScreenHeight(Landroid/content/Context;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    .line 2
    iget p0, p0, Landroid/util/DisplayMetrics;->heightPixels:I

    return p0
.end method

.method static synthetic i0(Lcom/join/mgps/dialog/DownloadMethodMultiDialog;)I
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->getNavigationBarHeight()I

    move-result p0

    return p0
.end method

.method private m0(Lcom/join/mgps/dto/QueryDownloadInfoResponseData;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getDownloadHtmls()Ljava/util/List;

    move-result-object p1

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->b:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 4
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->z:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 5
    invoke-interface {p1, v0, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    .line 6
    :goto_0
    new-instance v2, Lcom/join/mgps/dialog/DownloadMethodMultiDialog$c;

    invoke-direct {v2, p0, v0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog$c;-><init>(Lcom/join/mgps/dialog/DownloadMethodMultiDialog;Ljava/util/List;)V

    iput-object v2, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->A:Lcom/join/mgps/dialog/DownloadMethodMultiDialog$c;

    .line 7
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 8
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v1, :cond_1

    iget-boolean v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->z:Z

    if-nez v0, :cond_1

    .line 9
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c03c5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0905cc

    .line 10
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 11
    new-instance v2, Lcom/join/mgps/dialog/i0;

    invoke-direct {v2, p0, p1}, Lcom/join/mgps/dialog/i0;-><init>(Lcom/join/mgps/dialog/DownloadMethodMultiDialog;Ljava/util/List;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    iget-object p1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->A:Lcom/join/mgps/dialog/DownloadMethodMultiDialog$c;

    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseQuickAdapter;->addFooterView(Landroid/view/View;)I

    :cond_1
    return-void
.end method

.method private synthetic n0(Ljava/util/List;Landroid/view/View;)V
    .locals 0

    const/4 p2, 0x1

    .line 1
    iput-boolean p2, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->z:Z

    .line 2
    iget-object p2, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->A:Lcom/join/mgps/dialog/DownloadMethodMultiDialog$c;

    invoke-virtual {p2, p1}, Lcom/join/mgps/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->A:Lcom/join/mgps/dialog/DownloadMethodMultiDialog$c;

    invoke-virtual {p1}, Lcom/join/mgps/base/BaseQuickAdapter;->removeAllFooterView()V

    return-void
.end method

.method private registerNavigationBarObserver()V
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const-string v2, "navigationbar_is_min"

    const/16 v3, 0x15

    if-ge v0, v3, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 3
    invoke-static {v2}, Landroid/provider/Settings$System;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->E:Landroid/database/ContentObserver;

    .line 4
    invoke-virtual {v0, v2, v1, v3}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 6
    invoke-static {v2}, Landroid/provider/Settings$Global;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->E:Landroid/database/ContentObserver;

    .line 7
    invoke-virtual {v0, v2, v1, v3}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    :goto_0
    return-void
.end method


# virtual methods
.method afterViews()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->y:Lcom/join/mgps/rpc/k;

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v1

    sget-object v2, Lcom/papa/sim/statistic/Event;->showCopyright:Lcom/papa/sim/statistic/Event;

    iget-object v3, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->n:Ljava/lang/String;

    invoke-virtual {v1, v2, v0, v3}, Lcom/papa/sim/statistic/p;->Y0(Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->n:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->finish()V

    return-void

    .line 6
    :cond_0
    iget-boolean v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->p:Z

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->l:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->h:Landroid/widget/TextView;

    const-string v1, "\u300a\u609f\u996d\u6e38\u620f\u5385\u4e0b\u8f7d\u534f\u8bae\u300b"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    invoke-virtual {p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->l0()V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->t:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    if-nez v0, :cond_2

    .line 11
    invoke-virtual {p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->p0()V

    goto :goto_0

    .line 12
    :cond_2
    invoke-virtual {p0, v0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->update(Lcom/join/mgps/dto/QueryDownloadInfoResponseData;)V

    :goto_0
    return-void
.end method

.method close()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v1

    sget-object v2, Lcom/papa/sim/statistic/Event;->closeCopyright:Lcom/papa/sim/statistic/Event;

    iget-object v3, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->n:Ljava/lang/String;

    invoke-virtual {v1, v2, v0, v3}, Lcom/papa/sim/statistic/p;->Y0(Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->finish()V

    return-void
.end method

.method public finish()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    const/4 v0, 0x0

    const v1, 0x7f01001e

    .line 2
    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method h0(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method public isNavigationBarShow()Z
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, 0x11

    if-lt v0, v3, :cond_4

    .line 2
    :try_start_0
    invoke-static {}, Lcom/join/mgps/Util/k1;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/k1;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/join/mgps/Util/k1;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1

    .line 4
    :cond_1
    invoke-static {}, Lcom/join/mgps/Util/k1;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v3, "force_fsg_nav_bar"

    invoke-static {v0, v3, v2}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_2

    return v2

    :catch_0
    move-exception v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 7
    :cond_2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 8
    new-instance v3, Landroid/graphics/Point;

    invoke-direct {v3}, Landroid/graphics/Point;-><init>()V

    .line 9
    new-instance v4, Landroid/graphics/Point;

    invoke-direct {v4}, Landroid/graphics/Point;-><init>()V

    .line 10
    invoke-virtual {v0, v3}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 11
    invoke-virtual {v0, v4}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 12
    iget v0, v4, Landroid/graphics/Point;->y:I

    iget v3, v3, Landroid/graphics/Point;->y:I

    if-eq v0, v3, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    return v1

    .line 13
    :cond_4
    invoke-static {p0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result v0

    const/4 v3, 0x4

    .line 14
    invoke-static {v3}, Landroid/view/KeyCharacterMap;->deviceHasKey(I)Z

    move-result v3

    if-nez v0, :cond_6

    if-eqz v3, :cond_5

    goto :goto_2

    :cond_5
    return v1

    :cond_6
    :goto_2
    return v2
.end method

.method j0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->i:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->isSelected()Z

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->i:Landroid/widget/ImageView;

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->i:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->isSelected()Z

    move-result v0

    .line 4
    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->e:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    const v2, 0x7f08038a

    goto :goto_0

    :cond_0
    const v2, 0x7f080e19

    :goto_0
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 5
    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->i:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    const v2, 0x7f08061e

    goto :goto_1

    :cond_1
    const v2, 0x7f08061f

    :goto_1
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    if-nez v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->u0(Z)V

    :cond_2
    return-void
.end method

.method k0()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->t:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    if-nez v1, :cond_0

    const-string v0, "\u83b7\u53d6\u4fe1\u606f\u5931\u8d25"

    .line 3
    invoke-virtual {p0, v0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->h0(Ljava/lang/String;)V

    return-void

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->i:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->isSelected()Z

    move-result v1

    if-nez v1, :cond_1

    const-string v0, "\u8bf7\u5148\u540c\u610f\u7528\u6237\u534f\u8bae"

    .line 5
    invoke-virtual {p0, v0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->h0(Ljava/lang/String;)V

    return-void

    .line 6
    :cond_1
    iget-boolean v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->B:Z

    if-eqz v1, :cond_2

    .line 7
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    const-string v1, "2"

    .line 8
    invoke-static {p0, v0, v1}, Lcom/join/mgps/Util/UtilsMy;->W3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/lang/String;)V

    .line 9
    invoke-virtual {p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->finish()V

    return-void

    .line 10
    :cond_2
    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->t:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    invoke-virtual {v1}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getBtnStatus()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_8

    .line 11
    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->t:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    invoke-virtual {v1}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getBtnStatus()Ljava/lang/String;

    move-result-object v1

    const-string v2, "open"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 12
    invoke-virtual {p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->t0()V

    goto/16 :goto_2

    .line 13
    :cond_3
    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->t:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    invoke-virtual {v1}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getBtnStatus()Ljava/lang/String;

    move-result-object v1

    const-string v2, "down"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 14
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v1

    sget-object v2, Lcom/papa/sim/statistic/Event;->downloadCopyright:Lcom/papa/sim/statistic/Event;

    iget-object v3, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->n:Ljava/lang/String;

    invoke-virtual {v1, v2, v0, v3}, Lcom/papa/sim/statistic/p;->Y0(Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 16
    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->t:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    if-eqz v1, :cond_5

    if-eqz v0, :cond_5

    .line 17
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    const/16 v2, 0x9

    if-eq v1, v2, :cond_4

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    if-ne v1, v2, :cond_5

    .line 18
    :cond_4
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 19
    invoke-static {v0}, Lcom/php25/PDownload/d;->b(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 20
    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->t:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    invoke-virtual {v1}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getVer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setVer(Ljava/lang/String;)V

    .line 21
    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->t:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    invoke-virtual {v1}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getVer_name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setVer_name(Ljava/lang/String;)V

    .line 22
    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->t:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    invoke-virtual {v1}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getDownloadURL()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setUrl(Ljava/lang/String;)V

    .line 23
    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->t:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    invoke-virtual {v1}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getResourceURL()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setResource_url_remote(Ljava/lang/String;)V

    .line 24
    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->t:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    invoke-virtual {v1}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getActualSize()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setActual_size(J)V

    .line 25
    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->t:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    invoke-virtual {v1}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getResourceSize()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRes_actual_size(J)V

    .line 26
    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setExt(Ljava/lang/String;)V

    .line 27
    iget-boolean v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->q:Z

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setFromRecomDown(Z)V

    .line 28
    iget-boolean v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->s:Z

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setDisableShowSpeedUpPrompt(Z)V

    .line 29
    invoke-static {v0, p0}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto :goto_1

    .line 30
    :cond_5
    invoke-static {p0}, Lcom/join/mgps/service/CommonService_;->S2(Landroid/content/Context;)Lcom/join/mgps/service/CommonService_$h2;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->n:Ljava/lang/String;

    const-string v2, "downGameId"

    .line 31
    invoke-virtual {v0, v2, v1}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->o:Ljava/lang/String;

    const-string v2, "ext"

    .line 32
    invoke-virtual {v0, v2, v1}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->t:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    const-string v2, "data"

    .line 33
    invoke-virtual {v0, v2, v1}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/io/Serializable;)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    iget v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->u:I

    const-string v2, "_from"

    .line 34
    invoke-virtual {v0, v2, v1}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;I)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    iget v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->v:I

    const-string v2, "_from_type"

    .line 35
    invoke-virtual {v0, v2, v1}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;I)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    iget-boolean v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->q:Z

    const-string v2, "fromRecomDown"

    .line 36
    invoke-virtual {v0, v2, v1}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Z)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->r:Lcom/join/mgps/dto/DownloadGameArgsBean;

    const-string v2, "_downloadArgs"

    .line 37
    invoke-virtual {v0, v2, v1}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/io/Serializable;)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    iget-boolean v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->s:Z

    const-string v2, "disableShowSpeedUpPrompt"

    .line 38
    invoke-virtual {v0, v2, v1}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Z)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    .line 39
    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->t:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getResourceSize()J

    move-result-wide v1

    goto :goto_0

    :cond_6
    const-wide/16 v1, 0x0

    :goto_0
    const-string v3, "resourceSize"

    invoke-virtual {v0, v3, v1, v2}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;J)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    const/4 v1, 0x1

    const-string v2, "uncheckSelfSupport"

    .line 40
    invoke-virtual {v0, v2, v1}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Z)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/g;->a()Landroid/content/ComponentName;

    .line 41
    :cond_7
    :goto_1
    invoke-virtual {p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->finish()V

    :cond_8
    :goto_2
    return-void
.end method

.method l0()V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->registerContentResolver()V

    .line 2
    invoke-static {p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->checkDeviceHasNavigationBar(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->isNavigationBarShow()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->C:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 4
    invoke-direct {p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->getNavigationBarHeight()I

    move-result v1

    .line 5
    invoke-static {}, Lcom/join/mgps/Util/k1;->e()Z

    move-result v2

    if-eqz v2, :cond_0

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x13

    if-gt v2, v3, :cond_0

    const/4 v1, 0x0

    .line 6
    :cond_0
    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 7
    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->C:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method o0()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->q0()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x50

    invoke-virtual {p1, v0}, Landroid/view/Window;->setGravity(I)V

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    const/4 v0, -0x1

    .line 4
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/BaseActivity;->onDestroy()V

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->D:Lcom/join/mgps/dialog/DownloadMethodMultiDialog$b;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->E:Landroid/database/ContentObserver;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method p0()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    :try_start_0
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v1

    .line 4
    new-instance v2, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v2}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 5
    invoke-virtual {v2, p0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 6
    new-instance v3, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;

    invoke-direct {v3}, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;-><init>()V

    .line 7
    iget-object v4, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->n:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;->setGameId(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v3, v0}, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;->setUid(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v3, v1}, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;->setToken(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->y:Lcom/join/mgps/rpc/k;

    invoke-interface {v0, v2}, Lcom/join/mgps/rpc/k;->q(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 12
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v1

    const/16 v2, 0x258

    if-ne v1, v2, :cond_2

    .line 13
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    .line 14
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    invoke-virtual {p0, v0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->update(Lcom/join/mgps/dto/QueryDownloadInfoResponseData;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :cond_1
    const v0, 0x7f100299

    .line 16
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->h0(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method q0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->j:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->isSelected()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->u0(Z)V

    return-void
.end method

.method r0()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v1

    sget-object v2, Lcom/papa/sim/statistic/Event;->closeCopyright:Lcom/papa/sim/statistic/Event;

    iget-object v3, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->n:Ljava/lang/String;

    invoke-virtual {v1, v2, v0, v3}, Lcom/papa/sim/statistic/p;->Y0(Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->finish()V

    return-void
.end method

.method registerContentResolver()V
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog$b;

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog$b;-><init>(Lcom/join/mgps/dialog/DownloadMethodMultiDialog;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->D:Lcom/join/mgps/dialog/DownloadMethodMultiDialog$b;

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "navigationbar_hide_bar_enabled"

    invoke-static {v1}, Landroid/provider/Settings$Global;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->D:Lcom/join/mgps/dialog/DownloadMethodMultiDialog$b;

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 4
    invoke-direct {p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->registerNavigationBarObserver()V

    :cond_0
    return-void
.end method

.method s0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->t:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getUserProtocolURL()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 2
    :goto_0
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    invoke-virtual {v1, p0, v0}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public setContentView(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/BaseActivity;->setContentView(I)V

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x50

    invoke-virtual {p1, v0}, Landroid/view/Window;->setGravity(I)V

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    const/4 v0, -0x1

    .line 4
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    const p1, 0xffffff

    const/4 v0, 0x1

    .line 6
    invoke-static {p0, p1, v0}, Lcom/join/mgps/Util/c2;->o(Landroid/app/Activity;IZ)V

    return-void
.end method

.method t0()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v1

    sget-object v2, Lcom/papa/sim/statistic/Event;->openSourceUrl:Lcom/papa/sim/statistic/Event;

    iget-object v3, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->n:Ljava/lang/String;

    invoke-virtual {v1, v2, v0, v3}, Lcom/papa/sim/statistic/p;->Y0(Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->t:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getDownloadHTML()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 4
    :goto_0
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    invoke-virtual {v1, p0, v0}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method u0(Z)V
    .locals 2

    if-eqz p1, :cond_3

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->p:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->t:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getBtnStatus()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->t:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getBtnStatus()Ljava/lang/String;

    move-result-object v0

    const-string v1, "open"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->i:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->isSelected()Z

    move-result v0

    if-nez v0, :cond_3

    const-string p1, "\u8bf7\u5148\u540c\u610f\u7528\u6237\u534f\u8bae"

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->h0(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void

    .line 6
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->j:Landroid/widget/ImageView;

    if-eqz p1, :cond_4

    const v1, 0x7f08061e

    goto :goto_1

    :cond_4
    const v1, 0x7f08061f

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 8
    iget-boolean v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->x:Z

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->m:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->noPromptDownload()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    :cond_5
    return-void
.end method

.method update(Lcom/join/mgps/dto/QueryDownloadInfoResponseData;)V
    .locals 7
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iput-object p1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->t:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getBtnStatus()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    const-string v2, "\u7acb\u5373\u4e0b\u8f7d"

    const-string v3, "\u542f\u52a8"

    const/16 v4, 0x8

    const/4 v5, 0x0

    if-nez v0, :cond_3

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getBtnStatus()Ljava/lang/String;

    move-result-object v0

    const-string v6, "open"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1

    .line 6
    :cond_1
    invoke-virtual {p1}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getBtnStatus()Ljava/lang/String;

    move-result-object v0

    const-string v6, "down"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 7
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-boolean v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->p:Z

    if-nez v0, :cond_3

    .line 9
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 10
    invoke-virtual {p1}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->isSelectedNextTips()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->isSelectedUserProtocol()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 11
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    goto :goto_0

    .line 12
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 13
    :goto_0
    iget-boolean v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->x:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->m:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->noPromptDownload()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    iget-object v6, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->j:Landroid/widget/ImageView;

    invoke-virtual {v6}, Landroid/widget/ImageView;->isSelected()Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {v0, v6}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 14
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->f:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getSubTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->g:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getUserProtocolTxt()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->i:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->isSelectedUserProtocol()Z

    move-result v6

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 18
    invoke-direct {p0, p1}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->m0(Lcom/join/mgps/dto/QueryDownloadInfoResponseData;)V

    .line 19
    iget-object p1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->l:Landroid/widget/LinearLayout;

    iget-boolean v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->x:Z

    if-eqz v0, :cond_4

    const/16 v0, 0x8

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 20
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->n:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    if-eqz p1, :cond_8

    .line 21
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result p1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_7

    const/16 v0, 0x2a

    if-ne p1, v0, :cond_5

    goto :goto_4

    .line 22
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->k:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 23
    iget-object p1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->e:Landroid/widget/TextView;

    const v0, 0x7f08038a

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 24
    iget-object p1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->i:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->isSelected()Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    const v0, 0x7f080e19

    :goto_3
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 25
    iget-object p1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->e:Landroid/widget/TextView;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    iput-boolean v5, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->B:Z

    goto :goto_5

    .line 27
    :cond_7
    :goto_4
    iget-object p1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->k:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 28
    iget-object p1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->e:Landroid/widget/TextView;

    const v0, 0x7f0803ae

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 29
    iget-object p1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->e:Landroid/widget/TextView;

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    iput-boolean v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->B:Z

    :cond_8
    :goto_5
    return-void
.end method
