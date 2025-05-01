.class public final Lcom/join/kotlin/base/widget/loadCallBack/ErrorCallback;
.super Lcom/kingja/loadsir/callback/Callback;
.source "ErrorCallback.kt"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kingja/loadsir/callback/Callback;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/base/widget/loadCallBack/ErrorCallback;->onViewCreate$lambda$0(Landroid/content/Context;Landroid/view/View;)V

    return-void
.end method

.method private static final onViewCreate$lambda$0(Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method protected onCreateView()I
    .locals 1

    const v0, 0x7f0c04f2

    return v0
.end method

.method protected onViewCreate(Landroid/content/Context;Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2}, Lcom/kingja/loadsir/callback/Callback;->onViewCreate(Landroid/content/Context;Landroid/view/View;)V

    if-eqz p2, :cond_0

    const v0, 0x7f091261

    .line 2
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    if-eqz p2, :cond_0

    new-instance v0, Lcom/join/kotlin/base/widget/loadCallBack/a;

    invoke-direct {v0, p1}, Lcom/join/kotlin/base/widget/loadCallBack/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method
