.class public Lcom/join/android/app/component/photoviewer/ImageDetailFragment;
.super Landroidx/fragment/app/Fragment;
.source "ImageDetailFragment.java"


# instance fields
.field private b:Ljava/lang/String;

.field private c:Lme/relex/photodraweeview/PhotoDraweeView;

.field private d:Landroid/widget/ProgressBar;

.field e:Landroid/view/View$OnLongClickListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method

.method static synthetic V(Lcom/join/android/app/component/photoviewer/ImageDetailFragment;)Landroid/widget/ProgressBar;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/android/app/component/photoviewer/ImageDetailFragment;->d:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method static synthetic W(Lcom/join/android/app/component/photoviewer/ImageDetailFragment;)Lme/relex/photodraweeview/PhotoDraweeView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/android/app/component/photoviewer/ImageDetailFragment;->c:Lme/relex/photodraweeview/PhotoDraweeView;

    return-object p0
.end method

.method private X()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/android/app/component/photoviewer/ImageDetailFragment;->d:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 2
    new-instance v0, Lcom/join/android/app/component/photoviewer/ImageDetailFragment$b;

    invoke-direct {v0, p0}, Lcom/join/android/app/component/photoviewer/ImageDetailFragment$b;-><init>(Lcom/join/android/app/component/photoviewer/ImageDetailFragment;)V

    .line 3
    invoke-static {}, Lcom/facebook/drawee/backends/pipeline/Fresco;->newDraweeControllerBuilder()Lcom/facebook/drawee/backends/pipeline/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->H(Lcom/facebook/drawee/controller/c;)Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/backends/pipeline/e;

    iget-object v1, p0, Lcom/join/android/app/component/photoviewer/ImageDetailFragment;->b:Ljava/lang/String;

    .line 4
    invoke-static {v1}, Lcom/join/android/app/common/utils/MyImageLoader;->H(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/drawee/backends/pipeline/e;->c0(Landroid/net/Uri;)Lcom/facebook/drawee/backends/pipeline/e;

    move-result-object v0

    const/4 v1, 0x1

    .line 5
    invoke-virtual {v0, v1}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->E(Z)Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/backends/pipeline/e;

    .line 6
    invoke-virtual {v0}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->d()Lcom/facebook/drawee/controller/a;

    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/join/android/app/component/photoviewer/ImageDetailFragment;->c:Lme/relex/photodraweeview/PhotoDraweeView;

    invoke-virtual {v1, v0}, Lcom/facebook/drawee/view/DraweeView;->setController(Lo0/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private Z()V
    .locals 0

    return-void
.end method

.method private a0()V
    .locals 0

    return-void
.end method

.method public static b0(Ljava/lang/String;)Lcom/join/android/app/component/photoviewer/ImageDetailFragment;
    .locals 3

    .line 1
    new-instance v0, Lcom/join/android/app/component/photoviewer/ImageDetailFragment;

    invoke-direct {v0}, Lcom/join/android/app/component/photoviewer/ImageDetailFragment;-><init>()V

    .line 2
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string/jumbo v2, "url"

    .line 3
    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method

.method private c0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/android/app/component/photoviewer/ImageDetailFragment;->c:Lme/relex/photodraweeview/PhotoDraweeView;

    new-instance v1, Lcom/join/android/app/component/photoviewer/ImageDetailFragment$a;

    invoke-direct {v1, p0}, Lcom/join/android/app/component/photoviewer/ImageDetailFragment$a;-><init>(Lcom/join/android/app/component/photoviewer/ImageDetailFragment;)V

    invoke-virtual {v0, v1}, Lme/relex/photodraweeview/PhotoDraweeView;->setOnViewTapListener(Lme/relex/photodraweeview/h;)V

    .line 2
    iget-object v0, p0, Lcom/join/android/app/component/photoviewer/ImageDetailFragment;->c:Lme/relex/photodraweeview/PhotoDraweeView;

    iget-object v1, p0, Lcom/join/android/app/component/photoviewer/ImageDetailFragment;->e:Landroid/view/View$OnLongClickListener;

    invoke-virtual {v0, v1}, Lme/relex/photodraweeview/PhotoDraweeView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method


# virtual methods
.method d0(Landroid/view/View$OnLongClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/android/app/component/photoviewer/ImageDetailFragment;->e:Landroid/view/View$OnLongClickListener;

    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 2
    invoke-direct {p0}, Lcom/join/android/app/component/photoviewer/ImageDetailFragment;->X()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string/jumbo v0, "url"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/join/android/app/component/photoviewer/ImageDetailFragment;->b:Ljava/lang/String;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c0348

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f090d53

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ProgressBar;

    iput-object p2, p0, Lcom/join/android/app/component/photoviewer/ImageDetailFragment;->d:Landroid/widget/ProgressBar;

    const p2, 0x7f0907a3

    .line 3
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lme/relex/photodraweeview/PhotoDraweeView;

    iput-object p2, p0, Lcom/join/android/app/component/photoviewer/ImageDetailFragment;->c:Lme/relex/photodraweeview/PhotoDraweeView;

    .line 4
    invoke-direct {p0}, Lcom/join/android/app/component/photoviewer/ImageDetailFragment;->c0()V

    return-object p1
.end method
