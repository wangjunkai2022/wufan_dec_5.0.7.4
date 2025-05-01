.class public final Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter$onBindItem$controller$1;
.super Ljava/lang/Object;
.source "ModArchiveAdapter.kt"

# interfaces
.implements Lcom/facebook/drawee/controller/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->onBindItem(Landroidx/databinding/ViewDataBinding;Lcom/psk/kotlin/util/CommonListMainData;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/drawee/controller/c<",
        "Lcom/facebook/imagepipeline/image/f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic $binding:Landroidx/databinding/ViewDataBinding;

.field final synthetic this$0:Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;


# direct methods
.method constructor <init>(Landroidx/databinding/ViewDataBinding;Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter$onBindItem$controller$1;->$binding:Landroidx/databinding/ViewDataBinding;

    iput-object p2, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter$onBindItem$controller$1;->this$0:Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public onFinalImageSet(Ljava/lang/String;Lcom/facebook/imagepipeline/image/f;Landroid/graphics/drawable/Animatable;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/facebook/imagepipeline/image/f;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/drawable/Animatable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p2, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter$onBindItem$controller$1;->$binding:Landroidx/databinding/ViewDataBinding;

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListDomainBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListDomainBinding;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    .line 3
    iget-object p3, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter$onBindItem$controller$1;->this$0:Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;

    invoke-virtual {p3}, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v0, 0x7f071209

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p3

    float-to-int p3, p3

    .line 4
    iput p3, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 5
    invoke-interface {p2}, Lcom/facebook/imagepipeline/image/f;->getWidth()I

    move-result v0

    mul-int p3, p3, v0

    invoke-interface {p2}, Lcom/facebook/imagepipeline/image/f;->getHeight()I

    move-result p2

    div-int/2addr p3, p2

    iput p3, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 6
    iget-object p2, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter$onBindItem$controller$1;->$binding:Landroidx/databinding/ViewDataBinding;

    check-cast p2, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListDomainBinding;

    iget-object p2, p2, Lcom/join/android/app/mgsim/wufun/databinding/ModarchiveListDomainBinding;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onFinalImageSet(Ljava/lang/String;Ljava/lang/Object;Landroid/graphics/drawable/Animatable;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/facebook/imagepipeline/image/f;

    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter$onBindItem$controller$1;->onFinalImageSet(Ljava/lang/String;Lcom/facebook/imagepipeline/image/f;Landroid/graphics/drawable/Animatable;)V

    return-void
.end method

.method public onIntermediateImageFailed(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public onIntermediateImageSet(Ljava/lang/String;Lcom/facebook/imagepipeline/image/f;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/facebook/imagepipeline/image/f;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public bridge synthetic onIntermediateImageSet(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/facebook/imagepipeline/image/f;

    invoke-virtual {p0, p1, p2}, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter$onBindItem$controller$1;->onIntermediateImageSet(Ljava/lang/String;Lcom/facebook/imagepipeline/image/f;)V

    return-void
.end method

.method public onRelease(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public onSubmit(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    return-void
.end method
