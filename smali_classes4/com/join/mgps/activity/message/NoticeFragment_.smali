.class public final Lcom/join/mgps/activity/message/NoticeFragment_;
.super Lcom/join/mgps/activity/message/NoticeFragment;
.source "NoticeFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/message/NoticeFragment_$m;
    }
.end annotation


# instance fields
.field private final p:La4/c;

.field private q:Landroid/view/View;

.field private final r:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/activity/message/NoticeFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/message/NoticeFragment_;->p:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/message/NoticeFragment_;->r:Ljava/util/Map;

    return-void
.end method

.method static synthetic h0(Lcom/join/mgps/activity/message/NoticeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/message/NoticeFragment;->g0()V

    return-void
.end method

.method static synthetic i0(Lcom/join/mgps/activity/message/NoticeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/message/NoticeFragment;->a0()V

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    return-void
.end method

.method static synthetic j0(Lcom/join/mgps/activity/message/NoticeFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/message/NoticeFragment;->X(Ljava/util/List;)V

    return-void
.end method

.method static synthetic k0(Lcom/join/mgps/activity/message/NoticeFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/message/NoticeFragment;->W(Ljava/util/List;)V

    return-void
.end method

.method static synthetic l0(Lcom/join/mgps/activity/message/NoticeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/message/NoticeFragment;->showLoding()V

    return-void
.end method

.method static synthetic m0(Lcom/join/mgps/activity/message/NoticeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/message/NoticeFragment;->V()V

    return-void
.end method

.method static synthetic n0(Lcom/join/mgps/activity/message/NoticeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/message/NoticeFragment;->c0()V

    return-void
.end method

.method static synthetic o0(Lcom/join/mgps/activity/message/NoticeFragment_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/message/NoticeFragment;->f0(I)V

    return-void
.end method

.method static synthetic p0(Lcom/join/mgps/activity/message/NoticeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/message/NoticeFragment;->d0()V

    return-void
.end method

.method static synthetic q0(Lcom/join/mgps/activity/message/NoticeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/message/NoticeFragment;->showLodingFailed()V

    return-void
.end method

.method static synthetic r0(Lcom/join/mgps/activity/message/NoticeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/message/NoticeFragment;->e0()V

    return-void
.end method

.method public static s0()Lcom/join/mgps/activity/message/NoticeFragment_$m;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/NoticeFragment_$m;

    invoke-direct {v0}, Lcom/join/mgps/activity/message/NoticeFragment_$m;-><init>()V

    return-object v0
.end method


# virtual methods
.method V()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/NoticeFragment_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/message/NoticeFragment_$i;-><init>(Lcom/join/mgps/activity/message/NoticeFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method W(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/message/NoticeFragment$c;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/NoticeFragment_$g;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/message/NoticeFragment_$g;-><init>(Lcom/join/mgps/activity/message/NoticeFragment_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method X(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/message/NoticeFragment$c;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/NoticeFragment_$f;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/message/NoticeFragment_$f;-><init>(Lcom/join/mgps/activity/message/NoticeFragment_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method a0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/message/NoticeFragment_$c;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/message/NoticeFragment_$c;-><init>(Lcom/join/mgps/activity/message/NoticeFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method c0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/NoticeFragment_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/message/NoticeFragment_$j;-><init>(Lcom/join/mgps/activity/message/NoticeFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method d0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/NoticeFragment_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/message/NoticeFragment_$l;-><init>(Lcom/join/mgps/activity/message/NoticeFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method e0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/NoticeFragment_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/message/NoticeFragment_$b;-><init>(Lcom/join/mgps/activity/message/NoticeFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method f0(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/NoticeFragment_$k;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/message/NoticeFragment_$k;-><init>(Lcom/join/mgps/activity/message/NoticeFragment_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method g0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/NoticeFragment_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/message/NoticeFragment_$e;-><init>(Lcom/join/mgps/activity/message/NoticeFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/message/NoticeFragment_;->r:Ljava/util/Map;

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
    iget-object v0, p0, Lcom/join/mgps/activity/message/NoticeFragment_;->q:Landroid/view/View;

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
    iget-object v0, p0, Lcom/join/mgps/activity/message/NoticeFragment_;->p:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/message/NoticeFragment_;->init_(Landroid/os/Bundle;)V

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

    iput-object p3, p0, Lcom/join/mgps/activity/message/NoticeFragment_;->q:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c0278

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/message/NoticeFragment_;->q:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/message/NoticeFragment_;->q:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/message/NoticeFragment_;->q:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/activity/message/NoticeFragment;->b:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/activity/message/NoticeFragment;->c:Lcom/join/mgps/customview/XListView2;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/activity/message/NoticeFragment;->d:Landroid/widget/LinearLayout;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/activity/message/NoticeFragment;->e:Landroid/widget/LinearLayout;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/activity/message/NoticeFragment;->f:Landroid/widget/LinearLayout;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/activity/message/NoticeFragment;->l:Landroid/widget/Button;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f090ea0

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/message/NoticeFragment;->b:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    const v0, 0x7f090c97

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/XListView2;

    iput-object v0, p0, Lcom/join/mgps/activity/message/NoticeFragment;->c:Lcom/join/mgps/customview/XListView2;

    const v0, 0x7f090d82

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/message/NoticeFragment;->d:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/message/NoticeFragment;->e:Landroid/widget/LinearLayout;

    const v0, 0x7f090954

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/message/NoticeFragment;->f:Landroid/widget/LinearLayout;

    const v0, 0x7f091261

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lcom/join/mgps/activity/message/NoticeFragment;->l:Landroid/widget/Button;

    if-eqz p1, :cond_0

    .line 7
    new-instance v0, Lcom/join/mgps/activity/message/NoticeFragment_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/message/NoticeFragment_$d;-><init>(Lcom/join/mgps/activity/message/NoticeFragment_;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/NoticeFragment;->afterViews()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/message/NoticeFragment_;->p:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/activity/message/NoticeFragment_;->r:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/NoticeFragment_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/message/NoticeFragment_$h;-><init>(Lcom/join/mgps/activity/message/NoticeFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/NoticeFragment_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/message/NoticeFragment_$a;-><init>(Lcom/join/mgps/activity/message/NoticeFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
