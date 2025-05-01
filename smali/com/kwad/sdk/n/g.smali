.class public final Lcom/kwad/sdk/n/g;
.super Landroid/view/ContextThemeWrapper;
.source "SourceFile"


# instance fields
.field private final aUj:Landroid/content/Context;

.field private final aUs:Lcom/kwad/sdk/n/e;

.field private aUt:Lcom/kwad/sdk/n/f;

.field private mInflater:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/kwad/sdk/n/e;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/kwad/sdk/n/l;->getThemeResId(Landroid/content/Context;)I

    move-result v0

    invoke-direct {p0, p1, v0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 2
    iput-object p1, p0, Lcom/kwad/sdk/n/g;->aUj:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lcom/kwad/sdk/n/g;->aUs:Lcom/kwad/sdk/n/e;

    return-void
.end method


# virtual methods
.method public final applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public final createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/ContextThemeWrapper;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    move-result-object p1

    .line 2
    invoke-static {p1}, Lcom/kwad/sdk/n/l;->wrapContextIfNeed(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    return-object p1
.end method

.method public final getApplicationContext()Landroid/content/Context;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/n/g;->aUt:Lcom/kwad/sdk/n/f;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/n/g;->aUj:Landroid/content/Context;

    instance-of v1, v0, Lcom/kwad/sdk/n/f;

    if-eqz v1, :cond_1

    .line 3
    check-cast v0, Lcom/kwad/sdk/n/f;

    iput-object v0, p0, Lcom/kwad/sdk/n/g;->aUt:Lcom/kwad/sdk/n/f;

    return-object v0

    .line 4
    :cond_1
    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_2

    .line 5
    invoke-static {v0}, Lcom/kwad/sdk/n/l;->wrapContextIfNeed(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/n/f;

    iput-object v0, p0, Lcom/kwad/sdk/n/g;->aUt:Lcom/kwad/sdk/n/f;

    return-object v0

    .line 6
    :cond_2
    invoke-static {v0}, Lcom/kwad/sdk/n/l;->wrapContextIfNeed(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final getApplicationInfo()Landroid/content/pm/ApplicationInfo;
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/ContextThemeWrapper;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    return-object v0
.end method

.method public final getAssets()Landroid/content/res/AssetManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/n/g;->aUs:Lcom/kwad/sdk/n/e;

    invoke-virtual {v0}, Lcom/kwad/sdk/n/e;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    return-object v0
.end method

.method public final getBaseContext()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/ContextThemeWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final getClassLoader()Ljava/lang/ClassLoader;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/n/g;->aUs:Lcom/kwad/sdk/n/e;

    invoke-virtual {v0}, Lcom/kwad/sdk/n/e;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    return-object v0
.end method

.method public final getResources()Landroid/content/res/Resources;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/n/g;->aUs:Lcom/kwad/sdk/n/e;

    invoke-virtual {v0}, Lcom/kwad/sdk/n/e;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method public final getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    const-string v0, "layout_inflater"

    .line 1
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-object p1, p0, Lcom/kwad/sdk/n/g;->mInflater:Landroid/view/LayoutInflater;

    if-nez p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/kwad/sdk/n/g;->aUj:Landroid/content/Context;

    invoke-static {p1, p0}, Lcom/kwad/sdk/n/l;->b(Landroid/content/Context;Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/n/g;->mInflater:Landroid/view/LayoutInflater;

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/kwad/sdk/n/g;->mInflater:Landroid/view/LayoutInflater;

    return-object p1

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/kwad/sdk/n/g;->aUj:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getTheme()Landroid/content/res/Resources$Theme;
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/ContextThemeWrapper;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    return-object v0
.end method

.method public final registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/n/g;->aUj:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    return-void
.end method

.method public final setTheme(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/ContextThemeWrapper;->setTheme(I)V

    return-void
.end method

.method public final startActivity(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/ContextThemeWrapper;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/n/g;->aUj:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    return-void
.end method
