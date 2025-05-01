.class public final Lcom/join/mgps/activity/SearchHintActivity_;
.super Lcom/join/mgps/activity/SearchHintActivity;
.source "SearchHintActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/SearchHintActivity_$b0;
    }
.end annotation


# static fields
.field public static final Q1:Ljava/lang/String; = "keyword"

.field public static final R1:Ljava/lang/String; = "from"

.field public static final S1:Ljava/lang/String; = "keywords"

.field public static final T1:Ljava/lang/String; = "interval"


# instance fields
.field private final M1:La4/c;

.field private final N1:Ljava/util/Map;
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

.field private final O1:Landroid/content/IntentFilter;

.field private final P1:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/SearchHintActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity_;->M1:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity_;->N1:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity_;->O1:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/activity/SearchHintActivity_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SearchHintActivity_$k;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity_;->P1:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic A1(Lcom/join/mgps/activity/SearchHintActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/SearchHintActivity;->d1()V

    return-void
.end method

.method static synthetic B1(Lcom/join/mgps/activity/SearchHintActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/SearchHintActivity;->n0(I)V

    return-void
.end method

.method static synthetic C1(Lcom/join/mgps/activity/SearchHintActivity_;Lcom/join/mgps/activity/search/SearchIndexData;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/SearchHintActivity;->i1(Lcom/join/mgps/activity/search/SearchIndexData;Z)V

    return-void
.end method

.method static synthetic D1(Lcom/join/mgps/activity/SearchHintActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/SearchHintActivity;->Q0()V

    return-void
.end method

.method static synthetic E1(Lcom/join/mgps/activity/SearchHintActivity_;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/SearchHintActivity;->g1(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic F1(Lcom/join/mgps/activity/SearchHintActivity_;Ljava/util/List;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/SearchHintActivity;->k1(Ljava/util/List;I)V

    return-void
.end method

.method public static G1(Landroid/content/Context;)Lcom/join/mgps/activity/SearchHintActivity_$b0;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SearchHintActivity_$b0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SearchHintActivity_$b0;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static H1(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/SearchHintActivity_$b0;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SearchHintActivity_$b0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SearchHintActivity_$b0;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 2
    new-instance v0, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {v0, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->p1:Lcom/join/mgps/pref/PrefDef_;

    .line 3
    invoke-static {p0}, La4/c;->b(La4/b;)V

    const v0, 0x7f10029a

    .line 4
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->Q:Ljava/lang/String;

    const v0, 0x7f1000b6

    .line 5
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity;->R:Ljava/lang/String;

    .line 6
    invoke-direct {p0}, Lcom/join/mgps/activity/SearchHintActivity_;->injectExtras_()V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity_;->O1:Landroid/content/IntentFilter;

    const-string v0, "com.broadcast.bespeak.sussess"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity_;->P1:Landroid/content/BroadcastReceiver;

    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity_;->O1:Landroid/content/IntentFilter;

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method private injectExtras_()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v1, "keyword"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/SearchHintActivity;->b:Ljava/lang/String;

    :cond_0
    const-string v1, "from"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/join/mgps/activity/SearchHintActivity;->c:I

    :cond_1
    const-string v1, "keywords"

    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    iput-object v1, p0, Lcom/join/mgps/activity/SearchHintActivity;->d:Ljava/util/ArrayList;

    :cond_2
    const-string v1, "interval"

    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->e:I

    :cond_3
    return-void
.end method

.method static synthetic m1(Lcom/join/mgps/activity/SearchHintActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/SearchHintActivity;->c1()V

    return-void
.end method

.method static synthetic n1(Lcom/join/mgps/activity/SearchHintActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/SearchHintActivity;->serverConnectionException()V

    return-void
.end method

.method static synthetic o1(Lcom/join/mgps/activity/SearchHintActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/SearchHintActivity;->l1()V

    return-void
.end method

.method static synthetic p1(Lcom/join/mgps/activity/SearchHintActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/SearchHintActivity;->P0()V

    return-void
.end method

.method static synthetic q1(Lcom/join/mgps/activity/SearchHintActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/SearchHintActivity;->m0(I)V

    return-void
.end method

.method static synthetic r1(Lcom/join/mgps/activity/SearchHintActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/SearchHintActivity;->Y0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic s1(Lcom/join/mgps/activity/SearchHintActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/SearchHintActivity;->L0()V

    return-void
.end method

.method static synthetic t1(Lcom/join/mgps/activity/SearchHintActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/SearchHintActivity;->u0()V

    return-void
.end method

.method static synthetic u1(Lcom/join/mgps/activity/SearchHintActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/SearchHintActivity;->p0()V

    return-void
.end method

.method static synthetic v1(Lcom/join/mgps/activity/SearchHintActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/SearchHintActivity;->t0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic w1(Lcom/join/mgps/activity/SearchHintActivity_;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/SearchHintActivity;->A0(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic x1(Lcom/join/mgps/activity/SearchHintActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/SearchHintActivity;->w0()V

    return-void
.end method

.method static synthetic y1(Lcom/join/mgps/activity/SearchHintActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/SearchHintActivity;->a1()V

    return-void
.end method

.method static synthetic z1(Lcom/join/mgps/activity/SearchHintActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/SearchHintActivity;->b1()V

    return-void
.end method


# virtual methods
.method A0(Ljava/lang/String;I)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/activity/SearchHintActivity_$r;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move-object v6, p1

    move v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/activity/SearchHintActivity_$r;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;I)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method L0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/SearchHintActivity_$n;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/SearchHintActivity_$n;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method P0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SearchHintActivity_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SearchHintActivity_$j;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Q0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SearchHintActivity_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SearchHintActivity_$f;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Y0(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/SearchHintActivity_$m;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/SearchHintActivity_$m;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method a1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SearchHintActivity_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SearchHintActivity_$a;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method b1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SearchHintActivity_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SearchHintActivity_$b;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method c1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SearchHintActivity_$z;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SearchHintActivity_$z;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x12c

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method d1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SearchHintActivity_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SearchHintActivity_$c;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method g1(Ljava/lang/String;I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SearchHintActivity_$g;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/SearchHintActivity_$g;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;Ljava/lang/String;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity_;->N1:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method i1(Lcom/join/mgps/activity/search/SearchIndexData;Z)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SearchHintActivity_$e;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/SearchHintActivity_$e;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;Lcom/join/mgps/activity/search/SearchIndexData;Z)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
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
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method k1(Ljava/util/List;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/SearchAutoDataBean;",
            ">;I)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SearchHintActivity_$h;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/SearchHintActivity_$h;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;Ljava/util/List;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method l1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SearchHintActivity_$a0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SearchHintActivity_$a0;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method m0(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SearchHintActivity_$l;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/SearchHintActivity_$l;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method n0(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SearchHintActivity_$d;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/SearchHintActivity_$d;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity_;->M1:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/SearchHintActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c0730

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/SearchHintActivity_;->setContentView(I)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity_;->P1:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-super {p0}, Lcom/join/mgps/activity/SearchHintActivity;->onDestroy()V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 2

    const v0, 0x7f090d57

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/ForumLoadingView;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->f:Lcom/join/mgps/customview/ForumLoadingView;

    const v0, 0x7f091119

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->g:Landroid/view/View;

    const v0, 0x7f09178c

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager2/widget/ViewPager2;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->h:Landroidx/viewpager2/widget/ViewPager2;

    const v0, 0x7f091216

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->j:Landroid/widget/EditText;

    const v0, 0x7f090856

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->k:Landroid/widget/ImageView;

    const v0, 0x7f091214

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->l:Landroid/widget/ImageView;

    const v0, 0x7f09084a

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->m:Landroid/widget/ImageView;

    const v0, 0x7f090321

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->n:Landroid/widget/LinearLayout;

    const v0, 0x7f0910df

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->o:Landroid/view/View;

    const v0, 0x7f091818

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/WrapContentGridView;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->p:Lcom/join/mgps/customview/WrapContentGridView;

    const v0, 0x7f09064d

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/WrapContentGridView;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->q:Lcom/join/mgps/customview/WrapContentGridView;

    const v0, 0x7f0905c1

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/FlowLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->r:Lcom/join/mgps/customview/FlowLayout;

    const v0, 0x7f090cb0

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->s:Landroid/view/View;

    const v0, 0x7f090cb2

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->t:Landroid/view/View;

    const v0, 0x7f090cac

    .line 15
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->u:Landroid/view/View;

    const v0, 0x7f090cc8

    .line 16
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->v:Landroid/view/View;

    const v0, 0x7f09008f

    .line 17
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->w:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f09014e

    .line 18
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/youth/banner/Banner;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->x:Lcom/youth/banner/Banner;

    const v0, 0x7f0917b0

    .line 19
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->y:Landroidx/viewpager/widget/ViewPager;

    const v0, 0x7f091356

    .line 20
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->z:Lcom/google/android/material/tabs/TabLayout;

    const v0, 0x7f090751

    .line 21
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/FlowLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->A:Lcom/join/mgps/customview/FlowLayout;

    const v0, 0x7f09071f

    .line 22
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/FlowLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->B:Lcom/join/mgps/customview/FlowLayout;

    const v0, 0x7f090720

    .line 23
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->C:Landroid/view/View;

    const v0, 0x7f09121e

    .line 24
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->D:Landroid/view/View;

    const v0, 0x7f090bf9

    .line 25
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->E:Landroid/widget/RelativeLayout;

    const v0, 0x7f091676

    .line 26
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->F:Landroid/widget/TextView;

    const v0, 0x7f090128

    .line 27
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->G:Landroid/widget/ListView;

    const v0, 0x7f09132b

    .line 28
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->H:Landroid/view/View;

    const v0, 0x7f09031f

    .line 29
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    .line 30
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->l:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 31
    new-instance v1, Lcom/join/mgps/activity/SearchHintActivity_$t;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/SearchHintActivity_$t;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 32
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->k:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 33
    new-instance v1, Lcom/join/mgps/activity/SearchHintActivity_$u;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/SearchHintActivity_$u;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->F:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    .line 35
    new-instance v1, Lcom/join/mgps/activity/SearchHintActivity_$v;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/SearchHintActivity_$v;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 36
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity;->m:Landroid/widget/ImageView;

    if-eqz v0, :cond_3

    .line 37
    new-instance v1, Lcom/join/mgps/activity/SearchHintActivity_$w;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/SearchHintActivity_$w;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    if-eqz p1, :cond_4

    .line 38
    new-instance v0, Lcom/join/mgps/activity/SearchHintActivity_$x;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SearchHintActivity_$x;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    :cond_4
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity;->j:Landroid/widget/EditText;

    if-eqz p1, :cond_5

    .line 40
    new-instance v0, Lcom/join/mgps/activity/SearchHintActivity_$y;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SearchHintActivity_$y;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 41
    :cond_5
    invoke-virtual {p0}, Lcom/join/mgps/activity/SearchHintActivity;->afterViews()V

    return-void
.end method

.method p0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/SearchHintActivity_$p;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/SearchHintActivity_$p;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity_;->N1:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method serverConnectionException()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SearchHintActivity_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SearchHintActivity_$i;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity_;->M1:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity_;->M1:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity_;->M1:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/SearchHintActivity_;->injectExtras_()V

    return-void
.end method

.method t0(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/SearchHintActivity_$q;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/SearchHintActivity_$q;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method u0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/SearchHintActivity_$o;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/SearchHintActivity_$o;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method w0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/SearchHintActivity_$s;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/SearchHintActivity_$s;-><init>(Lcom/join/mgps/activity/SearchHintActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method
