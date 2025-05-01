.class public final Lcom/join/mgps/activity/UploadActivity_;
.super Lcom/join/mgps/activity/UploadActivity;
.source "UploadActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/UploadActivity_$t;
    }
.end annotation


# instance fields
.field private final P:La4/c;

.field private final Q:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final R:Landroid/content/IntentFilter;

.field private final S:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/UploadActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/UploadActivity_;->P:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/UploadActivity_;->Q:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/UploadActivity_;->R:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/activity/UploadActivity_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UploadActivity_$k;-><init>(Lcom/join/mgps/activity/UploadActivity_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/UploadActivity_;->S:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic K0(Lcom/join/mgps/activity/UploadActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/UploadActivity;->D0()V

    return-void
.end method

.method static synthetic L0(Lcom/join/mgps/activity/UploadActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/UploadActivity;->A0()V

    return-void
.end method

.method static synthetic M0(Lcom/join/mgps/activity/UploadActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/UploadActivity;->I0()V

    return-void
.end method

.method static synthetic N0(Lcom/join/mgps/activity/UploadActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/UploadActivity;->H0()V

    return-void
.end method

.method static synthetic O0(Lcom/join/mgps/activity/UploadActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/UploadActivity;->J0()V

    return-void
.end method

.method static synthetic P0(Lcom/join/mgps/activity/UploadActivity_;Landroid/content/Context;Lcom/papa/sim/statistic/UpLoadGameConfig;Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/activity/UploadActivity;->C0(Landroid/content/Context;Lcom/papa/sim/statistic/UpLoadGameConfig;Ljava/io/File;)V

    return-void
.end method

.method public static Q0(Landroid/content/Context;)Lcom/join/mgps/activity/UploadActivity_$t;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/UploadActivity_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UploadActivity_$t;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static R0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/UploadActivity_$t;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/UploadActivity_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UploadActivity_$t;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {p1, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    sput-object p1, Lcom/join/mgps/activity/UploadActivity;->J:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/UploadActivity_;->R:Landroid/content/IntentFilter;

    const-string v0, "upload"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method A0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/UploadActivity_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UploadActivity_$f;-><init>(Lcom/join/mgps/activity/UploadActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public C0(Landroid/content/Context;Lcom/papa/sim/statistic/UpLoadGameConfig;Ljava/io/File;)V
    .locals 10

    .line 1
    new-instance v9, Lcom/join/mgps/activity/UploadActivity_$j;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v9

    move-object v1, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-direct/range {v0 .. v8}, Lcom/join/mgps/activity/UploadActivity_$j;-><init>(Lcom/join/mgps/activity/UploadActivity_;Ljava/lang/String;JLjava/lang/String;Landroid/content/Context;Lcom/papa/sim/statistic/UpLoadGameConfig;Ljava/io/File;)V

    invoke-static {v9}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method D0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/UploadActivity_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UploadActivity_$e;-><init>(Lcom/join/mgps/activity/UploadActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method H0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/UploadActivity_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UploadActivity_$h;-><init>(Lcom/join/mgps/activity/UploadActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method I0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/UploadActivity_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UploadActivity_$g;-><init>(Lcom/join/mgps/activity/UploadActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method J0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/UploadActivity_$i;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/UploadActivity_$i;-><init>(Lcom/join/mgps/activity/UploadActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public getBean(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/UploadActivity_;->Q:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public internalFindViewById(I)Landroid/view/View;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/UploadActivity_;->P:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/UploadActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c0796

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/UploadActivity_;->setContentView(I)V

    return-void
.end method

.method public onPause()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/UploadActivity_;->S:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-super {p0}, Lcom/BaseActivity;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/BaseActivity;->onResume()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/UploadActivity_;->S:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/activity/UploadActivity_;->R:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 12

    const v0, 0x7f090670

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/UploadActivity;->i:Landroid/widget/TextView;

    const v0, 0x7f091009

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/UploadActivity;->j:Landroid/widget/TextView;

    const v0, 0x7f09057f

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/UploadActivity;->p:Landroid/widget/TextView;

    const v0, 0x7f09063c

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/UploadActivity;->q:Landroid/widget/TextView;

    const v0, 0x7f090822

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/UploadActivity;->r:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f090823

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/UploadActivity;->s:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f090824

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/UploadActivity;->t:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f090664

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/join/mgps/activity/UploadActivity;->x:Landroid/widget/EditText;

    const v0, 0x7f090633

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/join/mgps/activity/UploadActivity;->y:Landroid/widget/EditText;

    const v0, 0x7f090c0d

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, p0, Lcom/join/mgps/activity/UploadActivity;->A:Landroid/widget/ScrollView;

    const v0, 0x7f090c0e

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/UploadActivity;->B:Landroid/widget/LinearLayout;

    const v0, 0x7f090c0f

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/UploadActivity;->C:Landroid/widget/LinearLayout;

    const v0, 0x7f090c10

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/UploadActivity;->D:Landroid/widget/LinearLayout;

    const v0, 0x7f0904b0

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/UploadActivity;->E:Landroid/widget/TextView;

    const v0, 0x7f0904af

    .line 15
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/UploadActivity;->F:Landroid/widget/TextView;

    const v0, 0x7f0904b1

    .line 16
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/UploadActivity;->G:Landroid/widget/TextView;

    const v0, 0x7f090672

    .line 17
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f09100a

    .line 18
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f090580

    .line 19
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f090640

    .line 20
    invoke-interface {p1, v3}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v3

    const v4, 0x7f09084f

    .line 21
    invoke-interface {p1, v4}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v4

    const v5, 0x7f090139

    .line 22
    invoke-interface {p1, v5}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v5

    const v6, 0x7f091740

    .line 23
    invoke-interface {p1, v6}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v6

    const v7, 0x7f09173e

    .line 24
    invoke-interface {p1, v7}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v7

    const v8, 0x7f091339

    .line 25
    invoke-interface {p1, v8}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v8

    const v9, 0x7f0910cb

    .line 26
    invoke-interface {p1, v9}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v9

    const v10, 0x7f0903aa

    .line 27
    invoke-interface {p1, v10}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v10

    const v11, 0x7f091128

    .line 28
    invoke-interface {p1, v11}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 29
    new-instance v11, Lcom/join/mgps/activity/UploadActivity_$l;

    invoke-direct {v11, p0}, Lcom/join/mgps/activity/UploadActivity_$l;-><init>(Lcom/join/mgps/activity/UploadActivity_;)V

    invoke-virtual {v0, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz v1, :cond_1

    .line 30
    new-instance v0, Lcom/join/mgps/activity/UploadActivity_$m;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UploadActivity_$m;-><init>(Lcom/join/mgps/activity/UploadActivity_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    if-eqz v2, :cond_2

    .line 31
    new-instance v0, Lcom/join/mgps/activity/UploadActivity_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UploadActivity_$n;-><init>(Lcom/join/mgps/activity/UploadActivity_;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    if-eqz v3, :cond_3

    .line 32
    new-instance v0, Lcom/join/mgps/activity/UploadActivity_$o;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UploadActivity_$o;-><init>(Lcom/join/mgps/activity/UploadActivity_;)V

    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    if-eqz v4, :cond_4

    .line 33
    new-instance v0, Lcom/join/mgps/activity/UploadActivity_$p;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UploadActivity_$p;-><init>(Lcom/join/mgps/activity/UploadActivity_;)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    if-eqz v5, :cond_5

    .line 34
    new-instance v0, Lcom/join/mgps/activity/UploadActivity_$q;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UploadActivity_$q;-><init>(Lcom/join/mgps/activity/UploadActivity_;)V

    invoke-virtual {v5, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_5
    if-eqz v6, :cond_6

    .line 35
    new-instance v0, Lcom/join/mgps/activity/UploadActivity_$r;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UploadActivity_$r;-><init>(Lcom/join/mgps/activity/UploadActivity_;)V

    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_6
    if-eqz v7, :cond_7

    .line 36
    new-instance v0, Lcom/join/mgps/activity/UploadActivity_$s;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UploadActivity_$s;-><init>(Lcom/join/mgps/activity/UploadActivity_;)V

    invoke-virtual {v7, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_7
    if-eqz v8, :cond_8

    .line 37
    new-instance v0, Lcom/join/mgps/activity/UploadActivity_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UploadActivity_$a;-><init>(Lcom/join/mgps/activity/UploadActivity_;)V

    invoke-virtual {v8, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_8
    if-eqz v9, :cond_9

    .line 38
    new-instance v0, Lcom/join/mgps/activity/UploadActivity_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UploadActivity_$b;-><init>(Lcom/join/mgps/activity/UploadActivity_;)V

    invoke-virtual {v9, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_9
    if-eqz v10, :cond_a

    .line 39
    new-instance v0, Lcom/join/mgps/activity/UploadActivity_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UploadActivity_$c;-><init>(Lcom/join/mgps/activity/UploadActivity_;)V

    invoke-virtual {v10, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_a
    if-eqz p1, :cond_b

    .line 40
    new-instance v0, Lcom/join/mgps/activity/UploadActivity_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UploadActivity_$d;-><init>(Lcom/join/mgps/activity/UploadActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 41
    :cond_b
    invoke-virtual {p0}, Lcom/join/mgps/activity/UploadActivity;->afterView()V

    return-void
.end method

.method public putBean(Ljava/lang/Class;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/UploadActivity_;->Q:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/UploadActivity_;->P:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/UploadActivity_;->P:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/UploadActivity_;->P:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method
