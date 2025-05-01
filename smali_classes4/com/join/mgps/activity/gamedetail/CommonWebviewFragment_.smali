.class public final Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_;
.super Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;
.source "CommonWebviewFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_$FragmentBuilder_;
    }
.end annotation


# instance fields
.field private final beans_:Ljava/util/Map;
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

.field private contentView_:Landroid/view/View;

.field private final onViewChangedNotifier_:La4/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_;->onViewChangedNotifier_:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_;->beans_:Ljava/util/Map;

    return-void
.end method

.method static synthetic access$001(Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->showLoding()V

    return-void
.end method

.method static synthetic access$101(Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->showLodingFailed()V

    return-void
.end method

.method static synthetic access$201(Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->showMain()V

    return-void
.end method

.method static synthetic access$301(Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->showTost(Ljava/lang/String;)V

    return-void
.end method

.method public static builder()Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_$FragmentBuilder_;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_$FragmentBuilder_;

    invoke-direct {v0}, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_$FragmentBuilder_;-><init>()V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    return-void
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
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_;->beans_:Ljava/util/Map;

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
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_;->contentView_:Landroid/view/View;

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
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_;->onViewChangedNotifier_:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_;->contentView_:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c025b

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_;->contentView_:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_;->contentView_:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_;->contentView_:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->loding_layout:Landroid/widget/LinearLayout;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->loding_faile:Landroid/widget/LinearLayout;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->failedMessage:Landroid/widget/TextView;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->weblayout:Landroid/widget/RelativeLayout;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 2

    const v0, 0x7f090d82

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->loding_layout:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->loding_faile:Landroid/widget/LinearLayout;

    const v0, 0x7f090553

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->failedMessage:Landroid/widget/TextView;

    const v0, 0x7f091806

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->weblayout:Landroid/widget/RelativeLayout;

    const v0, 0x7f091803

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/LJNestScrollWebView;

    iput-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    const v0, 0x7f091261

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->loding_faile:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    .line 8
    new-instance v1, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_$1;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_$1;-><init>(Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz p1, :cond_1

    .line 9
    new-instance v0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_$2;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_$2;-><init>(Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->afterview()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_;->onViewChangedNotifier_:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_;->beans_:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_$3;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_$3;-><init>(Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_$4;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_$4;-><init>(Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMain()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_$5;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_$5;-><init>(Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showTost(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_$6;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_$6;-><init>(Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
