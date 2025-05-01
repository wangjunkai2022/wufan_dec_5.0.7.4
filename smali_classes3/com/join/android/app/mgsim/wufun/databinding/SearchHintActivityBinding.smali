.class public final Lcom/join/android/app/mgsim/wufun/databinding/SearchHintActivityBinding;
.super Ljava/lang/Object;
.source "SearchHintActivityBinding.java"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field private final b:Landroid/widget/RelativeLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final c:Landroid/widget/ListView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final d:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final e:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final f:Lcom/join/mgps/customview/FlowLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final g:Landroid/view/View;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final h:Lcom/join/mgps/customview/ForumLoadingView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final i:Lcom/join/android/app/mgsim/wufun/databinding/SearchRecommendLayoutBinding;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final j:Lcom/join/android/app/mgsim/wufun/databinding/SearchBarLayoutBinding;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final k:Landroid/view/View;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/widget/RelativeLayout;Landroid/widget/ListView;Landroid/widget/ImageView;Landroid/widget/LinearLayout;Lcom/join/mgps/customview/FlowLayout;Landroid/view/View;Lcom/join/mgps/customview/ForumLoadingView;Lcom/join/android/app/mgsim/wufun/databinding/SearchRecommendLayoutBinding;Lcom/join/android/app/mgsim/wufun/databinding/SearchBarLayoutBinding;Landroid/view/View;)V
    .locals 0
    .param p1    # Landroid/widget/RelativeLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/widget/ListView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/join/mgps/customview/FlowLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Lcom/join/mgps/customview/ForumLoadingView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p8    # Lcom/join/android/app/mgsim/wufun/databinding/SearchRecommendLayoutBinding;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p9    # Lcom/join/android/app/mgsim/wufun/databinding/SearchBarLayoutBinding;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p10    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/SearchHintActivityBinding;->b:Landroid/widget/RelativeLayout;

    .line 3
    iput-object p2, p0, Lcom/join/android/app/mgsim/wufun/databinding/SearchHintActivityBinding;->c:Landroid/widget/ListView;

    .line 4
    iput-object p3, p0, Lcom/join/android/app/mgsim/wufun/databinding/SearchHintActivityBinding;->d:Landroid/widget/ImageView;

    .line 5
    iput-object p4, p0, Lcom/join/android/app/mgsim/wufun/databinding/SearchHintActivityBinding;->e:Landroid/widget/LinearLayout;

    .line 6
    iput-object p5, p0, Lcom/join/android/app/mgsim/wufun/databinding/SearchHintActivityBinding;->f:Lcom/join/mgps/customview/FlowLayout;

    .line 7
    iput-object p6, p0, Lcom/join/android/app/mgsim/wufun/databinding/SearchHintActivityBinding;->g:Landroid/view/View;

    .line 8
    iput-object p7, p0, Lcom/join/android/app/mgsim/wufun/databinding/SearchHintActivityBinding;->h:Lcom/join/mgps/customview/ForumLoadingView;

    .line 9
    iput-object p8, p0, Lcom/join/android/app/mgsim/wufun/databinding/SearchHintActivityBinding;->i:Lcom/join/android/app/mgsim/wufun/databinding/SearchRecommendLayoutBinding;

    .line 10
    iput-object p9, p0, Lcom/join/android/app/mgsim/wufun/databinding/SearchHintActivityBinding;->j:Lcom/join/android/app/mgsim/wufun/databinding/SearchBarLayoutBinding;

    .line 11
    iput-object p10, p0, Lcom/join/android/app/mgsim/wufun/databinding/SearchHintActivityBinding;->k:Landroid/view/View;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/join/android/app/mgsim/wufun/databinding/SearchHintActivityBinding;
    .locals 13
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const v0, 0x7f090128

    .line 1
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/ListView;

    if-eqz v4, :cond_0

    const v0, 0x7f09031f

    .line 2
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/ImageView;

    if-eqz v5, :cond_0

    const v0, 0x7f090321

    .line 3
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/LinearLayout;

    if-eqz v6, :cond_0

    const v0, 0x7f090751

    .line 4
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/join/mgps/customview/FlowLayout;

    if-eqz v7, :cond_0

    const v0, 0x7f090c6b

    .line 5
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v8

    if-eqz v8, :cond_0

    const v0, 0x7f090d57

    .line 6
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/join/mgps/customview/ForumLoadingView;

    if-eqz v9, :cond_0

    const v0, 0x7f0910df

    .line 7
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 8
    invoke-static {v1}, Lcom/join/android/app/mgsim/wufun/databinding/SearchRecommendLayoutBinding;->bind(Landroid/view/View;)Lcom/join/android/app/mgsim/wufun/databinding/SearchRecommendLayoutBinding;

    move-result-object v10

    const v0, 0x7f09121e

    .line 9
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 10
    invoke-static {v1}, Lcom/join/android/app/mgsim/wufun/databinding/SearchBarLayoutBinding;->bind(Landroid/view/View;)Lcom/join/android/app/mgsim/wufun/databinding/SearchBarLayoutBinding;

    move-result-object v11

    const v0, 0x7f09132b

    .line 11
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v12

    if-eqz v12, :cond_0

    .line 12
    new-instance v0, Lcom/join/android/app/mgsim/wufun/databinding/SearchHintActivityBinding;

    move-object v3, p0

    check-cast v3, Landroid/widget/RelativeLayout;

    move-object v2, v0

    invoke-direct/range {v2 .. v12}, Lcom/join/android/app/mgsim/wufun/databinding/SearchHintActivityBinding;-><init>(Landroid/widget/RelativeLayout;Landroid/widget/ListView;Landroid/widget/ImageView;Landroid/widget/LinearLayout;Lcom/join/mgps/customview/FlowLayout;Landroid/view/View;Lcom/join/mgps/customview/ForumLoadingView;Lcom/join/android/app/mgsim/wufun/databinding/SearchRecommendLayoutBinding;Lcom/join/android/app/mgsim/wufun/databinding/SearchBarLayoutBinding;Landroid/view/View;)V

    return-object v0

    .line 13
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    .line 14
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/join/android/app/mgsim/wufun/databinding/SearchHintActivityBinding;
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
    invoke-static {p0, v0, v1}, Lcom/join/android/app/mgsim/wufun/databinding/SearchHintActivityBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/join/android/app/mgsim/wufun/databinding/SearchHintActivityBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/join/android/app/mgsim/wufun/databinding/SearchHintActivityBinding;
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

    const v0, 0x7f0c0730

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/join/android/app/mgsim/wufun/databinding/SearchHintActivityBinding;->bind(Landroid/view/View;)Lcom/join/android/app/mgsim/wufun/databinding/SearchHintActivityBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Landroid/widget/RelativeLayout;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/SearchHintActivityBinding;->b:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/android/app/mgsim/wufun/databinding/SearchHintActivityBinding;->a()Landroid/widget/RelativeLayout;

    move-result-object v0

    return-object v0
.end method
