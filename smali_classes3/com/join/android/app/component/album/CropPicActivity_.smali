.class public final Lcom/join/android/app/component/album/CropPicActivity_;
.super Lcom/join/android/app/component/album/CropPicActivity;
.source "CropPicActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/android/app/component/album/CropPicActivity_$k;
    }
.end annotation


# static fields
.field public static final s:Ljava/lang/String; = "CaptureUri"

.field public static final t:Ljava/lang/String; = "from"


# instance fields
.field private final q:La4/c;

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
    invoke-direct {p0}, Lcom/join/android/app/component/album/CropPicActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/android/app/component/album/CropPicActivity_;->q:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/android/app/component/album/CropPicActivity_;->r:Ljava/util/Map;

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-direct {p0}, Lcom/join/android/app/component/album/CropPicActivity_;->injectExtras_()V

    return-void
.end method

.method private injectExtras_()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "CaptureUri"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/android/app/component/album/CropPicActivity;->j:Ljava/lang/String;

    :cond_0
    const-string v1, "from"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/join/android/app/component/album/CropPicActivity;->n:I

    :cond_1
    return-void
.end method

.method static synthetic m0(Lcom/join/android/app/component/album/CropPicActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/android/app/component/album/CropPicActivity;->showLoading()V

    return-void
.end method

.method static synthetic n0(Lcom/join/android/app/component/album/CropPicActivity_;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/android/app/component/album/CropPicActivity;->i0(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method static synthetic o0(Lcom/join/android/app/component/album/CropPicActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/android/app/component/album/CropPicActivity;->e0()V

    return-void
.end method

.method static synthetic p0(Lcom/join/android/app/component/album/CropPicActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/android/app/component/album/CropPicActivity;->showLodingDismis()V

    return-void
.end method

.method static synthetic q0(Lcom/join/android/app/component/album/CropPicActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/android/app/component/album/CropPicActivity;->f0()V

    return-void
.end method

.method static synthetic r0(Lcom/join/android/app/component/album/CropPicActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/android/app/component/album/CropPicActivity;->error(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic s0(Lcom/join/android/app/component/album/CropPicActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/android/app/component/album/CropPicActivity;->j0()V

    return-void
.end method

.method static synthetic t0(Lcom/join/android/app/component/album/CropPicActivity_;Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/android/app/component/album/CropPicActivity;->l0(Ljava/io/File;)V

    return-void
.end method

.method public static u0(Landroid/content/Context;)Lcom/join/android/app/component/album/CropPicActivity_$k;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/android/app/component/album/CropPicActivity_$k;

    invoke-direct {v0, p0}, Lcom/join/android/app/component/album/CropPicActivity_$k;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static v0(Landroidx/fragment/app/Fragment;)Lcom/join/android/app/component/album/CropPicActivity_$k;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/android/app/component/album/CropPicActivity_$k;

    invoke-direct {v0, p0}, Lcom/join/android/app/component/album/CropPicActivity_$k;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method


# virtual methods
.method e0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/android/app/component/album/CropPicActivity_$f;

    invoke-direct {v0, p0}, Lcom/join/android/app/component/album/CropPicActivity_$f;-><init>(Lcom/join/android/app/component/album/CropPicActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method error(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/android/app/component/album/CropPicActivity_$i;

    invoke-direct {v0, p0, p1}, Lcom/join/android/app/component/album/CropPicActivity_$i;-><init>(Lcom/join/android/app/component/album/CropPicActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method f0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/android/app/component/album/CropPicActivity_$h;

    invoke-direct {v0, p0}, Lcom/join/android/app/component/album/CropPicActivity_$h;-><init>(Lcom/join/android/app/component/album/CropPicActivity_;)V

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
    iget-object v0, p0, Lcom/join/android/app/component/album/CropPicActivity_;->r:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method i0(Landroid/graphics/Bitmap;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/android/app/component/album/CropPicActivity_$e;

    invoke-direct {v0, p0, p1}, Lcom/join/android/app/component/album/CropPicActivity_$e;-><init>(Lcom/join/android/app/component/album/CropPicActivity_;Landroid/graphics/Bitmap;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public internalFindViewById(I)Landroid/view/View;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method j0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/android/app/component/album/CropPicActivity_$j;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/android/app/component/album/CropPicActivity_$j;-><init>(Lcom/join/android/app/component/album/CropPicActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method l0(Ljava/io/File;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/android/app/component/album/CropPicActivity_$a;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/android/app/component/album/CropPicActivity_$a;-><init>(Lcom/join/android/app/component/album/CropPicActivity_;Ljava/lang/String;JLjava/lang/String;Ljava/io/File;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/android/app/component/album/CropPicActivity_;->q:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/android/app/component/album/CropPicActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c0159

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/android/app/component/album/CropPicActivity_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f090146

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/android/app/component/album/CropPicActivity;->b:Landroid/widget/ImageView;

    const v0, 0x7f091219

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/join/android/app/component/album/CropPicActivity;->c:Landroid/widget/Button;

    const v0, 0x7f09079d

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/ClipImageLayout;

    iput-object v0, p0, Lcom/join/android/app/component/album/CropPicActivity;->d:Lcom/join/mgps/customview/ClipImageLayout;

    const v0, 0x7f091489

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/android/app/component/album/CropPicActivity;->e:Landroid/widget/TextView;

    const v0, 0x7f090d82

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/android/app/component/album/CropPicActivity;->i:Landroid/widget/LinearLayout;

    .line 6
    iget-object p1, p0, Lcom/join/android/app/component/album/CropPicActivity;->b:Landroid/widget/ImageView;

    if-eqz p1, :cond_0

    .line 7
    new-instance v0, Lcom/join/android/app/component/album/CropPicActivity_$b;

    invoke-direct {v0, p0}, Lcom/join/android/app/component/album/CropPicActivity_$b;-><init>(Lcom/join/android/app/component/album/CropPicActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    :cond_0
    iget-object p1, p0, Lcom/join/android/app/component/album/CropPicActivity;->c:Landroid/widget/Button;

    if-eqz p1, :cond_1

    .line 9
    new-instance v0, Lcom/join/android/app/component/album/CropPicActivity_$c;

    invoke-direct {v0, p0}, Lcom/join/android/app/component/album/CropPicActivity_$c;-><init>(Lcom/join/android/app/component/album/CropPicActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    :cond_1
    invoke-virtual {p0}, Lcom/join/android/app/component/album/CropPicActivity;->afterViews()V

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
    iget-object v0, p0, Lcom/join/android/app/component/album/CropPicActivity_;->r:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/android/app/component/album/CropPicActivity_;->q:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/android/app/component/album/CropPicActivity_;->q:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/android/app/component/album/CropPicActivity_;->q:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/android/app/component/album/CropPicActivity_;->injectExtras_()V

    return-void
.end method

.method showLoading()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/android/app/component/album/CropPicActivity_$d;

    invoke-direct {v0, p0}, Lcom/join/android/app/component/album/CropPicActivity_$d;-><init>(Lcom/join/android/app/component/album/CropPicActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingDismis()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/android/app/component/album/CropPicActivity_$g;

    invoke-direct {v0, p0}, Lcom/join/android/app/component/album/CropPicActivity_$g;-><init>(Lcom/join/android/app/component/album/CropPicActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
