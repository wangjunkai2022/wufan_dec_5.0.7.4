.class public final Lcom/join/mgps/activity/message/MessagePriaceFragment_;
.super Lcom/join/mgps/activity/message/MessagePriaceFragment;
.source "MessagePriaceFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/message/MessagePriaceFragment_$v;
    }
.end annotation


# instance fields
.field private final A:La4/c;

.field private B:Landroid/view/View;

.field private final C:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment_;->A:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment_;->C:Ljava/util/Map;

    return-void
.end method

.method static synthetic A0(Lcom/join/mgps/activity/message/MessagePriaceFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->o0()V

    return-void
.end method

.method static synthetic B0(Lcom/join/mgps/activity/message/MessagePriaceFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->W(Ljava/util/List;)V

    return-void
.end method

.method static synthetic C0(Lcom/join/mgps/activity/message/MessagePriaceFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->l0()V

    return-void
.end method

.method static synthetic D0(Lcom/join/mgps/activity/message/MessagePriaceFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->g0()V

    return-void
.end method

.method static synthetic E0(Lcom/join/mgps/activity/message/MessagePriaceFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->d0(Ljava/util/List;)V

    return-void
.end method

.method static synthetic F0(Lcom/join/mgps/activity/message/MessagePriaceFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->m0()V

    return-void
.end method

.method static synthetic G0(Lcom/join/mgps/activity/message/MessagePriaceFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->c0()V

    return-void
.end method

.method static synthetic H0(Lcom/join/mgps/activity/message/MessagePriaceFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->showLoding()V

    return-void
.end method

.method public static I0()Lcom/join/mgps/activity/message/MessagePriaceFragment_$v;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/MessagePriaceFragment_$v;

    invoke-direct {v0}, Lcom/join/mgps/activity/message/MessagePriaceFragment_$v;-><init>()V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->n:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    return-void
.end method

.method static synthetic p0(Lcom/join/mgps/activity/message/MessagePriaceFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->V()V

    return-void
.end method

.method static synthetic q0(Lcom/join/mgps/activity/message/MessagePriaceFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->b0()V

    return-void
.end method

.method static synthetic r0(Lcom/join/mgps/activity/message/MessagePriaceFragment_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->i0(I)V

    return-void
.end method

.method static synthetic s0(Lcom/join/mgps/activity/message/MessagePriaceFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->showLodingFailed()V

    return-void
.end method

.method static synthetic t0(Lcom/join/mgps/activity/message/MessagePriaceFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->showToast(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic u0(Lcom/join/mgps/activity/message/MessagePriaceFragment_;Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->k0(Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;)V

    return-void
.end method

.method static synthetic v0(Lcom/join/mgps/activity/message/MessagePriaceFragment_;Lcom/join/mgps/dto/CommentResponse;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->e0(Lcom/join/mgps/dto/CommentResponse;)V

    return-void
.end method

.method static synthetic w0(Lcom/join/mgps/activity/message/MessagePriaceFragment_;Ljava/lang/String;Lcom/join/mgps/dto/CommentCreateBean$InfoBean;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->f0(Ljava/lang/String;Lcom/join/mgps/dto/CommentCreateBean$InfoBean;Z)V

    return-void
.end method

.method static synthetic x0(Lcom/join/mgps/activity/message/MessagePriaceFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->a0()V

    return-void
.end method

.method static synthetic y0(Lcom/join/mgps/activity/message/MessagePriaceFragment_;Ljava/lang/String;Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->h0(Ljava/lang/String;Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;)V

    return-void
.end method

.method static synthetic z0(Lcom/join/mgps/activity/message/MessagePriaceFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->Z()V

    return-void
.end method


# virtual methods
.method V()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/MessagePriaceFragment_$o;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment_$o;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment_;)V

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
            "Lcom/join/mgps/activity/message/MessagePriaceFragment$g;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/MessagePriaceFragment_$r;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/message/MessagePriaceFragment_$r;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Z()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/message/MessagePriaceFragment_$m;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/message/MessagePriaceFragment_$m;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method a0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/message/MessagePriaceFragment_$j;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/message/MessagePriaceFragment_$j;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method b0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/MessagePriaceFragment_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment_$d;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method c0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/MessagePriaceFragment_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment_$b;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method d0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/message/MessagePriaceFragment$g;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/MessagePriaceFragment_$u;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/message/MessagePriaceFragment_$u;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method e0(Lcom/join/mgps/dto/CommentResponse;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/MessagePriaceFragment_$h;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/message/MessagePriaceFragment_$h;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment_;Lcom/join/mgps/dto/CommentResponse;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method f0(Ljava/lang/String;Lcom/join/mgps/dto/CommentCreateBean$InfoBean;Z)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/MessagePriaceFragment_$i;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/join/mgps/activity/message/MessagePriaceFragment_$i;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment_;Ljava/lang/String;Lcom/join/mgps/dto/CommentCreateBean$InfoBean;Z)V

    const-string p1, ""

    const-wide/16 p2, 0x0

    invoke-static {p1, v0, p2, p3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method g0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/MessagePriaceFragment_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment_$t;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment_;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment_;->C:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method h0(Ljava/lang/String;Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/activity/message/MessagePriaceFragment_$l;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/activity/message/MessagePriaceFragment_$l;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method i0(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/MessagePriaceFragment_$p;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/message/MessagePriaceFragment_$p;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment_;I)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment_;->B:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method k0(Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/MessagePriaceFragment_$g;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/message/MessagePriaceFragment_$g;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment_;Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method l0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/MessagePriaceFragment_$s;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment_$s;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method m0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/MessagePriaceFragment_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment_$a;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method o0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/MessagePriaceFragment_$q;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment_$q;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment_;->A:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/message/MessagePriaceFragment_;->init_(Landroid/os/Bundle;)V

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

    iput-object p3, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment_;->B:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c025c

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment_;->B:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment_;->B:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment_;->B:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->b:Landroid/widget/LinearLayout;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->c:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->d:Lcom/join/mgps/customview/XListView2;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->f:Landroid/widget/LinearLayout;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->g:Landroid/widget/LinearLayout;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->h:Landroid/widget/LinearLayout;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->i:Landroid/widget/TextView;

    .line 10
    iput-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->o:Landroid/widget/Button;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f091445

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->b:Landroid/widget/LinearLayout;

    const v0, 0x7f090ea0

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->c:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    const v0, 0x7f090c97

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/XListView2;

    iput-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->d:Lcom/join/mgps/customview/XListView2;

    const v0, 0x7f090d82

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->f:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->g:Landroid/widget/LinearLayout;

    const v0, 0x7f090954

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->h:Landroid/widget/LinearLayout;

    const v0, 0x7f0910f3

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->i:Landroid/widget/TextView;

    const v0, 0x7f091261

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->o:Landroid/widget/Button;

    if-eqz p1, :cond_0

    .line 9
    new-instance v0, Lcom/join/mgps/activity/message/MessagePriaceFragment_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment_$k;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment_;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->b:Landroid/widget/LinearLayout;

    if-eqz p1, :cond_1

    .line 11
    new-instance v0, Lcom/join/mgps/activity/message/MessagePriaceFragment_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment_$n;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment_;)V

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->afterViews()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment_;->A:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment_;->C:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/MessagePriaceFragment_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment_$c;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/MessagePriaceFragment_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment_$e;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/MessagePriaceFragment_$f;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/message/MessagePriaceFragment_$f;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
