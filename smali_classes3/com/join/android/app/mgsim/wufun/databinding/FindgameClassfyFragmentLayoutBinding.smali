.class public final Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;
.super Ljava/lang/Object;
.source "FindgameClassfyFragmentLayoutBinding.java"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field private final b:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final c:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final d:Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final e:Lcom/join/mgps/ptr/PtrClassicFrameLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final f:Lcom/join/android/app/mgsim/wufun/databinding/LodingLayoutIncludeBinding;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final g:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/widget/LinearLayout;Lcom/join/android/app/component/xrecyclerview/XRecyclerView;Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;Lcom/join/mgps/ptr/PtrClassicFrameLayout;Lcom/join/android/app/mgsim/wufun/databinding/LodingLayoutIncludeBinding;Landroidx/recyclerview/widget/RecyclerView;Lcom/join/android/app/component/xrecyclerview/XRecyclerView;)V
    .locals 0
    .param p1    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/join/android/app/component/xrecyclerview/XRecyclerView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/join/mgps/ptr/PtrClassicFrameLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/join/android/app/mgsim/wufun/databinding/LodingLayoutIncludeBinding;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Lcom/join/android/app/component/xrecyclerview/XRecyclerView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->b:Landroid/widget/LinearLayout;

    .line 3
    iput-object p2, p0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->c:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    .line 4
    iput-object p3, p0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->d:Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;

    .line 5
    iput-object p4, p0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->e:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    .line 6
    iput-object p5, p0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->f:Lcom/join/android/app/mgsim/wufun/databinding/LodingLayoutIncludeBinding;

    .line 7
    iput-object p6, p0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    iput-object p7, p0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;
    .locals 10
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const v0, 0x7f0903dc

    .line 1
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz v4, :cond_0

    const v0, 0x7f090552

    .line 2
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    invoke-static {v1}, Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;->bind(Landroid/view/View;)Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;

    move-result-object v5

    const v0, 0x7f090d05

    .line 4
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    if-eqz v6, :cond_0

    const v0, 0x7f090d55

    .line 5
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 6
    invoke-static {v1}, Lcom/join/android/app/mgsim/wufun/databinding/LodingLayoutIncludeBinding;->bind(Landroid/view/View;)Lcom/join/android/app/mgsim/wufun/databinding/LodingLayoutIncludeBinding;

    move-result-object v7

    const v0, 0x7f091356

    .line 7
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v8, :cond_0

    const v0, 0x7f091706

    .line 8
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz v9, :cond_0

    .line 9
    new-instance v0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-object v3, p0

    check-cast v3, Landroid/widget/LinearLayout;

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;-><init>(Landroid/widget/LinearLayout;Lcom/join/android/app/component/xrecyclerview/XRecyclerView;Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;Lcom/join/mgps/ptr/PtrClassicFrameLayout;Lcom/join/android/app/mgsim/wufun/databinding/LodingLayoutIncludeBinding;Landroidx/recyclerview/widget/RecyclerView;Lcom/join/android/app/component/xrecyclerview/XRecyclerView;)V

    return-object v0

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    .line 11
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;
    .locals 2
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;
    .locals 2
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const v0, 0x7f0c023d

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->bind(Landroid/view/View;)Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Landroid/widget/LinearLayout;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->b:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->a()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method
