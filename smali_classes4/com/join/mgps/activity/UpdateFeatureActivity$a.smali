.class Lcom/join/mgps/activity/UpdateFeatureActivity$a;
.super Landroidx/viewpager/widget/PagerAdapter;
.source "UpdateFeatureActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/UpdateFeatureActivity;->n0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/UpdateFeatureActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/UpdateFeatureActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/UpdateFeatureActivity$a;->a:Lcom/join/mgps/activity/UpdateFeatureActivity;

    invoke-direct {p0}, Landroidx/viewpager/widget/PagerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object p3, p0, Lcom/join/mgps/activity/UpdateFeatureActivity$a;->a:Lcom/join/mgps/activity/UpdateFeatureActivity;

    invoke-static {p3}, Lcom/join/mgps/activity/UpdateFeatureActivity;->h0(Lcom/join/mgps/activity/UpdateFeatureActivity;)Ljava/util/List;

    move-result-object p3

    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public getCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity$a;->a:Lcom/join/mgps/activity/UpdateFeatureActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/UpdateFeatureActivity;->h0(Lcom/join/mgps/activity/UpdateFeatureActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 3
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity$a;->a:Lcom/join/mgps/activity/UpdateFeatureActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/UpdateFeatureActivity;->h0(Lcom/join/mgps/activity/UpdateFeatureActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const v1, 0x7f091001

    .line 2
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/UpdateFeatureActivity$a;->a:Lcom/join/mgps/activity/UpdateFeatureActivity;

    invoke-static {v2}, Lcom/join/mgps/activity/UpdateFeatureActivity;->i0(Lcom/join/mgps/activity/UpdateFeatureActivity;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge p2, v2, :cond_0

    .line 4
    iget-object v2, p0, Lcom/join/mgps/activity/UpdateFeatureActivity$a;->a:Lcom/join/mgps/activity/UpdateFeatureActivity;

    invoke-static {v2}, Lcom/join/mgps/activity/UpdateFeatureActivity;->i0(Lcom/join/mgps/activity/UpdateFeatureActivity;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    sget-object v2, Lcom/facebook/drawee/drawable/r$c;->c:Lcom/facebook/drawee/drawable/r$c;

    invoke-static {v1, p2, v2}, Lcom/join/android/app/common/utils/MyImageLoader;->p(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;Lcom/facebook/drawee/drawable/r$c;)V

    .line 5
    :cond_0
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object v0
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
