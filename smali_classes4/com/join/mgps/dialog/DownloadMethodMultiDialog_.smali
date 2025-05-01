.class public final Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;
.super Lcom/join/mgps/dialog/DownloadMethodMultiDialog;
.source "DownloadMethodMultiDialog_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$k;
    }
.end annotation


# static fields
.field public static final H:Ljava/lang/String; = "gameId"

.field public static final I:Ljava/lang/String; = "ext"

.field public static final J:Ljava/lang/String; = "isForceShow"

.field public static final K:Ljava/lang/String; = "fromRecomDown"

.field public static final L:Ljava/lang/String; = "downloadArgs"

.field public static final M:Ljava/lang/String; = "disableShowSpeedUpPrompt"

.field public static final N:Ljava/lang/String; = "data"

.field public static final O:Ljava/lang/String; = "_from"

.field public static final P:Ljava/lang/String; = "_from_type"

.field public static final Q:Ljava/lang/String; = "downloadHtmls"

.field public static final R:Ljava/lang/String; = "hideNoMore"


# instance fields
.field private final F:La4/c;

.field private final G:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;->F:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;->G:Ljava/util/Map;

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {p1, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->m:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;->injectExtras_()V

    return-void
.end method

.method private injectExtras_()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_a

    const-string v1, "gameId"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->n:Ljava/lang/String;

    :cond_0
    const-string v1, "ext"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->o:Ljava/lang/String;

    :cond_1
    const-string v1, "isForceShow"

    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->p:Z

    :cond_2
    const-string v1, "fromRecomDown"

    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->q:Z

    :cond_3
    const-string v1, "downloadArgs"

    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/DownloadGameArgsBean;

    iput-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->r:Lcom/join/mgps/dto/DownloadGameArgsBean;

    :cond_4
    const-string v1, "disableShowSpeedUpPrompt"

    .line 12
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 13
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->s:Z

    :cond_5
    const-string v1, "data"

    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 15
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    iput-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->t:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    :cond_6
    const-string v1, "_from"

    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 17
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->u:I

    :cond_7
    const-string v1, "_from_type"

    .line 18
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 19
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->v:I

    :cond_8
    const-string v1, "downloadHtmls"

    .line 20
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 21
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->w:Ljava/util/ArrayList;

    :cond_9
    const-string v1, "hideNoMore"

    .line 22
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 23
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->x:Z

    :cond_a
    return-void
.end method

.method static synthetic v0(Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->h0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic w0(Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;Lcom/join/mgps/dto/QueryDownloadInfoResponseData;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->update(Lcom/join/mgps/dto/QueryDownloadInfoResponseData;)V

    return-void
.end method

.method static synthetic x0(Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->p0()V

    return-void
.end method

.method public static y0(Landroid/content/Context;)Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$k;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$k;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static z0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$k;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$k;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method


# virtual methods
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
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;->G:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method h0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$i;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$i;-><init>(Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;Ljava/lang/String;)V

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
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;->F:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c051e

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 3

    const v0, 0x7f0910e9

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->b:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f091461

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->c:Landroid/widget/TextView;

    const v0, 0x7f090c8d

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->d:Landroid/widget/TextView;

    const v0, 0x7f090476

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->e:Landroid/widget/TextView;

    const v0, 0x7f09133f

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->f:Landroid/widget/TextView;

    const v0, 0x7f091755

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->g:Landroid/widget/TextView;

    const v0, 0x7f091062

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->h:Landroid/widget/TextView;

    const v0, 0x7f0902e5

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->i:Landroid/widget/ImageView;

    const v0, 0x7f0902e7

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->j:Landroid/widget/ImageView;

    const v0, 0x7f090c9f

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->k:Landroid/widget/LinearLayout;

    const v0, 0x7f090cbb

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->l:Landroid/widget/LinearLayout;

    const v0, 0x7f090390

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->C:Landroid/view/View;

    const v0, 0x7f09032d

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f090f7c

    .line 14
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f09111a

    .line 15
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 16
    new-instance v2, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$b;

    invoke-direct {v2, p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$b;-><init>(Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz v1, :cond_1

    .line 17
    new-instance v0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$c;-><init>(Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->e:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    .line 19
    new-instance v1, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$d;

    invoke-direct {v1, p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$d;-><init>(Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->h:Landroid/widget/TextView;

    if-eqz v0, :cond_3

    .line 21
    new-instance v1, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$e;

    invoke-direct {v1, p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$e;-><init>(Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    if-eqz p1, :cond_4

    .line 22
    new-instance v0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$f;-><init>(Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    :cond_4
    iget-object p1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->i:Landroid/widget/ImageView;

    if-eqz p1, :cond_5

    .line 24
    new-instance v0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$g;-><init>(Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 25
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->l:Landroid/widget/LinearLayout;

    if-eqz p1, :cond_6

    .line 26
    new-instance v0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$h;-><init>(Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;)V

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 27
    :cond_6
    invoke-virtual {p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->afterViews()V

    return-void
.end method

.method p0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$a;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$a;-><init>(Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;Ljava/lang/String;JLjava/lang/String;)V

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
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;->G:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;->F:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;->F:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;->F:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;->injectExtras_()V

    return-void
.end method

.method update(Lcom/join/mgps/dto/QueryDownloadInfoResponseData;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$j;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$j;-><init>(Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;Lcom/join/mgps/dto/QueryDownloadInfoResponseData;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
