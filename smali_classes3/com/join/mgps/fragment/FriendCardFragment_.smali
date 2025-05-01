.class public final Lcom/join/mgps/fragment/FriendCardFragment_;
.super Lcom/join/mgps/fragment/FriendCardFragment;
.source "FriendCardFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/FriendCardFragment_$l;
    }
.end annotation


# instance fields
.field private final s:La4/c;

.field private t:Landroid/view/View;

.field private final u:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/fragment/FriendCardFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment_;->s:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment_;->u:Ljava/util/Map;

    return-void
.end method

.method static synthetic C0(Lcom/join/mgps/fragment/FriendCardFragment_;Lcom/join/mgps/dto/FriendCardBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/FriendCardFragment;->B0(Lcom/join/mgps/dto/FriendCardBean;)V

    return-void
.end method

.method static synthetic D0(Lcom/join/mgps/fragment/FriendCardFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/FriendCardFragment;->y0()V

    return-void
.end method

.method static synthetic E0(Lcom/join/mgps/fragment/FriendCardFragment_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/FriendCardFragment;->h0(I)V

    return-void
.end method

.method static synthetic F0(Lcom/join/mgps/fragment/FriendCardFragment_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/FriendCardFragment;->k0(I)V

    return-void
.end method

.method static synthetic G0(Lcom/join/mgps/fragment/FriendCardFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/FriendCardFragment;->w0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic H0(Lcom/join/mgps/fragment/FriendCardFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/FriendCardFragment;->A0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic I0(Lcom/join/mgps/fragment/FriendCardFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/FriendCardFragment;->x0()V

    return-void
.end method

.method static synthetic J0(Lcom/join/mgps/fragment/FriendCardFragment_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/FriendCardFragment;->g0(I)V

    return-void
.end method

.method static synthetic K0(Lcom/join/mgps/fragment/FriendCardFragment_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/FriendCardFragment;->j0(I)V

    return-void
.end method

.method static synthetic L0(Lcom/join/mgps/fragment/FriendCardFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/FriendCardFragment;->v0(Ljava/lang/String;)V

    return-void
.end method

.method public static M0()Lcom/join/mgps/fragment/FriendCardFragment_$l;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/FriendCardFragment_$l;

    invoke-direct {v0}, Lcom/join/mgps/fragment/FriendCardFragment_$l;-><init>()V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    return-void
.end method


# virtual methods
.method A0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/FriendCardFragment_$i;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/FriendCardFragment_$i;-><init>(Lcom/join/mgps/fragment/FriendCardFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method B0(Lcom/join/mgps/dto/FriendCardBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/FriendCardFragment_$d;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/FriendCardFragment_$d;-><init>(Lcom/join/mgps/fragment/FriendCardFragment_;Lcom/join/mgps/dto/FriendCardBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method g0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/FriendCardFragment_$k;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/FriendCardFragment_$k;-><init>(Lcom/join/mgps/fragment/FriendCardFragment_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment_;->u:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method h0(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/FriendCardFragment_$f;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/FriendCardFragment_$f;-><init>(Lcom/join/mgps/fragment/FriendCardFragment_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public internalFindViewById(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment_;->t:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method j0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/FriendCardFragment_$a;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/FriendCardFragment_$a;-><init>(Lcom/join/mgps/fragment/FriendCardFragment_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method k0(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/FriendCardFragment_$g;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/FriendCardFragment_$g;-><init>(Lcom/join/mgps/fragment/FriendCardFragment_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment_;->s:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/FriendCardFragment_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/FriendCardFragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Lcom/join/mgps/fragment/FriendCardFragment_;->t:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c026a

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/FriendCardFragment_;->t:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/FriendCardFragment_;->t:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment_;->t:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment;->c:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment;->d:Landroid/widget/TextView;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment;->e:Landroid/widget/TextView;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment;->f:Landroid/widget/TextView;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment;->g:Landroid/widget/TextView;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment;->h:Landroid/widget/TextView;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment;->i:Landroid/view/View;

    .line 10
    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment;->j:Landroid/view/View;

    .line 11
    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment;->k:Landroid/view/View;

    .line 12
    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment;->l:Landroid/widget/GridView;

    .line 13
    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment;->m:Landroidx/constraintlayout/widget/Group;

    .line 14
    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment;->n:Landroid/view/View;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f09012d

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment;->c:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f090ea1

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment;->d:Landroid/widget/TextView;

    const v0, 0x7f0903f9

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment;->e:Landroid/widget/TextView;

    const v0, 0x7f09027f

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment;->f:Landroid/widget/TextView;

    const v0, 0x7f090c68

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment;->g:Landroid/widget/TextView;

    const v0, 0x7f091326

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment;->h:Landroid/widget/TextView;

    const v0, 0x7f090780

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment;->i:Landroid/view/View;

    const v0, 0x7f090788

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment;->j:Landroid/view/View;

    const v0, 0x7f090f09

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment;->k:Landroid/view/View;

    const v0, 0x7f09070a

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/GridView;

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment;->l:Landroid/widget/GridView;

    const v0, 0x7f090dbd

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/Group;

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment;->m:Landroidx/constraintlayout/widget/Group;

    const v0, 0x7f090ed3

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment;->n:Landroid/view/View;

    const v0, 0x7f09032d

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 14
    new-instance v0, Lcom/join/mgps/fragment/FriendCardFragment_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/FriendCardFragment_$c;-><init>(Lcom/join/mgps/fragment/FriendCardFragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FriendCardFragment;->afterViews()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/FriendCardFragment_;->s:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendCardFragment_;->u:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method v0(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/FriendCardFragment_$b;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/FriendCardFragment_$b;-><init>(Lcom/join/mgps/fragment/FriendCardFragment_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method w0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/FriendCardFragment_$h;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/FriendCardFragment_$h;-><init>(Lcom/join/mgps/fragment/FriendCardFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method x0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/FriendCardFragment_$j;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/FriendCardFragment_$j;-><init>(Lcom/join/mgps/fragment/FriendCardFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method y0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/FriendCardFragment_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/FriendCardFragment_$e;-><init>(Lcom/join/mgps/fragment/FriendCardFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
