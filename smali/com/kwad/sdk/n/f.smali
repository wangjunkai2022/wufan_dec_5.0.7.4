.class public final Lcom/kwad/sdk/n/f;
.super Landroid/app/Application;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/n/a;


# instance fields
.field private final aUq:Landroid/app/Application;

.field private final aUr:Lcom/kwad/sdk/n/g;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lcom/kwad/sdk/n/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/sdk/n/f;->aUq:Landroid/app/Application;

    .line 3
    iput-object p2, p0, Lcom/kwad/sdk/n/f;->aUr:Lcom/kwad/sdk/n/g;

    :try_start_0
    const-string p1, "mBase"

    .line 4
    invoke-static {p0, p1, p2}, Lcom/kwad/sdk/utils/s;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 5
    :catchall_0
    invoke-virtual {p0, p2}, Landroid/app/Application;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/n/f;->aUq:Landroid/app/Application;

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/Application;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result p1

    return p1
.end method

.method public final getApplicationContext()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/n/f;->aUr:Lcom/kwad/sdk/n/g;

    invoke-virtual {v0}, Lcom/kwad/sdk/n/g;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final getAssets()Landroid/content/res/AssetManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/n/f;->aUr:Lcom/kwad/sdk/n/g;

    invoke-virtual {v0}, Lcom/kwad/sdk/n/g;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    return-object v0
.end method

.method public final getClassLoader()Ljava/lang/ClassLoader;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/n/f;->aUr:Lcom/kwad/sdk/n/g;

    invoke-virtual {v0}, Lcom/kwad/sdk/n/g;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    return-object v0
.end method

.method public final getDelegatedContext()Landroid/content/Context;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/n/f;->aUq:Landroid/app/Application;

    return-object v0
.end method

.method public final getResources()Landroid/content/res/Resources;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/n/f;->aUr:Lcom/kwad/sdk/n/g;

    invoke-virtual {v0}, Lcom/kwad/sdk/n/g;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method public final registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/n/f;->aUq:Landroid/app/Application;

    invoke-virtual {v0, p1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method public final sendBroadcast(Landroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/n/f;->aUq:Landroid/app/Application;

    invoke-virtual {v0, p1}, Landroid/app/Application;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public final setTheme(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/n/f;->aUq:Landroid/app/Application;

    invoke-virtual {v0, p1}, Landroid/app/Application;->setTheme(I)V

    return-void
.end method

.method public final startActivities([Landroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/n/f;->aUq:Landroid/app/Application;

    invoke-virtual {v0, p1}, Landroid/app/Application;->startActivities([Landroid/content/Intent;)V

    return-void
.end method

.method public final startActivities([Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 1
    .param p2    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/n/f;->aUq:Landroid/app/Application;

    invoke-virtual {v0, p1, p2}, Landroid/app/Application;->startActivities([Landroid/content/Intent;Landroid/os/Bundle;)V

    return-void
.end method

.method public final startActivity(Landroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/n/f;->aUq:Landroid/app/Application;

    invoke-virtual {v0, p1}, Landroid/app/Application;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 1
    .param p2    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/n/f;->aUq:Landroid/app/Application;

    invoke-virtual {v0, p1, p2}, Landroid/app/Application;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    return-void
.end method

.method public final startForegroundService(Landroid/content/Intent;)Landroid/content/ComponentName;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x1a
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/n/f;->aUq:Landroid/app/Application;

    invoke-virtual {v0, p1}, Landroid/app/Application;->startForegroundService(Landroid/content/Intent;)Landroid/content/ComponentName;

    move-result-object p1

    return-object p1
.end method

.method public final startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/n/f;->aUq:Landroid/app/Application;

    invoke-virtual {v0, p1}, Landroid/app/Application;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    move-result-object p1

    return-object p1
.end method

.method public final stopService(Landroid/content/Intent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/n/f;->aUq:Landroid/app/Application;

    invoke-virtual {v0, p1}, Landroid/app/Application;->stopService(Landroid/content/Intent;)Z

    move-result p1

    return p1
.end method

.method public final unbindService(Landroid/content/ServiceConnection;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/n/f;->aUq:Landroid/app/Application;

    invoke-virtual {v0, p1}, Landroid/app/Application;->unbindService(Landroid/content/ServiceConnection;)V

    return-void
.end method

.method public final unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/n/f;->aUq:Landroid/app/Application;

    invoke-virtual {v0, p1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method
