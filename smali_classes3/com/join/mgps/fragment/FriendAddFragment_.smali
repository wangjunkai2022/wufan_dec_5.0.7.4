.class public final Lcom/join/mgps/fragment/FriendAddFragment_;
.super Lcom/join/mgps/fragment/FriendAddFragment;
.source "FriendAddFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/FriendAddFragment_$h;
    }
.end annotation


# instance fields
.field private final k:La4/c;

.field private l:Landroid/view/View;

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
    invoke-direct {p0}, Lcom/join/mgps/fragment/FriendAddFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendAddFragment_;->k:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendAddFragment_;->m:Ljava/util/Map;

    return-void
.end method

.method static synthetic h0(Lcom/join/mgps/fragment/FriendAddFragment_;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/FriendAddFragment;->X(Ljava/lang/Boolean;)V

    return-void
.end method

.method static synthetic i0(Lcom/join/mgps/fragment/FriendAddFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/FriendAddFragment;->updateUi(Ljava/util/List;)V

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    return-void
.end method

.method static synthetic j0(Lcom/join/mgps/fragment/FriendAddFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/FriendAddFragment;->g0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic k0(Lcom/join/mgps/fragment/FriendAddFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/FriendAddFragment;->e0()V

    return-void
.end method

.method static synthetic l0(Lcom/join/mgps/fragment/FriendAddFragment_;Lcom/join/mgps/dto/FriendBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/FriendAddFragment;->W(Lcom/join/mgps/dto/FriendBean;)V

    return-void
.end method

.method public static m0()Lcom/join/mgps/fragment/FriendAddFragment_$h;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/FriendAddFragment_$h;

    invoke-direct {v0}, Lcom/join/mgps/fragment/FriendAddFragment_$h;-><init>()V

    return-object v0
.end method


# virtual methods
.method W(Lcom/join/mgps/dto/FriendBean;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/FriendAddFragment_$g;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/FriendAddFragment_$g;-><init>(Lcom/join/mgps/fragment/FriendAddFragment_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/FriendBean;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method X(Ljava/lang/Boolean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/FriendAddFragment_$c;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/FriendAddFragment_$c;-><init>(Lcom/join/mgps/fragment/FriendAddFragment_;Ljava/lang/Boolean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method e0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/FriendAddFragment_$f;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/FriendAddFragment_$f;-><init>(Lcom/join/mgps/fragment/FriendAddFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method g0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/FriendAddFragment_$e;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/FriendAddFragment_$e;-><init>(Lcom/join/mgps/fragment/FriendAddFragment_;Ljava/lang/String;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendAddFragment_;->m:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
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
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendAddFragment_;->l:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendAddFragment_;->k:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/FriendAddFragment_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Lcom/join/mgps/fragment/FriendAddFragment_;->l:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c0269

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/FriendAddFragment_;->l:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/FriendAddFragment_;->l:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/FriendAddFragment_;->l:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/FriendAddFragment;->b:Landroid/widget/EditText;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/FriendAddFragment;->c:Landroid/view/View;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/FriendAddFragment;->d:Lcom/join/mgps/customview/KeyboardListenLayout;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/fragment/FriendAddFragment;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/fragment/FriendAddFragment;->f:Landroid/widget/TextView;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/fragment/FriendAddFragment;->g:Landroid/widget/ImageView;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/fragment/FriendAddFragment;->h:Landroid/widget/TextView;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 2

    const v0, 0x7f090872

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendAddFragment;->b:Landroid/widget/EditText;

    const v0, 0x7f09074f

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendAddFragment;->c:Landroid/view/View;

    const v0, 0x7f090996

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/KeyboardListenLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendAddFragment;->d:Lcom/join/mgps/customview/KeyboardListenLayout;

    const v0, 0x7f0910e9

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendAddFragment;->e:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f0913d7

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendAddFragment;->f:Landroid/widget/TextView;

    const v0, 0x7f090953

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendAddFragment;->g:Landroid/widget/ImageView;

    const v0, 0x7f09163f

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendAddFragment;->h:Landroid/widget/TextView;

    const v0, 0x7f091211

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f09032d

    .line 9
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 10
    new-instance v1, Lcom/join/mgps/fragment/FriendAddFragment_$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/FriendAddFragment_$a;-><init>(Lcom/join/mgps/fragment/FriendAddFragment_;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz p1, :cond_1

    .line 11
    new-instance v0, Lcom/join/mgps/fragment/FriendAddFragment_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/FriendAddFragment_$b;-><init>(Lcom/join/mgps/fragment/FriendAddFragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FriendAddFragment;->afterViews()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/FriendAddFragment_;->k:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendAddFragment_;->m:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method updateUi(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/FriendBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/FriendAddFragment_$d;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/FriendAddFragment_$d;-><init>(Lcom/join/mgps/fragment/FriendAddFragment_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
