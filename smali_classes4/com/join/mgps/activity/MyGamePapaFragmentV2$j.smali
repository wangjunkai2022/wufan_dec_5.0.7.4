.class Lcom/join/mgps/activity/MyGamePapaFragmentV2$j;
.super Landroidx/viewpager2/adapter/FragmentStateAdapter;
.source "MyGamePapaFragmentV2.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/MyGamePapaFragmentV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "j"
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic b:Lcom/join/mgps/activity/MyGamePapaFragmentV2;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2;Landroidx/fragment/app/Fragment;Ljava/util/List;)V
    .locals 0
    .param p1    # Lcom/join/mgps/activity/MyGamePapaFragmentV2;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/Fragment;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2$j;->b:Lcom/join/mgps/activity/MyGamePapaFragmentV2;

    .line 2
    invoke-direct {p0, p2}, Landroidx/viewpager2/adapter/FragmentStateAdapter;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 3
    iput-object p3, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2$j;->a:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/activity/MyGamePapaFragmentV2$j;I)Landroidx/fragment/app/Fragment;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2$j;->b(I)Landroidx/fragment/app/Fragment;

    move-result-object p0

    return-object p0
.end method

.method private b(I)Landroidx/fragment/app/Fragment;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2$j;->b:Lcom/join/mgps/activity/MyGamePapaFragmentV2;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "f"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2$j;->getItemId(I)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public containsItem(J)Z
    .locals 3

    const-wide/16 v0, 0x3e8

    sub-long/2addr p1, v0

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2$j;->getItemCount()I

    move-result v0

    int-to-long v0, v0

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public createFragment(I)Landroidx/fragment/app/Fragment;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->v1()Lcom/join/mgps/activity/MyGamePapaLocalFragment_$v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$v;->a()Lcom/join/mgps/activity/MyGamePapaLocalFragment;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2$j;->a:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    const-string v2, "\u672c\u673a\u6e38\u620f"

    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-static {}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->v1()Lcom/join/mgps/activity/MyGamePapaLocalFragment_$v;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$v;->a()Lcom/join/mgps/activity/MyGamePapaLocalFragment;

    move-result-object v0

    goto :goto_0

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2$j;->a:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    const-string v1, "\u6211\u7684\u6536\u85cf"

    invoke-static {p1, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 5
    invoke-static {}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment_;->m0()Lcom/join/mgps/activity/MyGamePapaFavVpFragment_$e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment_$e;->a()Lcom/join/mgps/activity/MyGamePapaFavVpFragment;

    move-result-object v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2$j;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemId(I)J
    .locals 2

    add-int/lit16 p1, p1, 0x3e8

    int-to-long v0, p1

    return-wide v0
.end method
