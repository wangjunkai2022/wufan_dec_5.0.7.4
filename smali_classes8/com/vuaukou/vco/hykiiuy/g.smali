.class public final Lcom/vuaukou/vco/hykiiuy/g;
.super Landroid/app/AppComponentFactory;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x1c
.end annotation


# instance fields
.field private a:Landroid/app/AppComponentFactory;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/AppComponentFactory;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/vuaukou/vco/hykiiuy/g;->a:Landroid/app/AppComponentFactory;

    const-string v0, ""

    iput-object v0, p0, Lcom/vuaukou/vco/hykiiuy/g;->b:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/vuaukou/vco/hykiiuy/g;->c:Ljava/lang/String;

    const-string v0, "LQoZSwscDCBLFQsFAQonAVoEEQNLIwIHDAxdEjsDAQs="

    invoke-static/range {v0 .. v0}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/vuaukou/vco/hykiiuy/g;->d:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/vuaukou/vco/hykiiuy/g;->e:Z

    return-void
.end method

.method private declared-synchronized a(Ljava/lang/ClassLoader;)Landroid/app/AppComponentFactory;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/vuaukou/vco/hykiiuy/g;->a:Landroid/app/AppComponentFactory;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/vuaukou/vco/hykiiuy/g;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, ""

    iget-object v1, p0, Lcom/vuaukou/vco/hykiiuy/g;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    :try_start_1
    iget-object v0, p0, Lcom/vuaukou/vco/hykiiuy/g;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AppComponentFactory;

    iput-object v0, p0, Lcom/vuaukou/vco/hykiiuy/g;->a:Landroid/app/AppComponentFactory;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_0
    :goto_0
    :try_start_2
    iget-object v0, p0, Lcom/vuaukou/vco/hykiiuy/g;->a:Landroid/app/AppComponentFactory;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private a(Ljava/lang/ClassLoader;Landroid/content/pm/ApplicationInfo;)V
    .locals 3

    iget-boolean v0, p0, Lcom/vuaukou/vco/hykiiuy/g;->e:Z

    if-nez v0, :cond_0

    invoke-static {p1, p2}, Lcom/vuaukou/vco/hykiiuy/f;->a(Ljava/lang/ClassLoader;Landroid/content/pm/ApplicationInfo;)Z

    iget-object v0, p0, Lcom/vuaukou/vco/hykiiuy/g;->d:Ljava/lang/String;

    invoke-static {p1, p2, v0}, Lcom/vuaukou/vco/hykiiuy/MyJni;->cl(Ljava/lang/ClassLoader;Landroid/content/pm/ApplicationInfo;Ljava/lang/String;)Ljava/lang/ClassLoader;

    move-result-object v0

    iget-object v1, p0, Lcom/vuaukou/vco/hykiiuy/g;->b:Ljava/lang/String;

    iput-object v1, p2, Landroid/content/pm/ApplicationInfo;->className:Ljava/lang/String;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/vuaukou/vco/hykiiuy/g;->e:Z

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "HhcbHRgwCiMVGwsEHREIBBcRDgEcbgwaDBVfRS0JFRYSPwovAREXQU5F"

    invoke-static/range {v2 .. v2}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method


# virtual methods
.method public final instantiateActivity(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Activity;
    .locals 1

    invoke-direct {p0, p1}, Lcom/vuaukou/vco/hykiiuy/g;->a(Ljava/lang/ClassLoader;)Landroid/app/AppComponentFactory;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/AppComponentFactory;->instantiateActivity(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Activity;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/app/AppComponentFactory;->instantiateActivity(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Activity;

    move-result-object v0

    goto :goto_0
.end method

.method public final instantiateApplication(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroid/app/Application;
    .locals 1

    invoke-static {}, Lcom/vuaukou/vco/hykiiuy/f;->a()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/vuaukou/vco/hykiiuy/g;->a(Ljava/lang/ClassLoader;Landroid/content/pm/ApplicationInfo;)V

    const-class v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p2, p0, Lcom/vuaukou/vco/hykiiuy/g;->b:Ljava/lang/String;

    :cond_0
    invoke-direct {p0, p1}, Lcom/vuaukou/vco/hykiiuy/g;->a(Ljava/lang/ClassLoader;)Landroid/app/AppComponentFactory;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2}, Landroid/app/AppComponentFactory;->instantiateApplication(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroid/app/Application;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    invoke-super {p0, p1, p2}, Landroid/app/AppComponentFactory;->instantiateApplication(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroid/app/Application;

    move-result-object v0

    goto :goto_0
.end method

.method public final instantiateClassLoader(Ljava/lang/ClassLoader;Landroid/content/pm/ApplicationInfo;)Ljava/lang/ClassLoader;
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1d
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "JwsHEQAdEScEAAAiHwQ9FjgKABcAPF8="

    invoke-static/range {v1 .. v1}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1, p2}, Lcom/vuaukou/vco/hykiiuy/g;->a(Ljava/lang/ClassLoader;Landroid/content/pm/ApplicationInfo;)V

    invoke-direct {p0, p1}, Lcom/vuaukou/vco/hykiiuy/g;->a(Ljava/lang/ClassLoader;)Landroid/app/AppComponentFactory;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroid/app/AppComponentFactory;->instantiateClassLoader(Ljava/lang/ClassLoader;Landroid/content/pm/ApplicationInfo;)Ljava/lang/ClassLoader;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/AppComponentFactory;->instantiateClassLoader(Ljava/lang/ClassLoader;Landroid/content/pm/ApplicationInfo;)Ljava/lang/ClassLoader;

    move-result-object v0

    goto :goto_0
.end method

.method public final instantiateProvider(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroid/content/ContentProvider;
    .locals 1

    invoke-direct {p0, p1}, Lcom/vuaukou/vco/hykiiuy/g;->a(Ljava/lang/ClassLoader;)Landroid/app/AppComponentFactory;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroid/app/AppComponentFactory;->instantiateProvider(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroid/content/ContentProvider;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/AppComponentFactory;->instantiateProvider(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroid/content/ContentProvider;

    move-result-object v0

    goto :goto_0
.end method
