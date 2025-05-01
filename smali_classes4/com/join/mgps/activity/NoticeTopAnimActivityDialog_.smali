.class public final Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;
.super Lcom/join/mgps/activity/NoticeTopAnimActivityDialog;
.source "NoticeTopAnimActivityDialog_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;
    }
.end annotation


# static fields
.field public static final n:Ljava/lang/String; = "message"

.field public static final o:Ljava/lang/String; = "state"

.field public static final p:Ljava/lang/String; = "coinNumber"


# instance fields
.field private final l:La4/c;

.field private final m:Ljava/util/Map;
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


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;->l:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;->m:Ljava/util/Map;

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;->injectExtras_()V

    return-void
.end method

.method private injectExtras_()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "message"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog;->i:Ljava/lang/String;

    :cond_0
    const-string v1, "state"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog;->j:I

    :cond_1
    const-string v1, "coinNumber"

    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog;->k:I

    :cond_2
    return-void
.end method

.method static synthetic l0(Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog;->i0()V

    return-void
.end method

.method static synthetic m0(Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog;->g0(I)V

    return-void
.end method

.method public static n0(Landroid/content/Context;)Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static o0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method


# virtual methods
.method g0(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$e;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$e;-><init>(Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x7d0

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
    iget-object v0, p0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;->m:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method i0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$d;-><init>(Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;)V

    const-string v1, ""

    const-wide/16 v2, 0x1f4

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

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
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;->l:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c0696

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f09040f

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog;->b:Landroid/widget/RelativeLayout;

    const v0, 0x7f090f12

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog;->c:Landroid/widget/TextView;

    const v0, 0x7f091659

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog;->d:Landroid/widget/TextView;

    const v0, 0x7f091340

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog;->e:Landroid/widget/TextView;

    const v0, 0x7f090428

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog;->f:Landroid/widget/TextView;

    const v0, 0x7f09091d

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog;->g:Landroid/widget/LinearLayout;

    const v0, 0x7f090425

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog;->h:Landroid/widget/Button;

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog;->g:Landroid/widget/LinearLayout;

    if-eqz p1, :cond_0

    .line 9
    new-instance v0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$a;-><init>(Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;)V

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog;->c:Landroid/widget/TextView;

    if-eqz p1, :cond_1

    .line 11
    new-instance v0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$b;-><init>(Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog;->h:Landroid/widget/Button;

    if-eqz p1, :cond_2

    .line 13
    new-instance v0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$c;-><init>(Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog;->afterview()V

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
    iget-object v0, p0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;->m:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;->l:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;->l:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;->l:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;->injectExtras_()V

    return-void
.end method
